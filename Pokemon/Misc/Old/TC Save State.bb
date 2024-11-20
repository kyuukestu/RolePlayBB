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

--poke-3-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/munna.gif);
--poke-3-prim-type-color: #FA92B2;
--poke-3-sec-type-color: #A13959;
--poke-3-gender: var(--female);
--poke-3-held-item: url();

--poke-4-img: url(https://www.smogon.com/forums/attachments/761-gif.274544/);
--poke-4-prim-type-color: #A7DB8D;
--poke-4-sec-type-color: #57913A;
--poke-4-gender: var(--female);
--poke-4-held-item: url();


--poke-5-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--poke-5-prim-type-color: #C6D16E;
--poke-5-sec-type-color: #506899;
--poke-5-gender: var(--female);
--poke-5-held-item: url();

--poke-6-img: url(https://www.smogon.com/forums/attachments/263_2-gif.284206/);
--poke-6-prim-type-color: #A29288;
--poke-6-sec-type-color: #6D6D4E;
--poke-6-gender: var(--male);
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

--bg-img: url("data:image/svg+xml,%3Csvg width='180' height='180' viewBox='0 0 180 180' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath d='M81.28 88H68.413l19.298 19.298L81.28 88zm2.107 0h13.226L90 107.838 83.387 88zm15.334 0h12.866l-19.298 19.298L98.72 88zm-32.927-2.207L73.586 78h32.827l.5.5 7.294 7.293L115.414 87l-24.707 24.707-.707.707L64.586 87l1.207-1.207zm2.62.207L74 80.414 79.586 86H68.414zm16 0L90 80.414 95.586 86H84.414zm16 0L106 80.414 111.586 86h-11.172zm-8-6h11.173L98 85.586 92.414 80zM82 85.586L87.586 80H76.414L82 85.586zM17.414 0L.707 16.707 0 17.414V0h17.414zM4.28 0L0 12.838V0h4.28zm10.306 0L2.288 12.298 6.388 0h8.198zM180 17.414L162.586 0H180v17.414zM165.414 0l12.298 12.298L173.612 0h-8.198zM180 12.838L175.72 0H180v12.838zM0 163h16.413l.5.5 7.294 7.293L25.414 172l-8 8H0v-17zm0 10h6.613l-2.334 7H0v-7zm14.586 7l7-7H8.72l-2.333 7h8.2zM0 165.414L5.586 171H0v-5.586zM10.414 171L16 165.414 21.586 171H10.414zm-8-6h11.172L8 170.586 2.414 165zM180 163h-16.413l-7.794 7.793-1.207 1.207 8 8H180v-17zm-14.586 17l-7-7h12.865l2.333 7h-8.2zM180 173h-6.613l2.334 7H180v-7zm-21.586-2l5.586-5.586 5.586 5.586h-11.172zM180 165.414L174.414 171H180v-5.586zm-8 5.172l5.586-5.586h-11.172l5.586 5.586zM152.933 25.653l1.414 1.414-33.94 33.942-1.416-1.416 33.943-33.94zm1.414 127.28l-1.414 1.414-33.942-33.94 1.416-1.416 33.94 33.943zm-127.28 1.414l-1.414-1.414 33.94-33.942 1.416 1.416-33.943 33.94zm-1.414-127.28l1.414-1.414 33.942 33.94-1.416 1.416-33.94-33.943zM0 85c2.21 0 4 1.79 4 4s-1.79 4-4 4v-8zm180 0c-2.21 0-4 1.79-4 4s1.79 4 4 4v-8zM94 0c0 2.21-1.79 4-4 4s-4-1.79-4-4h8zm0 180c0-2.21-1.79-4-4-4s-4 1.79-4 4h8z' fill='%23ff0000' fill-opacity='0.32' fill-rule='evenodd'/%3E%3C/svg%3E");

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

background-color: #858585;
background-image: var(--char-img), var(--bg-img);
background-repeat: no-repeat, repeat;
background-position: bottom left, center;
background-size: 55%, 20%;

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
                [div=background-image: var(--poke-6-img); background-size: 115% 115%; background-color: var(--poke-6-prim-type-color); background-position: center; border: 2px solid var(--poke-6-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
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