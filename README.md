# Better Breeding Redux #

Based loosely around ideas from the original [Better Breeding mod](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/1286295-1-6-4-forge-better-breeding-mod) by senpaisubaraki, Better Breeding Redux intends to expand on Vanilla breeding mechanics.

----
# THIS WORK IS VERY MUCH A WORK IN PROGRESS #
### Thank you very much for your patience as planned features are implemented. ###

----

## Planned Features ##
* Tiered breeding for Vanilla animals including pigs, cows, chickens and sheep.
 * Lengthened maturation times for all affected animals.
 * Increases in meat production for all affected animals.
 * An entirely new butchering mechanic.

## The Low-Down ##
Better Breeding was a mod for 1.6.4, but is no longer being maintained (for the past two years).  It had some very interesting concepts in it, such as taking Vanilla breeding farther so that there would be more breeds of cows, pigs, sheep, and dogs, each with their own special drop rates.

But since it’s been gone for 2 years, Minecraft 1.7.10 has come and is slowly being replaced by 1.8 now.  The goal of Better Breeding Redux is to not only resurrect, but completely rewrite Better Breeding, hence the "Redux" part.  Better Breeding Redux will support Minecraft 1.8.  There are no plans to support Minecraft versions prior to 1.8.

----

Through Better Breeding Redux, the breeding of animals occurs the same as in Vanilla.  For example, you feed two cows wheat and they make a calf.  Rarely, breeding would yield a better offspring.  From here, each animal can vary from Vanilla versions in three different ways.

## Primary Mechanics ##

### Maturation Rate ###
BBRedux will firstly affect the speed at which baby animals mature into an adults.  In BBRedux, baby animals mature significantly more slowly than Vanilla by default.  Maturation is still a single-step process.  Like Vanilla, there's no progression, just a jump from being a baby to being an adult.  As breeding produces better and better stock, the maturation time will decrease.  (Speeds have not yet been determined).

### Primary Production Rate ###
Secondly, BBRedux will affect the production rate of things like eggs, feathers, wool, and milk by live animals.  This will be referred to as the "Primary Production rate."  The better the stock of animal, the faster an animal's primary produce either drops (eggs and feathers) or can be collected (milk), or the more is obtained when collected (wool).

**Note:** In Dogs and Cats, this will affect the amount of damage the animal deals when attacking other creatures. 

### Secondary Production Rate ###
Thirdly, BBRedux will affect the amount of meat that can be collected from a farm animal.  Meat is now obtained by butchering the carcass of an animal (more on this butchering mechanic later).  The higher tier animal, the more meat can be obtained from its carcass.  It's intended that a single cow with a Tier 7 Secondary Production Rate will feed a single very active player long enough to wait for a new cow to mature.  Due to balance, these values will likely require several changes as development progresses.

**Note:** Dogs and Cats, while still obtaining this third value, will not use it.

### Skinning and Butchering ###
By obtaining a carcass of a farm animal (including pigs, cows, sheep, rabbits, and chickens), one will be able to obtain skins and meats appropriate to the type of animal.  In its final iterations, skinning and butchering wille be performed by placing the animal in a butchering table with, first, a skinning knife.

#### Skinning Knife ####
The skinning knife can be made of stone, flint, or any Vanilla metal.  It is used to skin the carcasses of animals, removing and recovering leather from cows, hide from rabbits, and feathers from chickens, and also preparing it for butchering.

When skinning is finished, the skinned carcass will be able to be placed into a table with the butcher knife.

#### Butcher Knife ####
Like the skinning knife, the butcher knife can be made of stone, flint, or any Vanilla metal. By placing the knife into a Butcher Table with any skinned corpse, the player will be able to obtain beef from cows, pork from pigs, rabbit meat (not raw rabbit) from rabbits, and chicken meat (not raw chicken) from chickens.

##### Early Versions #####
Due to limitations of my modding knowledge, early versions of BBRedux will instead use a crafting mechanic that involves the crafting table.  Instead of having two separate tools which can be placed simultaneously into a special butcher table, there will be a single tool (the butcher knife), which will be placed into the crafting grid with a carcass.  A single crafting action will skin the carcass, leaving the damaged butcher knife in the table with a skinned carcass.  The next crafting action will allow the player to obtain the appropriate animal meat.

## Secondary Mechanics ##
### Dung ###
Yes, that's right.  Dung.  All animals shed dung.  For all animals except the pig, dog, and cat, animal dung will be able to be used a-la bone meal, but also when it despawns it will automagically fertilize the block it's on (provided the block it despawns on is capable of being fertilized.  The higher, over all, the tier of animal (sum of all values that determine tier), the better its efficiency when used.  A single piece of dung will be able to fertilize any where from 0.5 block radius (1 block) to a 2.5 block radius (5 x 5 square).

### Additional Meat Variants ###
With suitably high overall tier, the offspring of a sheep or cow will become capable of being slaughtered for a lamb or calf carcass.  This presents the capability to obtain lamb meat and veal.
