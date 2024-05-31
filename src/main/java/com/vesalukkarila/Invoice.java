package com.vesalukkarila;

public class Invoice {

    private String id;
    private String userId;
    private String pdfUrl;
    private Integer amount;

    public Invoice(String userId, Integer amount, String pdfUrl) {
        this.userId = userId;
        this.pdfUrl = pdfUrl;
        this.amount = amount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public Integer getAmount() {
        return amount;
    }
}
