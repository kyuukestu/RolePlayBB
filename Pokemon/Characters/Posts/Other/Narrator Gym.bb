[comment][font=Laila][font=Nunito].[/font][/font][/comment]
[Tabs][Tab=..][div=/*SECTION - Design Container */ 
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
--shadow: 5px 2px 5px #eee, -5px 2px 5px #000;
color: #fff;

/*ANCHOR -  Character Image */
--char-img: url(https://cdn.discordapp.com/attachments/191374162978144257/1273187784131346513/latest.png?ex=66bdb406&is=66bc6286&hm=7948b86ec9581c9a4c18c5ef6861f0dfb525195d14f5fd1e15ce2ba95c2b5b4c&);
--flowers: url(https://as2.ftcdn.net/v2/jpg/01/91/08/25/1000_F_191082591_68juHKuvna2ULzjJGMHKQ1SPIKXZfzIb.jpg);]

[div=/*SECTION -  Post Container */
box-sizing: border-box; margin: auto; height: 95%; width: 88%;
border-radius: 15px; border: solid 2px #fff;
position: relative;]

[div=/*SECTION -  Char Img */
box-sizing: border-box; 
border-radius: 100px; box-shadow: var(--shadow);
background: var(--char-img) no-repeat 25% -5%/135%;
height: clamp(55px, calc(4.5em + 5%), 125px); aspect-ratio: 1;
position: absolute; left: -50px; top: 75px; z-index: 2;
/*!SECTION */][/div]

[div=/*SECTION - Header */
--alola: url(https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/80ff523f-ff84-457d-a547-464588d3a3d3/depi4ho-d2b3d9fe-8073-41ac-95e6-7d365096ea26.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzgwZmY1MjNmLWZmODQtNDU3ZC1hNTQ3LTQ2NDU4OGQzYTNkM1wvZGVwaTRoby1kMmIzZDlmZS04MDczLTQxYWMtOTVlNi03ZDM2NTA5NmVhMjYuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Fm44-AXQVSJ7q4mQrTeWBfk3iHg-B8BHutbwA61R24Y);
border: 1px solid transparent;
position: absolute; top: 0px;
box-sizing: border-box;
max-width: 100%; min-width: 250px; height: 125px; width: 100%;
line-height: 1.5; letter-spacing: 1px;
margin: 0px auto; padding: 0px;
display: flex; flex-direction: column;
box-shadow: 0px 2px 2.5px #eee;
color: #111; font-weight: 900;
font-family: Laila;
background: var(--alola) no-repeat center/100%;]
[div=/*ANCHOR - Location */
box-sizing: border-box; font-size: var(--fs-header); margin: auto; padding-left: 50px;] Sunyshore Gym  [div=box-sizing: border-box; font-size: var(--fs-mini);] Sunyshore City, Sinnoh[/div][/div]
[div=/*ANCHOR - Date & Mention/Interactions */ 
box-sizing: border-box; font-size: var(--fs-mini); margin: auto; padding-left: 55px;]Saturday, 6[div=box-sizing: border-box; font-variant-position: super; display: inline;]th[/div] August | @Cresion Breezes [/div] 
[div=/*!SECTION */][/div][/div]
[div=/*SECTION - Pokémon Section */
--p-height: 45px;
--p-micro: calc(var(--p-height)/2.5);
--bg-color: transparent;
--p-size: 150%;
--held-right: -7.5px;
--gen-left: -7.5px;

box-sizing: border-box; display: flex; width: calc(10px + var(--p-height)); position: absolute; bottom: 20%; left: -30px; font-size: var(--fs-mini); justify-content: space-evenly; border-radius: 15px; flex-flow: column nowrap; gap: 5px; align-items: center;
box-shadow: var(--shadow);


/*ANCHOR Gender Images */
--male: #89CFF0; url(https://i.imgur.com/4FI7ot0.png);
--female: #F4C2C2; url(https://i.imgur.com/wpBhCjV.png);

/*ANCHOR - P1 */
--P1Img: url(https://play.pokemonshowdown.com/sprites/gen5/jolteon.png);
--P1PrimType: #FCD659;
--P1SecType: #A37D00;
--P1Gender: var(--male);
--P1Item: url(https://play.pokemonshowdown.com/sprites/itemicons/life-orb.png);

/*ANCHOR - P2 */
--P2Img: url(https://play.pokemonshowdown.com/sprites/gen5/raichu-f.png);
--P2PrimType: #FCD659;
--P2SecType: #A37D00;
--P2Gender: var(--female);
--P2Item: url(https://play.pokemonshowdown.com/sprites/itemicons/focus-sash.png);

/*ANCHOR - P3 */
--P3Img: url(https://play.pokemonshowdown.com/sprites/gen5/electivire.png);
--P3PrimType: #FCD659;
--P3SecType: #A37D00;
--P3Gender: var(--male);
--P3Item: url(https://play.pokemonshowdown.com/sprites/itemicons/cell-battery.png);

/*ANCHOR - P4 */
--P4Img: url(https://play.pokemonshowdown.com/sprites/gen5/lanturn.png);
--P4PrimType: #74ACF5;
--P4SecType: #A37D00;
--P4Gender: var(--female);
--P4Item: url(https://play.pokemonshowdown.com/sprites/itemicons/mystic-water.png);

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
--P6Item: var(--IstItem);]
[div=/*SECTION - Pokemon 1 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P1Img) var(--P1PrimType); border: 2px solid var(--P1SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P1PrimType); filter: grayscale(100);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P1Gender); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P1Item) var(--bg-color); border: 2px Ridge var(--P1SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 2 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P2Img) var(--P2PrimType); border: 2px solid var(--P2SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P2PrimType); filter: grayscale(100);]
    [div=/*ANCHOR - Gender */
    background: no-repeat center/85% var(--P2Gender); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; left: var(--gen-left);][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--P2Item) var(--bg-color); border: 2px Ridge var(--P2SecType); border-radius: 50px; height: var(--p-micro); aspect-ratio: 1; box-sizing: border-box; position: absolute; bottom: 0; right: var(--held-right); /*!SECTION */][/div]
[/div]
[div=/*SECTION - Pokemon 3 */ 
box-sizing: border-box; background: no-repeat center/var(--p-size) var(--P3Img) var(--P3PrimType); border: 2px solid var(--P3SecType); border-radius: 50px; height: var(--p-height); aspect-ratio: 1; position: relative; color: var(--P3PrimType); filter: grayscale(100);]
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
--esther-c: #f05656;
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
font-family: 'Nunito';]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[/div]
[div=/*!SECTION */][/div][/div]
[div=/*!SECTION */][/div][/div][/tab]
[tab=...]
[/tab][/Tabs]