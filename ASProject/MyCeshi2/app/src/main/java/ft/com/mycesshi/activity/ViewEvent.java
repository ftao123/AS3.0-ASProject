package ft.com.mycesshi.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import ft.com.mycesshi.R;

public class ViewEvent extends AppCompatActivity {

    private static final String TAG = "ViewEvent";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_event);

        initViews();
        initEvents();
    }

    private void initViews() {
        button= (Button) findViewById(R.id.eventButton);
    }

    private void initEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"OnClick execute");
            }
        });

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Log.d(TAG,"onTouch,action:"+event.getAction());
                return true;
            }
        });
    }

}
