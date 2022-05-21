package sg.edu.rp.c346.id21021785.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C203;
    TextView C206;
    TextView C218;
    TextView C235;
    TextView C346;
    TextView G953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C203 = findViewById(R.id.C203);
        C206 = findViewById(R.id.C206);
        C218 = findViewById(R.id.C218);
        C235 = findViewById(R.id.C235);
        C346 = findViewById(R.id.C346);
        G953 = findViewById(R.id.G953);

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "Web Application Development in PHP");
                intent.putExtra("year", "2");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W65H");
                intent.putExtra("facilitator", "Leonard Gan");
                intent.putExtra("day", "Monday");
                intent.putExtra("about", "This module introduces students to the fundamental skills and knowledge associated with developing database-driven web applications. The scope of this module will cover the development of web pages that can store, search, retrieve, and display data from a database, validate data using client and server-side techniques, use sessions variables for holding information across multiple web pages, use web cookies for remembering previous user activity, and set access control to various web pages based on different user profiles. The language and technologies used in this module include HTML, CSS, php, and JavaScript.");
                startActivity(intent);
            }
        });

        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", "2");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E66K");
                intent.putExtra("facilitator", "Serene Yong");
                intent.putExtra("day", "Thursday");
                intent.putExtra("about", "The aim of this module is to introduce students to the fundamental principles and practices of planning, analysis, design, and testing within the context of a Software Development Life Cycle (SDLC). In this module, students will be given the opportunities to apply prevalent software development methodologies and corresponding frameworks to projects of different nature, and through this exposure, develop the ability to align a project’s traits with the appropriate software development methodology.");
                startActivity(intent);
            }
        });

        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year", "2");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E66B");
                intent.putExtra("facilitator", "Jean Lim");
                intent.putExtra("day", "Wednesday");
                intent.putExtra("about", "Students will be equipped with knowledge in User Experience (UX) design in areas such as requirement gathering, creating and analysis of the User Interfaces (UI) in this module. Students will also gain the skills to offer users an intuitive and responsive experience as they design UI for software platforms on both web and mobile devices. Through this module, students will also learn how to create interactive prototypes using prototyping tools.");
                startActivity(intent);
            }
        });

        C235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", "2");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W65G");
                intent.putExtra("facilitator", "Pang Tee How");
                intent.putExtra("day", "Tuesday");
                intent.putExtra("about", "This module addresses the best practices of the development and management of effective security systems with coverage on information, personnel, physical security, and risk analysis for information protection. It provides a broad overview of the principles and elements of information technology security. It covers the basic principles of the CIA model – Confidentiality, Integrity and Availability. Topics covered include IT security threats, security techniques, security services, and system security features. Students will also be introduced to the different information security standards available in the IT industry such as ISO 27001 that implements a security framework for organisations.");
                startActivity(intent);
            }
        });

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", "2");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E62E");
                intent.putExtra("facilitator", "Andy Tao");
                intent.putExtra("day", "Friday");
                intent.putExtra("about", "In this module, students will learn the basics of creating Android Applications. They will learn about user interface implementation issues such as layout, notifications and dialogues as well as the logic and data management (databases, services, GPS, multi-threading, etc.) using the Java programming language.");
                startActivity(intent);
            }
        });

        G953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "G953");
                intent.putExtra("name", "Life Skills III");
                intent.putExtra("year", "2");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "1");
                intent.putExtra("venue", "-");
                intent.putExtra("facilitator", "-");
                intent.putExtra("day", "Tuesday");
                intent.putExtra("about", "Globalisation and changing demographics are the key driving forces of the future and this module equips students with the competencies to succeed in such a diverse environment. Through this module, students will gain skills in finance management, understand crosscultural relationships and have opportunities to develop civic engagement skills that help to improve the lives of others through service-learning.\n\nThese engagements are anchored in the core values aligned to the REPUBLIC Code of Honour.");
                startActivity(intent);
            }
        });

    }
}