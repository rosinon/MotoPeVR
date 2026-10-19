
package com.motopevr;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.rgb(18, 24, 38));

        TextView titulo = new TextView(this);
        titulo.setText("MotoPe VR");
        titulo.setTextSize(32);
        titulo.setTextColor(Color.WHITE);
        titulo.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText(
            "\nControle de movimento VR\n\n" +
            "Projeto iniciado!\n\n" +
            "Próxima etapa:\n" +
            "Conectar e testar os controles."
        );
        status.setTextSize(18);
        status.setTextColor(Color.LTGRAY);
        status.setGravity(Gravity.CENTER);

        layout.addView(titulo);
        layout.addView(status);

        setContentView(layout);
    }
}
