public class DataService implements DataStorage{

    private DataStorage dataStorage;

    // Inyección de dependencia a través del constructor
    public DataService(DataStorage dataStorage){
        this.dataStorage = dataStorage;
    }

    @Override
    public void save(String data) {
        dataStorage.save(data);
    }
}
