package sg.edu.rp.c346.id21021785.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView moduleHeader;
    TextView day;
    TextView name;
    TextView year;
    TextView semester;
    TextView credit;
    TextView venue;
    TextView facilitator;
    TextView about;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleHeader = findViewById(R.id.moduleHeader);
        day = findViewById(R.id.day);
        name = findViewById(R.id.name);
        year = findViewById(R.id.year);
        semester = findViewById(R.id.semester);
        credit = findViewById(R.id.credit);
        venue = findViewById(R.id.venue);
        facilitator= findViewById(R.id.facilitator);
        about = findViewById(R.id.about);
        back = findViewById(R.id.backButton);

        Intent intentReceived = getIntent();
        moduleHeader.setText(intentReceived.getStringExtra("code"));
        name.setText("Module Name: " + intentReceived.getStringExtra("name"));
        day.setText("Day: " + intentReceived.getStringExtra("day"));
        year.setText("Academic Year: " + intentReceived.getStringExtra("year"));
        semester.setText("Semester: " + intentReceived.getStringExtra("semester"));
        credit.setText("Module Credit: " + intentReceived.getStringExtra("credit"));
        venue.setText("Venue: " + intentReceived.getStringExtra("venue"));
        facilitator.setText("Facilitator: " + intentReceived.getStringExtra("facilitator"));

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                about.setText("About:\n" + intentReceived.getStringExtra("about"));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}