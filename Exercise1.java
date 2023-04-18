public class App {

    static boolean IwillReview = true;
    static boolean IwillNotFail = true;
    public static void main(String[] args) throws Exception {

        App myApp = new App();
        
        // precondition
        assert IwillReview == true: "Ouch!";

        myApp.Study();

        System.out.println(IwillReview);

        // postcondition
        assert IwillNotFail == true: "I failed this time";


    }

    void Study(){
        IwillReview = false;
        IwillNotFail = false;

    }

    }
