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
--char-img: url(https://i.imgur.com/VlsW1a5.png);

/*ANCHOR - Environment Variables */
--bg-silhouette: var(--forest);
--forest: url(https://media.istockphoto.com/id/485312564/vector/national-forest-pines.jpg?s=612x612&w=0&k=20&c=GHj5NEoYsqyjWyokpfI3Haj4uAkckXhKUw4lIyicQTQ=);
--city: url(https://static.vecteezy.com/system/resources/thumbnails/008/045/334/small/silhouette-of-the-city-city-skyline-silhouette-modern-cityscape-for-t-shirt-abstract-city-landscape-illustration-free-vector.jpg);

--port: url(https://st2.depositphotos.com/3745043/5322/v/450/depositphotos_53220961-stock-illustration-lighthouse-at-morning.jpg);

--mart: url(https://i.imgur.com/hwMHGfk.png);

--beach-town: url(https://cdn.vectorstock.com/i/500p/55/72/view-miami-from-sea-vector-24795572.jpg);

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
color: #1f71ff;

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
box-sizing: border-box; font-size: var(--fs-header); position: absolute; top: 0; left: 2.5%; font-family: Stint Ultra Condensed; backdrop-filter: blur(1px);] Somewhere [div=box-sizing: border-box; font-variant-position: super;]Off Route 202, Sinnoh[/div][/div]
[div=/*ANCHOR - Date & Time */ 
box-sizing: border-box; font-size: var(--fs-mini); position: absolute; bottom: 0; left: 4%; font-family: Stint Ultra Expanded;]August, 2[div=box-sizing: border-box; font-variant-position: super; display: inline;]nd[/div] | 11:35 a.m.[/div]
[div=/*ANCHOR - Mentions */ 
box-sizing: border-box; font-size: var(--fs-mini); position: absolute; bottom: -30px; left: 4%; font-family: Stint Ultra Condensed;] @Absollover77 [/div]
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

/*ANCHOR - Cordelia */
--CorImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/mawile.gif);
--CorPrimType: #D1D1E0;
--CorSecType: #9B6470;
--CorGender: var(--female);
--CorItem: url(https://i.imgur.com/Y3rrktA.png);

/*ANCHOR - Fawfaw */
--FawImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/aron.gif);
--FawPrimType: #D1D1E0;
--FawSecType: #786824;
--FawGender: var(--male);
--FawItem: url();

/*ANCHOR - Azalaïs */
--AzaImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/piplup.gif);
--AzaPrimType: #9DB7F5;
--AzaSecType: #445E9C;
--AzaGender: var(--female);
--AzaItem: url();

/*ANCHOR - Rio */
--RioImg: url(https://rebekahlang.files.wordpress.com/2015/08/pokemon-egg-gif.gif);
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
--P6Item: none;


box-sizing: border-box; display: flex; flex-direction: column; width: calc(10px+var(--p-height)); position: relative; top: 115px; font-family: Berkshire Swash; font-size: var(--fs-mini); color: black; height: var(--sidebar-height); justify-content: space-evenly;]
[div=/*SECTION - Pokemon 1 */ 
box-sizing: border-box; background: no-repeat center/95% var(--P1Img) var(--P1PrimType); border: 2px solid var(--P1SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P1PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 2 */ 
box-sizing: border-box; background: no-repeat center/50% var(--P2Img) var(--P2PrimType); border: 2px solid var(--P2SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P2PrimType);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: 0;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: 0; /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 3 */ 
box-sizing: border-box; background: no-repeat center/50% var(--P3Img) var(--P3PrimType); border: 2px solid var(--P3SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P3PrimType);]
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
--eleonor-c: #71D9E2;

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
                [div=box-sizing: border-box; visibility: visible; columns: 2; border-left: 2px ridge var(--tab-bd); padding: 5px; position: relative; top: -65px;]N/A
                [/div]{/slide}
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: auto;
                padding: 0px;
                z-index: 2;][div=/*ANCHOR - Gear */ box-sizing: border-box; background: no-repeat center/85% var(--tab-bg); border: 2px solid var(--tab-bd); border-radius: 25px; height: var(--tab-height); aspect-ratio: 2; line-height: var(--tab-height); position: relative; margin: auto; font-size: var(--fs-icon); color: var(--icon-c); top: -45px;][fa]fa-regular fa-compass[/fa][/div][/bg]}
                [div=box-sizing: border-box; visibility: visible; border-left: 2px ridge var(--tab-bd); padding: 5px; position: relative; top: -65px;]
                Sleeping bag
                Tent
                Steel Grooming Kit[div=padding-left: 1em;]Gloves
                Steel File Set
                Maintenance Oil
                Steel-haired Brush[/div]
                Flashlight
                Toiletries
                [/div]{/slide}
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: auto;
                padding: 0px;
                z-index: 2;][div=/*ANCHOR - Clothes */ box-sizing: border-box; background: no-repeat center/85% var(--tab-bg); border: 2px solid var(--tab-bd); border-radius: 25px; height: var(--tab-height); aspect-ratio: 2; line-height: var(--tab-height); position: relative; margin: auto; font-size: var(--fs-icon); color: var(--icon-c); top: -45px;][fa]fa-solid fa-shirt[/fa][/div][/bg]}
                [div=box-sizing: border-box; visibility: visible; border-left: 2px ridge var(--tab-bd); padding: 5px; position: relative; top: -65px;]Office-Formal[/div]{/slide}
            [/accordion]
        [/div]
        {/slide}
    [/accordion]
[/div]
[spoiler=Other]
$2,500
    [hr]Pokémon[/hr]
    [border=transparent;]
    Cordelia Katia Adelais Anne-Marie Twdyr (Mawile) @Intimidate
    Glewlwyd Gafaelfawr Galahad Gredifael Twdyr (Aron) @Heavy Metal
    Azalaïs Anaëlle Aurélie Ascelina Twdyr (Piplup) @Competitive
    Egg
    [/border]
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