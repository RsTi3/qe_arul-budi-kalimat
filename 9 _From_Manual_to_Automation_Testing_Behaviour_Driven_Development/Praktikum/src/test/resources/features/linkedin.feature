@LinkedIn
Feature: LinkedIn Home


  @Login @NormalPositive @LoginLinkedInSuccess
  Scenario: User Can Login With Correct Username & Password
    Given user is on linkedin landing page
    And  user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page

  @Login @NormalNegative @LoginLinkedInFailed
  Scenario: User cannot login with incorrect username and incorrect password
    Given user is on linkedin landing page
    And user input incorrect username "PEKUSERNAME"
    And user input incorrect password "PEKPASSWORD"
    And user click login
    Then user cannot login and still on login page

  @Login @NormalNegative @LoginLinkedInFailed
  Scenario: User cannot login with correct username and incorrect password
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input incorrect password "PEKPASSWORD"
    And user click login
    Then user cannot login and still on login page wrong password

  @Login @NormalNegative @LoginLinkedInFailed
  Scenario: User cannot login with incorrect username and correct password
    Given user is on linkedin landing page
    And user input incorrect username "PEKUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user cannot login and still on login page

  @CreatePost @NormalPositive
  Scenario: Create New Post
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page
    And user input post
    And user input text post "TESTINGPOSTINGARULBEKA"
    And user click send post
    Then user see their post in their feed

  @CommentPost @NormalPositive
  Scenario: Comment on our own post
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page
    And user input post
    And user input text post
    And user click send post
    Then user see their post in their feed
    And user click comment button
    And user input comment
    And user click send comment
    Then user see their comment on their post

  @Repost @NormalPositive
  Scenario: Repost our own post
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page
    And user input post
    And user input text post
    And user click send post
    Then user see their post in their feed
    And user click repost
    Then user see their reposted post in their feed

  @CreatePostWithPhoto @NormalPositive
  Scenario: Create New Post with Photo
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page
    And user input post with photo
    And user click send post
    Then user see their post in their feed

  @CreatePostWithVideo @NormalPositive
  Scenario: Create New Post with Video
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page
    And user input post with video
    And user click send post
    Then user see their post in their feed

  @CreatePostWithEvent @NormalPositive
  Scenario: Create New Post with Event
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page
    And user input post with event
    And user click send post
    Then user see their post in their feed

  @LikePost @NormalPositive
  Scenario: Like our own post
    Given user is on linkedin landing page
    And user input correct username "RILLUSERNAME"
    And user input correct password "RILLPASSWORD"
    And user click login
    Then user is on home page
    And user input post
    And user click send post
    Then user see their post in their feed
    And user click like button
    And user choose like emoticon
    Then user see their post is liked