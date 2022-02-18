package models;

import enums.OrderStatus;
import enums.Status;

public class Order {
    private long id;
    private long petId;
    private int quantity;
    private String shipDate;
    private OrderStatus status;
    private boolean complete;

    public Order(long petId, int quantity, String shipDate, OrderStatus status, boolean complete) {
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = complete;
    }

    public Order() {
    }

    public long getId() {
        return id;
    }

    public long getPetId() {
        return petId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
