package com.mycompany.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.model.connection.Conexao;
import com.mycompany.model.connection.ConexaoMysql;
import com.mycompany.model.domain.Perfil;
import com.mycompany.model.domain.Usuario;
import com.mysql.cj.xdevapi.PreparableStatement;

public class UsuarioDao {
    private final Conexao conexao;

    public UsuarioDao(Conexao conexao) {
        this.conexao = new ConexaoMysql();
    }


public static String salvar(Usuario usuario){
    return usuario.getId() == 0L ? adicionar(usuario) : editar(usuario);
        
        
        
        
        }
        
        
        private String editar(Usuario usuario) {
       
        String sql = "UPDATE usuario set nome = ? , usuario = ?, senha = ?, perfil= ?, estado = ? WHERE id =?";
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);
                preencherValoresPreparedStatement(preparedStatement,usuario);
                int resultado = preparedStatement.executeUpdate();
                return resultado == 1 ? "Usuario editado com sucesso!" : "Não foi possivel ";
       } catch (SQLException e) { 
        return String.format("Error: %s", e.getMessage());
        }
        }
    
        private String adicionar(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome, usuario, senha, perfil, estado) * VALUES(?, ?, ?, ?, ?)";
        Usuario usuarioTemp = buscarUsuarioPeloUsuario(usuario.getUsuario());
        if(usuarioTemp !=null){
            return String.format("Error: Usuario %s ja existe no banco de dados", usuario.getUsuario());
        }
        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);
                preencherValoresPreparedStatement(preparedStatement,usuario);
                                int resultado = preparedStatement.executeUpdate();
                                return resultado == 1 ? "Usuario adicionado com sucesso!" : "Não foi possivel adicionar";
                       } catch (SQLException e) { 
                        return String.format("Error: %s", e.getMessage());
                        }
                
                        
                    }
                
                
                        private void preencherValoresPreparedStatement(PreparedStatement preparedStatement, Usuario usuario) throws SQLException {
                           preparedStatement.setString(1, usuario.getNome());
                           preparedStatement.setString(2, usuario.getUsuario());
                           preparedStatement.setString(3, usuario.getSenha());
                           preparedStatement.setString(4, usuario.getPerfil().name());
                           preparedStatement.setBoolean(5, usuario.isEstado()); 
                           if (usuario.getId() !=0L){
                            preparedStatement.setLong(6, usuario.getId());
                            

                           }
                        
                            }
                           
                            
                            public List<Usuario> buscarTodosUsuarios(){
                                String sql = "Select * FROM usuario";
                                List<Usuario> usuarios = new ArrayList<>();
                                try {
                                    ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
                                    while(result.next()){
                                        usuarios.add(getUsuario(result));
                                    }
                                } catch (SQLException e) {
                                    System.out.println(String.format("Error: %s", e.getMessage())); 
                            
                                }
                                return usuarios;
                            }
                            //se der algum problema pode ser aqui//
                            private Usuario getUsuario(ResultSet result) throws SQLException {
                                Usuario usuario = new Usuario(null, false, 0, null, null, null, null, null);
    
                                usuario.setId(result.getLong("id"));
                                usuario.setNome(result.getString("nome"));
                                usuario.setUsuario(result.getString("usuario"));
                                usuario.setSenha(result.getString("senha"));
                                usuario.setPerfil(result.getObject("perfil", Perfil.class));
                                usuario.setEstado(result.getBoolean("estado"));
                                usuario.setDataHoraCriacao(result.getObject("data hora criacao", LocalDateTime.class));
                                usuario.setUltimoLogin(result.getObject("ultimo login", LocalDateTime.class ));  
                                
                                return usuario;
                            }
                            public Usuario buscarUsuarioPeloID(Long id){
                                String sql = String.format("Select * FROM usuario WHERE id = %d", id);
                        
                                try {
                                    ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
                                    if(result.next()){
                                        return getUsuario(result);
                                    }
                                } catch (SQLException e) {
                                    System.out.println(String.format("Error: %s", e.getMessage())); 
                            
                                }
                                return null;
                            }

                            public Usuario buscarUsuarioPeloUsuario(String usuario){
                                String sql = String.format("Select * FROM usuario WHERE id = %s", usuario);
                        
                                try {
                                    ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
                                    if(result.next()){
                                        return getUsuario(result);
                                    }
                                } catch (SQLException e) {
                                    System.out.println(String.format("Error: %s", e.getMessage())); 
                            
                                }
                                return null;
                            }




}
