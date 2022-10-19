package L04_InterfacesAndAbstraction_Labs_P04_SayHelloExtended;


public class Chinese extends BasePerson{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "你好";
    }
}
