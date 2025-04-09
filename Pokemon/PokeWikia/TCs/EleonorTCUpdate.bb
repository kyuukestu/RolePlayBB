[div=visibility: hidden;
margin: 0px 0px -35px 0px;
padding: 0px;
float: inline-end;
position: relative;
display: flex;

/* Pokémon Team Data : 

Pokemon Images
Pokemon Type colors 
Pokemon Gender
Pokemon Held Items */


/* Gender Icons provided are Male w/ var(--male) or Female w/ var(--female). You are free to change the icons as you wish, or declare your own variables with '--variable-name: url(icon-url);'. */
--p1Img: url(https://play.pokemonshowdown.com/sprites/gen5ani/mawile.gif);
--p1PrimType: #D1D1E0;
--p1SecType:  #9B6470;
--p1Gender: var(--female);
--p1Item: url();
--p1Moves: url(https://media.discordapp.net/attachments/954402619810512906/1236833504457658368/image.png?ex=66397276&is=663820f6&hm=ba908e9b8cb8ede4a636f319549bf60b98b799fe946304b997f92f8d38fb3040&=&format=webp&quality=lossless&width=812&height=958);

--p2Img: url(https://play.pokemonshowdown.com/sprites/gen5ani/aron.gif);
--p2PrimType:  #D1D1E0;
--p2SecType: #786824;
--p2Gender: var(--male);
--p2Item: url();
--p2Moves: url(https://media.discordapp.net/attachments/954402619810512906/1236833546518401175/image.png?ex=66397280&is=66382100&hm=d63d4beac2dab4bfd3c6b305304e0ac0408b300948eb2495a54a1ece2454268c&=&format=webp&quality=lossless&width=1070&height=762);

--p3Img: url(https://play.pokemonshowdown.com/sprites/gen5ani/piplup.gif);
--p3PrimType: #9DB7F5;
--p3SecType: #445E9C;
--p3Gender: var(--female);
--p3Item: url();
--p3Moves: url(https://media.discordapp.net/attachments/954402619810512906/1236836789038350388/image.png?ex=66397585&is=66382405&hm=639d1458e4ce4228ead52ed31582a2b5633291c3cc7cef9dd10e4d61777db561&=&format=webp&quality=lossless&width=1080&height=876);

--p4Img: url(https://rebekahlang.files.wordpress.com/2015/08/pokemon-egg-gif.gif);
--p4PrimType: #F5AC78;
--p4SecType: #786824;
--p4Gender: var();
--p4Item: url();
--p4Moves: url();

--p5Img: url();
--p5PrimType: ;
--p5SecType: ;
--p5Gender: ;
--p5Item: url();
--p5Moves: url();

--p6Img: url();
--p6PrimType: ;
--p6SecType: ;
--p6Gender: ;
--p6Item: url();
--p6Moves: url();

/* Badge & Pokémon Sizes */
--d: max(6vw, 70px);
--b-d: max(2.5vw, 25px);

/* Gender Images */
--male: url(https://i.imgur.com/4FI7ot0.png);
--female: url(https://i.imgur.com/wpBhCjV.png);]
        [accordion=100% | bcenter]
            {slide=center | [bg=transparent;
            visibility: visible;
            position: relative;
            margin: auto;
            padding: 0px;
            z-index: 2;][font=Protest Riot]
                [div=box-sizing: border-box; border: 1px solid #0000; padding: 5px; border-radius: 15px;

                /* Character Image */
                --char-img: url(https://i.imgur.com/VlsW1a5.png);

                /* Background Image */
                --bg-img: url(https://pokewalls.wordpress.com/wp-content/uploads/2011/04/303mawile1920x12001.jpg);

                /* Ribbon Images */
                --r-1: url();
                --r-2: url();
                --r-3: url();
                --r-4: url();
                --r-5: url();

                /* Badge Images */
                --b-1: url();
                --b-2: url();
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
                background-repeat: no-repeat, no-repeat;
                background-position: bottom left+3em, center;
                background-size: 35%, 100%;

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
                            [div=box-sizing: border-box; grid-area: name;]Eleonor[/div]
                            [div=box-sizing: border-box; grid-area: id;]ID No.[/div]
                            [comment] == Trainer ID No. == [/comment]
                            [div=box-sizing: border-box; grid-area: no;]181830[/div]
                        [/div]
                    [/div]
                    [comment] == Click Icon == [/comment]
                    [div=box-sizing: border-box; font-size: 0.95rem; font-variant: small-caps; display: flex; flex-flow: column nowrap; position: absolute; left: 45%; top: -7.5%; color: #b22222;]Click Me![fa]fa-solid fa-caret-down[/fa][/div]
                    
                    [Comment] == Gym Badges == [/comment]
                    [div=box-sizing: border-box; height: fit-content; width: 100%; display: flex; flex-flow: row nowrap; overflow-x: scroll; padding-top: 25px; position: relative; top: -40%; justify-content: space-evenly; overflow: visible; z-index: 3;]
                        [div=background-image: var(--b-1); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat; box-shadow: 0px 0px 8px #fff;]
                        [/div]
                        [div=background-image: var(--b-2); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 1%; display: flex; background-repeat: no-repeat;]
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
                    [div=box-sizing: border-box; padding: 0px; margin: 0px; background: linear-gradient(45deg, rgba(255 255,255,0.85) 35%, transparent 70%) top; background-repeat: no-repeat; background-size: 100% 1px; height: fit-content; width: 125%; position: relative; top: 2.5em; 
                    display: flex;]
                    Ribbons:
                        [div=box-sizing: border-box; height: fit-content; display: grid; 
                        grid-template-columns: repeat(3, minmax(2vw, 1fr));
                        grid-template-rows: repeat(3, minmax(2vw, 1fr));  
                        grid-auto-flow: dense;
                        grid-template-areas: "r2 . r3"
                        ". r1 ."
                        "r4 . r5";
                        position: relative; 
                        top: 15%; 
                        right: 25%;
                        justify-content: space-between; 
                        width: 75%; 
                        padding-top: 25px;]
                            [div=background-image: var(--r-1); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%;  background-repeat: no-repeat; grid-area: r1;]
                            [/div]
                            [div=background-image: var(--r-2); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r2;]
                            [/div]
                            [div=background-image: var(--r-3); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r3;]
                            [/div]
                            [div=background-image: var(--r-4); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r4;]
                            [/div]
                            [div=background-image: var(--r-5); background-size: 90% 90%; background-position: center; border: 2px solid #bdbdbd; border-radius: 50px; width: var(--b-d); height: var(--b-d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat; grid-area: r5;]
                            [/div]
                        [/div]
                    [/div]
                [/div]
            [/div]
        [/font][/bg]}
        [comment] -- Trainer Card More Details Slides -- [/comment]
        [div=visibility: hidden;
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
                    [div=box-sizing: border-box; background-color: transparent; background-image: url(https://external-preview.redd.it/WqT20f0c5Q2M5Ppe3R9d_3_d6DR3k_E3Qe_TgY4gl4c.jpg?auto=webp&s=ae38f0455611352454d93a769344699369a7fc46); background-size: 60% 100%; background-position: center; background-repeat: no-repeat; width: 100%; height: calc(1.5*var(--d)); display: flex; justify-content: start; align-items: start; color: #000; border: 3px Ridge Brown; border-radius: 15px; background-color: aliceblue; letter-spacing: 1px;][Font=Bree Serif]Party[/Font][/div]
                [/bg]}
        [comment] -- Pokémon Party -- [/comment]
        [div=box-sizing: border-box; background-color: #333437aa; width: clamp(100px, 22.5em, 540px); max-width: 82vw; border-radius: 15px; padding: 10px; visibility: visible; margin-left: 0.75em; background-image: url(https://storage.ko-fi.com/cdn/useruploads/display/fcc54711-4b92-4b0b-b8e7-bde4b1e79a2e_may-waterfall-desk-anim-x4.gif); background-size: 100% 100%; background-position: center;
        display: grid;
        grid-template-rows: repeat(3, minmax(12vw, 1fr));
        grid-template-columns: repeat(2, minmax(5vw, 1fr));
        grid-template-areas: "P1 P2" 
        "P3 P4" 
        "P5 P6";
        align-items: center;
        justify-items: center;
        margin: -35px 0px 0px 0px]
        [comment] -- Pokémon Slot 1 -- height: clamp(55px, 13.25em, 315px); [/comment]
            [div=box-sizing: border-box; background-image: var(--p1Img); background-size 90% 90%; background-color: var(--p1PrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--p1SecType); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); margin: 5%; pointer-events: none; display: flex; grid-area: P1;]
                [comment] -- Pokémon 1 Details -- [/comment]
                [Font=Yeon Sung]
                    [div=box-sizing: border-box; color: var(--p1PrimType); display: grid; grid-template-columns: repeat(5, max(1.5vw, 15px)); grid-template-rows: repeat(5, minmax(1.5vw, 15px)); position: relative; bottom: 27%; right: 5.5%; grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: 2px;]
                    [comment] -- Pokémon 1 Name -- [/comment]
                        [div=background-color: #faebd7; border: 3px Ridge var(--p1SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Cordelia[/div]
                    [comment] -- Pokémon 1 Gender -- [/comment]
                        [div=background-image: var(--p1Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p1SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 1 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p1SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv10
                        [/div]
                    [comment] -- Pokémon 1 Held Item -- [/comment]
                        [div=background-image: var(--p1Item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p1SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [/div]
                [/Font]
            [/div]
        [comment] -- Pokémon Slot 2 -- [/comment]
            [div=box-sizing: border-box; background-image: var(--p2Img); background-size 90% 90%; background-color: var(--p2PrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--p2SecType); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); margin: 5%; pointer-events: none; display: flex; grid-area: P2;]
                [comment] -- Pokémon 2 Details -- [/comment]
                [Font=Yeon Sung]
                    [div=box-sizing: border-box; color: var(--p2PrimType); display: grid; grid-template-columns: repeat(5, max(1.5vw, 15px)); grid-template-rows: repeat(5, minmax(1.5vw, 15px)); position: relative; bottom: 27%; right: 5.5%; grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: 2px;]
                    [comment] -- Pokémon 2 Name -- [/comment]
                        [div=background-color: #faebd7; border: 3px Ridge var(--p2SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Fawfaw[/div]
                    [comment] -- Pokémon 2 Gender -- [/comment]
                        [div=background-image: var(--p2Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p2SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 2 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p2SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv10
                        [/div]
                    [comment] -- Pokémon 2 Held Item -- [/comment]
                        [div=background-image: var(--p2Item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p2SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [/div]
                [/Font]
            [/div]
        [comment] -- Pokémon Slot 3 -- [/comment]
            [div=box-sizing: border-box; background-image: var(--p3Img); background-size: 75% 75%; background-color: var(--p3PrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--p3SecType); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); margin: 5%; pointer-events: none; display: flex; grid-area: P3;]
                [comment] -- Pokémon 3 Details -- [/comment]
                [Font=Yeon Sung]
                    [div=box-sizing: border-box; color: var(--p3PrimType); display: grid; grid-template-columns: repeat(5, max(1.5vw, 15px)); grid-template-rows: repeat(5, minmax(1.5vw, 15px)); position: relative; bottom: 27%; right: 5.5%; grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: 2px;]
                    [comment] -- Pokémon 3 Name -- [/comment]
                        [div=background-color: #faebd7; border: 3px Ridge var(--p3SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]???[/div]
                    [comment] -- Pokémon 3 Gender -- [/comment]
                        [div=background-image: var(--p3Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p3SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 3 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p3SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv5
                        [/div]
                    [comment] -- Pokémon 3 Held Item -- [/comment]
                        [div=background-image: var(--p3Item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p3SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [/div]
                [/Font]
            [/div]
        [comment] -- Pokémon Slot 4 -- [/comment]
            [div=box-sizing: border-box; background-image: var(--p4Img); background-size 90% 90%; background-color: var(--p4PrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--p4SecType); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); margin: 5%; pointer-events: none; display: flex; grid-area: P4;]
                [comment] -- Pokémon 4 Details -- [/comment]
                [Font=Yeon Sung]
                    [div=box-sizing: border-box; color: var(--p4PrimType); display: grid; grid-template-columns: repeat(5, max(1.5vw, 15px)); grid-template-rows: repeat(5, minmax(1.5vw, 15px)); position: relative; bottom: 27%; right: 5.5%; grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: 2px;]
                    [comment] -- Pokémon 4 Name -- [/comment]
                        [div=background-color: #faebd7; border: 3px Ridge var(--p4SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;] -Name- [/div]
                    [comment] -- Pokémon 4 Gender -- [/comment]
                        [div=background-image: var(--p4Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p4SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 4 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p4SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv -
                        [/div]
                    [comment] -- Pokémon 4 Held Item -- [/comment]
                        [div=background-image: var(--p4Item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p4SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [/div]
                [/Font]
            [/div]
        [comment] -- Pokémon Slot 5 -- [/comment]
            [div=box-sizing: border-box; background-image: var(--p5Img); background-size 90% 90%; background-color: var(--p5PrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--p5SecType); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); margin: 5%; pointer-events: none; display: flex; grid-area: P5;]
                [comment] -- Pokémon 5 Details -- [/comment]
                [Font=Yeon Sung]
                    [div=box-sizing: border-box; color: var(--p5PrimType); display: grid; grid-template-columns: repeat(5, max(1.5vw, 15px)); grid-template-rows: repeat(5, minmax(1.5vw, 15px)); position: relative; bottom: 27%; right: 5.5%; grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: 2px;]
                    [comment] -- Pokémon 5 Name -- [/comment]
                        [div=background-color: #faebd7; border: 3px Ridge var(--p5SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;] - Name -[/div]
                    [comment] -- Pokémon 5 Gender -- [/comment]
                        [div=background-image: var(--p5Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p5SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 5 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p5SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv -
                        [/div]
                    [comment] -- Pokémon 5 Held Item -- [/comment]
                        [div=background-image: var(--p5Item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p5SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [/div]
                [/Font]
            [/div]
        [comment] -- Pokémon Slot 6 -- [/comment]
            [div=box-sizing: border-box; background-image: var(--p6Img); background-size 90% 90%; background-color: var(--p6PrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--p6SecType); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); margin: 5%; pointer-events: none; display: flex; grid-area: P6;]
                [comment] -- Pokémon 6 Details -- [/comment]
                [Font=Yeon Sung]
                    [div=box-sizing: border-box; color: var(--p6PrimType); display: grid; grid-template-columns: repeat(5, max(1.5vw, 15px)); grid-template-rows: repeat(5, minmax(1.5vw, 15px)); position: relative; bottom: 27%; right: 5.5%; grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: 2px;]
                    [comment] -- Pokémon 6 Name -- [/comment]
                        [div=background-color: #faebd7; border: 3px Ridge var(--p6SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;] - Name -[/div]
                    [comment] -- Pokémon 6 Gender -- [/comment]
                        [div=background-image: var(--p6Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--6SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 6 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p6SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv -
                        [/div]
                    [comment] -- Pokémon 6 Held Item -- [/comment]
                        [div=background-image: var(--p6Item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p6SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [/div]
                [/Font]
            [/div]
    [/div]
                {/slide}
                [comment] -- Pokémon Moves Slide -- [/comment]
                {slide=center | [bg=transparent;
                visibility: visible;
                position: relative;
                margin: 0;
                padding: 0px;]
                    [div=box-sizing: border-box; background-color: transparent; background-image: url(https://media1.tenor.com/m/TjSoXFfAq-UAAAAC/pokemon-sunmoon.gif); background-size: 65% 100%; background-position: center; background-repeat: no-repeat; width: 100%; height: calc(1.5*var(--d)); display: flex; justify-content: start; align-items: start; color: #fff;][Font=Bree Serif]Moves[/Font][/div]
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
                                [div=background-color: var(--p1PrimType); 
                                background-image: var(--p1Img); 
                                background-size: calc(0.75*var(--d))  calc(0.75*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--p1SecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Cordelia's Moves[/div]
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
                                background-image: var(--p1Moves);
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
                                [div=background-color: var(--p2PrimType); 
                                background-image: var(--p2Img); 
                                background-size: calc(0.65*var(--d))  calc(0.56*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--p2SecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]Fawfaw's Moves[/div]
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
                                background-image: var(--p2Moves);
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
                            [div=background-color: var(--p3PrimType); 
                                background-image: var(--p3Img); 
                                background-size: calc(0.65*var(--d))  calc(0.65*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--p3SecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;]???'s Moves[/div]
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
                                background-image: var(--p3Moves);
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
                                [div=background-color: var(--p4PrimType); 
                                background-image: var(--p4Img); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--p4SecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;] [/div]
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
                                background-image: var(--p4Moves);
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
                                [div=background-color: var(--p5PrimType); 
                                background-image: var(--p5Img); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--p5SecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;] [/div]
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
                                background-image: var(--p5Moves);
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
                                [div=background-color: var(--p6PrimType); 
                                background-image: var(--p6Img); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
                                background-position: center bottom;
                                background-repeat: no-repeat;
                                border: 3px Ridge var(--p6SecType); 
                                width: 65%;
                                height: var(--d);
                                border-radius: 15px;
                                box-sizing: border-box;
                                margin: -30px auto 0px auto; 
                                display: flex; 
                                justify-content: center;
                                overflow: clip;
                                pointer-events: auto;
                                z-index: 4;] [/div]
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
                                background-image: var(--p6Moves);
                                background-size: 100% 100%;
                                background-position: center;]
                                [/div]
                            {/slide}
                        [/accordion]
                    [/div]
                {/slide}
            [/accordion]
        [/div]
    {/slide}
    [/accordion]
[/div]
[div=box-sizing: border-box; margin: 0 2.5%; line-height: 1.75;
text-align: justify;
text-justify: inter-character;
letter-spacing: 0.75px;
word-spacing: 1.25px;
word-wrap: break-word;
white-space: collapse;
hyphens: auto;

/* Dialogue Colors */
--eleonor-c: #71D9E2;]

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
background: var(--morning-sky);
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

color: var(--sun-color);
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
    Tuesday, August 2nd — 10:00 a.m. 
[/div] 
[comment] -- Location -- [/comment]
[div=box-sizing: border-box; position: relative; right: 0.85em; bottom: 6.25em;]
    Sandgem, Sinnoh Region
[/div] 
[comment] -- Interaction | Mention -- [/comment]
    [div=box-sizing: border-box; font-size: clamp(0.15em, 1.5vw, 0.5em); position: relative; right: 4em; bottom: 15.5em;] 
        [user=102895]@Rincewind[/user] | [user=86439]@Ramona Serrano[/user] | [user=90162]Zera[/user] [br][/br] Code by Ami
    [/div] 
[/div]
[/div][/font]
[font=Dosis]
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante, aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat.

Convallis hendrerit semper. Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a, elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur.
[br][/br]
[spoiler=Bag] $2,500 | Pokéball x3
    [hr][/hr]
    [size=3] 
        Sleeping Bag
        Tent
        First-Aid Kit
        Flashlight
        Toiletries
        Metal File Kit 
    [/size] 
[/spoiler]
[/font][/div]