# Hungry Animal Tutorial
This is the README.md file.
Change this file to show your intended audience what you want them to see.

You can use **Markdown** syntax to format this file to do things like **bold** or *italicize* text.
[Markdown basics](https://www.markdownguide.org/getting-started/)

This particular repository is the starting template for the Hungry Elephant tutorial.

[Part 1: Greenfoot Basics](https://youtu.be/zxaa3X0MihI)

[Part 2: Game Enhancements](https://youtu.be/TwID9i0Ey6o)

[Part 3: Final Touches](https://youtu.be/GT-eFwa4Abc)










<h1>**Added Features to the Hungry Animal Assignment**</h1>

- Addition of the *Peanut* class: just as eating an apple increases the score by 1, eating a peanut decreases the score by 1. The peanut has most of the same code as the apple (one difference is that you can miss an unlimited amount of peanuts (more on missing apples below)).
- Instead of showing only the value of the score while playing the game (in the *MyWorld* world), I added “Score: ” immediately before the value.
- In the original game that I created while watching the tutorial, when the elephant fails to eat an apple, this results in the game being over. I adjusted this to make the game end in either of two scenarios: 1. Where the elephant misses 3 apples in a row. 2. If the score ever gets below 0.
- I changed the background screen of the *TitleScreen* world to a space background. I also made a *GameoverWorld* world that shows up when the game ends. This *GameoverWorld* world has the same space background as the *TitleScreen* world. 
- Finally, I added the feature of being able to press <space> in the *GameoverWorld* world to replay the game, instead of having to rerun the program.
