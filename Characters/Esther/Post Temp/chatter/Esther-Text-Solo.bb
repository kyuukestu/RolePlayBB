[comment][font=Grenze Gotisch][font=Lexend Deca].[/font][/font][/comment]
[div=box-sizing: border-box;
display: flex; flex-flow: column;
position: relative;
height: min(650px, 110dvh); width: 90%;
margin: 25px auto; padding: 15px 20px;
border-radius: 16px; border: 2px solid var(--spearow-black);
background-color: var(--bg-color);
box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
gap: 10px;
color: var(--main-text-c); font-family: var(--body-font);

/* Fonts Here: Name Font is for the Display Name, body font is everything else */
--name-font: Grenze Gotisch;
--body-font: Lexend Deca;

/* Character */
--char-img: url();
/* Attachment Image - Leave Empty if no attachment */
--attachment-img: url();
--attachment: no-repeat 50% 20%/cover var(--attachment-img);

--main-text-c: var(--spearow-black);
--bg-color: #e0e0e0;

--b-fs: clamp(0.9rem, 1vw + 0.6rem, 1.2rem);
--h-fs: calc(var(--b-fs)*1.75);

--spearow-black: #080808;
--spearow-red: #AB525C;
--spearow-brown: #8D5B48;
--spearow-tan: #F1E1CA;

--spearow: url(https://i.imgur.com/u8451Bj.png);
--spearow-bg: no-repeat 50% 50%/100% var(--spearow); transparent;
--spearow--gradient: linear-gradient(var(--spearow-tan), var(--spearow-red), var(--spearow-brown), var(--spearow-black));

]
[div=/*ANCHOR - ICON + Follow Button*/
position: absolute; right: 10px; top: 10px; height: 15%; display: flex; flex-flow: column; justify-content: space-between; align-items: center;]  
[div=/*ANCHOR - SPEAROW ICON */
background: var(--spearow--gradient); 
mask: no-repeat center/contain var(--spearow); -webkit-mask: no-repeat center/contain var(--spearow); 
height: 100%; aspect-ratio: 1; z-index: 1;][/div]
[div=/*ANCHOR - Follow Button */ 
height: fit-content; width: clamp(70px, 10vw, 160px);  padding: 5px;
display: flex; justify-content: center; align-items: center;
background-color: var(--spearow-red); border-radius: 20px;]Following[/div]
[/div]

[div=/*Anchor - Content Container */
display: flex; flex-flow: column nowrap; height: 100%; justify-content: space-evenly;]

[div=/*ANCHOR - Post Header */
display: flex; flex-flow: row wrap; gap: 2.5px; width: 90%; align-items: center; margin: auto;]
[div=/*ANCHOR - Character PFP/Image  */
background: no-repeat center/contain var(--char-img); border-radius: 50%; width: 120px; aspect-ratio: 1; border: 2px solid var(--spearow-red); padding: 10px;][/div]
[div=/*ANCHOR - Name Section*/ 
display: flex; flex-direction: column; height: 75%; color: var(--spearow-red);]
[div=/*ANCHOR - CHARACTER DISPLAY NAME */
font-weight: bold; font-size: var(--h-fs); font-family: var(--name-font);]
Display Name Here[/div]
[div=/*ANCHOR - CHARACTER HANDLE OR TAG */
font-size: var(--b-fs); filter: brightness(0); opacity: 0.5; padding-left: 5px]@Handle Here[/div][/div]

[/div]
[div=/*ANCHOR - Character Text/Message */
font-size: var(--b-fs); max-height: 120px; width: 85%; margin: auto; overflow-y: scroll; scrollbar-width: thin; scrollbar-color: var(--spearow-red) var(--spearow-black);]
lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? 

[/div][/div]
[div=/*ANCHOR - Attachment Section */
background: var(--attachment); border-radius: 30px; height: min(40dvh, 45%); max-height: 175px; width: 80%; margin: auto; filter: blur(3px);][/div]
[div=/*ANCHOR - Footer */
max-height: 10%; width: 100%; font-size: var(--b-fs); filter: brightness(0); opacity: 0.5; ]
3:00 PM - 15 August (Date & Time)
[/div]
[div=/*ANCHOR - Interaction Icons */
display: flex; flex-flow: column wrap; justify-content: space-evenly; align-items: center;
font-size: var(--h-fs); color: var(--spearow-red); 
height: 31.5px; width: 100%; max-width: 500px;
margin: auto;]
[fa]fa-solid fa-comment-dots[/fa][fa]fa-solid fa-retweet[/fa][fa]fa-solid fa-heart[/fa][fa]fa-solid fa-share[/fa][/div]
[/div]