package com.miaplicacion.model;

import com.miaplicacion.util.DataConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public static boolean insertar(Usuario usuario) {
        try (Connection con = DataConnect.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (nombre, email) VALUES (?, ?)")) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());

            int i = ps.executeUpdate();
            return i > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Usuario> obtenerTodos() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection con = DataConnect.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM usuarios");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("email"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
