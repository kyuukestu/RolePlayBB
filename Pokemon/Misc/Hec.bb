[nobr]

  [div=display: none;][font=Roboto]fontcall[/font][/div]

  [div=--charIcon: url(https://placehold.co/100/aeebd5/eff3c2?text=ICON); /* use a 100x100 icon for best results */

  --bgIMG: url(https://i.imgur.com/VkcW7TQ.jpg); /* vertical image you wanna use as a background */

  --bgColor: rgba(245,245,245,1); /* anything with rgba can also be a hexcode */

  --colorOne: rgba(247, 244, 156, 0.8); /* the leftmost color in the gradient */

  --colorTwo: rgba(154, 189, 243, 0.8);

  --colorThree: rgba(73, 133, 245, 0.8); /* the rightmost color in the gradient */

  --textColor: rgba(60, 60, 60, 1);

  --mFont: 'Roboto', sans-serif;

  display: block;

  position: relative;

  box-sizing: border-box;

  width: clamp(300px,100%,1000px);

  height: auto;

  overflow-x: hidden;

  overflow-y: auto;

  font-family: var(--mFont);

  color: var(--textColor);

  margin: auto;

  --grad: linear-gradient(90deg, var(--colorOne) 0%, var(--colorTwo) 50%, var(--colorThree) 100%);

  --grad130: linear-gradient(130deg, var(--colorOne) 0%, var(--colorTwo) 50%, var(--colorThree) 100%);

  --grad315: linear-gradient(315deg, var(--colorOne) 0%, var(--colorTwo) 50%, var(--colorThree) 100%);

  --gradc: radial-gradient(circle, var(--colorThree) 0%, var(--colorTwo) 50%, var(--colorOne) 100%);]

    [div=z-index: 4; width: 80%; min-width: 300px; margin: auto; background: var(--bgColor); position: relative;]

      [div=height: clamp(325px,25vh,500px); width: 100%; position: relative; display: flex; flex-flow: column nowrap; justify-content: flex-end;]

        [div=position: relative; z-index: 5; width: 100%; overflow: hidden; box-sizing: border-box; padding: 0px 20px; bottom: 0px; display: flex; flex-flow: row wrap-reverse; align-items: flex-end; gap: 10px;]

          [div=flex: 1 140px;]

            [div=margin: auto; width: 140px; height: 140px; box-sizing: border-box; border: 20px solid var(--bgColor); background: var(--bgColor) var(--charIcon) no-repeat center center/cover;] [/div]

          [/div]

          [div=flex: 5 200px; ]

            [div=display: block; font-size: 3rem; line-height: .9; margin-top: .4em; margin-bottom: .55em; font-weight: 900;]First Last[/div]

            [div=display: block; font-size: .85rem; line-height: .9; text-transform: uppercase; ]

              [div=display: inline-block;]age (00)[/div]

              [div=display: inline-block; color: var(--colorOne); margin: 4px;]⋮[/div]

              [div=display: inline-block;]gender (pro/nouns)[/div]

              [div=display: inline-block; color: var(--colorOne); margin: 4px;]⋮[/div]

              [div=display: inline-block;]month 00[/div]

              [div=display: inline-block; color: var(--colorOne); margin: 4px;]⋮[/div]

              [div=display: inline-block;]sexuality[/div]

              [div=display: inline-block; color: var(--colorOne); margin: 4px;]⋮[/div]

              [div=display: inline-block;]nationality[/div]

            [/div]

          [/div]

        [/div]

        [div=position: absolute; top: 0px; left: 0px; z-index: 4; width: 100%; height: calc(100% - 70px); background: var(--colorOne); background: var(--grad130);] [/div]

      [/div]

      [div=display: block; width: 100%; background: var(--bgColor); box-sizing: border-box; padding: clamp(8px,5%,30px) 50px;]

        [div=display: flex; row-nowrap; align-items: center; gap: 20px;]

          [div=flex: 0 auto; font-weight: 900; font-size: 1.5rem; line-height: .9;]Physical[/div]

          [div=flex: 4 0px; width: 100%; height: 5px; background: var(--colorOne); background: var(--grad);] [/div]

        [/div]

        [div=display: flex; flex-flow: row wrap; align-items: center; width: 100%; box-sizing: border-box; padding: 25px clamp(8px,2%,15px) 35px clamp(8px,5%,30px); gap: 5px 10px;]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]hair[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9; ]color[/div]

          [/div]

          [comment]start of copypaste[/comment][div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]eyes[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9; ]color[/div]

          [/div][comment]end of copypaste[/comment]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]height[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]0'0"[div=display: inline; color: var(--colorThree); margin: 2px;]⋮[/div]0cm[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]features[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]freckles, scars, etc.[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]modifications[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]tattoos, piercings, etc.[/div]

          [/div]

        [/div]

        [div=display: flex; row-nowrap; align-items: center; gap: 20px;]

          [div=flex: 0 auto; font-weight: 900; font-size: 1.5rem; line-height: .9;]Background[/div]

          [div=flex: 4 0px; width: 100%; height: 5px; background: var(--colorOne); background: var(--grad);] [/div]

        [/div]

        [div=display: flex; flex-flow: row wrap; align-items: center; width: 100%; box-sizing: border-box; padding: 25px clamp(8px,2%,15px) 35px clamp(8px,5%,30px); gap: 5px 10px;]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]fears[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]

              one fear[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]two fear

            [/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]dreams[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]dream here[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]secrets[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]one secret[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]two secret[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]PERSONALITY+[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]trait[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]trait[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]trait[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]personality-[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]trait[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]trait[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]trait[/div]

          [/div]

          [comment]start of copypaste [/comment][div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]Backstory[/div]

            [div=display: block; font-size: .95rem; line-height: 1; text-align: justify; padding-top: .6em;]

              [div=display: block; margin-bottom: .5em;]Wrap each paragraph in this code. If you prefer this style for your personality as well, check the nearby comments to see where the code starts and ends.[/div]

              [div=display: block; margin-bottom: .5em;]Lorem ipsum dolor sit amet, consectetur adipiscing elit. In feugiat congue dui egestas viverra. Quisque in nibh a diam convallis luctus. Praesent malesuada augue mauris, eu varius mi volutpat ac. Donec suscipit scelerisque consectetur. Donec tempor nisi eget diam pharetra, eget tristique est congue. Mauris eget fringilla felis, gravida condimentum libero. Vivamus congue nulla a dolor accumsan bibendum. Vestibulum egestas eros mauris, sed sagittis orci elementum id. Donec quis mollis libero. Maecenas ut justo dolor. Etiam at diam elit. [/div]

              [div=display: block; margin-bottom: .5em;]Phasellus vehicula elit eget elit sodales fringilla. Praesent pellentesque erat quis vestibulum facilisis. Aliquam facilisis enim nec tellus fringilla, id egestas nulla sodales. Cras posuere, orci in feugiat ullamcorper, dolor lectus imperdiet felis, eget elementum neque nibh eget neque. Etiam volutpat volutpat ante nec pretium. Curabitur imperdiet, dolor vitae varius fringilla, odio mi condimentum arcu, eu rutrum felis nunc id elit. Phasellus non aliquam lorem, a vestibulum elit. Suspendisse ex lacus, iaculis sit amet libero ac, luctus venenatis nisl. Duis ultrices vehicula dolor, ac finibus ligula gravida sit amet. Nulla facilisi. Donec molestie feugiat lacus. [/div]

            [/div]

          [/div][comment] end of copypaste[/comment]

        [/div]

        [div=display: flex; row-nowrap; align-items: center; gap: 20px;]

          [div=flex: 0 auto; font-weight: 900; font-size: 1.5rem; line-height: .9;]Personal[/div]

          [div=flex: 4 0px; width: 100%; height: 5px; background: var(--colorOne); background: var(--grad);] [/div]

        [/div]

        [div=display: flex; flex-flow: row wrap; align-items: center; width: 100%; box-sizing: border-box; padding: 25px clamp(8px,2%,15px) 35px clamp(8px,5%,30px); gap: 5px 10px;]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]MBTI[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9; ]mbti here[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]habits[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9; ]one habit[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]two habit[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]hobbies[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]one hobby[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]two hobby[div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div]three hobby[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]horoscope[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]horoscope here[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]alignment[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]alignment here[/div]

          [/div]

        [/div]

        [div=display: flex; row-nowrap; align-items: center; gap: 20px;]

          [div=flex: 0 auto; font-weight: 900; font-size: 1.5rem; line-height: .9;]Extra[/div]

          [div=flex: 4 0px; width: 100%; height: 5px; background: var(--colorOne); background: var(--grad);] [/div]

        [/div]

        [div=display: flex; flex-flow: row wrap; align-items: center; width: 100%; box-sizing: border-box; padding: 25px clamp(8px,2%,15px) 35px clamp(8px,5%,30px); gap: 5px 10px;]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]01[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]extra one[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]02[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]extra two[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]03[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]extra three[/div]

          [/div]

          [div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]04[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]extra four[/div]

          [/div]

          [comment]start of copypaste [/comment][div=flex: 1 auto; ]

            [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]05[/div]

            [div=display: inline-block; font-size: .95rem; line-height: .9;]extra five[/div]

          [/div][comment]end of copypaste[/comment]

        [/div]

        [div=display: flex; row-nowrap; align-items: center; gap: 20px;]

          [div=flex: 0 auto; font-weight: 900; font-size: 1.5rem; line-height: .9;]Pokemon[/div]

          [div=flex: 4 0px; width: 100%; height: 5px; background: var(--colorOne); background: var(--grad);] [/div]

        [/div]

        [div=display: block; width: 100%; box-sizing: border-box; padding: 25px 0px;]

          [div=display: flex; flex-flow: row wrap; align-items: center; justify-content: center; gap: 25px; margin-bottom: 35px;]

            [div=flex: 1 80px; max-width: 125px; background: var(--colorOne); background: var(--gradc); overflow: hidden; font-size: 0px; pointer-events: none; padding: 2.5%; border-radius: 50%; text-align: center; box-sizing: border-box;][/div]

            [div=flex: 4 200px; width: 100%; font-size: .95rem; line-height: .9; ]

              [div=display: block; font-size: 1.5rem; line-height: .9; margin-top: .4em; margin-bottom: .25em; font-weight: 900;]Nickname [div=display: inline; color: var(--colorOne); margin: 2px;]Level[/div][/div]

              [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]#132[/div]

              [div=display: inline-block; font-size: .85rem; line-height: .9; text-transform: uppercase;]Pokemon [div=display: inline; color: var(--colorOne); margin: 2px; font-weight: 900;]♂♀[/div] Ability [div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div] Nature[/div]

              [div=display: flex; flex-flow: row wrap; align-items: center; width: 100%; gap: 5px; box-sizing: border-box; padding: 15px 0px 1em .75em;]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

              [/div]

            [/div]

          [/div]

          [comment]start of copypaste [/comment][div=display: flex; flex-flow: row wrap; align-items: center; justify-content: center; gap: 25px; margin-bottom: 35px;]

            [div=flex: 1 80px; max-width: 125px; background: var(--colorOne); background: var(--gradc); overflow: hidden; font-size: 0px; pointer-events: none; padding: 2.5%; border-radius: 50%; text-align: center; box-sizing: border-box;][/div]

            [div=flex: 4 200px; width: 100%; font-size: .95rem; line-height: .9; ]

              [div=display: block; font-size: 1.5rem; line-height: .9; margin-top: .4em; margin-bottom: .25em; font-weight: 900;]Nickname [div=display: inline; color: var(--colorOne); margin: 2px;]Level[/div][/div]

              [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]#132[/div]

              [div=display: inline-block; font-size: .85rem; line-height: .9; text-transform: uppercase;]Pokemon [div=display: inline; color: var(--colorOne); margin: 2px; font-weight: 900;]♂♀[/div] Ability [div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div] Nature[/div]

              [div=display: flex; flex-flow: row wrap; align-items: center; width: 100%; gap: 5px; box-sizing: border-box; padding: 15px 0px 1em .75em;]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

              [/div]

            [/div]

          [/div][comment]end of copypaste[/comment]

          [div=display: flex; flex-flow: row wrap; align-items: center; justify-content: center; gap: 25px; margin-bottom: 35px;]

            [div=flex: 1 80px; max-width: 125px; background: var(--colorOne); background: var(--gradc); overflow: hidden; font-size: 0px; pointer-events: none; padding: 2.5%; border-radius: 50%; text-align: center; box-sizing: border-box;][/div]

            [div=flex: 4 200px; width: 100%; font-size: .95rem; line-height: .9; ]

              [div=display: block; font-size: 1.5rem; line-height: .9; margin-top: .4em; margin-bottom: .25em; font-weight: 900;]Nickname [div=display: inline; color: var(--colorOne); margin: 2px;]Level[/div][/div]

              [div=display: inline-block; background: var(--colorOne); background: var(--grad); padding: 4px 5px; text-transform: uppercase; font-size: .85rem; color: var(--bgColor); line-height: .9; font-weight: 900; margin-right: 5px;]#132[/div]

              [div=display: inline-block; font-size: .85rem; line-height: .9; text-transform: uppercase;]Pokemon [div=display: inline; color: var(--colorOne); margin: 2px; font-weight: 900;]♂♀[/div] Ability [div=display: inline; color: var(--colorOne); margin: 2px;]⋮[/div] Nature[/div]

              [div=display: flex; flex-flow: row wrap; align-items: center; width: 100%; gap: 5px; box-sizing: border-box; padding: 15px 0px 1em .75em;]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

                [div=flex: 1 auto; font-size: .95rem; line-height: .9;]

                  [div=display: inline; color: var(--colorOne); margin: 2px;]❉[/div]

                  Move

                [/div]

              [/div]

            [/div]

          [/div]

        [/div]

      [/div]

      [div=display: block; width: 100%; background: var(--grad130); box-sizing: border-box; padding: 15px 5% 10px 5%; text-align: right; text-transform: uppercase; line-height: .9; color: var(--bgColor); font-size: .75rem; font-weight: bold;]fluticasone[/div]

    [/div]

    [div=z-index: 1; position: absolute; width: 100%; height: 100%; overflow: hidden; top: 0px; left: 0px;]

      [div=position: absolute; width: calc(100% + 20px); height: calc(100% + 20px); top: -10px; left: -10px; background: var(--bgIMG) no-repeat center center/cover; filter: blur(8px);] [/div]

    [/div]

    [div=z-index: 2; position: absolute; width: 100%; height: 100%; top: 0px; left: 0px; background: var(--colorOne); background: var(--grad315); mix-blend-mode: hard-light;] [/div]

    [div=z-index: 3; position: absolute; width: 100%; height: 100%; top: 0px; left: 0px; background: url(https://i.imgur.com/UdjBt1F.png) repeat; mix-blend-mode: soft-light; opacity: .75;] [/div]

  [/div]

[/nobr]