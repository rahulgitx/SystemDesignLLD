//package org.example.services;
//
//import org.example.models.Item;
//import org.example.models.ItemFlipkart;
//
//import java.util.List;
//
//import static com.sun.xml.internal.ws.api.message.Packet.Status.Response;
//
//public class FlipkartService implements Service{
//    @Override
//    public List<Item> getOrder() {
//        // get connection information and send a get() request
//        Response<Item> response = get(url, headers, Item.class);
//        ItemFlipkart itemFlipkart = response.getBody();
//        return itemFlipkart.getBody();
//    }
//
//    @Override
//    public boolean placeOrder(ItemFlipkart itemFlipkart) {
//        Response<Boolean> response = put(url, headers, Boolean.class);
//
//        return response.getBody();
//    }
//}