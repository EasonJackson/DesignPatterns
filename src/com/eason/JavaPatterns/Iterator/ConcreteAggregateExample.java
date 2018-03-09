package com.eason.JavaPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by easonjackson on 3/9/18.
 */
public class ConcreteAggregateExample implements Aggregate {

    List<ConcreteCollectionObj> collectionObjs;
    private IteratorInterface iter;

    ConcreteAggregateExample() {
        this.collectionObjs = new ArrayList<>();
        this.iter = new ConcreteAggregateIterator(this);
    }

    public void add(ConcreteCollectionObj obj) {
        this.collectionObjs.add(obj);
    }

    @Override
    public IteratorInterface iterator() {
        return this.iter;
    }
}
