package edu.poniperro.galleyGrubEnums.receipt;

import edu.poniperro.galleyGrubEnums.extras.Extra;
import edu.poniperro.galleyGrubEnums.order.Comanda;

public interface Ticket {
    Comanda getOrder();
    void setChain(Extra extra);
    Extra getChain();
    Double total();
    void sumExtrasCharge();
    void print();

}