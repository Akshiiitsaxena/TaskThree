package akshit.com.taskthree;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);

        Snackbar snackbar = Snackbar.make(relativeLayout,"SecondActivity",Snackbar.LENGTH_LONG);
        snackbar.show();

    }
}
