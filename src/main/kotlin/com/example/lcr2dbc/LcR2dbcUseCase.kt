package com.example.lcr2dbc

import net.lecousin.reactive.data.relational.LcReactiveDataRelationalClient
import net.lecousin.reactive.data.relational.model.LcEntityTypeInfo
import net.lecousin.reactive.data.relational.schema.SchemaBuilderFromEntities
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class LcR2dbcUseCase(
    val lcProductRepository: LcProductRepository,
    val lcBaseRepository: LcBaseRepository,
    val lcClient: LcReactiveDataRelationalClient
) {

    fun get(): Mono<ProductGetResponse> {
        val schema = SchemaBuilderFromEntities(lcClient).build(LcEntityTypeInfo.getClasses())
        val statements = lcClient.schemaDialect.createSchemaContent(schema)
        return lcClient
            .dropCreateSchemaContent(schema)
            .then(Mono.defer {
                return@defer lcProductRepository.save(
                    Product(
                        id = null,
                        name = "JICT保険",
                        base = null,
                    )
                )
                    .flatMap { product ->
                        lcBaseRepository.save(
                            Base(
                                id = null,
                                name = "JICT保険普通保険約款",
                                product = product,
                            )
                        ).flatMap {
                            lcProductRepository.findAll().collectList().map {
                                ProductGetResponse(
                                    products = it.map { product ->
                                        ProductDto(
                                            id = product.id!!,
                                            name = product.name,
                                            base = BaseDto(
                                                id = product.base!!.id!!,
                                                name = product.base!!.name,
                                            )
                                        )
                                    }
                                )
                            }
                        }
                    }
            })
    }
}