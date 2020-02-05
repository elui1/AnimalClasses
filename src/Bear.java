public class Bear extends Animal {
    public Bear() {
        super();
        System.out.println("Now I am a Bear!");
    }

    @Override
    public String sleep() {
        return "A bear sleeps...";
    }

    @Override
    public String eat() {
        return "A bear eats...";
    }

    public String growl() {
        return "A bear growls...";
    }
}

