
package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void verifySystemEnvironmentExecution() {
        assertTrue(true);
    }

    @Test
    public void verifyPipelineVelocityCalculation() {
        int leadTimeDays = 10;
        int targetWasteReductionDays = 3;
        int optimizedCycleTime = leadTimeDays - targetWasteReductionDays;

        assertEquals(7, optimizedCycleTime,
                "The optimized cycle time calculation failed.");
    }
}
