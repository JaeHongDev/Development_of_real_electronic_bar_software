package com.book.chapter5;

import java.util.List;

public class BusinessRuleEngine {
    private final List<Action> actions;

    public BusinessRuleEngine(List<Action> actions) {
        this.actions = actions;
    }

    public void addAction(final Action action) {
        this.actions.add(action);
    }

    public int count() {
        return this.actions.size();
    }

    public void run(){
        this.actions.forEach(Action::perform);
        throw new UnsupportedOperationException();
    }


}
