package com.debuggeando_ideas.interfaces;

import java.util.List;

public interface DatabaseService<T> {


    T getById(Long id);

    List<T> getAllRecords();
}
