[comment][font=Macondo].[/font][/comment]
[div=position: relative; width: 100%; display: flex; justify-content: center; align-items: center;
visibility: hidden;

--h-fs: 48px; 
--b-fs: 20px;
--name-font: Macondo;
--JR-img: url(https://i.pinimg.com/564x/08/cc/c4/08ccc45e5264f35912c4b996e80ce480.jpg);

--JR-accent: #457F8D;



/* ANCHOR - Pokemon Team */

/*ANCHOR Gender Images */
--male: url(https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Mars_symbol_%28outline%29.svg/800px-Mars_symbol_%28outline%29.svg.png); 
--female: url(https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Venus_symbol_%28outline%29.svg/800px-Venus_symbol_%28outline%29.svg.png); 

--maleC: #89CFF0;
--femaleC: #F4C2C2;

--P1Img: url(https://www.smogon.com/forums/attachments/970s-png.653081/);
--P1PrimType: #AFA981;
--P1SecType: #9141CB;
--P1Gender: var(--female);
--P1Item: var(--PyrItem);
--P1Ball: url(https://archives.bulbagarden.net/media/upload/thumb/5/52/Bag_Dive_Ball_SV_Sprite.png/40px-Bag_Dive_Ball_SV_Sprite.png);
--P1Size: 100%;

--P2Img: url(https://www.smogon.com/forums/attachments/758-png.114004/);
--P2PrimType: #9141CB;
--P2SecType: #E62829;
--P2Gender: var(--female);
--P2Item: var(--PyrItem);
--P2Ball: url(https://archives.bulbagarden.net/media/upload/thumb/5/52/Bag_Dive_Ball_SV_Sprite.png/40px-Bag_Dive_Ball_SV_Sprite.png);
--P2Size: 100%;

--P3Img: url(https://www.smogon.com/forums/attachments/904-png.420748/);
--P3PrimType: #624D4E;
--P3SecType: #9141CB;
--P3Gender: var(--male);
--P3Item: var(--PyrItem);
--P3Ball: url(https://archives.bulbagarden.net/media/upload/thumb/5/52/Bag_Dive_Ball_SV_Sprite.png/40px-Bag_Dive_Ball_SV_Sprite.png);
--P3Size: 100%;

--P4Img: url(https://play.pokemonshowdown.com/sprites/gen5/venusaur.png);
--P4PrimType: #3FA129;
--P4SecType: #9141CB;
--P4Gender: var(--female);
--P4Item: var(--PyrItem);
--P4Ball: url(https://archives.bulbagarden.net/media/upload/thumb/5/52/Bag_Dive_Ball_SV_Sprite.png/40px-Bag_Dive_Ball_SV_Sprite.png);
--P4Size: 100%;

--P5Img: url(https://www.smogon.com/forums/attachments/199_2-png.284255/);
--P5PrimType: #9141CB;
--P5SecType: #EF4179;
--P5Gender: var(--male);
--P5Item: var(--PyrItem);
--P5Ball: url(https://archives.bulbagarden.net/media/upload/thumb/5/52/Bag_Dive_Ball_SV_Sprite.png/40px-Bag_Dive_Ball_SV_Sprite.png);
--P5Size: 100%;

--P6Img: url(https://www.smogon.com/forums/attachments/903-png.420745/);
--P6PrimType: #FF8000;
--P6SecType: #9141CB;
--P6Gender: var(--female);
--P6Item: var(--PyrItem);
--P6Ball: url(https://archives.bulbagarden.net/media/upload/thumb/5/52/Bag_Dive_Ball_SV_Sprite.png/40px-Bag_Dive_Ball_SV_Sprite.png);
--P6Size: 100%;



]
[div=width: 65%; margin: auto; visibility: hidden;]
[accordion=100% | bcenter] {slide=center | [bg=transparent;

visibility: visible;

position: relative;

margin: 0;

padding: 0px;

z-index: 2;]
[div= /* ANCHOR - CARD + BG Image */
border-radius: 20px; background: no-repeat -12.5% 0%/50% var(--JR-img) #D0D4DD; 
width: 100%; height: 100%; max-height: 480px;
position: relative;
display: flex; flex-flow: column nowrap; justify-content: center; align-items: center; box-shadow: 0 6px 12px #9FD4DA;]

[div=/*ANCHOR - Name Tag */
position: absolute; top: 0; 
font-size: var(--h-fs); font-family: var(--name-font); color: var(--JR-accent);]J. Rhys[/div]

[div=/*SECTION - Pokemon */
visibility: visible; box-sizing: border-box; 
width: 42.5%; min-height: 100%; line-height: 0; margin: 0 0 0 auto;
border-radius: 0px 20px 20px 0px;
-webkit-backdrop-filter: brightness(0.5); backdrop-filter: brightness(0.5); background-color: transparent; display: flex; justify-content: space-evenly; flex-flow: row wrap; align-items: center; z-index: 1;  font-family: var(--H2-font); color: #fff; font-weight: bold;
position: relative;
--pflex: 1 1 49%;
--pCellPad: 0px;
--pokéShadow: drop-shadow(5px 0px 2px #353232);
--pHeight: 150px;
--cellWidth: min(180px, 43%);
--cellMax: 85%;
--cellWMax: 49%;
--pMaxWidth: 20%;
--p-micro: 20%;
--cellBorder: 1px solid transparent;
--cellRadius: 0;]
[div=/*SECTION - Pokémon Position 1 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--pCellPad); flex: var(--pflex)%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P1PrimType) 50%, var(--P1SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P1Size) var(--P1Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto; z-index: 2; position: relative;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P1Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P1Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 2 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--pCellPad); flex: var(--pflex)%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P2PrimType) 50%, var(--P2SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P2Size) var(--P2Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto; z-index: 2; position: relative;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P2Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P2Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 3 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--pCellPad); flex: var(--pflex)%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P3PrimType) 50%, var(--P3SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P3Size) var(--P3Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto; z-index: 2; position: relative;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P3Gender); background-color: var(--maleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P3Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P3Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 5 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--pCellPad); flex: var(--pflex)%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P4PrimType) 50%, var(--P4SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P4Size) var(--P4Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto; z-index: 2; position: relative;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P4Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P4Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P4Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 5 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--pCellPad); flex: var(--pflex)%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P5PrimType) 50%, var(--P5SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P5Size) var(--P5Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto; z-index: 2; position: relative;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P5Gender); background-color: var(--maleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P5Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P5Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 6 */
aspect-ratio: 1; width: var(--cellWidth); max-width: var(--cellWMax); max-height: var(--cellMax); line-height: 0; border: var(--cellBorder); border-radius: var(--cellRadius); 
padding: var(--pCellPad); flex: var(--pflex)%; margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--P6PrimType) 50%, var(--P6SecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: 50%; transform: translate(-50%, -50%) rotate(35deg); left: 50%;][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--P6Size) var(--P6Img); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto; z-index: 2; position: relative;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--P6Gender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P6Item) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Pokeball */
    background: no-repeat center/cover var(--P6Ball) var(--bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div][/div]
[/div][/bg]} 
[div=visibility: visible; width: 100%; background-color: var(--JR-accent); border-radius: 20px; padding: 10px;]
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
Slide Goes here 
{/slide}[/div]
[/accordion][/div]
[/div]