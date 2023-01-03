package exceptions;

public class WrongPasswordException extends Exception{
    private String description;


    public WrongPasswordException(){}

    public WrongPasswordException(String description){
        super(description);
        this.description = description;

    }

    public String getDescription() {
        return description;
    }
}
