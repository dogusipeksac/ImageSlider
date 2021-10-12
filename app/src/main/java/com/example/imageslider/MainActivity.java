package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider=findViewById(R.id.image_slider);
        ArrayList<SlideModel> images=new ArrayList<>();
        images.add(new SlideModel(R.drawable.a1,null));
        images.add(new SlideModel("https://1.bp.blogspot.com/-x1E72Y5rfWg/YIbqR7W1CVI/AAAAAAAAgkw/PrKeWKYOyuMm6t3l_hL6fcjX9u8xBHV1ACLcBGAsYHQ/s960/01.jpg","Load From URL",null));
        images.add(new SlideModel(R.drawable.a3,null));
        images.add(new SlideModel(R.drawable.a4,null));
        imageSlider.setImageList(images, ScaleTypes.CENTER_CROP);
        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                Toast.makeText(MainActivity.this, "Selected"+i+"selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}