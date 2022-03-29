package edu.poniperro.galleyGrubEnums.order;

import edu.poniperro.galleyGrubEnums.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {

    private List<Item> items = new ArrayList<>();
    private double total;

    @Override
    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        items.add(new Item(name, price, extra));
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<Item> itemList() {
        return items;
    }

    @Override
    public Double getTotal() {
        return total;
    }

    @Override
    public void updateTotal(Double price) {
        total += price;
    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER ---  ");
        for (Item item : items) {
            itemDisplay(item);
        }
    }

    private void itemDisplay(Item item) {
        System.out.println("\t" + item.toString());
    }
}