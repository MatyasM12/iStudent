import exams.domain.statistics.CountryStatistic;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import exams.service.Service;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;



@RunWith(MockitoJUnitRunner.class)
public class CountryStatisticTest {
    @Mock
    Service service;

    @InjectMocks
    CountryStatistic countryStatistic;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void generateStatisticTest() {
        List statistics = countryStatistic.getData();
        assertThat(statistics, is(notNullValue()));

    }

}