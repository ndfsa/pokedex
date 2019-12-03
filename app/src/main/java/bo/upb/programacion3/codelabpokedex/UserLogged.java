package bo.upb.programacion3.codelabpokedex;

import java.util.List;

public class UserLogged {
    private static final UserLogged ourInstance = new UserLogged();

    public static UserLogged getInstance() {
        return ourInstance;
    }

    private String username;
    private int img;
    private List<Integer> favPokemon;

    public List<Integer> getFavPokemon() {
        return favPokemon;
    }

    private UserLogged() {

    }

    public void setFavPokemon(List<Integer> favPokemon) {
        this.favPokemon = favPokemon;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
