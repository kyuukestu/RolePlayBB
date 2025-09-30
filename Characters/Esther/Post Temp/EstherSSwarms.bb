[comment][font=Leckerli One][font=Merienda][font=Bellota][font=Kosugi Maru].[/font][/font][/font][/font][/comment]

[div=box-sizing: border-box; 
display: flex; justify-content: center; align-items: center; flex-flow: column-reverse nowrap;
margin: 0; 
background: var(--backdrop-bg);

--dark-bg: linear-gradient(to bottom, #3c3c3c 95%, #1c2526);
--post-bg: #333;
--summary-bg: #2a2a2a; /* var(--dark-bg); */
--post-border: var(--esther-c);

--essy-norm: no-repeat 50% 0%/cover url(https://i.imgur.com/mDaFSk0.png);
--essy-farm: no-repeat 50% -10%/85% url(https://i.imgur.com/1pcaKHb.png);
--essy-aviator: no-repeat 100% 5%/85% url(https://imgur.com/1mFtI5W.png);

--essy-img: var(--essy-aviator);
--scene-bg: url(https://static.zerochan.net/Pok%C3%A9mon.Gold...Silver.full.3220139.jpg);
--backdrop-bg: no-repeat center/100% 100% var(--scene-bg);




/*ANCHOR - Cursor */
cursor: url(https://archives.bulbagarden.net/media/upload/9/93/Bag_Pok%C3%A9_Ball_Sprite.png), pointer;

/*ANCHOR - Font Sizes */
--fs-H1: calc(var(--fs-B) * 1.5);
--fs-B: clamp(12px, calc(0.8em + 0.3dvw), 1.3em);
--fs-H2: calc(var(--fs-B) * 0.67);

/*ANCHOR - Font Family*/
--H1-font: Leckerli One;
--H2-font: Kosugi Maru;
--B-font: Bellota;

/*ANCHOR - Accent Colors */
--accent-c: #C00000; /*#B22;*/ 
--highlight-prim: #900;
--highlight-sec: #fc0;
--highlight-ter: #a86;
--main-text-c: #e0e0e0;
--tab-bgc: #1a1a1a;
--tab-border-c: #f00;

--cover-border: 3px solid var(--highlight-prim);


/*ANCHOR - Character Colors */
--esther-c: #f05656;
--shayan-c: #b22222;
--parisa-c: #7fff00;
--irisa-c: #663399;

/*SECTION - Pokémon */
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
--bg-color: transparent;
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
[div=flex: 20%; display: flex; flex-flow: column; max-height: 100dvh; min-width: 20px; width: 80%; position: relative;]


[div=/*SECTION - Pokémon Bar */
visibility: visible; box-sizing: border-box; width: 95%; height: 250px; line-height: 0;
-webkit-backdrop-filter: brightness(0.5); backdrop-filter: brightness(0.5); background-color: transparent; display: flex; border-radius: 90px 0px;
overflow-y: scroll; overflow-x: hidden; scrollbar-width: thin; scrollbar-color: var(--accent-c) transparent; scroll-snap-type: y mandatory; -webkit-scroll-snap-type: y mandatory; 
justify-content: space-evenly; flex-flow: row wrap; gap: 15px; align-items: center; z-index: 1; margin: auto; font-family: var(--H2-font); color: #fff; font-weight: bold; margin-top: 25px;
position: relative; padding: 10px;
--pHeight: 150px;
--cellWidth: min(180px, 25%);
--cellMax: 85%;
--cellWMax: 30%;
--pMaxWidth: 20%;
--p-micro: 20%;
--chev-down-left: 5px;
--chev-down-bott: -25px;
--chev-up-top: -25px;
--chev-up-right: 5px;
--seal-size: 100%;
--cellBorder: 1px solid var(--accent-c);
--cellRadius: 25% 0%;
]
[div=/*SECTION - Pokémon Position 1 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P1PrimType) 50%, var(--P1SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P1Size) var(--P1Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P1Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P1Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 2 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);; 
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P2PrimType) 50%, var(--P2SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P2Size) var(--P2Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P2Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P2Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 3 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P3PrimType) 50%, var(--P3SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P3Size) var(--P3Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P3Gender); background-color: var(--maleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P3Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 4 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P4PrimType) 50%, var(--P4SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P4Size) var(--P4Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P4Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P4Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 5 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P5PrimType) 50%, var(--P5SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P5Size) var(--P5Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P5Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P5Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 6 */ display: none;
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);;
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P6PrimType) 50%, var(--P6SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P6Size) var(--P6Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P6Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P6Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 7 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--PariPrimType) 50%, var(--PariSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--PariSize) var(--PariImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--PariGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--PariItem) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--PariBall) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 8 */ display: none;
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius);
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--BamPrimType) 50%, var(--BamSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--BamSize) var(--BamImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--BamGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--BamItem) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--BamBall) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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
[div=/*SECTION - Pokémon Position 9 */ display: none;
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--KasPrimType) 50%, var(--KasSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--KasSize) var(--KasImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--KasGender); background-color: var(--maleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--KasItem) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--KasBall) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
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



[comment]*!SECTION -  Pokebar End[/comment][/div]

[/div]

[div=display: flex; flex-flow: row wrap; flex: 80%; width: 90%; padding: 20px; box-shadow: 0 6px 12px rgba(0, 0, 0, 0.3); min-width: 200px; margin-bottom: 20px;]
[div=display: flex; flex-flow: column nowrap; flex: 33%; padding: 10px;][div=width: fit-content; margin: auto; color: black; font-size: 10px;]Char Art AI Generated[/div]
[div=/*SECTION -  Char Img *!SECTION */ 
border: 2px double var(--esther-c); box-shadow: 0 0 8px var(--esther-c); aspect-ratio: 1; width: 80%; max-width: 250px; min-width: 100px; background: var(--essy-img); margin: auto;][/div][/div]

[div=display: flex; gap: 15px; flex: 60%; align-items: center;] 
[div=/*SECTION -  Info: Location, Time, Tags, Interactions, Mentions *!SECTION */
flex: 1; line-height: 0; max-width: 90dvw;] 
[div=display: flex; margin-bottom: 12px; padding: 10px 20px; text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5); color: var(--accent-c);  backdrop-filter: brightness(0.5);] 
    [div=background: var(--summary-bg); border: 1px solid #b71c1c; border-radius: 50%; padding: 10px; height: 50px; aspect-ratio: 1; display: flex; justify-content: center; align-items: center;][fa]fa fa-map-location-dot[/fa][/div] 
    [div=flex: 80%; text-align: center; display: flex; justify-content: center; align-items: center; font-family: var(--H2-font); line-height: normal;] Moo Moo Farm -- R39 | Johto Region [/div] 
[/div] 
[div=display: flex; margin-bottom: 12px; padding: 10px 20px; text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5); color: var(--accent-c);  backdrop-filter: brightness(0.5);] 
    [div=background: var(--summary-bg); border: 1px solid #b71c1c; border-radius: 50%; padding: 10px; height: 50px; aspect-ratio: 1; display: flex; justify-content: center; align-items: center; animation: fa-spin 5s linear infinite;][fa]fa fa-clock[/fa][/div] 
    [div=flex: 80%; text-align: center; display: flex; justify-content: center; align-items: center; font-family: var(--H2-font); line-height: normal;]August 15th, Monday – 12:15 P.M. → 4:00 P.M.[/div] 
    [/div] 
[div=display: flex; margin-bottom: 12px; padding: 10px 20px; text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5); color: var(--accent-c);  backdrop-filter: brightness(0.5);] 
    [div=background: var(--summary-bg); border: 1px solid #b71c1c; border-radius: 50%; padding: 10px; height: 50px; aspect-ratio: 1; display: flex; justify-content: center; align-items: center;][fa]fa fa-user-group[/fa][/div]
    [div=flex: 80%; text-align: center; display: flex; justify-content: center; align-items: center; font-family: var(--H2-font); line-height: normal;]
        Hristo (@Rustic) | Theodore (@Theo713)
    [/div] 
[/div]
[comment]-- Font -->[font=Alata]:z[/font][/comment][border=0;

display: none;

/*!SECTION – Music Player */

/* Probably best if you don't change anything I haven't commented next to */

--music-grad-cen: radial-gradient(#000 15%, var(--accent-c) 50%);

--music-grad-to-right: linear-gradient(to right, #000 0%, var(--accent-c) 65%);

--music-grad-to-left: linear-gradient(to left, #000 0%, var(--accent-c) 65%);

margin: auto;

box-sizing: border-box;

height: 75px;

padding: 0;

width: 100%;

position: relative; top: 0;

/* Increase width for longer titles/subtitles, decrease for shorter */

max-width: 500px;

/* Colours */

--c-0: #F2B3CA;

--c-1: rgba(220, 70, 240);

--c-2: rgba(100, 70, 230);

--c-3: rgba(160, 70, 240);

--c-t: white; /* Text + Icon colour */

/* Left Text Variables */

--l-f-s: clamp(11px, 2.8dvw, 1.1em); /* Font size, increase by increments of .1 */

--l-f: 'Alata', sans-serif; /* Font family, change font tag above if you change this */

/* Right Text Variables */

--r-f-s: clamp(11px, 2.8dvw, 1.1em); /* Font size, increase by increments of .1 */

--r-f: 'Alata', sans-serif;/* Font family, change font tag above if you change this */

flex-flow: row nowrap;

justify-content: center;

align-items: center;

overflow-y: hidden;

overflow-x: auto;

scrollbar-width: none;][comment]

-- Diamond --[/comment][border=0;

--w: 84px;

position: absolute;

top: -5px;

left: calc(50% - (var(--w) / 2));

width: var(--w);

height: var(--w);

padding: 0;

background: var(--music-grad-cen);

clip-path: polygon(50% 0%, 100% 50%, 50% 100%, 0% 50%);

pointer-events: none;

z-index: 2;

display: flex;

flex-flow: row nowrap;

justify-content: center;

align-items: center;][border=0;

position: relative;

left: 4px;

padding: 0;

color: var(--c-t);

font-size: 26px;][fa]far fa-play[/fa][/border][/border][comment]

-- Left Text --[/comment][border=0;

--h: 38px;

--gap: 32px;

box-sizing: border-box;

position: absolute;

top: calc(50% - (var(--h) / 2));

left: 0;

width: calc(50% - var(--gap));

height: var(--h);

padding: 10px calc((var(--h) / 2) + 10px);

background: var(--music-grad-to-right);

clip-path: polygon(100% 0%, calc(100% - (var(--h) / 2)) 50%, 100% 100%, calc((var(--h) / 2) + 10px) 100%, 0% 50%, calc((var(--h) / 2) + 10px) 0%);

z-index: 1;

display: flex;

flex-flow: row nowrap;

justify-content: flex-end;

align-items: center;][border=0;

padding: 0;

color: var(--c-t);

font-size: var(--l-f-s);

font-family: var(--l-f);]Oracion[/border][/border][comment]

-- Right Text --[/comment][border=0;

--h: 38px;

--gap: 32px;

box-sizing: border-box;

position: absolute;

top: calc(50% - (var(--h) / 2));

left: calc(50% + var(--gap));

width: calc(50% - var(--gap));

height: var(--h);

padding: 10px calc((var(--h) / 2) + 10px);

background: var(--music-grad-to-left);

clip-path: polygon(calc(100% - (var(--h) / 2) - 10px) 0%, 100% 50%, calc(100% - (var(--h) / 2) - 10px) 100%, 0% 100%, calc((var(--h) / 2)) 50%, 0% 0%);

z-index: 1;

display: flex;

flex-flow: row nowrap;

justify-content: flex-start;

align-items: center;][border=0;

padding: 0;

color: var(--c-t);

font-size: var(--r-f-s);

font-family: var(--r-f);

text-overflow: ellipsis;]Pokémon M10[/border][/border][comment]

-- Music Player Container --[/comment][border=0;

flex: 0 0 43px;

height: 44px;

padding: 0;

overflow: hidden;

transform: scale(2);

opacity: 0;

z-index: 1;][border=0;

position: relative;

top: -11px;

left: -8px;

width: 62px;

height: 54px;

padding: 0;

overflow: hidden;][comment]

-- SoundCloud Media Element --[/comment][MEDIA=YouTube]lg4BAoEgZpE[/MEDIA][/border][/border][comment]/*!SECTION – Music player */[/comment][/border] 
[/div] 
[/div] 

[div=background: var(--post-bg); border: 2px solid linear-gradient(to right, var(--esther-c), #87CEEB); padding: 25px; line-height: 1.6; min-height: 200px; max-height: 70dvh; overflow-y: scroll; scrollbar-width: thin; scrollbar-color: var(--accent-c) transparent; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.4); font-family: var(--B-font); font-size: var(--fs-B); width: 100%; white-space: collapse;] 
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
[/div] [/div] [/div]