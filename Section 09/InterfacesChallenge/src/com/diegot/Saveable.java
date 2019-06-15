package com.diegot;

import java.util.List;

/**
 * Created by DiegoT on 11/06/2019.
 */
public interface Saveable {

    List<String> write();
    void read(List<String> savedValues);
}
