package Dao;

import BaseConnection.ConectorDB;
import entities.Cliente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenericoSQL implements GenericoDAO {
    private ConectorDB conexion;

    public GenericoSQL() {
        this.conexion = new ConectorDB();
    }
    @Override
    public void guardar(Cliente cliente) {
        String sql = "INSERT INTO cliente (nombre, apellido, email, fecha_nacimiento, telefono) VALUES (?, ?, ?, ?, ?)";

        try (
                Connection conn = conexion.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getApellido());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setDate(4, Date.valueOf(cliente.getFechaNacimiento()));
            pstmt.setInt(5, cliente.getTelefono());


            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
