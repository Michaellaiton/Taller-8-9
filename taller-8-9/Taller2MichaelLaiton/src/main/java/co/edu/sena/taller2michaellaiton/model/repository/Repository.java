package co.edu.sena.taller2michaellaiton.model.repository;

import co.edu.sena.taller2michaellaiton.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {
    List<T> listaALLobj() throws SQLException;


    List<User> ListaALLObj() throws SQLException;

    List<User> listALLObj() throws SQLException;

    T byIdObj(Integer id) throws  SQLException;

    Integer saveObj(T t) throws  SQLException;

    void deleteObj(Integer id) throws SQLException;

    T createObj(ResultSet rs) throws SQLException;
}
