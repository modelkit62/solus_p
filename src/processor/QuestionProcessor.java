package processor;

public class QuestionProcessor {

    ClientResponseStore clientResponseStore;

    public QuestionProcessor(ClientResponseStore clientResponseStore) {
        this.clientResponseStore = clientResponseStore;
    }

    Dialog processResponse(ClientResponseStore clientResponseStore){

        if(clientResponseStore.hashCode() == new Rule().hashCode()){
            return new Dialog();
        }
        return null;
    }
}
