[comment][font=Leckerli One][font=Merienda][font=Bellota][font=Kosugi Maru][font=Fredericka the Great].[/font][/font][/font][/font][/font][/comment]
[div=height: var(--mainHeight); width: 100%;
display: flex; align-content: center; position: relative;

/*ANCHOR - Background Images */
--essy-norm: url(https://imgur.com/v5nu6kp.png);
--essy-farm: url(https://i.imgur.com/1pcaKHb.png);
--essy-wint: url(https://imgur.com/sX4ZunF.png);
--mmfarm: url(https://static.zerochan.net/Pok%C3%A9mon.Gold...Silver.full.3220139.jpg);
--mlani: url(https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/37c07ee0-78db-4994-bc7a-0a2443b974ca/dflq7qw-128e66ab-d670-4234-a6fe-5e429f388b03.jpg/v1/fill/w_1024,h_576,q_75,strp/pokemon_fan_art_by_dangerousdwdw_dflq7qw-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NTc2IiwicGF0aCI6IlwvZlwvMzdjMDdlZTAtNzhkYi00OTk0LWJjN2EtMGEyNDQzYjk3NGNhXC9kZmxxN3F3LTEyOGU2NmFiLWQ2NzAtNDIzNC1hNmZlLTVlNDI5ZjM4OGIwMy5qcGciLCJ3aWR0aCI6Ijw9MTAyNCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.Rshex5t-SKAB3wwbwIbOil8VumOn2gaXm0Z0k2yMQVU);
--ttar: url(https://static1.cbrimages.com/wordpress/wp-content/uploads/2021/02/Tyranitar-5-Pokemon-Bakugo-Would-Want-On-His-Team-5-He-Wouldnt.jpg);

--essy-background: no-repeat 50% 20%/35% var(--essy-wint);
--ttar-bg: no-repeat 50% 50%/75% var(--ttar);
--backdrop-bg: no-repeat 50% 100%/100% 100% var(--mlani);

/*ANCHOR - Dimensions */
--mainHeight: 750px;
--tabHeight: max(550px, 70vh);
--postBorderRadius: 20px;
--rotate: rotate(90deg);

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
--PPower-font: Fredericka the Great;

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

/*SECTION - Pokémon */
/*ANCHOR Gender Images */
--male: #89CFF0; 
--female: #F4C2C2;

/*ANCHOR - PokéBar */
--p-height: 50px;
--p-micro: calc(var(--p-height)/2.5);
--bg-color: transparent;
--p-size: 150%;
--held-right: -7.5px;
--gen-left: -7.5px;
--pokéShadow: drop-shadow(5px 0px 2px #353232);

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
/*ANCHOR - La Bamba */
--BamImg: url(https://play.pokemonshowdown.com/sprites/gen5/shellos-west.png);
--BamPrimType: #9DB7F5;
--BamSecType: #4A66AB;
--BamGender: var(--female);
--BamItem: url();
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
/*!SECTION - Pokémon End */]

[div=/*SECTION – BG Image */ 
box-sizing: border-box; pointer-events: none;
height: 100%; width: 100%;
display: flex; align-content: center;
background: var(--backdrop-bg);
position: absolute; top: 0; z-index: 1;
mask-image: linear-gradient(black 3%, transparent 97%);][/div]

[div=/*SECTION - Tab Covers */
position: absolute; z-index: 1;
width: 100px; height: 60px; border: var(--cover-border);
left: 0; top: 0;
display: flex; flex-flow: column nowrap; justify-content: space-between; align-items: center;
line-height: 0px; color: var(--highlight-ter); background-color: var(--tab-bgc); pointer-events: none;]
[fa]fa-solid fa-feather-pointed[/fa]
[fa]fa-solid fa-ellipsis-vertical[/fa]
[comment]*!SECTION - Tab Covers */[/comment]
[/div]

[div= /* Tab Container */
box-sizing: border-box; width: 100px; height: 60px; background-color: white;
position: absolute; top: 0; left: 0; display: flex; margin: auto;]
[Tabs]
[tab=01]
[div= /* Tab Content - Post + Poke */
box-sizing: border-box; z-index: 1;
position: absolute; left: 30px;
height: max(500px, 60vh); width: max(80vw, 325px);
display: flex; flex-flow: row-reverse wrap;]

[div=/*SECTION - Pokémon Bar */
visibility: visible; box-sizing: border-box;
-webkit-backdrop-filter: blur(5px); backdrop-filter: blur(5px); background-color: transparent;
border-radius: var(--postBorderRadius); border: 1px solid rgba(255, 255, 255, 0.5);
height: 100%; max-width: max(100px, 10vw);
display: flex;  overflow: hidden; scrollbar-width: none; justify-content: space-evenly; flex: 1 1 22.5%; flex-flow: column wrap; row-gap: 10px; align-items: center; z-index: 1; margin: auto auto auto 0;]
[div=/*SECTION - Pokémon Position 1 */
    box-sizing: border-box; background: var(--P1PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P1SecType);]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P1Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); ][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 2 */
    box-sizing: border-box; background: var(--P2PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P2SecType);]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P2Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px;][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); ][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); ][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 3 */
    box-sizing: border-box; background: var(--P3PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P3SecType);]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P3Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; ][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P3Gender); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); ][/div]
    [div=/*ANCHOR - Held Item */ 
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border: 2px Ridge var(--P3SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); ][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 4 */
    box-sizing: border-box; background: var(--P4PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P4SecType); ]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P4Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; ][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P4Gender); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); ][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border: 2px Ridge var(--P4SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); ][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 5 */
    box-sizing: border-box; background: var(--P5PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P5SecType); ]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P5Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; ][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P5Gender); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); ][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border: 2px Ridge var(--P5SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); ][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[div=/*SECTION - Pokémon Position 6 */
    box-sizing: border-box; background: var(--P6PrimType); border-radius: 50%; height: calc(var(--p-height)/3); aspect-ratio: 3; position: relative; border: 2px solid var(--P6SecType); ]
    [div=/*ANCHOR  – Pokémon Image */
    box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P6Img); border: 2px solid transparent; border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; filter: var(--pokéShadow); bottom: 55px; ][/div]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P6Gender); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left); ][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border: 2px Ridge var(--P6SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); ][/div]
    [comment]/*!SECTION */[/comment]
[/div]
[comment]*!SECTION -  Pokebar End[/comment][/div]
[div=/*SECTION - Text-Container Blur Border */ 
box-sizing: border-box; display: flex; flex-flow: column nowrap;
height: 100%; line-height: 0;
flex: 0 0 75%; margin: auto 0 auto auto; padding: 10px; position: relative; z-index: 2;
--webkit-backdrop-filter: blur(5px); backdrop-filter: blur(5px);
border-radius: var(--postBorderRadius); border: 1px solid rgba(255, 255, 255, 0.5);]
[div= /* Post Text Format */
box-sizing: border-box; position: relative;
overflow-y: scroll; scrollbar-width: none; margin: auto auto 0 auto;
height: calc(100% - 50px); width: 100%; 
border-radius: calc(var(--postBorderRadius) - 3px) calc(var(--postBorderRadius) - 3px) 0 0;
padding: 20px; line-height: 1.5; letter-spacing: 0.5px; white-space: break-spaces; 
background-color: #222020; color: var(--main-text-c);
font-family: var(--B-font); font-size: var(--fs-B);
text-align: justify; text-justify: auto;]
[div=box-sizing: border-box; margin: 0 auto;
height: 50px; width: fit-content; padding: 0 1em;
text-align: center; font-size: var(--fs-H1);
display: flex; align-items: flex-start; margin: 0 auto;][div=font-family: var(--H1-font); color: var(--highlight-prim);]Esther[/div] + [div=font-family: var(--PPower-font); color: #849372;]Tyranitar[/div][/div]
[div=background: var(--ttar-bg); aspect-ratio: 2; width: 100%;][/div]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. 
[/div]
[div=/*ANCHOR - Date & Time */
box-sizing: border-box; font-family: var(--H2-font); font-size: var(--fs-H1);  
width: 100%; background-color: #222020; text-align: center; height: 50px; line-height: 1.5;
border-radius: 0 0 calc(var(--postBorderRadius) - 3px) calc(var(--postBorderRadius) - 3px);
display: flex; align-items: center; justify-content: center;
margin: 0 auto auto auto;]August 12th, 10:27 A.M.[/div]

[comment]*!SECTION - Text-Container Blur Border [/comment][/div]

[/div][/tab]
[tab=02]
[div= /* Tab Content - Esther, Interaction, Locations */
box-sizing: border-box;
position: absolute; left: 30px; z-index: 1;
height: max(500px, 60vh); width: max(80vw, 325px);
display: flex; flex-flow: row nowrap;]
[div=
box-sizing: border-box;
display: flex; flex-flow: column nowrap;
justify-content: center; align-items: center;
width: 65%; border-radius: 100% 0%;
background: no-repeat center/100% radial-gradient(#222020 30%, #22202099 100%);]

[div=/*SECTION – Esther Image */ 
box-sizing: border-box;
height: 100%; width: 100%;
display: flex; align-content: center;
background: var(--essy-background);
mask-image: linear-gradient(black 25%, transparent 75%);][/div][/div]
[div=
box-sizing: border-box;
display: flex; flex-flow: column nowrap;
background-color: #222020; height: fit-content; margin: auto;
padding: 20px; border-radius: 25px;
border: 2px inset var(--highlight-sec);]
[div=box-sizing: border-box; 
height: 50px; width: fit-content; padding: 0 1em;
text-align: center; font-size: var(--fs-H1); font-family: var(--H1-font); color: var(--highlight-prim);
display: flex; align-items: flex-start; margin: 0 auto;]Esther Rosana Sophys[/div]
[div=box-sizing: border-box; font-size: var(--fs-B); font-family: var(--H2-font); margin: 0 auto; color: var(--highlight-sec);]Location[/div]
[div=box-sizing: border-box;]
Mt. Lanakila – Upper Reaches, Alola Region 
[/div]
[div=box-sizing: border-box; font-size: var(--fs-B); font-family: var(--H2-font); margin: 0 auto; color: var(--highlight-sec);]Interactions/Tags[/div]
[div=box-sizing: border-box;]
[USER=96660]@G[/USER] | [USER=76680]@Altair[/USER] |  [USER=108958]@Saiun[/USER]
[/div]
[/div]
[/div]
[/tab]
[/Tabs]
[/div]

[/div]