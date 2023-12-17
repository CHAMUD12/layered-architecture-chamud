package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
     boolean saveitem(ItemDTO dto) throws SQLException, ClassNotFoundException, SQLException;
     boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
     boolean existItem(String code) throws SQLException, ClassNotFoundException ;
     void delete(String code) throws SQLException, ClassNotFoundException;
     ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
     String generateID() throws SQLException, ClassNotFoundException;
     ItemDTO findItem(String code) throws SQLException, ClassNotFoundException;

}
