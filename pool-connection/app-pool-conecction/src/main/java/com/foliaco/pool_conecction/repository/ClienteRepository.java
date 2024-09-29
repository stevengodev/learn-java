package com.foliaco.pool_conecction.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.foliaco.pool_conecction.model.Cliente;

public class ClienteRepository {
    
    private Connection connection = null;
    private static final String QUERY_SELECT = "SELECT * FROM clientes";
    private static final String QUERY_INSERT = "INSERT INTO clientes (name, last_name, email, create_at) VALUES (?, ?, ?, ?)";
    private static final String QUERY_UPDATE = "UPDATE clientes SET name = ?, last_name = ?, email = ?, create_at = ? WHERE id = ?";
    private static final String QUERY_DELETE = "DELETE FROM clientes WHERE id = ?";
    
    public ClienteRepository() {
    }

    public ClienteRepository(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<Cliente> listarClientes(){
        List<Cliente> clientes = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(QUERY_SELECT)) {
            
           ResultSet resultSet = statement.executeQuery();

           while (resultSet.next()) {

            Long id = resultSet.getLong("id");
            String nombre = resultSet.getString("name");
            String apellido = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            LocalDateTime dateTime = resultSet.getTimestamp("create_at").toLocalDateTime();

            clientes.add(new Cliente(id, nombre, apellido, email, dateTime));

           }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public Cliente guardarCliente(Cliente cliente){

        String QUERY_GUARDAR = cliente.getId() == null ? QUERY_INSERT : QUERY_UPDATE;

        try (PreparedStatement statement = connection.prepareStatement(QUERY_GUARDAR)) {
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getEmail());
            statement.setTimestamp(4, Timestamp.valueOf(cliente.getDateTime()));

            if (cliente.getId() != null) {
                statement.setLong(5, cliente.getId());
            }

            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cliente;

    }

    public void eliminarCliente(Long id){

        try (PreparedStatement statement = connection.prepareStatement(QUERY_DELETE)) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
