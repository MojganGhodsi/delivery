CREATE TABLE IF NOT EXISTS DELIVERY(
    deliveryId VARCHAR(100) PRIMARY KEY,
    product VARCHAR(100),
    quantity NUMBER,
    supplier VARCHAR(100),
    expectedDate VARCHAR(100),
    expectedWarehouse VARCHAR(100),
    received BIT
    );

/*CREATE TABLE IF NOT EXISTS DELIVERY(
    delivery_id INT PRIMARY KEY,
    received BIT,
    CONSTRAINT FK_delivery FOREIGN KEY (delivery_id)
    REFERENCES DELIVERY(id)
    );*/
