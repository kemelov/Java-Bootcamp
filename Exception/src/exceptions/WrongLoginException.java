package exceptions;

public class WrongLoginException extends Exception{
    private String description;


    public WrongLoginException(){}

    public WrongLoginException(String description){
        super(description);
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

}
