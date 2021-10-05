## Modeling Checkpoint plus unit 7
### Issues ready for review 
|**Issue**|**Contributors**|**Description of Issue**|
|:----:|:----:|:----:|
|**[deploy](https://github.com/D1935827V/spring_portfolio/issues/39)**|**Brayden**|I will deploy the website on my Pi|
|**[Greyscale](Work On Greyscale)**|**Calvin**|...|
|**[tbd]()**|**Dane**|...|
|**[RGB Image](https://github.com/D1935827V/spring_portfolio/issues/21)**|**Nicholas**|Improved the RGB image page|

RGB image work is focus in this lab.  Based on Tech Talk 4.

Focus this week is on Modeling.   Mini-lab is the only assigned coding for the week, however, you could try to implement all these requirement in your PBL if you can find a fit.   Each team needs to complete all coding portions of this assignment,  there should be clear division of work.

View/Frontend improvements 1 Pont
How would you provide Gray Scale for all the images?
How would you layout original pic, grayscale pic?  Do they sound like similar objects?
Since this is a lot of data, what would be good way to select images of your choice and show results in either original or gray?  My recommendation is to try a different approach to presentation.

Control improvements 1 Point
Is the lii setup being used a best practice?  Can you think of some improvements?  Do setup with 10 images.  IMO lii is an object that "has a" list of ii's as an within in it..
Should there be two GetMappings?  Try an object model that consolidates these two definitions.  Based off of UI, the language should be...

Model improvements 3 Points (is-a extends, has-a is a attribute)
The model throughout needs to be reworked from prototype, to something that is MORE Java like.  Modeling is THE KEY element to learning Java.  Please design and model the prototype to be more fully developed.
an list_of_image(s)_info object (lii) has-a list of images
an image_info object (ii) has-an image file, has-a list of image_property objects (contains original info, original info with watermark, grey, grey with watermark, etc)
an image_property object (iprop) has-a description, has-a base64 rendering file, has-a list of RGB attributes
an image_property_rgb (iprgb) object has-a has a list of RGB attributes in decimal, hexadecimal, and binary
RGB attributes is-an array of 3 or 4 attributes, Hexadecimal is-a list and Binary is-an array of 3 or 4 attributes as well.
What is base64?  Can you name some benefits of using this versus a file in coding?  This prototype for base64 implementation only supports PNG.  How would you support JPEG?  Please implement and try with different Image types.

 

 

Unit 7 CB scores and Corrections 3 points

### Unit 7 Individual work
**Name** | **Unit 7 work**
| :---: | :---:
**Brayden** | [Notes & Test Corrections](https://docs.google.com/spreadsheets/d/1soj1CwGK5Be7LfZio4-izik9sVKAbU7inG_5DJnedCs/edit?usp=sharing)
**Calvin** | [Notes](https://docs.google.com/document/d/1n3izOcbP4ylxIFgklC2cnNy1I1l6ASWpEBL8jmTDY5g/edit#heading=h.r6lcquk7ea55) / [Test Corrections](https://docs.google.com/document/d/1HN4C3lg2ZhEhUhw8biQFuJY0QDNz1AOyUDdoSD6I_d4/edit#heading=h.chk6kpqyuv17)
**Dane** | [Notes & Test Corrections](https://docs.google.com/document/d/1PjhsypGWwzYzs5u7B6uI55TdWPIBtuQ2HE1IIVbi4F0/edit?usp=sharing) |
**Nicholas** | [Notes](https://docs.google.com/document/d/16D0eQ_zxz73u0QobHrJQNsrWgb_pMmlYBhrCiXJGyCo/edit?usp=sharing)

## Algorithm Extend Lab plus Unit 6
### Issues ready for review 
|**Issue**|**Contributors**|**Description of Issue**|**Link to Video**|
|:----:|:----:|:----:|:----:|
|**[factorial](https://github.com/D1935827V/spring_portfolio/issues/34)**|**Brayden**|used recursion, running in terminal, will have it on website soon|**[link here](https://youtu.be/AZUWzFMDBKI)**|
|**[factorial]()**|**Calvin**|Algo Lab|**[link here](https://www.loom.com/share/b658195827f24902849811985384638c)**|
|**[tbd]()**|**Dane**|...|**[link here](tbd)**|
|**[tbd]()**|**Nicholas**|...|**[link here](tbd)**|

5 points.  Based on TPT 5 and Tech Talk 5.   Each individual will take an algorithm and implement it 4 different ways.   Similar to Fibonacci (Links to an external site.) that was shared in class.  

Individuals will send a DM that points to Code and Video.   Video will be approximately 30 seconds and show runtime.

You must create...
1. Abstract Class
2. Abstract Interface
3. Polymorphic Behavior in Class that extends
4. A screen allowing input and showing analysis on HTML frontend

Make sure you add something unique.

3 points.  Journal plus Unit 6 assignments.

### Unit 6 Individual work
**Name** | **Unit 6 work**
| :---: | :---:
**Brayden** | [Notes & Test Corrections](https://docs.google.com/spreadsheets/d/1soj1CwGK5Be7LfZio4-izik9sVKAbU7inG_5DJnedCs/edit?usp=sharing)
**Calvin** | [Notes](https://docs.google.com/document/d/1n3izOcbP4ylxIFgklC2cnNy1I1l6ASWpEBL8jmTDY5g/edit#heading=h.r6lcquk7ea55) / [Test Corrections](https://docs.google.com/document/d/1HN4C3lg2ZhEhUhw8biQFuJY0QDNz1AOyUDdoSD6I_d4/edit#heading=h.chk6kpqyuv17)
**Dane** | [Notes & Test Corrections](https://docs.google.com/document/d/1PjhsypGWwzYzs5u7B6uI55TdWPIBtuQ2HE1IIVbi4F0/edit?usp=sharing) |
**Nicholas** | [Notes](https://docs.google.com/document/d/1_nhZzQsfAE4UqJE7etYgw4OfscY9MkEN9iuDb0Cz-io/edit?usp=sharing)

## Modeling Checkpoint plus Unit 5
### Issues ready for review 
|**Issue**|**Contributors**|**Description of Issue**|
|:----:|:----:|:----:|
|**[factorial](https://github.com/D1935827V/spring_portfolio/issues/34)**|**Brayden**|doing what dane is doing, but better|
|**[MiniLab5: greyscale and alorithm extend lab](...)**|**Calvin**|Implemented greyscale, currrent issue is with implementing greyscale for multiple imgs. Dropped MiniLab 5 after switch to algo extend lab, now constructing algorithim extend lab|
|**[Mini-Lab 4](https://github.com/D1935827V/spring_portfolio/issues/35)**|**Dane**|Calculate Factorial and geometric sequence|
|**[Palindrome](https://github.com/D1935827V/spring_portfolio/issues/33)**|**Nicholas**|Add palindrome checker to About Me page, Spring MVC|

### TPT
*Explained fibonacci sqequence and showed multiple methods to do it
Recursion iterates multiple times and exits a condition of a loop
Memoize or use fast matrix exponentiation (not that important)
Abstract methods: provide definitions but does not provide the implementation, which must be extended. 
polymorphism - the provision of a single interface to entities of different types or the use of a single symbol to represent multiple different types
Abstract - means defining it later 
Getters and setters for git attributes

### Requirements
*Live Grading, individual.  RGB image work is focus is this lab.

*Focus this week is on Modeling.   Mini-lab is the only assigned coding for the week, however, you could try to implement all these requirement in your PBL if you can find a fit.   Each person needs to complete all coding portions of this assignment, even if it is duplication, and then the individual should add to their solution to a PBL project or to their individual area.

*I will be looking at solutions and a Technical Officer (or 2, 3) to present an "official solution" to class at the next TPT.  If you want to be be considered for presentation, please alert me on your solution the weekend before due date.

*View/Frontend improvements 1 Pont
*How would you provide Gray Scale for all the images?
*How would you layout original pic, grayscale pic?  Do they sound like similar objects?
*Since this is a lot of data, what would be good way to select images of your choice and show results in either original or gray?  My recommendation is to try a different approach to presentation.

*Control improvements 1 Point
*Is the lii setup being used a best practice?  Can you think of some improvements?  Do setup with 10 images.  IMO lii is an object that "has a" list of ii's as an within in it..
*Should there be two GetMappings?  Try an object model that consolidates these two definitions.  Based off of UI, the language should be...

*Model improvements 3 Points (is-a extends, has-a is a attribute)
*The model throughout needs to be reworked from prototype, to something that is MORE Java like.  Modeling is THE KEY element to learning Java.  Please design and model the prototype to be more fully developed.
*an list_of_image(s)_info object (lii) has-a list of images
*an image_info object (ii) has-an image file, has-a list of image_property objects (contains original info, original info with watermark, grey, grey with watermark, etc)
*an image_property object (iprop) has-a description, has-a base64 rendering file, has-a list of RGB attributes
*an image_property_rgb (iprgb) object has-a has a list of RGB attributes in decimal, hexadecimal, and binary
*RGB attributes is-an array of 3 or 4 attributes, Hexadecimal is-a list and Binary is-an array of 3 or 4 attributes as well.
*What is base64?  Can you name some benefits of using this versus a file in coding?  This prototype for base64 implementation only supports PNG.  How would you support JPEG?  Please implement and try with different Image types.

### Unit 5 Individual work
**Name** | **Unit 5 work**
| :---: | :---:
**Brayden** | [Notes & Test Corrections](https://docs.google.com/spreadsheets/d/1soj1CwGK5Be7LfZio4-izik9sVKAbU7inG_5DJnedCs/edit?usp=sharing)
**Calvin** | [Notes](https://docs.google.com/document/d/1n3izOcbP4ylxIFgklC2cnNy1I1l6ASWpEBL8jmTDY5g/edit#heading=h.r6lcquk7ea55) / [Test Corrections](https://docs.google.com/document/d/1HN4C3lg2ZhEhUhw8biQFuJY0QDNz1AOyUDdoSD6I_d4/edit#heading=h.chk6kpqyuv17)
**Dane** | [Notes & Test Corrections](https://docs.google.com/document/d/1PjhsypGWwzYzs5u7B6uI55TdWPIBtuQ2HE1IIVbi4F0/edit?usp=sharing) |
**Nicholas** | [Notes](https://docs.google.com/document/d/1_nhZzQsfAE4UqJE7etYgw4OfscY9MkEN9iuDb0Cz-io/edit?usp=sharing)


## Prototype Sprint End and Unit 4
### Issues ready for review (Prototypes/hack-a-thon)
|**Issue**|**Contributors**
|:----:|:----:|
|**[js typewriter](https://github.com/D1935827V/spring_portfolio/issues/23)**|**Brayden**|
|**[color step](https://github.com/D1935827V/spring_portfolio/projects/1?card_filter_query=assignee%3Aqwiksp)**|**Calvin**|
|**[hack-a-thon](https://github.com/D1935827V/spring_portfolio/issues/21)**|**Nic**|
|**[Mini Lab 2 Hack 5](https://github.com/D1935827V/spring_portfolio/issues/31)**|**Dane**|


### PBL
* Scrum Master.  Continue planning best practice, be prepared for review during class on Wednesday, for points.
* Developers.  Ensure each person has Prototype and/or TT3 hack coding task.  TT3 Binary Math must be included in project with all "Hack" suggestions.  Duplicating a Hack task for multiple individuals and integrating into their personal page(s), would be wise for someone who is behind on code commits. 
* Designer.  Ensure there is a Design or Research asset for prototyping work.
* Navigator/Tester.  Build a video showing design and runtime of prototype(s).
* Groomers/Developers.  Groom Scrum Board before delivery, moving Issues to Review, and including Tangible Assets. Time boxed README entries that point to Issues!

### Unit 4 Individual work
**Name** | **Unit 4 work**
| :---: | :---:
**Brayden** | [Notes & Test Corrections](https://docs.google.com/spreadsheets/d/1soj1CwGK5Be7LfZio4-izik9sVKAbU7inG_5DJnedCs/edit?usp=sharing)
**Calvin** | [Notes](https://docs.google.com/document/d/1n3izOcbP4ylxIFgklC2cnNy1I1l6ASWpEBL8jmTDY5g/edit#heading=h.rp71ud48dpyt) / [Test Corrections](https://docs.google.com/document/d/1HN4C3lg2ZhEhUhw8biQFuJY0QDNz1AOyUDdoSD6I_d4/edit#heading=h.43er9rbgdt0m)
**Dane** | [Test Corrections](https://docs.google.com/document/d/1zvMCBNtMw2e5imPMj0-7PCKh--ZfCrwLXKYyKx5LMfY/edit?usp=sharing)
**Nicholas** | [Test Corrections](https://docs.google.com/document/d/1iMdQhtmUpmTNAdnPl6olhIAlj-7jhIGEk_LdJfdsMng/edit?usp=sharing)

## Prototype Check and Unit 3
### Issues ready for review
|**Issue**|**Contributors**|**Highlights**|
|:----:|:----:|:----:|
|||
|||
|[Mini-Lab 2](https://github.com/D1935827V/spring_portfolio/issues/19)|Dane|Very impressive backend (Java) and frontend (HTML/Thymeleaf) design

### PBL
* Pair Design / HTML
  * a
  * m
* Pair Prototyping / Thymeleaf
  * o
  * g
* Scrum Team management
  * u
  * s

### Unit 3 Individual work
**Name** | **Unit 3 work**
| :---: | :---:
**Brayden** | [Notes & Test Corrections](https://docs.google.com/spreadsheets/d/1soj1CwGK5Be7LfZio4-izik9sVKAbU7inG_5DJnedCs/edit?usp=sharing)
**Calvin** | [Notes](https://docs.google.com/document/d/1n3izOcbP4ylxIFgklC2cnNy1I1l6ASWpEBL8jmTDY5g/edit#heading=h.xh0dmjase913) / [Test Corrections](https://docs.google.com/document/d/1HN4C3lg2ZhEhUhw8biQFuJY0QDNz1AOyUDdoSD6I_d4/edit#heading=h.if2dffapbal4)
**Dane** | [Test Corrections](https://docs.google.com/document/d/1wDDWaogGtgy28O24lLOssde6ZkPGz-ClU0pRBPtQcyI/edit?usp=sharing)
**Nicholas** | [Test Corrections](https://docs.google.com/document/d/1iMdQhtmUpmTNAdnPl6olhIAlj-7jhIGEk_LdJfdsMng/edit?usp=sharing)

## Pop Quiz Sep. 10, 2021
### **CTC: BraydenBasinger, QwikSP, D1935827V, and ncrxue**
### [Scrum Board](https://github.com/D1935827V/spring_portfolio/projects/1)
### **Pairs and Journals**
#### [Dane & Nicholas](https://docs.google.com/document/d/1PjhsypGWwzYzs5u7B6uI55TdWPIBtuQ2HE1IIVbi4F0/edit?usp=sharing)
#### [Calvin & Brayden](https://docs.google.com/document/d/1jjNDt_8c3gOlnA6uRstFvJm6lCJMMFduexonZ1bVOis/edit?usp=sharing)
**Name** | **Github ID** | **Tasks** | **Scrum Board** | **Commits** | **Profile**
| :---: | :---: | :--: | :--: | :--: | :--:
**Brayden** | BraydenBasinger | [Link](https://github.com/D1935827V/spring_portfolio/issues?q=assignee%3ABraydenBasinger+is%3Aissue) | [Link](https://github.com/D1935827V/spring_portfolio/projects/1?card_filter_query=assignee%3Abraydenbasinger) | [Link](https://github.com/D1935827V/spring_portfolio/commits?author=BraydenBasinger) | [Link](https://github.com/BraydenBasinger)
**Calvin** | QwikSP | [Link](https://github.com/D1935827V/spring_portfolio/issues?q=assignee%3AQwikSP+is%3Aissue) | [Link](https://github.com/D1935827V/spring_portfolio/projects/1?card_filter_query=assignee%3Aqwiksp) | [Link](https://github.com/D1935827V/spring_portfolio/commits?author=QwikSP) | [Link](https://github.com/QwikSP)
**Dane** | D1935827V | [Link](https://github.com/D1935827V/spring_portfolio/issues?q=assignee%3AD1935827V+is%3Aissue) | [Link](https://github.com/D1935827V/spring_portfolio/projects/1?card_filter_query=assignee%3Ad1935827v) | [Link](https://github.com/D1935827V/spring_portfolio/commits?author=D1935827V) | [Link](https://github.com/D1935827V)
**Nicholas** | ncrxue | [Link](https://github.com/D1935827V/spring_portfolio/issues?q=is%3Aissue+assignee%3Ancrxue) | [Link](https://github.com/D1935827V/spring_portfolio/projects/1?card_filter_query=assignee%3Ancrxue) | [Link](https://github.com/D1935827V/spring_portfolio/commits?author=ncrxue) | [Link](https://github.com/ncrxue)

## PBL 1-2 and Unit 2 
### Individual Scores:
**Name** | **Score**
| :---: | :---:
**Brayden** | 5/5
**Calvin** | 5/5
**Dane** | 5/5
**Nicholas** | 5/5 |
* [Scrum Board](https://github.com/D1935827V/spring_portfolio/projects/1) with scores and issues ready for review
### PBL (Team)
* Scrum Board (Ideation / Design)
  * Scrum Master. Define tasks and place assignments to in-progress on the Scrum board.
  * Designer. Wire Frame (at least three theme pages, team mini-labs, and about)
  * Technical Lead. Coordinate brain write session, after preliminary wire frames, make sure you capture technical complexities as an output of this exercise (input, saving data, comments, visual actions, animations, ...)
* GitHub assets
  * Navigators. Capture or build highlight of Ideation in README.md, this allows ideas to persist with Project,  Make sure that work from Developers works to expectations (testing, suggestions for improvement)
  * Developers. Bootstrap drop downs in navbar, start to form Wire Frame menu options.  Each menu option should have a Stub code page
  * Developers. Integration of Greet, Birds, Unit 1 functionality into a mini-lab page
  * Designer/Developer. 1 minute video integrated into About Us on Genesis ideas for project.

### PBL (Individual)
WIP
### Unit 2 (Individual)
**Name** | **Unit 2 work**
| :---: | :---:
**Brayden** | [Test Corrections](https://docs.google.com/spreadsheets/d/1soj1CwGK5Be7LfZio4-izik9sVKAbU7inG_5DJnedCs/edit?usp=sharing)
**Calvin** | [Notes](https://docs.google.com/document/d/1n3izOcbP4ylxIFgklC2cnNy1I1l6ASWpEBL8jmTDY5g/edit#heading=h.jb7x00uldbjj) / [Test Corrections](https://docs.google.com/document/d/1HN4C3lg2ZhEhUhw8biQFuJY0QDNz1AOyUDdoSD6I_d4/edit#heading=h.wniswmt2civo)
**Dane** | [Test Corrections](https://docs.google.com/document/d/1LibJorOk7y_hXnPU18mun9P-bHbaHPAlE7vncwOQBg0/edit)
**Nicholas** | WIP

## TBD [Spring Portfolio Starter](https://nighthawkcodingsociety.com/projectsearch/details/Spring%20Portfolio%20Starter)
Runtime link: TBD https://jportfolio.nighthawkcodingsociety.com/

## Group Members
### * Dane Vestal dvestal2012@gmail.com [GitHub](github.com/D1935827V)
### * Brayden Basinger Braydenbasinger@outlook.com [GitHub](https://github.com/BraydenBasinger)
### * Nicholas Xue nxue2004@gmail.com [GitHub](https://github.com/ncrxue)
### * Calvin Cheah calvin10424@gmail.com [GitHub](https://github.com/QwikSP)

## Journals
### * [Dane & Nicholas](https://docs.google.com/document/d/1PjhsypGWwzYzs5u7B6uI55TdWPIBtuQ2HE1IIVbi4F0/edit?usp=sharing)
### * [Calvin & Brayden](https://docs.google.com/document/d/1jjNDt_8c3gOlnA6uRstFvJm6lCJMMFduexonZ1bVOis/edit?usp=sharing)

## Project Plan
### * [DNHS class review website](https://docs.google.com/document/d/1fDTN1DTGJrzje9FRy6E5Znsq2hrNt75o9eb6XqC-H7I/edit?usp=sharing)  

## Project History
### * [Contribution History](https://github.com/D1935827V/spring_portfolio/commits/master)

## Scrum Board
### * [https://github.com/D1935827V/spring_portfolio/projects/1](https://github.com/D1935827V/spring_portfolio/projects/1)

## Visual thoughts
#### * Starter code should be fun and practical
#### * Organize with Bootstrap menu 
#### * Add some color and fun through VANTA Visuals (birds, halo, solar, net)
#### * Show some practical and fun links (hrefs) like Twitter, Git, Youtube
#### * Show student project specific links (hrefs) per page
#### * Show student TPT ideas
#### * Show student com.example.sping_portfolio.controllers.About me pages



## Getting started
#### * Clone project to IntelliJ
#### * Verify Project Structure to use a good Java JDK (adopt-openJ9-15) 
#### * Play or entry point is Main.java, look for play option in tray.  This file eanbles Spring to load
#### * Java source (src/main/java) had Java files.  Find "controllers" path, these files enable HTTP route and HTML file relationship.  Note, html 
#### * HTML source (src/main/resources) had templates and supporting files.  Find index.html as this file is launched by defaul in Spring.  Other HTML files are loaded by building a "@Controller"



## IDE management
#### * A ".gitignore" can teach a Developer a lot com.example.sping_portfolio.about Java runtime.  A target directory is created when you press play button, byte code is generated and files are moved into this location.
#### * A "pom.xml" file can teach you a lot com.example.sping_portfolio.about Java dependencies.  This is similar to "requirements.txt" file in Python.  It manages packages and dependencies.
