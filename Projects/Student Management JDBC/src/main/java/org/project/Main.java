package org.project;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args){
        InputHandling.showMenu();
        try{StudentRepository.close();} catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
