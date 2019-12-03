package bo.upb.programacion3.codelabpokedex.model;

import java.util.List;

public class User {

    private int id;
    private String username;
    private String password;
    private int img;

    private List<Integer>favPokemon;

    public User(int id, String username, String password, int img, List<Integer> favPokemon) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.img = img;
        this.favPokemon = favPokemon;
    }

    public int getId() {
        return id;
    }

    public int getImg() {
        return img;
    }

    public List<Integer> getFavPokemon() {
        return favPokemon;
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
}
