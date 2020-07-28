package alexida.moonrobots;

public class ChatManager {
    final ChatActivity chatActivity;

    public ChatManager(ChatActivity chatActivity) {
        this.chatActivity = chatActivity;
    }

    public void start() {
        chatActivity.getMessageList().add("Alex: I'm at base entrance, but hatch is closed");
        chatActivity.getMessageListView().invalidateViews();
        chatActivity.getActionList().add("Look for another entrance");
        chatActivity.getActionList().add("Test");
        chatActivity.getActionSpinner().postInvalidate();
    }

}
