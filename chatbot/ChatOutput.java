package chatbot;

public enum ChatOutput {
}
//plan subscription layer 0:
enum Layer1{
    OUTPUT("HI WELCOME TO NETFLIX  \nChoose your plan"),Exit("Bye Bye Buddy"),
CHOICE_1("1.Basic Plan"),CHOICE_2("2.PremiumPlan"),CHOICE_X(" EXIT 0   "),;
    private final String text;

    Layer1(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;

    }
}
//basic plan...
enum LayerA2{
    OUTPUT("Choose your Language Buddy"),
    CHOICE_1("1.English"),CHOICE_2("2.Tamil"),CHOICE_X(" EXIT 0 "),CHOICE_BACK("9.Back");
    private final String output;

    LayerA2(final String output) {

        this.output = output;
    }

    public String toString() {
        return output;

    }
}
//vip plan....
enum LayerB2{
        OUTPUT("Hey Buddy Choose the Language"),
        CHOICE_1("1.English"), CHOICE_2("2.Tamil"),CHOICE_3("3.Malayalam"), CHOICE_X("Exit 0"), CHOICE_BACK("9.Back");

        private final String output;

        LayerB2(final String output) {
            this.output = output;
        }

        public String toString() {
            return output;
        }
}
//basic AND vip.. english category.....
enum LayerA3{
    OUTPUT("Choose your Category"),
    CHOICE_1("1.Movies"),CHOICE_2("2.Web Series"),CHOICE_3("3.TV SHOWS"),CHOICE_X(" EXIT 0 "),CHOICE_BACK("9.Back");
    private final String output;

    LayerA3(final String output) {

        this.output = output;
    }

    public String toString() {
        return output;

    }
}
//basic .and vip plan....tamil category page3 <
enum LayerB3{
    OUTPUT("கீழே உள்ளதை தேர்வு செய்யவும்"),
    CHOICE_1("1.திரைப்படம்"),CHOICE_2("2.இணையத் தொடர்கள்"),CHOICE_3("3.தொலைக்காட்சி நிகழ்ச்சிகள்"),CHOICE_X(" வெளியேற 0 ஐ அழுத்தவும் "),CHOICE_BACK("9.திரும்பி செல்ல");
    private final String output;

    LayerB3(final String output) {

        this.output = output;
    }

    public String toString() {
        return output;

    }
}
