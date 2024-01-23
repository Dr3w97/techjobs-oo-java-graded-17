package org.launchcode.techjobs.oo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    Job job1;
    Job job2;
    Job job3;
    Job job4;

    @Before
    public void setUp() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job3 = new Job();
        job4 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(job1.getId(), job2.getId());
        System.out.println(job1.getId());
        System.out.println(job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job1 instanceof Job);
    }
    @Test
    public void testJobsForEquality() {
        assertFalse(job3.equals(job4));
    }
    @Test
    public void  testToStringStartsAndEndsWithNewLine() {
        String newLine = System.lineSeparator();
        String testJob = job1.toString();
//        Fails due to line separator differences
//        assertEquals(newLine, String.valueOf(testJob.charAt(0)));
//        assertEquals(newLine, String.valueOf(testJob.charAt(testJob.length() - 1)));
        assertTrue(testJob.startsWith(newLine));
        assertTrue(testJob.endsWith(newLine));
    }    @Test
    public void  testToStringContainsCorrectLabelsAndData() {
        String newLine = System.lineSeparator();
        String testJob = job1.toString();
        String answer = newLine +
                "ID: " + job1.getId() + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Desert" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Persistence" + newLine;
        assertEquals(answer, testJob);
    }
    @Test
    public void testToStringHandlesEmptyField() {
        String testJob = job3.toString();
        String newLine = System.lineSeparator();
        assertTrue(testJob.equals(newLine + "Oops this job doesn't exist" + newLine));
    }
}
