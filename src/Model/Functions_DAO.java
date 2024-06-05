package Model;

import Controller.Database;
import java.util.ArrayList;

public class Functions_DAO {
    // ArrayList de usuários
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static Object rivers;

    // Classe interna Usuario
    public static class Usuario {
        private String nome;
        private String senha;
        private String cpf;

        public Usuario(String nome, String senha, String cpf) {
            this.nome = nome;
            this.senha = senha;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public String getSenha() {
            return senha;
        }

        public String getCpf() {
            return cpf;
        }
    }

    // Método para adicionar um usuário ao ArrayList
    public static void armazenaUsuario(String nome, String senha, String cpf) {
        if (nome.isEmpty() || senha.isEmpty() || cpf.isEmpty()) {
            System.out.println("Por favor, preencha todos os campos.");
            return;
        }

        usuarios.add(new Usuario(nome, cpf, senha));
    }

    // Método para exibir todos os usuários
    public static void showUsers() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("Lista de Usuários:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf());
        }
    }
    
public static String validateUser() {
    String cpfDigitado = View.login_GUI.buscacpf_txt.getText();
    String senhaDigitada = View.login_GUI.buscapassword_txt.getText();
    
    for (Usuario usuario : usuarios) {
        if (usuario.getCpf().equals(cpfDigitado) && usuario.getSenha().equals(senhaDigitada)) {
            return usuario.getNome();
        }
    }
    
    return null; // Retorna null se o usuário não for encontrado
}

// Rios

 public static class River {
        public static Object rivers;
        private String name;
        private double pH;
        private double flow;

        public River(String name, double pH, double flow) {
            this.name = name;
            this.pH = pH;
            this.flow = flow;
        }

        public double getPH() {
            return pH;
        }

        @Override
        public String toString() {
            return "River{" + "name=" + name + ", pH=" + pH + ", flow=" + flow + '}';
        }
    }
}



