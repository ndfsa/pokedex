package bo.upb.programacion3.codelabpokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import bo.upb.programacion3.codelabpokedex.model.User;
import bo.upb.programacion3.codelabpokedex.utils.UserUtils;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.loginUsername);
        password = findViewById(R.id.loginPassword);
        toast = Toast.makeText(this, "Username or password invalid!", Toast.LENGTH_SHORT);
    }

    public void authenticate(View view) {
        List<User> users = UserUtils.getUsers();

        for (User user: users) {
            if (user.getUsername().equals(username.getText().toString()) && user.getPassword().equals(password.getText().toString())){
                Intent intent = new Intent(this, MainActivity.class);
                UserLogged.getInstance().setUsername(user.getUsername());
                UserLogged.getInstance().setImg(user.getImg());
                UserLogged.getInstance().setFavPokemon(user.getFavPokemon());
                startActivity(intent);
                toast.cancel();
                finish();
            }else{
                toast.show();
            }
        }
    }
}
