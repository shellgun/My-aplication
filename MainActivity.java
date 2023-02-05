package com.example.myapplication32;

import static com.example.myapplication32.R.id.txt3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    tickets tickets =new tickets( 70, 9);
    tickets ticketChild=new ticketChild( 70, 11, 50 );
    tickets ticketPensioner = new ticketPensioner ( 70,5,30 );
     private TextView txt ;
    private TextView txt2 ;
    private TextView txt3 ;
    private TextView txt6 ;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        txt=findViewById (R.id.txt);
        txt2=findViewById (R.id.txt2);
        txt3=findViewById (R.id.txt3);
        txt6=findViewById (R.id.txt6);

        String s = (tickets.ticketPriceAll ( )) + "монет";
        txt.setText ((tickets.ticketPriceAll ())+"монет");

        String a=(ticketChild.ticketPriceAll ())+"монет";
        txt2.setText((ticketChild.ticketPriceAll ())+"монет");
        String v=(ticketPensioner.ticketPriceAll ())+"монет";
        txt3.setText ((ticketPensioner.ticketPriceAll ())+"монет");
        String x=(tickets.ticketPriceAll ()+ticketChild.ticketPriceAll ()+ticketPensioner.ticketPriceAll ())+"монет";

        txt6.setText ((tickets.ticketPriceAll ()+ticketChild.ticketPriceAll ()+ticketPensioner.ticketPriceAll ())+"монет");


    }
}