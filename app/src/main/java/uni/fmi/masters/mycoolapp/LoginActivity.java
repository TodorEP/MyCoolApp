package uni.fmi.masters.mycoolapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText usernameET;
    EditText passwordET;
    Button loginB;
    TextView registerTV;

    SharedPreferences pref;
    String username;
    String password;

    SQLiteOpenHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = findViewById(R.id.usernameEditText);
        passwordET = findViewById(R.id.passwordEditText);
        loginB = findViewById(R.id.loginButton);
        registerTV = findViewById(R.id.registerTextView);

        loginB.setOnClickListener(onClick);
        registerTV.setOnClickListener(onClick);

//        pref = getApplicationContext().getSharedPreferences(RegisterActivity.SHARED_PREF_NAME, MODE_PRIVATE);
//        username = pref.getString(RegisterActivity.SHARED_PREF_USERNAME, "goshko");
//        password = pref.getString(RegisterActivity.SHARED_PREF_PASSWORD, "1111");
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.loginButton){

                String usernameInput = usernameET.getText().toString();
                String passwordInput = passwordET.getText().toString();

//                if(usernameInput.equalsIgnoreCase(username) && passwordInput.equals(password)) {
                if(true){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                } else{
                    Toast.makeText(getApplicationContext(), "Wrong password!", Toast.LENGTH_SHORT).show();
                }

            }else{
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }

        }
    };

}