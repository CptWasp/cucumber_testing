Feature: Going to the site footer and click the link

  Scenario: we will scroll through the site until we find the link
    Given Scroll down
    When Got footer
    Then Should find the link and click