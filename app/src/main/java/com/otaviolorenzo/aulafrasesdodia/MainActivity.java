package com.otaviolorenzo.aulafrasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Atributo
    String[] frases = {
            "Riqueza não começa na carteira, começa na mente",
            "Quem planta disciplina, colhe liberdade financeira",
            "O dinheiro corre para quem resolve problemas, não para quem foge deles",
            "A riqueza é consequência de valor entregue ao mundo",
            "Sonhar é grátis, mas enriquecer custa foco, ação e consistência",
            "Se você não trabalhar pelos seus sonhos, trabalhará pelos sonhos de quem trabalhou pelos deles",
            "O dinheiro não some, ele apenas muda de mãos — que seja para as suas",
            "A diferença entre quem enriquece e quem não enriquece está nas decisões diárias, não em sorte",
            "Invista mais em conhecimento do que em ostentação, e a riqueza será inevitável",
            "O dinheiro é um reflexo do valor que você gera para o mundo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrases (View view){

    }

    public void exibirTodas (View view){

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for (String frase : frases ) {
            textoResultado = textoResultado + frase + "\n";
        }
        texto.setText( textoResultado);
    }
}