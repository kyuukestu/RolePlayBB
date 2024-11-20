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

/* Jangmo-o */
--p1Img: url(https://www.smogon.com/forums/attachments/782-gif.369411/);
--p1PrimType: #A27EFA;
--p1SecType: #7D58D6;
--p1Gender: var(--female);
--p1Item: url();
--p1Moves: url(https://media.discordapp.net/attachments/191374162978144257/1232499692860997712/image.png?ex=6629ae49&is=66285cc9&hm=3f039f1d8be85d396eb58be5101be51986f3082a5b67f16529307e25180ba404&=&format=webp&quality=lossless&width=964&height=544);

/* Houndour */
--p2Img: url(https://play.pokemonshowdown.com/sprites/gen5ani/houndour.gif);
--p2PrimType: #A29288;
--p2SecType: #9C531F;
--p2Gender: var(--female);
--p2Item: url();
--p2Moves: url(https://media.discordapp.net/attachments/191374162978144257/1232586408544305163/image.png?ex=6629ff0c&is=6628ad8c&hm=e02068fed8e3db51e7d835c01337a47fb9fb7a0b467de4e18364c12d0e8eca9f&=&format=webp&quality=lossless&width=1088&height=872);

/* Munna */
--p3Img: url(https://play.pokemonshowdown.com/sprites/gen5ani/munna.gif);
--p3PrimType: #FA92B2;
--p3SecType: #A13959;
--p3Gender: var(--female);
--p3Item: url();
--p3Moves: url(https://media.discordapp.net/attachments/191374162978144257/1232586932320604231/image.png?ex=6629ff89&is=6628ae09&hm=6c1617f28ff5ec6ae5ebbc1b88fea123a8e5aba89613af881023069c41e6db05&=&format=webp&quality=lossless&width=1078&height=662);

/* Bounsweet */
--p4Img: url(https://www.smogon.com/forums/attachments/761-gif.274544/);
--p4PrimType: #A7DB8D;
--p4SecType: #57913A;
--p4Gender: var(--female);
--p4Item: url();
--p4Moves: url(https://media.discordapp.net/attachments/191374162978144257/1232586535984169032/image.png?ex=6629ff2a&is=6628adaa&hm=ee976dc93cbfcdfc812ac30786c313857808835cc16a2c60c342fe76d8b26c0b&=&format=webp&quality=lossless&width=876&height=362);

/* Surskit */
--p5Img: url(https://play.pokemonshowdown.com/sprites/gen5ani/surskit.gif);
--p5PrimType: #C6D16E;
--p5SecType: #506899;
--p5Gender: var(--female);
--p5Item: url();
--p5Moves: url(https://media.discordapp.net/attachments/191374162978144257/1232587126898425856/image.png?ex=6629ffb7&is=6628ae37&hm=b17fac1a79beca39a9fedb863d55ec962fa17e08667bc80c226e7d9e157c81d7&=&format=webp&quality=lossless&width=1064&height=482);

/* Zigzagoon 
--p6Img: url(https://www.smogon.com/forums/attachments/263_2-gif.284206/);
--p6PrimType: #A29288;
--p6SecType: #6D6D4E;
--p6Gender: var(--male);
--p6Item: url();
--p6Moves: url(https://media.discordapp.net/attachments/191374162978144257/1232586725646139392/image.png?ex=6629ff57&is=6628add7&hm=d508a5ff1571c1e56377e37cb7c390031282e3d53e16df5480fcf22ea537ef5e&=&format=webp&quality=lossless&width=1018&height=512); */

/* Feebas */
--p6Img: url(https://play.pokemonshowdown.com/sprites/gen5ani-shiny/feebas.gif);
--p6PrimType: #9DB7F5;
--p6SecType: #4A66AB;
--p6Gender: var(--female);
--p6Item: url();
--p6Moves: url(https://media.discordapp.net/attachments/1238614423762108517/1238614466619510866/clip_image001.png?ex=663fed1d&is=663e9b9d&hm=1eaf0e9ce63055aa5b471cdbd5c5b0e6dca38f7ffe1171e825bd83f7b0ae8142&=&format=webp&quality=lossless&width=1114&height=226);

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
                    [div=box-sizing: border-box; font-size: 0.95rem; font-variant: small-caps; display: flex; flex-flow: column nowrap; position: absolute; left: 45%; top: -7.5%; color: #b22222;]Click Me![fa]fa-solid fa-caret-down[/fa][/div]
                    
                    [Comment] == Gym Badges == [/comment]
                    [div=box-sizing: border-box; height: fit-content; width: 100%; display: flex; flex-flow: row nowrap; overflow-x: scroll; padding-top: 25px; position: relative; top: -40%; justify-content: space-evenly; overflow: visible; z-index: 3;]
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
                    [div=box-sizing: border-box; display: flex; flex-direction: row; border: 4px solid transparent; border-image: var(--b-i); border-radius: 15px; display: flex; justify-content: space-evenly; align-items: center; color: #fff; letter-spacing: 1px; min-width: var(--d); padding: 5px;
                    min-width: -moz-fit-content; min-width: fit-content; width: 85%; height: 100%;
                    margin: 0 auto; background-color: #202020;] 
                        [div=background-image: var(--pokeball); background-size: 100% 100%; background-repeat: no-repeat; height: 45px; aspect-ratio: 1/1;][/div]
                        [fa]fa-solid fa-music[/fa] 
                        [div=width: 65%; font-size: clamp(8px, 1.75vw, 12px); display: flex; justify-content: center; align-content: center;]
                            [Font=Bree Serif]~ Cabaletta Coterie ~[/Font] 
                        [/div] 
                        [fa]fa-solid fa-music[/fa]
                        [div=background-image: var(--pokeball); background-size: 100% 100%; background-repeat: no-repeat; height: 45px; aspect-ratio: 1/1;][/div]
                    [/div]
                [/bg]}
        [comment] -- Pokémon Party -- [/comment]
        [div=box-sizing: border-box; background-color: #333437aa; width: clamp(100px, 22.5em, 540px); max-width: 82vw; border-radius: 15px; padding: 10px; visibility: visible; margin-left: 0.75em; background-image: url(https://i.redd.it/nlhc5edcttqb1.gif); background-size: 100% 100%; background-position: center;
        display: grid;
        grid-template-rows: repeat(3, minmax(12vw, 1fr));
        grid-template-columns: repeat(2, minmax(5vw, 1fr));
        grid-template-areas: "P1 P2" 
        "P3 P4" 
        "P5 P6";
        align-items: center;
        justify-items: center;
        margin: -35px 0px 0px 0px;]
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
                        [div=background-color: #faebd7; border: 3px Ridge var(--p1SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Pyrrha[/div]
                    [comment] -- Pokémon 1 Gender -- [/comment]
                        [div=background-image: var(--p1Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p1SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 1 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p1SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv25
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
                        [div=background-color: #faebd7; border: 3px Ridge var(--p2SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Halay-Alae[/div]
                    [comment] -- Pokémon 2 Gender -- [/comment]
                        [div=background-image: var(--p2Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p2SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 2 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p2SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv22
                        [/div]
                    [comment] -- Pokémon 2 Held Item -- [/comment]
                        [div=background-image: var(--p2Item); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p2SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: item;][/div]
                    [/div]
                [/Font]
            [/div]
        [comment] -- Pokémon Slot 3 -- [/comment]
            [div=box-sizing: border-box; background-image: var(--p3Img); background-size 90% 90%; background-color: var(--p3PrimType); background-position: center; background-repeat: no-repeat; border: 2px solid var(--p3SecType); border-radius: 50px; width: calc(1.25*var(--d)); height: calc(1.25*var(--d)); margin: 5%; pointer-events: none; display: flex; grid-area: P3;]
                [comment] -- Pokémon 3 Details -- [/comment]
                [Font=Yeon Sung]
                    [div=box-sizing: border-box; color: var(--p3PrimType); display: grid; grid-template-columns: repeat(5, max(1.5vw, 15px)); grid-template-rows: repeat(5, minmax(1.5vw, 15px)); position: relative; bottom: 27%; right: 5.5%; grid-template-areas: "name name name name name"
                    ". . . . ."
                    ". . . . ."
                    "gender . . . item"
                    ". . level . .";
                    gap: 2px;]
                    [comment] -- Pokémon 3 Name -- [/comment]
                        [div=background-color: #faebd7; border: 3px Ridge var(--p3SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Pari[/div]
                    [comment] -- Pokémon 3 Gender -- [/comment]
                        [div=background-image: var(--p3Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p3SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 3 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p3SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv10
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
                        [div=background-color: #faebd7; border: 3px Ridge var(--p4SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Maçiera[/div]
                    [comment] -- Pokémon 4 Gender -- [/comment]
                        [div=background-image: var(--p4Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p4SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 4 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p4SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv20
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
                        [div=background-color: #faebd7; border: 3px Ridge var(--p5SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]L' Basseau[/div]
                    [comment] -- Pokémon 5 Gender -- [/comment]
                        [div=background-image: var(--p5Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--p5SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 5 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p5SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv18
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
                        [div=background-color: #faebd7; border: 3px Ridge var(--p6SecType); border-radius: 7.5px; width: calc(1.2*var(--d)); height: calc(var(--d)/3.6); box-sizing: border-box; text-align: center; justify-self: center; font-size: 12px; grid-area: name; z-index: 1;]Īstha Hâq-Ra[/div]
                    [comment] -- Pokémon 6 Gender -- [/comment]
                        [div=background-image: var(--p6Gender); background-size: 85% 85%; background-color: #faebd7; background-position: center; background-repeat: no-repeat; border: 3px Ridge var(--6SecType); border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; justify-self: center; grid-area: gender;][/div]
                    [comment] -- Pokémon 6 Level -- [/comment]
                        [div=font-size: 8px; font-weight: bold; background-color: #faebd7; background-position: center; border: 3px Ridge var(--p6SecType); border-radius: 45px; width: calc(var(--d)/2.75); height: calc(var(--d)/2.75); justify-self: center; padding: 3px; grid-area: level; display: grid; justify-content: center; align-items: center;]
                            Lv5
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
                    [div=box-sizing: border-box; display: flex; flex-direction: row; border: 4px solid transparent; border-image: var(--b-i); border-radius: 15px; display: flex; justify-content: space-evenly; align-items: center; color: #fff; letter-spacing: 1px; min-width: var(--d); padding: 5px;
                    min-width: -moz-fit-content; min-width: fit-content; width: 85%; height: 100%;
                    margin: 0 auto; background-color: #202020;] 
                        [div=background-image: var(--pokeball); background-size: 100% 100%; background-repeat: no-repeat; height: 45px; aspect-ratio: 1/1;][/div]
                        [fa]fa-solid fa-compact-disc[/fa] 
                        [div=width: 65%; font-size: clamp(8px, 1.75vw, 12px); display: flex; justify-content: center; align-content: center;]
                            [Font=Bree Serif]~ Coterie's Moves ~[/Font] 
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
                                [div=background-color: var(--p1PrimType); 
                                background-image: var(--p1Img); 
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
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
                                z-index: 4;]Pyrrha's Moves[/div]
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
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
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
                                background-size: calc(0.8*var(--d))  calc(0.8*var(--d)); 
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
--esther-c: #b22222;]

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
    Friday, July 25th — 10:30 a.m. 
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