package com.company;



public interface RunCommand<T> extends Command<T> {
    void run();
}
