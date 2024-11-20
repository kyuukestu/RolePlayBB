[comment][font=Stint Ultra Expanded][font=Stint Ultra Condensed][font=Berkshire Swash][font=Protest Riot][Font=Bree Serif][Font=Laila].[/font][/font][/font][/font][/font][/font][/comment]

[div=/*SECTION - Post Container */ 
box-sizing: border-box; margin: 0 2.5%; position: relative;

/*ANCHOR -  Font Sizes */
--fs-header: calc(var(--fs-body)*1.3);
--fs-body: clamp(10px, calc(0.75rem + 0.25vw), 1em);
--fs-mini: calc(var(--fs-body)*0.6);

--sidebar-height: 580px;
height: calc(var(--sidebar-height) + 115px);
display: flex; flex-flow: row;]

[div=/*SECTION - Header Background */

/*ANCHOR -  Character Image */
--char-img: url(https://i.imgur.com/mDaFSk0.png);

/*ANCHOR - Environment Variables */
--bg-silhouette: var(--city);

--city: url(https://static.vecteezy.com/system/resources/thumbnails/008/045/334/small/silhouette-of-the-city-city-skyline-silhouette-modern-cityscape-for-t-shirt-abstract-city-landscape-illustration-free-vector.jpg);

--port: url(https://st2.depositphotos.com/3745043/5322/v/450/depositphotos_53220961-stock-illustration-lighthouse-at-morning.jpg);

--mart: url(https://i.imgur.com/hwMHGfk.png);

box-sizing: border-box;
clip-path: polygon(0% 0%, 75% 0%, 87% 50%, 75% 100%, 0% 100%);
filter: drop-shadow(-10px 5px 5px #000000);
background-image: var(--char-img), var(--bg-silhouette);
background-repeat: no-repeat, no-repeat;
background-size: 20% 100%, 100% 100%;
background-position: 37.5%, center;
max-width: 100%; min-width: 350px; width: 40vw; height: 100px;
position: absolute; top: 0px;
display: block; 
/*!SECTION */][/div]

[div=/*SECTION - Header */
border: 1px solid transparent;
position: absolute; top: 0px;
box-sizing: border-box;
max-width: 100%; min-width: 350px; width: 40vw; height: 100px;
line-height: 1.5; letter-spacing: 1px;
margin: 0px auto; padding: 0px;
font-family: Madimi One;

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
box-sizing: border-box; font-size: var(--fs-header); position: absolute; top: 0; left: 2.5%; font-family: Stint Ultra Condensed; color: #202020; backdrop-filter: blur(1px);] Sandgem Outskirts [div=box-sizing: border-box; font-variant-position: super;]Sandgem Town, Sinnoh[/div][/div]
[div=/*ANCHOR - Date */ 
box-sizing: border-box; font-size: var(--fs-mini); position: absolute; bottom: 0; left: 4%; font-family: Stint Ultra Expanded;]August, 2[div=box-sizing: border-box; font-variant-position: super; display: inline;]nd[/div] | 10:05 a.m.[/div]
[div=/*ANCHOR - Mentions */ 
box-sizing: border-box; font-size: var(--fs-mini); position: absolute; bottom: -30px; left: 4%; font-family: Stint Ultra Condensed;] N/A [/div]
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
--PyrItem: url(https://i.imgur.com/PQrcW2d.png);

/*ANCHOR - Halay-Alae */
--HalImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--HalPrimType: #A29288;
--HalSecType: #9C531F;
--HalGender: var(--female);
--HalItem: url();

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

/*ANCHOR - L'Basseau */
--SusuImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--SusuPrimType: #C6D16E;
--SusuSecType: #506899;
--SusuGender: var(--female);
--SusuItem: url();

/*ANCHOR - Kasriel */
--KasImg: url(https://www.smogon.com/forums/attachments/263_2-gif.284206/);
--KasPrimType: #A29288;
--KasSecType: #6D6D4E;
--KasGender: var(--male);
--KasItem: url();

/*ANCHOR – Istha */
--IstImg: url(https://play.pokemonshowdown.com/sprites/gen5ani-shiny/feebas.gif);
--IstPrimType: #9DB7F5;
--IstSecType: #4A66AB;
--IstGender: var(--female);
--IstItem: url();

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
--P3Img: var(--PariImg);
--P3PrimType: var(--PariPrimType);
--P3SecType: var(--PariSecType);
--P3Gender: var(--PariGender);
--P3Item: var(--PariItem);

/*ANCHOR - P4 */
--P4Img: var(--CieraImg);
--P4PrimType: var(--CieraPrimType);
--P4SecType: var(--CieraSecType);
--P4Gender: var(--CieraGender);
--P4Item: var(--CieraItem);

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


box-sizing: border-box; display: flex; flex-direction: column; width: calc(10px+var(--p-height)); position: relative; top: 115px; font-family: Berkshire Swash; font-size: var(--fs-mini); color: black; height: var(--sidebar-height); justify-content: space-evenly;]
[div=/*SECTION - Pokemon 1 */ 
box-sizing: border-box; background: no-repeat center/90% var(--P1Img) var(--P1PrimType); border: 2px solid var(--P1SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P1PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 2 */ 
box-sizing: border-box; background: no-repeat center/65% var(--P2Img) var(--P2PrimType); border: 2px solid var(--P2SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P2PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 3 */ 
box-sizing: border-box; background: no-repeat center/65% var(--P3Img) var(--P3PrimType); border: 2px solid var(--P3SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P3PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P3Gender) var(--bg-color); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 4 */ 
box-sizing: border-box; background: no-repeat center/65% var(--P4Img) var(--P4PrimType); border: 2px solid var(--P4SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P4PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P4Gender) var(--bg-color); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 5 */ 
box-sizing: border-box; background: no-repeat center/65% var(--P5Img) var(--P5PrimType); border: 2px solid var(--P5SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P5PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P5Gender) var(--bg-color); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 6 */ 
box-sizing: border-box; background: no-repeat center/55% var(--P6Img) var(--P6PrimType); border: 2px solid var(--P6SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P6PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P6Gender) var(--bg-color); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
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
[div=visibility: hidden;

--bag: url(https://i.imgur.com/GsOv1fN.png);
--bag-bg: #eee;
--bag-bd: #f45;
--bag-height: 75px;]
    [accordion=90% | bcenter]
        {slide=center | [bg=transparent;
        visibility: visible;
        position: relative;
        margin: auto;
        padding: 0px;
        z-index: 2;][div=/*ANCHOR - Esther's Bag*/ box-sizing: border-box; background: no-repeat center/80% var(--bag) var(--bag-bg); border: 2px solid var(--bag-bd); border-radius: 50px; height: var(--bag-height); aspect-ratio: 1; margin: auto;][/div][/bg]}
        [div=visibility: hidden; position: relative;
        
        --pokeballs:: url(https://archives.bulbagarden.net/media/upload/c/c6/Bag_Pok%C3%A9_Balls_SV_pocket_icon.png);
        --tab-bg: #444;
        --tab-bd: #eee;
        --tab-height: 50px;
        --fs-icon: calc(var(--tab-height)*0.6);
        --icon-c: #ddd;
        --key-item: url(https://i.imgur.com/a5AUhoc.png);]
            [accordion=95% | bcenter]
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: auto;
                padding: 0px;
                z-index: 2;][div=/*ANCHOR - Gear */ box-sizing: border-box; background: no-repeat center/35% var(--key-item) var(--tab-bg); border: 2px solid var(--tab-bd); border-radius: 25px; height: var(--tab-height); aspect-ratio: 2; line-height: var(--tab-height); position: relative; margin: auto; top: -45px;][/div][/bg]}
                [div=box-sizing: border-box; visibility: visible; columns: 2; border-left: 2px ridge var(--tab-bd); padding: 5px; position: relative; top: -65px;]PokéToy
                PokéFlute
                Unidentified Fossil
                [/div]{/slide}
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: auto;
                padding: 0px;
                z-index: 2;][div=/*ANCHOR - Gear */ box-sizing: border-box; background: no-repeat center/85% var(--tab-bg); border: 2px solid var(--tab-bd); border-radius: 25px; height: var(--tab-height); aspect-ratio: 2; line-height: var(--tab-height); position: relative; margin: auto; font-size: var(--fs-icon); color: var(--icon-c); top: -45px;][fa]fa-regular fa-compass[/fa][/div][/bg]}
                [div=box-sizing: border-box; visibility: visible; border-left: 2px ridge var(--tab-bd); padding: 5px; position: relative; top: -65px;]Quilt Set[div=text-indent: 1em;]Revelation Sleeping quality
                Revolt V2 Underquilt[/div]
                Trek Light Hammock Set[div=text-indent: 1em;]
                Double Hammock
                V9 Hammock Tarp
                Rope Kit[/div]
                Maintenance Kit[div=text-indent: 1em;]Gloves
                Steel File
                Maintenance Oil[/div]
                First-Aid Kit[div=text-indent: 1em;]Bandages
                Alcohol
                Anti-septic
                Pain Killers
                Adhesive Tape
                Scissors[/div]
                Climbing Gear[div=text-indent: 1em;]Crampons
                Ice Tool
                Harness
                Carabiners
                Belays
                Dry Rope
                [/div]
                Flashlight
                Toiletries
                Water Bottle (1/2 Gallon)
                Water Purifier & Filter
                [/div]{/slide}
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: auto;
                padding: 0px;
                z-index: 2;][div=/*ANCHOR - Clothes */ box-sizing: border-box; background: no-repeat center/85% var(--tab-bg); border: 2px solid var(--tab-bd); border-radius: 25px; height: var(--tab-height); aspect-ratio: 2; line-height: var(--tab-height); position: relative; margin: auto; font-size: var(--fs-icon); color: var(--icon-c); top: -45px;][fa]fa-solid fa-shirt[/fa][/div][/bg]}
                [div=box-sizing: border-box; visibility: visible; border-left: 2px ridge var(--tab-bd); padding: 5px; position: relative; top: -65px;]Gothic Lolita Set
                Lace Set 
                Chic Asymmetry Set 
                Winter Gear
                Kilt
                Ballet Flats
                Swimwear
                Swim Goggles
                Aviator Goggles
                Detachable Rollerblades[/div]{/slide}
            [/accordion]
        [/div]
        {/slide}
    [/accordion]
[/div]
[spoiler=Other]
$240
    [hr]Pokémon[/hr]
    [border=transparent;]
    [hr]Party[/hr]
    Pyrrha Achilleia Astierra (Jangmo-o) @Overcoat [Lv.25]
    Halay-Alae Huaka’i Pöncu (Houndour) @Unnerve [Lv.23]
    Maçeira En’Çapolalê (Bounsweet) @Oblivious [Lv.20]
    Pariparisithea (Munna) @Telepathy [Lv.10]
    L’ Basseau (Surskit) @Swift Swim [Lv.18]
    Īstha Hâq-Ra (Feebas) @Adaptability [Lv.5]
    [hr]Oblivia[/hr]
    Kasriel Ikaros Svelinka Sō (G. Zigzagoon) @Gluttony [Lv.24]
    La Bamba (West Sea Shellos) @Sticky Hold [Lv.20]
    [/border]
    [hr]Badges[/hr]
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
    [hr]Ribbons[/hr]
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
[hr][/hr]
[/spoiler]
[/div]
[div=/*!SECTION */ display: none;][/div][/div]