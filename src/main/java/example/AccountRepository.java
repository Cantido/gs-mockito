package example;

import javax.sql.DataSource;

public class AccountRepository {
  private final DataSource dataSourceDependency;

  /**
   * The constructor we will use during unit tests.
   */
  public AccountRepository(DataSource dataSource) {
    this.dataSourceDependency = dataSource;
  }

  /**
   * The constructor we will use in production.
   */
  public AccountRepository() {
    this.dataSourceDependency = acquireRealDataSource();
  }

  private DataSource acquireRealDataSource() {
    // Some code that only works in a production environment
    return null;
  }

  public Account getAccount() {
    return null;
  }
}
