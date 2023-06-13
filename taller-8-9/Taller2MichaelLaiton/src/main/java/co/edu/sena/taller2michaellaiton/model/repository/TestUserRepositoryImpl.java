package co.edu.sena.taller2michaellaiton.model.repository;

import co.edu.sena.taller2michaellaiton.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
public  static void main(String[] args) throws SQLException{
    Repository<User> repository = new Userrepositorylmpl();

    System.out.println("========saveObj Insert=======");
    User userInsert = new User();
    userInsert.setUser_firstname("Michael");
    userInsert.setUser_lastname("Laiton");
    userInsert.setUser_email("michael1@gmial.com");
    userInsert.setUser_password("michael1212");
    repository.saveObj(userInsert);
    userInsert.setUser_firstname("Jeferson");
    userInsert.setUser_lastname("Pulido");
    userInsert.setUser_email("JefPul8@gmial.com");
    userInsert.setUser_password("Jeferson0815");
    repository.saveObj(userInsert);

    System.out.println("=======listaALLObj");
    repository.listaALLobj().forEach(System.out::println);
    System.out.println();

    System.out.println("=======byIdObj=======");
    System.out.println(repository.byIdObj(1));
    System.out.println();

    System.out.println("=======saveObj=========="); //update
    User userUpdate = new User();
    userUpdate.setUser_id(2);
    userInsert.setUser_firstname("Alejandra");
    userInsert.setUser_lastname("Diana");
    userInsert.setUser_email("Diana4545@gmial.com");
    userInsert.setUser_password("Diana88881245");
    repository.saveObj(userInsert);
    repository.listaALLobj().forEach(System.out::println);
    System.out.println();


    System.out.println("=======deleteObj=======");
    repository.deleteObj(2);
    repository.listALLObj().forEach(System.out::println);
    }
}// TestUserRepositorylmpl
