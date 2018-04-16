/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private static int counter = 0;

    void clear() {
        for (int i = 0; i < counter; i++)
            storage[i] = null;
        counter = 0;
    }

    void save(Resume r) {
        storage[counter] = r;
        counter++;
    }

    Resume get(String uuid) {
        for (int i = 0; i < counter; i++)
            if(storage[i].uuid.equals(uuid))
                return storage[i];
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < counter; i++)
            if(storage[i].uuid.equals(uuid))
                storage[i] = storage[counter--];


    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return new Resume[counter];
    }

    int size() {
        return counter;
    }
}
