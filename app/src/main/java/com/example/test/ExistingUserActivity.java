package com.example.test;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ExistingUserActivity extends AppCompatActivity {

    Button btnLogOut;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.redirection_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.go_to_Create:
                Intent intentTOPageSelection=new Intent(getApplicationContext(), PageSelectionActivity.class);
                startActivity(intentTOPageSelection);
                return true;

            case R.id.go_to_Existing:
                Intent intentToExisting=new Intent(getApplicationContext(), ExistingUserActivity.class);
                startActivity(intentToExisting);
                return true;

            default:
                super.onOptionsItemSelected(item);
        }
        if(item.getItemId()==R.id.go_to_Existing){
            Intent intent=new Intent(getApplicationContext(), ExistingUserActivity.class);
            startActivity(intent);
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_user);

        btnLogOut=findViewById(R.id.btnExit);


        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Welcome.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }


}
