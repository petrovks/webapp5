package ru.javawebinar.webapp.storage;

/**
 * GKislin
 * 09.01.2015.
 */
public class SerializeFileStorageTest extends AbstractStorageTest {

    {
        storage = new SerializeFileStorage(FILE_STORAGE);
    }
}
