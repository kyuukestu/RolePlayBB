[div=margin: 0 3%;
/* Character Image */
--char-img: url(https://media.discordapp.net/attachments/1199263622401105941/1199654604422524948/95eeba2d-09a0-4a72-8768-30c8e6de73a9_width3D51226height3D768.png);

/* Gender Images */
--male: url(https://media.discordapp.net/attachments/191374162978144257/1200288723233947758/latest.png);
--female: url(https://media.discordapp.net/attachments/191374162978144257/1200288797334700141/R.png);

/* Pokémon Team Data */
--poke-1-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/mawile.gif);
--poke-1-prim-type-color: #D1D1E0;
--poke-1-sec-type-color: #9B6470;

--poke-2-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/aron.gif);
--poke-2-prim-type-color: #D1D1E0;
--poke-2-sec-type-color: #786824;

--poke-3-img: url(https://play.pokemonshowdown.com/sprites/gen5ani/piplup.gif);
--poke-3-prim-type-color: #9DB7F5;
--poke-3-sec-type-color: #445E9C;

--poke-4-img: url(https://rebekahlang.files.wordpress.com/2015/08/pokemon-egg-gif.gif);
--poke-4-prim-type-color: #F5AC78;
--poke-4-sec-type-color: #786824;

--poke-5-img: url();
--poke-5-prim-type-color: ;
--poke-5-sec-type-color: ;

--poke-6-img: url();
--poke-6-prim-type-color: ;
--poke-6-sec-type-color: ;

--d: max(5vw, 60px);


/* Held Items */

--item-1-img: url(https://media.discordapp.net/attachments/191374162978144257/1201230202383106099/MDBag_Sky_Blue_Bow_TDS_Sprite.png);]

    [Font=KoHo]
    [div=display: flex; justify-content: space-evenly; width: 95%; flex-wrap: wrap;]
    [comment]Left[/comment]
        [div=width: clamp(150px, 25%, 250px); height: 250px; display: flex; flex-direction: column; overflow: visible; flex-shrink: 0; position: relative; top: -25px;]
            [div=background-color: #7fffd4; clip-path: polygon(50% 0%, 100% 50%, 50% 100%, 0% 50%); height: 110%; width: 110%; display: flex; align-items: center; justify-content: center; flex-shrink: 0;]
                [div=background-image: url(https://media.discordapp.net/attachments/954402619810512906/1195145577705521222/eepPr615GMbit7IqK7MZw1EhAAAAAElFTkSuQmCC.png), url(https://media.discordapp.net/attachments/191374162978144257/1195217849468342432/watercolor-wild-flowers-background-aquarelle-spring-flowers-illustration-generative-ai_691560-8894.png); background-size: 75% 75%, 100% 100%; background-position: center bottom, center; background-repeat: no-repeat, repeat; background-clip: content-box, border-box; clip-path: polygon(50% 0%, 100% 50%, 50% 100%, 0% 50%); height: 90%; width: 90%; padding: 5px;]
                [/div]
            [/div]
        [/div]
    [comment]Center[/comment]
        [div=display: flex; flex-direction: column; border-bottom: 2px double #7fffd4; letter-spacing: 1px; flex-shrink: 1; width: clamp(200px, 45%, 475px); margin: 0 3%;]
            [nobr]
                [div=font-size: clamp(20px, 3vh, 36px); font-variant: small-caps; font-weight: bold; margin: auto; align-items: center; justify-content: center;] 
                    Tuesday, August 2nd  — 9:42 a.m. 
                [/div][br][/br]
                [div=font-size: clamp(18px, 2vh, 28px); font-variant: small-caps; font-weight: bold; justify-content: flex-end;]
                    [Font=Montserrat Alternates] 
                        Eléonor Evelyn Maëlys-Amelì Françoise Twdyr 
                    [/Font][br][/br]
                    [div=font-size: clamp(12px, 1.5vh, 16px); font-variant: small-caps; font-weight: bold; margin: 0 auto; padding: 5px 0;] 
                        Sandgem Town [br][/br]
                        Sinnoh Region 
                    [/div] 
                    [div=font-size: clamp(12px, 1.5vh, 16px); font-variant: small-caps;]
                        Interactions: N/A [br][/br] 
                        Mentions: [user=102895]@Rincewind[/user] | [user=86439]@Ramona Serrano[/user]
                    [/div]
                [/div]
            [/nobr]
        [/div]
    [comment]Right[/comment]
        [div=display: flex; flex-direction: column; width: clamp(150px, 25%, 175px); flex-shrink: 0; align-items: center; justify-content: center;]
            [div=font-size: clamp(18px, 2vh, 28px); font-variant: small-caps; font-weight: bold; align-self: center; justify-self: center;] 
                Pokémon[br][/br]On-hand 
            [/div] 
            [div=background-color: #333437aa; width: 95%; height: auto; border-radius: 15px; display: flex; flex-wrap: wrap; justify-content: space-evenly; align-items: center; padding: 5px;]
                [comment] -- Pokémon Slot 1 -- [/comment]
                [div=background-image: var(--poke-1-img); background-size: 90% 90%; background-color: var(--poke-1-prim-type-color); background-position: -5px center; border: 2px solid var(--poke-1-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; display: flex; background-repeat: no-repeat;]
                    [comment] -- Pokémon 1 Gender -- [/comment]
                    [div=background-image: var(--female); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); right: 5px;][/div]
                    [comment] -- Pokémon 1 Held Item -- [/comment]
                    [div=background-image: var(--item-1-img); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(0.65*var(--d)); left: calc(0.35*var(--d))][/div]
                [/div]
                [comment] -- Pokémon Slot 2 -- [/comment]
                [div=background-image: var(--poke-2-img); background-size: 70% 70%; background-color: var(--poke-2-prim-type-color); background-position: center; border: 2px solid var(--poke-2-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                    [comment] -- Pokémon 2 Gender -- [/comment]
                    [div=background-image: var(--male); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 0px; right: 5px; background-repeat: no-repeat;][/div]
                    [comment] -- Pokémon 2 Held Item -- [/comment]
                    [div=background-image: var(); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.97*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 3 -- [/comment]
                [div=background-image: var(--poke-3-img); background-size: 75% 75%; background-color: var(--poke-3-prim-type-color); background-position: center; border: 2px solid var(--poke-3-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;]
                    [comment] -- Pokémon 3 Gender -- [/comment]
                    [div=background-image: var(--female); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: 0px; right: 5px;][/div]
                    [comment] -- Pokémon 3 Held Item -- [/comment]
                    [div=background-image: var(); background-size: 85% 85%; background-color: #faebd7; background-position: center; border: 1px solid #000; border-radius: 50px; width: calc(var(--d)/3); height: calc(var(--d)/3); box-sizing: border-box; position: relative; top: calc(-0.97*var(--d)); left: calc(0.65*var(--d));][/div]
                [/div]
                [comment] -- Pokémon Slot 4 -- [/comment]
                [div=background-image: var(--poke-4-img); background-size: 95% 95%; background-color: var(--poke-4-prim-type-color); background-position: center; border: 2px solid var(--poke-4-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;][/div]
                [comment] -- Pokémon Slot 5 -- [/comment]
                [div=background-image: var(--poke-5-img); background-size: 95% 95%; background-color: var(--poke-5-prim-type-color); background-position: center; border: 2px solid var(--poke-5-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;][/div]
                [comment] -- Pokémon Slot 6 -- [/comment]
                [div=background-image: var(--poke-6-img); background-size: 95% 95%; background-color: var(--poke-6-prim-type-color); background-position: center; border: 2px solid var(--poke-6-sec-type-color); border-radius: 50px; width: var(--d); height: var(--d); box-sizing: border-box; margin: 2%; background-repeat: no-repeat;][/div]
            [/div]   
        [/div]
    [/div]




    [spoiler=Bag] $2,500 | Pokéball x3
        [hr][/hr] [size=3] 
            Sleeping Bag
            Tent
            First-Aid Kit
            Flashlight
            Toiletries
            Metal File Kit
        [/size] 
    [/spoiler] 
    [/Font] 
[/div]