[comment][font=New Rocker][font=Texturina][font=Iceberg][font=Newsreader].[/font][/font][/font][/font][/comment]
[div=height: var(--mainHeight); width: 100%;
display: flex; flex-flow: column nowrap;

background: var(--spearow-black); color: var(--spearow-tan); font-size: var(--fs-body); font-family: var(--article-font);
position: relative;

/*ANCHOR - Dimensions */
--mainHeight: clamp(300px, 85svh, 750px);

--fs-header: calc(var(--fs-body) * 2.75);
--fs-header-ff: calc(1.35*var(--fs-body));
--fs-body: clamp(10px, calc(0.75em + 0.25vw), 1.2em);
--fs-mini: calc(var(--fs-body) * 0.5);


--spearow-bg: no-repeat 50% 50%/50% url(https://cdn.discordapp.com/attachments/191374162978144257/1336171617247825990/0021Spearow.png?ex=67a2d64a&is=67a184ca&hm=7ee67770568e608917ed2a7d51041d298ad22ac366e4a8df2753f95ddef48b09&) transparent;

--title-font: New Rocker;
--header-font: Iceberg;
--s-header-font: Texturina;
--article-font: Newsreader;

/*ANCHOR - Palette */
--spearow-black: #080808;
--spearow-red: #AB525C;
--spearow-brown: #8D5B48;
--spearow-tan: #F1E1CA;]
[div=/*STUB - Background Spearow */
background: var(--spearow-bg); opacity: 0.25; width: 100%; height: 100%; position: absolute; z-index: 1;][/div]
[div=/*STUB - Title Container*/ 
display: flex; justify-content: center; max-height: 75px; position: relative; flex: 1 1 100%; border-bottom: 3px solid var(--spearow-tan); font-size: var(--fs-header); font-family: var(--title-font); box-sizing: border-box; color: var(--spearow-brown);]Keen [div=display: inline; color: var(--spearow-red);] Eye [/div] News Network[div=position: absolute; bottom: -30px; right: 10px; font-size: var(--fs-mini); font-family: var(--s-header-font); color: var(--spearow-tan); display: flex; flex-flow: row nowrap; justify-content: flex-end; gap: 10px; width: calc(100% - 10px); background: var(--spearow-black);]
[div=box-sizing: border-box;]Issue #[/div]
[div=box-sizing: border-box;]Author[/div]
[div=box-sizing: border-box;]Date, XX22[/div][/div][/div]
[div=/*STUB - Body Container */
display: flex; padding-top: 100px; height: 85%; box-sizing: border-box; flex-flow: row wrap-reverse; overflow-y: scroll; scrollbar-width: none; z-index: 2;]
[div=/*STUB - Resource Links */
display: flex; flex-flow: column nowrap; flex: 1 1 20%; height: 100%; width: 20%; overflow-y: scroll; scrollbar-width: none; border-right: 3px solid var(--spearow-tan); padding: 10px; box-sizing: border-box;]
[div=/*ANCHOR - Link Title */
font-family: var(--header-font); font-size: var(--fs-header-ff); height: fit-content; margin: 0 auto;]Related Links:[/div]
[div=/*ANCHOR - Link List */
box-sizing: border-box;]
[List]
[*] Link Here
[/List]
[/div]
[/div]
[div=/*STUB - Content Container */
display: flex; flex-flow: column nowrap; flex: 1 1 75%; height: 100%; width: 80%; overflow-y: scroll; scrollbar-width: none; padding: 10px; min-width: 400px; border-bottom: 3px solid var(--spearow-tan);]
[div=/*ANCHOR - Content Title */
font-family: var(--header-font); font-size: var(--fs-header-ff); height: fit-content; margin: 0 auto;]Title[/div]
[div=/*ANCHOR - Content Body */
box-sizing: border-box;]
Content Here
[/div]
[/div]
[/div]