package com.example.l12_homework

import android.icu.text.CaseMap
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemData (
    var name: String,
    var title: String
) : Parcelable