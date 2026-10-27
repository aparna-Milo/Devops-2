package com.devops.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void verifySystemEnvironmentExecution() {

        // Assert true condition to validate core test execution engines
        assertTrue(true);
    }

    @Test
    public void verifyPipelineVelocityCalculation() {

        int leadTimeDays = 10;
        int targetWasteReductionDays = 3;
        int optimizedCycleTime = leadTimeDays - targetWasteReductionDays;

        // Assert structural business metric calculations
        assertEquals(7, optimizedCycleTime,
                "The optimized cycle time calculation failed.");
    }

    // New test for Lab 5: intentional failure
    @Test
    public void verifySystemBottleneckValidation() {
        boolean constraintDefectDetected = true;

        org.junit.jupiter.api.Assertions.assertFalse(
                constraintDefectDetected,
                "CRITICAL: System bottleneck or defect detected in value stream!"
        );
    }
}
