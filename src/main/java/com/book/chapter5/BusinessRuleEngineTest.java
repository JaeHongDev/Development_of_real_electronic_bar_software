package com.book.chapter5;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.swing.*;

public class BusinessRuleEngineTest {

    @Test
    public void shouldHaveNoRulesInitially(){
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        Assert.assertEquals(0,businessRuleEngine.count());
    }

    @Test
    public void shouldAddTwoActions(){
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        businessRuleEngine.addAction(()->{});
        businessRuleEngine.addAction(()->{});

        Assert.assertEquals(2,businessRuleEngine.count());
    }

    @Test
    public void shouldExecuteOneAction(){
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        final Action mockAction = Mockito.mock(Action.class);

        businessRuleEngine.addAction(mockAction);
        businessRuleEngine.run();

        Mockito.verify(mockAction).execute();
    }
}
