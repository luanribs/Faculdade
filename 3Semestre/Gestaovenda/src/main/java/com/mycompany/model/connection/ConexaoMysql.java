package com.mycompany.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql implements Conexao {

    private final String USUARIO = "root";
    private final String SENHA = "1234";
    private final String URL = "jdbc:mysql://localhost:3306/gestao_venda";
    private Connection conectar;

    @Override
    public Connection obterConexao() throws SQLException {
        if (conectar == null) {
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        return conectar;
    }

}
