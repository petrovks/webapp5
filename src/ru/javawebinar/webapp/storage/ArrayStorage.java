package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.model.Resume;

import java.util.Arrays;
import java.util.List;
//import java.util.logging.Level;


/**
 * GKislin
 * 26.12.2014.
 */
public class ArrayStorage extends AbstractStorage<Integer> {
    private static final int LIMIT = 10000;

    private Resume[] array = new Resume[LIMIT];
    private int size = 0;

    @Override
    protected void doClear() {
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    protected boolean exist(Integer idx) {
        return idx != -1;
    }

    @Override
    protected void doUpdate(Integer idx, Resume r) {
        array[idx] = r;
    }

    @Override
    protected Resume doLoad(Integer idx) {
        return array[idx];
    }

    @Override
    protected void doDelete(Integer idx) {
        int numMoved = size - idx - 1;
        if (numMoved > 0)
            System.arraycopy(array, idx + 1, array, idx,
                    numMoved);
        array[--size] = null; // clear to let GC do its work
    }

    @Override
    protected void doSave(Integer ctx, Resume r) {
        array[size++] = r;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    protected Integer getContext(String uuid) {
        for (int i = 0; i < LIMIT; i++) {
            if (array[i] != null) {
                if (array[i].getUuid().equals(uuid)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    protected List<Resume> doGetAll() {
        return Arrays.asList(Arrays.copyOf(array, size));
    }
}
