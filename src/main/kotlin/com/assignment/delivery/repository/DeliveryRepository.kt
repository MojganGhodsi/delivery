package com.assignment.delivery.repository

import com.assignment.delivery.entity.Delivery
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DeliveryRepository : ReactiveCrudRepository<Delivery,String> {
}
