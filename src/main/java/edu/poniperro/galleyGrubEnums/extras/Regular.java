package edu.poniperro.galleyGrubEnums.extras;

import edu.poniperro.galleyGrubEnums.items.Item;
import edu.poniperro.galleyGrubEnums.order.Comanda;

public class Regular extends Extra {

    @Override
    public void sumExtras(Comanda order) {

        // Suma orders
        for (Item item : order.itemList()) {
            order.updateTotal(item.price());
        }

        // Llama al siguiente item
    }
}