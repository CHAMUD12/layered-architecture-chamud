package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.custom.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.ItemBOImpl;
import com.example.layeredarchitecture.bo.custom.PlaceOrderImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return (boFactory==null)?boFactory=
                new BOFactory():boFactory;

    }
    public enum BOTypes{
        CUSTOMER,ITEM,PLACE_ORDER
    }
    public SuperBo getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER:
                return (SuperBo) new CustomerBOImpl();
            case ITEM:
                return (SuperBo) new ItemBOImpl();
            case PLACE_ORDER:
                return (SuperBo) new PlaceOrderImpl();
            default:
                return null;
        }
    }
}
