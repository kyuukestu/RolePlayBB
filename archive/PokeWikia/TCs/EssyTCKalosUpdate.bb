[comment][font=Madimi One][font=Dosis][font=Yeon Sung][font=Protest Riot][Font=Bree Serif][Font=Laila].[/font][/font][/font][/font][/font][/font][/comment]
[div=/*SECTION - Trainer Card Accordion Wrapper */
box-sizing: border-box;
visibility: hidden;
margin: auto;
padding: 0;
position: relative;
float: right;
display: flex;
max-width: 87vw;
min-width: 360px;


/*SECTION - Pokémon Variables */

/* Gender Icons provided are Male w/ var(--male) or Female w/ var(--female). You are free to change the icons as you wish, or declare your own variables with '--variable-name: url(icon-url);'. */

/*ANCHOR - Pyrrha */
--PyrImg: url(https://www.smogon.com/forums/attachments/782-gif.369411/);
--PyrPrimType: #A27EFA;
--PyrSecType: #7D58D6;
--PyrGender: var(--female);
--PyrItem: url();
--PyrMoves: url();

/*ANCHOR - Halay-Alae */
--HalImg: none; url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--HalPrimType: none; #A29288;
--HalSecType: none; #9C531F;
--HalGender: none; var(--female);
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

/*!SECTION */

/*SECTION Dimensions */
/*ANCHOR - Pokémon Width */
--d: max(6vw, 70px);
--b-d: max(2.5vw, 25px);
/*ANCHOR - TC width */
--TC-height: clamp(130px, 48.5vw, 260px);
--TC-ratio: 11/6.5;
--TC-width: calc(var(--TC-height) * var(--TC-ratio));
/*ANCHOR - Font Sizes */
--fs-header: calc(var(--fs-body)*1.3);
--fs-body: clamp(10px, 1.5vw , calc((1rem * 0.825)));
/*!SECTION */

/*ANCHOR Gender Images */
--male: url(https://i.imgur.com/4FI7ot0.png);
--female: url(https://i.imgur.com/wpBhCjV.png);

/*ANCHOR -  Other */
--char-c: #b22222;
--b-i: linear-gradient(var(--char-c) 18%, transparent calc(18% + 1px) 82%, var(--char-c) calc(82% + 1px)) 1% stretch;
--pokeball: url(https://i.imgur.com/84MrnWk.gif);]
        [accordion=100% | bcenter]
            {slide=center | [bg=transparent;
            visibility: visible;
            position: relative;
            margin: auto;
            padding: 0px;
            z-index: 2;]
                [div=/*SECTION - Trainer Card Slide Cover Wrapper */
box-sizing: border-box;
border: 1px solid transparent;
padding: 5px;
border-radius: 15px;
font-family: 'Protest Riot';
margin: auto;
display: flex;
flex-flow: row wrap;
height: var(--TC-height);
aspect-ratio: var(--TC-ratio);
visibility: visible;
background-color: #313338;
background-image: 
    var(--char-img), 
    var(--bg-img);
background-repeat: 
    no-repeat, 
    repeat;
background-position: 
    bottom left 3em, 
    center;
background-size: 
    35%, 
    30%;
overflow: clip;
z-index: 1;

/*ANCHOR -  Character Image */
--char-img: url(https://i.imgur.com/V0jzh5D.png);

/*ANCHOR -  Background Image */
--bg-img: url(https://mqpolska.pl/media/djcatalog2/images/item/5/neroprofondopr_f.jpg);

/*ANCHOR -  Ribbon Images */
--r-1: url();
--r-2: url();
--r-3: url();
--r-4: url();
--r-5: url();

/*ANCHOR -  Badge Images */
--b-1: url(https://archives.bulbagarden.net/media/upload/a/a5/Bug_Badge.png);
--b-2: url();
--b-3: url();
--b-4: url();
--b-5: url();
--b-6: url();
--b-7: url();
--b-8: url();
]
                    [div=/*SECTION - Name & ID Tag Wrapper */
                    box-sizing: border-box;
                    filter: drop-shadow(0.25em 0.25em 0px #00000088);
                    width: 42.5%;
                    height: 25%;
                    
                    position: relative;
                    right: 4.5%;
                    top: 65%;
                    
                    z-index: 2;]
[div=/*SECTION - Name & ID Tag  */
box-sizing: border-box;
     display: grid;
     gap: 0;
     justify-content: center;
     align-items: center;
     grid-template: 1fr 1fr / 1fr 1fr;
     grid-template-areas: "blank name" "id no";
     margin: auto;
     padding: 0.35em 0.95em 0.75em 0.95em;
     background-color: #d4d4d4a4;
     color: black;
     width: 100%;
     height: 115%;
     clip-path: polygon(5% 0%, 100% 0%, 95% 100%, 0% 100%);
     font-variant: small-caps;
     font-size: var(--fs-header);]

                            [div=/*ANCHOR - Name */
                            box-sizing: border-box; grid-area: name;]Esther[/div]
                            [div=box-sizing: border-box; grid-area: id;]ID No.[/div]
                            [div=/*ANCHOR - ID No. */
                            box-sizing: border-box; grid-area: no;]171027[/div]
                            [div=/*!SECTION */ display: none;][/div]
                        [/div]
                        [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*ANCHOR - Click Me! */
                    box-sizing: border-box; font-size: 0.95rem; font-variant: small-caps; display: flex; flex-flow: column nowrap; position: absolute; left: 45%; top: -7.5%; color: #b22222;]Click Me![fa]fa-solid fa-caret-down[/fa][/div]
                    
                [div=/*SECTION - Trainer Stats/Achievements */
                box-sizing: border-box;
                
                margin: auto;
                
                display: flex;
                flex-flow: column nowrap;
                justify-content: flex-start;
                gap: 3px;
                
                height: 110%;
                width: 42.5%;
                
                padding: 0.5em 0.35em;
                position: relative;
                right: -10%;
                bottom: 10px;

                background-color: #000000bb;
                color: #fffaf0;
                
                font-size: var(--fs-body);

                overflow: visible;]
                [div=/*SECTION - Badge Container */
                    --b-margin: 1.5%;
                    --b-shadow-normal: 0px 0px 8px #fff;
                    --b-shadow-encrust: 0px 0px 8px #ffd92e;
                    --b-bg-size: 90% 90%;
                    --b-b-radius: 50px;
                    --b-ratio: 1/1;
                    box-sizing: border-box; width: calc(1*var(--TC-width)); display: flex; flex-flow: row nowrap; overflow-x: scroll; position: absolute; top: 2%; right: 0%; justify-content: space-evenly; overflow: clip; z-index: 3;]
                        [div=background-image: var(--b-1); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat; box-shadow: var(--b-shadow-normal);]
                        [/div]
                        [div=background-image: var(--b-2); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat;]
                        [/div]
                        [div=background-image: var(--b-3); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat;]
                        [/div]
                        [div=background-image: var(--b-4); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat;]
                        [/div]
                        [div=background-image: var(--b-5); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat;]
                        [/div]
                        [div=background-image: var(--b-6); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat;]
                        [/div]
                        [div=background-image: var(--b-7); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat;]
                        [/div]
                        [div=background-image: var(--b-8); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--b-d); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: var(--b-margin); display: flex; background-repeat: no-repeat;]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
                [/div]
                
                    [div=/*SECTION - Ribbon Wrapper */
                    --b-margin: 1.5%;
                    --b-shadow-normal: 0px 0px 8px #fff;
                    --b-shadow-encrust: 0px 0px 8px #ffd92e;
                    --b-b-radius: 50px;
                    --b-ratio: 1/1;
                    --b-bg-size: 90% 90%;
                    --r-width: 3em;
box-sizing: border-box;
padding: 1%;
margin: auto;
background: linear-gradient(45deg, rgba(255, 255, 255, 0.85) 35%, transparent 70%) top;
background-repeat: no-repeat;
background-size: 100% 1px;
height: 70%;
width: 100%;
position: absolute;
bottom: 5%;
display: flex; flex-flow: column nowrap;]
                    [div=box-sizing: border-box; font-family: 'Protest Riot'; font-size: var(--fs-header); text-align: left;]Ribbons:[/div]
                        [div=/*SECTION - Ribbon Container */
                        box-sizing: border-box; height: 80%; display: grid; 
                        grid-template-columns: repeat(3, minmax(2vw, 1fr));
                        grid-template-rows: repeat(3, minmax(2vw, 1fr));  
                        grid-auto-flow: dense;
                        grid-template-areas: "r2 . r3"
                        ". r1 ."
                        "r4 . r5";
                        justify-content: space-between; 
                        width: 75%; 
                        align-self: center;]
                            [div=background-image: var(--r-1); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--r-width); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: 2%;  background-repeat: no-repeat; grid-area: r1;]
                            [/div]
                            [div=background-image: var(--r-2); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--r-width); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r2;]
                            [/div]
                            [div=background-image: var(--r-3); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--r-width); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r3;]
                            [/div]
                            [div=background-image: var(--r-4); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--r-width); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r4;]
                            [/div]
                            [div=background-image: var(--r-5); background-size: var(--b-bg-size); background-position: center; border: 2px solid #bdbdbd; border-radius: var(--b-b-radius); width: var(--r-width); aspect-ratio: var(--b-ratio); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r5;]
                            [/div]
                            [div=/*!SECTION */ display: none;][/div]
                        [/div]
                        [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
                [/div]
                [div=/*!SECTION */ display: none;][/div]
            [/div]
    [/bg]}
        [div=/*SECTION - Trainer Card Slide Content Accordion Wrapper */
        visibility: hidden;
        margin: -70px 0px 0px 0px;
        height: auto;
        width: 100%;
        padding: 0px;
        position: relative;
        display: flex;
        flex-flow: column nowrap;][accordion=100% | bcenter]
                [comment] -- Pokémon Party Slide -- [/comment]
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: -70;
                padding: 0px;]
                    [div=/*ANCHOR - Pokémon Party Slide Cover */
                    box-sizing: border-box; display: flex; flex-direction: row; border: 4px solid transparent; border-image: var(--b-i); border-radius: 15px; display: flex; justify-content: space-evenly; align-items: center; color: #fff; letter-spacing: 1px; min-width: var(--d); padding: 5px;
                    min-width: -moz-fit-content; min-width: fit-content; width: 85%; height: 100%;
                    margin: 0 auto; background-color: #202020;] 
                        [div=background-image: var(--pokeball); background-size: 100% 100%; background-repeat: no-repeat; height: 45px; aspect-ratio: 1/1;][/div]
                        [fa]fa-solid fa-music[/fa] 
                        [div=width: 65%; font-size: clamp(8px, 1.75vw, 12px); display: flex; justify-content: center; align-content: center; font-family: Bree Serif;]
                            ~ Cabaletta Coterie ~ 
                        [/div] 
                        [fa]fa-solid fa-music[/fa]
                        [div=background-image: var(--pokeball); background-size: 100% 100%; background-repeat: no-repeat; height: 45px; aspect-ratio: 1/1;][/div]
                    [/div]
                [/bg]}
        [div=/*SECTION - Pokémon Party Container */
        --p-bottom: 0px;
        --p-right: -3%;
        --p-width: calc(1.25*var(--d));
        --p-ratio: 1/1;
        --p-name-width: calc(1.2*var(--d));
        --d-temp-col: repeat(5, 18px);
        --d-temp-row: repeat(5, 17px);
        --gap: 3px;
        box-sizing: border-box; background-color: #333437aa; width: var(--TC-width); aspect-ratio: 11/16; max-width: 82vw; border-radius: 15px; visibility: visible; background-image: url(https://i.redd.it/nlhc5edcttqb1.gif); background-size: 100% 100%; background-position: center;
        display: grid;
        grid-template-rows: repeat(3, minmax(12vw, 1fr));
        grid-template-columns: repeat(2, minmax(5vw, 1fr));
        grid-template-areas: "P1 P2" 
        "P3 P4" 
        "P5 P6";
        align-items: center; 
        justify-items: center;
        margin: -35px auto 0px auto;]
            [div=/*SECTION - Pokemon 1 */ 
            box-sizing: border-box; background-image: var(--PyrImg); background-size: 90% 90%; background-color: var(--PyrPrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--PyrSecType); border-radius: 50px; width: var(--p-width); aspect-ratio: var(--p-ratio); margin: 5%; pointer-events: none; display: flex; grid-area: P1; font-family: Yeon Sung; position: relative;]
                    [div=/*SECTION - Pokemon Details */
                    box-sizing: border-box; color: var(--PyrPrimType); display: grid; grid-template-columns: var(--d-temp-col); grid-template-rows: var(--d-temp-row); position: absolute; bottom: var(--p-bottom); right: var(--p-right); grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: var(--gap);]
                        [div=/*ANCHOR - Name */
                        background-color: #faebd7; border: 3px Ridge var(--PyrSecType); border-radius: 7.5px; width: var(--p-name-width); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Pyrrha[/div]
                        [div=/*ANCHOR - Gender */
                        background-image: var(--PyrGender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--PyrSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                        [div=/*ANCHOR - Level */
                        font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--PyrSecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-content: center;]
                            Lv25
                        [/div]
                        [div=/*ANCHOR - Held Item*/
                        background-image: var(--PyrItem); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--PyrSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                        [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
            [/div]
            [div=/*SECTION - Slot 2 */
            box-sizing: border-box; background-image: var(--HalImg); background-size 90% 90%; background-color: var(--HalPrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--HalSecType); border-radius: 50px; width: var(--p-width); aspect-ratio: var(--p-ratio); margin: 5%; pointer-events: none; display: flex; grid-area: P2; font-family: Yeon Sung; position: relative;]
                    [div=/*SECTION - Pokemon Details */
                    box-sizing: border-box; color: var(--HalPrimType); display: grid; grid-template-columns: var(--d-temp-col); grid-template-rows: var(--d-temp-row); position: absolute; bottom: var(--p-bottom); right: var(--p-right); grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: var(--gap);]
                        [div=/*ANCHOR - Name */
                        background-color: #faebd7; border: 3px Ridge var(--HalSecType); border-radius: 7.5px; width: var(--p-name-width); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Halay-Alae[/div]
                        [div=/*ANCHOR - Gender */
                        background-image: var(--HalGender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--HalSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                        [div=/*ANCHOR - Level */
                        font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--HalSecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-content: center;]
                            Lv22
                        [/div]
                        [div=/*ANCHOR - Held Item */
                        background-image: var(--HalItem); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--HalSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
            [/div]
            [div=/*SECTION - Slot 3 */
            box-sizing: border-box; background-image: var(--PariImg); background-size 90% 90%; background-color: var(--PariPrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--PariSecType); border-radius: 50px; width: var(--p-width); aspect-ratio: var(--p-ratio); margin: 5%; pointer-events: none; display: flex; grid-area: P3; font-family: Yeon Sung; position: relative;]
                    [div=/*SECTION - 3 Details */
                    box-sizing: border-box; color: var(--PariPrimType); display: grid; grid-template-columns: var(--d-temp-col); grid-template-rows: var(--d-temp-row); position: absolute; bottom: var(--p-bottom); right: var(--p-right); grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: var(--gap);]
                        [div=/*ANCHOR - Name */
                        background-color: #faebd7; border: 3px Ridge var(--PariSecType); border-radius: 7.5px; width: var(--p-name-width); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Pari[/div]
                        [div=/*ANCHOR - Gender */
                        background-image: var(--PariGender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--PariSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                        [div=/*ANCHOR - Level */
                        font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--PariSecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-content: center;]
                            Lv10
                        [/div]
                        [div=/*ANCHOR - Held Item */
                        background-image: var(--PariItem); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--PariSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                        [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
            [/div]
            [div=/*SECTION - Slot 4 */
            box-sizing: border-box; background-image: var(--CieraImg); background-size 90% 90%; background-color: var(--CieraPrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--CieraSecType); border-radius: 50px; width: var(--p-width); aspect-ratio: var(--p-ratio); margin: 5%; pointer-events: none; display: flex; grid-area: P4; font-family: Yeon Sung; position: relative;]
                [comment] -- Pokémon 4 Details -- [/comment]
                    [div=/*SECTION - 4 Deails */
                    box-sizing: border-box; color: var(--CieraPrimType); display: grid; grid-template-columns: var(--d-temp-col); grid-template-rows: var(--d-temp-row); position: absolute; bottom: var(--p-bottom); right: var(--p-right); grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: var(--gap);]
                        [div=/*ANCHOR - Name */
                        background-color: #faebd7; border: 3px Ridge var(--CieraSecType); border-radius: 7.5px; width: var(--p-name-width); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Maçiera[/div]
                        [div=/*ANCHOR - Gender */
                        background-image: var(--CieraGender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--CieraSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                        [div=/*ANCHOR - Level */
                        font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--CieraSecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-content: center;]
                            Lv20
                        [/div]
                        [div=/*ANCHOR - Held Item */
                        background-image: var(--CieraItem); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--CieraSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
            [/div]
            [div=/*SECTION - Slot 5 */ 
            box-sizing: border-box; background-image: var(--SusuImg); background-size 90% 90%; background-color: var(--SusuPrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--SusuSecType); border-radius: 50px; width: var(--p-width); aspect-ratio: var(--p-ratio); margin: 5%; pointer-events: none; display: flex; grid-area: P5; font-family: Yeon Sung; position: relative;]
                    [div=/*SECTION - 5 Details */
                    box-sizing: border-box; color: var(--SusuPrimType); display: grid; grid-template-columns: var(--d-temp-col); grid-template-rows: var(--d-temp-row); position: absolute; bottom: var(--p-bottom); right: var(--p-right); grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: var(--gap);]
                        [div=/*ANCHOR - Name */
                        background-color: #faebd7; border: 3px Ridge var(--SusuSecType); border-radius: 7.5px; width: var(--p-name-width); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]L' Basseau[/div]
                        [div=/*ANCHOR - Gender */
                        background-image: var(--SusuGender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--SusuSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                        [div=/*ANCHOR - Level */
                        font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--SusuSecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-content: center;]
                            Lv18
                        [/div]
                        [div=/*ANCHOR - Held Item */
                        background-image: var(--SusuItem); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--SusuSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
            [/div]
        [comment] -- Pokémon Slot 6 -- [/comment]
            [div=/*SECTION - Slot 6 */
            box-sizing: border-box; background-image: var(--KasImg); background-size 90% 90%; background-color: var(--KasPrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--KasSecType); border-radius: 50px; width: var(--p-width); aspect-ratio: var(--p-ratio); margin: 5%; pointer-events: none; display: flex; grid-area: P6; font-family: Yeon Sung; position: relative;]
                    [div=/*SECTION - 6 Details */
                    box-sizing: border-box; color: var(--KasPrimType); display: grid; grid-template-columns: var(--d-temp-col); grid-template-rows: var(--d-temp-row); position: absolute; bottom: var(--p-bottom); right: var(--p-right); grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: var(--gap);]
                        [div=/*ANCHOR - Name */
                        background-color: #faebd7; border: 3px Ridge var(--KasSecType); border-radius: 7.5px; width: var(--p-name-width); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Kasriel[/div]
                        [div=/*ANCHOR - Gender */
                        background-image: var(--KasGender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--KasSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                        [div=/*ANCHOR - Level */
                        font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--KasSecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-content: center;]
                            Lv22
                        [/div]
                        [div=/*ANCHOR - Held Item */
                        background-image: var(--KasItem); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--KasSecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                        [div=/*!SECTION */ display: none;][/div]
                    [/div]
                    [div=/*!SECTION */ display: none;][/div]
            [/div]
            [div=/*!SECTION */ display: none;][/div]
    [/div]
                {/slide}
                [comment] -- Pokémon Moves Slide -- [/comment]
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: 0;
                padding: 0px;]
                    [div=box-sizing: border-box; display: flex; flex-direction: row; border: 4px solid transparent; border-image: var(--b-i); border-radius: 15px; display: flex; justify-content: space-evenly; align-items: center; color: #fff; letter-spacing: 1px; min-width: var(--d); padding: 5px;
                    min-width: -moz-fit-content; min-width: fit-content; width: 85%; height: 100%;
                    margin: 0 auto; background-color: #202020;] 
                        [div=background-image: var(--pokeball); background-size: 100% 100%; background-repeat: no-repeat; height: 45px; aspect-ratio: 1/1;][/div]
                        [fa]fa-solid fa-compact-disc[/fa] 
                        [div=width: 65%; font-size: clamp(8px, 1.75vw, 12px); display: flex; justify-content: center; align-content: center; font-family: Bree Serif;]
                            ~ Coterie's Moves ~ 
                        [/div] 
                        [fa]fa-solid fa-compact-disc[/fa]
                        [div=background-image: var(--pokeball); background-size: 100% 100%; background-repeat: no-repeat; height: 45px; aspect-ratio: 1/1;][/div]
                    [/div]
                [/bg]}
                    [comment] -- Pokémon Party Moves Accordion -- [/comment]
                    [div=visibility: hidden;
                    margin: auto;
                    padding: 0px;
                    position: relative;][accordion=100% | bcenter]
                        [comment] -- Pokemon 1 Moves -- [/comment]
                            {slide=center | [bg=transparent;
                            visibility: visible;
                            position: relative;
                            margin: -40px 0px 0px 0px;
                            padding: 0px;]
                                [div=background-color: var(--PyrPrimType); 
                                background-image: var(--PyrImg); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--PyrSecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Pyr's Moves[/div]
                            [/bg]}
                                [div=background-color: #faebd7;
                                box-sizing: border-box; 
                                border-radius: 15px;
                                max-width: 50vw; 
                                max-height: 50vh; 
                                margin: -30px auto 0px auto; 
                                padding: 5px; 
                                visibility: visible; 
                                width: 75%;
                                height: calc(2*var(--d));
                                overflow: scroll;
                                color: #040404;
                                font-size: 10px;
                                background-image: var(--PyrMoves);
                                background-size: 100% 100%;
                                background-position: center;]
                                [/div]
                            {/slide}
                            [comment] -- Pokemon 2 Moves -- [/comment]
                            {slide=center | [bg=transparent;
                            visibility: visible;
                            position: relative;
                            margin: auto;
                            padding: 0px;]
                                [div=background-color: var(--HalPrimType); 
                                background-image: var(--HalImg); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--HalSecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Halay's Moves[/div]
                            [/bg]}
                                [div=background-color: #faebd7;
                                box-sizing: border-box; 
                                border-radius: 15px;
                                max-width: 50vw; 
                                max-height: 50vh; 
                                margin: -30px auto 0px auto; 
                                padding: 5px; 
                                visibility: visible; 
                                width: 75%;
                                height: calc(2*var(--d));
                                overflow: scroll;
                                color: #040404;
                                font-size: 10px;
                                background-image: var(--HalMoves);
                                background-size: 100% 100%;
                                background-position: center;]
                                [/div]
                            {/slide}
                            [comment] -- Pokemon 3 Moves -- [/comment]
                            {slide=center | [bg=transparent;
                            visibility: visible;
                            position: relative;
                            margin: 0;
                            padding: 0px;]
                            [div=background-color: var(--PariPrimType); 
                                background-image: var(--PariImg); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--PariSecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Pari's Moves[/div]
                            [/bg]}
                                [div=background-color: #faebd7;
                                box-sizing: border-box; 
                                border-radius: 15px;
                                max-width: 50vw; 
                                max-height: 50vh; 
                                margin: -30px auto 0px auto; 
                                padding: 5px; 
                                visibility: visible; 
                                width: 75%;
                                height: calc(2*var(--d));
                                overflow: scroll;
                                color: #040404;
                                font-size: 10px;
                                background-image: var(--PariMoves);
                                background-size: 100% 100%;
                                background-position: center;]
                                [/div]
                            {/slide}
                            [comment] -- Pokemon 4 Moves -- [/comment]
                            {slide=center | [bg=transparent;
                            visibility: visible;
                            position: relative;
                            margin: 0;
                            padding: 0px;]
                                [div=background-color: var(--CieraPrimType); 
                                background-image: var(--CieraImg); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--CieraSecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Halay's Moves[/div]
                            [/bg]}
                                [div=background-color: #faebd7;
                                box-sizing: border-box; 
                                border-radius: 15px;
                                max-width: 50vw; 
                                max-height: 50vh; 
                                margin: -30px auto 0px auto; 
                                padding: 5px; 
                                visibility: visible; 
                                width: 75%;
                                height: calc(2*var(--d));
                                overflow: scroll;
                                color: #040404;
                                font-size: 10px;
                                background-image: var(--CieraMoves);
                                background-size: 100% 100%;
                                background-position: center;]
                                [/div]
                            {/slide}
                            [comment] -- Pokemon 5 Moves -- [/comment]
                            {slide=center | [bg=transparent;
                            visibility: visible;
                            position: relative;
                            margin: 0;
                            padding: 0px;]
                                [div=background-color: var(--SusuPrimType); 
                                background-image: var(--SusuImg); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--SusuSecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Susu's Moves[/div]
                            [/bg]}
                                [div=background-color: #faebd7;
                                box-sizing: border-box; 
                                border-radius: 15px;
                                max-width: 50vw; 
                                max-height: 50vh; 
                                margin: -30px auto 0px auto; 
                                padding: 5px; 
                                visibility: visible; 
                                width: 75%;
                                height: calc(2*var(--d));
                                overflow: scroll;
                                color: #040404;
                                font-size: 10px;
                                background-image: var(--SusuMoves);
                                background-size: 100% 100%;
                                background-position: center;]
                                [/div]
                            {/slide}
                            [comment] -- Pokemon 6 Moves -- [/comment]
                            {slide=center | [bg=transparent;
                            visibility: visible;
                            position: relative;
                            margin: 0;
                            padding: 0px;]
                                [div=background-color: var(--KasPrimType); 
                                background-image: var(--KasImg); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--KasSecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Kasriel's Moves[/div]
                            [/bg]}
                                [div=background-color: #faebd7;
                                box-sizing: border-box; 
                                border-radius: 15px;
                                max-width: 50vw; 
                                max-height: 50vh; 
                                margin: -30px auto 0px auto; 
                                padding: 5px; 
                                visibility: visible; 
                                width: 75%;
                                height: calc(2*var(--d));
                                overflow: scroll;
                                color: #040404;
                                font-size: 10px;
                                background-image: var(--KasMoves);
                                background-size: 100% 100%;
                                background-position: center;]
                                [/div]
                            {/slide}
                        [/accordion]
                    [/div]
                {/slide}
            [/accordion]
        [/div]
        [div=/*!SECTION */ display: none;][/div]
    {/slide}
    [/accordion]
    [div=/*!SECTION */ display: none;][/div]
[/div]
[div=/*SECTION - Post Container */ 
box-sizing: border-box; margin: 0 2.5%; line-height: 1.75;
text-align: justify;
text-justify: inter-character;
letter-spacing: 0.75px;
word-spacing: 1.25px;
word-wrap: break-word;
white-space: collapse;
hyphens: auto;

/* Dialogue Colors */
--esther-c: #b22222;]

    [comment]-- Font -->[/comment][div=/*SECTION - Post Header */
    border: 1px solid transparent;

/* Probably best if you don't change anything I haven't commented next to */

position: relative;
box-sizing: border-box;
max-width: 100%;
min-width: 400px;
padding: 0px;
line-height: 1.5;
letter-spacing: 1px;
margin: 0px auto;
top: 0px;
font-family: Madimi One;
/* Accent Colours */

--c-1: #16B0EE;
--c-2-day: #dedede42;
--c-2-night: #33333359;
--c-3: #02358366;
--c-4: #dedede;

 /* Weather Colors – Copy */

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

--f-s: 1.25em; /* Font size, increase or decrease by .1 increments */
--text-l: calc(10px - var(--dia-s));
--text-p: 10px 20px 10px 20px; /* Text padding */

--icon-f-s: 2em; /* Icon size, increase or decrease by .1 increments  */

display: flex;
flex-flow: row nowrap;
justify-content: flex-start;
align-items: center;][comment]

-- Diamond 1 --
-- Sky Gradient -- [/comment][border=/*SECTION - Diamond 1 */ transparent;
position: relative;
margin: var(--dia-m);
box-sizing: border-box;
flex: 0 0 var(--dia-s);
height: var(--dia-s);
border: var(--b);
background: var(--morning-sky);
padding: 0px;
transform: var(--r);][/border][div=/*!SECTION */ display: none;][/div][comment]

-- Diamond 2 --[/comment][border=/*SECTION - Diamond 2 */ transparent;
position: relative;
left: var(--dia-l);
margin: var(--dia-m);
margin-left: 0px;
box-sizing: border-box;
flex: 0 0 var(--dia-s);
height: var(--dia-s);
background: var(--c-2-day);
padding: 0px;
transform: var(--r);
display: flex;
flex-flow: row nowrap;
justify-content: center;
align-items: center;][div=/*!SECTION */ display: none;][/div][comment]

-- Icon -- 

/*SECTION - Weather Icons */

/* Harsh Sun 
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

*/
/*!SECTION */[/comment][border=transparent;
box-sizing: border-box;
padding: 0px;

/*SECTION - Sun/Moon Colors */

--sun-color: #FFFD37;
--evening-sun-color: #FFA500; 
--moon-color: #dcdcdc;

/*!SECTION */
color: var(--evening-sun-color);
font-size: var(--icon-f-s);
font-weight: bold;
line-height: 1;
transform: var(--r-r);][fa]fa-regular fa-sun[/fa][/border][/border][comment]
[div=/*!SECTION */ display: none;][/div]
-- Text --[/comment][div=/*SECTION - Text */
border: transparent;
position: relative;
left: calc(0.5*var(--text-l));
box-sizing: border-box;
padding: var(--text-p);
color: var(--c-4);
font-size: clamp(0.75em, 3vw , var(--f-s));
line-height: 1;
height: 50px;
display: block;
overflow: visible;
font-family: Dosis;]
[div=/*SECTION - Date & Time */
box-sizing: border-box; font-size: clamp( 0.25em, 2vw , 0.75em); position: relative; right: 4em; top: -6em;] 
    Tuesday, July 12th — 9:30 a.m. 
    [div=/*!SECTION */ display: none;][/div]
[/div] 
[div=/*SECTION - Location */
box-sizing: border-box; position: relative; right: 0.85em; bottom: 6.25em;]
    Cyllage Gym [Cyllage City]
    [div=/*!SECTION */ display: none;][/div]
[/div] 
    [div=/*SECTION - Interaction | Mention */ box-sizing: border-box; font-size: clamp(0.15em, 1.5vw, 0.5em); position: relative; right: 4em; bottom: 15.5em;] 
         [br][/br] Code by Ami
         [div=/*!SECTION */ display: none;][/div]
    [/div] 
[/div]
[/div]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[br][/br]
[div=/*!SECTION */ display: none;][/div]
[spoiler=Bag] $6,920 | Pokéball x0 | PokéToy | PokéFlute 
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
[/spoiler]
[/div]