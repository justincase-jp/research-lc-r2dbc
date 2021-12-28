package com.example.lcr2dbc

import net.lecousin.reactive.data.relational.query.SelectQuery
import net.lecousin.reactive.data.relational.query.criteria.Criteria
import net.lecousin.reactive.data.relational.repository.LcR2dbcRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

interface LcProductRepository : LcR2dbcRepository<Product, UUID> {
//    override fun findById(id: UUID): Mono<Product> {
//        return SelectQuery
//            .from(Product::class.java, "product")
//            .where(Criteria.property("product", "id").`is`(id))
//            .join("product", "base", "base")
//            .execute(lcClient).next()
//    }
//
//    fun findAllProduct(): Flux<Product> {
//        return SelectQuery
//            .from(Product::class.java, "product")
//            .join("product", "base", "base")
//            .execute(lcClient)
//    }
}
