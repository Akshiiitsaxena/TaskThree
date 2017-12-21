package akshit.com.taskthree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    protected String striing="Application Started";
    Button my_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(MainActivity.this,striing,Toast.LENGTH_SHORT).show();

        final Intent i = new Intent(getApplicationContext(),SecondActivity.class);

        my_button = (Button) findViewById(R.id.button1);

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });


    }
}
