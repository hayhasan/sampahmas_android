package com.example.sampahmasgabungan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MarketView : Fragment() {
    private var recyclerViewOfficial : RecyclerView? = null
    private var recyclerViewNewest : RecyclerView? = null
    private var recycleViewOfficialAdapter: RecycleViewProductSquareAdapter? = null
    private var recycleViewNewestAdapter: RecycleViewProductRectangleAdapter? = null
    private var productSquareOfficialList = mutableListOf<ProductVariable>()
    private var productRectangleNewestList = mutableListOf<ProductVariable>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_market_view, container, false)

        // Official Products RecyclerView
        productSquareOfficialList = ArrayList()
        recyclerViewOfficial = view.findViewById(R.id.rvOfficialLists) as RecyclerView
        recycleViewOfficialAdapter = RecycleViewProductSquareAdapter(requireContext(), productSquareOfficialList)
        val layoutManagerOfficial: RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        recyclerViewOfficial!!.layoutManager = layoutManagerOfficial
        recyclerViewOfficial!!.adapter = recycleViewOfficialAdapter


        // Newest Products RecyclerView
        productRectangleNewestList = ArrayList()
        recyclerViewNewest = view.findViewById(R.id.rvNewestList) as RecyclerView
        recycleViewNewestAdapter = RecycleViewProductRectangleAdapter(requireContext(), productRectangleNewestList)
        val layoutManagerNewest: RecyclerView.LayoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)
        recyclerViewNewest!!.layoutManager = layoutManagerNewest
        recyclerViewNewest!!.adapter = recycleViewNewestAdapter

        prepareOfficialListData()
        prepareNewestListData()

        recycleViewOfficialAdapter!!.onItemClick = {
            val intent = Intent(context, Detailed_Product::class.java)
            intent.putExtra("recommended", it)
            startActivity(intent)
        }

        recycleViewNewestAdapter!!.onItemClick = {
            val intent = Intent(context, Detailed_Product::class.java)
            intent.putExtra("recommended", it)
            startActivity(intent)
        }

        return view
    }

    private fun prepareOfficialListData() {
        var productSquare = ProductVariable("Shoe Box", R.drawable.shoebox, "Rp 35.000", "High Quality Box to store your beloved shoes")
        productSquareOfficialList.add(productSquare)

        productSquare = ProductVariable("Plastic Frame", R.drawable.plasticframe, "Rp 20.000", "Sturdy, recycled plastic frame for various uses, promoting sustainability.")
        productSquareOfficialList.add(productSquare)

        productSquare = ProductVariable("Recycled Umbrella", R.drawable.umbrella, "Rp 40.000", "Wallet with many pocket inside")
        productSquareOfficialList.add(productSquare)

        productSquare = ProductVariable("Recycled Bag", R.drawable.recycledbag, "Rp 30.000", "Stylish bags crafted from recycled materials, promoting environmental consciousness.")
        productSquareOfficialList.add(productSquare)

        productSquare = ProductVariable("Pen Tablet", R.drawable.table, "Rp 1.000.000", "Pen Tablet with regular feature, regular price")
        productSquareOfficialList.add(productSquare)

        productSquare = ProductVariable("Plastic Table", R.drawable.parfum, "Rp 50.000", "Durable and lightweight plastic tables designed for practical use indoors or outdoors.")
        productSquareOfficialList.add(productSquare)

        productSquare = ProductVariable("Cosmetic Jar", R.drawable.chair, "Rp 20.0000","High-quality cosmetic jars, combining functionality with a commitment to using recyclable materials.")
        productSquareOfficialList.add(productSquare)

        productSquare = ProductVariable("Plastic Chair", R.drawable.cosmetic, "Rp 20.0000", " Comfortable and resilient plastic chairs for both indoor and outdoor seating.")
        productSquareOfficialList.add(productSquare)

        recycleViewOfficialAdapter!!.notifyDataSetChanged()

    }

    private fun prepareNewestListData() {
        var productRectangle = ProductVariable("Plastic EyeGlass", R.drawable.kacamata, "Rp 80.000", "Upgrade your Fashion with these cool EyeGlasses")
        productRectangleNewestList.add(productRectangle)

        productRectangle = ProductVariable("Premium Raicoat", R.drawable.baju, "Rp 180.000", "Says no to RAIN!")
        productRectangleNewestList.add(productRectangle)

        productRectangle = ProductVariable("Recycled Umbrella", R.drawable.umbrella, "Rp 40.000", "This is the Umbrella with 100% made of recycled material")
        productRectangleNewestList.add(productRectangle)

        recycleViewOfficialAdapter!!.notifyDataSetChanged()

    }


}