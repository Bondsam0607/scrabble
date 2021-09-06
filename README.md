# scrabble

## How to run?
1. modify the `board.txt` file in the resourcefolder
2. cd `src` directory, run `make` to generate `.class` files
3. run `java edu.duke.cs201.core.drawBoard`

## Format of `board.txt`
1. use '*' to represent blank blocks
2. use letters to represent letter blocks

## Example

```
* * * * * * * * * *
* * * * A * * * * *
* * * * B * * * * *
* * * * O * * * * *
* * * * U * * * * *
* * * * T E A C H *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
```

A `board.txt` as above will generate a board as below.

![board](board.png)
