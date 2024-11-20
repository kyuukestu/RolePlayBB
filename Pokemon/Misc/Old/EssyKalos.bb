[comment][font=Stint Ultra Expanded][font=Stint Ultra Condensed][font=Berkshire Swash][font=Protest Riot][Font=Gabriela][Font=Laila].[/font][/font][/font][/font][/font][/font][/comment]

[div=/*SECTION - Post Container */ 
box-sizing: border-box; margin: 0 2.5%; position: relative;

/*ANCHOR -  Font Sizes */
--fs-header: calc(var(--fs-body) * 1.3);
--fs-body: clamp(10px, 1.5vw , calc((1rem * 0.825)));
--fs-mini: calc(var(--fs-body) * 0.6);

--sidebar-height: 580px;
height: calc(var(--sidebar-height) + 115px);
display: flex; flex-flow: row;]

[div=/*SECTION - Header Background */

/*ANCHOR -  Character Image */
--char-img: url(https://i.imgur.com/mDaFSk0.png);

/*ANCHOR - Environment Variables */
--city: url(https://static.vecteezy.com/system/resources/thumbnails/008/045/334/small/silhouette-of-the-city-city-skyline-silhouette-modern-cityscape-for-t-shirt-abstract-city-landscape-illustration-free-vector.jpg);

box-sizing: border-box;
clip-path: polygon(0% 0%, 75% 0%, 87% 50%, 75% 100%, 0% 100%);
filter: drop-shadow(-10px 5px 5px #000000);
background-image: var(--char-img), var(--city);
background-repeat: no-repeat, no-repeat;
background-size: 20% 100%, 100% 100%;
background-position: 37.5%, center;
max-width: 100%; min-width: 400px; height: 100px;
position: absolute; top: 0px;
display: block; /*!SECTION */] 

[div=/*SECTION - Header */
border: 1px solid transparent;
position: absolute; top: 0px;
box-sizing: border-box;
max-width: 100%; min-width: 400px; height: 100px; width: 100%;;
line-height: 1.5; letter-spacing: 1px;
margin: 0px auto; padding: 0px;

/*ANCHOR -  Accent Colors */
--c-1: #16B0EE;
--c-2-day: #dedede42;
--c-2-night: #33333359;
--c-3: #02358366;
--c-4: #dedede;

 /*ANCHOR -  Weather Colors */

--morning-sky: linear-gradient(135deg, rgba(255,255,255,0.6) 2.5%, rgba(22,176,238,0.6) 60%);
--midday-sky: linear-gradient(135deg, rgba(2,53,131,0.6) 2.5%, rgba(22,176,238,0.6) 60%);
--evening-sky: linear-gradient(135deg, rgba(64,101,139,0.6) 25%,  rgba(209,71,16,0.6) 60%);
--stormy-sky: ;
--night-sky: linear-gradient(135deg, rgba(40, 62, 81, 0.9) 20%, rgba(10, 35, 66, 0.9) 45%);

--b: 2px solid var(--c-1); /* Border */
--r: rotate(45deg);
--r-r: rotate(-45deg);

--dia-l: calc(20px - var(--dia-s));
--dia-m: 20px 0px 20px 20px; /* Diamond margins so they don't get cut off due to rotation, change if you change size */
--dia-s: 70px; /* Diamond size */

--icon-f-s: 2em; /* Icon size, increase or decrease by .1 increments  */

display: flex;
flex-flow: row nowrap;
justify-content: flex-start;
align-items: center;]
[comment]
/*ANCHOR - Weather Icons */
Harsh Sun 
[fa]fa-solid fa-sun[/fa]

Regular Sun
[fa]fa-regular fa-sun[/fa]

Clear Night
[fa]fa-solid fa-moon[/fa]

Snow
[fa]fa-solid fa-snowflake[/fa]

Foggy
[fa]fa-solid fa-smog[/fa]

Windy
[fa]fa-solid fa-wind[/fa]

Cloudy
[fa]fa-solid fa-cloud-sun[/fa]
[fa]fa-solid fa-cloud-moon[/fa]

Thunder Storm Bolt
[fa]fa-solid fa-cloud-bolt[/fa]

Sparse Rain 
[fa]fa-solid fa-cloud-sun-rain[/fa]
[fa]fa-solid fa-cloud-moon-rain[/fa]

Heavy Rain
[fa]fa-solid fa-cloud-showers-heavy[/fa]
[/comment]
[div=/*ANCHOR - Location */ 
box-sizing: border-box; font-size: var(--fs-header); position: absolute; top: 0; left: 2.5%; font-family: Stint Ultra Condensed; color: #202020;]Ambrette Town[div=box-sizing: border-box; font-variant-position: super;]Cyllage City, Kalos[/div][/div]
[div=/*ANCHOR - Date */ 
box-sizing: border-box; font-size: var(--fs-mini); position: absolute; bottom: 0; left: 4%; font-family: Stint Ultra Expanded;]January, 1[div=box-sizing: border-box; font-variant-position: super; display: inline;]st[/div][/div]
[div=/*SECTION - Diamond 1 */
position: absolute; right: 20%;
margin: var(--dia-m);
box-sizing: border-box;
flex: 0 0 var(--dia-s);
height: var(--dia-s); aspect-ratio: 1;
border: var(--b);
background: var(--morning-sky);
padding: 0px; 
transform: var(--r);][div=/*!SECTION */ display: none;][/div][/div]
[div=/*SECTION - Diamond 2 */
position: absolute;
right: 18%;
margin: var(--dia-m);
margin-left: 0px;
box-sizing: border-box;
flex: 0 0 var(--dia-s);
height: var(--dia-s); aspect-ratio: 1;
background: var(--c-2-day);
padding: 0px;
transform: var(--r);
display: flex;
flex-flow: row nowrap;
justify-content: center;
align-items: center;][div=/*!SECTION */ display: none;][/div]

[div=/*SECTION - Weather Icon */
box-sizing: border-box;
padding: 0px;

/*ANCHOR - Sun/Moon Colors */
--sun-color: #FFFD37;
--evening-sun-color: #FFA500; 
--moon-color: #dcdcdc;

color: var(--evening-sun-color);
font-size: var(--icon-f-s);
font-weight: bold;
line-height: 1;
transform: var(--r-r);][fa]fa-regular fa-sun[/fa][div=/*!SECTION */ display: none;][/div][/div]
[/div][/div][div=/*!SECTION */ display: none;][/div]

[/div]


[div=/*SECTION - Pokemon */
--p-height: 65px;
--p-micro: calc(var(--p-height)/3.25);
--bg-color: #faebd7;


/*ANCHOR Gender Images */
--male: url(https://i.imgur.com/4FI7ot0.png);
--female: url(https://i.imgur.com/wpBhCjV.png);

/*ANCHOR - Pyrrha */
--PyrImg: url(https://www.smogon.com/forums/attachments/782-gif.369411/);
--PyrPrimType: #A27EFA;
--PyrSecType: #7D58D6;
--PyrGender: var(--female);
--PyrItem: url();
--PyrMoves: url();

/*ANCHOR - Halay-Alae */
--HalImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--HalPrimType: #A29288;
--HalSecType: #9C531F;
--HalGender: var(--female);
--HalItem: url();
--HalMoves: url();

/*ANCHOR - Pari */
--PariImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/munna.gif);
--PariPrimType: #FA92B2;
--PariSecType: #A13959;
--PariGender: var(--female);
--PariItem: url();
--PariMoves: url();

--CieraImg: url(https://www.smogon.com/forums/attachments/761-gif.274544/);
--CieraPrimType: #A7DB8D;
--CieraSecType: #57913A;
--CieraGender: var(--female);
--CieraItem: url();
--CieraMoves: url();

/*ANCHOR - L'Basseau */
--SusuImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--SusuPrimType: #C6D16E;
--SusuSecType: #506899;
--SusuGender: var(--female);
--SusuItem: url();
--SusuMoves: url();

/*ANCHOR - Kasriel */
--KasImg: url(https://www.smogon.com/forums/attachments/263_2-gif.284206/);
--KasPrimType: #A29288;
--KasSecType: #6D6D4E;
--KasGender: var(--male);
--KasItem: url();
--KasMoves: url();

box-sizing: border-box; display: flex; flex-direction: column; width: calc(10px + var(--p-height)); position: relative; top: 115px; font-family: Berkshire Swash; font-size: var(--fs-mini); color: black; height: var(--sidebar-height); justify-content: space-evenly;]
[div=/*SECTION - Pokemon 1 */ 
box-sizing: border-box; background: no-repeat center/90% var(--PyrImg) var(--PyrPrimType); border: 2px solid var(--PyrSecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--PyrPrimType);]
    [div=/*ANCHOR - Name */
    background-color: transparent; border-bottom: 3px Ridge var(--PyrSecType); border-radius: 7.5px; box-sizing: border-box; text-align: center; position: absolute; bottom: -15px; left: 50%; transform: translate(-50%, 0%); width: var(--p-height);]
        Pyrrha
    [/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--PyrGender) var(--bg-color); border: 2px Ridge var(--PyrSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Level */
    background: center var(--bg-color); border: 2px Ridge var(--PyrSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; position: absolute; top: -10px; left: 50%; transform: translate(-50%, 0%); display: flex; align-items: center; justify-content: center;]
        Lv25
    [/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--PyrItem) var(--bg-color); border: 2px Ridge var(--PyrSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 2 */ 
box-sizing: border-box; background: no-repeat center/65% var(--HalImg) var(--HalPrimType); border: 2px solid var(--HalSecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--HalPrimType);]
    [div=/*ANCHOR - Name */
    background-color: transparent; border-bottom: 3px Ridge var(--HalSecType); border-radius: 7.5px; box-sizing: border-box; text-align: center; position: absolute; bottom: -15px; left: 50%; transform: translate(-50%, 0%); width: var(--p-height);]
        Halay-Alae
    [/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--HalGender) var(--bg-color); border: 2px Ridge var(--HalSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Level */
    background: center var(--bg-color); border: 2px Ridge var(--HalSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; position: absolute; top: -10px; left: 50%; transform: translate(-50%, 0%); display: flex; align-items: center; justify-content: center;]
        Lv22
    [/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--HalItem) var(--bg-color); border: 2px Ridge var(--HalSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 3 */ 
box-sizing: border-box; background: no-repeat center/65% var(--PariImg) var(--PariPrimType); border: 2px solid var(--PariSecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--PariPrimType);]
    [div=/*ANCHOR - Name */
    background-color: transparent; border-bottom: 3px Ridge var(--PariSecType); border-radius: 7.5px; box-sizing: border-box; text-align: center; position: absolute; bottom: -15px; left: 50%; transform: translate(-50%, 0%); width: var(--p-height);]
        Pari
    [/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--PariGender) var(--bg-color); border: 2px Ridge var(--PariSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Level */
    background: center var(--bg-color); border: 2px Ridge var(--PariSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; position: absolute; top: -10px; left: 50%; transform: translate(-50%, 0%); display: flex; align-items: center; justify-content: center;]
        Lv10
    [/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--PariItem) var(--bg-color); border: 2px Ridge var(--PariSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 4 */ 
box-sizing: border-box; background: no-repeat center/65% var(--CieraImg) var(--CieraPrimType); border: 2px solid var(--CieraSecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--CieraPrimType);]
    [div=/*ANCHOR - Name */
    background-color: transparent; border-bottom: 3px Ridge var(--CieraSecType); border-radius: 7.5px; box-sizing: border-box; text-align: center; position: absolute; bottom: -15px; left: 50%; transform: translate(-50%, 0%); width: var(--p-height);]
        Maçiera
    [/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--CieraGender) var(--bg-color); border: 2px Ridge var(--CieraSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Level */
    background: center var(--bg-color); border: 2px Ridge var(--CieraSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; position: absolute; top: -10px; left: 50%; transform: translate(-50%, 0%); display: flex; align-items: center; justify-content: center;]
        Lv20
    [/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--CieraItem) var(--bg-color); border: 2px Ridge var(--CieraSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 5 */ 
box-sizing: border-box; background: no-repeat center/65% var(--SusuImg) var(--SusuPrimType); border: 2px solid var(--SusuSecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--SusuPrimType);]
    [div=/*ANCHOR - Name */
    background-color: transparent; border-bottom: 3px Ridge var(--SusuSecType); border-radius: 7.5px; box-sizing: border-box; text-align: center; position: absolute; bottom: -15px; left: 50%; transform: translate(-50%, 0%); width: var(--p-height);]
        L' Basseau
    [/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--SusuGender) var(--bg-color); border: 2px Ridge var(--SusuSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Level */
    background: center var(--bg-color); border: 2px Ridge var(--SusuSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; position: absolute; top: -10px; left: 50%; transform: translate(-50%, 0%); display: flex; align-items: center; justify-content: center;]
        Lv18
    [/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--SusuItem) var(--bg-color); border: 2px Ridge var(--SusuSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 6 */ 
box-sizing: border-box; background: no-repeat center/90% var(--KasImg) var(--KasPrimType); border: 2px solid var(--KasSecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--KasPrimType);]
    [div=/*ANCHOR - Name */
    background-color: transparent; border-bottom: 3px Ridge var(--KasSecType); border-radius: 7.5px; box-sizing: border-box; text-align: center; position: absolute; bottom: -15px; left: 50%; transform: translate(-50%, 0%); width: var(--p-height);]
        Kasriel
    [/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--KasGender) var(--bg-color); border: 2px Ridge var(--KasSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Level */
    background: center var(--bg-color); border: 2px Ridge var(--KasSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; position: absolute; top: -10px; left: 50%; transform: translate(-50%, 0%); display: flex; align-items: center; justify-content: center;]
        Lv22
    [/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--KasItem) var(--bg-color); border: 2px Ridge var(--KasSecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
            
[div=/*!SECTION */ display: none;][/div][/div]

[div=/*SECTION - Text Section */
--text-l: calc(10px - var(--dia-s));
--text-p: 10px 20px 10px 20px; /* Text padding */

/*ANCHOR Dialogue Colors */
--esther-c: #b22222;

border: transparent;
position: relative; top: 115px;
box-sizing: border-box;
padding: var(--text-p);
color: var(--c-4);
font-size: var(--fs-body); max-height: var(--sidebar-height);
line-height: 1.5;
display: block;
overflow: scroll;
scrollbar-width: none;
white-space: collapse;
font-family: Laila;]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[div=/*!SECTION */ display: none;][/div]
[spoiler=Bag] $8,920 | Pokéball x0 | PokéToy | PokéFlute | Unidentified Fossil
    [hr]Badges[/hr]
    [border=transparent; /*ANCHOR - Badges */
--badge-1: url();
--badge-2: url();
--badge-3: url();
--badge-4: url();
--badge-5: url();
--badge-6: url();
--badge-7: url();
--badge-8: url();

--badge-size: 50px;

max-width: 300px;
display: flex; flex-flow: row; justify-content: space-between;]
[border=solid; background: no-repeat center/85% var(--badge-1) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px; box-shadow: 0px 0px 8px #fff][/border]
[border=solid; background: no-repeat center/85% var(--badge-2) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px; box-shadow: 0px 0px 8px #fff][/border]
[border=solid; background: no-repeat center/85% var(--badge-3) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-4) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-5) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-6) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-7) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--badge-8) transparent; height: var(--badge-size); aspect-ratio: 1; border-radius: 45px;][/border]

[/border]
    [hr]Ribbons[/hr]
    [border=transparent; /*ANCHOR - Ribbons */
    --ribbon-1: url();
--ribbon-2: url();
--ribbon-3: url();
--ribbon-4: url();
--ribbon-5: url();

--ribbon-size: 50px;

max-width: 300px;
display: flex; flex-flow: row; justify-content: space-between;]
[border=solid; background: no-repeat center/85% var(--ribbon-1) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-2) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-3) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-4) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[border=solid; background: no-repeat center/85% var(--ribbon-5) transparent; height: var(--ribbon-size); aspect-ratio: 1; border-radius: 45px;][/border]
[/border]
[hr][/hr]
    [size=3] 
        Quilt Set
        Hammock Set
        First-Aid Kit
        Flashlight
        Toiletries
        Water Bottle (1/2 Gallon)
        Water Purifier & Filter
        Gothic Lolita Set (Clothing)
        Lace Set (Clothing)
        Chic Asymmetry Set (Clothing)
        Winter Gear (Clothing)
        Kilt
        Ballet Flats
        Climbing Gear
        Swimwear
        Detachable Rollerblades 
    [/size] 
[/spoiler][/div]
[div=/*!SECTION */ display: none;][/div][/div]