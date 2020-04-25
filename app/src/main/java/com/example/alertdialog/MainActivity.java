package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.alert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Close the App");
                dialog.setMessage("Click Ok to Exit");
                dialog.setIcon(R.drawable.ic_close);
                dialog.setPositiveButton("OK", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // User clicked OK button.
                                Toast.makeText(getApplicationContext(), "Pressed OK",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                dialog.setNegativeButton("Cancel", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // User cancelled the dialog.
                                Toast.makeText(getApplicationContext(), "Pressed Cancel",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                dialog.show();
            }
        });

    }
}
