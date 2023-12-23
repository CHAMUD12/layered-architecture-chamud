package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.dao.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory(){
    }
    public static DAOFactory getDaoFactory(){
        return (daoFactory==null)?daoFactory
                =new DAOFactory():daoFactory;
    }

    public enum DAOTypes{
        CUSTOMER,ITEM,ORDER,ORDER_DETAIL,QUERY
    }
    public SuperDAO getDAO(DAOTypes daoTypes) {
        switch (daoTypes) {
            case CUSTOMER:
                return (SuperDAO) new CustomerDAOImpl();
            case ITEM:
                return (SuperDAO) new ItemDAOImpl();
            case ORDER:
                return (SuperDAO) new OrderDAOImpl();
            case ORDER_DETAIL:
                return (SuperDAO) new OrderDetailsDAOImpl();
            case QUERY:
                return (SuperDAO) new QueryDAOImpl();
            default:
                return null;
        }
    }
}
