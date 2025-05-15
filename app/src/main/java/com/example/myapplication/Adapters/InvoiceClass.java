package com.example.myapplication.Adapters;

public class InvoiceClass {
    private String InvoiceID;
    private String ProductID;
    private int Quantity;
    private int Total;

    public InvoiceClass(String invoiceID, String productID, int quantity, int total) {
        this.InvoiceID = invoiceID;
        ProductID = productID;
        Quantity = quantity;
        this.Total = total;
    }

    public String getInvoiceID() {

        return InvoiceID;
    }

    public void setInvoiceID(String invoiceID) {

        this.InvoiceID = invoiceID;
    }

    public String getProductID() {

        return ProductID;
    }

    public void setProductID(String productID) {

        ProductID = productID;
    }

    public int getQuantity() {

        return Quantity;
    }

    public void setQuantity(int quantity) {

        Quantity = quantity;
    }

    public int getTotal() {

        return Total;
    }

    public void setTotal(int total) {

        this.Total = total;
    }
}
