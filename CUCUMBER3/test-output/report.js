$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./FEATURE/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM app test",
  "description": "",
  "id": "free-crm-app-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create deal test",
  "description": "",
  "id": "free-crm-app-test;create-deal-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user on deal page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "fills the deal form",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "deal is created",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooksdefinition.user_on_deal_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Hooksdefinition.fills_the_deal_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Hooksdefinition.deal_is_created()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "Create contact test",
  "description": "",
  "id": "free-crm-app-test;create-contact-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user on contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "fills the contact form",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "contact is created",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooksdefinition.user_on_contact_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Hooksdefinition.fills_the_contact_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Hooksdefinition.contact_is_created()"
});
formatter.result({
  "status": "skipped"
});
});