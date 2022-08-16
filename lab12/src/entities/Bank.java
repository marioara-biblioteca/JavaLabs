package entities;

import exceptions.ExistsException;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Bank {
    private final Set<Business> clients = new HashSet<>();
    public void addClient(final Business client) throws ExistsException{
        if(clients.contains(client)) throw new ExistsException("Client already exists in back");
        clients.add(client);
    }
    public Set<Business>getClients(){
        // TODO: get an immutable set of data
        return Collections.unmodifiableSet(clients);
    }
}
