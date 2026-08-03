[nobr]


    [comment]


      Designed and coded by [USER=20950]@Nano[/USER].



      Please do not remove the credits or claim the code as your own work.



      If you found this code outside of my public workshop, please don't use it.


      I'd greatly appreciate it if you used the version of the code in that thread.



      [font=Exo 2]sans-serif[/font]


    [/comment]


[div=height: 130px; position: absolute; bottom: 10px; width: 100%; max-width: 900px; left: 50%; transform: translateX(-50%); z-index: 5; display: flex;

/*ANCHOR - One */
--OneImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/frosmoth.gif);
--OnePrimType: #81DFF7;
--OneSecType: #B8C26A;
--OneGender: var(--female);
--OneGenC: var(--femaleC);
--OneItem: url(https://archives.bulbagarden.net/media/upload/d/d3/Dream_Lum_Berry_Sprite.png);
--OneBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--OneSize: cover;
/* ANCHOR - Two */
--TwoImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/mamoswine.gif);
--TwoPrimType: #81DFF7;
--TwoSecType: #B88E6F;
--TwoGender: var(--female);
--TwoGenC: var(--femaleC);
--TwoItem: url(https://archives.bulbagarden.net/media/upload/thumb/6/60/Dream_Everstone_Sprite.png/2A00px-Dream_Everstone_Sprite.png);
--TwoBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--TwoSize: cover;
/* ANCHOR - Three */
--ThreeImg: url(https://play.pokemonshowdown.com/sprites/gen5ani/lapras.gif);
--ThreePrimType: #74ACF5;
--ThreeSecType: #81DFF7;
--ThreeGender: var(--female);
--ThreeGenC: var(--femaleC);
--ThreeItem: url(https://archives.bulbagarden.net/media/upload/thumb/6/60/Dream_Everstone_Sprite.png/200px-Dream_Everstone_Sprite.png);
--ThreeBall: url(https://raw.githubusercontent.com/msikma/pokesprite/master/items/ball/poke.png);
--ThreeSize: cover;

--poke-bg-color: transparent;
--poke-flex: 1 1 28%;
--poke-cell-height: 50%;
--poke-cell-width: 33%;
--pokeball-left: 50%;
--pokeball-top: 50%;
--pokeball-position: translate(-50%, -50%) rotate(35deg);
--poke-padding: 5px;
--p-height: 50px;
--p-micro: calc(var(--p-height)/1.1);
--pokéShadow: drop-shadow(5px 0px 2px #353232);
]

[div=/*SECTION - Pokémon Position 1 - One*/
aspect-ratio: 1; height: 100%; box-sizing: border-box; scroll-snap-align: center; line-height: 0;  
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--OnePrimType) 50%, var(--OneSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--OneSize) var(--OneImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--OneGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    filter: grayscale(1);
    background: no-repeat center/85% var(--OneItem) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 2 - Two*/
filter: brightness(0); 
aspect-ratio: 1; height: 100%; box-sizing: border-box; scroll-snap-align: center; line-height: 0;  
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
backdrop-filter: brightness(0);
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--TwoPrimType) 50%, var(--TwoSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--TwoSize) var(--TwoImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--TwoGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--TwoItem) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]
[div=/*SECTION - Pokémon Position 3 - Three*/
filter: brightness(0); 
aspect-ratio: 1; height: 100%; box-sizing: border-box; scroll-snap-align: center; line-height: 0;  
padding: var(--poke-padding); flex: var(--poke-flex); margin: auto; position: relative; scroll-snap-align: center;]
[div=/*ANCHOR - Pokeball */
backdrop-filter: brightness(0);
mask: no-repeat center/100% url(https://i.imgur.com/TGaxYP4.png); background: linear-gradient(0deg, var(--ThreePrimType) 50%, var(--ThreeSecType) 50%); height: 100%; aspect-ratio: 1; position: absolute; top: var(--pokeball-top); left: var(--pokeball-left); transform: var(--pokeball-position);][/div]
[div=
    box-sizing: border-box; background: no-repeat center/var(--ThreeSize) var(--ThreeImg); filter: var(--pokéShadow); text-align: center; height: 100%; aspect-ratio: 1;  margin: auto;
    display: flex; justify-content: space-evenly; flex-flow: column nowrap;]
    [div=/*ANCHOR - Gender */
    mask: no-repeat center/85% var(--ThreeGender); background-color: var(--femaleC); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [div=/*ANCHOR - Held Item */
    background: no-repeat center/85% var(--ThreeItem) var(--poke-bg-color); border-radius: 50%; width: var(--p-micro); aspect-ratio: 1; box-sizing: border-box;][/div]
    [comment]/*!SECTION */[/comment]
[/div][/div]

[/div]


    [div='


    /* <--------------------------------- general accents ---------------------------------> */



    /* colors */


    --maincolor: #B9E7FF;


    --offwhite: #ddd;


    --offblack: #222;



    /* fonts */


    --font01: 'Exo 2', sans-serif;


    --bodytextsize: .9em;



    --bodylineheight: 140%;



    /* <--------------------------------- images ---------------------------------> */



    /* general */


    --mainIMG1: url(https://static.zerochan.net/Kanna.%28Pok%C3%A9mon%29.1024.4055317.webp) center/cover no-repeat;


    --IMGfilter: grayscale(40%) brightness(90%);



    /* svg */


    --star: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' version='1.0' viewBox='0 0 610 610'%3E%3Cpath d='M291.5 2.8c-7.5 2.6-13.8 6.6-18.2 11.6-2.3 2.6-21.4 36.5-46.8 83.1-38.7 71.1-43.3 79-48 83.3-3.8 3.5-24.5 15.2-82.5 46.7-69 37.4-78.1 42.6-83.3 47.7-9.8 9.7-14.2 22.7-11.9 36 2.1 12 8 21.8 16.5 27.7 2.3 1.5 38.6 21.6 80.7 44.7 65.3 35.8 77.2 42.6 81.5 47 4.2 4.2 11.9 17.7 47 82.4 34.3 63 43 78.4 47.3 83.1 12.8 14 32.7 17.3 50.3 8.4 11.4-5.8 11.8-6.5 58.8-92.9 36.7-67.4 44.1-80.3 47.7-83.5 2.5-2.2 37.2-21.7 81.8-46 42.5-23.2 79.1-43.5 81.2-45.2 10.5-8.3 16-21.1 15.2-35.4-.4-7.1-1-9.5-4.1-15.9-2.5-5-5.4-8.9-8.7-11.9-3.6-3.2-27.8-16.9-82.8-46.8-70-38.1-78.2-42.8-83.2-47.8-4.8-4.9-11.1-15.9-47.9-82.6-23.3-42.4-43.8-78.9-45.7-81.1-9.6-11.9-30.3-17.7-44.9-12.6z'/%3E%3C/svg%3E");



    /* <--------------------------------- shell (don't touch) ---------------------------------> */



    margin: 0 auto;


    padding: 100px 0 150px;


    width: 100%;


    min-width: 300px;


    font-size: initial;


    line-height: initial;


    position: relative;


    overflow: hidden;


    background: repeat center/contain url(https://images-ext-1.discordapp.net/external/VQKJdSl40aX6RSRgFpVuxO_dpaf15wngSECwrs_x3A4/https/www.animationsoftware7.com/img/agifs/snow02.gif) var(--offblack);']


      [div=/* set width of and center code */


      margin: 0 auto;


      padding: 0 10px;


      width: calc(100% - 20px);


      max-width: 900px;


      position: relative;


      overflow: hidden;]


        [comment] --- start of flexbox contents --- [/comment]


        [div=/* main flexbox */


        display: flex;


        flex-flow: row wrap;


        width: 100%;


        background: var(--offblack);


        position: relative;


        z-index: 2;


        pointer-events: none;]


          [comment] --- start of left portion of code --- [/comment]


          [div=/* flex LEFT */


          margin-bottom: 20px;


          flex: 2;


          width: 100%;


          max-width: 400px;


          min-width: 300px;


          height: 500px;


          position: relative;]


            [comment] --- start of character images --- [/comment]


            [div=/* character image wrapper */


            margin-top: -10px;


            height: calc(100% + 10px);


            display: flex;


            flex-flow: column nowrap;]


              [comment] --- start of main image --- [/comment]


              [div=/* main IMG */


              flex: 1;


              margin-top: 10px;


              width: calc(100% - 50px);


              background: var(--mainIMG1);


              filter: var(--IMGfilter);


              position: relative;


              pointer-events: auto;]


              [/div]


              [comment] --- end of main image --- [/comment]


            [/div]


            [comment] --- end of character images --- [/comment]


            [comment] --- start of sidebar --- [/comment]


            [div=/* sidebar */


            width: 50px;


            height: 100%;


            position: absolute;


            top: 0;


            right: 0;]


              [div=/* sidebar wrapper */


              display: flex;


              justify-content: center;


              width: 100%;]


                [div=/* line */


                width: 1px;


                height: 100%;


                background: var(--maincolor);


                position: absolute;]


                [/div]


                [comment] --- start of music player --- [/comment]


                [div=/* music player wrapper */


                margin-left: 4px;


                padding-bottom: 15px;


                display: flex;


                justify-content: center;


                background: var(--offblack);


                position: relative;


                z-index: 2;]


                  [div=/* play button and text wrapper */


                  margin-top: 15px;


                  font-family: var(--font01);


                  font-size: var(--bodytextsize);


                  color: var(--maincolor);


                  line-height: 100%;]


                    [div=/* play button */


                    display: inline-block;


                    transform: rotate(90deg);


                    transform-origin: center;]


                      [fa]fas fa-play[/fa]


                    [/div]


                    [div=/* song title */


                    margin-top: 10px;


                    writing-mode: vertical-rl;


                    text-wrap: nowrap;


                    max-height: 200px;


                    overflow: hidden;]


                      Gym Leader – Lorelei


                    [/div]


                  [/div]


                  [comment] --- start of gdrive media file --- [/comment]


                  [div=/* play button wrapper */


                  top: 10px;


                  width: 23px;


                  height: 27px;


                  overflow: hidden;


                  position: absolute;


                  opacity: .001;


                  pointer-events: auto;]


                    [div=/* play button */


                    margin-top: -220px;


                    margin-left: -170px;


                    position: absolute;]


                      [MEDIA=googledrive]1Bs2-zLuLDaQ2i3LKjrMEPoEhsZHkZSdj[/MEDIA]


                    [/div]


                  [/div]


                  [comment] --- end of gdrive media file --- [/comment]


                [/div]


                [comment] --- end of music player --- [/comment]


                [div=/* star padding */


                padding: 15px 0;


                background: var(--offblack);


                position: absolute;


                bottom: 0;]


                  [div=/* star symbol */


                  width: 17px;


                  height: 17px;


                  background: var(--maincolor);


                  mask-image: var(--star);]


                  [/div]


                [/div]


              [/div]


            [/div]


            [comment] --- end of sidebar --- [/comment]


            [comment] --- start of roleplayer tags --- [/comment]


            [div=/* tag wrapper */


            display: flex;


            width: calc(100% - 80px);


            overflow: hidden;


            position: absolute;


            bottom: 10px;


            left: 10px;


            pointer-events: auto;


            font-size: 0;


            letter-spacing: 1px;


            filter: grayscale(.7);


            opacity: .7;]


              [USER=20950]@Nano[/USER] [USER=20950]@Nano[/USER] [USER=20950]@Nano[/USER]


            [/div]


            [comment] --- end of roleplayer tags --- [/comment]


          [/div]


          [comment] --- end of left portion of code --- [/comment]


          [comment] --- start of text box --- [/comment]


          [div=/* flex RIGHT */


          flex: 3;


          width: 100%;


          max-width: 600px;


          min-width: 300px;


          height: 500px;


          pointer-events: auto;


          overflow-y: scroll;


          overflow-x: hidden;


          font-family: var(--font01);


          font-size: var(--bodytextsize);


          line-height: var(--bodylineheight);


          color: var(--offwhite);


          text-align: justify;


          scrollbar-width: none;]


            [div=white-space: pre-line;]Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec maximus nisl non malesuada lobortis. Phasellus scelerisque libero vel justo facilisis vehicula. Morbi auctor eros a odio vestibulum aliquet. Duis dapibus, libero eget facilisis suscipit, elit nibh mattis tortor, sit amet interdum sem ex laoreet nulla. In hac habitasse platea dictumst. Sed ut enim non neque tempus aliquet non eu felis. Morbi leo libero, elementum nec hendrerit vitae, porta sit amet ligula. Sed tellus erat, venenatis ut lacinia sed, ultrices ut dui. Proin malesuada diam et rhoncus convallis.



    [div=display: inline; color: var(--maincolor);]"Suspendisse vitae odio congue, aliquet sapien tempor, tempor diam."[/div] Mauris vestibulum nibh eget dui tempor, in tempor nunc facilisis. Praesent lobortis nec odio ut sagittis. Nunc eros libero, accumsan in consequat a, dignissim id odio. Vestibulum auctor volutpat elit non convallis. Quisque ac sodales neque. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Pellentesque sagittis ante ac cursus tincidunt. Sed eu purus commodo, auctor justo at, consectetur dui. Donec vitae venenatis eros. Nunc interdum imperdiet dui id venenatis. Praesent ut sollicitudin ipsum, ac auctor dolor. In sed urna ac diam tempor pellentesque sed vitae eros. Vestibulum porttitor, urna interdum pellentesque tempor, nulla ante tincidunt nibh, vitae tempus nunc ante eu nulla. Aliquam a enim in orci consequat luctus at mattis massa. Cras et ornare mi.



    Sed pulvinar, libero ac volutpat efficitur, diam risus finibus lorem, sit amet vestibulum felis sem a arcu. Phasellus in condimentum nisl. In dignissim, tortor nec vehicula consequat, nisl est maximus odio, a tincidunt odio nisl id risus. Integer lacus ante, vestibulum sit amet rutrum faucibus, tincidunt nec eros. Ut eleifend, est sed viverra blandit, lectus libero luctus nunc, et finibus erat libero nec purus. Vestibulum aliquam luctus metus. Quisque varius at ipsum et pulvinar. Nunc pellentesque, dolor quis imperdiet suscipit, quam magna semper sem, sit amet ultricies enim massa eget ligula. Mauris aliquam lorem dui. Nam vehicula varius ipsum vitae rhoncus. Maecenas hendrerit orci orci, sit amet aliquam risus facilisis eget. Vivamus non metus blandit nunc luctus condimentum. Phasellus a ultrices enim. Ut cursus in dolor vitae vestibulum.



    Donec porttitor justo non lacus placerat sodales. Nullam fringilla augue hendrerit sagittis malesuada. Curabitur ut tempus dui. Praesent elementum, ligula sit amet faucibus commodo, leo lorem interdum quam, quis rutrum elit lorem vitae ex. Suspendisse at lorem quis ipsum imperdiet ultricies. Vivamus vulputate leo nec urna rutrum lobortis. Nullam suscipit diam turpis, ut tincidunt enim maximus vel. In in risus dapibus, lobortis nibh nec, feugiat tellus. Praesent malesuada ultrices erat. Nam sit amet mattis ligula. Fusce et sapien vel augue commodo sagittis. Proin id efficitur ligula.[/div]


          [/div]


          [comment] --- end of text box --- [/comment]


        [/div]


        [comment] --- end of flexbox contents --- [/comment]


      [/div]


    [/div]


    [/nobr]