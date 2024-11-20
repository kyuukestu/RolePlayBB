[border=0px;
visibility: hidden;
margin: auto;
padding: 0px;
float: right;


/* Pokémon Team Data : 

Pokemon Images
Pokemon Type colors 
Pokemon Gender
Pokemon Held Items */


/* Gender Icons provided are Male w/ var(--male) or Female w/ var(--female). You are free to change the icons as you wish, or declare your own variables with '--variable-name: url(icon-url);'. */

/* Jangmo-o */
--poke-1-img: url(https://www.smogon.com/forums/attachments/782-gif.369411/);
--poke-1-prim-type-color: #A27EFA;
--poke-1-sec-type-color: #7D58D6;
--poke-1-gender: var(--female);
--poke-1-held-item: url();

/* Houndour */
--poke-2-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--poke-2-prim-type-color: #A29288;
--poke-2-sec-type-color: #9C531F;
--poke-2-gender: var(--female);
--poke-2-held-item: url();


/* Munna */
--poke-3-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/munna.gif);
--poke-3-prim-type-color: #FA92B2;
--poke-3-sec-type-color: #A13959;
--poke-3-gender: var(--female);
--poke-3-held-item: url();

/* Bounsweet */
--poke-4-img: url(https://www.smogon.com/forums/attachments/761-gif.274544/);
--poke-4-prim-type-color: #A7DB8D;
--poke-4-sec-type-color: #57913A;
--poke-4-gender: var(--female);
--poke-4-held-item: url();

/* Surskit */

--poke-5-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--poke-5-prim-type-color: #C6D16E;
--poke-5-sec-type-color: #506899;
--poke-5-gender: var(--female);
--poke-5-held-item: url();

/* Zigzagoon
--poke-6-img: url(https://www.smogon.com/forums/attachments/263_2-gif.284206/);
--poke-6-prim-type-color: #A29288;
--poke-6-sec-type-color: #6D6D4E;
--poke-6-gender: var(--male);
--poke-6-held-item: url(); */

/* Feebas */
--poke-6-img: url(https://play.pokemonshowdown.com/sprites/gen5ani-shiny/feebas.gif);
--poke-6-prim-type-color: #9DB7F5;
--poke-6-sec-type-color: #4A66AB;
--poke-6-gender: var(--female);
--poke-6-held-item: url();


/* Badge & Pokémon Sizes */
--d: max(6vw, 70px);
--b-d: max(2.5vw, 25px);

/* Gender Images */
--male: url(https://media.discordapp.net/attachments/191374162978144257/1200288723233947758/latest.png);
--female: url(https://media.discordapp.net/attachments/191374162978144257/1200288797334700141/R.png);]
[font=Protest Riot]
[accordion=100% | bcenter]
{slide=center | [bg=transparent;
visibility: visible;
position: relative;
margin: 0;
padding: 0px;
z-index: 2;][div=box-sizing: border-box; border: 1px solid #0000; padding: 5px; border-radius: 15px;


/* Character Image */

--char-img: url(https://media.discordapp.net/attachments/954402185821683732/1207953891619242014/yn64qAAAAAElFTkSuQmCC.png?ex=65e185ba&is=65cf10ba&hm=c4450d95d6ce03625cbd8621fc7fa156128a3b9d93c78b114c0812b8d15ccefc&=&format=webp&quality=lossless&width=880&height=880);

/* Background Image */

--bg-img: url(https://media.discordapp.net/attachments/191374162978144257/1209375144133533746/ep_naturalblack.png?ex=65e6b15f&is=65d43c5f&hm=75173819dde8b494bff6007d1dd776287a9e31caf1739df4dc0ea5a91eea1699&=&format=webp&quality=lossless&width=719&height=719);

/* Ribbon Images */

--r-1: url();

--r-2: url();

--r-3: url();

--r-4: url();

--r-5: url();



/* Badge Images */

--b-1: url(https://media.discordapp.net/attachments/191374162978144257/1207166580560232499/1678506315377-png.png?ex=65dea87c&is=65cc337c&hm=84be5ef32a272fd61c32cbdb0e1dd3327693014e4878c1100ab6733c35572ea5&=&format=webp&quality=lossless&width=143&height=143);

--b-2: url(https://media.discordapp.net/attachments/191374162978144257/1211117748059508808/50px-Cliff_Badge.png?ex=65ed084c&is=65da934c&hm=2f029a8f3e4d002314e3806343c1529ac70d5a5c2e7e8143a3d1ca9d6d31e48f&=&format=webp&quality=lossless&width=179&height=179);

--b-3: url();

--b-4: url();

--b-5: url();

--b-6: url();

--b-7: url();

--b-8: url);

margin: auto;
display: flex;
flex-flow: row wrap;
height: clamp(65px, 16.25em, 325px);
width: clamp(110px, 27.5em, 550px);
max-width: 87vw;

visibility: visible;

background-color: #313338;
background-image: var(--char-img), var(--bg-img);
background-repeat: no-repeat, repeat;
background-position: bottom left+3em, center;
background-size: 50%, 30%;

overflow: clip;

z-index: 1;]
    [comment]Name Tag & ID[/comment]
    [div=filter: drop-shadow(0.25em 0.25em 0px #00000088);
    width: 42.5%;
    height: 25%;
    
    position: relative;
    right: 4.5%;
    top: 65%;
        
    z-index: 2;]
        [div=box-sizing: border-box;
        display: grid;
        
        gap: 0px;
        
        justify-content: center;
        align-items: center;
        
        grid-template: 1fr 1fr / 1fr 1fr;
        grid-template-areas: "blank name" "id no";
                
        margin: auto;
        padding-bottom: 0.75em;
        padding-left: 0.95em;
        padding-top: 0.35em;
        
        background-color: #d4d4d4a4;
        color: black;
        
        width: 100%;
        height: 115%;
        
        clip-path: polygon(5% 0%, 100% 0%, 95% 100%, 0% 100%);
        
        font-variant: small-caps;
        font-size: 0.75rem;]
            [comment] == Character Name == [/comment]
            [div=box-sizing: border-box; grid-area: name;]Esther[/div]
            [div=box-sizing: border-box; grid-area: id;]ID No.[/div]
            [comment] == Trainer ID No. == [/comment]
            [div=box-sizing: border-box; grid-area: no;]171027[/div]
        [/div]
    [/div]
    [div=box-sizing: border-box; font-size: 0.95rem; font-variant: small-caps; display: flex; flex-flow: column nowrap; position: absolute; left: 45%; top: -16%; color: #b22222;]Click Me![fa]fa-solid fa-caret-down[/fa][/div]
    [Comment] == Gym Badges == [/comment]
            [div=box-sizing: border-box; height: fit-content; width: 100%; display: flex; flex-flow: row nowrap; overflow-x: scroll; padding-top: 25px; position: relative; top: -40%; justify-content: center; z-index: 3; overflow: visible;]
               [div=background-image: var(--b-1); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat; box-shadow: 0px 0px 8px #fff;]
               [/div]
               [div=background-image: var(--b-2); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat; box-shadow: 0px 0px 8px #fff;]
               [/div]
               [div=background-image: var(--b-3); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-4); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-5); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-6); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-7); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-8); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat;]
               [/div]
            [/div]
    [comment] == Trainer Stats == [/comment]
    [div=box-sizing: border-box;
    
    margin: auto;
    
    display: flex;
    flex-flow: column nowrap;
    justify-content: flex-start;
    gap: 3px;
    
    height: 110%;
    width: 42.5%;
    
    padding: 0.5em 0.35em;
    
    position: relative;
    left: 30%;
    bottom: 60%;

    background-color: #000000bb;
    color: #fffaf0;
    
    font-size: 0.95rem;

    overflow: scroll;]
    [Comment] == Contest Ribbons == [/comment]
        [div=box-sizing: border-box; padding: 0px; margin: 0px; background: linear-gradient(45deg, rgba(255 255,255,0.85) 35%, transparent 70%) top; background-repeat: no-repeat; background-size: 100% 1px; height: fit-content; width: 125%; position: relative; flex-grow: 0; display: flex; flex-flow: row nowrap;]
        Ribbons:
            [div=box-sizing: border-box; height: fit-content; display: flex; flex-flow: row wrap; position: relative; top: 15%; justify-content: space-between; width: 75%; padding-top: 25px; right: 25%;]
               [div=background-image: var(--r-1); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px;]
               [/div]
               [div=background-image: var(--r-2); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--r-3); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px;]
               [/div]
               [div=background-image: var(--r-4); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px; left: 22.5px;]
               [/div]
               [div=background-image: var(--r-5); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px; right: 5px;]
               [/div]
            [/div]
        [/div]
    [/div]
[/div][/bg]}
[div=box-sizing: border-box; background-color: #333437aa; height: clamp(55px, 13.25em, 315px);
width: clamp(100px, 22.5em, 540px); max-width: 82vw; border-radius: 15px; display: flex; flex-wrap: wrap; justify-content: space-evenly; align-items: center; padding: 5px; visibility: visible; z-index: 3; margin-left: 0.75em;]
                [comment] -- Pokémon Slot 1 -- [/comment]
                [div=background-image: var(--poke-1-img); background-size 90% 90%; background-color: var(--poke-1-prim-type-color); background-position: center; border: 2px solid var(--poke-1-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
                    [comment] -- Pokémon 1 Gender -- [/comment]
                    [div=background-image: var(--poke-1-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); right: 5px;][/div]
                    [comment] -- Pokémon 1 Held Item -- [/comment]
                    [div=background-image: var(--poke-1-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); left: calc(0.35*var(--d))][/div]
                [/div]
                [comment] -- Pokémon Slot 2 -- [/comment]
                [div=background-image: var(--poke-2-img); background-size: 75% 75%; background-color: var(--poke-2-prim-type-color); background-position: center; border: 2px solid var(--poke-2-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                    [comment] -- Pokémon 2 Gender -- [/comment]
                    [div=background-image: var(--poke-2-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 10px; right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 2 Held Item -- [/comment]
                    [div=background-image: var(--poke-2-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.73*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 3 -- [/comment]
                [div=background-image: var(--poke-3-img); background-size: 75% 75%; background-color: var(--poke-3-prim-type-color); background-position: center; border: 2px solid var(--poke-3-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                    [comment] -- Pokémon 3 Gender -- [/comment]
                    [div=background-image: var(--poke-3-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 10px; right: 5px;][/div]
                    [comment] -- Pokémon 3 Held Item -- [/comment]
                    [div=background-image: var(--poke-3-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.73*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 4 - Munna -- [/comment]
                [div=background-image: var(--poke-4-img); background-size: 75% 75%; background-color: var(--poke-4-prim-type-color); background-position: center; border: 2px solid var(--poke-4-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                    [comment] -- Pokémon 4 Gender -- [/comment]
                    [div=background-image: var(--poke-4-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 10px; right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 4 Held Item -- [/comment]
                    [div=background-image: var(--poke-4-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.73*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 5 -- [/comment]
                [div=background-image: var(--poke-5-img); background-size: 85% 85%; background-color: var(--poke-5-prim-type-color); background-position: center; border: 2px solid var(--poke-5-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                   [comment] -- Pokémon 5 Gender -- [/comment]
                    [div=background-image: var(--poke-5-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 10px; right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 5 Held Item -- [/comment]
                    [div=background-image: var(poke-5-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.73*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 6 -- [/comment]
                [div=background-image: var(--poke-6-img); background-size: 85% 85%; background-color: var(--poke-6-prim-type-color); background-position: center; border: 2px solid var(--poke-6-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                    [comment] -- Pokémon 6 Gender -- [/comment]
                    [div=background-image: var(--poke-6-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 10px; right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 6 Held Item -- [/comment]
                    [div=background-image: var(--poke-6-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.73*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
            [/div] 
{/slide}
[/accordion]
[/font]
[/border]


[comment]-- Font -->[/comment][font=Inter][border=transparent;

/* Probably best if you don't change anything I haven't commented next to */

position: relative;
box-sizing: border-box;
max-width: 100%;
min-width: 60%;
padding: 0px;

/* Accent Colours */
--c-1: #16B0EE;
--c-2: #dedede42;
--c-3: #02358366;
--c-4: #dedede

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

-- Diamond 1 --[/comment][border=transparent;
position: relative;
margin: var(--dia-m);
box-sizing: border-box;
flex: 0 0 var(--dia-s);
height: var(--dia-s);
border: var(--b);
background: linear-gradient(135deg, rgba(2,53,131,0.6) 2.5%, rgba(22,176,238,0.6) 60%);
padding: 0px;
transform: var(--r);][/border][comment]

-- Diamond 2 --[/comment][border=transparent;
position: relative;
left: var(--dia-l);
margin: var(--dia-m);
margin-left: 0px;
box-sizing: border-box;
flex: 0 0 var(--dia-s);
height: var(--dia-s);
background: var(--c-2);
padding: 0px;
transform: var(--r);
display: flex;
flex-flow: row nowrap;
justify-content: center;
align-items: center;][comment]

-- Icon --[/comment][border=transparent;
box-sizing: border-box;
padding: 0px;
color: #FFFD37;
font-size: var(--icon-f-s);
font-weight: bold;
line-height: 1;
transform: var(--r-r);][fa]fa-solid fa-sun[/fa][/border][/border][comment]

-- Text --[/comment][div=border: transparent;
position: relative;
left: calc(0.5*var(--text-l));
box-sizing: border-box;
padding: var(--text-p);
color: var(--c-4);
font-size: clamp(0.75em, 3vw , var(--f-s));
font-kerning: normal;
line-height: 1;
height: 50px;
display: flex;
justify-content: center;
align-items: center;
flex-flow: column nowrap;
overflow: visible;]
[comment] -- Date -- [/comment]
[div=box-sizing: border-box; font-size: clamp( 0.25em, 2vw , 0.75em); position: relative; right: 5.5em; top: 0.95em;] 
    Friday, July 25th — 10:21 a.m. 
[/div] 
[comment] -- Location -- [/comment]
[div=box-sizing: border-box; position: relative; right: 0.85em; bottom: 1.25em;]
    Olivine Port < Olivine City
[/div] 
[comment] -- Interaction | Mention -- [/comment]
[div=box-sizing: border-box; font-size: clamp(0.15em, 1.5vw, 0.5em); position: relative; left: 7.5em; bottom: 4.5em;] [user=103797]@Rick[/user] | [user=49457]@Theodore Hightower[/user] [br][/br] Code by Ami[/div] 
[/div][/border][/font]
[div=box-sizing: border-box; margin: 0 2.5%;][font=Koho]

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.


Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.

[spoiler=Bag] $??? | Pokéball x??? | PokéToy | Practice Ball | PokéFlute | Unidentified Fossil 
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
[/font][/div]