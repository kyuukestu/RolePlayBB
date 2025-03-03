[comment][font=Sofia][font=Merienda][font=Sofia Sans Condensed].[/font][/font][/font][/comment]
[div=height: var(--mainHeight); width: 100%;
display: block; align-content: center;


/*ANCHOR - Dimensions */
--mainHeight: clamp(300px, 85svh, 750px);

/*SECTION - Pokémon */

/*ANCHOR Gender Images */
--male: #89CFF0; 
--female: #F4C2C2;


/*ANCHOR - PokéBar */

--p-height: 50px;
--p-micro: calc(var(--p-height)/2.5);
--bg-color: transparent;
--p-size: 150%;
--held-right: -7.5px;
--gen-left: -7.5px;
--pokéShadow: drop-shadow(5px 0px 2px #353232);

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

/*ANCHOR - P1 */
--P1Img: var(--PyrImg);
--P1PrimType: var(--PyrPrimType);
--P1SecType: var(--PyrSecType);
--P1Gender: var(--PyrGender);
--P1Item: var(--PyrItem);

/*ANCHOR - P2 */
--P2Img: var(--HalImg);
--P2PrimType: var(--HalPrimType);
--P2SecType: var(--HalSecType);
--P2Gender: var(--HalGender);
--P2Item: var(--HalItem);

/*ANCHOR - P3 */
--P3Img: var(--JeImg);
--P3PrimType: var(--JePrimType);
--P3SecType: var(--JeSecType);
--P3Gender: var(--JeGender);
--P3Item: var(--JeItem);

/*ANCHOR - P4 */
--P4Img: var(--CieImg);
--P4PrimType: var(--CiePrimType);
--P4SecType: var(--CieSecType);
--P4Gender: var(--CieGender);
--P4Item: var(--CieItem);

/*ANCHOR - P5 */
--P5Img: var(--SusuImg);
--P5PrimType: var(--SusuPrimType);
--P5SecType: var(--SusuSecType);
--P5Gender: var(--SusuGender);
--P5Item: var(--SusuItem);

/*ANCHOR - P6 */
--P6Img: var(--IstImg);
--P6PrimType: var(--IstPrimType);
--P6SecType: var(--IstSecType);
--P6Gender: var(--IstGender);
--P6Item: var(--IstItem); 

/*!SECTION - Pokémon End */]
[Tabs][tab=Esther][div=/*SECTION – Esther Tab */ box-sizing: border-box;

height: var(--mainHeight); width: 100%;
display: block; align-content: center;
position: relative;

/*ANCHOR - Dimensions */
--mainHeight: clamp(300px, 85svh, 750px);
--postBorderRadius: 20px;
--rotate: rotate(90deg);

/*ANCHOR - Background Images */
--pokéball: url(https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/de4b3e6a-73cd-44c4-a7e0-fc36afcadcb9/deri8tc-ae96762e-7325-4d77-87d3-28620add92f6.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2RlNGIzZTZhLTczY2QtNDRjNC1hN2UwLWZjMzZhZmNhZGNiOVwvZGVyaTh0Yy1hZTk2NzYyZS03MzI1LTRkNzctODdkMy0yODYyMGFkZDkyZjYuZ2lmIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.p3K2JKVPBrM76GJJJQuLl28e2CU5VO_foiHx2hRhvj0);
--essy-background: no-repeat 17% 5%/25% url(https://imgur.com/v5nu6kp.png);
--rose-mask: url(https://media.discordapp.net/attachments/954402185821683732/1319800313015828592/409-4099367_rose-borderider-3-floribunda-removebg-preview.png?ex=67674753&is=6765f5d3&hm=9f6fe894b59a2ada68a98c8269a3e1753cb11590a000fc2d03d0cb8ac8e5b734&=&format=webp&quality=lossless&width=1475&height=403) no-repeat 50% 100%/50%;

/*ANCHOR - Cursor */
cursor: url(https://archives.bulbagarden.net/media/upload/9/93/Bag_Pok%C3%A9_Ball_Sprite.png), pointer;

/*ANCHOR - Font Sizes */
--fs-header: calc(var(--fs-body) * 1.5);
--fs-body: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.67);

/*ANCHOR - Accent Colors */
--accent-c: #C00000; /*#B22;*/ 

/*ANCHOR - Character Colors */
--esther-c: #f05656;
--shayan-c: #b22222;]
[div=/*SECTION - Text-Container Blur Border */ 
box-sizing: border-box; display: flex;
height: 80%; max-width: min(475px, 85vw); 
margin: auto; padding: 10px; position: relative; z-index: 2;
background-image: linear-gradient(); /* rgba(255, 255, 255, 0.45); */
backdrop-filter: blur(5px);
border-radius: var(--postBorderRadius); border: 1px solid rgba(255, 255, 255, 0.5);]
[div=/*SECTION - Post Container */
height: 100%; width: 100%; background: #222020; color: #fff;
border-radius: calc(var(--postBorderRadius) - 3px);
margin: auto; position: relative;]
[div=/*SECTION - Post Text Formatting */
box-sizing: border-box;
overflow-y: scroll; scrollbar-width: none; 
height: 90%; width: 100%; 
position: relative;
padding: 10px;
line-height: 1.5; letter-spacing: 0.5px;
white-space: collapse;
font-family: Sofia Sans Condensed; font-size: var(--fs-body);
text-align: justify; text-justify: auto;]
[div=box-sizing: border-box; position: sticky; top: -15px; text-align: center; font-family: Sofia; font-size: var(--fs-header); background-color: #222020; width: 100%; height: 90px; z-index: 2;]Esther R. Sophys
[div=background-color: #fff; position: absolute; bottom: 5px; height: 90px; width: 100%;
mask: var(--rose-mask);][/div]
[div=/*ANCHOR - Date & Time */
box-sizing: border-box; font-size: var(--fs-mini); float: right; position: relative; top: -15px;]August 11th, ~9:50 A.M.[/div]
[/div]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.


Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[comment]*!SECTION - Text Format End[/comment][/div]
[div=/*SECTION - Footer Location */ 
position: absolute; bottom: 0; width: 100%; height: 5%; background-color: var(--accent-c);
border-radius: 0 0 10px 10px;
display: flex; justify-content: center; align-items: center;
color: #fff; 
text-shadow: 1px 1px #000; font-weight: bold;
font-family: Merienda; font-size: var(--fs-mini); letter-spacing: 2px; line-height: 1.75;]
Exeggutor Island| Alola Region 
[/div]
[comment]*!SECTION - Post Container End[/comment][/div]
[comment]*!SECTION - Text-Container Blur Border End[/comment][/div]

[div=/*SECTION - Hidden Accordion Container */ 
visibility: hidden;
box-sizing: border-box; position: relative; right: max(25%, 220px); z-index: 2;
margin: auto; max-width: min(475px, 85vw); height: 75px; aspect-ratio: 1;
transform: rotate(-90deg);]
[accordion=100% | bcenter]
{slide=open | center | [bg=transparent; visibility: visible; position: relative; margin: auto;]
[div=/*SECTION - Accordion Top Design */
box-sizing: border-box; 
height: 90px; aspect-ratio: 1; margin: auto;
background: no-repeat center/100% var(--pokéball);
transform: var(--rotate);][/div][/bg]}
[div=/*SECTION - Pokémon Slide Content */

visibility: visible; box-sizing: border-box;


height: min(450px, 70vw);

display: flex; width: 75%; max-width: 50svw; overflow-y: scroll; overflow-x: hidden; scrollbar-width: none; position: relative; bottom: 50px; right: -10px; justify-content: space-evenly; border-radius: 15px; flex-flow: column nowrap; row-gap: 30px; align-items: center;]
[div=/*SECTION - Pokémon Position 1 */
    box-sizing: border-box; background: var(--P1PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P1SecType);transform: var(--rotate); z-index: 1;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P1Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; z-index: 2;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); z-indx: 3;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); z-index: 3;][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 2 */
    box-sizing: border-box; background: var(--P2PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P2SecType);transform: var(--rotate); z-index: 1;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P2Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; z-index: 2;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); z-indx: 3;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); z-index: 3;][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 3 */
    box-sizing: border-box; background: var(--P3PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P3SecType);transform: var(--rotate); z-index: 1;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P3Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; z-index: 2;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P3Gender); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); z-indx: 3;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); z-index: 3;][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 4 */
    box-sizing: border-box; background: var(--P4PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P4SecType);transform: var(--rotate); z-index: 1;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P4Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; z-index: 2;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P4Gender); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); z-indx: 3;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); z-index: 3;][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 5 */
    box-sizing: border-box; background: var(--P5PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P5SecType);transform: var(--rotate); z-index: 1;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P5Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; z-index: 2;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P5Gender); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); z-indx: 3;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); z-index: 3;][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 6 */
    box-sizing: border-box; background: var(--P6PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P6SecType);transform: var(--rotate); z-index: 1;]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P6Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; z-index: 2;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P6Gender); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); z-indx: 3;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); z-index: 3;][/div]
    [comment]/*!SECTION */[/comment]
[/div]

[comment]*!SECTION - Slide Content End[/comment][/div]
{/slide}
[/accordion]
[comment]*!SECTION - Hidden Accordion Container End[/comment][/div]

[div=/*SECTION - Background Character */
background: var(--essy-background);
width: 100%; height: 90%;
position: absolute; top: 10%; z-index: 1;
mask-image: linear-gradient(black, transparent);][comment]*!SECTION - BG Char End[/comment][/div]
[/div][/tab]
[tab=PokéBox]
[div=/*SECTION – PokéBox Tab */ box-sizing: border-box;

height: var(--mainHeight); width: 100%;
display: flex; flex-wrap: wrap; gap: 5px; justify-content: center;
overflow-y: scroll; scrollbar-width: none;

--flex: max(190px, 30%);
--card-r: 20px;
--max-h: 325px;]
[div=/*SECTION - Pokémon Card Pyrrha */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
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
[comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Card Halay */box-sizing: border-box; flex: 1 0 var(--flex); background: #222; border-radius: var(--card-r); display: flex; flex-wrap: wrap; max-height: var(--max-h); max-width: var(--flex);]
[div=/*SECTION - Pokémon Display */ box-sizing: border-box; flex: 1 0 100%; text-align: center; padding-top: 10px;]
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
[/tab]
[tab=Inventory][div=/*SECTION – Inventory Tab */ box-sizing: border-box;

height: var(--mainHeight); width: 100%;
display: block; align-content: center;]
Under Construction
[/div][/tab]
[/tabs]
[/div]

[div=box-sizing: border-box; text-align: center; padding: 50px; width: 100%;]

Interactions: Nua (@Patriot)
[/div]