package processor;

public abstract class Rule {

    private ClientResponseStore clientResponses;


    public Rule(ClientResponseStore clientResponses) {
        this.clientResponses = clientResponses;
    }

    public ClientResponseStore getClientResponses() {
        return clientResponses;
    }

    public abstract String display();

}
