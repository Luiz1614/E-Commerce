package org.eCommerce.repositories;

import org.eCommerce.entities.Cliente;

public class ClienteRepository extends _BaseRepositoryImpl<Cliente>{
    public ClienteRepository() {
        super(Cliente.class);
    }
}
