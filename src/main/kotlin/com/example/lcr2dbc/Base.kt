package com.example.lcr2dbc

import net.lecousin.reactive.data.relational.annotations.ForeignKey
import net.lecousin.reactive.data.relational.annotations.GeneratedValue
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table
data class Base(
    @Id @GeneratedValue var id: Long?,
//    val productId: UUID,
    var name: String,
    @ForeignKey var product: Product,
//    @ForeignTable(joinKey = "base") val coverages: Set<BaseCoverage>
)
