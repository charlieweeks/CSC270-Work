# Alexandre Dumas, *The Count of Monte Cristo*

A citable digital edition.

**Status**: <span style="color: red;">In progress</span>.

## Bibliography

*The Count of Monte Cristo*, By Alexandre Dumas. Language: English. Anonymous translation first published by Chapman and Hall in 1864. Original (French) published August 28th, 1844 through January 15th, 1846, serialization.

Plain-text, citable edition following the protocols of the [CITE Architecture](http://cite-architecture.org).

Edited 11/1/2019.


## Character Validation

This text includes some phrases and quotes in other languages (French, Greek, Latin, etc.). It also includes formal names for people and places which are not anglicized. Please keep the non-English characters in mind when choosing a typeface to render this text. The following is a complete inventory of the characters present in this text:


##### Format: `character` (Unicode hex)


| Character | Character | Character | Character | Character |
|-----------|-----------|-----------|-----------|-----------|
| `space` (20) | `!` (21) | `&` (26) | `(` (28) | `)` (29) |
| `,` (2c) | `-` (2d) | `.` (2e) | `0` (30) | `1` (31) |
| `2` (32) | `3` (33) | `4` (34) | `5` (35) | `6` (36) |
| `7` (37) | `8` (38) | `9` (39) | `:` (3a) | `;` (3b) |
| `?` (3f) | `A` (41) | `B` (42) | `C` (43) | `D` (44) |
| `E` (45) | `F` (46) | `G` (47) | `H` (48) | `I` (49) |
| `J` (4a) | `K` (4b) | `L` (4c) | `M` (4d) | `N` (4e) |
| `O` (4f) | `P` (50) | `Q` (51) | `R` (52) | `S` (53) |
| `T` (54) | `U` (55) | `V` (56) | `W` (57) | `X` (58) |
| `Y` (59) | `Z` (5a) | `[` (5b) | `]` (5d) | `_` (5f) |
| `a` (61) | `b` (62) | `c` (63) | `d` (64) | `e` (65) |
| `f` (66) | `g` (67) | `h` (68) | `i` (69) | `j` (6a) |
| `k` (6b) | `l` (6c) | `m` (6d) | `n` (6e) | `o` (6f) |
| `p` (70) | `q` (71) | `r` (72) | `s` (73) | `t` (74) |
| `u` (75) | `v` (76) | `w` (77) | `x` (78) | `y` (79) |
| `z` (7a) | `Æ` (c6) | `É` (c9) | `à` (e0) | `â` (e2) |
| `æ` (e6) | `ç` (e7) | `è` (e8) | `é` (e9) | `ê` (ea) |
| `ë` (eb) | `í` (ed) | `î` (ee) | `ï` (ef) | `ô` (f4) |
| `ü` (fc) | `Œ` (152) | `œ` (153) | `Ε` (395) | `Π` (3a0) |
| `α` (3b1) | `δ` (3b4) | `ε` (3b5) | `ζ` (3b6) | `η` (3b7) |
| `κ` (3ba) | `μ` (3bc) | `ν` (3bd) | `ο` (3bf) | `π` (3c0) |
| `ρ` (3c1) | `ς` (3c2) | `σ` (3c3) | `τ` (3c4) | `υ` (3c5) |
| `ἄ` (1f04) | `ἡ` (1f21) | `ἰ` (1f30) | `ὄ` (1f44) | `ὲ` (1f72) |
| `έ` (1f73) | `ή` (1f75) | `ὶ` (1f76) | `ί` (1f77) | `ὸ` (1f78) |
| `ό` (1f79) | `ῖ` (1fd6) | `—` (2014) | `‘` (2018) | `’` (2019) |
| `“` (201c) | `”` (201d) | `†` (2020) |

## Digital Edition Information
There is a human-readable HTML site, derived from the `.cex` file, in `html/`. The scripts that generated that site are in `/src/main/scala/`.

Included Scala scripts take advantage of the code libraries in the [CITE Architecture](http://cite-architecture.org).

This version of this text is [in the Public Domain](http://creativecommons.org/publicdomain/zero/1.0/):

![license](http://i.creativecommons.org/p/zero/1.0/88x31.png)

Edited, 12/17/2019

## Running Scripts for Validation, Publication, and Analysis

This repository is an SBT project for running Scala code. Everything should be reproducible.

### Requirements

- A Java JDK 1.8 or higher.
- [SBT](https://www.scala-sbt.org) Installed and on the PATH.

### Running

- Clone this repository.
- Navigate to this repository's root level.
- `$ sbt console`
- `scala> :load scripts/character-validation.sc`
- etc.
