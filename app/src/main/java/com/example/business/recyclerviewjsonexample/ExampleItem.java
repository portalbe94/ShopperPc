package com.example.business.recyclerviewjsonexample;

public class ExampleItem {
    private String mImageUrl;
    private String mProduct;
    private int mSalePrice;

    public ExampleItem(String imageUrl, String Product, int SalePrice) {
        mImageUrl = imageUrl;
        mProduct = Product;
        mSalePrice = SalePrice;
    }

    public String getImageUrl() {
        return mImageUrl;
        }

        public String getProduct() {
        return mProduct;
        }

        public int getSalePrice() {
        return mSalePrice;
        }


}
