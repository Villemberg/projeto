package org.jean.villemberg.personagens;

import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Widgets
    private Button btnUrro;
    private Button btnGalvao;
    private Button btnHora;
    private Button btnDarth;
    private Button btnAlahu;
    private Button btnNigga;
    private Button btnTurn;
    private Button btnWin;
    private Button btnWombo;
    private Button btnApplause;
    private Button btnRisada;
    private Button btnErrou;
    private Button btnCadastre;
    //MediaPlayer
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias
        btnUrro = (Button) findViewById(R.id.btnUrro);
        btnGalvao  = (Button) findViewById(R.id.btnGalvao);
        btnHora = (Button) findViewById(R.id.btnHora);
        btnDarth = (Button) findViewById(R.id.btnDarth);
        btnAlahu = (Button) findViewById(R.id.btnAlahu);
        btnNigga = (Button) findViewById(R.id.btnNigga);
        btnTurn = (Button) findViewById(R.id.btnTurn);
        btnWin = (Button) findViewById(R.id.btnWin);
        btnWombo = (Button) findViewById(R.id.btnWombo);
        btnApplause = (Button) findViewById(R.id.btnApplause);
        btnRisada = (Button) findViewById(R.id.btnRisada);
        btnErrou = (Button) findViewById(R.id.btnErrou);
        btnCadastre = (Button) findViewById(R.id.btnCadastre);
        //________________________________________________________________________
        btnCadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Cadastrou? só que não ",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.fail);
            }
        });
        btnErrou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Errou",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.errou);
            }
        });
        btnRisada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Risadas",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.risada);
            }
        });
        btnApplause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Aplausos",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.applause);
            }
        });
        btnWombo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"Wombo Combo",Toast.LENGTH_LONG).show();
            stop(view);
            play(view, R.raw.wombo);
        }
    });
        btnWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"REFLITAO",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.winxp);
            }
        });
        btnTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"TURN DOWN FOR WHAT",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.turndow);
            }
        });
        btnNigga.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"NIGGA NIGGA NIGGA",Toast.LENGTH_LONG).show();
            stop(view);
            play(view, R.raw.nigga);
        }
    });
        btnAlahu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Alahuu akbarr!",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.alahu);
            }
        });
        btnDarth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Noooo",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.nooo);
            }
        });
        btnUrro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Urro",Toast.LENGTH_LONG).show();
                stop(view);
                play(view, R.raw.fazourro);
            }
        });

        btnUrro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Faz o Urro",Toast.LENGTH_LONG).show();
                stop(view);
                play(view,R.raw.fazourro);
            }
        });
        btnGalvao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Galvao: Acabooouu",Toast.LENGTH_LONG).show();
                stop(view);
                play(view,R.raw.acabou);
            }
        });
        btnHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Hora do show",Toast.LENGTH_LONG).show();
                stop(view);
                play(view,R.raw.horadoshow);
            }
        });

    }//fecha onCreate

    public void play(View v, int som){
        try {
                    mp = MediaPlayer.create(getBaseContext(), som);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                    });
                    mp.start();

        }catch (Exception e){
        }
    }

    public void stop(View v){
        try {
            mp.stop();
        }catch (Exception e){
        }
    }

}//fecha MainActivity
