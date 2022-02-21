package com.assignment.delivery.service

import com.assignment.delivery.entity.Delivery
import com.assignment.delivery.repository.DeliveryRepository
import kotlinx.coroutines.reactive.awaitFirstOrDefault
import kotlinx.coroutines.reactive.awaitSingle
import org.springframework.stereotype.Service

@Service
class DeliveryService(private var deliveryRepository: DeliveryRepository) {

    /***
     * fetch all delivery from in-memory database
     */
    suspend fun findAll(): List<Delivery> {
        return deliveryRepository.findAll().collectList().awaitFirstOrDefault(listOf())
    }

    /***
     * fetch delivery with [id] from in-memory database
     */
    suspend fun findById(id: String): Delivery? {
        return deliveryRepository.findById(id).awaitSingle()
    }
}
