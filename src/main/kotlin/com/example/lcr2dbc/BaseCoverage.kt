package jp.joinsure.products.console.infrastructure.r2dbc

import net.lecousin.reactive.data.relational.annotations.ForeignKey
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table
data class BaseCoverage(
    @Id val id: UUID?,
    val baseId: UUID,
    val name: String,
    val type: String,
//    val coverageAmount: List<BigDecimal>,
//    val maxPaymentAmount: List<BigDecimal>,
//    @ForeignKey val base: Base,
)
