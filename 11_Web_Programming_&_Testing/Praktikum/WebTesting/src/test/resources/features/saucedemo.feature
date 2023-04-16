@SauceDemo

Feature: SauceDemo

  @SauceDemo @NormalNegative @LoginSauceDemo @NormalAccountLogin
  Scenario: User login with normal account then can just login
    Given  User is on saucedemo login page
    And User input username saucedemo "RILLUSERNAME"
    And User input password saucedemo "RILLPASSWORD"
    And User click submit login saucedemo
    Then User is on home page saucedemo

  @SauceDemo @NormalNegative @LoginSauceDemo @ProblemAccount @LockedOutAccountLogin
  Scenario: User login with locked out account then cannot login
    Given  User is on saucedemo login page
    And User input username saucedemo "RILLUSERNAME2"
    And User input password saucedemo "RILLPASSWORD"
    And User click submit login saucedemo
    Then User still on login page

  @SauceDemo @NormalNegative @LoginSauceDemo @ProblemAccount @ProblemAccountLogin
  Scenario: User login problem account then can just login
    Given  User is on saucedemo login page
    And User input username saucedemo "RILLUSERNAME3"
    And User input password saucedemo "RILLPASSWORD"
    And User click submit login saucedemo
    Then User is on home page saucedemo

  @SauceDemo @NormalNegative @LoginSauceDemo @ProblemAccount @GlitchAccountLogin
  Scenario: User login with glitch account then can login but with taken a little bit time
    Given  User is on saucedemo login page
    And User input username saucedemo "RILLUSERNAME4"
    And User input password saucedemo "RILLPASSWORD"
    And User click submit login saucedemo
    Then User is on home page saucedemo

  @SauceDemo @NormalPositive @LoginSauceDemo @WrongAccount
  Scenario: User login with wrong account then cannot login
    Given  User is on saucedemo login page
    And User input username saucedemo "RILLUSERNAME69"
    And User input password saucedemo "RILLPASSWORD"
    And User click submit login saucedemo
    Then User still on login page

  @SauceDemo @NormalPositive @LoginSauceDemo @Cart @AccountNormal
    Scenario: User login successfully with use normal account
      Given User is on saucedemo login page
      And User input username saucedemo "RILLUSERNAME"
      And User input password saucedemo "RILLPASSWORD"
      And User click submit login saucedemo
      Then User is on home page saucedemo
      And User click add to cart sauce labs backpack
      And User click add to cart sauce labs bike light
      And User click add to cart sauce labs bolt tshirt
      And User click add to cart sauce labs fleece jacket
      And User click add to cart sauce labs onesie
      And User click add to cart sauce labs tshirt red
      Then User click cart
      And User on your cart
      And User click checkout
      Then User on checkout information
      And User input first name "FIRSTNAME"
      And User input last name "LASTNAME"
      And User input zip or postal code "ZIP"
      And User click continue
      Then User on checkout overview
      And User click finish button
      Then User will receive message checkout complete

  @SauceDemo @NormalPositive @LoginSauceDemo @Cart @LockedOutAccount
    Scenario: User login with locked out account then cannot login
      Given  User is on saucedemo login page
      And User input username saucedemo "RILLUSERNAME2"
      And User input password saucedemo "RILLPASSWORD"
      And User click submit login saucedemo
      Then User still on login page

  @SauceDemo @NormalPositive @LoginSauceDemo @Cart @ProblemAccount
  Scenario: User login with problem account then cannot finish the steps
    Given  User is on saucedemo login page
    And User input username saucedemo "RILLUSERNAME3"
    And User input password saucedemo "RILLPASSWORD"
    And User click submit login saucedemo
    Then User is on home page saucedemo
    And User click add to cart sauce labs backpack
    And User click add to cart sauce labs bike light
    And User click add to cart sauce labs onesie
    Then User click cart seems error
    And User on your cart
    And User click checkout
    Then User on checkout information
    And User input first name "FIRSTNAME"
    And User input last name "LASTNAME"
    And User input zip or postal code "ZIP"
    And User click continue
    Then User still on checkout information because error input

  @SauceDemo @NormalPositive @LoginSauceDemo @Cart @PerformanceGlitchAccount
  Scenario: User login successfully with use performance glitch account
    Given User is on saucedemo login page
    And User input username saucedemo "RILLUSERNAME"
    And User input password saucedemo "RILLPASSWORD"
    And User click submit login saucedemo
    Then User is on home page saucedemo
    And User click add to cart sauce labs backpack
    And User click add to cart sauce labs bike light
    And User click add to cart sauce labs bolt tshirt
    And User click add to cart sauce labs fleece jacket
    And User click add to cart sauce labs onesie
    And User click add to cart sauce labs tshirt red
    Then User click cart
    And User on your cart
    And User click checkout
    Then User on checkout information
    And User input first name "FIRSTNAME"
    And User input last name "LASTNAME"
    And User input zip or postal code "ZIP"
    And User click continue
    Then User on checkout overview
    And User click finish button
    Then User will receive message checkout complete

