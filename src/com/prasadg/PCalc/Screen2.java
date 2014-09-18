package com.prasadg.PCalc;

import android.app.Activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by prasad on 9/19/14.
 */
public class Screen2 extends Activity implements View.OnClickListener{

    String num="",numtemp="";
    Double num1=0.0,num2=0.0;
    Character s=new Character(' ');


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        //TextView display= (TextView) findViewById(R.id.txtDisplay);
        //display.setText(num);

        Button b0= (Button) findViewById(R.id.btn0);
        b0.setOnClickListener((android.view.View.OnClickListener) this);

        Button b1= (Button) findViewById(R.id.btn1);
        b1.setOnClickListener((android.view.View.OnClickListener) this);

        Button b2= (Button) findViewById(R.id.btn2);
        b2.setOnClickListener((android.view.View.OnClickListener) this);

        Button b3= (Button) findViewById(R.id.btn3);
        b3.setOnClickListener((android.view.View.OnClickListener) this);

        Button b4= (Button) findViewById(R.id.btn4);
        b4.setOnClickListener((android.view.View.OnClickListener) this);

        Button b5= (Button) findViewById(R.id.btn5);
        b5.setOnClickListener((android.view.View.OnClickListener) this);

        Button b6= (Button) findViewById(R.id.btn6);
        b6.setOnClickListener((android.view.View.OnClickListener) this);

        Button b7= (Button) findViewById(R.id.btn7);
        b7.setOnClickListener((android.view.View.OnClickListener) this);

        Button b8= (Button) findViewById(R.id.btn8);
        b8.setOnClickListener((android.view.View.OnClickListener) this);

        Button b9= (Button) findViewById(R.id.btn9);
        b9.setOnClickListener((android.view.View.OnClickListener) this);

        Button bdec= (Button) findViewById(R.id.btnDec);
        bdec.setOnClickListener((android.view.View.OnClickListener) this);

        Button bcl= (Button) findViewById(R.id.btnClear);
        bcl.setOnClickListener((android.view.View.OnClickListener) this);

        Button ba= (Button) findViewById(R.id.btnAdd);
        ba.setOnClickListener((android.view.View.OnClickListener) this);

        Button be= (Button) findViewById(R.id.btnEqual);
        be.setOnClickListener((android.view.View.OnClickListener) this);

        Button bdiv= (Button) findViewById(R.id.btnDiv);
        bdiv.setOnClickListener((android.view.View.OnClickListener) this);

        Button bsub= (Button) findViewById(R.id.btnSub);
        bsub.setOnClickListener((android.view.View.OnClickListener) this);

        Button bsign= (Button) findViewById(R.id.btnSign);
        bsign.setOnClickListener((android.view.View.OnClickListener) this);

        Button bmul= (Button) findViewById(R.id.btnMulti);
        bmul.setOnClickListener((android.view.View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn0)
            num=num+"0";

        if(v.getId()==R.id.btn1)
            num=num+"1";

        if(v.getId()==R.id.btn2)
            num=num+"2";

        if(v.getId()==R.id.btn3)
            num=num+"3";

        if(v.getId()==R.id.btn4)
            num=num+"4";

        if(v.getId()==R.id.btn5)
            num=num+"5";

        if(v.getId()==R.id.btn6)
            num=num+"6";

        if(v.getId()==R.id.btn7)
            num=num+"7";

        if(v.getId()==R.id.btn8)
            num=num+"8";


        if(v.getId()==R.id.btn9)
            num=num+"9";

        if(v.getId()==R.id.btnDec)
            num=num+".";

        if(v.getId()==R.id.btnClear) {
            num = numtemp = "";
            num1=num2=0.0;
            s=' ';
        }

        if((v.getId()==R.id.btnAdd)&&(!num.equals(""))) {
            s='+';
            numtemp=num;
            num1=Double.parseDouble(num);
            num = "";

        }


        if((v.getId()==R.id.btnSub)&&(!num.equals(""))) {
            s='-';
            numtemp=num;
            num1=Double.parseDouble(num);
            num = "";

        }


        if((v.getId()==R.id.btnDiv)&&(!num.equals(""))) {
            s='/';
            numtemp=num;
            num1=Double.parseDouble(num);
            num = "";

        }


        if((v.getId()==R.id.btnMulti)&&(!num.equals(""))) {
            s='*';
            numtemp=num;
            num1=Double.parseDouble(num);
            num = "";

        }


        if((v.getId()==R.id.btnSign)&&(num1!=0.0)) {
            num1=Double.parseDouble(num);
            num1=(-1)*num1;
            num=(num1).toString();

        }

        if((v.getId()==R.id.btnEqual)&&(!num.equals(""))) {
            switch (s) {
                case '+':
                    num2 = Double.parseDouble(num);
                    num1 = num1 + num2;
                    num = num1.toString();
                    break;

                case '-':
                    num2 = Double.parseDouble(num);
                    num1 = num1 - num2;
                    num = num1.toString();
                    break;

                case '/':
                    num2 = Double.parseDouble(num);
                    num1 = num1 / num2;
                    num = num1.toString();
                    break;

                case '*':
                    num2 = Double.parseDouble(num);
                    num1 = num1 * num2;
                    num = num1.toString();
                    break;


            }
            s = ' ';
            numtemp="";
        }


        TextView display= (TextView) findViewById(R.id.txtDisplay);
        if(!numtemp.equals(""))
            display.setText(numtemp+s+num);
        else
            display.setText(num);


    }
}
