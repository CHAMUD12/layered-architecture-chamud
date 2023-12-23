package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO{

    ItemDAO itemDAO = new ItemDAOImpl();
    @Override
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }
    @Override
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }
    @Override
    public void delete(String code) throws SQLException, ClassNotFoundException {
    }
    @Override
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }
    @Override
    public String genarateId() throws SQLException, ClassNotFoundException {
        return itemDAO.genarateId();

    }
    @Override
    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.search(code);
    }
}
