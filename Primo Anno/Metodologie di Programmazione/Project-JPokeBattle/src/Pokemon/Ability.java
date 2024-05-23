package Pokemon;

import java.util.ArrayList;
import java.util.Arrays;

/*
    * Classe che rappresenta le abilità dei pokemon
    * Ogni abilità ha un nome, un tipo e una forza
*/

public class Ability {
    private String name;
    private String typo;
    private int strength;

    public Ability(String name, String typo, int strength) {
        this.name = name;
        this.typo = typo;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getTypo() {
        return typo;
    }

    public int getStrength() {
        return strength;
    }

    public static ArrayList<Ability> getAbility(int index, int level) {
        switch (index) {
            case 1: // Bulbasaur
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability>(Arrays.asList(
                        new Ability("Tackle", "Normal", 40),
                        new Ability("Growl", "Normal", 40)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Leech Seed", "Grass", 10)
                    ));
                } else if (level >= 13 && level < 20) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Leech Seed", "Grass", 10),
                            new Ability("Vine Whip", "Grass", 45)
                    ));
                } else if (level >= 20) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Leech Seed", "Grass", 10),
                            new Ability("Vine Whip", "Grass", 45),
                            new Ability("Poison Powder", "Poison", 0)
                    ));
                }
            case 2: // Ivysaur
                if (level >= 13 ) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Leech Seed", "Grass", 10),
                            new Ability("Vine Whip", "Grass", 45),
                            new Ability("Poison Powder", "Poison", 0),
                            new Ability("Razor Leaf", "Grass", 55),
                            new Ability("Sweet Scent", "Normal", 0)
                    ));
                }
            case 3: // Venusaur
                if (level >= 7 ) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Leech Seed", "Grass", 10),
                            new Ability("Vine Whip", "Grass", 45),
                            new Ability("Poison Powder", "Poison", 0),
                            new Ability("Razor Leaf", "Grass", 55),
                            new Ability("Sweet Scent", "Normal", 0),
                            new Ability("Growth", "Normal", 0)
                    ));
                }
            case 4: // Charmander
                if (level >= 1 && level < 9) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 40)
                    ));
                } else if (level >= 9 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Ember", "Fire", 40)
                    ));
                } else if (level >= 13 && level < 20) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Ember", "Fire", 40),
                            new Ability("Smokescreen", "Normal", 0)
                    ));
                } else if (level >= 18) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Ember", "Fire", 40),
                            new Ability("Smokescreen", "Normal", 0),
                            new Ability("Dragon Rage", "Dragon", 40)
                    ));
                }
            case 5: // Charmeleon
                 if (level >= 9 && level < 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Ember", "Fire", 40),
                            new Ability("Smokescreen", "Normal", 0),
                            new Ability("Dragon Rage", "Dragon", 40),
                            new Ability("Scary Face", "Normal", 0)
                    ));
                } else if (level >= 15 ) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Ember", "Fire", 40),
                            new Ability("Smokescreen", "Normal", 0),
                            new Ability("Dragon Rage", "Dragon", 40),
                            new Ability("Scary Face", "Normal", 0),
                            new Ability("Fire Fang", "Fire", 65)
                    ));
                }
            case 6: // Charizard
                if (level >= 17 ) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 40),
                            new Ability("Ember", "Fire", 40),
                            new Ability("Smokescreen", "Normal", 0),
                            new Ability("Dragon Rage", "Dragon", 40),
                            new Ability("Scary Face", "Normal", 0),
                            new Ability("Fire Fang", "Fire", 65),
                            new Ability("Air Slash", "Flying", 75),
                            new Ability("Inferno", "Fire",
                                    100) ));
                }
            case 7: // Squirtle
                if (level >= 1 && level < 8) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0)
                    ));
                } else if (level >= 8 && level < 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Water Gun", "Water", 40)
                    ));
                } else if (level >= 15 && level < 22) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Water Gun", "Water", 40),
                            new Ability("Bite", "Dark", 60)
                    ));
                } else if (level >= 23) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Water Gun", "Water", 40),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Aqua Tail", "Water", 90)
                    ));
                }
            case 8: // Wartortle
                 if (level >= 8 && level < 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Water Gun", "Water", 40),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Aqua Tail", "Water", 90),
                            new Ability("Withdraw", "Water", 0)
                    ));
                } else if (level >= 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Water Gun", "Water", 40),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Aqua Tail", "Water", 90),
                            new Ability("Withdraw", "Water", 0),
                            new Ability("Skull Bash", "Normal", 130)
                    ));
                }
            case 9: // Blastoise
                if (level >= 8 && level < 16) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Water Gun", "Water", 40),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Aqua Tail", "Water", 90),
                            new Ability("Withdraw", "Water", 0),
                            new Ability("Skull Bash", "Normal", 130),
                            new Ability("Rain Dance", "Water", 0)
                    ));
                } else if (level >= 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Water Gun", "Water", 40),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Aqua Tail", "Water", 90),
                            new Ability("Withdraw", "Water", 0),
                            new Ability("Skull Bash", "Normal", 130),
                            new Ability("Rain Dance", "Water", 0),
                            new Ability("Hydro Pump", "Water", 110)
                    ));
                }
            case 10: // Caterpie
                if (level >= 1 && level < 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("String Shot", "Bug", 0)
                    ));
                } else if (level >= 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("String Shot", "Bug", 0),
                            new Ability("Bug Bite", "Bug", 60)
                    ));
                }
            case 11: // Metapod
                if (level >= 1) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Harden", "Normal", 0)
                    ));
                }
            case 12: // Butterfree
                if (level >= 15 && level < 17) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Confusion", "Psychic", 50),
                            new Ability("Gust", "Flying", 40),
                            new Ability("Poison Powder", "Poison", 0)
                    ));
                } else if (level >= 17) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Confusion", "Psychic", 50),
                            new Ability("Gust", "Flying", 40),
                            new Ability("Poison Powder", "Poison", 0),
                            new Ability("Sleep Powder", "Grass", 0)
                    ));
                }
            case 13: // Weedle
                if (level >= 1 && level < 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("String Shot", "Bug", 0)
                    ));
                } else if (level >= 15) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("String Shot", "Bug", 0),
                            new Ability("Bug Bite", "Bug", 60)
                    ));
                }
            case 14: // Kakuna
                if (level >= 1) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Harden", "Normal", 0)
                    ));
                }

            case 15: // Beedrill
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("String Shot", "Bug", 0),
                            new Ability("Fury Attack", "Normal", 15),
                            new Ability("Focus Energy", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("String Shot", "Bug", 0),
                            new Ability("Fury Attack", "Normal", 15),
                            new Ability("Focus Energy", "Normal", 0),
                            new Ability("Twineedle", "Bug", 25)
                    ));
                }
            case 16: // Pidgey
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Gust", "Flying", 40)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Gust", "Flying", 40),
                            new Ability("Quick Attack", "Normal", 40)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Gust", "Flying", 40),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Whirlwind", "Normal", 0)
                    ));
                }
            case 17: // Pidgeotto
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Gust", "Flying", 40),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Whirlwind", "Normal", 0),
                            new Ability("Twister", "Dragon", 40)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Gust", "Flying", 40),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Whirlwind", "Normal", 0),
                            new Ability("Twister", "Dragon", 40),
                            new Ability("Feather Dance", "Flying", 0)
                    ));
                }
            case 18: // Pidgeot
                if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Gust", "Flying", 40),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Whirlwind", "Normal", 0),
                            new Ability("Twister", "Dragon", 40),
                            new Ability("Feather Dance", "Flying", 0),
                            new Ability("Agility", "Psychic", 0),
                            new Ability("Air Slash", "Flying", 75)
                    ));
                }
            case 19: // Rattata
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Hyper Fang", "Normal", 80)
                    ));
                }
            case 20: // Raticate
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Hyper Fang", "Normal", 80),
                            new Ability("Focus Energy", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Hyper Fang", "Normal", 80),
                            new Ability("Focus Energy", "Normal", 0),
                            new Ability("Sucker Punch", "Dark", 70)
                    ));
                }
            case 21: // Spearow
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Growl", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Leer", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Fury Attack", "Normal", 15)
                    ));
                }
            case 22: // Fearow
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Fury Attack", "Normal", 15),
                            new Ability("Pursuit", "Dark", 40)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Fury Attack", "Normal", 15),
                            new Ability("Pursuit", "Dark", 40),
                            new Ability("Mirror Move", "Flying", 0)
                    ));
                }
            case 23: // Ekans
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Wrap", "Normal", 15),
                            new Ability("Leer", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Wrap", "Normal", 15),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Poison Sting", "Poison", 15)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Wrap", "Normal", 15),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Bite", "Dark", 60)
                    ));
                }
            case 24: // Arbok
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Wrap", "Normal", 15),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Glare", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Wrap", "Normal", 15),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Glare", "Normal", 0),
                            new Ability("Screech", "Normal", 0)
                    ));
                }
            case 25: // Pikachu
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Thundershock", "Electric", 40),
                            new Ability("Growl", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Thundershock", "Electric", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Thundershock", "Electric", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Electro Ball", "Electric", 60)
                    ));
                }
            case 26: // Raichu
                if (level >= 1) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Thundershock", "Electric", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Electro Ball", "Electric", 60),
                            new Ability("Double Team", "Normal", 0),
                            new Ability("Thunderbolt", "Electric", 90)
                    ));
                }

            case 27: // Sandshrew
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40)
                    ));
                } else if (level >= 6 && level < 10) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Defense Curl", "Normal", 0)
                    ));
                } else if (level >= 10) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Defense Curl", "Normal", 0),
                            new Ability("Sand Attack", "Ground", 0)
                    ));
                }
            case 28: // Sandslash
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Defense Curl", "Normal", 0),
                            new Ability("Sand Attack", "Ground", 0),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Rollout", "Rock", 30)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Defense Curl", "Normal", 0),
                            new Ability("Sand Attack", "Ground", 0),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Rollout", "Rock", 30),
                            new Ability("Swift", "Normal", 60)
                    ));
                }
            case 29: // Nidoran♀
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Growl", "Normal", 0),
                            new Ability("Tackle", "Normal", 40)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Tackle", "Normal", 40)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Poison Sting", "Poison", 15)
                    ));
                }
            case 30: // Nidorina
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Bite", "Dark", 60)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Fury Swipes", "Normal", 18)
                    ));
                }
            case 31: // Nidoqueen
                if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Scratch", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Tackle", "Normal", 40),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Fury Swipes", "Normal", 18),
                            new Ability("Body Slam", "Normal", 85),
                            new Ability("Superpower", "Fighting", 120)
                    ));
                }
            case 32: // Nidoran♂
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Leer", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Focus Energy", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Focus Energy", "Normal", 0),
                            new Ability("Horn Attack", "Normal", 65)
                    ));
                }
            case 33: // Nidorino
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Focus Energy", "Normal", 0),
                            new Ability("Horn Attack", "Normal", 65),
                            new Ability("Double Kick", "Fighting", 30)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Focus Energy", "Normal", 0),
                            new Ability("Horn Attack", "Normal", 65),
                            new Ability("Double Kick", "Fighting", 30),
                            new Ability("Poison Sting", "Poison", 15)
                    ));
                }
            case 34: // Nidoking
                if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Peck", "Flying", 35),
                            new Ability("Leer", "Normal", 0),
                            new Ability("Focus Energy", "Normal", 0),
                            new Ability("Horn Attack", "Normal", 65),
                            new Ability("Double Kick", "Fighting", 30),
                            new Ability("Poison Sting", "Poison", 15),
                            new Ability("Thrash", "Normal", 120),
                            new Ability("Earth Power", "Ground", 90)
                    ));
                }
            case 35: // Clefairy
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Growl", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Sing", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Sing", "Normal", 0),
                            new Ability("Double Slap", "Normal", 15)
                    ));
                }
            case 36: // Clefable
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Sing", "Normal", 0),
                            new Ability("Double Slap", "Normal", 15),
                            new Ability("Minimize", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Growl", "Normal", 0),
                            new Ability("Sing", "Normal", 0),
                            new Ability("Double Slap", "Normal", 15),
                            new Ability("Minimize", "Normal", 0),
                            new Ability("Metronome", "Normal", 0)
                    ));
                }
            case 37: // Vulpix
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Ember", "Fire", 40),
                            new Ability("Tail Whip", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Ember", "Fire", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Ember", "Fire", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Will-O-Wisp", "Fire", 0)
                    ));
                }
            case 38: // Ninetales
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Ember", "Fire", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Will-O-Wisp", "Fire", 0),
                            new Ability("Confuse Ray", "Ghost", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Ember", "Fire", 40),
                            new Ability("Tail Whip", "Normal", 0),
                            new Ability("Quick Attack", "Normal", 40),
                            new Ability("Will-O-Wisp", "Fire", 0),
                            new Ability("Confuse Ray", "Ghost", 0),
                            new Ability("Flamethrower", "Fire", 90)
                    ));
                }
            case 39: // Jigglypuff
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Sing", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Sing", "Normal", 0),
                            new Ability("Disable", "Normal", 0)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Sing", "Normal", 0),
                            new Ability("Disable", "Normal", 0),
                            new Ability("Defense Curl", "Normal", 0)
                    ));
                }
            case 40: // Wigglytuff
                if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Sing", "Normal", 0),
                            new Ability("Disable", "Normal", 0),
                            new Ability("Defense Curl", "Normal", 0),
                            new Ability("Double Slap", "Normal", 15)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Pound", "Normal", 40),
                            new Ability("Sing", "Normal", 0),
                            new Ability("Disable", "Normal", 0),
                            new Ability("Defense Curl", "Normal", 0),
                            new Ability("Double Slap", "Normal", 15),
                            new Ability("Body Slam", "Normal", 85)
                    ));
                }
            case 41: // Zubat
                if (level >= 1 && level < 7) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Leech Life", "Bug", 20),
                            new Ability("Supersonic", "Normal", 0)
                    ));
                } else if (level >= 7 && level < 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Leech Life", "Bug", 20),
                            new Ability("Supersonic", "Normal", 0),
                            new Ability("Astonish", "Ghost", 30)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Leech Life", "Bug", 20),
                            new Ability("Supersonic", "Normal", 0),
                            new Ability("Astonish", "Ghost", 30),
                            new Ability("Bite", "Dark", 60)
                    ));
                }
            case 42: // Golbat
                if (level >= 7 && level <= 14) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Leech Life", "Bug", 20),
                            new Ability("Supersonic", "Normal", 0),
                            new Ability("Astonish", "Ghost", 30),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Wing Attack", "Flying", 60)
                    ));
                } else if (level >= 13) {
                    return new ArrayList<Ability> (Arrays.asList(
                            new Ability("Leech Life", "Bug", 20),
                            new Ability("Supersonic", "Normal", 0),
                            new Ability("Astonish", "Ghost", 30),
                            new Ability("Bite", "Dark", 60),
                            new Ability("Wing Attack", "Flying", 60),
                            new Ability("Air Cutter", "Flying", 60)
                    ));
                }
            default:
                return null;
        }
    }
}
