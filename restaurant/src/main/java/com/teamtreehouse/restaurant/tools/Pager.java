package com.teamtreehouse.restaurant.tools;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.teamtreehouse.restaurant.tables.Status;
import com.teamtreehouse.restaurant.tables.Table;
import javafx.scene.control.Tab;

import java.nio.file.Paths;
import java.util.Observable;
import java.util.Observer;

public class Pager implements Observer {

    public Pager(Table table) {
        table.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Status status = (Status) arg;
        Table table = (Table) o;

        if (status == Status.AVAILABLE) {
            System.out.printf("BUZZZ...table #%d is ready %n", table.getPositionNumber());
        }
    }
}
