package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BundleActivity extends AppCompatActivity {

    private static final String USERNAME_KEY = "username";
    private static final String NAME_KEY = "name";
    private static final String AGE_KEY = "age";

    private EditText usernameInput;
    private EditText passwordInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        usernameInput = findViewById(R.id.input_username);
        passwordInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void handleSubmit(View view) {
        String username = usernameInput.getText().toString().trim();
        String password = passwordInput.getText().toString().trim();
        int age = Integer.parseInt(ageInput.getText().toString().trim());

        Intent i = new Intent(this,ProfileBundleActivity.class);
        i.putExtra("username", username);
        i.putExtra("name", password);
        i.putExtra("age", age);
        startActivity(i);
    }
}
