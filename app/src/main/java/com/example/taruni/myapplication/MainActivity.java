package com.example.taruni.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bs,bm,bd,bdot,bc,be,bdel;
    char op;
    float n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc();
    }
    public void calc(){
        n1=0;n2=0;
        op='n';
        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        bp=(Button)findViewById(R.id.bp);
        bs=(Button)findViewById(R.id.bs);
        bm=(Button)findViewById(R.id.bm);
        bd=(Button)findViewById(R.id.bd);
        bdot=(Button)findViewById(R.id.bdot);
        bc=(Button)findViewById(R.id.bc);
        be=(Button)findViewById(R.id.be);
        bdel=(Button)findViewById(R.id.bdel);
        e=(EditText)findViewById(R.id.editText);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+".");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op=='n'){
                    n1=Float.parseFloat(e.getText().toString());
                    e.setText("");
                    op='+';
                }
                else{
                    switch(op){
                        case '+':
                            n1=n1+Float.parseFloat(e.getText().toString());
                            break;
                        case '-':
                            n1=n1-Float.parseFloat(e.getText().toString());
                            break;
                        case '*':
                            n1=n1*Float.parseFloat(e.getText().toString());
                            break;
                        case '/':
                            n1=n1/Float.parseFloat(e.getText().toString());
                            break;
                    }
                    op='+';
                    e.setText("");  
                }

            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op=='n'){
                    n1=Float.parseFloat(e.getText().toString());
                    e.setText("");
                    op='-';
                }
                else{
                    switch(op){
                        case '+':
                            n1=n1+Float.parseFloat(e.getText().toString());
                            break;
                        case '-':
                            n1=n1-Float.parseFloat(e.getText().toString());
                            break;
                        case '*':
                            n1=n1*Float.parseFloat(e.getText().toString());
                            break;
                        case '/':
                            n1=n1/Float.parseFloat(e.getText().toString());
                            break;
                    }
                    op='-';
                    e.setText("");
                }

            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op=='n'){
                    n1=Float.parseFloat(e.getText().toString());
                    e.setText("");
                    op='*';
                }
                else{
                    switch(op){
                        case '+':
                            n1=n1+Float.parseFloat(e.getText().toString());
                            break;
                        case '-':
                            n1=n1-Float.parseFloat(e.getText().toString());
                            break;
                        case '*':
                            n1=n1*Float.parseFloat(e.getText().toString());
                            break;
                        case '/':
                            n1=n1/Float.parseFloat(e.getText().toString());
                            break;
                    }
                    op='*';
                    e.setText("");
                }

            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op=='n'){
                    n1=Float.parseFloat(e.getText().toString());
                    e.setText("");
                    op='/';
                }
                else{
                    switch(op){
                        case '+':
                            n1=n1+Float.parseFloat(e.getText().toString());
                            break;
                        case '-':
                            n1=n1-Float.parseFloat(e.getText().toString());
                            break;
                        case '*':
                            n1=n1*Float.parseFloat(e.getText().toString());
                            break;
                        case '/':
                            n1=n1/Float.parseFloat(e.getText().toString());
                            break;
                    }
                    op='/';
                    e.setText("");
                }

            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op=='n'){
                }
                else{
                    n2=Float.parseFloat(e.getText().toString());
                    switch(op){
                        case '+':
                            n1=n1+n2;
                            e.setText(String.valueOf(n1));
                            break;
                        case '-':
                            n1=n1-n2;
                            e.setText(String.valueOf(n1));
                            break;
                        case '*':
                            n1=n1*n2;
                            e.setText(String.valueOf(n1));
                            break;
                        case '/':
                            n1=n1/n2;
                            e.setText(String.valueOf(n1));
                            break;
                    }
                    n1=0;
                    n2=0;
                    op='n';

                }

            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText("");
                n1=0;
                n2=0;
                op='n';
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int len=e.getText().toString().trim().length();
                String str=e.getText().toString().trim();
                e.setText(str.substring(0,len-1));
            }
        });

    }
}
