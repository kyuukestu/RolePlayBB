[comment][font=Leckerli One][font=Merienda][font=Bellota][font=Kosugi Maru].[/font][/font][/font][/font][/comment]

[div=box-sizing: border-box; 
display: flex; justify-content: center; align-items: center; 
max-height: 100vh; 
margin: 0; 
background: var(--backdrop-bg);

--dark-bg: linear-gradient(to bottom, #3c3c3c 95%, #1c2526); 
--essy-img: no-repeat 50% 0%/cover url(https://i.imgur.com/mDaFSk0.png);
--medifes: url(https://i.imgur.com/YNL5YNa.jpeg);
--backdrop-bg: no-repeat 50% 100%/100% 100% var(--medifes);




/*ANCHOR - Cursor */
cursor: url(https://archives.bulbagarden.net/media/upload/9/93/Bag_Pok%C3%A9_Ball_Sprite.png), pointer;

/*ANCHOR - Font Sizes */
--fs-H1: calc(var(--fs-B) * 1.5);
--fs-B: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
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
/*ANCHOR - Halay-Alae */
--HalImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--HalPrimType: #A29288;
--HalSecType: #9C531F;
--HalGender: var(--female);
--HalItem: url();
--HalBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR - Pari */
--PariImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/munna.gif);
--PariPrimType: #FA92B2;
--PariSecType: #A13959;
--PariGender: var(--female);
--PariItem: url();
--PariBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR - Ciera */
--CieImg: url(https://www.smogon.com/forums/attachments/761-gif.274544/);
--CiePrimType: #A7DB8D;
--CieSecType: #57913A;
--CieGender: var(--female);
--CieItem: url();
--CieBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR - L'Basseau */
--SusuImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--SusuPrimType: #C6D16E;
--SusuSecType: #506899;
--SusuGender: var(--female);
--SusuItem: url();
--SusuBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR - Kasriel */
--KasImg: url(https://www.smogon.com/forums/attachments/263_2-gif.284206/);
--KasPrimType: #A29288;
--KasSecType: #6D6D4E;
--KasGender: var(--male);
--KasItem: url();
--KasBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR - La Bamba */
--BamImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/shellos.gif);
--BamPrimType: #9DB7F5;
--BamSecType: #4A66AB;
--BamGender: var(--female);
--BamItem: url();
--BamBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR – Istha */
--IstImg: url(https://play.pokemonshowdown.com/sprites/gen5ani-shiny/feebas.gif);
--IstPrimType: #9DB7F5;
--IstSecType: #4A66AB;
--IstGender: var(--female);
--IstItem: url();
--IstBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR – Jecroix */
--JeImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/drifloon.gif);
--JePrimType: #A284A2;
--JeSecType: #58789B;
--JeGender: var(--male);
--JeItem: url();
--JeBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
/*ANCHOR - P1 */
--P1Img: var(--PyrImg);
--P1PrimType: var(--PyrPrimType);
--P1SecType: var(--PyrSecType);
--P1Gender: var(--PyrGender);
--P1Item: var(--PyrItem);
--P1Ball: var(--PyrBall);
/*ANCHOR - P2 */
--P2Img: var(--HalImg);
--P2PrimType: var(--HalPrimType);
--P2SecType: var(--HalSecType);
--P2Gender: var(--HalGender);
--P2Item: var(--HalItem);
--P2Ball: var(--HalBall);
/*ANCHOR - P3 */
--P3Img: var(--JeImg);
--P3PrimType: var(--JePrimType);
--P3SecType: var(--JeSecType);
--P3Gender: var(--JeGender);
--P3Item: var(--JeItem);
--P3Ball: var(--JeBall);
/*ANCHOR - P4 */
--P4Img: var(--CieImg);
--P4PrimType: var(--CiePrimType);
--P4SecType: var(--CieSecType);
--P4Gender: var(--CieGender);
--P4Item: var(--CieItem);
--P4Ball: var(--CieBall);
/*ANCHOR - P5 */
--P5Img: var(--SusuImg);
--P5PrimType: var(--SusuPrimType);
--P5SecType: var(--SusuSecType);
--P5Gender: var(--SusuGender);
--P5Item: var(--SusuItem);
--P5Ball: var(--SusuBall);
/*ANCHOR - P6 */
--P6Img: var(--IstImg);
--P6PrimType: var(--IstPrimType);
--P6SecType: var(--IstSecType);
--P6Gender: var(--IstGender);
--P6Item: var(--IstItem); 
--P6Ball: var(--IstBall);
/*!SECTION - Pokémon End */

] 
[div=flex: 20%; display: flex; flex-flow: column; max-height: 100vh; min-width: 20px;]
[div=width: fit-content; margin: auto; color: black; font-size: 10px;]Char Art AI Generated[/div]
[div=/*SECTION -  Char Img *!SECTION */ 
aspect-ratio: 1; width: 95%; min-width: 20px; border: 2px solid #b71c1c; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.4); background: var(--essy-img); margin: auto; position: relative;][/div] 


[div=/*SECTION - Pokémon Bar */
visibility: visible; box-sizing: border-box; width: 95%; height: calc(100% - 150px); line-height: 0;
-webkit-backdrop-filter: blur(5px); backdrop-filter: blur(5px); background-color: transparent; display: flex;  overflow: scroll; scrollbar-width: none; justify-content: space-evenly; flex: 1 1 20%; flex-flow: column nowrap; gap: 10px; align-items: center; z-index: 1; margin: auto; font-family: var(--H2-font); color: #1c2526; font-weight: bold;
position: relative;
--pHeight: 150px;
--pWidth: 90%;
--p-micro: 20px;]
[div=/*SECTION - Pokémon Position 1 */
    box-sizing: border-box; background: no-repeat center/75% var(--P1Img) var(--P1PrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--P1SecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P1Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P1Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SkySealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--SongSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Pyrrha
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 2 */
    box-sizing: border-box; background: no-repeat center/35% var(--P2Img) var(--P2PrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--P2SecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P2Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P2Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SmokeSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--FireSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Halay-Alae
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 3 */
    box-sizing: border-box; background: no-repeat center/35% var(--P3Img) var(--P3PrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--P3SecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P3Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P3Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SkySealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--HeartSealF); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Jecroix
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 4 */
    box-sizing: border-box; background: no-repeat center/35% var(--P4Img) var(--P4PrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--P4SecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P4Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P4Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--FloraSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--LeafSealC); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Maçiera
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 5 */
    box-sizing: border-box; background: no-repeat center/35% var(--P5Img) var(--P5PrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--P5SecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P5Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P5Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--BubbleSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--CoolSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    L'Basseau
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 6 */
    box-sizing: border-box; background: no-repeat center/35% var(--P6Img) var(--P6PrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--P6SecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P6Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P6Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--StarSealD); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--BeautySealC); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Istha
    [/div]
    [comment]/*!SECTION */[/comment]    
[/div]

[div=/*SECTION - Pokémon Position 7 */
    box-sizing: border-box; background: no-repeat center/35% var(--PariImg) var(--PariPrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--PariSecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--PariGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--PariItem) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--PariBall) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--StarSealD); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--SongSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Pariparisithea
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]

[div=/*SECTION - Pokémon Position 8 */
    box-sizing: border-box; background: no-repeat center/35% var(--BamImg) var(--BamPrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--BamSecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--BamGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--BamItem) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--BamBall) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--BeautySealC); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--CoolSealA); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Bambi
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]

[div=/*SECTION - Pokémon Position 9 */
    box-sizing: border-box; background: no-repeat center/65% var(--KasImg) var(--KasPrimType); aspect-ratio: 1; width: var(--pWidth); line-height: 0; filter: var(--pokéShadow); box-shadow: 10px 10px 8px var(--KasSecType); text-align: center; padding: 15px;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--KasGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--KasItem) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--KasBall) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Seals */
    background: no-repeat center/cover var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; transform: rotate(-90deg); position: relative;]
    [div=position: absolute; right: 5px; top: -12px;][fa]fa fa-chevron-up[/fa][/div]
    [div=display: block; overflow-y: scroll; scrollbar-width: none; scroll-snap-type: y mandatory; height: var(--p-micro); width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;]
        [div=background: no-repeat center/cover var(--SmokeSealB); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
        [div=background: no-repeat center/cover var(--HeartSealF); height: 100%; aspect-ratio: 1; transform: rotate(90deg);][/div]
    [/div]
    [div=position: absolute; left: 3px; bottom: -14px;][fa]fa fa-chevron-down[/fa][/div]
    [/div]
    [div=/*ANCHOR - Name */
    margin: 0 auto; width: fit-content;]
    Kasriel
    [/div]
    [comment]/*!SECTION */[/comment]
[/div]


[comment]*!SECTION -  Pokebar End[/comment][/div]

[/div]

[div=display: flex; flex-flow: column nowrap; flex: 80%; width: 600px; padding: 20px; box-shadow: 0 6px 12px rgba(0, 0, 0, 0.3); max-height: 100vh; min-width: 200px;]

[div=display: flex; gap: 15px;] 
[div=/*SECTION -  Info: Location, Time, Tags, Interactions, Mentions *!SECTION */
flex: 1; line-height: 0;] 
[div=display: flex; margin-bottom: 12px; background: var(--dark-bg); padding: 10px 20px; border: 1px solid #b71c1c; text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5); transform: skew(-10deg); color: #ffffff;] 
    [fa]fa fa-map-location-dot[/fa] 
    [div=flex: 80%; text-align: center; display: flex; justify-content: center; align-items: center; font-family: var(--H2-font); line-height: normal;] Loire de Fleuve Isle | Kalos Region [/div] 
[/div] 
[div=display: flex; margin-bottom: 12px; background: var(--dark-bg); padding: 10px 20px; border: 1px solid #b71c1c; text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5); transform: skew(-10deg); color: #ffffff;] 
    [fa]fa fa-clock[/fa] 
    [div=flex: 80%; text-align: center; display: flex; justify-content: center; align-items: center; font-family: var(--H2-font); line-height: normal;]August 6th, Saturday – 7:45 A.M.[/div] 
    [/div] 
[div=display: flex; margin-bottom: 15px; background: var(--dark-bg); padding: 10px 20px; border: 1px solid #b71c1c; text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5); transform: skew(-10deg); color: #ffffff;] 
    [fa]fa fa-user-group[/fa] 
    [div=flex: 80%; text-align: center; display: flex; justify-content: center; align-items: center; font-family: var(--H2-font); line-height: normal;]
        N/A
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

--l-f-s: clamp(11px, 2.8vw, 1.1em); /* Font size, increase by increments of .1 */

--l-f: 'Alata', sans-serif; /* Font family, change font tag above if you change this */

/* Right Text Variables */

--r-f-s: clamp(11px, 2.8vw, 1.1em); /* Font size, increase by increments of .1 */

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

[div=background: var(--dark-bg); border: 2px solid #b71c1c; padding: 20px; min-height: 200px; overflow-y: scroll; scrollbar-width: none; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.4); font-family: var(--B-font); font-size: var(--fs-B);] 
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
ut tincidunt nisi efficitur. [/div] [/div] [/div]