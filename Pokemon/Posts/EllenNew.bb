[comment][font=Copse][font=Mulish].[/font][/font][/comment]
[Tabs][Tab=Ellen][div=/*SECTION - Design Container */ 
box-sizing: border-box; padding: 2.5%; position: relative;
display: flex; 
width: 100%; height: var(--height);
background: repeat center/auto var(none);
cursor: url(https://archives.bulbagarden.net/media/upload/9/93/Bag_Pok%C3%A9_Ball_Sprite.png), pointer;
/*ANCHOR -  Font Sizes */
--fs-header: calc(var(--fs-body) * 1.5);
--fs-body: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.6);

--height: 800px;
--shadow: 5px 2px 5px #71D9E2, -5px 2px 5px #000;
color: #fff;

/*ANCHOR -  Character Image */
--char-img: url(https://i.imgur.com/VlsW1a5.png);
--flowers: url(https://as2.ftcdn.net/v2/jpg/01/91/08/25/1000_F_191082591_68juHKuvna2ULzjJGMHKQ1SPIKXZfzIb.jpg);]

[div=/*SECTION -  Post Container */
box-sizing: border-box; margin: auto; height: 95%; width: 88%;
background: linear-gradient(180deg, #292A2D 10%, #4d8288 90%, #71D9E2d9 100%);
border-radius: 15px; border: solid 2px #fff;
position: relative;]

[div=/*SECTION -  Char Img */
box-sizing: border-box; 
border-radius: 100px; box-shadow: var(--shadow);
background: var(--char-img) no-repeat center/90%;
height: clamp(55px, calc(4.5em + 5%), 125px); aspect-ratio: 1;
position: absolute; left: -50px; top: 75px; z-index: 2;
/*!SECTION */][/div]

[div=/*SECTION - Header */
border: 1px solid transparent;
position: absolute; top: 0px;
box-sizing: border-box;
max-width: 100%; min-width: 250px; height: 125px; width: 100%;
line-height: 1.5; letter-spacing: 1px;
margin: 0px auto; padding: 0px;
display: flex; flex-direction: column;
box-shadow: 0px 2px 2.5px #71D9E2d9;
font-family: 'Copse';
background: linear-gradient(350deg, rgba(255,255,255,0.6) 2.5%, rgba(22,176,238,0.6) 60%);]
[div=clip-path: polygon(0% 0%, 75% 0, 100% 65%, 100% 100%, 0% 100%);
max-width: 100%; min-width: 300px; height: 125px; width: 100%;
background: #292A2D;]
[div=/*ANCHOR - Location */
box-sizing: border-box; font-size: var(--fs-header); margin: auto; padding-left: 50px;] Somewhere  [div=box-sizing: border-box; font-size: var(--fs-mini);] Off Route 202, Sinnoh[/div][/div]
[div=/*ANCHOR - Date & Mention/Interactions */ 
box-sizing: border-box; font-size: var(--fs-mini); margin: -15px 0 0 0; padding-left: 55px;]August, 2[div=box-sizing: border-box; font-variant-position: super; display: inline;]nd[/div] | 11:05 a.m. | @absollover77 [/div] [/div]
[div=/*ANCHOR - Weather Icon */
box-sizing: border-box;
padding: 0px;

/* List
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

--icon-f-s: 2em;
--r-r: rotate(-45deg);

color: var(--evening-sun-color);
font-size: var(--icon-f-s);
font-weight: bold;
line-height: 1;
transform: var(--r-r);
position: absolute; top: max(5%, 5px); right: min(2.5%, 30px);][fa]fa-regular fa-sun[/fa][/div]
[div=/*!SECTION */][/div][/div]

[div=/*SECTION - Pokémon Section */
--p-height: 45px;
--p-micro: calc(var(--p-height)/2.5);
--bg-color: transparent;
--p-size: 150%;
--held-right: -7.5px;
--gen-left: -7.5px;

box-sizing: border-box; display: flex; width: calc(10px + var(--p-height)); position: absolute; bottom: 20%; left: -30px; font-size: var(--fs-mini); justify-content: space-evenly; border-radius: 15px; flex-flow: column nowrap; gap: 5px; align-items: center;
background: linear-gradient(180deg, #292A2D 10%, #4d8288 90%, #71D9E2d9 100%);
box-shadow: var(--shadow);


/*ANCHOR Gender Images */
--male: #89CFF0; 
--female: #F4C2C2; 

/*ANCHOR - Cordelia */
--CorImg: url(https://play.pokemonshowdown.com/sprites/gen5/mawile.png);
--CorPrimType: #D1D1E0;
--CorSecType: #9B6470;
--CorGender: var(--female);
--CorItem: url(https://i.imgur.com/Y3rrktA.png);

/*ANCHOR - Fawfaw */
--FawImg: url(https://play.pokemonshowdown.com/sprites/gen5/aron.png);
--FawPrimType: #D1D1E0;
--FawSecType: #786824;
--FawGender: var(--male);
--FawItem: url();

/*ANCHOR - Azalaïs */
--AzaImg: url(https://play.pokemonshowdown.com/sprites/gen5/piplup.png);
--AzaPrimType: #9DB7F5;
--AzaSecType: #445E9C;
--AzaGender: var(--female);
--AzaItem: url();

/*ANCHOR - Rio */
--RioImg: url(https://play.pokemonshowdown.com/sprites/gen5/egg.png);
--RioPrimType: #F5AC78;
--RioSecType: #786824;
--RioGender: var();
--RioItem: url();


/*ANCHOR - P1 */
--P1Img: var(--CorImg);
--P1PrimType: var(--CorPrimType);
--P1SecType: var(--CorSecType);
--P1Gender: var(--CorGender);
--P1Item: var(--CorItem);

/*ANCHOR - P2 */
--P2Img: var(--FawImg);
--P2PrimType: var(--FawPrimType);
--P2SecType: var(--FawSecType);
--P2Gender: var(--FawGender);
--P2Item: var(--FawItem);

/*ANCHOR - P3 */
--P3Img: var(--AzaImg);
--P3PrimType: var(--AzaPrimType);
--P3SecType: var(--AzaSecType);
--P3Gender: var(--AzaGender);
--P3Item: var(--AzaItem);

/*ANCHOR - P4 */
--P4Img: var(--RioImg);
--P4PrimType: var(--RioPrimType);
--P4SecType: var(--RioSecType);
--P4Gender: var(--RioGender);
--P4Item: var(--RioItem);

/*ANCHOR - P5 */
--P5Img: none;
--P5PrimType: none;
--P5SecType: none;
--P5Gender: none;
--P5Item: none;

/*ANCHOR - P6 */
--P6Img: none;
--P6PrimType: none;
--P6SecType: none;
--P6Gender: none;
--P6Item: none;]
[div=/*SECTION - Pokemon 1 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P1Img) var(--P1PrimType); border: 2px solid var(--P1SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P1PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 2 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P2Img) var(--P2PrimType); border: 2px solid var(--P2SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P2PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 3 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P3Img) var(--P3PrimType); border: 2px solid var(--P3SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P3PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P3Gender); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 4 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P4Img) var(--P4PrimType); border: 2px solid var(--P4SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P4PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P4Gender); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 5 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P5Img) var(--P5PrimType); border: 2px solid var(--P5SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P5PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P5Gender); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 6 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P6Img) var(--P6PrimType); border: 2px solid var(--P6SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P6PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P6Gender); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*!SECTION */ display: none;][/div][/div]
[div=/*ANCHOR - Text Section */
--eleonor-c: #71D9E2;
border: transparent;
position: absolute; top: 175px;
box-sizing: border-box;
padding: 15px 25px 15px 50px;
font-size: var(--fs-body);
line-height: 1.5; letter-spacing: 1px; height: 75%;
display: block;
overflow: scroll;
scrollbar-width: none;
white-space: collapse; text-align: justify;
font-family: 'Mulish';]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[/div]
[div=/*!SECTION */][/div][/div]
[div=/*!SECTION */][/div][/div][/tab]
[tab=Bag]
[div=/*SECTION - Bag */
visibility: hidden; width: 85%; font-family: 'Copse'; font-size: var(--fs-body); height: 800px; position: relative; margin: auto;

--bag: url(https://i.imgur.com/GsOv1fN.png);
--bag-bg: #eee;
--bag-bd: #7FD;
--bag-height: 75px;
/*ANCHOR -  Font Sizes */
--fs-header: calc(var(--fs-body) * 1.5);
--fs-body: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.6);]
    [accordion=90% | bcenter]
        {slide=open | [bg=transparent;
        visibility: visible;
        position: relative;
        margin: auto;
        padding: 0px;
        z-index: 2;][div=/*ANCHOR - Eleonor's Bag*/
        box-sizing: border-box; background: no-repeat center/80% var(--bag) var(--bag-bg); border: 2px solid var(--bag-bd); border-radius: 50px; height: var(--bag-height); aspect-ratio: 1; margin: auto;][/div][/bg]}
[div=box-sizing: border-box; visibility: visible; background: #292A2D; color: #eee; display: block; height: 350px; overflow: scroll; scrollbar-width: none; line-height: 1.2; font-family: 'Mulish';]
[div=box-shadow: 0px 5px 0px #71D9E2d9; font-size: calc(1.3*var(--fs-header)); text-align: center; font-family: 'Copse';]$2,500[/div]
[div=box-shadow: 0px 5px 0px #71D9E2d9; font-size: var(--fs-header); text-align: center;]Badges[/div]
    [border=transparent; /*ANCHOR - Badges */
--badge-1: url();
--badge-2: url();
--badge-3: url();
--badge-4: url();
--badge-5: url();
--badge-6: url();
--badge-7: url();
--badge-8: url();

--badge-size: 35px;

max-width: 300px;
display: flex; flex-flow: row wrap; justify-content: flex-start;]
[border=solid; background: no-repeat center/85% var(--badge-1) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-2) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-3) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-4) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-5) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-6) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-7) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-8) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[/border]
[div=box-shadow: 0px 5px 0px #71D9E2d9; font-size: var(--fs-header); text-align: center;]Ribbons[/div]
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
box-shadow: 0px 5px 0px #71D9E2d9; font-size: var(--fs-header); text-align: center;]Pokémon[/div]
[div=box-shadow: 0px 2.5px 0px black; font-size: var(--fs-mini); text-align: center;]Party[/div]
Cordelia Katia Adelais Anne-Marie Twdyr | Mawile | Intimidate | Lv. 20
Glewlwyd Gafaelfawr Galahad Gredifael Twdyr | Aron | Heavy Metal | Lv. 16
Azalaïs Anaëlle Aurélie Ascelina Twdyr | Piplup | Competitive  | Lv. 5
Egg
[/div]
        [div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: 0px 5px 0px #71D9E2d9; font-size: var(--fs-header); text-align: center;]Misc.[/div]
Sleeping Bag
Tent
        Flashlight
        Toiletries
        Water Bottle (1/2 Gallon)
[/div]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: 0px 5px 0px #71D9E2d9; font-size: var(--fs-header); text-align: center;]Steel Grooming Kit[/div]
Gloves
Steel File Set
Maintenance Oil
Steel-haired Brush
[/div]
[div=box-shadow: 5px 2.5px 2.5px black, inset 0 -1em 1em rgb(0 0 0 / 30%); text-indent: 1em hanging;]
[div=box-shadow: 0px 5px 0px #71D9E2d9; font-size: var(--fs-header); text-align: center;]Clothes & Accessories[/div]
Office-Formal Wear
[/div]
        [/div]{/slide}
    [/accordion]
[div=/*!SECTION */][/div][/div][/tab][/Tabs]