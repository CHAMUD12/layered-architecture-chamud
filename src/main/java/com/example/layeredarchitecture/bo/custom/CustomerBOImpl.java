package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.impl.CustomerBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAO customerDAO =
            (CustomerDAO) DAOFactory.getDaoFactory().
                    getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException{
        return customerDAO.save(dto);
    }
    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(dto);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
    }

    @Override
    public String genarateId() throws SQLException, ClassNotFoundException {
        return customerDAO.genarateId();
    }
    @Override
    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.search(id);
    }

}
