package Dao;

import BaseConnection.ConectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO implements Cliente{
    private ConectorDB conexion;

    public ClienteDAO() {
        this.conexion = new ConectorDB();
    }
    @Override
    public void guardad(Cliente cliente) {
        String sql = "INSERT INTO cliente (id, nombre, apellido, email) VALUES (?, ?, ?, ?)";

        try (
                Connection conn = conexion.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setInt(1, cliente.getId());
            pstmt.setString(2, cliente.getNombre());
            pstmt.setString(3, cliente.getApellido);
            pstmt.setString(4, cliente.getEmail());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
