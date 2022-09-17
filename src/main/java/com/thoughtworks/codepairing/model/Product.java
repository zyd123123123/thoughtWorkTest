package com.thoughtworks.codepairing.model;

import java.util.Objects;

public class Product {
    private final double price;
    private final String productCode;
    private final String name;

    public Product(double price, String productCode, String name) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                productCode.equals(product.productCode) &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, productCode, name);
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

}
