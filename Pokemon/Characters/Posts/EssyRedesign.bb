[comment][font=Laila][font=Nunito].[/font][/font][/comment]
[Tabs][Tab=Essy][div=/*SECTION - Post Design & Variables Container */ 
box-sizing: border-box; position: relative;
max-width: 75vw; height: var(--main-height); aspect-ratio: 7.5/6.5; margin: 0 auto;

/*ANCHOR - Cursor */
cursor: url(https://archives.bulbagarden.net/media/upload/9/93/Bag_Pok%C3%A9_Ball_Sprite.png), pointer;

/*ANCHOR - Font Sizes */
--fs-header: calc(var(--fs-body) * 1.5);
--fs-body: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.67);

/*ANCHOR - Code Size */
--main-height: clamp(250px, 100vh, 650px);
--main-width: 750px;

--p-height: 78%;
--p-width: 57%;

--c-height: var(--p-height);
--c-width: 37%;

/*ANCHOR - Accent Colors */
--accent-c: #B22; 
--essy-shadow: 5px 2px 5px var(--accent-c), -5px 2px 5px #000;

/*ANCHOR - Background Color */
background: var(--char-grad-bg);
--char-grad-bg: linear-gradient(145deg, #000 60%, var(--accent-c) 135%);
/*linear-gradient(145deg, #292A2D 60%, var(--accent-c) 135%)*/
border: 1px solid red;

/*ANCHOR - Text Color */
color: #fff;

/*ANCHOR - Character Colors */
--esther-c: #f05656;
--shayan-c: #b22222;

/*ANCHOR -  Character Image */
--char-img: url(https://i.imgur.com/mDaFSk0.png);
--char-img-2: url(https://i.imgur.com/V0jzh5D.png);
--char-img-w-bg: url(https://i.imgur.com/VBuNcmc.png);


/*SECTION - Pokémon */
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

/* Weather Icon List
Harsh Sun 
fa-solid fa-sun

Regular Sun
fa-regular fa-sun

Clear Night
fa-solid fa-moon

Snow
fa-solid fa-snowflake

Foggy
fa-solid fa-smog

Windy
fa-solid fa-wind

Cloudy
fa-solid fa-cloud-sun
fa-solid fa-cloud-moon

Thunder Storm Bolt
fa-solid fa-cloud-bolt

Sparse Rain 
fa-solid fa-cloud-sun-rain
fa-solid fa-cloud-moon-rain

Heavy Rain
fa-solid fa-cloud-showers-heavy */

/*ANCHOR - Sun/Moon Colors */
--sun-color: #FFFD37;
--evening-sun-color: #FFA500; 
--moon-color: #dcdcdc;

--icon-f-s: 1em;
--r-r: rotate(-45deg);

/*!SECTION */]

[div=/*SECTION - Pokémon Section */
--p-height: 50px;
--p-micro: calc(var(--p-height)/2.5);
--bg-color: transparent;
--p-size: 150%;
--held-right: -7.5px;
--gen-left: -7.5px;

box-sizing: border-box; display: flex; width: calc(15px + var(--p-height)); position: absolute; bottom: 20%; left: -45px; font-size: var(--fs-mini); justify-content: space-evenly; border-radius: 15px; flex-flow: column nowrap; gap: 5px; align-items: center;
background: linear-gradient(180deg, #292A2D 10%, var(--accent-c) 100%);
box-shadow: var(--essy-shadow);


/*ANCHOR Gender Images */
--male: #89CFF0; url(https://i.imgur.com/4FI7ot0.png);
--female: #F4C2C2; url(https://i.imgur.com/wpBhCjV.png);]
[div=/*SECTION - Pokémon 1 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P1Img) var(--P1PrimType); border: 2px solid var(--P1SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P1PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokémon 2 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P2Img) var(--P2PrimType); border: 2px solid var(--P2SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P2PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokémon 3 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P3Img) var(--P3PrimType); border: 2px solid var(--P3SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P3PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P3Gender); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokémon 4 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P4Img) var(--P4PrimType); border: 2px solid var(--P4SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P4PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P4Gender); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokémon 5 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P5Img) var(--P5PrimType); border: 2px solid var(--P5SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P5PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P5Gender); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokémon 6 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P6Img) var(--P6PrimType); border: 2px solid var(--P6SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P6PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P6Gender); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*!SECTION */ display: none;][/div][/div]

[div=/*ANCHOR - Post + Char Info Containers */ 
box-sizing: border-box; padding: 2.5%;
scrollbar-width: none; overflow-y: scroll; height: 100%; width: 100%; 
display: flex; flex-flow: row wrap; gap: 10px;]

[div=/*SECTION -  Char Info Container & BG*/
box-sizing: border-box; margin: auto; height: var(--c-height); width: var(--c-width);
border-radius: 7.5px; border: solid 1px #fff; position: relative; 
overflow: hidden; flex: 2 175px;
background: var(--char-img-w-bg) no-repeat top center/contain #fff;]

[div=/*ANCHOR - Char Details Frame */
height: 100%; width: 100%;
padding: 0; margin: auto 5px auto auto;
display: flex;
flex-flow: column nowrap;
position: relative;
z-index: 2;
overflow: hidden;]
[div=/*ANCHOR - Char Details Frame Scroll */
overflow: scroll; scrollbar-width: none; display: flex; flex-flow: column nowrap;
height: 100%; width: 100%;]
[div=/*ANCHOR - "Scroll" Flex-box  */
box-sizing: border-box; margin: 0 auto 5px 10px;;
width: 100%;
display: flex; 
justify-content: flex-start; align-items: flex-end;
color: var(--accent-c);
text-shadow: 1px 1px var(--accent-c); font-size: 10px; text-transform: uppercase; letter-spacing: 2px; font-weight: bold;
opacity: 0.95;
flex: 2 0 64%;]Scroll[/div]
[div=/*ANCHOR - Char Details Flex-box */
box-sizing: border-box; margin: auto; height: 200px; width: 100%; background: #000; position: relative; flex: 1 1 30%; max-height: 225px;]

[div=/*ANCHOR - Img & Name Row */ height: auto; width: 100%; display: flex; flex-flow: row nowrap;]
[div=/*ANCHOR -  Char Img */
box-sizing: border-box; 
border-radius: 100px; box-shadow: var(--essy-shadow);
background: var(--char-img-2) no-repeat center/cover;
height: 75px; aspect-ratio: 1; margin: auto auto auto 10px;][/div]
[div=/*ANCHOR - Char Name */
box-sizing: border-box; height: auto; width: 100%; position: relative;
color: var(--accent-c); text-shadow: 1px 1px var(--accent-c); font-size: var(--fs-body); letter-spacing: 2px; margin: auto; text-align: center; font-weight: bold;]Esther Rosana Sophys[/div]
[/div]
[div=/*ANCHOR - Char Info. */ display: flex; flex-flow: column nowrap; gap: 5px; overflow: scroll; scrollbar-width: none; background: var(--char-grad-bg); color: var(--accent-c); height: 115px; width: 100%; padding: 5px; font-size: var(--fs-mini);]
[div=/*ANCHOR - Location */ 
box-sizing: border-box; height: auto; width: 50%; color: #fff; text-shadow: 1px 1px var(--accent-c); font-size: var(--fs-body); letter-spacing: 2px; line-height: 1.75;]Location[/div]
Contest Hall – Exeggutor Island | Alola Region 
[div=/*ANCHOR - Time */
box-sizing: border-box; height: auto; width: 50%; color: #fff; text-shadow: 1px 1px var(--accent-c); font-size: var(--fs-body); letter-spacing: 2px; line-height: 1.75;]Time[/div]
August 11th | ~9:15 a.m.
[div=/*ANCHOR - Interactions */
box-sizing: border-box; height: auto; width: 50%; color: #fff; text-shadow: 1px 1px var(--accent-c); font-size: var(--fs-body); letter-spacing: 2px; line-height: 1.75;]Interactions[/div]
[div=/*ANCHOR - Mentions */
box-sizing: border-box; height: auto; width: 50%; color: #fff; text-shadow: 1px 1px var(--accent-c); font-size: var(--fs-body); letter-spacing: 2px; line-height: 1.75;]Mentions[/div]
[div=/*ANCHOR - Tags */
box-sizing: border-box; height: auto; width: 50%; color: #fff; text-shadow: 1px 1px var(--accent-c); font-size: var(--fs-body); letter-spacing: 2px; line-height: 1.75;]Tags[/div]
[/div]

[/div]
[/div]
[/div]



[div=/*!SECTION */][/div][/div]

[div=/*SECTION -  Post Container */
box-sizing: border-box; margin: 5px; height: var(--p-height); width: var(--p-width);
border-radius: 7.5px; border: solid 1px #fff; flex: 6 200px;
position: relative; margin: auto auto auto 5px; overflow-y: scroll; scrollbar-width: none;]
[div=/*ANCHOR - Weather */
border: 1px solid transparent; border-radius: 7.5px 7.5px 0px 0px;
position: sticky; top: 0px; margin: -22px auto auto auto;
box-sizing: border-box;
max-width: 100%; height: 75px; width: 100%;
line-height: 1.5; letter-spacing: 1px;
padding: 0px;
display: flex; justify-content: flex-end; align-items: center; flex-flow: column nowrap;
font-family: Laila, Georgia; font-size: var(--icon-f-s); color: var(--sun-color);
background: linear-gradient(275deg, rgba(255,255,255) 2.5%, rgba(22,176,238) 60%);][fa]fa-regular fa-sun
[/fa]
[div=]Sunny[/div][/div]
[div=/*ANCHOR - Text Formatting */
box-sizing: border-box;
padding: 2px 15px; font-size: var(--fs-body); display: block;
line-height: 1.5; letter-spacing: 1px; white-space: pre-line; text-align: justify; text-justify: inter-character;
font-family: 'Nunito', Georgia;]Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.[/div]

[div=/*!SECTION */][/div][/div]
[/div]

[div=/*ANCHOR - Signature */ position: absolute; bottom: 2px; left: 2px; height: auto; color: var(--accent-c); font-size: 10px;]Coded by CloudySkyLoftyMoon, inspired by Uxie.[/div]
[/div][/tab]

[tab=Bag]
[div=/*SECTION - Bag */
visibility: hidden; width: 85%; font-family: 'DM Mono', Georgia; font-size: var(--fs-body); height: 800px; position: relative; margin: auto;

--bag: url(https://i.imgur.com/GsOv1fN.png);
--bag-bg: #eee;
--bag-bd: #f45;
--bag-height: 75px;
/*ANCHOR -  Font Sizes */
--fs-header: calc(var(--fs-body) * 1.5);
--fs-body: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.67);]
    [accordion=90% | bcenter]
        {slide=open | [bg=transparent;
        visibility: visible;
        position: relative;
        margin: auto;
        padding: 0px;
        z-index: 2;][div=/*ANCHOR - Esther's Bag*/
        box-sizing: border-box; background: no-repeat center/80% var(--bag) var(--bag-bg); border: 2px solid var(--bag-bd); border-radius: 50px; height: var(--bag-height); aspect-ratio: 1; margin: auto;][/div][/bg]}
[div=box-sizing: border-box; visibility: visible; background: #292A2D; color: #eee; display: block; height: 350px; overflow: scroll; scrollbar-width: none; line-height: 1.2; font-family: 'Nunito', Georgia;]
[div=box-shadow: var(--essy-shadow); font-size: calc(1.3*var(--fs-header)); text-align: center; font-family: 'Laila', Georgia;]$700[/div]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Badges[/div]
    [border=transparent; /*ANCHOR - Badges */
--badge-1: url(https://i.imgur.com/rWgK3wq.png);
--badge-2: url(https://i.imgur.com/3F4mhrp.png);
--badge-3: url();
--badge-4: url();
--badge-5: url();
--badge-6: url();
--badge-7: url();
--badge-8: url();

--badge-size: 35px;

max-width: 300px;
display: flex; flex-flow: row wrap; justify-content: flex-start;]
[border=solid; background: no-repeat center/85% var(--badge-1) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px; box-shadow: 0px 0px 8px #fff][/border]
[border=solid; background: no-repeat center/85% var(--badge-2) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px; box-shadow: 0px 0px 8px #fff][/border]
[border=solid; background: no-repeat center/85% var(--badge-3) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-4) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-5) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-6) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-7) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-8) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[/border]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Ribbons[/div]
    [border=transparent; /*ANCHOR - Ribbons */
    --ribbon-1: url();
--ribbon-2: url();
--ribbon-3: url();
--ribbon-4: url();
--ribbon-5: url();

--ribbon-size: 35px;

max-width: 300px;
display: flex; flex-flow: row wrap; justify-content: flex-start;]
[border=solid; background: no-repeat center/85% var(--ribbon-1) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-2) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-3) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-4) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-5) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[/border]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=/*ANCHOR - Pokémon Exp. */
box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Pokémon[/div]
[div=box-shadow: 0px 2.5px 0px black; font-size: var(--fs-mini); text-align: center;]Party[/div]
Pyrrha Achilleia Astierra | Jangmo-o | Overcoat | Lv.25
Halay-Alae Huaka’i Pöncu | Houndour | Unnerve | Lv.23
Maçeira En’Çapolalê | Bounsweet | Oblivious  | Lv.20
L’ Basseau | Surskit | Swift Swim  | Lv.18
Īstha Hâq-Ra | Feebas | Adaptability | Lv.5
Gran Jecroix te Loon | Drifloon | Aftermath | Lv.5
[div=box-shadow: 0px 2.5px 0px black; font-size: var(--fs-mini); text-align: center;]Oblivia[/div]
Kasriel Ikaros Svelinka Sō | G. Zigzagoon | Gluttony | Lv.24
La Bamba | West Sea Shellos | Sticky Hold | Lv.20
Pariparisithea | Munna | Telepathy  | Lv.10
[/div]
        [div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Misc.[/div]
PokéToy
                PokéFlute
                Unidentified Fossil
                Flashlight
                Toiletries
                Water Bottle (1/2 Gallon)
                Water Purifier & Filter
[/div]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Quilt Set[/div]
Revelation Sleeping quality
                Revolt V2 Under-quilt
                Trek Light Hammock Set
                Double Hammock
                V9 Hammock Tarp
                Rope Kit
[/div]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Maintenance Kit[/div]
Gloves
                Steel File
                Maintenance Oil
[/div]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Climbing Gear[/div]
Crampons
                Ice Tool
                Harness
                Carabiners
                Belays
                Dry Rope
[/div]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]First-Aid Kit[/div]
Bandages
                Alcohol
                Anti-septic
                Pain Killers
                Adhesive Tape
                Scissors
[/div]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: var(--essy-shadow); font-size: var(--fs-header); text-align: center;]Clothes & Accessories[/div]
Gothic Lolita Set
                Lace Set 
                Chic Asymmetry Set 
                Winter Gear
                Kilt
                Ballet Flats
                Swimwear
                Swim Goggles
                Aviator Goggles
                Detachable Rollerblades
[/div]
        [/div]{/slide}
    [/accordion]
[div=/*!SECTION */][/div][/div][/tab][/Tabs]