import processor.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClientRes customerResponse1 = new ClientRes(1, "NO");
        ClientRes customerResponse2 = new ClientRes(2, "NO");
        ClientRes customerResponse3 = new ClientRes(3, "NO");

        ClientResponseStore clientResponseStore1 = new ClientResponseStore();
        clientResponseStore1.addClientResponse(customerResponse1);
        clientResponseStore1.addClientResponse(customerResponse2);
        clientResponseStore1.addClientResponse(customerResponse3);

        List<ClientRes> clientResponseList = clientResponseStore1.getClientResponseList();
        for(ClientRes c : clientResponseList){
            System.out.println(c.getChoice());
        }


        ClientRes customerResponse4 = new ClientRes(1, "NO");
        ClientRes customerResponse5 = new ClientRes(2, "NO");
        ClientRes customerResponse6 = new ClientRes(3, "NO");

        ClientResponseStore clientResponseStore2 = new ClientResponseStore();
        clientResponseStore2.addClientResponse(customerResponse4);
        clientResponseStore2.addClientResponse(customerResponse5);
        clientResponseStore2.addClientResponse(customerResponse6);


        Rule iRule = new Rule_Welcome(clientResponseStore2);

        List<Rule> iRules = new ArrayList<>();
        iRules.add(iRule);


        QuestionProcessor questionProcessor = new QuestionProcessor();

        String dialog = questionProcessor.processResponse(clientResponseStore1, iRules);

        System.out.println(dialog);

    }
}
