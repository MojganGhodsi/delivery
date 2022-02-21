package com.assignment.delivery.entity

import org.springframework.data.annotation.Id

data class Delivery(@Id
                    var deliveryId: String,
                    var product: String,
                    var quantity: Int,
                    var supplier: String,
                    var expectedDate: String,
                    var expectedWarehouse: String,
                    var recieved: Boolean)


