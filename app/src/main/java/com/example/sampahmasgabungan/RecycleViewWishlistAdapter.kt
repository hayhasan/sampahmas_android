package com.example.sampahmasgabungan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecycleViewWishListAdapter constructor(
    private val context: Context,
    private val RecycleViewWishList: List<ProductVariable>) :
    RecyclerView.Adapter<RecycleViewWishListAdapter.MyViewHolder>() {

    var onItemClick : ((ProductVariable) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_wishlist_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return RecycleViewWishList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tProdukKiri.text = RecycleViewWishList[position].title
        holder.tProdukKanan.text = RecycleViewWishList[position].title
        holder.tHarga.text = RecycleViewWishList[position].price
        holder.imProduk.setImageResource(RecycleViewWishList[position].image)

        holder.cvOutside.setOnClickListener {
//            Toast.makeText(context, recommendedList[position].title, Toast.LENGTH_LONG).show()
            onItemClick?.invoke(RecycleViewWishList[position])
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imProduk: ImageView = itemView.findViewById(R.id.imProduk)
        val cvOutside: CardView = itemView.findViewById(R.id.cvOutside)
        val tProdukKiri: TextView = itemView.findViewById(R.id.tProdukKiri)
        val tProdukKanan: TextView = itemView.findViewById(R.id.tProdukKanan)
        val tHarga: TextView = itemView.findViewById(R.id.tHarga)

    }


}