package Controller;

import Model.Functions_DAO;
import java.util.ArrayList;
import View.Rios_GUI;
import View.Oceanos_GUI;
import Controller.Rivers;
import Controller.Oceans;

    

public class Database {

    public static ArrayList<Rivers> rivers = new ArrayList<>();
    public static ArrayList<Oceans> oceans = new ArrayList<>();
    

    public static void Users() {
        Functions_DAO.showUsers();
    }

    public static void Rivers() {
        rivers.add(new Rivers("Amazonas", 6.5, 50.0));
        rivers.add(new Rivers("Paraná", 7.0, 30.0));
        rivers.add(new Rivers("São Francisco", 7.2, 20.0));
        rivers.add(new Rivers("Tocantins", 6.8, 25.0));
        rivers.add(new Rivers("Madeira", 6.4, 40.0));
    }
    
    public static void Oceans() {
        oceans.add(new Oceans("Ártico", 7.8, 120));
        oceans.add(new Oceans("Atlântico", 7.6, 82.0));
        oceans.add(new Oceans("Pacífico", 8.1, 90.0));
        oceans.add(new Oceans("Índico", 8.4, 72.0));
        oceans.add(new Oceans("Antártico", 7.7, 107.0));
    }
    
    
    }
