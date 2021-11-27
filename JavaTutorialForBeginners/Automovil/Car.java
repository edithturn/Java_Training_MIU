public class Car{

    private List<Wheel> whells = null;
    private List<Engine> engines = null;
    private List<Door> doors = null;

    public Car(){
        whells = new ArrayList();
        
        for (int i = 0; i < 4; i++){
            whells.add(new Wheel());
        }
        engines = new LinkedList();
        doors = new ArrayList();
        engines.add(new Engine());

        for (int i = 0; i < 5; i++){
            doors.add(new Door());
        }
    }

}