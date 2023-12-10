package com.example.sampahmasgabungan

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class WishView : Fragment() {
    private var recyclerView : RecyclerView? = null
    private var recycleViewWishListAdapter: RecycleViewWishListAdapter? = null
    private var WishList = mutableListOf<ProductVariable>()


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_wish_view, container, false)

        WishList = ArrayList()
        recyclerView = view.findViewById(R.id.rvWishLists) as RecyclerView
        recycleViewWishListAdapter = RecycleViewWishListAdapter(requireContext(), WishList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(context, 1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recycleViewWishListAdapter

        prepareWishListData()

        recycleViewWishListAdapter!!.onItemClick = {
            val intent = Intent(context, Detailed_Product::class.java)
            intent.putExtra("recommended", it)
            startActivity(intent)
        }
        return view
    }

    private fun prepareWishListData() {
        var wishList = ProductVariable("Shoe Box", R.drawable.shoebox, "Rp 35.000", "High Quality Box to store your beloved shoes")
        WishList.add(wishList)


        recycleViewWishListAdapter!!.notifyDataSetChanged()

    }

}