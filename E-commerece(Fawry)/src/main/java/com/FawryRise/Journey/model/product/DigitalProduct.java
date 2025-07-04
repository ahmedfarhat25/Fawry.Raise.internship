package com.FawryRise.Journey.model.product;

public class DigitalProduct extends Product {
    private String downloadLink;
    private String fileSize;

    public DigitalProduct(String id, String name, double price, String description,
                          String downloadLink, String fileSize) {
        super(id, name, price, description);
        this.downloadLink = downloadLink;
        this.fileSize = fileSize;
    }

    public DigitalProduct(String vodafoneScratchCard, String ahmed, int price, String description) {
        super();
    }

    // Getters
    public String getDownloadLink() { return downloadLink; }
    public String getFileSize() { return fileSize; }
    @Override public String getProductType() { return "Digital"; }
}