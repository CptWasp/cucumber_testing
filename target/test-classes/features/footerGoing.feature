Feature: Going to the site footer and click the link

  Scenario: we will scroll through the site until we find the link
    Then Click link
    Then Click search link
    Then Click settings span
    Then Select true checkboxes
    Then Clear checkboxes
    Then Select region
    Then Set date time "01-06-2021"
    Then Exit date time setting modal
    Then Search