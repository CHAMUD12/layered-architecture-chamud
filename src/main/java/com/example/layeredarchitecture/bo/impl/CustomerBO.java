package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;

public interface CustomerBO {
     boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException;
     boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException;
     boolean exist(String id) throws SQLException, ClassNotFoundException;
     void delete(String id) throws SQLException, ClassNotFoundException;
     String genarateId() throws SQLException, ClassNotFoundException;
     CustomerDTO search(String id) throws SQLException, ClassNotFoundException;
}
