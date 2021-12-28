package com.example.lcr2dbc

import com.example.lcr2dbc.Base
import net.lecousin.reactive.data.relational.annotations.ForeignTable
import net.lecousin.reactive.data.relational.annotations.GeneratedValue
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table
data class Product(
    @Id @GeneratedValue var id: Long?,
    var name: String,
//    val term: List<String>,
//    val isArbitraryTermConfigEnabled: Boolean,
//    val activationDateRule: String,
//    val salesStatus: String,
    @ForeignTable(joinKey = "product") var base: Base?,
)
