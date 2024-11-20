[comment][font=Barlow][font=Gugi]:][/font][/font][/comment][border=transparent;
/* Probably best if you don't change anything I haven't commented next to */

margin: auto;
box-sizing: border-box;
max-width: 780px; /* Max width */
padding: 0px var(--circle-d-1) 0px var(--circle-d-2);

--h: min(390px, 90vh);

/* Character Image */
--char-img: url(https://media.discordapp.net/attachments/1199283935683813386/1200625044586516541/Screenshot_20240126_200924_AnimeArt.jpg);

/* Gender Images */
--male: url(https://media.discordapp.net/attachments/191374162978144257/1200288723233947758/latest.png);
--female: url(https://media.discordapp.net/attachments/191374162978144257/1200288797334700141/R.png);

/* Pokémon Team Data */
--poke-1-img: url(https://www.pokencyclopedia.info/sprites/gen5/ani_black-white_shiny/ani_bw-S_427.gif);
--poke-1-prim-type-color: #C6C6A7;
--poke-1-sec-type-color: #C6C6A7;

--poke-2-img: url();
--poke-2-prim-type-color: ;
--poke-2-sec-type-color: ;

--poke-3-img: url();
--poke-3-prim-type-color: ;
--poke-3-sec-type-color: ;

--poke-4-img: url();
--poke-4-prim-type-color: ;
--poke-4-sec-type-color: ;

--poke-5-img: url();
--poke-5-prim-type-color: ;
--poke-5-sec-type-color: ;

--poke-6-img: url();
--poke-6-prim-type-color: ;
--poke-6-sec-type-color: ;


/* Held Items */

--item-1-img: url( );


/* Accent colours */
--c-1: #bbbd90; /* Header Text Colour */
--c-2: #3CB6FF; /* Line colour */
--c-3: #828282; /* Body background colour */

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
--header-f-s: 1.6em;
--header-f: 'Gugi', sans-serif; /* Header font, change font tag above if you change this -- changing the header font may cause the line shift */

--p: 20px;
--d: max(5vw, 40px);
--c-p: polygon(0 0, calc(100% - var(--d)) 0%, 100% var(--d), 100% 100%, var(--d) 100%, 0% calc(100% - var(--d)));

--text-w: 200px;
--text-f-s: 1.05em; /* Text font size, increase or decrease by increments of .1 or .01 */
--text-f: 'Barlow', sans-serif; /* Body text font, change font tag above if you change this */
--text-c: #1a2c37; /* Text colour */

--img-w: 60px;
--img-h: 200px;][comment]-- Top Header --[/comment][border=transparent;
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
line-height: 1.2;][comment] -- Character Location --[/comment] Fight Area – Battle Zone 
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
align-items: stretch;][comment]

-- Text Container --[/comment][border=transparent;
box-sizing: border-box;
flex: 2 1 var(--text-w);
height: var(--h);
padding: 0px;
overflow: hidden;][comment]-- Hidden Scroll --[/comment][border=transparent;
box-sizing: border-box;
width: calc(100% + 30px);
height: 100%;
padding: 0px;
overflow: auto;][comment]-- Text --[/comment][border=transparent;
box-sizing: border-box;
width: calc(100% - 30px);
padding: var(--p) var(--p) var(--d) var(--p);
color: var(--text-c);
font-size: var(--text-f-s);
font-family: var(--text-f);
font-kerning: normal;
line-height: 1.6;]

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.



[/border][/border][/border][comment]

-- On-Hand Scrollbox (Pokémon, Inventory, etc.) --[/comment][border=transparent;
box-sizing: border-box;
display: flex;
flex-wrap: wrap;
min-width: var(--d);
max-width: calc(2.65*var(--d));
height: calc(2*var(--img-h));
min-height: var(--img-h);
padding: 0px;
justify-content: space-evenly;
margin-top: -2.5%;
overflow-y: scroll;
background-color: var(--c-3);]
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
top: 15%;]Sprites by [url=https://www.smogon.com/forums/threads/smogon-sprite-project.3647722/]Smogon Sprite Project[/url][br][/br]Base Code by Ambiloquous[/border]
[comment] -- Character Image -- [/comment]
[div=border: 2px solid transparent;
box-sizing: border-box;
border-image: var(--b-i);
background-image: var(--char-img);
background-size: 100% 100%;
background-position: center;
border-radius: 15px;
width: calc(2.25*var(--d));
min-width: var(--d);
max-width: calc(2.5*var(--d));
height: calc(2.25*var(--d));
min-height: var(--d);
max-height: calc(2.5*var(--d));
aspect-ratio: 1/1;
position: relative;
top: 15%;][/div]
[border=0px;
visibility: hidden;
margin: auto;
padding: 0px;]
[comment]-- On-Hand Accordion --[/comment]
[accordion=100% | bcenter]
[comment]-- Pokémon Party Slide --[/comment]
{slide=center | [bg=transparent;
visibility: visible;
position: relative;
margin: 0;
padding: 0px;
z-index: 2;][comment]-- Ribbon --[/comment][comment] -- Pokémon Party Title -- [/comment]
[border= 2px solid transparent;
box-sizing: border-box;
min-width: -moz-fit-content;
min-width: fit-content;
width: 100%;
height: 100%;
padding: 5px;
color: var(--c-1);
font-size: var(--header-f-s);
font-family: var(--header-f);
font-variant: small-caps;
line-height: 1.2;
text-align: center;
border-image: var(--b-i);]- Team -[/border][/bg]}
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
    [comment] -- Pokémon Slot 1 -- [/comment]
    [div=background-image: var(--poke-1-img); background-size: 85% 85%; background-color: var(--poke-1-prim-type-color); background-position: 5px center 5px; border: 2px solid var(--poke-1-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
        [comment] -- Pokémon 1 Gender -- [/comment]
        [div=background-image: var(--female); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); right: 5px;][/div]
        [comment] -- Pokémon 1 Held Item -- [/comment]
        [div=background-image: var( ); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); left: calc(0.35*var(--d))][/div]
    [/div]
    [comment] -- Pokémon Slot 2 -- [/comment]
    [div=background-image: var(--poke-2-img); background-size: 95% 95%; background-color: var(--poke-2-prim-type-color); background-position: center; border: 2px solid var(--poke-2-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%;]
        [comment] -- Pokémon 2 Gender -- [/comment]
        [div=background-image: var(--female); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); right: 5px;][/div]
        [comment] -- Pokémon 2 Held Item -- [/comment]
        [div=background-image: var( ); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); left: calc(0.35*var(--d))][/div]
    [/div]
    [comment] -- Pokémon Slot 3 -- [/comment]
    [div=background-image: var(--poke-3-img); background-size: 95% 95%; background-color: var(--poke-3-prim-type-color); background-position: center; border: 2px solid var(--poke-3-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%;][/div]
    [comment] -- Pokémon Slot 4 -- [/comment]
    [div=background-image: var(--poke-4-img); background-size: 95% 95%; background-color: var(--poke-4-prim-type-color); background-position: center; border: 2px solid var(--poke-4-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%;][/div]
    [comment] -- Pokémon Slot 5 -- [/comment]
    [div=background-image: var(--poke-5-img); background-size: 95% 95%; background-color: var(--poke-5-prim-type-color); background-position: center; border: 2px solid var(--poke-5-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%;][/div]
    [comment] -- Pokémon Slot 6 -- [/comment]
    [div=background-image: var(--poke-6-img); background-size: 95% 95%; background-color: var(--poke-6-prim-type-color); background-position: center; border: 2px solid var(--poke-6-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%;][/div]
[/div]
{/slide}
[comment] -- Inventory Slide -- [/comment]
{slide=center | [bg=transparent;
visibility: visible;
position: relative;
margin: 0;
padding: 0px;
z-index: 2;][comment]-- Ribbon --[/comment][comment] -- Inventory Title -- [/comment]
[border=2px solid transparent;
box-sizing: border-box;
min-width: -moz-fit-content;
min-width: fit-content;
width: 100%;
height: 100%;
padding: 5px;
color: var(--c-1);
font-size: var(--header-f-s);
font-family: var(--header-f);
font-variant: small-caps;
line-height: 1.2;
text-align: center;
border-image: var(--b-i)]- Inventory -[/border][/bg]}
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
Money: $5,000
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
font-size: var(--header-f-s);
font-family: clamp(1vw, var(--header-f-s), 4.5vw);
line-height: 1.2;][comment] Character Time / Date [/comment] 8:01 a.m. – July 1st
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