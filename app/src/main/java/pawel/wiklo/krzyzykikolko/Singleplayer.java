package pawel.wiklo.krzyzykikolko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Singleplayer extends AppCompatActivity {

    int kogoRunda = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);
    }

    public void one(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        //one.setImageResource(R.drawable.zielony);
        core( imageButton);
    }

    public void two(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton2);
        //one.setImageResource(R.drawable.zielony);
        core( imageButton);
    }

    public void three(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton3);
        core( imageButton);
    }

    public void four(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton4);
        core( imageButton);
    }

    public void five(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton5);
        core( imageButton);
    }

    public void six(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton6);
        core( imageButton);
    }

    public void seven(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton7);
        core( imageButton);
    }

    public void eight(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton8);
        core( imageButton);
    }

    public void nine(View view) {
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton9);
        core( imageButton);
    }


    public void core(ImageButton imageButton)
    {
        if(kogoRunda%2==0)
        {
            imageButton.setImageResource(R.drawable.zielony);
        }
        else
        {
            imageButton.setImageResource(R.drawable.czerwony);
        }
        kogoRunda++;
        imageButton.setEnabled(false);

    }
}
