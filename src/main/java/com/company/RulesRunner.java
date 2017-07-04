package com.company;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RulesRunner {

    @EventListener(classes = ApplicationReadyEvent.class)
    public void runRules() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        StatelessKieSession kieSession = kieContainer.newStatelessKieSession();

        kieSession.execute(new Object());
    }
}
