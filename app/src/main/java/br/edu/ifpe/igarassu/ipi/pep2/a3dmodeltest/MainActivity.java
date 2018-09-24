package br.edu.ifpe.igarassu.ipi.pep2.a3dmodeltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.startActivity(new Intent(this, OBJ3DTest.class));
    }
}
