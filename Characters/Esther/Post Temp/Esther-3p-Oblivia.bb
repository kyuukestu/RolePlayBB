[comment][font=Orbitron][font=Poppins][font=Lato].[/font][/font][/font][/comment]
[div=box-sizing: border-box;
display: flex; flex-direction: column;
width: 90%; max-width: 90vw; height: clamp(450px, 65vh, 650px);
margin: auto; padding: 15px; line-height: 0; gap: 15px 0px;


/*ANCHOR - Colors */
--bg-color: #2a2a2a;
--scrollbar-color: #ccc;
color: #fff;


overflow-x: hidden;
overflow-y: scroll; scrollbar-width: thin; scrollbar-color: var(--scrollbar-color) transparent;
-webkit-scroll-snap-type: y mandatory; scroll-snap-type: y mandatory; scroll-snap-align: center;



/*ANCHOR - Character Colors */
--esther-c: #f05656;
--shayan-c: #b22222;
--parisa-c: #7fff00;
--irisa-c: #663399;

/*ANCHOR - Current Art & Location */
--current-location: var(--sophia-road-bg);
--current-location-ratio: var(--sophia-road-ratio);
--current-esther: var(--essy-standard);
--current-esther-ratio: var(--essy-knight-ratio);
--char-art-height: 100%;

/*ANCHOR - Borders */

--accent-c: #f05656;
--char-border:  7px inset var(--accent-c);
--post-border:  7px inset var(--accent-c);
--name-border: 3px outset var(--accent-c);
--region-border: 3px inset var(--accent-c);
--location-border: 7px inset var(--accent-c);

/* ANCHOR - Char Art-Ratio Pairs */
--essy-sporty: no-repeat 50% 0%/100% url(https://imgur.com/Tdk5ooF.png); --essy-sporty-ratio: 7.6/13.4;
--essy-knight: no-repeat 50% 100%/100% url(https://imgur.com/7GwZLB8.png); --essy-knight-ratio: 17/36;
--essy-standard: no-repeat 50% 100%/cover url(https://i.imgur.com/Ga5LSFg.png); --essy-standard-ratio: 1;
--essy-chic: no-repeat 50% 5%/160% url(https://i.imgur.com/FrfkMCj.png); --essy-chic-ratio: 708/1062;
--essy-k: no-repeat 50% 5%/cover url(https://i.imgur.com/NUS96tY.png); --essy-k-ratio: var(--essy-chic-ratio);

/* ANCHOR - Location Art-Ratio Pairs */

--Oblivia-bg: no-repeat center/cover url(https://i.imgur.com/3HMLIY0.png);
--flower-bg: no-repeat center/cover url(https://i.imgur.com/sKBAlnm.png);
--mt-bg: no-repeat center/contain url(https://i.redd.it/afrpdp9qsf081.jpg); --mt-ratio: 4/5;
--medi-bg: no-repeat center/contain url(https://i.imgur.com/YNL5YNa.jpeg); --medi-ratio: 1; 
--olivine-bg: no-repeat center/contain url(https://pbs.twimg.com/media/GeryIVvbsAYnCU-.jpg); --olivine-ratio: 1;
--cocona-bg: no-repeat center/contain url(https://i.imgur.com/na73A0l.png); --cocona-ratio: 19/15;
--lapras-beach-bg: no-repeat center/contain url(https://media.discordapp.net/attachments/191374162978144257/1456754000530636862/Lapras_Beach_Ranger3.png?ex=69598362&is=695831e2&hm=4985a94ddbb7a61cc579c60846de968c5ffb6116d5378b51916d3fe1b944db1e&=&format=webp&quality=lossless&width=1224&height=504); --lapras-beach-ratio: 1088/448;
--aqua-resort-bg: no-repeat center/cover url(https://i.imgur.com/mVD2apK.png); --aqua-resort-ratio: 708/515;
--hau-bg: no-repeat center/cover url(https://i.imgur.com/P5nMe0v.png); --hau-ratio: 250/351;
--cocona-bg: no-repeat center/contain url(https://i.imgur.com/na73A0l.png); --cocona-ratio: 19/15;
--lapras-beach-bg: no-repeat center/contain url(https://media.discordapp.net/attachments/191374162978144257/1456754000530636862/Lapras_Beach_Ranger3.png?ex=69598362&is=695831e2&hm=4985a94ddbb7a61cc579c60846de968c5ffb6116d5378b51916d3fe1b944db1e&=&format=webp&quality=lossless&width=1224&height=504); --lapras-beach-ratio: 1088/448;
--aqua-resort-bg: no-repeat center/cover url(https://i.imgur.com/mVD2apK.png); --aqua-resort-ratio: 708/515;
--sophia-road-bg: no-repeat center/contain url(https://i.imgur.com/Gsp9ztu.png); --sophia-road-ratio: 71/74;
--sophia-road-2-bg: no-repeat center/contain url(https://i.imgur.com/CLVwR3r.png); --sophia-road-2-ratio: 71/80;
--sophia-road-3-bg: no-repeat center/contain url(hhttps://i.imgur.com/KSpulT4.png); --sophia-road-3-ratio: 71/77;
/*ANCHOR - Fonts */
--timestamp-font: Orbitron;
--title-font: Poppins;
--text-font: Lato;]
[div=/*SECTION - Scroll Arrows */
position: absolute; z-index: 3; border-radius: 50%;
display: flex; flex-flow: row wrap; justify-content: center; align-items: center;
backdrop-filteR: blur(10px);
aspect-ratio: 1; height: 75px;
left: 50px;]
[div=box-sizing: border-box; transform: rotate(-90deg);]⬅ Scroll  ➡[/div]
[/div]
[div=/*SECTION - Art & Overview */
box-sizing: border-box;
position: relative;
overflow-x: scroll; overflow-y: hidden; scrollbar-width: thin; scrollbar-color: var(--scrollbar-color) transparent;
width: 100%; min-height: 100%;
font-family: var(--title-font);
display: flex; flex-direction: row; justify-content: flex-start;
-webkit-scroll-snap-type: x mandatory; scroll-snap-type: x mandatory; scroll-snap-align: center;
padding: 2.5rem; margin: 0.5rem;]
[div=/*STUB - Character Art */
height: var(--char-art-height); aspect-ratio: var(--current-esther-ratio);
margin: auto;
-webkit-scroll-snap-type: x mandatory; scroll-snap-type: x mandatory; scroll-snap-align: center;
border: var(--char-border);
background: var(--current-esther), var(--Oblivia-bg);
position: relative;]
[div=/*STUB - AI Disclaimer */
position: absolute; width: fit-content; height: auto; margin: auto; top: -30px; left: 50%; transform: translateX(-50%);
color: var(--accent-c);]
AI Art
[/div]
[div=/*STUB - Character Name Overlay */
position: absolute; top: 50%; left: -130px;
width: 250px; height: 45px;
transform: translateY(-50%) rotate(-90deg);
border: var(--name-border); background: var(--bg-color);
display: flex; justify-content: center; align-items: center;]
Esther Rosana Sophys[/div]
[/div]
[div=/*STUB - Location Art */
height: var(--char-art-height); aspect-ratio: var(--current-location-ratio); 
margin: auto;
-webkit-scroll-snap-type: x mandatory; scroll-snap-type: x mandatory; scroll-snap-align: center;
border: var(--location-border);
background: var(--current-location); 
position: relative;]
[div=/*STUB - Date Stamp */
position: absolute; top: 50%; left: -130px; transform: translateY(-50%) rotate(-90deg);
width: 250px; height: 35px; font-family: var(--timestamp-font); font-weight: bold;
border: var(--name-border); background: var(--bg-color);
display: flex; justify-content: center; align-items: center;]
Monday, July 26th
[/div]
[div=/*STUB - Location Name Overlay */
position: absolute; top: -20px; left: 50%; transform: translateX(-50%);
min-width: 275px; width: fit-content; height: 35px; padding: 0 5px;
border: var(--name-border); background: var(--bg-color);
display: flex; justify-content: center; align-items: center;]
Sophia Road - Sophia Island [/div]
[div=/*STUB - Region Name Overlay */
position: absolute; bottom: -20px; left: 50%; transform: translateX(-50%);
width: 190px; height: 35px;
border: var(--region-border); background: var(--bg-color);
display: flex; justify-content: center; align-items: center;]
Oblivia [/div]
[/div]
[comment]/*!SECTION */ [/comment][/div]
[div=/*SECTION - Pokemon */
box-sizing: border-box; pointer-events: none;
position: relative; padding: 1.5rem;
width: 100%; min-height: 100%;
background: var(--bg-color);
border: var(--post-border);
display: flex; flex-direction: column; justify-content: flex-end;
-webkit-scroll-snap-type: y mandatory; scroll-snap-type: y mandatory; scroll-snap-align: center;

/*ANCHOR Gender Images */
--male: url(https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Mars_symbol_%28outline%29.svg/800px-Mars_symbol_%28outline%29.svg.png); 
--female: url(https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Venus_symbol_%28outline%29.svg/800px-Venus_symbol_%28outline%29.svg.png); 

--maleC: #89CFF0;
--femaleC: #F4C2C2;

/*ANCHOR - Ball Seals */
--SkySealA: url(https://imgur.com/8MpmRzz.png);
--SkySealB: url(https://imgur.com/8mjjpCO.png);
--SongSealA: url(https://imgur.com/3qLAi7C.png);
--SmokeSealB: url(https://imgur.com/K0byrjW.png);
--FireSealA: url(https://imgur.com/VdrCrG9.png);
--FloraSealB: url(https://imgur.com/J5iLkoy.png);
--BubbleSealB: url(https://imgur.com/uzjPq3S.png);
--HeartSealF: url(https://imgur.com/AuOjEwH.png);
--LeafSealC: url(https://imgur.com/lH0t5VU.png);
--CoolSealA: url(https://imgur.com/zGT8t66.png);
--StarSealD: url(https://imgur.com/WUpjoXt.png);
--BeautySealC: url(https://imgur.com/U2njRDS.png);



/*ANCHOR - PokéBar */
--p-height: 50px;
--p-micro: calc(var(--p-height)/2.5);
--poke-bg-color: transparent;
--p-size: 150%;
--held-right: -7.5px;
--gen-left: -7.5px;
--pokéShadow: drop-shadow(5px 0px 2px #353232);

/*ANCHOR - Pyrrha */
--PyrImg: url(https://www.smogon.com/forums/attachments/782-gif.369411/);
--PyrPrimType: #A27EFA;
--PyrSecType: #7D58D6;
--PyrGender: var(--female);
--PyrGenC: var(--femaleC);
--PyrItem: url(https://archives.bulbagarden.net/media/upload/thumb/6/60/Dream_Everstone_Sprite.png/200px-Dream_Everstone_Sprite.png);
--PyrBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--PyrSize: cover;
/*ANCHOR - Halay-Alae */
--HalImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--HalPrimType: #A29288;
--HalSecType: #9C531F;
--HalGender: var(--female);
--HalItem: url();
--HalBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--HalSize: 53%;
/*ANCHOR - Pari */
--PariImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/munna.gif);
--PariPrimType: #FA92B2;
--PariSecType: #A13959;
--PariGender: var(--female);
--PariItem: url();
--PariBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--PariSize: 50%;
/*ANCHOR - Ciera */
--CieImg: url(https://www.smogon.com/forums/attachments/761-gif.274544/);
--CiePrimType: #A7DB8D;
--CieSecType: #57913A;
--CieGender: var(--female);
--CieItem: url();
--CieBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--CieSize: 45%;
/*ANCHOR -  Bâquîle Nâva  */
--NavaImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/goomy.gif);
--NavaPrimType: #A27EFA;
--NavaSecType: #7D58D6;
--NavaGender: var(--female);
--NavaItem: url();
--NavaBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--NavaSize: 60%;
/*ANCHOR - L'Basseau */
--SusuImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--SusuPrimType: #C6D16E;
--SusuSecType: #506899;
--SusuGender: var(--female);
--SusuItem: url();
--SusuBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--SusuSize: 50%;
/*ANCHOR - Kasriel */
--KasImg: url(https://www.smogon.com/forums/attachments/263_2-gif.284206/);
--KasPrimType: #A29288;
--KasSecType: #6D6D4E;
--KasGender: var(--male);
--KasItem: url();
--KasBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--KasSize: 80%;
/*ANCHOR - La Bamba */
--BamImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/shellos.gif);
--BamPrimType: #9DB7F5;
--BamSecType: #4A66AB;
--BamGender: var(--female);
--BamItem: url();
--BamBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--BamSize: 33%;
/*ANCHOR – Istha */
--IstImg: url(https://play.pokemonshowdown.com/sprites/gen5ani-shiny/feebas.gif);
--IstPrimType: #9DB7F5;
--IstSecType: #4A66AB;
--IstGender: var(--female);
--IstItem: url();
--IstBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--IstSize: 33%;
/*ANCHOR – Jecroix */
--JeImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/drifloon.gif);
--JePrimType: #A284A2;
--JeSecType: #58789B;
--JeGender: var(--male);
--JeItem: url();
--JeBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--JeSize: 53%;
/*ANCHOR - P1 */
--P1Img: var(--PyrImg);
--P1PrimType: var(--PyrPrimType);
--P1SecType: var(--PyrSecType);
--P1Gender: var(--PyrGender);
--P1Item: var(--PyrItem);
--P1Ball: var(--PyrBall);
--P1Size: var(--PyrSize);
/*ANCHOR - P2 */
--P2Img: var(--HalImg);
--P2PrimType: var(--HalPrimType);
--P2SecType: var(--HalSecType);
--P2Gender: var(--HalGender);
--P2Item: var(--HalItem);
--P2Ball: var(--HalBall);
--P2Size: var(--HalSize);
/*ANCHOR - P3 */
--P3Img: var(--JeImg);
--P3PrimType: var(--JePrimType);
--P3SecType: var(--JeSecType);
--P3Gender: var(--JeGender);
--P3Item: var(--JeItem);
--P3Ball: var(--JeBall);
--P3Size: var(--JeSize);
/*ANCHOR - P4 */
--P4Img: var(--CieImg);
--P4PrimType: var(--CiePrimType);
--P4SecType: var(--CieSecType);
--P4Gender: var(--CieGender);
--P4Item: var(--CieItem);
--P4Ball: var(--CieBall);
--P4Size: var(--CieSize);
/*ANCHOR - P5 */
--P5Img: var(--SusuImg);
--P5PrimType: var(--SusuPrimType);
--P5SecType: var(--SusuSecType);
--P5Gender: var(--SusuGender);
--P5Item: var(--SusuItem);
--P5Ball: var(--SusuBall);
--P5Size: var(--SusuSize);
/*ANCHOR - P6 */
--P6Img: var(--IstImg);
--P6PrimType: var(--IstPrimType);
--P6SecType: var(--IstSecType);
--P6Gender: var(--IstGender);
--P6Item: var(--IstItem); 
--P6Ball: var(--IstBall);
--P6Size: var(--IstSize);
/*!SECTION - Pokémon End */
]
[div=/*STUB - On-Hand */
position: absolute; top: -20px; left: 50%; transform: translateX(-50%); z-index: 1;
width: 190px; height: 35px;
border: var(--name-border); background: var(--bg-color);
display: flex; justify-content: center; align-items: center;]
On-Hand Pokemon
[/div]


[div=/*SECTION - Pokémon Bar */
visibility: visible; box-sizing: border-box; 
width: 100%; min-height: 100%; line-height: 0;
background-color: transparent; pointer-events: auto;
display: flex; justify-content: space-around; align-items: center; flex-flow: row wrap;
overflow-y: scroll; overflow-x: hidden; scrollbar-width: thin; scrollbar-color: var(--scrollbar-color) transparent;
scroll-snap-type: y mandatory; -webkit-scroll-snap-type: y mandatory; 
position: relative; 
font-family: var(--title-font);  font-weight: bold; color: #fff;
margin: auto; padding: 10px; gap: 0px 0px;

--poke-flex: 1 1 28%;
--poke-cell-height: 50%;
--poke-cell-width: 180px;
--pokeball-left: 50%;
--pokeball-top: 50%;
--pokeball-position: translate(-50%, -50%) rotate(35deg);
--poke-padding: 5px;

--cellMax: 85%;
--cellWMax: 200px;
--pMaxWidth: 20%;
--p-micro: 20%;
--chev-down-left: 5px;
--chev-down-bott: -25px;
--chev-up-top: -25px;
--chev-up-right: 5px;
--seal-size: 100%;
--cellBorder: 3px inset var(--accent-c);
--cellRadius: 0%;
]
[div=/*SECTION - Pokémon Position 1 - Pyrrha */
aspect-ratio: 1; 
height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center; 
line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P1PrimType) 50%, var(--P1SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P1Size) var(--P1Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P1Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P1Ball) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SkySealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--SongSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Pyrrha
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 2 - Halay */
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);; 
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P2PrimType) 50%, var(--P2SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P2Size) var(--P2Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P2Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P2Ball) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SmokeSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--FireSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Halay-Alae
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 3 - Jecroix */ display: none;
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P3PrimType) 50%, var(--P3SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P3Size) var(--P3Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P3Gender); background-color: var(--maleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P3Ball) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SkySealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--HeartSealF); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Jecroix
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 4 - CIera */
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P4PrimType) 50%, var(--P4SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P4Size) var(--P4Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P4Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P4Ball) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--FloraSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--LeafSealC); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Maçiera
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 5 - Susu */
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P5PrimType) 50%, var(--P5SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P5Size) var(--P5Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P5Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P5Ball) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--CoolSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--BubbleSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    L'Basseau
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Istha Position - Istha */
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P6PrimType) 50%, var(--P6SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P6Size) var(--P6Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P6Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P6Ball) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--BeautySealC); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--StarSealD); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Istha
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 7 - Pari */
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--PariPrimType) 50%, var(--PariSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--PariSize) var(--PariImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--PariGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--PariItem) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--PariBall) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--StarSealD); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--SongSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Pariparsithea
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 8 - Bambi */
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--BamPrimType) 50%, var(--BamSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--BamSize) var(--BamImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--BamGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--BamItem) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--BamBall) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--BeautySealC); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--CoolSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Bambi
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 9 - Kasriel */ 
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--KasPrimType) 50%, var(--KasSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--KasSize) var(--KasImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--KasGender); background-color: var(--maleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--KasItem) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--KasBall) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SmokeSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--HeartSealF); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Kasriel
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 10 - Nava*/
aspect-ratio: 1; height: var(--poke-cell-height); min-width: var(--poke-cell-width); box-sizing: border-box; scroll-snap-align: center;  line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--NavaPrimType) 50%, var(--NavaSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--NavaSize) var(--NavaImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--NavaGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--NavaItem) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--NavaBall) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: var(--chev-up-right); top: var(--chev-up-top);][fa]fa fa-chevron-up fa-2x[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--seal-size); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--StarSealD); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--CoolSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: var(--chev-down-left); bottom: var(--chev-down-bott);][fa]fa fa-chevron-down fa-2x[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Bâquîle Nâva
    [/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]



[comment]*!SECTION -  Pokebar End[/comment][/div]

[comment]/*!SECTION */ [/comment][/div]

[div=/*SECTION - Post */
box-sizing: border-box;
position: relative;
width: 100%; min-height: 100%;
background: var(--bg-color);
border: var(--post-border);
display: flex; flex-direction: column; justify-content: flex-end;
-webkit-scroll-snap-type: y mandatory; scroll-snap-type: y mandatory; scroll-snap-align: center;
padding: 1rem;]
[div=/*STUB - Time Stamp */
position: absolute; top: -20px; left: 50%; transform: translateX(-50%);
width: 190px; height: 35px; font-family: var(--timestamp-font); font-weight: bold;
border: var(--name-border); background: var(--bg-color);
display: flex; justify-content: center; align-items: center;]
[div=animation: fa-fade 3.5s ease-in-out infinite; display: inline; padding: 0 5px;] 6:40 [/div] A.M.
[/div]
[div=position: absolute; display: flex; justify-content: center; align-items: center; width: 50%; bottom: 20px; left: 50%; transform: translateX(-50%);]
⬅ Scroll ➡
[/div]
[div=/*STUB - Tags */
position: absolute; bottom: -20px; left: 50%; transform: translateX(-50%);
width: 300px; height: 35px; font-family: var(--timestamp-font); font-weight: bold;
border: var(--name-border); background: var(--bg-color);
overflow-x: scroll; scroll-snap-type: x mandatory;
display: flex; flex-flow: column wrap; justify-content: center; align-items: center;]
[div=scroll-snap-align: center; border-right: 2px solid var(--accent-c); height: 100%; width: 100%;
display: flex; justify-content: center; align-items: center;]Nyra (@Laele_Hali)[/div]
[/div]
[div=/*STUB - Text Formatting */
margin: auto 2.5%; padding: 2.5%;
line-height: 1.6; letter-spacing: 1px;
font-family: var(--text-font);
overflow-y: scroll; overflow-x: hidden; scrollbar-width: thin; scrollbar-color: var(--scrollbar-color) transparent;]

[div=/*ANCHOR - Trigger Warnings */
display: none; 
font-weight: bold; font-size: 20px; width: fit-content; height: fit-content; margin: auto;]
TW: Language
[/div]
Lorem ipsum dolor sit amet,
consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer
venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit
amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante,
aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut
sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis,
laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis,
sollicitudin at auctor a, elementum non erat. Convallis hendrerit semper.
Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros
quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a,
elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor.
Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam
molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper
risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum,
iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare,
ut tincidunt nisi efficitur.
[/div] 
[comment]/*!SECTION */ [/comment][/div]

[/div]