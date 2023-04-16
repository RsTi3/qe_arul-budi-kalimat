Feature: Cart Service Fake API Store

  @FakeStoreAPI @CartFakeStore @GetAllCart
    Scenario: User get All Cart
      Given User call an api "/carts" with method "GET"
      Then User verify status code is 200
      Then User verify response is match with json schema "allcarts.json"

  @FakeStoreAPI @CartFakeStore @GetSingleCart
  Scenario: User get Single Cart
    Given User call an api "/carts/5" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "singlecart.json"

  @FakeStoreAPI @CartFakeStore @GetCartWithLimit
  Scenario: User get All Cart with limit
    Given User call an api "/carts?limit=5" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "allcarts.json"

  @FakeStoreAPI @CartFakeStore @GetCartsSortDescendingResult
  Scenario: User get cart with Sort Descending
    Given User call an api "/carts?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "allcarts.json"

  @FakeStoreAPI @CartFakeStore @GetCartsInDateRange
  Scenario: User get Carts in Date Range
    Given User call an api "/carts?startdate=2019-12-10&enddate=2020-10-10" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "cartsinadaterange.json"

  @FakeStoreAPI @CartFakeStore @GetUserCarts
  Scenario: User get User Carts
    Given User call an api "/carts/user/2?startdate=2019-12-10&enddate=2020-10-10" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "usercart.json"

  @FakeStoreAPI @CartFakeStore @AddNewProductToCarts
  Scenario: User add new product to carts
    Given User  call an api "/carts" with method "POST" with payload below
      | userId | date       | products                                            |
      | 5      | 2020-02-03 | [{productId:5,quantity:1},{productId:1,quantity:5}] |
    Then User verify status code is 200
    Then User verify response is match with json schema "addproducttocarts.json"

  @FakeStoreAPI @CartFakeStore @EditProductToCarts
  Scenario: User edit product carts
    Given User  call an api "/carts/7" with method "PUT" with payload below
      | userId | date       | products                                            |
      | 5      | 2020-02-03 | [{productId:5,quantity:1},{productId:1,quantity:5}] |
    Then User verify status code is 200
    Then User verify response is match with json schema "addproducttocarts.json"

  @FakeStoreAPI @CartFakeStore @PatchProductToCarts
  Scenario: User patch product carts
    Given User  call an api "/carts/7" with method "PATCH" with payload below
      | userId | date       | products                                            |
      | 5      | 2020-02-03 | [{productId:5,quantity:1},{productId:1,quantity:5}] |
    Then User verify status code is 200
    Then User verify response is match with json schema "addproducttocarts.json"

  @FakeStoreAPI @CartFakeStore @DeleteCart
  Scenario: User delete product
    Given User call an api "/carts/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deletecarts.json"
