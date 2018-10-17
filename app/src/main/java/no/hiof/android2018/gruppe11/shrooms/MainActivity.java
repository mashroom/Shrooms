package no.hiof.android2018.gruppe11.shrooms;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.

        FirebaseUser currentUser = mAuth.getCurrentUser();

        // Sjekker om brukeren allerede er logget inn eller ikke
        if(currentUser != null){
            //Intent myIntent = new Intent(MainActivity.this, FeedActivity.class);
            //startActivity(myIntent);
        }else {

           // Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
            //startActivity(myIntent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();

        //Gjemmer Actionbaren:
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
