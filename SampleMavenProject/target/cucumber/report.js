$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SignIn.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In and Sign Out",
  "description": "",
  "id": "sign-in-and-sign-out",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign in and sign out",
  "description": "",
  "id": "sign-in-and-sign-out;sign-in-and-sign-out",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I sign in",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I sign out",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 25747177032,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.i_sign_in()"
});
formatter.result({
  "duration": 22862334277,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.i_sign_out()"
});
formatter.result({
  "duration": 186329560,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Contact Us Action",
  "description": "",
  "id": "sign-in-and-sign-out;contact-us-action",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I perform contact us actions",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 7743135017,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.I_perform_contact_us_actions()"
});
formatter.result({
  "duration": 165301842,
  "status": "passed"
});
formatter.uri("features/SocialLink.feature");
formatter.feature({
  "line": 1,
  "name": "Social Link",
  "description": "",
  "id": "social-link",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Social Link Action",
  "description": "",
  "id": "social-link;social-link-action",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I perform Social link actions",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 5747146812,
  "status": "passed"
});
formatter.match({
  "location": "SocialLinkSteps.i_perform_Social_link_actions()"
});
formatter.result({
  "duration": 864384649,
  "status": "passed"
});
});