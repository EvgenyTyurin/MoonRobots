package alexida.moonrobots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class ChatActivity extends AppCompatActivity {

    private ListView messageList;
    private Spinner actionSpinner;
    private Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageList = findViewById(R.id.message_list);
        actionSpinner = findViewById(R.id.action_spinner);
        actionButton = findViewById(R.id.action_button);
    }
}
