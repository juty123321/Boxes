package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        float boxes = getIntent().getFloatExtra("BOXES",0);
        TextView result = findViewById(R.id.result);
        result.setText("Box3");
    }
}
