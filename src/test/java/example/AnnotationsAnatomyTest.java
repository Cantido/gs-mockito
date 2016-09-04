package example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class AnnotationsAnatomyTest {
  @Rule public MockitoRule mockito = MockitoJUnit.rule(); // <1>

  @InjectMocks AccountService service; // <2>
  @Mock AccountRepository repository; // <3>
  @Mock Account account;

  @Before
  public void setUp() {
    Mockito.when(repository.getAccount()).thenReturn(account); // <4>
  }
}
