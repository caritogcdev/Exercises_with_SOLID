public class Database implements DataStorage{

    private String data;

    public Database(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void save(String data) {
        // Lógica para guardar datos en la base de datos
    }
}
