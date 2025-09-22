[comment][font=Grenze Gotisch][font=Lexend Deca].[/font][/font][/comment]
[div=box-sizing: border-box;
display: flex; flex-direction: column;
position: relative;
height: min(600px, 85vh); width: 80%;
margin: 25px auto; padding: 15px 20px;
border-radius: 16px; border: 2px solid var(--spearow-black);
background-color: var(--bg-color);
box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
gap: 10px;
color: var(--main-text-c); font-family: var(--body-font);

/* Fonts Here: Name Font is for the Display Name, body font is everything else */
--name-font: Grenze Gotisch;
--body-font: Lexend Deca;

/* The URL for your character image goes here: */
--char-img: url(https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Icon-round-Question_mark.svg/1200px-Icon-round-Question_mark.svg.png);


/* The URL for any attachment image goes here: Leave empty if none. */
--attachment-img: url(https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Icon-round-Question_mark.svg/1200px-Icon-round-Question_mark.svg.png);
--attachment: no-repeat 50% 20%/cover var(--attachment-img);

--main-text-c: #2a2a2a;
--bg-color: #e0e0e0;

--spearow-black: #080808;
--spearow-red: #AB525C;
--spearow-brown: #8D5B48;
--spearow-tan: #F1E1CA;

--spearow: url(https://i.imgur.com/u8451Bj.png);
--spearow-bg: no-repeat 50% 50%/100% var(--spearow); transparent;
--spearow--gradient: linear-gradient(var(--spearow-tan), var(--spearow-red), var(--spearow-brown), var(--spearow-black));

]

[div=background: var(--spearow--gradient); 
mask: no-repeat center/contain var(--spearow); -webkit-mask: no-repeat center/contain var(--spearow); 
position: absolute; right: 10px; top: 10px; height: 64px; aspect-ratio: 1; z-index: 1;][/div]

[div=display: flex; flex-flow: column; gap: 10px; height: 92%;]
[div=/* Character Display & Message */ 
display: flex; flex-direction: row; gap: 5px; position: relative;
height: 50%;]
[div=background: no-repeat center/contain var(--char-img); border-radius: 50%; height: 100px; aspect-ratio: 1; border: 2px solid var(--spearow-red);][/div]
[div=/* Header + Message */ 
display: flex; flex-direction: column;][div=/* Post Header */
display: flex; flex-direction: column; gap: 2.5px; align-items: start;]
[div=/* CHARACTER DISPLAY NAME */
font-weight: bold; font-size: 2em; font-family: var(--name-font);] Insert Your Display Name Here [/div]
[div=/* CHARACTER HANDLE OR TAG */
font-size: 1em; color: #555; padding-left: 5px] Insert your Handle Here [/div]
[div=/* Follow Button */ 
height: 2em; width: 15%; 
position: absolute; top: 10px; right: max(70px, 8.5%);
display: flex; justify-content: center; align-items: center;
background-color: var(--spearow-red); border-radius: 20px;]Following[/div]
[/div]
[div=/* Character Text/Message */
font-size: 1em;]

Message Text goes Here
[/div][/div]
[/div]
[div=/* Attachment Section */
background: var(--attachment); border-radius: 30px; height: 50%; width: 80%; margin: auto; filter: blur(3px);][/div]
[div=/* Footer */
height: 10%; font-size: 1em; color: #555;]
Time Goes Here
[/div]
[/div]
[div=/* Interaction Icons */
display: flex; flex-direction: row; justify-content: space-evenly; align-items: center;
font-size: 2em; color: var(--spearow-red);
height: 8%; width: 90%; ]
[fa]fa-solid fa-comment-dots[/fa][fa]fa-solid fa-retweet[/fa][fa]fa-solid fa-heart[/fa][fa]fa-solid fa-share[/fa][/div]
[/div]