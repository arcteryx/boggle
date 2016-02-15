# boggle
Boggle implementation for ASU: SER215

Specifications:

Develop and implement a Boggle-like game (controlled by a multithreaded server (MTS) – optional). Design the game as a multi-player game. The users (two or more), should engage the ui in the same, or, separate interfaces. In the case of a multithreaded program, all players will play at the same time; otherwise the players will iterate through the game one-at-a-time.


Features:

Allow the selection of time-limit, number of players, and target-score (100, 300, 500 or custom).
Allow each player to enter his/her name and use the name to notify the player of his/her turn.
Provide the players with a graphical representation of the 16x16 board before it is randomized.
Provide each player with a graphical representation of the board after it is randomized (non-multithread).
Provide a sentinel-value that any player can enter to Quit the game.
Allow the players to enter words in a list sequentially or, in the case of a MTS, at the same time. 
Calculate and display the score of each player
Declare a winner based on the the target-score.
Allow the remaining players to play again...

Scoring:
      Words are formed from adjoining letters.  Letters may adjoin vertically, horizontally, or diagonally.
     They MUST be in the proper order, AND letters CANNOT be used twice in the same word.

     Words containing 3-4 letters Score = +1/letter
     Words containing 5-letters Score = +2/letter
     Words containing 6-letters Score = +3/letter
     Words containing 7-letters Score = +5/letter
     Words containing 8+-letters Score = +11/letter
