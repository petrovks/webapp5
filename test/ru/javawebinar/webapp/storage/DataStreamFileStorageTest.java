package ru.javawebinar.webapp.storage;

/**
 * GKislin
 * 09.01.2015.
 */
public class DataStreamFileStorageTest extends AbstractStorageTest {
    {
        storage = new DataStreamFileStorage("./file_storage");
    }
}
