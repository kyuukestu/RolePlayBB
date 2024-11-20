[div=visibility: hidden;
margin: auto;
padding: 0px;
float: inline-end;
position: relative;
top: 3.5em;

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
--male: url(https://i.imgur.com/4FI7ot0.png);
--female: url(https://i.imgur.com/wpBhCjV.png);]
    [font=Protest Riot]
        [accordion=100% | bcenter]
            {slide=center | [bg=transparent;
            visibility: visible;
            position: relative;
            margin: 0;
            padding: 0px;
            z-index: 2;]
                [div=box-sizing: border-box; border: 1px solid #0000; padding: 5px; border-radius: 15px;

                /* Character Image */
                --char-img: url(https://i.imgur.com/V0jzh5D.png);

                /* Background Image */
                --bg-img: url(https://mqpolska.pl/media/djcatalog2/images/item/5/neroprofondopr_f.jpg);

                /* Ribbon Images */
                --r-1: url();
                --r-2: url();
                --r-3: url();
                --r-4: url();
                --r-5: url();

                /* Badge Images */
                --b-1: url(https://archives.bulbagarden.net/media/upload/thumb/a/a5/Bug_Badge.png/100px-Bug_Badge.png);
                --b-2: url(https://archives.bulbagarden.net/media/upload/3/39/Cliff_Badge.png);
                --b-3: url();
                --b-4: url();
                --b-5: url();
                --b-6: url();
                --b-7: url();
                --b-8: url();

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
                background-size: 35%, 30%;

                overflow: clip;

                z-index: 1;]
                    [comment] == Name Tag & ID ==[/comment]
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
                    [comment] == Click Icon == [/comment]
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

                overflow: clip;]
                    [Comment] == Contest Ribbons == [/comment]
                    [div=box-sizing: border-box; padding: 0px; margin: 0px; background: linear-gradient(45deg, rgba(255 255,255,0.85) 35%, transparent 70%) top; background-repeat: no-repeat; background-size: 100% 1px; height: fit-content; width: 125%; position: relative; top: 2.5em; flex-grow: 0; display: flex; flex-flow: row nowrap;]
                    Ribbons:
                        [div=box-sizing: border-box; height: fit-content; display: flex; flex-flow: row wrap; position: relative; top: 15%; justify-content: space-between; width: 75%; padding-top: 25px; right: 25%;]
                            [div=background-image: var(--r-1); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px;][/div]
                            [div=background-image: var(--r-2); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;][/div]
                            [div=background-image: var(--r-3); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px;][/div]
                            [div=background-image: var(--r-4); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px; left: 22.5px;][/div]
                            [div=background-image: var(--r-5); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; position: relative; top: 25px; right: 5px;][/div]
                        [/div]
                    [/div]
                [/div]
            [/div]
        [/bg]}
        
[div=box-sizing: border-box; background-color: #333437aa; 
width: clamp(100px, 22.5em, 540px); max-width: 82vw; border-radius: 15px; display: flex; flex-wrap: wrap; justify-content: space-evenly; align-items: center; padding: 10px; visibility: visible; z-index: 3; margin-left: 0.75em; gap: 25px 10%; background-image: url(https://i.redd.it/nlhc5edcttqb1.gif); background-size: 100% 100%; background-position: center;]
                [comment] -- Pokémon Slot 1 -- height: clamp(55px, 13.25em, 315px); [/comment]
                [div=background-image: var(--poke-1-img); background-size 90% 90%; background-color: var(--poke-1-prim-type-color); background-position: center; border: 2px solid var(--poke-1-sec-type-color); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat; flex: 1 1 auto;]
                    [comment] -- Pokémon 1 Gender -- [/comment]
                    [div=background-image: var(--poke-1-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.75*var(--d)); right: 5px; flex-shrink: 0;][/div]
                    [comment] -- Pokémon 1 Details -- [/comment]
                    [Font=Yeon Sung]
                    [div=background-color: #faebd7; border-bottom: 3px groove #000; border-radius: 7.5px; width: var(--d); height: calc(var(--d)/3.6); box-sizing: border-box; position: relative; top: calc(-0.4*var(--d)); right: 15px; display: flex; flex-flow: column nowrap; color: #000; text-align: center;]
                        [comment] -- Pokémon 1 Name -- [/comment]
                            [div=font-size: 16px;]Pyrrha[/div]
                        [comment] -- Pokémon 1 Level -- [/comment]
                            [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 45px; position: relative; left: calc(0.37*var(--d)); top: calc(0.85*var(--d)); width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); flex-shrink: 0; text-align: center; display: flex; align-items: center; padding: 3px;]Lv25[/div]
                    [/div]
                    [/Font]
                    [comment] -- Pokémon 1 Held Item -- [/comment]
                    [div=background-image: var(--poke-1-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.75*var(--d)); right: calc(0.3*var(--d)); flex-shrink: 0;][/div]
                [/div]
                [comment] -- Pokémon Slot 2 -- [/comment]
                [div=background-image: var(--poke-2-img); background-size: 60% 60%; background-color: var(--poke-2-prim-type-color); background-position: center; border: 2px solid var(--poke-2-sec-type-color); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; flex: 1 1 auto;]
                    [comment] -- Pokémon 2 Gender -- [/comment]
                    [div=background-image: var(--poke-2-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.17*var(--d)); right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 2 Details -- [/comment]
                    [Font=Yeon Sung]
                    [div=background-color: #faebd7; border-bottom: 3px groove #000; border-radius: 7.5px; width: var(--d); height: calc(var(--d)/3.6); box-sizing: border-box; position: relative; top: calc(-1.92*var(--d)); left: 10px; display: flex; flex-flow: column nowrap; color: #000; text-align: center;]
                        [comment] -- Pokémon 2 Name -- [/comment]
                            [div=font-size: 16px;]Halay-Alae[/div]
                        [comment] -- Pokémon 2 Level -- [/comment]
                            [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 45px; position: relative; left: calc(0.37*var(--d)); top: calc(0.85*var(--d)); width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); flex-shrink: 0; text-align: center; display: flex; align-items: center; padding: 3px;]Lv22[/div]
                    [/div]
                    [/Font]
                    [comment] -- Pokémon 2 Held Item -- [/comment]
                    [div=background-image: var(--poke-2-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-2.22*var(--d)); left: calc(1.07*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 3 -- [/comment]
                [div=background-image: var(--poke-3-img); background-size: 60% 60%; background-color: var(--poke-3-prim-type-color); background-position: center; border: 2px solid var(--poke-3-sec-type-color); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; flex: 1 1 auto;]
                    [comment] -- Pokémon 3 Gender -- [/comment]
                    [div=background-image: var(--poke-3-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.17*var(--d)); right: 5px;][/div]
                    [comment] -- Pokémon 3 Details -- [/comment]
                    [Font=Yeon Sung]
                    [div=background-color: #faebd7; border-bottom: 3px groove #000; border-radius: 7.5px; width: var(--d); height: calc(var(--d)/3.6); box-sizing: border-box; position: relative; top: calc(-1.92*var(--d)); left: 10px; display: flex; flex-flow: column nowrap; color: #000; text-align: center;]
                        [comment] -- Pokémon 3 Name -- [/comment]
                            [div=font-size: 16px;]Pari[/div]
                        [comment] -- Pokémon 3 Level -- [/comment]
                            [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 45px; position: relative; left: calc(0.37*var(--d)); top: calc(0.85*var(--d)); width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); flex-shrink: 0; text-align: center; display: flex; align-items: center; padding: 3px;]Lv10[/div]
                    [/div]
                    [/Font]
                    [comment] -- Pokémon 3 Held Item -- [/comment]
                    [div=background-image: var(--poke-3-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-2.22*var(--d)); left: calc(1.07*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 4 -- [/comment]
                [div=background-image: var(--poke-4-img); background-size: 60% 60%; background-color: var(--poke-4-prim-type-color); background-position: center; border: 2px solid var(--poke-4-sec-type-color); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; flex: 1 1 auto;]
                    [comment] -- Pokémon 4 Gender -- [/comment]
                    [div=background-image: var(--poke-4-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.17*var(--d)); right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 4 Details -- [/comment]
                    [Font=Yeon Sung]
                    [div=background-color: #faebd7; border-bottom: 3px groove #000; border-radius: 7.5px; width: var(--d); height: calc(var(--d)/3.6); box-sizing: border-box; position: relative; top: calc(-1.92*var(--d)); left: 10px; display: flex; flex-flow: column nowrap; color: #000; text-align: center;]
                        [comment] -- Pokémon 4 Name -- [/comment]
                            [div=font-size: 16px;]Maçiera[/div]
                        [comment] -- Pokémon 4 Level -- [/comment]
                            [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 45px; position: relative; left: calc(0.37*var(--d)); top: calc(0.85*var(--d)); width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); flex-shrink: 0; text-align: center; display: flex; align-items: center; padding: 3px;]Lv20[/div]
                    [/div]
                    [/Font]
                    [comment] -- Pokémon 4 Held Item -- [/comment]
                    [div=background-image: var(--poke-4-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-2.22*var(--d)); left: calc(1.07*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 5 -- [/comment]
                [div=background-image: var(--poke-5-img); background-size: 65% 65%; background-color: var(--poke-5-prim-type-color); background-position: center; border: 2px solid var(--poke-5-sec-type-color); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; flex: 1 1 auto;]
                    [comment] -- Pokémon 5 Gender -- [/comment]
                    [div=background-image: var(--poke-5-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.17*var(--d)); right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 5 Details -- [/comment]
                    [Font=Yeon Sung]
                    [div=background-color: #faebd7; border-bottom: 3px groove #000; border-radius: 7.5px; width: var(--d); height: calc(var(--d)/3.6); box-sizing: border-box; position: relative; top: calc(-1.92*var(--d)); left: 10px; display: flex; flex-flow: column nowrap; color: #000; text-align: center;]
                        [comment] -- Pokémon 5 Name -- [/comment]
                            [div=font-size: 16px;]L' Basseau[/div]
                        [comment] -- Pokémon 5 Level -- [/comment]
                            [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 45px; position: relative; left: calc(0.37*var(--d)); top: calc(0.85*var(--d)); width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); flex-shrink: 0; text-align: center; display: flex; align-items: center; padding: 3px;]Lv18[/div]
                    [/div]
                    [/Font]
                    [comment] -- Pokémon 5 Held Item -- [/comment]
                    [div=background-image: var(poke-5-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-2.22*var(--d)); left: calc(1.07*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 6 -- [/comment]
                [div=background-image: var(--poke-6-img); background-size: 60% 60%; background-color: var(--poke-6-prim-type-color); background-position: center; border: 2px solid var(--poke-6-sec-type-color); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; flex: 1 1 auto;]
                    [comment] -- Pokémon 6 Gender -- [/comment]
                    [div=background-image: var(--poke-6-gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.17*var(--d)); right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 6 Details -- [/comment]
                    [Font=Yeon Sung]
                    [div=background-color: #faebd7; border-bottom: 3px groove #000; border-radius: 7.5px; width: var(--d); height: calc(var(--d)/3.6); box-sizing: border-box; position: relative; top: calc(-1.92*var(--d)); left: 10px; display: flex; flex-flow: column nowrap; color: #000; text-align: center;]
                        [comment] -- Pokémon 6 Name -- [/comment]
                            [div=font-size: 16px;]Īstha[/div]
                        [comment] -- Pokémon 6 Level -- [/comment]
                            [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 45px; position: relative; left: calc(0.37*var(--d)); top: calc(0.85*var(--d)); width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); flex-shrink: 0; text-align: center; display: flex; align-items: center; padding: 3px;]Lv5[/div]
                    [/div]
                    [/Font]
                    [comment] -- Pokémon 6 Held Item -- [/comment]
                    [div=background-image: var(--poke-6-held-item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-2.22*var(--d)); left: calc(1.07*var(--d));][/div]
                [/div]
            [/div] 
        {/slide}
    [/accordion]
    [/font]
[/div]

[div=box-sizing: border-box; margin: 0 2.5%; line-height: 1.75;
text-align: justify;
text-justify: inter-character;
letter-spacing: 0.75px;
word-spacing: 1.25px;
word-wrap: break-word;
white-space: collapse;
hyphens: auto;]

    [comment]-- Font -->[/comment][font=Madimi One][div=border: 1px solid transparent;

/* Probably best if you don't change anything I haven't commented next to */

position: relative;
box-sizing: border-box;
max-width: 100%;
min-width: 60%;
padding: 0px;
line-height: 1.5;
letter-spacing: 1px;
margin: 0px auto;
top: 0px;

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
-- Sky Gradient -- [/comment][border=transparent;
position: relative;
margin: var(--dia-m);
box-sizing: border-box;
flex: 0 0 var(--dia-s);
height: var(--dia-s);
border: var(--b);
background: linear-gradient(135deg, rgba(64,101,139,0.6) 25%,  rgba(209,71,16,0.6) 60%);
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
background: var(--c-2-day);
padding: 0px;
transform: var(--r);
display: flex;
flex-flow: row nowrap;
justify-content: center;
align-items: center;][comment]

-- Icon -- 

/* Weather Icons */

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

*/[/comment][border=transparent;
box-sizing: border-box;
padding: 0px;

/* Sun/Moon Colors */

--sun-color: #FFFD37;
--evening-sun-color: #FFA500; 
--moon-color: #dcdcdc;

color: var(--evening-sun-color);
font-size: var(--icon-f-s);
font-weight: bold;
line-height: 1;
transform: var(--r-r);][fa]fa-regular fa-sun[/fa][/border][/border][comment]

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
display: block;
justify-content: center;
align-items: center;
flex-flow: column nowrap;
overflow: visible;]
[comment] -- Date -- [/comment]
[div=box-sizing: border-box; font-size: clamp( 0.25em, 2vw , 0.75em); position: relative; right: 4em; top: -6em;] 
    Friday, July 25th — 10:25 a.m. 
[/div] 
[comment] -- Location -- [/comment]
[div=box-sizing: border-box; position: relative; right: 0.85em; bottom: 6.25em;]
    S.S. Marine - Olivine Port [Olive City]
[/div] 
[comment] -- Interaction | Mention -- [/comment]
    [div=box-sizing: border-box; font-size: clamp(0.15em, 1.5vw, 0.5em); position: relative; right: 4em; bottom: 15.5em;] 
        [user=103797]@Rick[/user] | [user=49457]@Theodore Hightower[/user] [br][/br] Code by Ami
    [/div] 
[/div]
[/div][/font]
[font=Dosis]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[br][/br]
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
[/font][/div]