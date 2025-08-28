[comment][font=Krona One][font=Geologica].[/font][/font][/comment]
[div=/*SECTION - Content Accordion */
visibility: hidden; margin: auto; padding: 0;
max-width: 800px;
--body-top: -50px;
--grid-c-m: 9px auto;
--t-indent: 1em;
--fs-header: calc(var(--fs-s-header)*1.3);
--fs-s-header: calc(var(--fs-body)*1.3);
--fs-body: clamp(10px, 1.5vw , calc((1rem * 0.625) + 0.75vh));
--grid-p: min(2.5%, 5px);
--slide-size: clamp(250px, calc(450px + 10dvh), 650px);]
	[bg=transparent; visibility: visible; position: relative; margin: 0 auto; padding: 0px; z-index: 2;]
			[div=/*ANCHOR -  Pokédex Design Top Slide Cover */
			box-sizing: border-box;
			height: 100px; max-width: 90%; 
			border-radius: 15px 15px 0 0;
			background-color: #C50D24;
			border-bottom: Ridge 5px #fffaf0;
			overflow: clip;
			margin: auto;]
				[div=box-sizing: border-box; 
				position: relative;
				max-width: 100%; height: 100%;
				display: grid;]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; top: -4rem; left: -3rem;
					width: 85px; aspect-ratio: 1/1;][/div]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; top: -4rem; right: -3rem;
					width: 85px; aspect-ratio: 1/1;][/div]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; top: -7rem; right: -6rem;
					width: 170px; aspect-ratio: 1/1;][/div]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; top: -7rem; left: -6rem;
					width: 170px; aspect-ratio: 1/1;][/div]			
					[div=box-sizing: border-box;
					border: Ridge 5px #fffaf0; border-radius: 150px;
					background-color: #202020;
					position: absolute; top: 25%;
					width: clamp(90px, 15vw, 125px); aspect-ratio: 1/1;
					justify-self: center;]
						[div=box-sizing: border-box;
						border-radius: 150px;
						background: linear-gradient(360deg, rgba(255,255,255,1) 67%, rgba(154,221,224,1) 87%, rgba(154,221,224,0.85) 100%);
						position: absolute; top: 50%; left: 50%;
						transform: translate(-50%, -50%);
						width: clamp(45px, 7.5vw, 75px); aspect-ratio: 1/1;][/div]
					[/div]		
				[/div]
			[/div]
		[/bg]
			[div=/*ANCHOR Main Slide Content */
			box-sizing: border-box; visibility: visible; 
			background: radial-gradient(circle, rgba(255,255,255,1) 10%, rgba(154,221,224,1) 100%);
			color: #202020;
			max-width: 90%;
			margin: auto;
			padding: 2rem;
			height: var(--slide-size); overflow: scroll;
			position: relative; top: var(--body-top);]
				[div=/*ANCHOR - H1 Container */
				font-size: var(--fs-header);
				margin: 5px auto;
				letter-spacing: 1px;
				display: flex;
				height: fit-content;
				align-items: center; justify-content: center;
				display: grid; grid-template-areas: "content";
				font-family: Krona One;]
					[div=/*ANCHOR - Header GoTo/Anchor Link */
					box-sizing: border-box; grid-area: content; z-index: 3; pointer-events: auto; display: flex; align-items: center;]
						[GOTO=s3p0] Law Enforcement [/GOTO]
					[/div]
					[div=/*ANCHOR - Header Styled */
					box-sizing: border-box; grid-area: content; z-index: 4; pointer-events: none; color: #202020; display: flex; align-items: center;]
						Law Enforcement
					[/div]
				[/div]
				[div=/*ANCHOR - Content Container */
				font-size: var(--fs-body);
				margin: 0 auto;
				display: flex;
				flex-direction: column;
				height: fit-content;
				letter-spacing: 1px;
				visibility: hidden;
				position: relative;
				top: var(--body-top);
				font-family: Geologica;]
						[div=/*SECTION  */
                    /*ANCHOR - Block Container */
                    box-sizing: border-box; visibility: visible; position: relative; 
                    display: block; grid-template-areas: "content";
                    max-width: 90%; margin: var(--grid-c-m); padding: var(--grid-p);]
                        [div=/*ANCHOR - H2 Container */
                        font-size: var(--fs-s-header); 
                        margin: 5px auto; letter-spacing: 1px; line-height: 2.5; width: 100%;
                        background-color: #202020;
                        align-items: center; justify-content: center;
                        display: grid; grid-template-areas: "content";
                        position: sticky; top: calc(-6 * var(--grid-p));
                        z-index: 5;] 
                            [div=/*ANCHOR - GoTo/Anchor Link */
                            box-sizing: border-box; grid-area: content; z-index: 3; pointer-events: auto; display: flex; align-items: center;]
                                [fa]fa-solid fa-caret-down[/fa] [a=s3p1] Under Construction [/a] [fa]fa-solid fa-caret-down[/fa]
                            [/div]
                            [div=/*ANCHOR - S1.0 Link Styled */
                            box-sizing: border-box; grid-area: content; z-index: 4; pointer-events: none; color: #fff; display: flex; align-items: center;]
                                [fa]fa-solid fa-caret-down[/fa] Under Construction [fa]fa-solid fa-caret-down[/fa]
                            [/div]
                        [/div]
						
						[div=/*!SECTION */ display: none;][/div]
						[/div]
						
				[/div]
			[/div]
			[bg=/*SECTION: ToC Pokédex Bottom Slide Cover */
			transparent; visibility: visible; position: relative; margin: auto; padding: 0px; z-index: 2;position: relative;
			top: var(--body-top);]
			[div=box-sizing: border-box;
			height: 100px; max-width: 90%; 
			border-radius: 0 0 15px 15px;
			background-color: #C50D24;
			border-top: Ridge 5px #fffaf0;
			overflow: clip;
			visibility: visible;
			pointer-events: none;
			margin: auto;
			position: relative;
			top: var(--body-top);]
				[div=box-sizing: border-box; 
				position: relative;
				max-width: 100%; height: 100%;
				display: grid;]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; bottom: -2rem; right: -3rem;
					width: 85px; aspect-ratio: 1/1;][/div]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; bottom: -2rem; left: -3rem;
					width: 85px; aspect-ratio: 1/1;][/div]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; bottom: -5rem; left: -5rem;
					width: 170px; aspect-ratio: 1/1;][/div]
					[div=box-sizing: border-box;
					border: Ridge 5px #202020; border-radius: 150px;
					background-color: transparent;
					position: absolute; bottom: -5rem; right: -5rem;
					width: 170px; aspect-ratio: 1/1;][/div]			
					[div=box-sizing: border-box;
					border: Ridge 5px #fffaf0; border-radius: 150px;
					background-color: #202020;
					position: absolute; bottom: 60%;
					width: clamp(90px, 15vw, 125px); aspect-ratio: 1/1;
					justify-self: center;]
						[div=box-sizing: border-box;
						border-radius: 150px;
						background: linear-gradient(180deg, rgba(255,255,255,1) 67%, rgba(154,221,224,1) 90%, rgba(154,221,224,0.85) 100%);
						position: absolute; top: 50%; left: 50%;
						transform: translate(-50%, -50%);
						width: clamp(45px, 7.5vw, 75px); aspect-ratio: 1/1;][/div]
					[/div]
				[/div]
			[/div]
			[div=/*!SECTION */ display: none;][/div]
		[/bg]
	[div=/*!SECTION */ display: none;][/div]
[/div]
