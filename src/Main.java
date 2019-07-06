import processor.ClientResponse;
import processor.ClientResponseStore;
import processor.QuestionProcessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClientResponse customerResponse1 = new ClientResponse(1, "NO");
        ClientResponse customerResponse2 = new ClientResponse(2, "NO");
        ClientResponse customerResponse3 = new ClientResponse(3, "NO");

        ClientResponseStore clientResponseStore = new ClientResponseStore();
        clientResponseStore.addClientResponse(customerResponse1);
        clientResponseStore.addClientResponse(customerResponse2);
        clientResponseStore.addClientResponse(customerResponse3);

        List<ClientResponse> clientResponseList = clientResponseStore.getClientResponseList();
        for(ClientResponse c : clientResponseList){
            System.out.println(c.getChoice());
        }

    }
}
