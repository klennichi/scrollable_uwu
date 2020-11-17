package meandrick.martin.front_page_risaikuru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

class front_page_scrollable extends AppCompatActivity {
    //the Image buttons.
    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page_scrollable);
        imageButton =(ImageButton) findViewById(R.id.imageButton);
        imageButton2 =(ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    //this will call the file
    public void openActivity2(){
        Intent intent = new Intent(this, bottle_second_page.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, paper_second_page.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, cans_second_page.class);
        startActivity(intent);
    }
}