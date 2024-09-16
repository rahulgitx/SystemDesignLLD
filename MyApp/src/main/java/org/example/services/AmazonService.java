//package org.example.services;
//
//import org.example.models.Item;
//import org.example.models.ItemAmazon;
//import org.example.models.ItemFlipkart;
//
//import java.util.List;
//
//public class AmazonService implements Service{
//    @Override
//    public List<Item> getOrder() {
//        // get connection information and send a get() request
//        Response<Item> response = get(url, headers, Item.class);
//        ItemAmazon itemAmazon = response.getBody();
//        return itemAmazon.getBody();
//    }
//
//    @Override
//    public boolean placeOrder(ItemFlipkart itemFlipkart) {
//        Response<Boolean> response = put(url, headers, Boolean.class);
//
//        return response.getBody();
//    }
//}
