# Artifacts

## Table Of Contents

- [Problem Analysis](Artifacts.md#problem-analysis)

- [PACT Analysis](Artifacts.md#pact-analysis)

  * [2.1 People](Artifacts.md#people)

  * [2.2 Activities](Artifacts.md#activities)

  * [2.3 Context](Artifacts.md#context)

  * [2.4 Technology](Artifacts.md#technology)

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

### Online survey form 

#### Test run

#### Actual survey

[Data](Research.md)