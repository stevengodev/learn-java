package com.foliaco.pool_conecction;


import com.foliaco.pool_conecction.model.Cliente;
import com.foliaco.pool_conecction.repository.ClienteRepository;
import com.foliaco.pool_conecction.util.PoolConnectionHikari;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{

    @Test
    void testGuardarCliente() throws SQLException {

        Connection conn = PoolConnectionHikari.getConnection();

        Cliente cliente = new Cliente(null, "Tarrito", "Rojo", "tarrito@gmail.com", LocalDateTime.now());
        ClienteRepository repository = new ClienteRepository(conn);

        Cliente clienteGuardado = repository.guardarCliente(cliente);
        assertEquals("Tarrito", clienteGuardado.getNombre());
        assertEquals("Rojo", clienteGuardado.getApellido());
    }

    @Test
    void testListarClientes() throws SQLException {
        Connection conn = PoolConnectionHikari.getConnection();

        ClienteRepository repository = new ClienteRepository(conn);

        List<Cliente> clientes = repository.listarClientes();

        assertTrue(!clientes.isEmpty());

    }


}
