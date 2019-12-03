package bo.upb.programacion3.codelabpokedex.utils;
import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class UserUtils {
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ash", "frickyougivemethemedal"
                , R.drawable.ash_ketchum, Arrays.asList(1, 2, 3)));
        users.add(new User(2, "Misty", "sheeps"
                , R.drawable.misty,  Arrays.asList(4, 5, 6)));
        users.add(new User(3, "Brock", "eyes?where?"
                , R.drawable.brock,  Arrays.asList(7, 8, 9)));
        users.add(new User(4, "Jessie", "kaboom"
                , R.drawable.jessie,  Arrays.asList(10, 12, 13)));
        users.add(new User(5, "James", "kaboomx2"
                , R.drawable.james,  Arrays.asList(17, 21, 14)));

        return users;
    }
}
