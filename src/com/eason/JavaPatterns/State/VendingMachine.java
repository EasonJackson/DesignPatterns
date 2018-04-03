package com.eason.JavaPatterns.State;

public class VendingMachine {
    private State state;
    private NoCoinInserted noCoinInserted;
    private NoSelection noSelection;
    private PaidSelected paidSelected;

    VendingMachine() {
        this.noCoinInserted = new NoCoinInserted(this);
        this.noSelection = new NoSelection(this);
        this.paidSelected = new PaidSelected(this);
        this.state = noCoinInserted;
    }

    void insertCoin() {
        this.state.insertCoin();
    }

    void selectItem() {
        this.state.selectItem();
    }

    void transact() {
        this.state.transect();
    }

    public void changeFromNoCoinToNoSelectionState() {
        if (state instanceof NoCoinInserted) {
            state = this.noSelection;
        }
    }

    public void changeFromNoSelectionToPaidSelected() {
        if (state instanceof NoSelection) {
            state = this.paidSelected;
        }
    }

    public void changeFromPaidSelectedToOrigin() {
        state = this.noCoinInserted;
    }
}
