package com.bootcamp.ECommerceApplication.co;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;

public class ProductVariationCO {

    @NotNull(message = "Please provide product Id")
    @NotBlank(message = "Please provide valid product Id")
    private Long productId;
    @NotNull(message = "Please provide Quantity Available")
    @NotBlank(message = "Please provide valid Quantity Available")
    private Integer quantityAvailable;
    @NotNull(message = "Please provide  price")
    @NotBlank(message = "Please provide valid  price")
    private Float price;
    @NotNull(message = "Please provide metadataHashmap")
    @NotBlank(message = "Please provide valid metadataHashmap")
    private HashMap metadataHashmap;

    private boolean isActive;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public HashMap getMetadataHashmap() {
        return metadataHashmap;
    }

    public void setMetadataHashmap(HashMap metadataHashmap) {
        this.metadataHashmap = metadataHashmap;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
