package com.example.laptophome.homework21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 public  int i;
    public String x="X",o="O";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=0;
        TextView txt1=(TextView)findViewById(R.id.textView);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        TextView btn1=(TextView)findViewById(R.id.btn1);
        TextView btn2=(TextView)findViewById(R.id.btn2);
        TextView btn3=(TextView)findViewById(R.id.btn3);
        TextView btn4=(TextView)findViewById(R.id.btn4);
        TextView btn5=(TextView)findViewById(R.id.btn5);
        TextView btn6=(TextView)findViewById(R.id.btn6);
        TextView btn7=(TextView)findViewById(R.id.btn7);
        TextView btn8=(TextView)findViewById(R.id.btn8);
        TextView btn9=(TextView)findViewById(R.id.btn9);
    }

    public void clean()
    {
        TextView txt1=(TextView)findViewById(R.id.textView);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        TextView btn1=(TextView)findViewById(R.id.btn1);
        TextView btn2=(TextView)findViewById(R.id.btn2);
        TextView btn3=(TextView)findViewById(R.id.btn3);
        TextView btn4=(TextView)findViewById(R.id.btn4);
        TextView btn5=(TextView)findViewById(R.id.btn5);
        TextView btn6=(TextView)findViewById(R.id.btn6);
        TextView btn7=(TextView)findViewById(R.id.btn7);
        TextView btn8=(TextView)findViewById(R.id.btn8);
        TextView btn9=(TextView)findViewById(R.id.btn9);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txt1.setText("");
    }
    public void Click(View view)
    {

        TextView txt1=(TextView)findViewById(R.id.textView);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        TextView btn1=(TextView)findViewById(R.id.btn1);
        TextView btn2=(TextView)findViewById(R.id.btn2);
        TextView btn3=(TextView)findViewById(R.id.btn3);
        TextView btn4=(TextView)findViewById(R.id.btn4);
        TextView btn5=(TextView)findViewById(R.id.btn5);
        TextView btn6=(TextView)findViewById(R.id.btn6);
        TextView btn7=(TextView)findViewById(R.id.btn7);
        TextView btn8=(TextView)findViewById(R.id.btn8);
        TextView btn9=(TextView)findViewById(R.id.btn9);





        if(i%2==0)
        {
            ((Button)view).setText(x);
            txt1.setText("tic tac toe");
            txt2.setText("");


        }
        else
        {
            ((Button)view).setText(o);
            txt1.setText("tic tac toe");
            txt2.setText("");
        }

        i++;




        if(btn1.getText()==o && btn2.getText()==o && btn3.getText()==o)
        {
            txt2.setText("O  Win, X  lose");
            i=0;
            clean();
        }
        if(btn1.getText()==o && btn4.getText()==o&& btn7.getText()==o)
        {
            txt2.setText("O  Win , X  lose");
            i=0;
            clean();
        }
        if(btn1.getText()==o && btn5.getText()==o && btn9.getText()==o)
        {
            txt2.setText("O  Win , X  lose");
            i=0;
            clean();
        }
        if(btn2.getText()==o && btn5.getText()==o && btn8.getText()==o)
        {
            txt2.setText("O  Win , X  lose");
            i=0;
            clean();
        }
        if(btn3.getText()==o&& btn6.getText()==o && btn9.getText()==o)
        {
            txt2.setText("O  Win , X  lose");
            i=0;
            clean();
        }
        if(btn3.getText()==o && btn5.getText()==o && btn7.getText()==o)
        {
            txt2.setText("O  Win , X  lose");
            i=0;
            clean();
        }


        if(btn4.getText()==o && btn5.getText()==o && btn6.getText()==o)
        {
            txt2.setText("O  Win , X  lose");
            i=0;
            clean();
        }
        if(btn7.getText()==o && btn8.getText()==o && btn9.getText()==o)
        {
            txt2.setText("O  Win , X  lose");
            i=0;
            clean();
        }


        if(btn1.getText()==x && btn5.getText()==x && btn9.getText()==x)
        {
            txt2.setText("X  Win , O  lose");
            i=0;
            clean();
        }


        if(btn1.getText()==x && btn4.getText()==x && btn7.getText()==x)
        {
            txt2.setText("X  Win , O  lose");
            i=0;
            clean();
        }



        if(btn2.getText()==x && btn5.getText()==x && btn8.getText()==x)
        {
            txt2.setText("X  Win , O  lose");
            i=0;
            clean();
        }



        if(btn3.getText()==x && btn6.getText()==x && btn9.getText()==x)
        {
            txt2.setText("X  Win , O  lose");
            i=0;
            clean();
        }




        if(btn3.getText()==x && btn5.getText()==x && btn7.getText()==x)
        {
            txt2.setText("X  Win , O  lose");
            i=0;
            clean();
        }
        if(btn1.getText()==x && btn2.getText()==x && btn3.getText()==x)
        {
            txt2.setText("X  Win, O  lose");
            i=0;
            clean();

        }
        if(btn4.getText()==x && btn5.getText()==x && btn6.getText()==x)
        {
            txt2.setText("X  Win , O  lose");
            i=0;
            clean();
        }


        if(btn7.getText()==x && btn8.getText()==x && btn9.getText()==x)
        {
            txt2.setText("X  Win , O  lose");
            i=0;
            clean();
        }




        if(i==9)
        {
            i=0;
            txt1.setText("tic tac toe");
            txt2.setText("No winner");
            clean();
        }



    }
}
