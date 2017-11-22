# Artifacts

## Table Of Contents

- [Problem Analysis](Artifacts.md#problem-analysis)

- [PACT Analysis](Artifacts.md#pact-analysis)

  * [People](Artifacts.md#people)

  * [Activities](Artifacts.md#activities)

  * [Context](Artifacts.md#context)

  * [Technology](Artifacts.md#technology)

- [User research](Artifacts.md#user-research)
 
  * [Online survey Test Run](Artifacts.md#online-survey-form)

    - [Observation from Test run](Artifacts.md#observation-from-test-run)

  * [Actual Online Survey](Artifacts.md#actual-survey)

    - [Observation from result](Artifacts.md#observation-from-result)

## Problem Analysis

In Malaysia, there are a large numbers of bookstores everywhere ranging from Popular, MPH bookstore, etc. Each bookstore sell books at different prices. Despite numbers of bookstore around Malaysia, few problem had been faced. 

1. Difficult in locating the bookstore that sold a book at the cheapest price among all the bookstore.

1. Do not have a central platform for locating bookstores.

1. Unable to search availability of book in a central system

Bookstore located in various location of Malaysia, despite we can search the places of bookstore by using google, however some smaller bookstore might not be shown in the search result. Looking for cheapest book are also difficult as it need long amount of time in doing market research on each bookstore. Also, some of the book might not be available in some of the bookstore, and some book might not be even available in Malaysia, such as *Discourse on Inequality* by [Jean-Jacques Rousseau](https://en.wikipedia.org/wiki/Jean-Jacques_Rousseau), or *A Guide to the Good Life* by [William B. Irvine](http://www.wright.edu/~william.irvine/). 

## PACT Analysis

### People

- Student (Acedemic books)

- Whitecollar worker (Work related books)

- People who read book frequently (At least one book per year)

### Activities

- Help users to find books based on several criteria such as budget, category, etc

- Help users to locate available bookstore that in stock

- Redirect to the bookstore online website if prefer to buy online

- Help user to search for available bookstores

### Context

- Native Mobile app, because it is much more convinient for the user to be able to search a book when they are outside of their home or workplace. Despite web development are very robust today and much framework provide mobile friendly webapp, such as responsive web app, however it require higher skill sets, and require internet connection to access to the content. 

### Technology

1. Input
    - Search method
    - Book name - search by book
    - Budget and category - Search by category
    - GPS input location

1. Output
    - List of bookstore and website sorted by price

1. Communication
    - Server-client architecture query from database
    - Uses API from other platform

1. Content
    - Any user can update the outdated information

## User research

### Online survey Test Run

*Question*

1. Age 

1. Job 
    - Student
    - Lecturer
    - Doctor
    - Engineer
    - Other

1. How often you read books?
    - Very rare
    - Once per month
    - Once per week
    - 3 times per week
    - 5 times per week
    - Everyday

1. Average number of books you buy per year

1. What are the types of book you normally read?
    - Philantrophy
    - Philosophy
    - IT
    - Finance
    - Business
    - Entrepreneurship
    - Other

1. What are the reason you buy books?
    - Self enrichment
    - Work
    - Friend recommendation
    - Other

1. Medium of buying books 
    - Physical bookstore
    - Online
    - Bookfair

1. Ever face problem in finding cheapest books
    - Yes
    - Neutral
    - No 

1. How likely you will use a book finding app if there exist one 
    - Very likely
    - Likely
    - Neutral
    - Not likely
    - Very not likely

#### Observation from Test run

Each member of team will find a close friend, and let them do the test run of the question and observe from how they input and find ways to improve the question. Observation gain from the research - 

- Tend to give a range for averange number of books 

- Friend recommendation might be vague as for the reason of read books 

- Google form scale can be used for likelyhood of using app

### Actual Online Survey

[Result data](Research.md)

#### Observation from result