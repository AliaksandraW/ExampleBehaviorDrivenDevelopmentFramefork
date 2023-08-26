Feature: user shouldn't login with invalid credentials

  Scenario Outline: Login with different invalid credentials
    Given User on the Amazon website
    When the user login with given credentials from "<SheetName>" and <RowNumber>
    Then the user should see notice about incorrect login or password

    Examples:
    |SheetName|RowNumber|
    |User1    |1        |
    |User2    |2        |
    |User3    |3        |
    |User4    |4        |
    |User5    |5        |
