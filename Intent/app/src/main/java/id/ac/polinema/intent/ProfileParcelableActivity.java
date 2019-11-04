package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView username;
    private TextView name;
    private TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        username = findViewById(R.id.text_username);
        name = findViewById(R.id.text_name);
        age = findViewById(R.id.text_age);

        String username_bd;
        String name_bd;
        int age_bd;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            username_bd = extras.getString("username");
            name_bd = extras.getString("name");
            age_bd = extras.getInt("age");

            username.setText(username_bd.toString());
            name.setText(name_bd.toString());
            age.setText(String.valueOf(age_bd).toString());
        }
    }
}