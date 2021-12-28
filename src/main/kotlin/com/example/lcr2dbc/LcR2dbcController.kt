package com.example.lcr2dbc

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.*

@RestController
@CrossOrigin
class LcR2dbcController(
    val lcR2dbcUseCase: LcR2dbcUseCase,
) {

    @GetMapping("/products")
    fun get(): Mono<ProductGetResponse> {
        return lcR2dbcUseCase.get()
    }
}

data class ProductGetResponse(
    val products: List<ProductDto>
)

data class ProductDto(
    val id: UUID,
    val name: String,
    val base: BaseDto,
)

data class BaseDto(
    val id: UUID,
    val name: String,
)