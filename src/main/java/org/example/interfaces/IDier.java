package org.example.interfaces;

import org.example.parents.Dier;

public interface IDier<T extends Dier> {
    void eet(T dier);
}
