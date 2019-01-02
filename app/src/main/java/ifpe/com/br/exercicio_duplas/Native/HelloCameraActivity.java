package ifpe.com.br.exercicio_duplas.Native;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import ifpe.com.br.exercicio_duplas.R;

public class HelloCameraActivity extends AppCompatActivity {



    ImageView imageViewFoto;
    Button  btAbrirCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helo_camera);

        imageViewFoto = (ImageView) findViewById(R.id.imageViewFoto);
        btAbrirCamera = (Button) findViewById(R.id.btAbrirCamera);

        btAbrirCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, 0);
            }
        });
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
            super.onActivityResult(requestCode, resultCode, data);

             if(data != null){
                 Bundle bundle = data.getExtras();

                 if (bundle != null){
                     Bitmap bitmap =(Bitmap) bundle.get("data");
                     //atualizar a imagem
                     imageViewFoto.setImageBitmap(bitmap);
                 }
             }
        }

    }

