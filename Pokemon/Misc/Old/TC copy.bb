[font=Protest Riot][border=0px;
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
--poke-1-img: url(https://www.smogon.com/forums/attachments/782-gif.369411/);
--poke-1-prim-type-color: #A27EFA;
--poke-1-sec-type-color: #7D58D6;
--poke-1-gender: var(--female);
--poke-1-held-item: url();

--poke-2-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--poke-2-prim-type-color: #A29288;
--poke-2-sec-type-color: #9C531F;
--poke-2-gender: var(--female);
--poke-2-held-item: url();

--poke-3-img: url(https://www.smogon.com/forums/attachments/761-gif.274544/);
--poke-3-prim-type-color: #A7DB8D;
--poke-3-sec-type-color: #57913A;
--poke-3-gender: var(--female);
--poke-3-held-item: url();

--poke-4-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/munna.gif);
--poke-4-prim-type-color: #FA92B2;
--poke-4-sec-type-color: #A13959;
--poke-4-gender: var(--female);
--poke-4-held-item: url();

--poke-5-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--poke-5-prim-type-color: #C6D16E;
--poke-5-sec-type-color: #506899;
--poke-5-gender: var(--female);
--poke-5-held-item: url();

--poke-6-img: url(https://play.pokemonshowdown.com/sprites/gen5ani-shiny/feebas.gif);
--poke-6-prim-type-color: #9DB7F5;
--poke-6-sec-type-color: #4A66AB; */
--poke-6-gender: var(--female);
--poke-6-held-item: url();


/* Badge & Pokémon Sizes */
--d: max(6vw, 70px);
--b-d: max(2.5vw, 25px);

/* Gender Images */
--male: url(https://media.discordapp.net/attachments/191374162978144257/1200288723233947758/latest.png);
--female: url(https://media.discordapp.net/attachments/191374162978144257/1200288797334700141/R.png);]
[accordion=100% | bcenter]
{slide=center | [bg=transparent;
visibility: visible;
position: relative;
margin: 0;
padding: 0px;
z-index: 2;][div=box-sizing: border-box; border: 1px solid #0000; padding: 5px; border-radius: 15px;


/* Character Image */

--char-img: url(https://media.discordapp.net/attachments/191374162978144257/1205577169720578048/aa713a2e-4853-4c67-b0d5-c08bdfda02a1_width3D102426height3D1024.png?ex=65d8e03b&is=65c66b3b&hm=72394629524d53293050f55d7452a872f7fb6bcc7cc694694bf93d1c4e7add00&=&format=webp&quality=lossless&width=732&height=732);

/* Background Image */

--bg-img: url();


/* Ribbon Images */

--r-1: url();

--r-2: url();

--r-3: url();

--r-4: url();

--r-5: url();



/* Badge Images */

--b-1: url(https://media.discordapp.net/attachments/191374162978144257/1207166580560232499/1678506315377-png.png?ex=65dea87c&is=65cc337c&hm=84be5ef32a272fd61c32cbdb0e1dd3327693014e4878c1100ab6733c35572ea5&=&format=webp&quality=lossless&width=143&height=143);

--b-2: url();

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

background-color: white;
background-image: var(--char-img);
background-repeat: no-repeat;
background-position: center top left;
background-size: 75%;

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
        
        background-color: #d4d4d4c4;
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
            [div=box-sizing: border-box; grid-area: no;]619272[/div]
        [/div]
    [/div]
    [div=box-sizing: border-box; font-size: 0.95rem; font-variant: small-caps; display: flex; flex-flow: column nowrap; position: absolute; left: 45%; top: -16%; color: #b22222;]Click Me![fa]fa-solid fa-caret-down[/fa][/div]
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
    left: 9.5%;
    bottom: 6.5%;
    
    background-color: #000000bb;
    color: #fffaf0;
    
    font-size: 0.95rem;

    overflow: scroll;]
    [div=box-sizing: border-box: padding: 0px; margin: 0px; margin-bottom: -35px; text-align: center; font-size: 0.75rem;
    height: fit-content; display: flex; flex-flow: column wrap; flex-grow: 0; flex-shrink: 1;]Scroll[fa]fa-solid fa-arrow-down[/fa][/div]
    [Comment] == Contest Ribbons == [/comment]
        [div=box-sizing: border-box; padding: 0px; margin: 0px; background: linear-gradient(45deg, rgba(255 255,255,0.85) 35%, transparent 70%) top; background-repeat: no-repeat; background-size: 100% 1px; height: fit-content; width: 125%; position: relative; flex-grow: 0; display: flex; flex-flow: row nowrap;]
        Ribbons:
            [div=box-sizing: border-box; height: fit-content;  display: flex; flex-flow: row wrap; overflow-x: scroll; padding-top: 25px; position: relative; left: -20%; top: 15%; justify-content: space-evenly;]
               [div=background-image: var(--r-1); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--r-2); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--r-3); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--r-4); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--r-5); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
            [/div]
        [/div]
    [Comment] == Gym Badges == [/comment]
        [div=box-sizing: border-box; padding: 0px; margin: 0px; background: linear-gradient(45deg, rgba(255 255,255,0.85) 35%, transparent 70%) top; background-repeat: no-repeat; background-size: 100% 1px; height: fit-content; width: 125%; position: relative; flex-grow: 0; display: flex; flex-flow: row nowrap;]
        Badges:
            [div=box-sizing: border-box; height: fit-content;  display: flex; flex-flow: row wrap; overflow-x: scroll; padding-top: 25px; position: relative; left: -20%; top: 15%; justify-content: space-evenly;]
               [div=background-image: var(--b-1); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-2); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-3); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-4); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-5); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-6); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-7); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
               [/div]
               [div=background-image: var(--b-8); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
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
                [div=background-image: var(--poke-4-img); background-size: 85% 85%; background-color: var(--poke-4-prim-type-color); background-position: center; border: 2px solid var(--poke-4-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
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
                [div=background-image: var(--poke-6-img); background-size:125% 125%; background-color: var(--poke-6-prim-type-color); background-position: center; border: 2px solid var(--poke-6-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                    [comment] -- Pokémon 6 Gender -- [/comment]
                    [div=background-image: var(--poke-6-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 10px; right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 6 Held Item -- [/comment]
                    [div=background-image: var(--poke-6-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.73*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
            [/div] 
{/slide}
[/accordion]
[/border][/font]