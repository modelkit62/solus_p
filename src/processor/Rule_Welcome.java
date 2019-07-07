package processor;

public class Rule_Welcome extends Rule {

    public Rule_Welcome(ClientResponseStore clientResponses) {
        super(clientResponses);
    }

    @Override
    public String display() {
         return "I am the Welcome dialog";
    }
}
