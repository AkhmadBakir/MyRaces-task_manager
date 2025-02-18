public class SubTask extends Task {

    private final int epicId;

    public SubTask(int id, String name, String description, TaskStatus status, TaskType type, int epicId) {
        super(id, name, description, status, type);
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    @Override
    public String toString() {
        return super.toString() + "," +  epicId;
    }

}
