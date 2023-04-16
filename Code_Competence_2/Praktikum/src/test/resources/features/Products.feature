Feature: Products service Fake Store API

  @FakeStoreAPI @ProductsFakeStore @GetAllProducts
  Scenario: User get all products
    Given User call an api "/products" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "allproducts.json"

  @FakeStoreAPI @ProductsFakeStore @GetSingleProduct
  Scenario: User get single products
    Given User call an api "/products/1" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "singleproduct.json"

  @FakeStoreAPI @ProductsFakeStore @GetAllProductsWithLimit
  Scenario: User get all products with limit
    Given User call an api "/products?limit=5" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "allproducts.json"

  @FakeStoreAPI @ProductsFakeStore @GetProductSortDescendingResult
  Scenario: User get all products
    Given User call an api "/products?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "allproducts.json"

  @FakeStoreAPI @ProductsFakeStore @GetAllCategory
  Scenario: User get all category
    Given User call an api "/products/categories" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "productcategory.json"

  @FakeStoreAPI @ProductsFakeStore @GetProductsInSpecificCategoryJewelery
  Scenario: User get all products in category jewelery
    Given User call an api "/products/category/jewelery" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getproductspecificcategory.json"

  @FakeStoreAPI @ProductsFakeStore @GetProductsInSpecificCategoryElectronics
  Scenario: User get all products in category electronics
    Given User call an api "/products/category/electronics" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getproductspecificcategory.json"

  @FakeStoreAPI @ProductsFakeStore @GetProductsInSpecificCategoryMen'sClothing
  Scenario: User get all products in category men's clothing
    Given User call an api "/products/category/men's clothing" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getproductspecificcategory.json"

  @FakeStoreAPI @ProductsFakeStore @GetProductsInSpecificCategoryWomen'sClothing
  Scenario: User get all products in category women's clothing
    Given User call an api "/products/category/women's clothing" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "getproductspecificcategory.json"

  @FakeStoreAPI @ProductsFakeStore @AddNewProduct
  Scenario: User add new product
    Given User call an api "/products" with method "POST" with payload below
      | title             | price  | description   | image                 | category     |
      | BenQ Zowie EC 2 B | 880000 | Mouse Gaming  | https://i.pravatar.cc | electronics  |
    Then User verify status code is 200
    Then User verify response is match with json schema "newproduct.json"

  @FakeStoreAPI @ProductsFakeStore @EditProduct
  Scenario: User edit product with given id
    Given User call an api "/products/7" with method "PUT" with payload below
      | title        | price  | description   | image                 | category       |
      | Erigo Tshirt | 200000 | Pakaian Erigo | https://i.pravatar.cc | men's clothing |
    Then User verify status code is 200
    Then User verify response is match with json schema "newproduct.json"

  @FakeStoreAPI @ProductsFakeStore @PatchProduct
  Scenario: User patch product with given id
    Given User call an api "/products/7" with method "PATCH" with payload below
      | title        | price  | description   | image                 | category       |
      | Erigo Tshirt | 200000 | Pakaian Erigo | https://i.pravatar.cc | men's clothing |
    Then User verify status code is 200
    Then User verify response is match with json schema "newproduct.json"

  @FakeStoreAPI @ProductsFakeStore @DeleteProduct
  Scenario: User delete product
    Given User call an api "/products/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deleteproduct.json"
