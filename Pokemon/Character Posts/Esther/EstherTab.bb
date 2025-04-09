[comment][font=Leckerli One][font=Merienda][font=Bellota][font=Kosugi Maru].[/font][/font][/font][/font][/comment]
[div=height: var(--mainHeight); width: 100%;
display: flex; align-content: center;

/*ANCHOR - Background Images */
--essy-norm: url(https://imgur.com/v5nu6kp.png);
--essy-farm: url(https://i.imgur.com/1pcaKHb.png);
--essy-wint: url(https://imgur.com/sX4ZunF.png);
--mmfarm: url(https://static.zerochan.net/Pok%C3%A9mon.Gold...Silver.full.3220139.jpg);
--mlani: url(https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/37c07ee0-78db-4994-bc7a-0a2443b974ca/dflq7qw-128e66ab-d670-4234-a6fe-5e429f388b03.jpg/v1/fill/w_1024,h_576,q_75,strp/pokemon_fan_art_by_dangerousdwdw_dflq7qw-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NTc2IiwicGF0aCI6IlwvZlwvMzdjMDdlZTAtNzhkYi00OTk0LWJjN2EtMGEyNDQzYjk3NGNhXC9kZmxxN3F3LTEyOGU2NmFiLWQ2NzAtNDIzNC1hNmZlLTVlNDI5ZjM4OGIwMy5qcGciLCJ3aWR0aCI6Ijw9MTAyNCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.Rshex5t-SKAB3wwbwIbOil8VumOn2gaXm0Z0k2yMQVU);

--essy-background: no-repeat 12% 70%/25% var(--essy-wint);
--backdrop-bg: no-repeat 50% 100%/100% 100% var(--mlani);

/*ANCHOR - Dimensions */
--mainHeight: 750px;
--tabHeight: min(800px, 80vh);
--postBorderRadius: 20px;
--rotate: rotate(90deg);

/*ANCHOR - Cursor */
cursor: url(https://archives.bulbagarden.net/media/upload/9/93/Bag_Pok%C3%A9_Ball_Sprite.png), pointer;

/*ANCHOR - Font Sizes */
--fs-header: calc(var(--fs-body) * 1.5);
--fs-body: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.67);

/*ANCHOR - Font Family*/
--H1-font: Leckerli One;
--H2-font: Kosugi Maru;
--B-font: Bellota;

/*ANCHOR - Accent Colors */
--accent-c: #C00000; /*#B22;*/ 

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

[div=/*SECTION – Esther Tab */ 
box-sizing: border-box;
height: var(--mainHeight); width: 100%;
display: none; align-content: center;
background: var(--essy-background), var(--backdrop-bg);
position: absolute; top: 0; z-index: 0;
mask-image: linear-gradient(black 3%, transparent 97%);][/div]

[div= 
box-sizing: border-box; margin: auto; height: 70%; width: 70%;
position: relative;]
[div= /* Tab Container */
box-sizing: border-box; width: 100%; height: 60px; background-color: white;
position: absolute; right: 0;
display: flex;]
[Tabs]
[tab=01010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101]
[div= /* Tab Content Container */
box-sizing: border-box;
position: absolute; left: -35px;
height: var(--tabHeight); width: max(65vw, 325px);
background-color: green;]
[div= /* Post + PokeBar */
box-sizing: border-box; margin: auto; height: 80%; width: 80%; background-color: red;]Example[/div]
[/div][/tab]
[tab=02020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202]Example 2[/tab]
[/Tabs]
[/div]
[/div]

[/div]