package com.example.irfan.inventory_i.data;

import android.provider.BaseColumns;

public class InventoryAppContract {
    public static final class InventoryEntry implements BaseColumns {
        public static final String TABLE_NAME = "Products";
        public static final String COLUMN_PRODUCT_NAME = "productName";
        public static final String COLUMN_PRODUCT_PRICE = "productPrice";
        public static final String COLUMN_PRODUCT_QUANTITY = "productQuantity";
        public static final String COLUMN_SUPPLIER_NAME = "supplierName";
        public static final String COLUMN_SUPPLIER_PHONE = "supplierPhone";

    }
}
