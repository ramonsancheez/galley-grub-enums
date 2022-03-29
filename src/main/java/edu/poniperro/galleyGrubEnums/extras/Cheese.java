package edu.poniperro.galleyGrubEnums.extras;

import edu.poniperro.galleyGrubEnums.items.Item;
import edu.poniperro.galleyGrubEnums.items.Prices;
import edu.poniperro.galleyGrubEnums.order.Comanda;

public class Cheese extends Extra {

    @Override
    public void sumExtras(Comanda order) {
        for (Item item : order.itemList()) {
            if (!item.isRegular() && item.extra() == "cheese") {
                order.updateTotal(Prices.getPriceof(item.extra()));
            }
        }
    }
}