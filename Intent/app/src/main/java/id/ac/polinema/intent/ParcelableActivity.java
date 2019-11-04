package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;
    private EditText ageInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameInput = findViewById(R.id.input_username);
        passwordInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);

    }

    public void handelSubmit(View view) {
        String username,name;
        int age;
        username = usernameInput.getText().toString().trim();
        name = passwordInput.getText().toString().trim();
        age = Integer.parseInt(ageInput.getText().toString().trim());
        User user = new User(username,name,age);
        Intent i = new Intent(this,ProfileParcelableActivity.class);
        i.putExtra("username",user.getUsername());
        i.putExtra("name",user.getName());
        i.putExtra("age",user.getAge());
        startActivity(i);
    }
}