[comment][font=Barlow][font=Iceberg]:][/font][/font][/comment]
[div=box-sizing: border-box; width: 100%;
display: flex; flex-flow: column nowrap;


--h: min(450px, 90vh);
--p: 10px;

/* Character Image */
--char-img: url(https://i.imgur.com/v50Kuif.png);
--pokeball-img: url(https://w7.pngwing.com/pngs/833/548/png-transparent-game-pokeball-pokemon-pokemongo-pokestop-pokemon-go-addict-icon-thumbnail.png);

/* Gender Images */
--male: url(https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Mars_symbol_%28outline%29.svg/800px-Mars_symbol_%28outline%29.svg.png); 
--female: url(https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Venus_symbol_%28outline%29.svg/800px-Venus_symbol_%28outline%29.svg.png); 

--maleC: #89CFF0;
--femaleC: #F4C2C2;

/* Pokémon Team Data */
--JujuImg: url(https://www.smogon.com/forums/attachments/570_1-png.450202/);
--JujuPrimType: #C6C6A7;
--JujuSecType: #493963;
--JujuGender: var(--female);
--JujuItem: url(https://i.imgur.com/Y3rrktA.png);
--JujuSize: 150%;

/*ANCHOR - P1 */
--P1Img: var(--JujuImg);
--P1PrimType: var(--JujuPrimType);
--P1SecType: var(--JujuSecType);
--P1Gender: var(--JujuGender);
--P1Item: var(--JujuItem);
--P1Size: var(--JujuSize);

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
--P6Gender: ;1
--P6Item: ;

/*ANCHOR - Badged */
--B1: url(https://i.imgur.com/kkCUwmn.png);
--B2: none;
--B3: none;    
--B4: none;
--B5: none;
--B6: none;
--B7: none;
--B8: none;

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
--header-f: 'Iceberg', sans-serif; /* Header font, change font tag above if you change this -- changing the header font may cause the line shift */

--p: 20px;
--d: max(5vw, 40px);
--c-p: polygon(0 0, calc(100% - var(--d)) 0%, 100% var(--d), 100% 100%, var(--d) 100%, 0% calc(100% - var(--d)));

--text-w: 200px;
--text-f-s: clamp(0.75em, 1.5vw, 1.05em); /* Text font size, increase or decrease by increments of .1 or .01 */
--text-f: 'Barlow', sans-serif; /* Body text font, change font tag above if you change this */
--text-c: #1a2c37; /* Text color */

--img-w: 60px;
--img-h: 200px;
]
[border=transparent;
/* Probably best if you don't change anything I haven't commented next to */

margin: 0 auto;
box-sizing: border-box;
max-width: 900px; /* Max width */
/* width: clamp(250px, 80%, 900px); */
padding: 0px var(--circle-d-1) 0px var(--circle-d-2);
position: relative;]
[div= /*ANCHOR - Badge Sidebar */
box-sizing: border-box; position: absolute; width: 75px; background-color: transparent; height: calc(var(--h) * 0.9); display: flex; flex-flow: column nowrap; justify-content: space-between; align-items: center; top: 28%; right: -37px; z-index: 2;

--badge-border: 1px inset var(--c-2);
]
[div= /*ANCHOR - Throughline */
box-sizing: border-box; flex: 1 1; 
width: var(--line-w); height: calc(var(--h) * 0.8);
background: var(--c-2); padding: 0px;
position: absolute; top: 10px;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B1) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B2) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B3) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B4) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B5) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B6) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B7) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[div=box-sizing: border-box; border: var(--badge-border); border-radius: 50%; background: no-repeat center/85% var(--B8) var(--c-3); aspect-ratio: 1; flex: 1 1 10%; max-height: 10%; z-index: 2;][/div]
[/div]
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
border-radius: 50%;3
background: var(--c-2);
padding: 0px;
z-index: 2;][/border][comment]-- Text --[/comment]
[div=box-sizing: border-box;
position: absolute;
top: -50%;
max-width: -moz-fit-content;
max-width: fit-content;
padding: 0px;
color: var(--c-1);
font-size: clamp(1vw, var(--header-f-s), 4.5vw);
font-family: var(--header-f);
line-height: 1.2;][comment]-- Location --[/comment] Snowpoint
[/div]
[div=box-sizing: border-box;
max-width: -moz-fit-content;
max-width: fit-content;
padding: 0px;
color: var(--c-1);
font-size: clamp(1vw, var(--header-f-s), 4.5vw);
font-family: var(--header-f);
line-height: 1.2;][comment] -- Date --[/comment] Wednesday, July 7th
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
width: calc(100% - 30px);
padding: var(--p) var(--p) calc(6*var(--p)) var(--p);
margin: auto;
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
[/border][/border][/border][border=transparent;
box-sizing: border-box;
display: flex;
flex-wrap: wrap;
min-width: var(--d);
max-width: calc(2.65*var(--d));
height: calc(1.75*var(--img-h));
margin: 0px auto;
min-height: var(--img-h);
padding: 0px;
justify-content: space-evenly;
margin-top: -2.5%;
overflow-y: scroll;
scrollbar-width: none;
background-color: var(--c-3);
position: relative;]
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
margin: 20% 25% 0 0;
]Sprites by [url=https://www.smogon.com/forums/threads/smogon-sprite-project.3647722/]Smogon Sprite Project[/url][br][/br]Base Code by Ambiloquous
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
margin: 0 auto;
][/div]
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
line-height: 1.2;][comment]  Time [/comment] 12:00 p.m.
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

[div=/*SECTION - Pokémon Bar */
visibility: visible; box-sizing: border-box; width: 100%; max-height: 145px; line-height: 0; background-color: transparent; display: flex; overflow-y: scroll; overflow-x: hidden; scrollbar-width: none; scroll-snap-type: y mandatory; -webkit-scroll-snap-type: y mandatory;
justify-content: space-evenly; flex-flow: row wrap; align-items: center; z-index: 1; margin: 0 auto; font-family: var(--H2-font); color: #fff; font-weight: bold; position: relative; padding: 0 10px;
--pokéShadow: drop-shadow(5px 0px 2px #353232);
--pHeight: 150px;
--cellWidth: 125px;
--cellMax: 125px;
--pWidth: min(200px, 30%);
--pMaxWidth: 20%;
--p-micro: 20%;
--bg-color: transparent;]
[div=/*SECTION - Pokémon Position 1 */
aspect-ratio: 1; max-width: var(--cellMax); min-width: var(--cellMax); line-height: 0;
padding: 15px; flex: 1 1 25%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P1PrimType) 50%, var(--P1SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 0; transform: rotate(15deg);][/div]
[div=
    box-sizing: border-box; background: no-repeat 25% 50%/var(--P1Size) var(--P1Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1; position: relative; z-index: 2;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P1Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]

[comment]*!SECTION -  Pokebar End[/comment][/div]

[comment] -- Inventory Title -- [/comment]
[border=2px solid transparent;
margin: 0 auto;
box-sizing: border-box;
min-width: -moz-fit-content; min-width: fit-content;
width: 80%; height: 45px;
padding: 5px;
color: var(--c-1);
font-size: var(--header-f-s); font-family: var(--header-f); font-variant: small-caps;
line-height: 1.2;
text-align: center;
border-image: var(--b-i);]- Inventory -[/border]
[div=margin: 0 auto;
border: 2px solid transparent;
height: 150px;
width: 80%;
font-family: var(--header-f);
overflow-y: scroll;
scrollbar-width: none;
background: var(--c-3);
visibility: visible;
border-image: var(--b-i);
padding: 0 15px;][comment] - Inventory Items Go Here - [/comment]
Initial: ₱40,965
[hr][/hr]
-
[hr][/hr]
Final: ₱40,965
[hr][/hr]
Potion x 2 
Pokéball x 2
[/div]

[/div]