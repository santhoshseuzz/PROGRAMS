package chatbot;

public class ChatBotData {
    private int choice;
    private int layer;

    public ChatBotData(int choice, int layer) {
        this.choice = choice;
        this.layer = layer;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }
}
