package com.example.lcr2dbc

import net.lecousin.reactive.data.relational.LcReactiveDataRelationalInitializer
import net.lecousin.reactive.data.relational.h2.H2Configuration
import net.lecousin.reactive.data.relational.repository.LcR2dbcRepositoryFactoryBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories(repositoryFactoryBeanClass = LcR2dbcRepositoryFactoryBean::class)
@Import(H2Configuration::class)
class LcR2dbcApplication

fun main(args: Array<String>) {
    LcReactiveDataRelationalInitializer.init()
    runApplication<LcR2dbcApplication>(*args)
}
