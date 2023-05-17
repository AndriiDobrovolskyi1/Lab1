package com.andrii.lab_1
import android.os.Parcel
import android.os.Parcelable

data class MyDataClass(val information: String) : Parcelable{
    constructor(parcel: Parcel) : this(parcel.readString() ?: "")

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(information)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyDataClass> {
        override fun createFromParcel(parcel: Parcel): MyDataClass {
            return MyDataClass(parcel)
        }

        override fun newArray(size: Int): Array<MyDataClass?> {
            return arrayOfNulls(size)
        }
    }
}
