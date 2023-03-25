package Model;

public class User {
    private int id;
    private String username;
    private String password;
    private String securityAns;
    private int role = 2;
    private int locked = 0;

    public User(String username, String password, String securityAns){
        this.username = username;
        this.password = password;
        this.securityAns = securityAns;
    }
    
    public User(int id, String username, String password, int role, int locked, String securityAns){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.locked = locked;
        this.securityAns = securityAns;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }
    
    public String getSecurityAns() {
        return securityAns;
    }
    
    public void setSecurityAns(String ans) {
        this.securityAns = ans;
    }
}
