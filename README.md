# Problem Set 10

These disjointed sets of exercises are getting pretty boring. Let's get back to doing something real. You'll still need those array and `ArrayList` skills, so don't throw them away just yet.

We'll be building a dictionary app. It's not the flashiest thing in the world, but it requires you to implement some important programming concepts. Plus, it's going to be a graphical app, so that's always fun!

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-10`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.
```
$ cd ~/Desktop/APCSA
```
3. There's nothing to clone this time, unless you want a local copy of the `README`. Change into your newly created `pset-10` directory.
```
$ cd pset-10
```
4. Since we didn't clone anything, it's up to you to create your repository from scratch.
```
git init
git remote add origin git@github.com:YOUR-USERNAME/pset-10.git
```
5. It's also up to you to create the project in your editor of choice (i.e., Eclipse, VSCode, etc.).

Read through the requirements and specifications below and get to work!

## Requirements

We've all been to the online dictionary by Merriam-Webster. Well, consider this a desktop version of that. The app will have a list of words, which users can search through. Selecting a word will show the user its definition(s), part(s) of speech, sample sentence(s), and synonyms.

### Structure

There are a few different ways to build GUIs in Java, and you're welcome to use any framework you'd like. Here are a couple popular choices.

* Swing
* JavaFX

Oracle provides thorough [documentation and tutorials](https://docs.oracle.com/javase/8/javase-clienttechnologies.htm) for both of these.

Here's a sample of what the basic layout of the app should look like. Feel free to make it your own and enhance this wireframe as needed.

#### Main View

![App Main](https://github.com/ap-java-ucvts/pset-10-skeleton/blob/master/images/mockup-main.png)

### Add View

![App Add](https://github.com/ap-java-ucvts/pset-10-skeleton/blob/master/images/mockup-add.png)

### Remove View

![App Remove](https://github.com/ap-java-ucvts/pset-10-skeleton/blob/master/images/mockup-remove.png)

### Selecting a Word

When you select a word in the sidebar, it should display the details of that word in the main panel. The details include:

* Word
* Definitions (there will likely be more than one)
* Parts of speech (for each definition)
* Synonyms
* Antonyms

If more than one word (or no word at all) is selected, display an appropriate placeholder message of your choosing.

### Adding Words

Users may add words to the dictionary. To do so, click the `Add` button. This will open a form in the main panel where users can enter the word, its definitions and parts of speech, and its synonyms.

After entering the word details, click the `Add` button in the main panel (not the one in the sidebar). The word should appear in the list.

### Removing Words

Users may remove one or more words at a time from the dictionary. To remove a word (or words), highlight the desired word or words and click the `Remove` button. A message dialog box should appear and ask the user to confirm his or her desire to remove the word or words.

### Searching for a Word

Users may search for a specific word in the dictionary by typing the word into the textbox. As the user types, the list should update itself to display matches. Partial matches should be supported.

For example, suppose the list contains `Apple`, `Application`, `Basket`, and `Cartwheel`. If the user types `app` into the textbox, the list should update itself in real time to display only `Apple` and `Application`. Searches should be case-insensitive.

There are many built-in search fuctions in Java. Unfortunately, you aren't permitted to use any of them. Pick a search algorithm (linear or binary) and implement it yourself.

### Sorting the Dictionary

There are two checkboxes to sort the dictionary in either ascending or descending order. Only one checkbox can be selected at a time. When a user selects `Asc`, the list should sort itself ascending. Likewise, when a user selects `Desc`, the list should sort itself descending.

There are many built-in sorting fuctions in Java. Unfortunately, you aren't permitted to use any of them. Pick a sorting algorithm (selection, insertion, bubble, or merge) and implement it yourself.

### Data

I've provided you with a list of 100 words (including definitions, parts of speech, synonyms, and antonyms). It's in the `words.json` file, which is a JSON-formatted document.

There are many ways to programmatically read data formatted in this manner into your applications, and it's up to you to choose how you'll do this. If you've got no idea how to tackle this proble, [the Gson library](https://github.com/google/gson) is a good place to start.

You'll be responsible for persisting any changes you make to the data (i.e., if a user adds or removes a word). Any library that can read JSON data will almost certainly be able to write it, too.

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

* February 23, 2020, at 11:59pm.

If you submit your problem set at midnight (i.e., February 24, 2020, at 12:00am), it is considered **late**!

### Submission Requirements

* Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
* There must be **at least** 50 unique commits to your repository.
* Your code must meet each requirement outlined in the *Requirements* section.
* Your code must adhere to the course style guidelines.

Happy coding!
