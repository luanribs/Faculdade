package com.mycompany.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mycompany.model.connection.Conexao;
import com.mycompany.model.connection.ConexaoMysql;
import com.mycompany.model.domain.Categoria;

public class Main { 
    public static void main(String[] args) throws SQLException {
        
        Conexao conexao = new ConexaoMysql();
        Connection conn = conexao.obterConexao();
        String sql = "Select * from categoria";
        Categoria categoria = new Categoria(12, "bebidinha dos cria", "adentrando o netbeans");
    
        String inserirSQL = "INSERT INTO Categoria(nome, descricao) VALUES(?, ?)";
         PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(inserirSQL);

        preparedStatement.setString(1, categoria.getNome());
        preparedStatement.setString(2,categoria.getDescrição());
        int resultadoDoCadrasto = preparedStatement.executeUpdate();
        System.out.println(resultadoDoCadrasto);
        if (conn != null) {
            System.out.println("Conexão estabelecida com sucesso!");
              
        } else {
            System.out.println("Falha na conexão!");
        }

        ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
        while(result.next()){
            System.out.println(result.getString("nome"));
        }
    }
}
