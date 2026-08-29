[comment][font=Orbitron][font=Poppins][font=Varela Round][font=Pixelify Sans].[/font][/font][/font][/font][/comment]
[div=box-sizing: border-box; width: 90%; max-width: 900px; margin: auto; border: 2px inset #333;

--bg-color: #1a1a1a;
--text-color: #dee;
--accent-color: #f05656;
--esther-color: #B4320E;]
[div=
/*SECTION -  HEADER */
box-sizing: border-box; display: flex; flex-flow: row wrap;
overflow: hidden;
border-bottom: 5px solid var(--accent-color);]

[div=
/*SECTION - CHARACTER */
flex: 1; position: relative; border-right: 2px solid #444; align-self: end;
background: var(--current-esther), var(--current-bg); min-height: 350px; min-width: 350px; height: 350px;

--current-esther: var(--esther-img);
--current-bg: no-repeat center/cover url(https://i.imgur.com/3HMLIY0.png);

--esther-img: var(--standard);

/* Esther Images */
--standard: no-repeat 50% -670%/67% url(https://i.imgur.com/sfJFjPn.png);
]
[div= /* ANCHOR - NAME */
position: absolute; top: 20px; left: 20px; 
background-color: rgba(0,0,0,0.7); 
color: var(--text-color);
padding: 10px 20px; 
border-left: 4px solid var(--accent-color); 
font-family: Orbitron; font-size: 1.2rem; letter-space: 2px; ]Esther Rosana Sophys[/div]
[comment]/*!SECTION - CHARACTER END */ [/comment] [/div]

[div= /*SECTION - LOCATION */
flex: 1.2; min-height: 350px; min-width: 350px;
background: var(--current-location);
position: relative;
aspect-ratio: auto;

--current-location: var(--alola-beach);

--cemetery: no-repeat center/cover url(https://s1.zerochan.net/Pikachu.600.889288.jpg); --cemetery-ratio: 2/1;
--mortar: no-repeat center/cover url(https://www.serebii.net/pokearth/maps/johto-hgss/35.png);

--olivine: no-repeat center/cover url(https://i.pinimg.com/736x/ec/88/97/ec8897c42f35d7c14d98bc85b38f3cb0.jpg); --olivine-ratio: 57/87;
--alola-beach: no-repeat center/cover url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5r000Uhjh0xBOPbqnJomMAMldHrY6QOjx4ISj_zDTU6sZvpFmeD3oi1KX&s=10);

--violet: no-repeat center/cover url(https://i.pinimg.com/736x/10/ab/cd/10abcdd6738695fdf65ce9add30787eb.jpg); --violet-ratio: 57/87;

--blackthorne: no-repeat center/cover url(https://i.pinimg.com/736x/f6/b4/48/f6b44833ee8b1279eecfa39a15c9621b.jpg); --blckthrn-rt: 57/86;
/* ANCHOR - CREDITS
https://www.instagram.com/pinkporipori/ - pinkporipori | olivine, violet, blackthorne
https://www.instagram.com/clockbirds/ - Clockbirds  | cemetery, Alola Beach
*/
] 
[div= /*SECTION - LOCATION TEXT - Maybe Backdrop on this */ 
box-sizing: border-box; position: relative;
height: 100%; width: 100%; 
display: flex; flex-flow: column nowrap; justify-content: flex-end; align-items: end;
padding: 30px 20px;
background: linear-gradient(to right, rgba(26, 26, 26, 0.8), transparent);]
[div= /*ANCHOR -  LOCATION ART CREDIT */
max-width: 67%; position: absolute; top: 0;
font-family: Poppins;
font-weight: bold;
font-size: 1.8rem;
line-height: 1;
color: var(--accent-color);] Credit: [URL=https://www.instagram.com/clockbirds/]Clockbirds[/URL]  [/div]
[div= /*ANCHOR -  LOCATION TITLE */
max-width: 67%;
font-family: Poppins;
font-weight: bold;
font-size: 1.8rem;
line-height: 1;
color: var(--accent-color);] Docks, Headhea City[/div]
[div= /*ANCHOR - REGION TITLE */
font-family: Poppins;
font-size: 1.2rem;
line-height: 1;
opacity: 0.8;] Akala Island, Alola Region [/div]
[div= /*ANCHOR - DATE */
margin-top: 10px;
font-family: Orbitron;
font-size: 0.9rem;
color: rgba(var(--text-color), 0.8);] [div=animation: fa-fade 3.5s ease-in-out infinite; display: inline; padding: 0 5px;] 10:05 [/div] A.M. // SUN, AUG 21st [/div]

[comment]/*!SECTION - LOCATION TEXT END */ [/comment] [/div]
[comment]/*!SECTION - LOCATION END */[/comment] [/div]

[comment]/*!SECTION - HEADER END */ [/comment] [/div]
[div= /*SECTION - POKEMON BAR */
padding: 15px;
display: flex; justify-content: space-between; gap: 15px;
border-bottom: 2px solid #333;
overflow-x: auto;

--slot-size: 100px;
--slot-border: 4px solid var(--accent-color);
--slot-radius: 4px;
--poke-name-size: 1.6rem;
--name-offset: -72px;
/* Emotions 
- Angry
- Crying
- Determined
- Dizzy
- Happy
- Inspired
- Joyous
- Normal
- Pain 
- Sad 
- Shouting
- Sigh
- Stunned
- Surprised
- Teary-Eyed
- Worried
*/

--Pyr: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0782/Normal.png);
--PyrState: block;

--Hal: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0228/Normal.png);
--HalState: block;

--Cie: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0761/Normal.png);
--CieState: block;

--Kas: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0263/0001/Normal.png);
--KasState: block;

--Nava: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0704/Normal.png);
--NavaState: block;

--Susu: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0283/Normal.png);
--SusuState: block;

--Bam: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0422/0000/0001/Normal.png);
--BamState: block;

--Ist: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0349/0000/0001/Normal.png);
--IstState: block;

--Pari: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0517/Normal.png);
--PariState: block;

--JeCr: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0425/Normal.png);
--JeCrState: block;


--Plum: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0043/Normal.png);
--PlumState: block;

--Arak: no-repeat center center/cover url(https://raw.githubusercontent.com/PMDCollab/SpriteCollab/master/portrait/0167/Normal.png);
--ArakState: block;
]
[div= /* ANCHOR - Pyrrha SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Pyr); display: var(--PyrState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Pyrrha
[/div]
[/div]
[div= /* ANCHOR - Halay SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Hal); display: var(--HalState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Halay
[/div]
[/div]
[div= /* ANCHOR - Ciera SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Cie); display: var(--CieState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Çiera
[/div]
[/div]
[div= /* ANCHOR - Pari SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Pari); display: var(--PariState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Pari
[/div]
[/div]
[div= /* ANCHOR - Kasriel SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Kas); display: var(--KasState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Kas
[/div]
[/div]
[div= /* ANCHOR - Nava SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Nava); display: var(--NavaState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Nava
[/div]
[/div]
[div= /* ANCHOR - Susu SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Susu); display: var(--SusuState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Susu
[/div]
[/div]
[div= /* ANCHOR - Bambi SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Bam); display: var(--BamState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Bambi
[/div]
[/div]
[div= /* ANCHOR - Istha SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Ist); display: var(--IstState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Istha
[/div]
[/div]
[div= /* ANCHOR - JeCroix SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--JeCr); display: var(--JeCrState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
JeCroix
[/div]
[/div]
[div= /* ANCHOR - Plum SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Plum); display: var(--PlumState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Plum
[/div]
[/div]
[div= /* ANCHOR - Arantella SLOT */
flex: 0 0 var(--slot-size); height: var(--slot-size);
background: var(--Arak); display: var(--ArakState);
border: var(--slot-border); border-radius: var(--slot-radius);
position: relative;][div= /* ANCHOR - PokeName */ 
position: absolute; left: var(--name-offset); writing-mode: sideways-lr;
font-family: Pixelify Sans; font-size: var(--poke-name-size);
top: 50%; transform: translateY(-50%);]
Arantella
[/div]
[/div]
[comment]/*!SECTION - POKEMON BAR END */[/comment][/div]
[div=/*SECTION - CONTENT  */
padding: 30px; margin: auto; max-height: 850px; 
overflow-y: scroll; scrollbar-width: thin; scrollbar-color: var(--accent-color), transparent;
background: var(--bg-color); color: var(--text-color);
line-height: 1.8; font-size: 1.3rem; font-family: "Varela Round";]
Lorem ipsum dolor sit amet,
consectetur adipiscing elit. Nullam et odio a ante pellentesque pretium. Integer
venenatis ex non ipsum malesuada euismod sit amet ut ante. Duis posuere diam sit
amet orci viverra condimentum. Nulla non lobortis orci. Vestibulum erat ante,
aliquam eget arcu id, iaculis convallis lorem. Pellentesque rutrum dolor ut
sapien tincidunt iaculis. Suspendisse a leo consectetur, vulputate sem quis,
laoreet lorem. Sed in eros quis odio convallis tempor. Etiam lectus felis,
sollicitudin at auctor a, elementum non erat. Convallis hendrerit semper.
Suspendisse a leo consectetur, vulputate sem quis, laoreet lorem. Sed in eros
quis odio convallis tempor. Etiam lectus felis, sollicitudin at auctor a,
elementum non erat. Etiam molestie enim rutrum, iaculis est eu, tincidunt dolor.
Phasellus ullamcorper risus ac libero ornare, ut tincidunt nisi efficitur. Etiam
molestie enim rutrum, iaculis est eu, tincidunt dolor. Phasellus ullamcorper
risus ac libero ornare, ut tincidunt nisi efficitur. Etiam molestie enim rutrum,
iaculis est eu, tincidunt dolor. Phasellus ullamcorper risus ac libero ornare,
ut tincidunt nisi efficitur.
[comment]/*!SECTION - CONTENT END*/[/comment][/div]
[div= /*SECTION - FOOTER */
background: var(--bg-color); padding: 20px 40px;
border-top: 1px solid #333; 
display: flex; justify-content: space-between; align-items: center;]
[div=/* ANCHOR - NOTE */
font-size: 0.8rem; color: var(--accent-color); font-family: Orbitron;]NOTES // None... [/div]
[div=/* ANCHOR - TAGS */
font-size: 0.8rem; font-family: Poppins; color: var(--text-color)]TAGS // None... [/div]
[comment]/*!SECTION - FOOTER END*/[/comment][/div]
[/div]
