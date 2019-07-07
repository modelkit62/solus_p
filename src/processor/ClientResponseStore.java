package processor;

import java.util.ArrayList;
import java.util.List;

public class ClientResponseStore {

    List<ClientRes> clientResponseList;

    public ClientResponseStore() {
        clientResponseList = new ArrayList<>();
    }

    public List<ClientRes> getClientResponseList() {
        return clientResponseList;
    }

    public List<ClientRes> addClientResponse(ClientRes clientResponse){
       clientResponseList.add(clientResponse);
       return clientResponseList;
    }
}
