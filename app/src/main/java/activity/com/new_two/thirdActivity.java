package activity.com.new_two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {
    Button Update1;
    TextView thirdtext;
    EditText thirdtext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
      // final String like = thirdtext.getText().toString();
        thirdtext = findViewById(R.id.text1);
        thirdtext2=findViewById(R.id.thirdtext2);
        thirdtext.setText(" " + getIntent().getStringExtra("Name"));
        Update1 = (Button) findViewById(R.id.textView);
      Update1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= thirdtext.getText().toString();
                String like = thirdtext2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Name",name);
                intent.putExtra("Like",like);
                startActivity(intent);
            }
        });

    }
}
