package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection obterConexao() {

        Connection conexao = null;

        try {

            conexao = DriverManager.getConnection
                    ("jdbc:postgresql://database-2.car2qha01asq.sa-east-1.rds.amazonaws.com/", "postgres", "12345678");


            if (conexao != null) {

                System.out.println("Conexao realizada com sucesso!");

            }

        } catch (SQLException e) {

            System.out.println("Erro ao se conectar ao banco de dados" + e.getMessage());

        }

        return conexao;

    }
}