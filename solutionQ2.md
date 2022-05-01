### Hisui's New Power Plant

**Requested By: Professor Laventon**

## Question:
The Galaxy Team has decided that in order to advance the research on Pokemon and the Pokedex, Jubilife village needs a brand new power plant. Luckily, Professor Laventon has discovered that the Pokemon, Voltorb, is the best candidate to help power the village.

Voltorbs can cleanly and efficiently produce electricity. An average Voltorb is about 0.5m (1'08") tall and weighs 10.4 kg (22.8lbs). However, they are uncommon and are only found in the Sacred Plaza.

Objective: How many Voltorbs will you need to catch to fully power the village. Describe each step in your thought process.

## This is my solution to question 2.

# In order to solve this question we first need to declare our parameters of interest:
- [ ] How much energy output can a single Voltorb provide (Wattage)?
- [ ] What's the height, weight of each Voltorb (provided in the question)?
- [ ] What's the village's population (person)?
- [ ] What's the village's average energy consumption rate Wattage/(per m^2, per household)/(day, week, month, year)?
- [ ] Do you think Voltorbs need to rest after reaching their working capacities? If so, what's the recharge time of Voltorbs (that is, how long can they work without rest and how long do they need to recharge) (hours)?

# After identifying our parameters, we should then investigate the values of the parameters in question. After a brief research and brainstorming, this is what I got (using Imperial Units):
- Based on Hisuian Voltorb's stats, we can assume its attack power to be its voltage output, which is 109 Watts.
- Voltorb's height is 0.5m, weight is 10.4kg. 
- The Recruit/catch rate for Voltorbs is 8.1%. So let's assume that if one person would spend 24 hours trying to catch Voltorb near power plants, he/she/they would likely to catch (24 * 0.081 =) 1.944 Voltorbs (rounding down to 1 Voltorb). This means that it requires 1 person a full day to catch 1 Voltorb!
- The dimensions of the new power plants Voltorb area can be assigned as a cube, so let's assume the value to be **V** (m^3).
- The village population is 87 personnel.
- Average energy consumption per household per year is 10,715 kWh.
- If the Voltorbs need to rest (obviously because they are living organisms), then let's use Voltorb's base Stamina as a unit of measure for its discharge and recharge time. The Bulbapedia mentioned that Voltorbs have a Base Stamina of 120. Let's convert it to minutes, which will yield us a discharge/recharge time of 120/60 = 2 (hours).
- Hisuian Voltorbs evolve into Electrodes, which have increased stats. Base Stamina is 155/60 = 2.58 hours (2 hours + 35 minutes), Base Attack (Wattage) is 176 Watts.

# Now to the part we devise a strategy to find how many Voltorbs are required for the power plant.

Based on my calculations: we first need to get the whole population's power consumption per day: (10,715,100 * 87) / (365) = 2554010 **Watts**

Therefore, a simple division would give us the total number of Voltorbs (working 24/7) required for powering Jubilife Village: roundUp(2554010 / 109) = 23432 (Common Voltorbs)

Because of the recharge-discharge time, our number of Voltorbs increase even further (!!!). Simply if we only need 2-hour-stop-labour-abuse-system then (23432 * 2) = 46862 Voltorbs should be sufficient (Everytime one pot of Voltorb's 2-hour-shift ends, the other pot starts immedietaly, and vice-versa). But that's risky since Voltorbs have a tendency to ***Randomly Explode in your face*** so we should always have more than 2 pots -> total of (23432 * 3) = 70296. 

## Personal inquiry ##

- [ ] What are the dimensions the new power plant's Voltorb area needs to be (height, circumference, and shape)?
- [ ] What's the "recruit"/catch rate of the Voltorb?
- [ ] If the Voltorbs evolve, do they increase their electricity output?
- [ ] *Can the village profit from selling/outsourcing electricty from the Voltorb Power Plant if the power plant is producing extra electricity? Should they?*
- [ ] ***IS IT ETHICAL TO TRAP POKEMONS IN A NEVER-ENDING CYCLE OF LABOROUS WORK???***

- Next comes the question of how big should the power plant be for the Voltorbs to be residing and working in there. This might be answered from different perspective.
Personally, I would like to maximize Voltorbs' chances of **NOT EXPLODING** we should create pots that have good breathing space for the Voltorbs, which means that Voltorbs should keep a distance equal to their circumference (height - they are spheres!) from each other and from the walls. Therefore, our cubic/rectangular prism should be of Volume of [(2n + 1) * 0.5]^2 * height(0.5 * 2). So we have 3 pots in total:
- If we want a horizontally built power plant: 3 * [(2n + 1) * 0.5]^2 * 1, where n = total number of Voltorbs.
- If we want a verticall stacked power plant: [(2n + 1) * 0.5]^2 * (1 * 3), where n = total number of Voltorbs. (Seems like there's no difference...)

**Explanation**

we want the Voltorbs to distance themselves from each other and the wall so (Wall: #, distance: -, Voltorb: @)
Example:

##############

#- - - - - - - - - - -#

#-@-@-@-@-@-#

#-@-@-@-@-@-#

#-@-@-@-@-@-#

#-@-@-@-@-@-#

#-@-@-@-@-@-#

#- - - - - - - - - - -#

##############

Therefore, we have a vertical power plant that is: 1.64724616875 km^3

- How long should it take the workers to collect the Voltorbs?
Since we require over 70000 Voltorbs for a stable power plant, the village should have at least 100 Pokemon Trainers/Workers collecting Voltorbs 8 hours a day (with 8.1% success rate), finding Voltorbs, and thus giving us a total of [70000 / (100 * 8(hours) * 0.081)] / 365 (days) = 2.95 years of collecting the Voltorbs.

- We can also calculate the Electrodes' power capacity based on our above calculations, but let's not go into too much details since all the Voltorbs don't suddenly evolve at the same time! 

- If there are many Electrodes evolved in the power plant, then the town can actually profit from their spare electricity to adjacent towns! ($$$ PROFIT BABYYY)

### However good this setup for a clean and sustainable power plant is, it is NOT acceptable to use Pokemons as an extensive labour force since it is extremely unethical in the Pokemon-verse! ###










