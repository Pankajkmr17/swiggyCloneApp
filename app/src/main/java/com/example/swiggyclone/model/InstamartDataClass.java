package com.example.swiggyclone.model;

public class InstamartDataClass {
    private int productImage;
    private String productCompany = "";
    private String productName = "";
    private String productNameTamil = "";
    private String productWeight = "";
    private String orgPrice = "";
    private String disPrice = "";

    public InstamartDataClass(int productImage, String productCompany, String productName, String productNameTamil, String productWeight, String orgPrice, String disPrice) {
        this.productImage = productImage;
        this.productCompany = productCompany;
        this.productName = productName;
        this.productNameTamil = productNameTamil;
        this.productWeight = productWeight;
        this.orgPrice = orgPrice;
        this.disPrice = disPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductNameTamil() {
        return productNameTamil;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public String getOrgPrice() {
        return orgPrice;
    }

    public String getDisPrice() {
        return disPrice;
    }
}
