[comment]-- Font -->[font=Alata]:z[/font][/comment][border=0;

/* Probably best if you don't change anything I haven't commented next to */

position: relative;
margin: auto;
box-sizing: border-box;
height: 84px;
padding: 0;

/* Increase width for longer titles/subtitles, decrease for shorter */
max-width: 460px;

/* Colours */
--c-0: #F2B3CA;
--c-1: rgba(220, 70, 240);
--c-2: rgba(100, 70, 230);
--c-3: rgba(160, 70, 240);
--c-t: white; /* Text + Icon colour */

/* Left Text Variables */
--l-f-s: clamp(11px, 2.8vw, 1.1em); /* Font size, increase by increments of .1 */
--l-f: 'Alata', sans-serif; /* Font family, change font tag above if you change this */

/* Right Text Variables */
--r-f-s: clamp(11px, 2.8vw, 1.1em); /* Font size, increase by increments of .1 */
--r-f: 'Alata', sans-serif;/* Font family, change font tag above if you change this */

display: flex;
flex-flow: row nowrap;
justify-content: center;
align-items: center;
overflow-y: hidden;
overflow-x: auto;][comment]

-- Diamond --[/comment][border=0;
--w: 84px;
position: absolute;
top: 0;
left: calc(50% - (var(--w) / 2));
width: var(--w);
height: var(--w);
padding: 0;
background: radial-gradient(var(--c-0) -30%, var(--c-1) 40%);
clip-path: polygon(50% 0%, 100% 50%, 50% 100%, 0% 50%);
pointer-events: none;
z-index: 2;

display: flex;
flex-flow: row nowrap;
justify-content: center;
align-items: center;][border=0;
position: relative;
left: 4px;
padding: 0;
color: var(--c-t);
font-size: 26px;][fa]far fa-play[/fa][/border][/border][comment]

-- Left Text --[/comment][border=0;
--h: 38px;
--gap: 32px;
box-sizing: border-box;
position: absolute;
top: calc(50% - (var(--h) / 2));
left: 0;
width: calc(50% - var(--gap));
height: var(--h);
padding: 10px calc((var(--h) / 2) + 10px);
background: linear-gradient(to right, var(--c-2) 40%, var(--c-3));
clip-path: polygon(100% 0%, calc(100% - (var(--h) / 2)) 50%, 100% 100%, calc((var(--h) / 2) + 10px) 100%, 0% 50%, calc((var(--h) / 2) + 10px) 0%);
z-index: 1;

display: flex;
flex-flow: row nowrap;
justify-content: flex-end;
align-items: center;][border=0;
padding: 0;
color: var(--c-t);
font-size: var(--l-f-s);
font-family: var(--l-f);] Rise [/border][/border][comment]

-- Right Text --[/comment][border=0;
--h: 38px;
--gap: 32px;
box-sizing: border-box;
position: absolute;
top: calc(50% - (var(--h) / 2));
left: calc(50% + var(--gap));
width: calc(50% - var(--gap));
height: var(--h);
padding: 10px calc((var(--h) / 2) + 10px);
background: linear-gradient(to left, var(--c-2) 40%, var(--c-3));
clip-path: polygon(calc(100% - (var(--h) / 2) - 10px) 0%, 100% 50%, calc(100% - (var(--h) / 2) - 10px) 100%, 0% 100%, calc((var(--h) / 2)) 50%, 0% 0%);
z-index: 1;

display: flex;
flex-flow: row nowrap;
justify-content: flex-start;
align-items: center;][border=0;
padding: 0;
color: var(--c-t);
font-size: var(--r-f-s);
font-family: var(--r-f);
text-overflow: ellipsis;]Riot [/border][/border][comment]

-- Music Player Container --[/comment][border=0;
flex: 0 0 43px;
height: 44px;
padding: 0;
overflow: hidden;
transform: scale(2);
opacity: 0;
z-index: 1;][border=0;
position: relative;
top: -11px;
left: -8px;
width: 62px;
height: 54px;
padding: 0;
overflow: hidden;][comment]

-- SoundCloud Media Element --[/comment][MEDIA=soundcloud]leagueoflegends/rise-ft-the-glitch-mob-mako-1#track_id=516009933[/MEDIA][/border][/border][/border]
Code by Ami