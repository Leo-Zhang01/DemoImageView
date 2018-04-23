package sg.edu.rp.c346.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView2, imageView3, imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.day2);
        imageView3 = findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.day3);
        imageView4 = findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.day4);
    }
}
