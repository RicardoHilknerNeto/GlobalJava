package Controller;

import Model.Functions_DAO;
import Model.Functions_DAO.River;
import java.util.ArrayList;

public class Database {

    public static void Users() {
        Functions_DAO.showUsers();
    }

    public static void Rivers() {
        ArrayList<River> rivers = new ArrayList<>();
        
        rivers.add(new River("Amazonas", 6.5, 50.0));
        rivers.add(new River("Paraná", 7.0, 30.0));
        rivers.add(new River("São Francisco", 7.2, 20.0));
        rivers.add(new River("Tocantins", 6.8, 25.0));
        rivers.add(new River("Madeira", 6.4, 40.0));
        rivers.add(new River("Araguaia", 6.7, 35.0));

        // Imprimir o pH do rio Madeira
        River madeira = rivers.get(4);
        System.out.println("O pH do rio Madeira é: " + madeira.getPH());
    }
}
