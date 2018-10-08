package interview.factorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.math.BigInteger;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final int number = getIntent().getIntExtra("number", 0);
        getSupportActionBar().setTitle(number + "!");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final TextView factorial = (TextView) findViewById(R.id.text_output);
        factorial.setText(getFactorial(number).toString());
    }

    public static BigInteger getFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
