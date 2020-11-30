package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progress;
    private EditText userId, passwordId;
    private String user, pass;
    private TextView txt_V;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress = (ProgressBar)findViewById(R.id.pb);
        btn = (Button)findViewById(R.id.btn);

        txt_V = (TextView)findViewById(R.id.txtError);

        userId = (EditText)findViewById(R.id.txtUser);
        passwordId = (EditText)findViewById(R.id.txtPass);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = userId.getText().toString();
                pass = passwordId.getText().toString();

                if (user.equalsIgnoreCase("android") && pass.equals("123"))
                {


                    new Task().execute();


                }

                else
                {
                    Toast.makeText(getBaseContext(),"Error al ingresar sus datos",Toast.LENGTH_SHORT).show();
                    //txt_V.setText("Error al ingresar sus datos");

                }
            }
        });


        progress.setVisibility(View.INVISIBLE);
    }

    class Task extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {

            progress.setVisibility(View.VISIBLE);
        }


        @Override
        protected String doInBackground(String... strings) {


            for(int i = 1; i < 10; i++)
            {
                try {

                    Thread.sleep(300);

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }


        @Override
        protected void onPostExecute(String s) {

            progress.setVisibility(View.INVISIBLE);

            Intent i = new Intent(getBaseContext(), Home_Act.class);
            startActivity(i);

        }

    }
}