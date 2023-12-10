package com.example.sampahmasgabungan

import android.os.Parcel
import android.os.Parcelable

data class ProductVariable(var title: String, var image: Int, var price: String, var description: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeInt(image)
        parcel.writeString(price)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProductVariable> {
        override fun createFromParcel(parcel: Parcel): ProductVariable {
            return ProductVariable(parcel)
        }

        override fun newArray(size: Int): Array<ProductVariable?> {
            return arrayOfNulls(size)
        }
    }
}
