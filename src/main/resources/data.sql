/*CREATE TABLE item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    quantity INT NOT NULL,
    price DOUBLE NOT NULL
);

CREATE TABLE supplier (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    contact VARCHAR(255) NOT NULL
);

CREATE TABLE shipment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    supplier_id BIGINT NOT NULL,
    item_id BIGINT NOT NULL,
    quantity INT NOT NULL,
    shipment_date TIMESTAMP NOT NULL,
    status VARCHAR(255) NOT NULL,
    FOREIGN KEY (supplier_id) REFERENCES supplier(id),
    FOREIGN KEY (item_id) REFERENCES item(id)
);

CREATE TABLE orders (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    item_id BIGINT NOT NULL,
    quantity INT NOT NULL,
    order_date TIMESTAMP NOT NULL,
    status VARCHAR(255) NOT NULL,
    FOREIGN KEY (item_id) REFERENCES item(id)
);*/

-- Inserting initial data for Item
INSERT INTO item (name, quantity, price) VALUES ('Sample Item', 50, 25.0);

-- Inserting initial data for Supplier
INSERT INTO supplier (name, contact) VALUES ('Sample Supplier', '1234567890');

-- Inserting initial data for Shipment
INSERT INTO shipment (supplier_id, item_id, quantity, shipment_date, status) VALUES (1, 1, 50, NOW(), 'Delivered');

-- Inserting initial data for Order
INSERT INTO orders (item_id, quantity, order_date, status) VALUES (1, 5, NOW(), 'Confirmed');
