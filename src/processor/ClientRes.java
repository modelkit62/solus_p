package processor;

public class ClientRes {


    private final Integer id;
    private final String choice;


    public ClientRes(Integer id, String choice) {
        this.id = id;
        this.choice = choice;
    }

    public Integer getId() {
        return id;
    }

    public String getChoice() {
        return choice;
    }


}
