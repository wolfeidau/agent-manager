package au.id.wolfe.am.server.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static junit.framework.Assert.assertEquals;


/**
 * Test the agent domain object validation
 */
public class AgentTest {

    final Logger logger = LoggerFactory.getLogger(AgentTest.class);

    Validator validator;

    @Before
    public void setUp() throws Exception {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testShouldBeInvalidWithEmptyAttributes() {
        Agent newAgent = new Agent();

        Set<ConstraintViolation<Agent>> constraintViolations = validator.validate(newAgent);

        logger.info("constraintViolations size = " + constraintViolations.size());

        assertEquals(3, constraintViolations.size());
        assertEquals("may not be null", constraintViolations.iterator().next().getMessage());
        assertEquals("may not be null", constraintViolations.iterator().next().getMessage());
        assertEquals("may not be null", constraintViolations.iterator().next().getMessage());
    }
}
