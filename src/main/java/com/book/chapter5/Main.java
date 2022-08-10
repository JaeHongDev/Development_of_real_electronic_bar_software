package com.book.chapter5;

public class Main {
    public static void main(final String...args){

        final var businessRuleEngine = new BusinessRuleEngine();
        businessRuleEngine.addAction(new Action(){
            @Override
            public void perform(){
                if("CEO".equals())
            }
        });
    }
}
