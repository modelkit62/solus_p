package processor;

import java.util.List;

public class QuestionProcessor {

    private ClientResponseStore clientResponseStore;
    private List<Rule> rules;


    public QuestionProcessor() {

    }

    public String processResponse(ClientResponseStore clientResponseStore, List<Rule> rules) {
        for(Rule rule : rules){
            if (rule.getClientResponses().getClientResponseList().get(0).getChoice().equals(clientResponseStore.getClientResponseList().get(0).getChoice())){
                return rule.display();
            }
        }
        return null;
    }
}
