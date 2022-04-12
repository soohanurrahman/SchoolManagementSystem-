package AlternativeService;


public class CounterServiceMsg extends RegulationServices {

    @Override
    public void greeting_msg() {
        System.out.println("Welcome to our Calculator System");
    }

    @Override
    public void terminate_msg() {
        System.out.println("Terminating Calculator System");
    }

    @Override
    public void service_info()
    {
        System.out.println(
                "\nCounter Services: \n" +
                        "# 1 Add\n" +
                        "# 2 Sub\n" +
                        "# 3 Multiply\n" +
                        "# 4 Division\n" +
                        "# 0 Terminate\n"
        );
    }
}