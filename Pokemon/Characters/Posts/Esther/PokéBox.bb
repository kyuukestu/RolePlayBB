[div=/*SECTION – PokéBox Tab */ 
box-sizing: border-box;
height: var(--mainHeight); width: 100%;
display: flex; flex-wrap: wrap; gap: 5px; justify-content: center;
overflow-y: scroll; scrollbar-width: none;

--pokéShadow: drop-shadow(5px 0px 2px #353232);
--p-size: 150%;--p-height: 50px;
--mainHeight: clamp(300px, 85svh, 750px);
--flex: max(190px, 30%);
--card-r: 20px;
--max-h: 325px;

/*ANCHOR - Pyrrha */
--PyrImg: url(https://play.pokemonshowdown.com/sprites/gen5/jangmo-o.png);
--PyrPrimType: #A27EFA;
--PyrSecType: #7D58D6;
--PyrGender: var(--female);
--PyrItem: url(https://archives.bulbagarden.net/media/upload/thumb/6/60/Dream_Everstone_Sprite.png/200px-Dream_Everstone_Sprite.png);

/*ANCHOR - Halay-Alae */
--HalImg: url(https://play.pokemonshowdown.com/sprites/gen5/houndour.png);
--HalPrimType: #A29288;
--HalSecType: #9C531F;
--HalGender: var(--female);
--HalItem: url();

/*ANCHOR - Pari */
--PariImg: url(https://play.pokemonshowdown.com/sprites/gen5/munna.png);
--PariPrimType: #FA92B2;
--PariSecType: #A13959;
--PariGender: var(--female);
--PariItem: url();

/*ANCHOR - Ciera */
--CieImg: url(https://play.pokemonshowdown.com/sprites/gen5/bounsweet.png);
--CiePrimType: #A7DB8D;
--CieSecType: #57913A;
--CieGender: var(--female);
--CieItem: url();

/*ANCHOR - L'Basseau */
--SusuImg: url(https://play.pokemonshowdown.com/sprites/gen5/surskit.png);
--SusuPrimType: #C6D16E;
--SusuSecType: #506899;
--SusuGender: var(--female);
--SusuItem: url();

/*ANCHOR - Kasriel */
--KasImg: url(https://play.pokemonshowdown.com/sprites/gen5/zigzagoon-galar.png);
--KasPrimType: #A29288;
--KasSecType: #6D6D4E;
--KasGender: var(--male);
--KasItem: url();

/*ANCHOR - La Bamba */
--BamImg: url(https://play.pokemonshowdown.com/sprites/gen5/shellos-west.png);
--BamPrimType: #9DB7F5;
--BamSecType: #4A66AB;
--BamGender: var(--female);
--BamItem: url();

/*ANCHOR – Istha */
--IstImg: url(https://play.pokemonshowdown.com/sprites/gen5-shiny/feebas.png);
--IstPrimType: #9DB7F5;
--IstSecType: #4A66AB;
--IstGender: var(--female);
--IstItem: url();

/*ANCHOR – Jecroix */
--JeImg: url(https://play.pokemonshowdown.com/sprites/gen5/drifloon.png);
--JePrimType: #A284A2;
--JeSecType: #58789B;
--JeGender: var(--male);
--JeItem: url();

]
[div=/*SECTION - Pokémon Card Pyrrha */
box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ 
box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--PyrPrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--PyrSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--PyrImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
Pyrrha Achilleia Astierra
[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Female
Ability: Overcoat
Pokéball: Normal
Lv: 25
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Dragon Breath
Tackle
Leer
Protect
Dragon Tail
Bide
Scary Face
Headbutt
Work Up
Screech
[/div]
[comment]/*!SECTION */ [/comment][/div]
[div=/*SECTION - Pokémon Card Halay */
box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ 
box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--HalPrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--HalSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--HalImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
Halay-Alae Huaka’i Pöncu
[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Female
Ability: Unnerve
Pokéball: Normal
Lv: 25
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Thunder Fang
Nasty Plot
Counter
Reversal
Sucker Punch
Punishment
Leer
Howl
Smog
Roar
Bite
Incinerate
Odor Sleuth
Beat Up
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Pari */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--PariPrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--PariSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--PariImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
Pariparisithea
[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Female
Ability: Telepathy
Pokéball: Normal
Lv: 10
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Stored Power
Defense Curl
Psywave
Hypnosis
Lucky Chant
Yawn
Psybeam
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Ciera */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--CiePrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--CieSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--CieImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
Maçiera En’Çapolalê
[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Female
Ability: Oblivious
Pokéball: Normal
Lv: 20
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Play Rough
Synthesis
Grass Whistle
Splash
Play Nice
Rapid Spin
Razor Leaf
Sweet Scent
Magical Leaf
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Susu */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--SusuPrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--SusuSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--SusuImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
L' Basseau
[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Female
Ability: Swift Swim
Pokéball: Normal
Lv: 19
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Water Gun
Bubble
Quick Attack
Sweet Scent
Soak
Water Sport
Bubble Beam
Aqua Jet
Hydro Pump
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Kasriel */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--KasPrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--KasSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--KasImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
Kasriel Ikaros Svelinka Sō
[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Male
Ability: Gluttony
Pokéball: Normal
Lv: 24
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Tackle
Leer
Sand Attack
Lick
Snarl
Headbutt
Baby-Doll Eyes
Pin Missile
Rest
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Istha */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--IstPrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--IstSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--IstImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
Īstha Hâq-Ra
[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Female
Ability: Adaptability
Pokéball: Normal
Lv: 7
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Splash
Captivate
Hypnosis
Mirror Coat
Scale Shot – Learning
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Jecroix */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--JePrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--JeSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--JeImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
Gran Jecroix te Loon[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Male
Ability: Aftermath
Pokéball: Normal
Lv: 6
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Tailwind
Destiny Bond
Minimize
Payback
Astonish
Gust
Focus Energy
Payback
Constrict
Confusion
Hypnosis
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Bambi */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
[div=/*ANCHOR - Pokémon Background */
    box-sizing: border-box; background: var(--BamPrimType); border-radius: 50%; height: calc(var(--p-height)/1.5); aspect-ratio: 3; position: relative; top: 25px; border: 2px solid var(--BamSecType);transform: var(--rotate); z-index: 1; margin: auto;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--BamImg); border: 2px solid transparent; border-radius: 50px; height: calc(1.5*var(--p-height)); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 65px; z-index: 2; margin: auto;][/div]
[/div]
[comment]/*ANCHOR - Pokémon Name */[/comment]
La Bamba[comment]/*!SECTION */[/comment][/div]
[div=box-sizing: border-box; flex: 1 0 45%; height: 55%; padding-left: 10px;]
[comment]/*ANCHOR - Pokémon Details */[/comment]
Gender: Female
Ability: Stick Hold
Pokéball: Normal
Lv: 20
[/div]
[div=box-sizing: border-box; flex: 1 0 45%; overflow-y: scroll; scrollbar-width: none; height: 55%;]
[div=font-weight: bold; position: sticky; top: 0; width: 100%; text-align: center; background: #222;]Moves[/div]
Yawn
Curse
Amnesia
Water Gun
Mud Slap
Mud Sport
Harden
Tackle
Water Pulse
Recover
Mud Bomb
Ancient Power
Hidden Power {Poison}
[/div]
[comment]/*!SECTION */[/comment]
[/div]
[/div]