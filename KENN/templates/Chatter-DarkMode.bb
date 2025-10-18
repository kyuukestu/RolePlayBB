[comment][font=Grenze Gotisch][font=Lexend Deca].[/font][/font][/comment]
[div=box-sizing: border-box;
display: flex; flex-flow: column;
position: relative;
height: min(650px, 110dvh); width: 90%;
margin: 25px auto; padding: 15px 20px;
border-radius: 16px; border: 2px solid var(--spearow-black);
background-color: var(--bg-color);
box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
gap: 10px; line-height: 0;
color: var(--main-text-c); font-family: var(--body-font);

/* Fonts Here: Name Font is for the Display Name, body font is everything else */
--name-font: Grenze Gotisch;
--body-font: Lexend Deca;

/* Character Image Here */
--char-img: url();

/* Attachment Present? 
If YES, change to flex. 
If NO, change to none */
--AttachmentPresent: none;

/* Attachment Image -- Ensure to check the AttachmentPresent variable right above, if that's set to none then the attachment won't render */
--attachment-img: url(https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Airborne_imagery_Mt._Fuji_and_Tokyo_%284277464103%29.jpg/960px-Airborne_imagery_Mt._Fuji_and_Tokyo_%284277464103%29.jpg?20121231052055);

--attachment: no-repeat 50% 20%/cover var(--attachment-img) var(--bg-color);

--main-text-c: var(--spearow-tan);
--bg-color: var(--spearow-black);

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
position: absolute; right: 10px; top: 10px; height: 15%; display: flex; flex-flow: column; justify-content: space-between; align-items: center; line-height: 1;]  
[div=/*ANCHOR - SPEAROW ICON */
background: var(--spearow--gradient); 
mask: no-repeat center/contain var(--spearow); -webkit-mask: no-repeat center/contain var(--spearow); 
height: 100%; aspect-ratio: 1; z-index: 1;][/div]
[div=/*ANCHOR - Follow Button */ 
height: fit-content; width: clamp(70px, 10vw, 160px);  padding: 5px;
display: flex; justify-content: center; align-items: center;
background-color: var(--spearow-red); border-radius: 20px;]Following[/div]
[/div]

[div=/*ANCHOR - Content Container */ 
display: flex; flex-flow: column nowrap; height: 75%; justify-content: space-evenly; line-height: 1;]

[div=/*ANCHOR - Post Header */
display: flex; flex-flow: row wrap; gap: 2.5px; width: 90%; align-items: center; margin: auto;]
[div=/*ANCHOR - Character PFP/Image  */
background: no-repeat center/contain var(--char-img); border-radius: 50%; width: 120px; aspect-ratio: 1; border: 2px solid var(--spearow-red); padding: 10px;][/div]
[div=/*ANCHOR - Name Section*/ 
display: flex; flex-direction: column; height: 75%; color: var(--spearow-red);]
[div=/*ANCHOR - CHARACTER DISPLAY NAME */
font-weight: bold; font-size: var(--h-fs); font-family: var(--name-font);]Display Name here[/div]
[div=/*ANCHOR - CHARACTER HANDLE OR TAG */
font-size: var(--b-fs); filter: brightness(0.8); opacity: 0.8; padding-left: 5px]@Handle here[/div][/div]

[/div]
[div=/*ANCHOR - Character Text/Message */ 
position: relative;
font-size: var(--b-fs); height: 100%; max-height: min(65dvh, 300px); width: 85%; margin: 10px auto; overflow-y: scroll; scrollbar-width: thin; scrollbar-color: var(--spearow-red) var(--spearow-black); padding: 10px;]
lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? 
lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, quae? 
END of TEXT

[div=/*ANCHOR - Text Padding */
background: var(--bg-color); height: min(40dvh, 45%); min-height: 0px; max-height: 175px; width: 100%; margin: auto; ][/div]
[/div]
[/div]

[div=/*ANCHOR - Footer */
position: relative;
max-height: 10%; width: 100%; font-size: var(--b-fs);]
[div=filter: brightness(0.8); opacity: 0.8;]3:00 PM - 15 August (Date & time)[/div]
[div=/*ANCHOR - Attachment Section */
display: var(--AttachmentPresent);
position: absolute; z-index: 2; top: -180px; width: 100%; height: clamp(75px, max(35dvh, 45%), 165px); background: var(--bg-color);]
[div=background: var(--attachment); border-radius: 15px; height: 100%; width: 80%; margin: auto; filter: blur(1.5px);][/div][/div]
[/div]
[div=/*ANCHOR - Interaction Icons */
display: flex; flex-flow: column wrap; justify-content: space-evenly; align-items: center;
font-size: var(--h-fs); color: var(--spearow-tan); line-height: 1;
height: 31.5px; width: 100%; max-width: 500px;
margin: auto;]
[fa]fa-solid fa-comment-dots[/fa][fa]fa-solid fa-retweet[/fa][fa]fa-solid fa-heart[/fa][fa]fa-solid fa-share[/fa][/div]
[/div]