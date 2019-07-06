package processor;

import java.util.ArrayList;
import java.util.List;

public class ClientResponseStore {

    List<ClientResponse> clientResponseList;

    public ClientResponseStore() {
        clientResponseList = new ArrayList<>();
    }

    public List<ClientResponse> getClientResponseList() {
        return clientResponseList;
    }

    public List<ClientResponse> addClientResponse(ClientResponse clientResponse){
       clientResponseList.add(clientResponse);
       return clientResponseList;
    }
}
