Feature: Users on Fake Store API

  @FakeStoreAPI @UsersFakeStore @GetAllUsers
    Scenario: User get All Users
      Given User call an api "/users" with method "GET"
      Then User verify status code is 200
      Then User verify response is match with json schema "allusers.json"

  @FakeStoreAPI @UserFakeStore @GetSingleUsers
    Scenario: User get Single Users
      Given User call an api "/users/1" with method "GET"
      Then User verify status code is 200
      Then User verify response is match with json schema "singleuser.json"


  @FakeStoreAPI @UserFakeStore @GetUsersWithLimit
    Scenario: User get All Users with limit
      Given User call an api "/users?limit=5" with method "GET"
      Then User verify status code is 200
      Then User verify response is match with json schema "allusers.json"

  @FakeStoreAPI @UserFakeStore @GetUsersSortDescendingResult
    Scenario: User get users with Sort Descending
      Given User call an api "/users?sort=desc" with method "GET"
      Then User verify status code is 200
      Then User verify response is match with json schema "allusers.json"

  @FakeStoreAPI @UserFakeStore @AddNewUsers
  Scenario: User add new Users
    Given User  call an api "/users" with method "POST" with payload below
      | email                 | username | password | name                             | address                                                                                                    | phone        |
      | samtingwong@gmail.com | RsTi3    | testing  | {firstname:Sebut,lastname:Mawar} | {city:Olympus,street:7835 new road,number:137aa,zipcode"6969-4200,geolocation:{lat:-37.3159,long:81.1496}} | 085171212504 |
    Then User verify status code is 200
    Then User verify response is match with json schema "addnewuser.json"

  @FakeStoreAPI @UserFakeStore @EditNewUsers
  Scenario: User edit Users
    Given User  call an api "/users/7" with method "PUT" with payload below
      | email                 | username | password | name                             | address                                                                                                  | phone        |
      | samtingwong@gmail.com | RsTi3    | testing  | {firstname:Sebut,lastname:Mawar} | {city:Olympus,street:7835 new road,number:137,zipcode"6969-4200,geolocation:{lat:-37.3159,long:81.1496}} | 085171212504 |
    Then User verify status code is 200
    Then User verify response is match with json schema "addnewuser.json"

  @FakeStoreAPI @UserFakeStore @PatchNewUsers
  Scenario: User Patch New Users
    Given User  call an api "/users/7" with method "PATCH" with payload below
      | email                 | username | password | name                             | address                                                                                                 | phone       |
      | samtingwong@gmail.com | RsTi3    | testing  | {firstname:Sebut,lastname:Mawar} |{city:Olympus,street:7835 new road,number:137,zipcode"6969-4200,geolocation:{lat:-37.3159,long:81.1496}} | 085171212504 |
    Then User verify status code is 200
    Then User verify response is match with json schema "addnewuser.json"

  @FakeStoreAPI @UserFakeStore @DeleteUsers
  Scenario: User delete product
    Given User call an api "/users/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "deleteuser.json"
