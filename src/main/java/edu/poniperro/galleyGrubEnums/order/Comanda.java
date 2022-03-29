package edu.poniperro.galleyGrubEnums.order;

import edu.poniperro.galleyGrubEnums.items.Item;

import java.util.List;

public interface Comanda {
    void addItem(String name, double price);
    void addItem(String name, double price, String extra);
    int size();
    List<Item> itemList();
    Double getTotal();
    void updateTotal(Double d);
    void display();
}