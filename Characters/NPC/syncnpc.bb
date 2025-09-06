[comment][font=Leckerli One][font=Merienda][font=Yrsa][font=Kosugi Maru].[/font][/font][/font][/font][/comment]
[div=height: var(--mainHeight); width: 100%;
display: flex; align-content: center;


/*ANCHOR - Dimensions */
--mainHeight: clamp(300px, 675px, 750px);
--postBorderRadius: 20px;
--rotate: rotate(90deg);

/*ANCHOR - Cursor */
cursor: url(https://archives.bulbagarden.net/media/upload/9/93/Bag_Pok%C3%A9_Ball_Sprite.png), pointer;

/*ANCHOR - Font Sizes */
--fs-header: calc(var(--fs-body) * 1.5);
--fs-body: clamp(10px, calc(1em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.67);

/*ANCHOR - Font Family*/
--H1-font: Leckerli One;
--H2-font: Kosugi Maru;
--B-font: Yrsa;
]
[div=/*SECTION – Character Visuals */ 
box-sizing: border-box;
height: var(--mainHeight); width: 100%;
display: block; align-content: center;
background:  var(--pokemon-one-bg), var(--char-one-bg), var(--pokemon-two-bg), var(--char-two-bg), var(--backdrop-bg);
position: absolute; top: 0; z-index: 0;

/*ANCHOR - Background Images */
--location-bg: url(https://archives.bulbagarden.net/media/upload/c/c5/Lilypad_Colosseum.png);
--char-one: url(https://archives.bulbagarden.net/media/upload/2/2a/XY_Lass.png); /* XY Lass */
--char-two: url(https://archives.bulbagarden.net/media/upload/2/23/ORAS_Delinquent.png); /* ORAS_Delinquent */
--pokemon-one: url(https://archives.bulbagarden.net/media/upload/9/9a/0878Cufant.png); 
--pokemon-two: url(https://archives.bulbagarden.net/media/upload/thumb/d/d0/0868Milcery.png/500px-0868Milcery.png);
--char-one-bg: no-repeat 0% 57%/30% var(--char-one);
--pokemon-one-bg: no-repeat 0% 79%/20% var(--pokemon-one);
--char-two-bg: no-repeat 100% 50%/25% var(--char-two);
--pokemon-two-bg: no-repeat 100% 85%/10% var(--pokemon-two);
--backdrop-bg: no-repeat 50% 100%/100% 100% var(--location-bg);]
[comment]/*!SECTION */[/comment][/div]

[div=/*SECTION - Post + Poke*/
box-sizing: border-box; display: flex; height: var(--mainHeight); width: 100%; justify-content: center; align-content: center;]
[div=/*SECTION - Text-Container Blur Border */ 
box-sizing: border-box; display: flex;
height: 80%; max-width: min(475px, 85vw); 
margin: 0; padding: 10px; position: relative; z-index: 2;
-webkit-backdrop-filter: blur(5px); backdrop-filter: blur(5px); flex: 1 1 80%;
border-radius: var(--postBorderRadius); border: 1px solid rgba(255, 255, 255, 0.5);]
[div=/*SECTION - Post Container */
height: 100%; width: 100%; color: #fff; backdrop-filter: brightness(0.25);
border-radius: calc(var(--postBorderRadius) - 3px); display: flex; justify-content: center; flex-flow: column nowrap;
margin: auto; position: relative;]
[div=/*ANCHOR - Date & Time */
box-sizing: border-box; font-family: var(--H2-font); font-size: var(--fs-header); margin: 15px auto;]August 12th, 10:27 A.M.[/div]
[div=/*SECTION - Post Text Formatting */
box-sizing: border-box;
overflow-y: scroll; scrollbar-width: none; 
height: 100%; width: 100%; 
position: relative;
padding: 20px;
line-height: 1.5; letter-spacing: 0.5px;
white-space: break-spaces;
font-family: var(--B-font); font-size: var(--fs-body);
text-align: justify; text-justify: auto;]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[comment]*!SECTION - Text Format End[/comment][/div]
[comment]*!SECTION - Post Container End[/comment][/div]
[comment]*!SECTION - Text-Container Blur Border End[/comment][/div]
[/div]