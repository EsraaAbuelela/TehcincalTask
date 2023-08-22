@smoke
Feature: F01_Subscription_Package | Validate subscription Packages

  Scenario Outline: validate subcription Pacakages for all countries
    Given user select language as English
    When  user select country as <country>
    Then home Page reloaded and Packages will displayed "LITE" with <LitePrice> and <Currency>
    Then home Page reloaded and Packages will displayed "CLASSIC" with <ClassicPrice> and <Currency>
    Then home Page reloaded and Packages will displayed "PREMIUM" with <PremiumPrice> and <Currency>

    Examples:
      | country   | LitePrice | ClassicPrice | PremiumPrice | Currency |
      | "eg"      | "0.25"      | "0.5"        | "1"          | "USD"    |
      | "ae"      | "5.4"   | "10.9"       | "16.3"       | "USD"    |
      | "lb"      | "2.4"    | "4.8"        | "7.2"        | "USD"    |


