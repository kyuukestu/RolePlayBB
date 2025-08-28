[div=/*SECTION - Main Container */
margin: auto; padding: 0px; display: flex; flex-flow: column nowrap;
height: var(--main-height); aspect-ratio: var(--main-ratio); background: var(--rotomPhone);

/*ANCHOR - Main Dimensions */
--main-height: clamp(300px, 100%, 1000px);
--main-ratio: 16/9;
--major-header: calc(var(--fs-major-header) + 10px);
--h-basis: calc(95% - var(--major-header));

/*ANCHOR - Font Sizes */
--fs-major-header: calc(var(--fs-body)*1.5);
--fs-minor-header: calc(var(--fs-body)*1.25);
--fs-body: clamp(10px, calc((1rem * 0.625) + 0.25em), 22px);

/*ANCHOR - Font Colors */
--Title-c: #fff;
--body-c: #000;

/*ANCHOR - Font Families */
--title-font: Krona One;
--body-font: Geologica;

/*ANCHOR – Backgrounds */
--rotomPhone: no-repeat 100% 67%/100% url(https://i.imgur.com/SHWdlSF.png) transparent;
--screenBlue: radial-gradient(farthest-corner circle at -2% 50.9%, rgba(0,0,0,0) 9%, #6DD6FC 10%);
--blue: #6DD6FC;]
[div=/*SECTION - Screen Frame */
width: 80.9%; height: 74.9%; margin: auto; display: flex; overflow: clip;
position: relative; top: 13px; left: -13px; border-radius: 50px 50px; background: transparent;]
[div=/*SECTION - Content Container */
height: 100%; width: 100%; background: var(--screenBlue);]
[div=/*SECTION - Text Container */ height: 100%; width: 95%; margin: auto; color: var(--body-c); 
overflow-y: scroll; scroll-behavior: smooth; scrollbar-width: none; scroll-snap-type: y mandatory;
display: flex; flex-flow: column nowrap; align-items: center;]


[div=/*ANCHOR - Title Container */ font-family: var(--title-font); font-size: var(--fs-major-header); 
height: var(--major-header); width: 85%; margin: 5px auto; letter-spacing: 1px;
display: flex; align-items: center; justify-content: center; background: var(--blue); color: var(--title-c);]
    Title
[/div]
[div=/*ANCHOR - SECTION 1 */ height: var(--h-basis); width: 85%; background: green; scroll-snap-align: center;
flex: 1 0 var(--h-basis); display: flex; flex-flow: column nowrap;]


[/div]



[comment]/*!SECTION - Text Container */[/comment][/div][comment]/*!SECTION - Content Container */[/comment][/div]
[comment]/*!SECTION - Screen Frame */[/comment][/div]
[comment]/*!SECTION - Main Container */[/comment][/div]