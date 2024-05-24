import java.util.ArrayList;
import java.util.Objects;

public class Inventory extends ToBeDeleted{

    ///                                               ITEMS


    static Item cull                     = new Item("Cull"                         , 450 , "starter"                , new Item[]{});
    static Item darkSeal                 = new Item("Dark Seal"                    , 450 , "starter"                , new Item[]{});
    static Item doransBlade              = new Item("Doran's Blade"                , 450 , "starter"                , new Item[]{});
    static Item doransRing               = new Item("Doran's Ring"                 , 450 , "starter"                , new Item[]{});
    static Item doransShield             = new Item("Doran's Shield"               , 450 , "starter"                , new Item[]{});
    static Item emberKnife               = new Item("Ember Knife"                  , 450 , "starter"                , new Item[]{});
    static Item hailBlade                = new Item("Hail Blade"                   , 450 , "starter"                , new Item[]{});
    static Item spectralSickle           = new Item("Spectral Sickle"              , 450 , "starter"                , new Item[]{});
    static Item spellthiefsEdge          = new Item("Spellthief's Edge"            , 450 , "starter"                , new Item[]{});
    static Item steelShoulderguards      = new Item("Steel Shoulderguards"         , 450 , "starter"                , new Item[]{});
    static Item tearOfTheGoddess         = new Item("Tear of the Goddess"          , 450 , "starter"                , new Item[]{});

    static Item controlWard              = new Item("Control Ward"                 , 75  , "potions and consumables", new Item[]{});
    static Item corruptingPotion         = new Item("Corrupting Potion"            , 500 , "potions and consumables", new Item[]{});
    static Item elixirOfIron             = new Item("Elixir of Iron"               , 500 , "potions and consumables", new Item[]{});
    static Item elixirOfSorcery          = new Item("Elixir of Sorcery"            , 500 , "potions and consumables", new Item[]{});
    static Item elixirOfWrath            = new Item("Elixir of Wrath"              , 500 , "potions and consumables", new Item[]{});
    static Item healthPotion             = new Item("Health Potion"                , 50  , "potions and consumables", new Item[]{});
    static Item refillablePotion         = new Item("Refillable Potion"            , 160 , "potions and consumables", new Item[]{});

    static Item farsightAlternation      = new Item("Farsight Alternation"         , 0   , "trinkets"               , new Item[]{});
    static Item oracleLens               = new Item("Oracle Lens"                  , 0   , "trinkets"               , new Item[]{});
    static Item wardingTrinket           = new Item("Warding Trinket"              , 0   , "trinkets"               , new Item[]{});

    static Item boots                    = new Item("Boots"                        , 300 , "boots"                  , new Item[]{});
    static Item berserkersGreaves        = new Item("Berserker's Greaves"          , 1100, "boots"                  , new Item[]{boots});
    static Item bootsOfSwiftness         = new Item("Boots of Swiftness"           , 900 , "boots"                  , new Item[]{boots});
    static Item ionianBootsOfLucidity    = new Item("Ionian Boots of Lucidity"     , 950 , "boots"                  , new Item[]{boots});
    static Item mercurysTreads           = new Item("Mercury's Treads"             , 1100, "boots"                  , new Item[]{boots});
    static Item mobilityBoots            = new Item("Mobility Boots"               , 1000, "boots"                  , new Item[]{boots});
    static Item platedSteelcaps          = new Item("Plated Steelcaps"             , 1100, "boots"                  , new Item[]{boots});
    static Item SorcerersShoes           = new Item("Sorcerer's Shoes"             , 1100, "boots"                  , new Item[]{boots});

    static Item amplifyingTome           = new Item("Amplifying Tome"              , 435 , "basic"                  , new Item[]{});
    static Item BFSword                  = new Item("B. F. Sword"                  , 1300, "basic"                  , new Item[]{});
    static Item blastingWand             = new Item("Blasting Wand"                , 850 , "basic"                  , new Item[]{});
    static Item brokenStopwatch          = new Item("Broken Stopwatch"             , 650 , "basic"                  , new Item[]{});
    static Item cloakOfAgility           = new Item("Cloak of Agility"             , 600 , "basic"                  , new Item[]{});
    static Item clothArmor               = new Item("Cloth Armor"                  , 300 , "basic"                  , new Item[]{});
    static Item dagger                   = new Item("Dagger"                       , 300 , "basic"                  , new Item[]{});
    static Item faerieCharm              = new Item("Faerie Charm"                 , 250 , "basic"                  , new Item[]{});
    static Item longSword                = new Item("Long Sword"                   , 350 , "basic"                  , new Item[]{});
    static Item needlesslyLargeRod       = new Item("Needlessly Large Rod"         , 1250, "basic"                  , new Item[]{});
    static Item nullMagicMantle          = new Item("Null-Magic Mantle"            , 450 , "basic"                  , new Item[]{});
    static Item pickaxe                  = new Item("Pickaxe"                      , 875 , "basic"                  , new Item[]{});
    static Item rejuvenationBead         = new Item("Rejuvenation Bead"            , 300 , "basic"                  , new Item[]{});
    static Item rubyCrystal              = new Item("Ruby Crystal"                 , 400 , "basic"                  , new Item[]{});
    static Item sapphireCrystal          = new Item("Sapphire Crystal"             , 350 , "basic"                  , new Item[]{});
    static Item sheen                    = new Item("Sheen"                        , 700 , "basic"                  , new Item[]{});
    static Item stopwatch                = new Item("Stopwatch"                    , 650 , "basic"                  , new Item[]{});

    static Item aegisOfTheLegion         = new Item("Aegis of the Legion"          , 1400, "epic"                   , new Item[]{nullMagicMantle, clothArmor});
    static Item aetherWisp               = new Item("Aether Wisp"                  , 850 , "epic"                   , new Item[]{amplifyingTome});
    static Item bamisCinder              = new Item("Bami's Cinder"                , 1100, "mythic component"       , new Item[]{rubyCrystal, rubyCrystal});
    static Item bandleglassMirror        = new Item("Bandleglass Mirror"           , 950 , "epic"                   , new Item[]{faerieCharm, amplifyingTome});
    static Item blightingJewel           = new Item("Blighting Jewel"              , 950 , "epic"                   , new Item[]{amplifyingTome});
    static Item brambleVest              = new Item("Bramble Vest"                 , 800 , "epic"                   , new Item[]{clothArmor, clothArmor});
    static Item caulfieldsWarhammer      = new Item("Caulfield's Warhammer"        , 1100, "epic"                   , new Item[]{longSword, longSword});
    static Item chainVest                = new Item("Chain Vest"                   , 800 , "epic"                   , new Item[]{clothArmor});
    static Item crystallineBracer        = new Item("Crystalline Bracer"           , 800 , "epic"                   , new Item[]{rubyCrystal, rejuvenationBead});
    static Item executionersCalling      = new Item("Executioner's Calling"        , 800 , "epic"                   , new Item[]{longSword});
    static Item fiendishCodex            = new Item("Fiendish Codex"               , 900 , "epic"                   , new Item[]{amplifyingTome});
    static Item forbiddenIdol            = new Item("Forbidden Idol"               , 800 , "epic"                   , new Item[]{faerieCharm});
    static Item frostfang                = new Item("Frostfang"              ,      400 , "epic"                   , new Item[]{});
    static Item giantsBelt               = new Item("Giant's Belt"                 , 900 , "epic"                   , new Item[]{rubyCrystal});
    static Item glacialBuckler           = new Item("Glacial Buckler"              , 900 , "epic"                   , new Item[]{sapphireCrystal, clothArmor});
    static Item harrowingCrescent        = new Item("Harrowing Crescent"           , 400 , "epic"                   , new Item[]{});
    static Item hearthboundAxe           = new Item("Hearthbound Axe"              , 1000, "epic"                   , new Item[]{dagger, longSword});
    static Item hexdrinker               = new Item("Hexdrinker"                   , 1300, "epic"                   , new Item[]{longSword, nullMagicMantle});
    static Item hextechAlternator        = new Item("Hextech Alternator"           , 1050, "epic"                   , new Item[]{amplifyingTome, rubyCrystal});
    static Item ironspikeWhip            = new Item("Ironspike Whip"               , 1100, "mythic component"       , new Item[]{pickaxe});
    static Item kindlegem                = new Item("Kindlegem"                    , 800 , "epic"                   , new Item[]{rubyCrystal});
    static Item kircheisShard            = new Item("Kircheis Shard"               , 800 , "epic"                   , new Item[]{dagger});
    static Item lastWhipser              = new Item("Last Whipser"                 , 1450, "epic"                   , new Item[]{longSword, longSword});
    static Item leechingLeer             = new Item("Leeching Leer"                , 1300, "mythic component"       , new Item[]{rubyCrystal, amplifyingTome});
    static Item lostChapter              = new Item("Lost Chapter"                 , 1300, "mythic component"       , new Item[]{amplifyingTome, sapphireCrystal, amplifyingTome});
    static Item negatronCloak            = new Item("Negatron Cloak"               , 900 , "epic"                   , new Item[]{nullMagicMantle});
    static Item noonquiver               = new Item("Noonquiver"                   , 1300, "mythic component"       , new Item[]{longSword, dagger, longSword});
    static Item oblivionOrb              = new Item("Oblivion Orb"                 , 800 , "epic"                   , new Item[]{amplifyingTome});
    static Item phage                    = new Item("Phage"                        , 1100, "epic"                   , new Item[]{rubyCrystal, longSword});
    static Item quicksilverSash          = new Item("Quicksilver Sash"             , 1300, "epic"                   , new Item[]{nullMagicMantle});
    static Item rageknife                = new Item("Rageknife"                    , 800 , "epic"                   , new Item[]{dagger, dagger});
    static Item recurveBow               = new Item("Recurve Bow"                  , 1100, "epic"                   , new Item[]{dagger, dagger});
    static Item runesteelSpaulders       = new Item("Runesteel Spaulders"          , 400 , "mythic component"       , new Item[]{});
    static Item seekersArmguard          = new Item("Seeker's Armguard"            , 1000, "epic"                   , new Item[]{amplifyingTome, clothArmor});
    static Item serratedDirk             = new Item("Serrated Dirk"                , 1100, "epic"                   , new Item[]{longSword, longSword});
    static Item spectresCowl             = new Item("Spectre's Cowl"               , 1250, "epic"                   , new Item[]{rubyCrystal, nullMagicMantle});
    static Item targonsBuckler           = new Item("Targon's Buckler"             , 400 , "mythic component"       , new Item[]{});
    static Item tiamat                   = new Item("Tiamat"                       , 1200, "epic"                   , new Item[]{pickaxe});
    static Item vampiricScepter          = new Item("Vampiric Scepter"             , 900 , "epic"                   , new Item[]{longSword});
    static Item verdantBarrier           = new Item("Verdant Barrier"              , 1000, "epic"                   , new Item[]{nullMagicMantle, amplifyingTome});
    static Item wardensMail              = new Item("Warden's Mail"                , 1000, "epic"                   , new Item[]{clothArmor, clothArmor});
    static Item watchfulWardstone        = new Item("Watchful Wardstone"           , 1100, "epic"                   , new Item[]{});
    static Item wingedMoonplate          = new Item("Winged Moonplate"             , 800 , "epic"                   , new Item[]{rubyCrystal});
    static Item zeal                     = new Item("Zeal"                         , 1050, "epic"                   , new Item[]{cloakOfAgility, dagger});

    static Item abyssalMask              = new Item("Abyssal Mask"                 , 2700, "legendary"              , new Item[]{kindlegem, spectresCowl});
    static Item anathemasChains          = new Item("Anathema's Chains"            , 2500, "legendary"              , new Item[]{kindlegem, giantsBelt});
    static Item archangelsStaff          = new Item("Archangel's Staff"            , 2600, "legendary"              , new Item[]{tearOfTheGoddess, kindlegem, blastingWand});
    static Item ardentCenser             = new Item("Ardent Cencer"                , 2300, "legendary"              , new Item[]{amplifyingTome, forbiddenIdol, amplifyingTome});
    static Item axiomArc                 = new Item("Axiom Arc"                    , 3000, "legendary"              , new Item[]{serratedDirk, caulfieldsWarhammer});
    static Item bansheesVeil             = new Item("Banshee's Veil"               , 2600, "legendary"              , new Item[]{fiendishCodex, verdantBarrier});
    static Item blackCleaver             = new Item("Black Cleaver"                , 3100, "legendary"              , new Item[]{caulfieldsWarhammer, kindlegem, longSword});
    static Item blackMistScythe          = new Item("Black Mist Scythe"            , 400 , "legendary"              , new Item[]{harrowingCrescent});
    static Item bladeOfTheRuinedKing     = new Item("Blade Of The Ruined King"     , 3300, "legendary"              , new Item[]{vampiricScepter, recurveBow});
    static Item bloodthirster            = new Item("Bloodthirster"                , 3400, "legendary"              , new Item[]{BFSword, cloakOfAgility, vampiricScepter});
    static Item bulwarkOfTheMountain     = new Item("Bulwark of the Mountain"      , 400 , "legendary"              , new Item[]{targonsBuckler});
    static Item chempunkChainsword       = new Item("Chempunk Chainsword"          , 2600, "legendary"              , new Item[]{executionersCalling, rubyCrystal, caulfieldsWarhammer});
    static Item chemtechPutrifier        = new Item("Chemtech Putrifier"           , 2300, "legendary"              , new Item[]{oblivionOrb, bandleglassMirror});
    static Item cosmicDrive              = new Item("Cosmic Drive"                 , 3000, "legendary"              , new Item[]{fiendishCodex, aetherWisp, rubyCrystal});
    static Item deadMansPlate            = new Item("Dead Man's Plate"             , 2900, "legendary"              , new Item[]{wingedMoonplate, rubyCrystal, chainVest});
    static Item deathsDance              = new Item("Death's Dance"                , 3300, "legendary"              , new Item[]{chainVest, caulfieldsWarhammer, pickaxe});
    static Item demonicEmbrace           = new Item("Demonic Embrace"              , 3000, "legendary"              , new Item[]{blastingWand, giantsBelt, amplifyingTome});
    static Item edgeOfNight              = new Item("Edge of Night"                , 2900, "legendary"              , new Item[]{longSword, serratedDirk, rubyCrystal});
    static Item essenceReaver            = new Item("Essence Reaver"               , 2800, "legendary"              , new Item[]{caulfieldsWarhammer, sheen, cloakOfAgility});
    static Item wintersApproach          = new Item("Winter's Approach"            , 2700, "legendary"              , new Item[]{tearOfTheGoddess, kindlegem, rubyCrystal});
    static Item fimbulwinter             = new Item("Fimbulwinter"                 , 2700, "legendary"              , new Item[]{wintersApproach});
    static Item forceOfNature            = new Item("Force of Nature"              , 2900, "legendary"              , new Item[]{negatronCloak, rubyCrystal, wingedMoonplate});
    static Item frozenHeart              = new Item("Frozen Heart"                 , 2500, "legendary"              , new Item[]{wardensMail, glacialBuckler});
    static Item gargoyleStoneplate       = new Item("Gargoyle Stoneplate"          , 3200, "legendary"              , new Item[]{clothArmor, aegisOfTheLegion, nullMagicMantle});
    static Item guardianAngel            = new Item("Guardian Angel"               , 2800, "legendary"              , new Item[]{BFSword, chainVest, stopwatch});
    static Item guinsoosRageblade        = new Item("Guinsoo's Rageblade"          , 2600, "legendary"              , new Item[]{rageknife, cloakOfAgility, dagger});
    static Item horizonFocus             = new Item("Horizon Focus"                , 3000, "legendary"              , new Item[]{hextechAlternator, fiendishCodex});
    static Item hullbreaker              = new Item("Hullbreaker"                  , 2800, "legendary"              , new Item[]{pickaxe, phage});
    static Item infinityEdge             = new Item("Infinity Edge"                , 3400, "legendary"              , new Item[]{BFSword, pickaxe, cloakOfAgility});
    static Item knightsVow               = new Item("Knight's Vow"                 , 2300, "legendary"              , new Item[]{crystallineBracer, rejuvenationBead, kindlegem});
    static Item lichBane                 = new Item("Lich Bane"                    , 3000, "legendary"              , new Item[]{sheen, aetherWisp, fiendishCodex});
    static Item lordDominiksRegards      = new Item("Lord Dominik's Regards"       , 3000, "legendary"              , new Item[]{lastWhipser, cloakOfAgility});
    static Item manamune                 = new Item("Manamune"                     , 2900, "legendary"              , new Item[]{tearOfTheGoddess, caulfieldsWarhammer, longSword});
    static Item mawOfMalmortius          = new Item("Maw of Malmortius"            , 2900, "legendary"              , new Item[]{hexdrinker, caulfieldsWarhammer});
    static Item mejaisSoulstealer        = new Item("Mejai's Soulstealer"          , 1600, "legendary"              , new Item[]{darkSeal});
    static Item mercurialScimitar        = new Item("Mercurial Scimitar"           , 3000, "legendary"              , new Item[]{quicksilverSash, cloakOfAgility, pickaxe});
    static Item mikaelsBlessing          = new Item("Mikael's Blessing"            , 2300, "legendary"              , new Item[]{forbiddenIdol, negatronCloak});
    static Item morellonomicon           = new Item("Morellonomicon"               , 2500, "legendary"              , new Item[]{blastingWand, oblivionOrb, rubyCrystal});
    static Item mortalReminder           = new Item("Mortal Reminder"              , 2500, "legendary"              , new Item[]{executionersCalling, zeal});
    static Item muramana                 = new Item("Muramana"                     , 2900, "legendary"              , new Item[]{manamune});
    static Item nashorsTooth             = new Item("Nashor's Tooth"               , 3000, "legendary"              , new Item[]{recurveBow, blastingWand, amplifyingTome});
    static Item navoriQuickblades        = new Item("Navori Quickblades"           , 3400, "legendary"              , new Item[]{caulfieldsWarhammer, pickaxe, cloakOfAgility});
    static Item pauldronsOfWhiterock     = new Item("Pauldrons of Whiterock"       , 400 , "legendary"              , new Item[]{runesteelSpaulders});
    static Item phantomDancer            = new Item("Phantom Dancer"               , 2600, "legendary"              , new Item[]{longSword, zeal, longSword});
    static Item rabadonsDeathcap         = new Item("Rabadon's Deathcap"           , 3600, "legendary"              , new Item[]{needlesslyLargeRod, needlesslyLargeRod});
    static Item randuinsOmen             = new Item("Randuin's Omen"               , 2700, "legendary"              , new Item[]{wardensMail, clothArmor, kindlegem});
    static Item rapidFirecannon          = new Item("Rapid Firecannon"             , 2500, "legendary"              , new Item[]{zeal, kircheisShard});
    static Item ravenousHydra            = new Item("Ravenous Hydra"               , 3300, "legendary"              , new Item[]{tiamat, vampiricScepter, caulfieldsWarhammer});
    static Item redemption               = new Item("Redemption"                   , 2300, "legendary"              , new Item[]{kindlegem, forbiddenIdol});
    static Item ruunansHurricane         = new Item("Runnan's Hurricane"           , 2600, "legendary"              , new Item[]{dagger, zeal, dagger});
    static Item rylaisCrystalScepter     = new Item("Rylai's Crystal Scepter"      , 2600, "legendary"              , new Item[]{blastingWand, giantsBelt, abyssalMask});
    static Item seraphsEmbrace           = new Item("Seraph's Embrace"             , 2600, "legendary"              , new Item[]{archangelsStaff});
    static Item serpentsFang             = new Item("Serpent's Fang"               , 2600, "legendary"              , new Item[]{serratedDirk, pickaxe});
    static Item seryldasGrudge           = new Item("Serylda's Grudge"             , 3200, "legendary"              , new Item[]{caulfieldsWarhammer, lastWhipser});
    static Item shadowflame              = new Item("Shadowflame"                  , 3000, "legendary"              , new Item[]{hextechAlternator, needlesslyLargeRod});
    static Item shardOfTrueIce           = new Item("Shard of True Ice"            , 400 , "legendary"              , new Item[]{frostfang});
    static Item silvermereDawn           = new Item("Silvermere Dawn"              , 3000, "legendary"              , new Item[]{quicksilverSash, pickaxe, rubyCrystal});
    static Item spiritVisage             = new Item("Spirit Visage"                , 2900, "legendary"              , new Item[]{spectresCowl, kindlegem});
    static Item staffOfFlowingWater      = new Item("Staff of Flowing Water"       , 2300, "legendary"              , new Item[]{amplifyingTome, forbiddenIdol, amplifyingTome});
    static Item steraksGage              = new Item("Sterak's Gage"                , 3100, "legendary"              , new Item[]{pickaxe, phage, rubyCrystal});
    static Item stormrazor               = new Item("Stormrazor"                   , 2700, "legendary"              , new Item[]{BFSword, cloakOfAgility, kircheisShard});
    static Item theCollector             = new Item("The Collector"                , 3000, "legendary"              , new Item[]{serratedDirk, pickaxe, cloakOfAgility});
    static Item thornmail                = new Item("Thornmail"                    , 2700, "legendary"              , new Item[]{brambleVest, giantsBelt});
    static Item titanicHydra             = new Item("Titanic Hydra"                , 3300, "legendary"              , new Item[]{tiamat, rubyCrystal, giantsBelt});
    static Item umbralGlaive             = new Item("Umbral Glaive"                , 2300, "legendary"              , new Item[]{longSword, serratedDirk, longSword});
    static Item vigilantWardstone        = new Item("Vigilant Wardstone"           , 1100, "legendary"              , new Item[]{watchfulWardstone});
    static Item voidStaff                = new Item("Void Staff"                   , 2800, "legendary"              , new Item[]{blightingJewel, blastingWand});
    static Item warmogsArmor             = new Item("Warmog's Armor"               , 3000, "legendary"              , new Item[]{giantsBelt, kindlegem, crystallineBracer});
    static Item witsEnd                  = new Item("Wit's end"                    , 3100, "legendary"              , new Item[]{hearthboundAxe, nullMagicMantle, pickaxe});
    static Item youmuusGhostblade        = new Item("Youmuu's Ghostblade"          , 3000, "legendary"              , new Item[]{serratedDirk, caulfieldsWarhammer});
    static Item zekesConvergence         = new Item("Zeke's Convergence"           , 2400, "legendary"              , new Item[]{kindlegem, glacialBuckler});
    static Item zhonyasHourglass         = new Item("Zhonya's Hourglass"           , 2600, "legendary"              , new Item[]{seekersArmguard, stopwatch, fiendishCodex});

    static Item crownOfTheShatteredQueen = new Item("Crown of the Shattered Queen" , 2800, "mythic"                 , new Item[]{lostChapter, kindlegem, amplifyingTome});
    static Item divineSunderer           = new Item("Divine Sunderer"              , 3300, "mythic"                 , new Item[]{caulfieldsWarhammer, sheen, kindlegem});
    static Item duskbladeOfDraktharr     = new Item("Duskblade of Draktharr"       , 3100, "mythic"                 , new Item[]{serratedDirk, caulfieldsWarhammer});
    static Item eclipse                  = new Item("Eclipse"                      , 3100, "mythic"                 , new Item[]{serratedDirk, longSword, vampiricScepter});
    static Item evenshroud               = new Item("Evenshroud"                   , 2500, "mythic"                 , new Item[]{kindlegem, aegisOfTheLegion});
    static Item everfrost                = new Item("Everfrost"                    , 2800, "mythic"                 , new Item[]{lostChapter, kindlegem, amplifyingTome});
    static Item frostfireGauntlet        = new Item("Frostfire Gauntlet"           , 2800, "mythic"                 , new Item[]{bamisCinder, nullMagicMantle, clothArmor});
    static Item galeforce                = new Item("Galeforce"                    , 3400, "mythic"                 , new Item[]{noonquiver, cloakOfAgility, pickaxe});
    static Item goredrinker              = new Item("Goredrinker"                  , 3300, "mythic"                 , new Item[]{ironspikeWhip, caulfieldsWarhammer, kindlegem});
    static Item hextechRocketbelt        = new Item("Hextech Rocketbelt"           , 3200, "mythic"                 , new Item[]{hextechAlternator, amplifyingTome, blastingWand});
    static Item immortalShieldbow        = new Item("Immortal Shieldbow"           , 3400, "mythic"                 , new Item[]{noonquiver, cloakOfAgility, vampiricScepter});
    static Item imperialMandate          = new Item("Imperial Mandate"             , 2500, "mythic"                 , new Item[]{kindlegem, bandleglassMirror});
    static Item krakenSlayer             = new Item("Kraken Slayer"                , 3400, "mythic"                 , new Item[]{noonquiver, cloakOfAgility, pickaxe});
    static Item liandrysAnguish          = new Item("Liandry's Anguish"            , 3200, "mythic"                 , new Item[]{lostChapter, fiendishCodex});
    static Item locketOfTheIronSolari    = new Item("Locket of the Iron Solari"    , 2500, "mythic"                 , new Item[]{kindlegem, aegisOfTheLegion});
    static Item ludensTempest            = new Item("Luden's Tempest"              , 3200, "mythic"                 , new Item[]{lostChapter, blastingWand});
    static Item moonstoneRenewer         = new Item("Moonstone Renewer"            , 2500, "mythic"                 , new Item[]{kindlegem, bandleglassMirror});
    static Item nightHarvester           = new Item("Night Harvester"              , 3200, "mythic"                 , new Item[]{hextechAlternator, amplifyingTome, blastingWand});
    static Item prowlersClaw             = new Item("Prowler's Claw"               , 3100, "mythic"                 , new Item[]{serratedDirk, caulfieldsWarhammer});
    static Item riftmaker                = new Item("Riftmaker"                    , 3200, "mythic"                 , new Item[]{leechingLeer, blastingWand});
    static Item shurelyasBattlesong      = new Item("Shurelya's Battlesong"        , 2500, "mythic"                 , new Item[]{kindlegem, bandleglassMirror});
    static Item strideBreaker            = new Item("Stride Breaker"               , 3300, "mythic"                 , new Item[]{ironspikeWhip, hearthboundAxe, kindlegem});
    static Item sunfireAegis             = new Item("Sunfire Aegis"                , 3200, "mythic"                 , new Item[]{bamisCinder, aegisOfTheLegion});
    static Item trinityForce             = new Item("Trinity Force"                , 3333, "mythic"                 , new Item[]{sheen, hearthboundAxe, kindlegem});
    static Item turboChemtank            = new Item("Turbo Chemtank"               , 2800, "mythic"                 , new Item[]{bamisCinder, nullMagicMantle, clothArmor});


    ///                                           SUMMONER SPELLS


    static SummonerSpell heal = new SummonerSpell("Heal", 240);
    static SummonerSpell ghost = new SummonerSpell("Ghost", 210);
    static SummonerSpell barrier = new SummonerSpell("Barrier", 180);
    static SummonerSpell exhaust = new SummonerSpell("Exhaust", 210);
    static SummonerSpell mark = new SummonerSpell("Mark", 80);
    static SummonerSpell dash = new SummonerSpell("Dash", 0);
    static SummonerSpell clarity = new SummonerSpell("Clarity", 240);
    static SummonerSpell flash = new SummonerSpell("Flash", 300);
    static SummonerSpell teleport = new SummonerSpell("Teleport", 360);

    static Smite smite = new Smite("Smite");
        static Smite challengingSmite = new Smite("Challenging Smite");
        static Smite chillingSmite = new Smite("Chilling Smite");

    static SummonerSpell cleanse = new SummonerSpell("Cleanse", 210);
    static SummonerSpell ignite = new SummonerSpell("Ignite", 180);

    static SummonerSpell summonerSpell1 = new SummonerSpell();


    static Item[] inventory = {new Item(), new Item(), new Item(), new Item(), new Item(), new Item(), new Item()};
    static int gold = 100000;
    static int supportQuest = 0;

    ///                                               METHODS


    public static ToBeDeleted getComponentComponentsPrices(Item item){
        ArrayList<Integer> forbiddenSlots = new ArrayList<Integer>();
        ToBeDeleted reduced = new ToBeDeleted();

        for (Item component : item.buildPath) {
            for (int slot=0; slot<6; slot++){
                boolean skip = false;
                for (int forbiddenSlot : forbiddenSlots)
                    if (slot == forbiddenSlot) {
                        skip = true;
                        break;
                    }
                if (!skip){
                    if (component == inventory[slot]){
                        reduced.increasePrice(component.price);
                        reduced.addSlot(slot);
                        forbiddenSlots.add(slot);
                    }
                }
            }
        }

        return reduced;
    }

    public static void buy(Item item) {
        int slot;
        if (Objects.equals(item.category, "boots"))
            for (slot = 0; slot < 6; slot++)
                if ((Objects.equals(inventory[slot].category, "boots") && !Objects.equals(inventory[slot].name, "Boots")) || inventory[slot] == item)
                    return;

        if (Objects.equals(item.category, "legendary"))
            for (slot = 0; slot < 6; slot++)
                if (inventory[slot] == item)
                    return;

        if (Objects.equals(item.category, "mythic"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals(inventory[slot].category, "mythic"))
                    return;

        if (Objects.equals(item.category, "mythic component"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals(inventory[slot].category, "mythic component") || Objects.equals(inventory[slot].category, "mythic"))
                    return;

        if (Objects.equals(item.name, "Stopwatch"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals(inventory[slot].name, "Broken Stopwatch"))
                    return;

        if (Objects.equals(item.name, "Refillable Potion"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals((inventory[slot].name), "Refillable Potion") || Objects.equals((inventory[slot].name), "Corrupting Potion"))
                    return;

        if (Objects.equals(item.name, "Corrupting Potion"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals((inventory[slot].name), "Refillable Potion") || Objects.equals((inventory[slot].name), "Corrupting Potion"))
                    return;

        if (Objects.equals(item.name, "Broken Stopwatch"))
            return;

        if (Objects.equals(item.category, "trinkets")) {
            inventory[6] = item;
            return;
        }

        if (Objects.equals(item.name, "Blighting Jewel") || Objects.equals(item.name, "Void Staff"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals(inventory[slot].name, "Blighting Jewel") || Objects.equals(item.name, "Void Staff"))
                    return;

        if (Objects.equals(item.name, "Ember Knife") || Objects.equals(item.name, "Hail Blade"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals(inventory[slot].name, "Ember Knife") || Objects.equals(inventory[slot].name, "Hail Blade")){
                    int counter = inventory[slot].counter;
                    inventory[slot] = item;
                    inventory[slot].counter = counter;
                    return;
                }

        switch (item.name){
            case "Relic Shield":
            case "Spectral Sickle":
            case "Spellthief's Edge":
            case "Steel Shoulderguards":
                for(slot = 0; slot < 6; slot++)
                    switch(inventory[slot].name){
                        case "Relic Shield":
                        case "Spectral Sickle":
                        case "Spellthief's Edge":
                        case "Steel Shoulderguards":
                        case "Targon's Buckler":
                        case "Harrowing Crescent":
                        case "Frostfang":
                        case "Runesteel Spaulders":
                        case "Black Mist Scythe":
                        case "Bulwark of the Mountain":
                        case "Pauldrons of Whiterock":
                        case "Shard of True Ice":
                            return;
                    }
                break;
            case "Targon's Buckler":
            case "Harrowing Crescent":
            case "Frostfang":
            case "Runesteel Spaulders":
            case "Black Mist Scythe":
            case "Bulwark of the Mountain":
            case "Pauldrons of Whiterock":
            case "Shard of True Ice":
                return;
        }

        if (Objects.equals(item.name, "Control Ward")) {
            for (slot = 0; slot < 6; slot++) {
                if (inventory[slot] == watchfulWardstone) {
                    if (inventory[slot].counter < 3) {
                        inventory[slot].counter++;
                        gold -= 75;
                    }
                    return;
                }
                if (Objects.equals(inventory[slot].name, "Vigilant Wardstone")) {
                    if (inventory[slot].counter < 4) {
                        inventory[slot].counter++;
                        gold -= 75;
                    }
                    return;
                }
            }
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals(inventory[slot].name, "Control Ward")) {
                    if (inventory[slot].counter < 2) {
                        inventory[slot].counter++;
                        gold -= 75;
                    }
                    return;
                }
        }

        if (Objects.equals(item.name, "Health Potion"))
            for (slot = 0; slot < 6; slot++)
                if (Objects.equals(inventory[slot].name, "Health Potion")){
                    if (inventory[slot].counter < 5) {
                        inventory[slot].counter++;
                        gold -= 50;
                    }
                    return;
                }

        if ((Objects.equals(item.name, "Watchful Wardstone") || Objects.equals(item.name, "Vigilant Wardstone")))
            for(slot=0; slot<6; slot++)
                if ((Objects.equals(inventory[slot].name, "Watchful Wardstone") || Objects.equals(inventory[slot].name, "Vigilant Wardstone")))
                    return;

        boolean fullPriceBuy = true;
        ArrayList<Integer> components = new ArrayList<Integer>();
        ArrayList<Integer> slots = new ArrayList<Integer>();
        int reducedPrice = 0;

        if(item.buildPath != null)
            for (Item component : item.buildPath) {
                boolean foundItem = false;
                for (slot = 0; slot < 6; slot++)
                    if (inventory[slot] == component) {
                        reducedPrice += inventory[slot].price;
                        inventory[slot] = new Item();
                        fullPriceBuy = false;
                        foundItem = true;
                    }
                if (!foundItem) {
                    ToBeDeleted toBeDeleted = getComponentComponentsPrices(component);
                    reducedPrice += toBeDeleted.reducedPrice;
                    slots.addAll(toBeDeleted.slots);
                }
            }

        int firstIndex = -1;
        for (slot=0; slot<6; slot++)
            if (Objects.equals(inventory[slot].name, "")) {
                firstIndex = slot;
                break;
            }

        if (firstIndex != -1) {
            if (gold + reducedPrice >= item.price) {
                for(int index : slots)
                {
                    inventory[index] = new Item();
                    if (index<firstIndex)
                        firstIndex=index;
                }
                inventory[firstIndex] = item;
                gold -= item.price - reducedPrice;

                if (Objects.equals(item.name, "Refillable Potion"))
                    inventory[slot].counter = 2;
                if (Objects.equals(item.name, "Corrupting Potion"))
                    inventory[slot].counter = 3;
                if (Objects.equals(item.name, "Hail Blade") || Objects.equals(item.name, "Ember Knife"))
                    inventory[slot].counter = 5;

            } else
                System.out.println("[ERROR] Insufficient gold");
        }
        else
            System.out.println("[ERROR] Inventory full");

    }

    public static void displayInventory(){
        System.out.println();
        for(int slot=0; slot<6; slot++) {

            int reduced = 0;

            if(slot<3)
                System.out.print((slot+1) + ": ");
            else
                System.out.print((slot+2) + ": ");
            switch (inventory[slot].name) {
                case "Watchful Wardstone", "Vigilant Wardstone", "Dark Seal", "Mejai's Soulstealer" -> {
                    if (inventory[slot].counter > 1) {
                        System.out.print(inventory[slot].name + ": " + (inventory[slot].counter - 1));
                        if (inventory[slot].counter > 9)
                            reduced = 4;
                        else
                            reduced = 3;
                    }
                    else
                        System.out.print(inventory[slot].name);
                }
                case "Refillable Potion", "Corrupting Potion", "Ember Knife", "Hail Blade" -> {
                    if (inventory[slot].counter > 0) {
                        System.out.print(inventory[slot].name + ": " + inventory[slot].counter);
                        reduced = 3;
                    }
                    else
                        System.out.print(inventory[slot].name);
                }
                default -> {
                    if (inventory[slot].counter > 1)
                        System.out.print(inventory[slot].counter + " " + inventory[slot].name + "s");
                    else
                        System.out.print(inventory[slot].name);

                    if(inventory[slot].counter > 1){
                        if(inventory[slot].counter > 9) {
                            if (inventory[slot].counter > 99)
                                reduced = 5;
                            else
                                reduced = 4;
                        }
                        else
                            reduced = 3;
                    }
                }
            }


            for(int i=inventory[slot].name.length()+reduced; i<30; i++)
                System.out.print(" ");
            if(slot == 2) {
                System.out.print("4:" + inventory[6].name + "                       ");
                //System.out.println(summonerSpell1 + "      " + summonerSpell2);
            }
        }
        System.out.println();
    }

    public static void sell(int index) {
        String name = inventory[index].name;
        if(inventory[index].counter > 1 && (!Objects.equals(name, "Corrupting Potion")   && !Objects.equals(name, "Refillable Potion")
                                        &&  !Objects.equals(name, "Tear of the Goddess") && !Objects.equals(name, "Manamune")
                                        &&  !Objects.equals(name, "Archangel's Staff")   && !Objects.equals(name, "Winter's Approach")
                                        &&  !Objects.equals(name, "Watchful Wardstone")  && !Objects.equals(name, "Vigilant Wardstone")))
            inventory[index].counter--;
        else {
            String category = inventory[index].category;

            if (Objects.equals(category, "starter") || Objects.equals(category, "potions and consumables"))
                gold += inventory[index].price * 2 / 5;
            if (Objects.equals(category, "boots") || Objects.equals(category, "basic") ||
                    Objects.equals(category, "legendary") || Objects.equals(category, "mythic"))
                gold += inventory[index].price * 7 / 10;
            inventory[index] = new Item();
        }
    }

    public static void leaveBase() {
        if(Objects.equals(inventory[6].name, ""))
            inventory[6] = wardingTrinket;
    }

    public static void die() {
        for (int slot=0; slot<6; slot++) {
            if (Objects.equals(inventory[slot].name, "Refillable Potion"))
                inventory[slot].counter = 2;
            if (Objects.equals(inventory[slot].name, "Corrupting Potion"))
                inventory[slot].counter = 3;
            if (Objects.equals(inventory[slot].name, "Dark Seal")){
                if(inventory[slot].counter < 5)
                    inventory[slot].counter = 1;
                else
                    inventory[slot].counter -= 4;
            }
            if (Objects.equals(inventory[slot].name, "Mejai's Soulstealer")){
                if(inventory[slot].counter < 11)
                    inventory[slot].counter = 1;
                else
                    inventory[slot].counter -= 10;
            }
        }
    }

    public static void getKill() {
        for (int slot=0; slot<6; slot++) {
            if (Objects.equals(inventory[slot].name, "Dark Seal")) {
                if (inventory[slot].counter > 9)
                    inventory[slot].counter = 11;
                else
                    inventory[slot].counter += 2;
            }
            if (Objects.equals(inventory[slot].name, "Mejai's Soulstealer")) {
                if (inventory[slot].counter > 21)
                    inventory[slot].counter = 26;
                else
                    inventory[slot].counter += 4;
            }
        }
    }

    public static void getAssist() {
        for (int slot=0; slot<6; slot++) {
            if (Objects.equals(inventory[slot].name, "Dark Seal")) {
                if (inventory[slot].counter < 11)
                    inventory[slot].counter++;
            }
            if (Objects.equals(inventory[slot].name, "Mejai's Soulstealer")) {
                if (inventory[slot].counter > 23)
                    inventory[slot].counter = 26;
                else
                    inventory[slot].counter += 4;
            }
        }
    }

    public static void useSmite(){
        int slot;
        boolean found = false;
        for (slot=0; slot<6; slot++)
            if(Objects.equals(inventory[slot].name, "Ember Knife") || Objects.equals(inventory[slot].name, "Hail Blade")){
                found = true;
                break;
            }
        if (found)
            consume(slot);
    }

    public static void wardstoneUpgrade(){
        int slot;
        boolean found = false;
        for (slot=0; slot<6; slot++)
            if (Objects.equals(inventory[slot].name, "Watchful Wardstone")) {
                for (int index=0; index<6; index++)
                    if (Objects.equals(inventory[index].name, "Black Mist Scythe") ||
                            Objects.equals(inventory[index].name, "Bulwark of the Mountain") ||
                            Objects.equals(inventory[index].name, "Pauldrons of Whiterock") ||
                            Objects.equals(inventory[index].name, "Shard of True Ice")) {
                        inventory[slot] = vigilantWardstone;
                        break;
                    }
                break;
            }
    }

    public static void manaUpgrade(){
        int slot;
        boolean found = false;
        for (slot=0; slot<6; slot++)
            if(Objects.equals(inventory[slot].name, "Mananume") || Objects.equals(inventory[slot].name, "Archangel's Staff") || Objects.equals(inventory[slot].name, "Winter's Approach"))
                if(inventory[slot].counter == 361)
                    switch (inventory[slot].name) {
                        case "Manamune" -> inventory[slot] = muramana;
                        case "Archangel's Staff" -> inventory[slot] = seraphsEmbrace;
                        case "Winter's Approach" -> inventory[slot] = fimbulwinter;
                    }
    }

    public static void supportUpgrade(){
        int slot;
        boolean found = false;
        for (slot=0; slot<6; slot++) {
            if (Objects.equals(inventory[slot].name, "Steel Shoulderguards")   || Objects.equals(inventory[slot].name, "Spellthief's Edge")
                    || Objects.equals(inventory[slot].name, "Spectral Sickle") || Objects.equals(inventory[slot].name, "Relic Shield"))
                if (supportQuest >= 501)
                    switch (inventory[slot].name) {
                        case "Relic Shield" -> inventory[slot] = targonsBuckler;
                        case "Spectral Sickle" -> inventory[slot] = harrowingCrescent;
                        case "Spellthief's Edge" -> inventory[slot] = frostfang;
                        case "Steel Shoulderguards" -> inventory[slot] = runesteelSpaulders;
                    }
            if (Objects.equals(inventory[slot].name, "Targon's Buckler") || Objects.equals(inventory[slot].name, "Harrowing Crescent")
                    || Objects.equals(inventory[slot].name, "Frostfang") || Objects.equals(inventory[slot].name, "Runesteel Spaulders"))
                if (supportQuest >= 1001)
                    switch (inventory[slot].name) {
                        case "Targon's Buckler" -> inventory[slot] = targonsBuckler;
                        case "Harrowing Crescent" -> inventory[slot] = blackMistScythe;
                        case "Frostfang" -> inventory[slot] = shardOfTrueIce;
                        case "Runesteel Spaulders" -> inventory[slot] = pauldronsOfWhiterock;
                    }
        }

    }

    public static void checkUpgrades(){
        supportUpgrade();
        wardstoneUpgrade();
        manaUpgrade();
    }

    public static void consume(int index){
        String name = inventory[index].name;
        switch(inventory[index].name) {
            case "Corrupting Potion":
            case "Refillable Potion":
                if (inventory[index].counter > 0)
                    inventory[index].counter--;
                break;
            case "Health Potion":
            case "Control Ward":
            case "Elixir of Iron":
            case "Elixir of Wrath":
            case "Elixir of Sorcery":
                if (inventory[index].counter > 0) {
                    inventory[index].counter--;
                    if (inventory[index].counter == 0)
                        inventory[index] = new Item();
                }
                break;
            /*case "Ember Knife":
                if (inventory[index].counter > 0) {
                    inventory[index].counter--;
                    if (inventory[index].counter == 0){
                        if (summonerSpell1 == smite)
                            summonerSpell1 = challengingSmite;
                        else
                            summonerSpell2 = challengingSmite;
                        inventory[index] = new Item();
                    }
                }
                break;
            case "Hail Blade":
                if (inventory[index].counter > 0) {
                    inventory[index].counter--;
                    if (inventory[index].counter == 0){
                        if (Objects.equals(summonerSpell1, smite))
                            summonerSpell1 = chillingSmite;
                        else
                            summonerSpell2 = chillingSmite;
                        inventory[index] = new Item();
                    }
                }
                break;*/
        }
    }

    public static void main(String[] args){

        farsightAlternation.changeBuildPath(new Item[]{oracleLens, wardingTrinket});
        oracleLens.changeBuildPath(new Item[]{farsightAlternation, wardingTrinket});
        wardingTrinket.changeBuildPath(new Item[]{farsightAlternation, oracleLens});

        //buy(emberKnife);
        //buy(darkSeal);
        displayInventory();

        getKill();
        displayInventory();

        buy(muramana);
        
        displayInventory();

        useSmite();
        displayInventory();

        useSmite();
        displayInventory();

        useSmite();
        displayInventory();

        useSmite();
        displayInventory();

        useSmite();
        displayInventory();
    }
}
