package alexida.moonrobots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private ListView messageListView;
    private ListAdapter messageListAdapter;
    private List<String> messageList = new ArrayList<>();
    private Spinner actionSpinner;
    private List<String> actionList = new ArrayList<>();
    private ArrayAdapter actionListAdapter;
    private Button actionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // UI init
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageListView = findViewById(R.id.message_list);
        messageListAdapter = new ArrayAdapter<>(this, R.layout.list_item, messageList);
        messageListView.setAdapter(messageListAdapter);
        actionSpinner = findViewById(R.id.action_spinner);
        actionListAdapter = new ArrayAdapter(this, R.layout.list_item, actionList);
        actionSpinner.setAdapter(actionListAdapter);
        actionButton = findViewById(R.id.action_button);
        // Game start
        ChatManager chatManager = new ChatManager(this);
        chatManager.start();
    }

    public ListView getMessageListView() {
        return messageListView;
    }

    public ListAdapter getMessageListAdapter() {
        return messageListAdapter;
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public Spinner getActionSpinner() {
        return actionSpinner;
    }

    public Button getActionButton() {
        return actionButton;
    }

    public List<String> getActionList() {
        return actionList;
    }

    public ArrayAdapter getActionListAdapter() {
        return actionListAdapter;
    }
}
