package com.example.lcr2dbc

import com.example.lcr2dbc.Base
import net.lecousin.reactive.data.relational.repository.LcR2dbcRepository
import java.util.*

interface LcBaseRepository : LcR2dbcRepository<Base, UUID> {
//    fun getBaseRecordWithBaseCoverageRecords(id: UUID): Mono<BaseRecord> {
//        return SelectQuery
//            .from(BaseRecord::class.java, "base")
//            .where(Criteria.property("base", "id").`is`(id))
//            .join("bases", "coverages", "coverage")
//            .execute(lcClient).next()
//    }
}
