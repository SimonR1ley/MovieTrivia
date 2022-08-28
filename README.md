
<br />


<h5 align="center" style="padding:0;margin:0;">Simon Riley</h5>
<h5 align="center" style="padding:0;margin:0;">170044</h5>
<h6 align="center">DV203 | Android Introduction</h6>
</br>
<p align="center">

  <a href="https://github.com/SimonR1ley/MovieTrivia">
    <img src="Images/icon.png" width="100px">
  </a>

<h3 align="center">Movie Trivia</h3>

  <p align="center">
    A Trivia application built with Android Studio and Kotlin.<br>

   <br />
   <br />
   <a href="URL">View Demo</a>
    ·
    <a href="https://github.com/SimonR1ley/MovieTrivia/issues">Report Bug</a>
    ·
    <a href="https://github.com/SimonR1ley/MovieTrivia/issues">Request Feature</a>
</p>
<!-- TABLE OF CONTENTS -->

## Table of Contents

- [About the Project](#about-the-project)
    - [Project Description](#project-description)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [How to install](#how-to-install)
- [Features and Functionality](#features-and-functionality)
- [Concept Process](#concept-process)
    - [Ideation](#ideation)
- [Development Process](#development-process)
    - [Implementation Process](#implementation-process)
        - [Highlights](#highlights)
        - [Challenges](#challenges)
    - [Future Implementation](#peer-reviews)
- [Final Outcome](#final-outcome)
    - [Mockups](#mockups)
    - [Video Demonstration](#video-demonstration)
- [Conclusion](#conclusion)
- [License](#license)
- [Contact](#contact)
- [Acknowledgements](#acknowledgements)

<!--PROJECT DESCRIPTION-->

## About the Project

<!-- header image of project -->

![image12][image12]

### Project Description

Movie Trivia! Movie Trivia is a simple trivia application. It consists of three categories, Disney Movies, Guess the Hero, Horror Movies. This is a trivia app with a twist, questions are asked through emojis.

### Built With
[<img src="https://4.bp.blogspot.com/-cE71mKJc94w/VrT2tLTxXTI/AAAAAAAACjU/KdygZ1AN0Nc/s1600/image04.png" width="5%" height="5%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;](https://developer.android.com/studio?gclid=CjwKCAjwuYWSBhByEiwAKd_n_q4WXi5vcCji08peoWOEsv-KHFT7QWNZNmozB_CIiiSNl_HOUL-1JBoCGx8QAvD_BwE&gclsrc=aw.ds)
[<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Kotlin_Icon.svg/512px-Kotlin_Icon.svg.png?20171012085709" width="4%" height="4%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;](https://kotlinlang.org/)


## Getting Started

These instructions will help you get a copy of the project up and running on your machine.

### Prerequisites

For development, the latest version of Android Studio is required. The latest version can be downloaded from [Android Studio](https://developer.android.com/studio?gclid=CjwKCAjwuYWSBhByEiwAKd_n_q4WXi5vcCji08peoWOEsv-KHFT7QWNZNmozB_CIiiSNl_HOUL-1JBoCGx8QAvD_BwE&gclsrc=aw.ds)

### Installation

1. Clone the repo
```
git clone https://github.com/SimonR1ley/MovieTrivia.git
```
2. Open the project

Use `File` : `Open` in Android Studio.

<!-- FEATURES AND FUNCTIONALITY-->
<!-- You can add the links to all of your imagery at the bottom of the file as references -->

## Features and Functionality

<!-- note how you can use your gitHub link. Just make a path to your assets folder -->

### Entering your username

![image2][image2]
When the application opens, you enter your name. You can change your name when you reset the score in settings.
### Choose a category

![image3][image3]
Select one of the categories, Disney Movies, Guess the Hero, Horror Movies.

### Answer Quiz Questions

![image4][image4]
Answer the question shown with emojis.

### Display Score
![image5][image5]
When all the questions are answered, the score will be displayed.

### Show & Reset High Score
![image6][image6]
The user can see there highscore as well as reset it as well as the username.

<!-- CONCEPT PROCESS -->
<!-- Briefly explain your concept ideation process -->
<!-- here you will add things like wireframing, data structure planning, anything that shows your process. You need to include images-->

## Concept Process

I started the application designing the app in Figma. From there is starting building the frontend of the app. When the design was in place I started with the logic.


## Development Process

The `Development Process` is the technical implementations and functionality done for the app.

### Implementation Process

I used <b>Kotlin 1.7.0</b> for the functionality and <b>XML</b> for the front-end.

#### XML

- `LinearLayout` was the layout I used for the majority of the project

#### Kotlin

- I created a `Constants.kt` object file with all my questions and my `sharedPreferences` data like my Username and Category Highscores
- I created a `Questions.kt` class file, where I made my question. This included the logic for which category and which question would be asked.

#### Highlights

<!-- stipulated the highlight you experienced with the project -->

- A highlight for me was learning a new language (Kotlin) and getting started with mobile development.

#### Challenges

<!-- stipulated the challenges you faced with the project and why you think you faced it or how you think you'll solve it (if not solved) -->

- There were a number of challenges I faced throughout this project. I struggled to get the correct question number to display, I kept getting duplicates but the was quickly fixed when I found the simple mistake
- A challenge that I still have is when the user gets to the score screen, the app crashes every now and then.

### Future Implementation

<!-- TODO Change this! -->

<!-- stipulate functionality and improvements that can be implemented in the future. -->

- I would like to add more questions to the Hero and Horror categories.
- Maybe add a Highscore log for world wide users.

<!-- MOCKUPS -->

## Final Outcome

### Mockups

<!-- TODO Change this -->

![image7][image7]
![image8][image8]
![image9][image9]
![image10][image10]
![image11][image11]
<br>


<!-- VIDEO DEMONSTRATION -->

### Video Demonstration

<!-- TODO Change this -->


See the [open issues](https://github.com/SimonR1ley/MovieTrivia/issues) for a list of proposed features (and known issues).

<!-- AUTHORS -->

## Authors

- **Simon Riley** - [Github](https://github.com/SimonR1ley)

<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE` for more information.\

<!-- LICENSE -->

## Contact

- **Simon Riley** - [170044@virtualwindow.co.za]](mailto:170044@virtualwindow.co.za)
- **Project Link** - https://github.com/SimonR1ley/MovieTrivia

<!-- ACKNOWLEDGEMENTS -->

## Acknowledgements

<!-- all resources that you used and Acknowledgements here -->

[image1]: Images/about.jpg
[image2]: Images/name.jpg
[image3]: Images/category.jpg
[image4]: Images/question.jpg
[image5]: Images/score.jpg
[image6]: Images/settings.jpg
[image7]: Images/mockup1.jpg
[image8]: Images/mockup2.jpg
[image9]: Images/mockup3.jpg
[image10]: Images/mockup4.jpg
[image11]: Images/mockup5.jpg
[image12]: Images/feature.jpg
[image13]: Images/icon.jpg