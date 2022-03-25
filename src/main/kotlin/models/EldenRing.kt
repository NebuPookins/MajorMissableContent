package models

private val goUpGrandLiftOfDectus = OneWayDoor("Don't go up the Grand Lift of Dectus.")
private val dont2ndVolcanoManor = OneWayDoor("Don't complete the 2nd Volcano Manor contract; Don't kill Rykard.")
private val completeVolcanoManorContracts = OneWayDoor("Don't complete all Volcano Manor contracts; Don't kill Rykard.")
private val exploreMountaintopsOfTheGiants = OneWayDoor("Don't explore Mountaintops of the Giants.")

private val ryasQuestLine = QuestLine(
	name = "Rya's Quest",
	items = listOf(
		QuestStep("Exhaust dialog with Ria in Liurnia of the Lakes, and agree to retrieve her necklace."),
		QuestStep("Acquire necklace non-violently."),
		QuestStep("Give Necklace to Ria."),
		goUpGrandLiftOfDectus,
		QuestStep("Exhaust dialog with Ria at top of Grand Lift of Dectus and agree to go to Volcano Manor."),
		QuestStep("Find and complete first Volcano Manor contract."),
		QuestStep("Exhaust dialog with Zorayas in Volcano Manor."),
		QuestStep("Exhaust dialog with Lady Tanith in in Volcano Manor."),
		dont2ndVolcanoManor,
		QuestStep("Complete second Volcano Manor contract."),
		QuestStep("Exhaust dialog with Zorayas. She should ask you to investigate the room next door."),
		QuestStep("Investigate the room next door until you reach the Prison Town Church grace."),
		QuestStep("Exhaust dialog with Zorayas."),
		QuestStep("Exhaust dialog with Lady Tanith."),
		QuestStep("Explore past Prison Town Church grace until you get Serpent's Amnion."),
		QuestStep("Give Serpent's Amnion to Zorayas."),
		QuestStep("Exhaust dialog with Lady Tanith."),
		QuestStep("Exhaust dialog with Zorayas in Legacy Dungeon. There are multiple endings for you to choose among."),
		completeVolcanoManorContracts,
	)
)

private val bernahlQuestline = QuestLine(
	name = "Bernahl's Quest",
	items = listOf(
		QuestStep("Exhaust dialog with Knight Bernahl in Stormhill."),
		QuestStep("Progress through Rya's quest until after completing 2nd Volcano Manor contract."),
		QuestStep("Exhaust dialog with Bernahl. Agree to help him."),
		QuestStep("Help Bernahl."),
		QuestStep("Exhaust dialog with Bernahl. You should receive Gelmir's Sorcery."),
		completeVolcanoManorContracts,
		QuestStep("Find Bernahl in Crumbling Farum Azula, and get Devourer's Scepter."),
		OneWayDoor("Defeat the boss of Crumbling Farum Azula."),
	)
)

private val fiaQuestline = QuestLine(
	name = "Fia's Quest",
	items = listOf(
		QuestStep("Exhaust dialog with Fia in Roundtable Hold."),
		goUpGrandLiftOfDectus,
		QuestStep("Rest at a grace in Altus Plateau"),
		QuestStep("Exhaust dialog with Fia. You should get a weathered dagger."),
		QuestStep("Give weathered dagger to D."),
		QuestStep("Defeat a shardbearer."),
		QuestStep("Exhaust dialog with Fia. You should get a map."),
		QuestStep("Reload Roundtable Hold."),
		QuestStep("Exhaust dialog with Fia."),
		QuestStep("Exhaust dialog with Fia in Deeproot Depths. She should ask you to find Cursemark of Death"),
		QuestStep("Find the Cursemark of Death, give it to Fia, and reload the area."),
		QuestStep("Interact with Fia."),
		QuestStep("Get the Mending Rune of the Death Prince."),
		QuestStep("Give Twinned Armor Set to NPC sitting on floor right before Valiant Gargoyle boss grace."),
		QuestStep("Interact with Fia."),
		QuestStep("Reload area."),
		QuestStep("Interact with Fia."),
		exploreMountaintopsOfTheGiants
	)
)

private val rennasQuestline = QuestLine(
	name = "Renna's Quest",
	items = listOf(
		QuestStep("Sit at three different graces in the overworld."),
		QuestStep("Accept Melina's offer."),
		QuestStep("Sit at the Church of Elleh grace at night."),
		QuestStep("Answer affirmatively to Renna's question."),
		QuestStep("Exhaust dialog with Ranni at Ranni's Rise."),
		QuestStep("Exhaust dialog with Blaidd in Siofra River."),
		QuestStep("Exhaust dialog with Seluvis to get a letter of introduction."),
		QuestStep("Exhaust dialog with Selen to find out about Radahn."),
		QuestStep("Exhaust dialog with Blaidd to find out about Radahn."),
		OneWayDoor("Don't explore Redmane Castle."),
		QuestStep("Defeat Starscourge Radahn."),
		QuestStep("Descend the star crater."),
		QuestStep("Find Finger Slayer Blade."),
		QuestStep("Give Finger Slayer Blade to Ranni."),
		QuestStep("Enter Renna's Rise and use the portal."),
		QuestStep("Collect Ranni Doll."),
		QuestStep("Exhaust dialog with Ranni doll."),
		QuestStep("Get Discarded Palace Key."),
		QuestStep("Get Dark Moon Ring."),
		QuestStep("Interact with Ranni in Cathedral of Manus Celes."),
		QuestStep("Get Dark Moon Greatsword."),
	)
)


val EldenRing = Game(
	name = "Elden Ring",
	questLines = listOf(ryasQuestLine, bernahlQuestline, fiaQuestline, rennasQuestline)
)