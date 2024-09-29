package com.foliaco.pool_conecction;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.List;

import com.foliaco.pool_conecction.model.Cliente;
import com.foliaco.pool_conecction.repository.ClienteRepository;
import com.foliaco.pool_conecction.util.PoolConnectionDBCP;
import com.foliaco.pool_conecction.util.PoolConnectionHikari;

public class App 
{

    public static void main( String[] args )
    {
        
        try (Connection conn = PoolConnectionHikari.getConnection()){
            
            ClienteRepository clienteRepository = new ClienteRepository(conn);
            clienteRepository.guardarCliente(new Cliente("Nuevo", "Cliente", "nuevo@gmail.com", LocalDateTime.now()));
            
            //System.out.println("GUARDANDO CLIENTE\n");
            //System.out.println(cliente);

            //clienteRepository.eliminarCliente(7L);

            System.out.println("\nListando clientes:\n");
            List<Cliente> clientes = clienteRepository.listarClientes();

            clientes.forEach(System.out::println);

        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
