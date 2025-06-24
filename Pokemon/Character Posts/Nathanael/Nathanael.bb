[comment][font=Barlow][font=Gugi]:][/font][/font][/comment][border=transparent;
/* Probably best if you don't change anything I haven't commented next to */

margin: auto;
box-sizing: border-box;
max-width: 800px; /* Max width */
width: clamp(250px, 80%, 900px);
padding: 0px var(--circle-d-1) 0px var(--circle-d-2);
position: relative;

--h: min(450px, 90vh);

/* Character Image */
--char-img: url(https://i.imgur.com/v50Kuif.png);
--pokeball-img: url(https://w7.pngwing.com/pngs/833/548/png-transparent-game-pokeball-pokemon-pokemongo-pokestop-pokemon-go-addict-icon-thumbnail.png);

/* Gender Images */
--male: #89CFF0; url(https://i.imgur.com/4FI7ot0.png);
--female: #F4C2C2; url(https://i.imgur.com/wpBhCjV.png);

/* Pokémon Team Data */
--JujuImg: url(https://www.smogon.com/forums/attachments/570_1-png.450202/);
--JujuPrimType: #C6C6A7;
--JujuSecType: #493963;
--JujuGender: var(--female);
--JujuItem: url(https://archives.bulbagarden.net/media/upload/d/d9/MDBag_Red_Bow_TDS_Sprite.png);

/*ANCHOR - P1 */
--P1Img: var(--JujuImg);
--P1PrimType: var(--JujuPrimType);
--P1SecType: var(--JujuSecType);
--P1Gender: var(--JujuGender);
--P1Item: var(--JujuItem);

/*ANCHOR - P2 */
--P2Img: ;
--P2PrimType: ;
--P2SecType: ;
--P2Gender: ;
--P2Item: ;

/*ANCHOR - P3 */
--P3Img: ;
--P3PrimType: ;
--P3SecType: ;
--P3Gender: ;
--P3Item: ;

/*ANCHOR - P4 */
--P4Img: ;
--P4PrimType: ;
--P4SecType: ;
--P4Gender: ;
--P4Item: ;

/*ANCHOR - P5 */
--P5Img: ;
--P5PrimType: ;
--P5SecType: ;
--P5Gender: ;
--P5Item: ;

/*ANCHOR - P6 */
--P6Img: none;
--P6PrimType: ;
--P6SecType: ;
--P6Gender: ;
--P6Item: ;

/* Sizes */
--pSlotHeight: calc(1.25*var(--d));
--pIconFontS: 9.5px;
--pIconHeight: calc(var(--pSlotHeight)/3);
--pIconLevelHeight: calc(var(--pSlotHeight)/2.65);

/* Accent colours */
--c-1: #bbbd90; /* Header Text Colour */
--c-2: #ff8e8a; /* Line colour */
--c-3: #828282; /* Body background colour */
--d-c: #ff8e8a; /* Dialogue colour */

--b-i: linear-gradient(var(--c-2) 18%, transparent calc(18% + 1px) 82%, var(--c-2) calc(82% + 1px)) 1% stretch;

--line-w: 3px;
--line-m-l: 10px;
--line-m-t: 12px;
--line-c-p: polygon(0 calc(var(--line-w) + 1px), 0 0, 100% 100%, calc(100% - var(--line-w) - 1px) 100%);

--circle-d-1: 1px;
--circle-d-2: 3px;
--circle-w: 12px;

--header-d: 6px;
--header-h: 50px;
--header-f-s: clamp(0.75em, 2vw, 1.6em);
--header-f: 'Gugi', sans-serif; /* Header font, change font tag above if you change this -- changing the header font may cause the line shift */

--p: 20px;
--d: max(5vw, 40px);
--c-p: polygon(0 0, calc(100% - var(--d)) 0%, 100% var(--d), 100% 100%, var(--d) 100%, 0% calc(100% - var(--d)));

--text-w: 200px;
--text-f-s: clamp(0.75em, 1.5vw, 1.05em); /* Text font size, increase or decrease by increments of .1 or .01 */
--text-f: 'Barlow', sans-serif; /* Body text font, change font tag above if you change this */
--text-c: #1a2c37; /* Text color */

--img-w: 60px;
--img-h: 200px;]
[div=/*SECTION - Pokémon Sidebar */
--p-height: 45px;
--p-micro: calc(var(--p-height)/2.25);
--bg-color: transparent;
--p-size: 150%;
--held-right: -7.5px;
--gen-left: -7.5px;

position: absolute;
top: 180px; right: -22.5px;
z-index: 1;

box-sizing: border-box; display: flex; width: calc(15px + var(--p-height)); font-size: var(--fs-mini); justify-content: space-evenly; border-radius: 15px; flex-flow: column nowrap; gap: clamp(1px, 0.5vh, 5px); align-items: center; height: clamp( 150px, 90%, 350px); overflow-y: scroll; scrollbar-width: none; padding-top: 10px;
box-shadow: 10px 5px 15px #000;]
[div=/*SECTION - Pokemon 1 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P1Img) var(--P1PrimType); border: 2px solid var(--P1SecType); border-radius: 100px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P1PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender); border: 2px Ridge var(--P1SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 2 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P2Img) var(--P2PrimType); border: 2px solid var(--P2SecType); border-radius: 100px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P2PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender); border: 2px Ridge var(--P2SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 3 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P3Img) var(--P3PrimType); border: 2px solid var(--P3SecType); border-radius: 100px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P3PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P3Gender); border: 2px Ridge var(--P3SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border: 2px Ridge var(--P3SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 4 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P4Img) var(--P4PrimType); border: 2px solid var(--P4SecType); border-radius: 100px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P4PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P4Gender); border: 2px Ridge var(--P4SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border: 2px Ridge var(--P4SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 5 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P5Img) var(--P5PrimType); border: 2px solid var(--P5SecType); border-radius: 100px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P5PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P5Gender); border: 2px Ridge var(--P5SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border: 2px Ridge var(--P5SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 6 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P6Img) var(--P6PrimType); border: 2px solid var(--P6SecType); border-radius: 100px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P6PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P6Gender); border: 2px Ridge var(--P6SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border: 2px Ridge var(--P6SecType); border-radius: 100px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*!SECTION */ display: none;][/div][/div]
[comment]-- Top Header --[/comment][border=transparent;
position: relative;
top: calc(var(--d) - var(--line-m-t) - var(--header-d));
box-sizing: border-box;
min-height: calc(var(--d) + var(--line-m-t));
padding: 0px;
display: flex;
flex-flow: row nowrap;
justify-content: flex-start;
align-items: flex-start;][comment]-- Circle --[/comment][border=transparent;
position: absolute;
top: calc(100% - var(--circle-w) - var(--header-d) - var(--circle-d-1));
left: calc(100% - var(--circle-w) + var(--circle-d-1));
width: var(--circle-w);
height: var(--circle-w);
border-radius: 50%;
background: var(--c-2);
padding: 0px;
z-index: 2;][/border][comment]-- Text --[/comment][div=box-sizing: border-box;
max-width: -moz-fit-content;
max-width: fit-content;
padding: 0px;
color: var(--c-1);
font-size: clamp(1vw, var(--header-f-s), 4.5vw);
font-family: var(--header-f);
line-height: 1.2;][comment] -- Character Location --[/comment] Eterna City > Hearthome City
[/div]
[comment]-- Line --[/comment][border=transparent;
margin-top: var(--line-m-t);
margin-left: var(--line-m-l);
box-sizing: border-box;
flex: 1 1;
height: var(--line-w);
background: var(--c-2);
padding: 0px;][/border][border=transparent;
margin-top: var(--line-m-t);
box-sizing: border-box;
flex: 0 0 calc(var(--d) - 9px);
height: calc(var(--d) - 9px);
background: var(--c-2);
padding: 0px;
-webkit-clip-path: var(--line-c-p);
clip-path: var(--line-c-p);][/border][/border][comment]
-- Content --[/comment][border=transparent;
box-sizing: border-box;
width: 100%;
height: var(--h);
padding: 0px;
background: var(--c-3);
-webkit-clip-path: var(--c-p);
clip-path: var(--c-p);
display: flex;
flex-flow: row wrap;
justify-content: flex-end;
align-items: stretch;
position: relative;]

[comment]-- Text Container --[/comment][border=transparent;
box-sizing: border-box;
flex: 2 1 var(--text-w);
height: var(--h);
width: 90%;
padding: 0px;
overflow: hidden;
scrollbar-width: none;][comment]-- Hidden Scroll --[/comment][border=transparent;
box-sizing: border-box;
width: calc(90% + 30px);
height: 100%;
padding: 0px;
overflow: auto; 
scrollbar-width: none;][comment]-- Text --[/comment][border=transparent;
box-sizing: border-box;
width: calc(90% - 30px);
padding: var(--p) var(--p) var(--p) var(--p);
margin: 0px auto;
color: var(--text-c);
font-size: var(--text-f-s);
font-family: var(--text-f);
font-kerning: normal;
line-height: 1.5;
text-align: justify;
word-wrap: break-word;
hyphens: auto;]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.


Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[/border][/border][/border][comment]

-- On-Hand Scrollbox (Pokémon, Inventory, etc.) --[/comment][border=transparent;
box-sizing: border-box;
display: flex;
flex-wrap: wrap;
min-width: var(--d);
max-width: calc(2.65*var(--d));
height: calc(2.45*var(--img-h));
margin: 0px auto;
min-height: var(--img-h);
padding: 0px;
justify-content: space-evenly;
margin-top: -2.5%;
overflow-y: scroll;
scrollbar-width: none;
background-color: var(--c-3);
position: relative;
right: 5%;]
[border=transparent;
box-sizing: border-box;
min-width: -moz-fit-content;
min-width: fit-content;
width: 100%;
padding: 0px;
color: var(--c-1);
font-size: calc(0.5*var(--header-f-s));
font-family: var(--header-f);
font-variant: small-caps;
line-height: 1.2;
text-align: center;
position: relative;
top: 15%;]Sprites by [url=https://www.smogon.com/forums/threads/smogon-sprite-project.3647722/]Smogon Sprite Project[/url][br][/br]Base Code by Ambiloquous
FC AI Generated
Interactions:
[div=font-size: calc(0.65*var(--text-f-s));]@Merciless Medic | @Theo713 | @Absollover77 [/div][/border]
[div=/*ANCHOR - CHARACTER IMAGE*/
border: 2px solid transparent;
box-sizing: border-box;
border-image: var(--b-i);
background-image: var(--char-img);
background-size: 100% 100%;
background-position: center;
border-radius: 15px;
min-width: var(--d);
max-width: calc(2*var(--d));
height: var(--d);
min-height: calc(3*var(--d));
aspect-ratio: 2/3;
position: relative;
top: 15%;][/div]
[border=0px;
visibility: hidden;
margin: auto;
padding: 0px;]
[accordion=100% | bcenter]
[comment] -- Inventory Slide -- [/comment]
{slide=center | [bg=transparent;
visibility: visible;
position: relative;
margin: 0;
padding: 0px;
z-index: 2;][comment]-- Ribbon --[/comment][comment] -- Inventory Title -- [/comment]
[border=2px solid transparent;
box-sizing: border-box;
min-width: -moz-fit-content; min-width: fit-content;
width: 100%; height: 100%;
padding: 5px; margin-top: 15%;
color: var(--c-1);
font-size: var(--header-f-s); font-family: var(--header-f); font-variant: small-caps;
line-height: 1.2;
text-align: center;
border-image: var(--b-i);]- Inventory -[/border][/bg]}
[div=display: flex;
border: 2px solid transparent;
flex-wrap: wrap;
height: 100%;
width: 100%;
min-width: 100%;
max-width: calc(2.95*var(--d));
background: var(--c-3);
visibility: visible;
border-image: var(--b-i);
align-items: center;
justify-content: center;]
[comment] - Inventory Items Go Here - [/comment]
Money:  $3,265 > $3,165 (-$100 PokéCenter)
Potion x 2 
Pokéball x 2
[/div]
{/slide}
[/accordion]
[/border]
[/border][/border][comment]-- Top Header --[/comment][border=transparent;
position: relative;
top: calc(0px - var(--d) + var(--line-m-t) + var(--header-d) + 1px);
box-sizing: border-box;
min-height: calc(var(--d) + var(--line-m-t));
padding: 0px;
display: flex;
flex-flow: row-reverse nowrap;
justify-content: flex-start;
align-items: flex-end;][comment]-- Circle --[/comment][border=transparent;
position: absolute;
top: calc(0px + var(--circle-d-2));
left: calc(0px - var(--circle-d-2));
width: var(--circle-w);
height: var(--circle-w);
border-radius: 50%;
background: var(--c-2);
padding: 0px;
z-index: 2;][/border][comment]-- Text --[/comment][border=transparent;
position: relative;
top: 1px;
box-sizing: border-box;
max-width: -moz-fit-content;
max-width: fit-content;
padding: 0px;
color: var(--c-1);
font-size: clamp(1vw, var(--header-f-s), 4.5vw);
font-family: clamp(1vw, var(--header-f-s), 4.5vw);
line-height: 1.2;][comment] Character Time / Date [/comment] 12:00 p.m. | Monday, July 5th
[/border][comment]-- Line --[/comment][border=transparent;
margin-bottom: var(--line-m-t);
margin-right: var(--line-m-l);
box-sizing: border-box;
flex: 1 1;
height: var(--line-w);
background: var(--c-2);
padding: 0px;][/border][border=transparent;
margin-bottom: calc(var(--line-m-t) - 1px);
box-sizing: border-box;
flex: 0 0 calc(var(--d) - 9px);
height: calc(var(--d) - 9px);
background: var(--c-2);
padding: 0px;
transform: scaleX(-1) rotate(90deg);
-webkit-clip-path: var(--line-c-p);
clip-path: var(--line-c-p);][/border][/border][/border]