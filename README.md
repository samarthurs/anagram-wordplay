# Anagram #

An anagram is a type of word play, the result of rearranging the letters of a word or phrase to produce a new word or phrase, using all the original letters exactly once; for example, the word anagram can be rearranged into nag-a-ram.

## Examples ##
* William Shakespeare = I am a weakish speller
* Helmuth Elsner = me run the shell
* Computer = mute proc = CPU metro
* Visual Studio = loud USA visit = it’s usual void
* Wareneingang = gain new range = earn gang wine = eager wanning = aging earn new

## Task ##

Given a file containing one word per line and a search phrase, print out all the combinations of words that are anagrams of the search phrase.

* Letter  case does not matter. 
* Special characters should be ignored. 
* Ignore short dictionary words (those having only one or two letters).


## Examples ## 
```
C:\Temporary\Anagram>Anagram.exe .\wordlist.txt "Best Secret"
Anagrams of "Best Secret"
beet crests
beets crest
beret sects
berets sect
beset crest
best erects
best secret
bests crete
bests erect
bet erst sec
bet rest sec
bet secrets
bets erects
bets secret
better cess
betters sec
Execution time: 0.110 seconds
```

```
C:\Temporary\Anagram>Anagram.exe .\wordlist.txt "IT-Crowd"
Anagrams of "IT-Crowd"
cod writ
cord wit
cow dirt
doc writ
tic word
Execution time: 0.017 seconds
```

```
C:\Temporary\Anagram>Anagram.exe .\wordlist.txt "Aschheim"
Anagrams of "Aschheim"
aches him
ash chime
chase him
chime has
hash mice
hic shame
mice shah
Execution time: 0.074 seconds
```

WORDLIST.TXT im Anhang
