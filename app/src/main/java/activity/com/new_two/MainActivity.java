package activity.com.new_two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
   static Button OnClick;
   static Button next;
    static TextView t1;
  static TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView);
       t2 = (TextView) findViewById(R.id.thirdtext1);
        t1.setText("Hello" +" "+getIntent().getStringExtra("Name"));
        t2.setText(getIntent().getStringExtra("Like"));
        next = (Button) findViewById(R.id.button3);
        OnClick = (Button) findViewById(R.id.button2);


        OnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });

        OnClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String name= t1.getText().toString();
                Intent i = new Intent(MainActivity.this, thirdActivity.class);
               i.putExtra("Name",name);
                startActivity(i);

return true;
            }
        });


    }
}