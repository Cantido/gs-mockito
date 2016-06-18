public class AnnotationsAnatomy {
  @Rule public MockitoRule mockito = MockitoJUnit.rule(); // <1>

  @InjectMocks AccountServiceTest service; // <2>
  @Mock AccountRepository repository; // <3>
  @Mock Account account;
  
  @Before
  public void setUp() {
    whhen(repository.getAccount()).thenReturn(account) // <4>
  }
}
