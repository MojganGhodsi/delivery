package com.assignment.delivery.query

import com.assignment.delivery.entity.Delivery
import com.assignment.delivery.service.DeliveryService
import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component


@Component
class DeliveryQuery(private val deliveryService: DeliveryService) : Query {

    suspend fun deliveries(): List<Delivery> {
        return deliveryService.findAll()
    }

    suspend fun delivery(id: String): Delivery? {
        return deliveryService.findById(id)
    }
}
