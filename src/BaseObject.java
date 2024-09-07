public class BaseObject {
    Integer id;

    static Integer counter = 0;

    void assignNewId() {
        id = getNextId();
    }

    static Integer getNextId() {
        counter++;
        return counter;
    }
}
