package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class VideoViewActivity extends AppCompatActivity {


    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        Button buttonVoltar7 = findViewById(R.id.buttonVoltar7);
        buttonVoltar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(VideoViewActivity.this, MainActivity.class);
                startActivity(it);
            }
        });

        VideoView videoView = findViewById(R.id.telaVideoView);
        String VideoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoplay;
        Uri uri = Uri.parse(VideoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
    }

