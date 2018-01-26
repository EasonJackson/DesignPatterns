package com.eason.JavaPatterns.Composite;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by easonjackson on 1/25/18.
 */
public class CompositeMenu extends Component {

    private List<Component> componentList;

    CompositeMenu () {
        this.componentList = new ArrayList<>();
    }

    @Override
    public void changeColor(Color color) {
        for (Component component : this.componentList) {
            component.changeColor(color);
        }
    }

    @Override
    public void close() {

    }

    @Override
    public Component open() {
        return this;
    }

    protected void addComponentMenu(Component component) {
        this.componentList.add(component);
    }

    protected void removeComponentMeno(Component component) {
        try {
            this.componentList.remove(component);
        } catch (EnumConstantNotPresentException ex) {
            ex.printStackTrace();
        }
    }
}
