package Lecture11;

public class OOPS {
    private String username;
    private String password;

    //Getters and Setters
    public String getUsername(boolean key){
        if(key)
            return username;
        else
            return "Nice Try!";

        
    }
    public void setUsername(String username){
        this.username=username;
    
    }

    public String getPassword(int key){
        if(key==123)
            return password;
        else
            return "Nice Try!";    
    }
    public void setPassword(String password){
        this.password=password;
    
    }
    
}
