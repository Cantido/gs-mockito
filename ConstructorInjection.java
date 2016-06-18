public class ConstructorInjection {
  private final DataSource dataSourceDependency;
  
  /**
   * The constructor we will use during unit tests.
   */
  public ConstructorInjection(DataSource dataSource) {
    this.dataSourceDependency = dataSource;
  }
  
  /**
   * The constructor we will use in production.
   */
  public ConstructorInjection() {
    this.dataSourceDependency = acquireRealDataSource();
  }
}
