[nobr][comment]

[font=Karla]sans-serif[/font]

[/comment]



[div=margin: 75px auto; width: 100%; max-width: 500px; font-size: initial;]

  [div="font-family: 'Karla', sans-serif; font-size: 1.4em;"]

    030. A Cupid's Guide to Love!

  [/div]

  [div="margin-top: 7px; font-family: 'Karla', sans-serif; font-size: .9em; text-align: justify;"]

    [div=white-space: pre-line;]As you can probably tell from the colors and images used, this is the coding done for the group RP related to the Icedrop CS code. Two parts of the code are more or less the same, with the only difference being one has three tabs while the other has none. The third part of the code is something I made for RPs where it's application-based rather than being first come, first served. I wanted to clean this up more before posting it here, but I ended up throwing in the towel... Due to certain parts of the code such as the main image + the title, I won't be posting a TTcode variant aka I got lazy.



Code with three tabs

Code with no tabs

Application code[/div]

  [/div]

[/div]

[/nobr][nobr]

[div=

  width: 100%;

  position: relative;

  overflow: hidden;

  font-size: initial;

  line-height: initial;]

  [comment]

    Designed and coded by [USER=20950]@Nano[/USER].



    Please do not remove the credits or claim the code as your own work.



    If you found this code outside of my public workshop, please don't use it.

    I'd greatly appreciate it if you used the version of the code in that thread.



    [font=Poppins]sans-serif[/font]

    [font=Hind]serif[/font]

  [/comment]

  [div="

  /* <--------------------------------- general accents ---------------------------------> */



  /* colors */

  --Color01: #f98e8d; /* this is the red in the original */

  --Color02: #bde6d6; /* this is the green in the original */

  --bgColor: #f7e6e7;

  --textColor: #d13c3a;

  --White: #fefefe;



  /* fonts */

  --HeaderFont: 'Poppins', san-serif;

  --BodyFont: 'Hind', serif;



  --LinkSize: .9em; /* font size of link text */

  --HeaderSize: 1.2em; /* font size of rp title */

  --SubheaderSize: .9em; /* font size of the section headers */

  --RoleSize: 3em; /* font size of the titles of each role within role images */

  --BodySize: .92em; /* font size of body text */



  --BodyLineHeight: 150%;



  /* <--------------------------------- images ---------------------------------> */



  /* general */

  --bgIMG: url(https://i.imgur.com/GnzHLk3.png) repeat; /* transparent bg pattern - optional */



  /* main */

  --mainIMG: url(https://i.imgur.com/Mb1tR6j.png) center/contain no-repeat;

  --videoIMG: url(https://i.imgur.com/S5H8VB5.jpeg) center/cover no-repeat;



  /* roles */

  --Role01: url(https://i.imgur.com/e5bCjcx.jpeg) center/cover no-repeat;

  --Role02: url(https://i.imgur.com/e5bCjcx.jpeg) center/cover no-repeat;

  --Role03: url(https://i.imgur.com/e5bCjcx.jpeg) center/cover no-repeat;

  --Role04: url(https://i.imgur.com/e5bCjcx.jpeg) center/cover no-repeat;

  --Role05: url(https://i.imgur.com/e5bCjcx.jpeg) center/cover no-repeat;



  /* <--------------------------------- shell (don't touch) ---------------------------------> */



  padding: 25px 0 0;

  width: 100%;

  min-width: 300px;

  background: var(--bgColor);"]

    [div=/* code wrap */

    margin: 0 auto;

    max-width: 800px;]

    [comment] --- start of upper half of code --- [/comment]

      [div=/* flexbox wrapper */

      margin-left: -10px;

      display: flex;

      flex-flow: row wrap;

      width: calc(100% + 10px);

      align-items: end;]

        [comment] --- start of rp links --- [/comment]

        [div=/* flex LEFT */

        margin-left: 25px;

        margin-bottom: 150px;

        flex: 3;

        width: calc(100% - 15px);

        min-width: 150px;

        font-family: var(--HeaderFont);

        font-size: var(--LinkSize);

        font-weight: 700;

        text-transform: capitalize;

        color: var(--Color02);

        position: relative;

        z-index: 2;]

          [comment] --- start of link 01 / inactive --- [/comment]

          [div=/* link flex wrapper */

          margin-left: -15px;

          display: flex;

          flex-flow: row nowrap;

          width: calc(100% + 15px);

          color: var(--Color01);]

            [div=/* link FA icon */

            margin-left: 15px;

            flex: 1;

            width: 100%;

            max-width: 30px;

            text-align: center;]

              [fa]fas fa-home[/fa]

            [/div]

            [div=/* link text */

            margin-left: 15px;

            flex: 6;

            max-width: fit-content;

            position: relative;]

              Interest Check

            [/div]

          [/div]

          [comment] --- end of link 01 / inactive --- [/comment]

          [comment] --- start of link 02 / active --- [/comment]

          [div=/* link flex wrapper */

          margin-top: 7px;

          margin-left: -15px;

          display: flex;

          flex-flow: row nowrap;

          width: calc(100% + 15px);]

            [div=/* link FA icon */

            margin-left: 15px;

            flex: 1;

            width: 100%;

            max-width: 30px;

            text-align: center;]

              [fa]fas fa-envelope[/fa]

            [/div]

            [div=/* link text */

            margin-left: 15px;

            flex: 6;

            max-width: fit-content;

            position: relative;]

              Applications

              [div=/* clicker */ inset: 0; position: absolute;][/div]

            [/div]

          [/div]

          [comment] --- end of link 02 / active --- [/comment]

          [comment] --- start of link 03 / active --- [/comment]

          [div=/* link flex wrapper */

          margin-top: 7px;

          margin-left: -15px;

          display: flex;

          flex-flow: row nowrap;

          width: calc(100% + 15px);]

            [div=/* link FA icon */

            margin-left: 15px;

            flex: 1;

            width: 100%;

            max-width: 30px;

            text-align: center;]

              [fa]fas fa-user[/fa]

            [/div]

            [div=/* link text */

            margin-left: 15px;

            flex: 6;

            max-width: fit-content;

            position: relative;]

              Character Sheets

              [div=/* clicker */ inset: 0; position: absolute;][/div]

            [/div]

          [/div]

          [comment] --- end of link 03 / active --- [/comment]

          [comment] --- start of link 04 / active --- [/comment]

          [div=/* link flex wrapper */

          margin-top: 7px;

          margin-left: -15px;

          display: flex;

          flex-flow: row nowrap;

          width: calc(100% + 15px);]

            [div=/* link FA icon */

            margin-left: 15px;

            flex: 1;

            width: 100%;

            max-width: 30px;

            text-align: center;]

              [fa]fab fa-discord[/fa]

            [/div]

            [div=/* link text */

            margin-left: 15px;

            flex: 6;

            max-width: fit-content;

            position: relative;]

              Discord

              [div=/* clicker */ inset: 0; position: absolute;][/div]

            [/div]

          [/div]

          [comment] --- end of link 04 / active --- [/comment]

        [/div]

        [comment] --- end of rp links --- [/comment]

          [comment] --- start of main decor section --- [/comment]

          [div=/* flex RIGHT */

          margin-left: 10px;

          flex: 7;

          width: 100%;

          min-width: 300px;

          position: relative;]

            [div=/* box */

            margin-top: 150px;

            box-sizing: border-box;

            width: 100%;

            height: 400px;

            border: 10px solid var(--Color01);

            border-radius: 15px;

            background: var(--bgIMG), var(--White);

            position: relative;

            z-index: 1;]

              [div=/* main image - 1:1 ratio transparent */

              width: 525px;

              height: 525px;

              background: var(--mainIMG);

              position: absolute;

              bottom: 0;

              right: -60px;]

              [/div]

              [comment] --- start of rp title --- [/comment]

              [div=/* rp title wrapper */

              font-family: var(--HeaderFont);

              font-size: var(--HeaderSize);

              color: var(--Color02);

              font-weight: 700;

              text-transform: uppercase;

              position: absolute;

              transform: rotate(-5deg);

              top: 17%;

              left: 10%;]

                [div=/* line 01 */

                max-width: fit-content;

                background: var(--Color02);

                float: right;]

                  [div=/* title textbox */

                  padding: 0 15px;

                  background: var(--White);

                  position: relative;

                  top: -5px;

                  left: -5px;]

                    A [div=display: inline; color: var(--Color01);]Cupid's[/div] Guide

                  [/div]

                [/div]

                [div=/* line 02 */

                margin-top: 8px;

                max-width: fit-content;

                background: var(--Color02);

                float: right;

                clear: right;]

                  [div=/* title textbox */

                  padding: 0 15px;

                  background: var(--White);

                  position: relative;

                  top: -5px;

                  left: -5px;]

                    [div=display: inline; color: var(--Color01);]To[/div] Love[div=display: inline; color: var(--Color01);]![/div]

                  [/div]

                [/div]

              [/div]

              [comment] --- end of rp title --- [/comment]

            [/div]

            [comment] --- start of song title decor --- [/comment]

            [div=/* title wrapper */

            margin-top: -35px;

            width: 100%;

            height: 100px;

            position: absolute;

            right: 5px;

            overflow: hidden;]

              [div=/* song title */

              width: fit-content;

              font-family: var(--HeaderFont);

              font-size: 100px;

              line-height: 100%;

              color: var(--bgColor);

              font-weight: 700;

              text-align: right;

              text-transform: uppercase;

              white-space: nowrap;

              text-shadow: -1px -1px 0 var(--White), 1px -1px 0 var(--White), -1px 1px 0 var(--White), 1px 1px 0 var(--White);

              position: absolute;

              right: 5px;]

                Icedrop

              [/div]

              [div=/* artist name */

              padding: 5px 12px;

              background: var(--Color02);

              font-family: var(--HeaderFont);

              font-size: var(--BodySize);

              line-height: 100%;

              color: var(--White);

              font-weight: 700;

              text-transform: uppercase;

              position: absolute;

              top: 45%;

              right: 25px;]

                By: More More Jump!

              [/div]

            [/div]

            [comment] --- end of song title decor --- [/comment]

          [/div]

          [comment] --- start of music player --- [/comment]

          [div=/* faux video wrapper */

          width: 100%;

          max-width: 400px;

          position: relative;

          top: -125px;]

            [div=/* close tab symbol */

            display: flex;

            align-items: center;

            justify-content: center;

            width: 36px;

            height: 36px;

            border-radius: 50%;

            background: var(--Color01);

            font-family: var(--BodyFont);

            color: var(--White);

            font-size: 15px;

            line-height: 100%;

            font-weight: 700;

            position: absolute;

            top: -11px;

            right: -8px;

            pointer-events: none;

            z-index: 3;]

              x

            [/div]

            [div=/* faux video shell */

            display: flex;

            justify-content: center;

            align-items: center;

            box-sizing: border-box;

            border: 10px solid var(--Color02);

            border-radius: 15px;

            width: 100%;

            height: 250px;

            background: var(--videoIMG);

            position: relative;

            overflow: hidden;

            z-index: 2;]

              [div=/* music player */

              width: 30px;

              height: 30px;

              overflow: hidden;

              position: absolute;

              z-index: 3;]

                [div=/* insert gdrive media link here */

                margin-top: -225px;

                margin-left: -165px;

                opacity: 0.001;

                position: absolute;]

                  [MEDIA=googledrive]13y0jv9kKF6bWbsXtnYvxHK4QlQ1wtOfX[/MEDIA]

                [/div]

              [/div]

              [div=/* play button circle */

              box-sizing: border-box;

              border: 12px solid var(--White);

              border-radius: 50%;

              width: 75px;

              height: 75px;

              position: relative;]

                [div=/* play button circle (cont.) */

                display: flex;

                justify-content: center;

                align-items: center;

                box-sizing: border-box;

                border: 10px solid var(--Color02);

                border-radius: 50%;

                width: 73px;

                height: 73px;

                position: absolute;

                top: -11px;

                left: -11px;]

                  [div=/* triangle */

                  margin-left: 5px;

                  color: var(--White);

                  font-size: 30px;

                  position: relative;]

                    [fa]fas fa-play[/fa]

                    [div=/* triangle (cont.) */

                    color: var(--Color02);

                    font-size: 30px;

                    position: absolute;

                    inset: 0;

                    transform: scale(0.9, 0.85);]

                      [fa]fas fa-play[/fa]

                    [/div]

                  [/div]

                [/div]

              [/div]

              [div=/* timestamp */

              padding: 4px 6px;

              background: var(--Color01);

              font-family: var(--HeaderFont);

              font-size: 12px;

              line-height: 100%;

              font-weight: 700;

              color: var(--White);

              position: absolute;

              right: 6px;

              bottom: 13px;]

                3:48

              [/div]

              [div=/* video progress bar */

              width: 100%;

              height: 8px;

              background: var(--White);

              position: absolute;

              bottom: 0;]

                [div=/* video progress - edit width percentage to change progress */

                width: 35%;

                height: 8px;

                background: var(--Color01);]

                [/div]

              [/div]

            [/div]

          [/div]

           

          [comment] --- end of music player --- [/comment]

          [comment] --- end of main decor section --- [/comment]

        [/div]

      [comment] --- end of upper half of code --- [/comment]

      [comment] --- start of tabs --- [/comment]

      [div=/* tab wrapper */

      width: 100%;

      height: 500px;

      position: relative;

      top: -100px;

      overflow: hidden;]

        [div=/* no click */

        width: calc(100% - 40px);

        height: 150px;

        position: absolute;

        pointer-events: auto;

        z-index: 4]

        [/div]

        [div=/* tab cover bg */

        background: var(--bgColor);

        position: absolute;

        inset: 0;

        z-index: 4;

        pointer-events: none;]

        [/div]

        [comment] --- start of tab buttons --- [/comment]

        [div=/* tab button wrapper */

        position: absolute;

        right: 0;

        z-index: 4;

        pointer-events: none;]

          [comment] --- start of tab button 01 --- [/comment]

          [div=/* tab 01 */

          position: relative;]

            [div=/* speech bubble main */

            box-sizing: border-box;

            border: 2px solid var(--White);

            border-radius: 5px;

            padding: 6px 0;

            width: 40px;

            background: var(--Color02);

            font-family: var(--HeaderFont);

            font-size: 12px;

            line-height: 100%;

            color: var(--White);

            text-align: center;

            position: relative;]

              1

            [/div]

            [div=/* speech bubble corner */

            margin-top: -2px;

            width: 12px;

            height: 9px;

            background: var(--White);

            clip-path: polygon(0 0, 0% 100%, 100% 0);

            position: absolute;

            right: 7px;]

              [div=/* speech bubble corner inner */

              width: 8px;

              height: 5px;

              background: var(--Color02);

              clip-path: polygon(0 0, 0% 100%, 100% 0);

              position: relative;

              left: 2px;]

              [/div]

            [/div]

          [/div]

          [comment] --- end of tab button 01 --- [/comment]

          [comment] --- start of tab button 02 --- [/comment]

          [div=/* tab 02 */

          margin-top: 18px;

          position: relative;]

            [div=/* speech bubble main */

            box-sizing: border-box;

            border: 2px solid var(--White);

            border-radius: 5px;

            padding: 6px 0;

            width: 40px;

            background: var(--Color02);

            font-family: var(--HeaderFont);

            font-size: 12px;

            line-height: 100%;

            color: var(--White);

            text-align: center;

            position: relative;]

              2

            [/div]

            [div=/* speech bubble corner */

            margin-top: -2px;

            width: 12px;

            height: 9px;

            background: var(--White);

            clip-path: polygon(0 0, 0% 100%, 100% 0);

            position: absolute;

            right: 7px;]

              [div=/* speech bubble corner inner */

              width: 8px;

              height: 5px;

              background: var(--Color02);

              clip-path: polygon(0 0, 0% 100%, 100% 0);

              position: relative;

              left: 2px;]

              [/div]

            [/div]

          [/div]

          [comment] --- end of tab button 02 --- [/comment]

          [comment] --- start of tab button 03 --- [/comment]

          [div=/* tab 03 */

          margin-top: 18px;

          position: relative;]

            [div=/* speech bubble main */

            box-sizing: border-box;

            border: 2px solid var(--White);

            border-radius: 5px;

            padding: 6px 0;

            width: 40px;

            background: var(--Color02);

            font-family: var(--HeaderFont);

            font-size: 12px;

            line-height: 100%;

            color: var(--White);

            text-align: center;

            position: relative;]

              3

            [/div]

            [div=/* speech bubble corner */

            margin-top: -2px;

            width: 12px;

            height: 9px;

            background: var(--White);

            clip-path: polygon(0 0, 0% 100%, 100% 0);

            position: absolute;

            right: 7px;]

              [div=/* speech bubble corner inner */

              width: 8px;

              height: 5px;

              background: var(--Color02);

              clip-path: polygon(0 0, 0% 100%, 100% 0);

              position: relative;

              left: 2px;]

              [/div]

            [/div]

          [/div]

          [comment] --- end of tab button 03 --- [/comment]

        [/div]

        [comment] --- end of tab buttons --- [/comment]

        [div=/* tab wrapper II */

        width: 100%;

        position: absolute;

        left: -20px;]

          [div=/* tab spacing */

          margin-top: -8px;

          line-height: 43px;]

            [tabs]









              [tab=01010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101]

                [div=/* scrollbox outer */

                box-sizing: border-box;

                padding: 0 10px;

                width: calc(100% - 50px);

                height: 500px;

                overflow: hidden;

                position: absolute;

                top: 0;

                z-index: 5;

                line-height: initial;]

                  [div=/* scrollbox inner + flexbox */

                  box-sizing: content-box;

                  padding-right: 50px;

                  width: 100%;

                  height: 500px;

                  overflow-y: scroll;

                  overflow-x: hidden;]

                    [comment] --- start of overview section --- [/comment]

                    [div=/* flexbox */

                    margin-left: -20px;

                    display: flex;

                    flex-flow: row wrap;

                    width: calc(100% + 20px);]

                      [comment] --- start of section header --- [/comment]

                      [div=/* flex LEFT */

                      margin-top: 5px;

                      margin-left: 20px;

                      margin-bottom: 15px;

                      flex: 1;

                      width: 100%;

                      min-width: 150px;]

                        [div=/* subtitle header green border */

                        width: calc(100% - 5px);

                        background: var(--Color02);

                        position: sticky;

                        top: 5px;

                        left: 5px;]

                          [div=/* subtitle header main */

                          padding: 9px 0 7px;

                          width: 100%;

                          background: var(--White);

                          font-family: var(--HeaderFont);

                          font-size: var(--SubheaderSize);

                          font-weight: 700;

                          line-height: 100%;

                          color: var(--Color01);

                          text-align: center;

                          text-transform: uppercase;

                          position: relative;

                          top: -5px;

                          left: -5px;]

                            Overview

                          [/div]

                        [/div]

                      [/div]

                      [comment] --- end of section header --- [/comment]

                      [comment] --- start of textbox --- [/comment]

                      [div=/* flex RIGHT */

                      margin-left: 20px;

                      flex: 3;

                      width: 100%;

                      min-width: 250px;

                      font-family: var(--BodyFont);

                      font-size: var(--BodySize);

                      line-height: var(--BodyLineHeight);

                      color: var(--textColor);

                      text-align: justify;]

                        [div=white-space: pre-line;] Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc. Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis. Nullam placerat ex et varius aliquam. Cras in nibh finibus nisl ullamcorper dignissim. Cras volutpat blandit ultricies.



Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.



Pellentesque blandit vehicula pulvinar. Donec magna lectus, blandit non consectetur nec, porttitor sed nulla. Donec quis mattis lorem. Pellentesque a turpis ultricies, placerat orci in, mattis urna. Nunc aliquam, felis vel tincidunt blandit, ipsum tellus posuere orci, lacinia rutrum sapien arcu quis magna. Suspendisse commodo turpis erat, at semper lorem vehicula vel. Nam sit amet nisl eget augue ornare elementum vitae non felis. Vivamus luctus dolor eu leo gravida aliquet tempor eget lectus. Nunc efficitur et neque non iaculis. Donec tincidunt mattis enim, a lacinia dui ornare vel. Sed gravida consequat quam, non suscipit nisi ultricies vitae.[/div]

                      [/div]

                      [comment] --- end of textbox --- [/comment]

                    [/div]

                    [comment] --- end of overview section --- [/comment]

                    [div=/* divider */

                    margin: 35px auto;

                    width: 100%;

                    height: 1px;

                    background: var(--textColor);]

                    [/div]

                    [comment] --- start of ooc section --- [/comment]

                    [div=/* flexbox */

                    margin-left: -20px;

                    display: flex;

                    flex-flow: row wrap;

                    width: calc(100% + 20px);]

                      [comment] --- start of section header --- [/comment]

                      [div=/* flex LEFT */

                      margin-top: 5px;

                      margin-left: 20px;

                      margin-bottom: 15px;

                      flex: 1;

                      width: 100%;

                      min-width: 150px;]

                        [div=/* subtitle header green border */

                        width: calc(100% - 5px);

                        background: var(--Color02);

                        position: sticky;

                        top: 5px;

                        left: 5px;]

                          [div=/* subtitle header main */

                          padding: 9px 0 7px;

                          width: 100%;

                          background: var(--White);

                          font-family: var(--HeaderFont);

                          font-size: var(--SubheaderSize);

                          font-weight: 700;

                          line-height: 100%;

                          color: var(--Color01);

                          text-align: center;

                          text-transform: uppercase;

                          position: relative;

                          top: -5px;

                          left: -5px;]

                            OOC

                          [/div]

                        [/div]

                      [/div]

                      [comment] --- end of section header --- [/comment]

                      [comment] --- start of textbox --- [/comment]

                      [div=/* flex RIGHT */

                      margin-left: 20px;

                      flex: 3;

                      width: 100%;

                      min-width: 250px;

                      font-family: var(--BodyFont);

                      font-size: var(--BodySize);

                      line-height: var(--BodyLineHeight);

                      color: var(--textColor);

                      text-align: justify;]

                        [div=white-space: pre-line;] Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc. Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis. Nullam placerat ex et varius aliquam. Cras in nibh finibus nisl ullamcorper dignissim. Cras volutpat blandit ultricies.



Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.[/div]

                      [/div]

                      [comment] --- end of textbox --- [/comment]

                    [/div]

                    [comment] --- end of ooc section --- [/comment]

                  [/div]

                [/div]

                [comment] --- start of tab cover --- [/comment]

                [div=/* nameplate */

                position: absolute;

                top: 0;

                right: -20px;

                z-index: 5;]

                  [div=/* speech bubble main */

                  box-sizing: border-box;

                  border: 2px solid var(--White);

                  border-radius: 5px;

                  padding: 6px 0;

                  width: 40px;

                  background: var(--Color01);

                  font-family: var(--HeaderFont);

                  font-size: 12px;

                  line-height: 100%;

                  color: var(--White);

                  text-align: center;

                  text-transform: capitalize;

                  position: relative;

                  float: right;]

                    1

                  [/div]

                  [div=/* speech bubble corner */

                  margin-top: -2px;

                  width: 12px;

                  height: 9px;

                  background: var(--White);

                  clip-path: polygon(0 0, 0% 100%, 100% 0);

                  position: relative;

                  right: 7px;

                  float: right;

                  clear: right;]

                    [div=/* speech bubble corner inner */

                    width: 8px;

                    height: 5px;

                    background: var(--Color01);

                    clip-path: polygon(0 0, 0% 100%, 100% 0);

                    position: relative;

                    left: 2px;]

                    [/div]

                  [/div]

                [/div]

                [comment] --- end of tab cover --- [/comment]

              [/tab]









              [tab=02020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202]

                [div=/* scrollbox outer */

                box-sizing: border-box;

                padding: 0 10px;

                width: calc(100% - 50px);

                height: 500px;

                overflow: hidden;

                position: absolute;

                top: 0;

                z-index: 5;

                line-height: initial;]

                  [div=/* scrollbox inner + flexbox */

                  box-sizing: content-box;

                  padding-right: 50px;

                  width: 100%;

                  height: 500px;

                  overflow-y: scroll;

                  overflow-x: hidden;]

                    [comment] --- start of roles section --- [/comment]

                    [div=/* flexbox */

                    margin-left: -20px;

                    display: flex;

                    flex-flow: row wrap;

                    width: calc(100% + 20px);]

                      [comment] --- start of section header --- [/comment]

                      [div=/* flex LEFT */

                      margin-top: 5px;

                      margin-left: 20px;

                      margin-bottom: 15px;

                      flex: 1;

                      width: 100%;

                      min-width: 150px;]

                        [div=/* subtitle header green border */

                        width: calc(100% - 5px);

                        background: var(--Color02);

                        position: sticky;

                        top: 5px;

                        left: 5px;]

                          [div=/* subtitle header main */

                          padding: 9px 0 7px;

                          width: 100%;

                          background: var(--White);

                          font-family: var(--HeaderFont);

                          font-size: var(--SubheaderSize);

                          font-weight: 700;

                          line-height: 100%;

                          color: var(--Color01);

                          text-align: center;

                          text-transform: uppercase;

                          position: relative;

                          top: -5px;

                          left: -5px;]

                            Roles

                          [/div]

                        [/div]

                      [/div]

                      [comment] --- end of section header --- [/comment]

                      [comment] --- start of role box --- [/comment]

                      [div=/* flex RIGHT */

                      margin-left: 20px;

                      flex: 3;

                      width: 100%;

                      min-width: 250px;]

                        [comment] --- start of role 01 --- [/comment]

                        [div=/* role header */

                        padding-top: 9px;

                        position: relative;]

                          [comment] --- start of character name speech bubble --- [/comment]

                          [div=/* nameplate */

                          position: absolute;

                          top: 0;

                          right: 25px;]

                            [div=/* speech bubble main */

                            box-sizing: border-box;

                            border: 2px solid var(--White);

                            border-radius: 5px;

                            padding: 6px 12px;

                            width: fit-content;

                            background: var(--Color02);

                            font-family: var(--HeaderFont);

                            font-size: 12px;

                            line-height: 100%;

                            color: var(--White);

                            text-align: center;

                            text-transform: capitalize;

                            position: relative;

                            float: right;]

                              Character Name

                            [/div]

                            [div=/* speech bubble corner */

                            margin-top: -2px;

                            width: 12px;

                            height: 9px;

                            background: var(--White);

                            clip-path: polygon(0 0, 0% 100%, 100% 0);

                            position: relative;

                            right: 7px;

                            float: right;

                            clear: right;]

                              [div=/* speech bubble corner inner */

                              width: 8px;

                              height: 5px;

                              background: var(--Color02);

                              clip-path: polygon(0 0, 0% 100%, 100% 0);

                              position: relative;

                              left: 2px;]

                              [/div]

                            [/div]

                          [/div]

                          [comment] --- end of character name speech bubble --- [/comment]

                          [div=/* role image */

                          display: flex;

                          justify-content: center;

                          align-items: center;

                          box-sizing: border-box;

                          border: 10px solid var(--Color01);

                          border-radius: 15px;

                          width: 100%;

                          height: 175px;

                          background: var(--Role01);

                          font-family: var(--HeaderFont);

                          font-size: var(--RoleSize);

                          line-height: 100%;

                          font-weight: 700;

                          color: var(--Color01);

                          text-transform: uppercase;

                          text-align: center;

                          text-shadow: -1px -1px 0 var(--Color01), 1px -1px 0 var(--Color01), -1px 1px 0 var(--Color01), 1px 1px 0 var(--Color01);]

                            Role

                          [/div]

                        [/div]

                        [div=/* role preface */

                        box-sizing: border-box;

                        margin: 15px 0;

                        padding: 7px 20px;

                        background: var(--Color02);

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--White);

                        text-align: justify;

                        font-style: italic;]

                          Blurb here. Pellentesque blandit vehicula pulvinar. Donec magna lectus, blandit non consectetur nec, porttitor sed nulla.

                        [/div]

                        [div=/* role reservation */

                        margin-bottom: 7px;

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: 130%;

                        color: var(--textColor);

                        text-align: justify;

                        font-weight: 700;]

                          Played by:

                        [/div]

                        [div=/* role text */

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--textColor);

                        text-align: justify;]

                          [div=white-space: pre-line;] Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc. Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis. Nullam placerat ex et varius aliquam. Cras in nibh finibus nisl ullamcorper dignissim. Cras volutpat blandit ultricies.



Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.[/div]

                        [/div]

                        [comment] --- end of role 01 --- [/comment]

                        [comment] --- start of role 02 --- [/comment]

                        [div=/* role header */

                        margin-top: 35px;

                        padding-top: 9px;

                        position: relative;]

                          [comment] --- start of character name speech bubble --- [/comment]

                          [div=/* nameplate */

                          position: absolute;

                          top: 0;

                          right: 25px;]

                            [div=/* speech bubble main */

                            box-sizing: border-box;

                            border: 2px solid var(--White);

                            border-radius: 5px;

                            padding: 6px 12px;

                            width: fit-content;

                            background: var(--Color02);

                            font-family: var(--HeaderFont);

                            font-size: 12px;

                            line-height: 100%;

                            color: var(--White);

                            text-align: center;

                            text-transform: capitalize;

                            position: relative;

                            float: right;]

                              Character Name

                            [/div]

                            [div=/* speech bubble corner */

                            margin-top: -2px;

                            width: 12px;

                            height: 9px;

                            background: var(--White);

                            clip-path: polygon(0 0, 0% 100%, 100% 0);

                            position: relative;

                            right: 7px;

                            float: right;

                            clear: right;]

                              [div=/* speech bubble corner inner */

                              width: 8px;

                              height: 5px;

                              background: var(--Color02);

                              clip-path: polygon(0 0, 0% 100%, 100% 0);

                              position: relative;

                              left: 2px;]

                              [/div]

                            [/div]

                          [/div]

                          [comment] --- end of character name speech bubble --- [/comment]

                          [div=/* role image */

                          display: flex;

                          justify-content: center;

                          align-items: center;

                          box-sizing: border-box;

                          border: 10px solid var(--Color01);

                          border-radius: 15px;

                          width: 100%;

                          height: 175px;

                          background: var(--Role02);

                          font-family: var(--HeaderFont);

                          font-size: var(--RoleSize);

                          line-height: 100%;

                          font-weight: 700;

                          color: var(--Color01);

                          text-transform: uppercase;

                          text-align: center;

                          text-shadow: -1px -1px 0 var(--Color01), 1px -1px 0 var(--Color01), -1px 1px 0 var(--Color01), 1px 1px 0 var(--Color01);]

                            Role

                          [/div]

                        [/div]

                        [div=/* role preface */

                        box-sizing: border-box;

                        margin: 15px 0;

                        padding: 7px 20px;

                        background: var(--Color02);

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--White);

                        text-align: justify;

                        font-style: italic;]

                          Blurb here. Pellentesque blandit vehicula pulvinar. Donec magna lectus, blandit non consectetur nec, porttitor sed nulla.

                        [/div]

                        [div=/* role reservation */

                        margin-bottom: 7px;

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: 130%;

                        color: var(--textColor);

                        text-align: justify;

                        font-weight: 700;]

                          Played by:

                        [/div]

                        [div=/* role text */

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--textColor);

                        text-align: justify;]

                          [div=white-space: pre-line;] Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc. Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis. Nullam placerat ex et varius aliquam. Cras in nibh finibus nisl ullamcorper dignissim. Cras volutpat blandit ultricies.



Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.[/div]

                        [/div]

                        [comment] --- end of role 02 --- [/comment]

                        [comment] --- start of role 03 --- [/comment]

                        [div=/* role header */

                        margin-top: 35px;

                        padding-top: 9px;

                        position: relative;]

                          [comment] --- start of character name speech bubble --- [/comment]

                          [div=/* nameplate */

                          position: absolute;

                          top: 0;

                          right: 25px;]

                            [div=/* speech bubble main */

                            box-sizing: border-box;

                            border: 2px solid var(--White);

                            border-radius: 5px;

                            padding: 6px 12px;

                            width: fit-content;

                            background: var(--Color02);

                            font-family: var(--HeaderFont);

                            font-size: 12px;

                            line-height: 100%;

                            color: var(--White);

                            text-align: center;

                            text-transform: capitalize;

                            position: relative;

                            float: right;]

                              Character Name

                            [/div]

                            [div=/* speech bubble corner */

                            margin-top: -2px;

                            width: 12px;

                            height: 9px;

                            background: var(--White);

                            clip-path: polygon(0 0, 0% 100%, 100% 0);

                            position: relative;

                            right: 7px;

                            float: right;

                            clear: right;]

                              [div=/* speech bubble corner inner */

                              width: 8px;

                              height: 5px;

                              background: var(--Color02);

                              clip-path: polygon(0 0, 0% 100%, 100% 0);

                              position: relative;

                              left: 2px;]

                              [/div]

                            [/div]

                          [/div]

                          [comment] --- end of character name speech bubble --- [/comment]

                          [div=/* role image */

                          display: flex;

                          justify-content: center;

                          align-items: center;

                          box-sizing: border-box;

                          border: 10px solid var(--Color01);

                          border-radius: 15px;

                          width: 100%;

                          height: 175px;

                          background: var(--Role03);

                          font-family: var(--HeaderFont);

                          font-size: var(--RoleSize);

                          line-height: 100%;

                          font-weight: 700;

                          color: var(--Color01);

                          text-transform: uppercase;

                          text-align: center;

                          text-shadow: -1px -1px 0 var(--Color01), 1px -1px 0 var(--Color01), -1px 1px 0 var(--Color01), 1px 1px 0 var(--Color01);]

                            Role

                          [/div]

                        [/div]

                        [div=/* role preface */

                        box-sizing: border-box;

                        margin: 15px 0;

                        padding: 7px 20px;

                        background: var(--Color02);

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--White);

                        text-align: justify;

                        font-style: italic;]

                          Blurb here. Pellentesque blandit vehicula pulvinar. Donec magna lectus, blandit non consectetur nec, porttitor sed nulla.

                        [/div]

                        [div=/* role reservation */

                        margin-bottom: 7px;

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: 130%;

                        color: var(--textColor);

                        text-align: justify;

                        font-weight: 700;]

                          Played by:

                        [/div]

                        [div=/* role text */

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--textColor);

                        text-align: justify;]

                          [div=white-space: pre-line;] Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc. Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis. Nullam placerat ex et varius aliquam. Cras in nibh finibus nisl ullamcorper dignissim. Cras volutpat blandit ultricies.



Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.[/div]

                        [/div]

                        [comment] --- end of role 03 --- [/comment]

                        [comment] --- start of role 04 --- [/comment]

                        [div=/* role header */

                        margin-top: 35px;

                        padding-top: 9px;

                        position: relative;]

                          [comment] --- start of character name speech bubble --- [/comment]

                          [div=/* nameplate */

                          position: absolute;

                          top: 0;

                          right: 25px;]

                            [div=/* speech bubble main */

                            box-sizing: border-box;

                            border: 2px solid var(--White);

                            border-radius: 5px;

                            padding: 6px 12px;

                            width: fit-content;

                            background: var(--Color02);

                            font-family: var(--HeaderFont);

                            font-size: 12px;

                            line-height: 100%;

                            color: var(--White);

                            text-align: center;

                            text-transform: capitalize;

                            position: relative;

                            float: right;]

                              Character Name

                            [/div]

                            [div=/* speech bubble corner */

                            margin-top: -2px;

                            width: 12px;

                            height: 9px;

                            background: var(--White);

                            clip-path: polygon(0 0, 0% 100%, 100% 0);

                            position: relative;

                            right: 7px;

                            float: right;

                            clear: right;]

                              [div=/* speech bubble corner inner */

                              width: 8px;

                              height: 5px;

                              background: var(--Color02);

                              clip-path: polygon(0 0, 0% 100%, 100% 0);

                              position: relative;

                              left: 2px;]

                              [/div]

                            [/div]

                          [/div]

                          [comment] --- end of character name speech bubble --- [/comment]

                          [div=/* role image */

                          display: flex;

                          justify-content: center;

                          align-items: center;

                          box-sizing: border-box;

                          border: 10px solid var(--Color01);

                          border-radius: 15px;

                          width: 100%;

                          height: 175px;

                          background: var(--Role04);

                          font-family: var(--HeaderFont);

                          font-size: var(--RoleSize);

                          line-height: 100%;

                          font-weight: 700;

                          color: var(--Color01);

                          text-transform: uppercase;

                          text-align: center;

                          text-shadow: -1px -1px 0 var(--Color01), 1px -1px 0 var(--Color01), -1px 1px 0 var(--Color01), 1px 1px 0 var(--Color01);]

                            Role

                          [/div]

                        [/div]

                        [div=/* role preface */

                        box-sizing: border-box;

                        margin: 15px 0;

                        padding: 7px 20px;

                        background: var(--Color02);

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--White);

                        text-align: justify;

                        font-style: italic;]

                          Blurb here. Pellentesque blandit vehicula pulvinar. Donec magna lectus, blandit non consectetur nec, porttitor sed nulla.

                        [/div]

                        [div=/* role reservation */

                        margin-bottom: 7px;

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: 130%;

                        color: var(--textColor);

                        text-align: justify;

                        font-weight: 700;]

                          Played by:

                        [/div]

                        [div=/* role text */

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--textColor);

                        text-align: justify;]

                          [div=white-space: pre-line;] Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc. Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis. Nullam placerat ex et varius aliquam. Cras in nibh finibus nisl ullamcorper dignissim. Cras volutpat blandit ultricies.



Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.[/div]

                        [/div]

                        [comment] --- end of role 04 --- [/comment]

                        [comment] --- start of role 05 --- [/comment]

                        [div=/* role header */

                        margin-top: 35px;

                        padding-top: 9px;

                        position: relative;]

                          [comment] --- start of character name speech bubble --- [/comment]

                          [div=/* nameplate */

                          position: absolute;

                          top: 0;

                          right: 25px;]

                            [div=/* speech bubble main */

                            box-sizing: border-box;

                            border: 2px solid var(--White);

                            border-radius: 5px;

                            padding: 6px 12px;

                            width: fit-content;

                            background: var(--Color02);

                            font-family: var(--HeaderFont);

                            font-size: 12px;

                            line-height: 100%;

                            color: var(--White);

                            text-align: center;

                            text-transform: capitalize;

                            position: relative;

                            float: right;]

                              Character Name

                            [/div]

                            [div=/* speech bubble corner */

                            margin-top: -2px;

                            width: 12px;

                            height: 9px;

                            background: var(--White);

                            clip-path: polygon(0 0, 0% 100%, 100% 0);

                            position: relative;

                            right: 7px;

                            float: right;

                            clear: right;]

                              [div=/* speech bubble corner inner */

                              width: 8px;

                              height: 5px;

                              background: var(--Color02);

                              clip-path: polygon(0 0, 0% 100%, 100% 0);

                              position: relative;

                              left: 2px;]

                              [/div]

                            [/div]

                          [/div]

                          [comment] --- end of character name speech bubble --- [/comment]

                          [div=/* role image */

                          display: flex;

                          justify-content: center;

                          align-items: center;

                          box-sizing: border-box;

                          border: 10px solid var(--Color01);

                          border-radius: 15px;

                          width: 100%;

                          height: 175px;

                          background: var(--Role05);

                          font-family: var(--HeaderFont);

                          font-size: var(--RoleSize);

                          line-height: 100%;

                          font-weight: 700;

                          color: var(--Color01);

                          text-transform: uppercase;

                          text-align: center;

                          text-shadow: -1px -1px 0 var(--Color01), 1px -1px 0 var(--Color01), -1px 1px 0 var(--Color01), 1px 1px 0 var(--Color01);]

                            Role

                          [/div]

                        [/div]

                        [div=/* role preface */

                        box-sizing: border-box;

                        margin: 15px 0;

                        padding: 7px 20px;

                        background: var(--Color02);

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--White);

                        text-align: justify;

                        font-style: italic;]

                          Blurb here. Pellentesque blandit vehicula pulvinar. Donec magna lectus, blandit non consectetur nec, porttitor sed nulla.

                        [/div]

                        [div=/* role reservation */

                        margin-bottom: 7px;

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: 130%;

                        color: var(--textColor);

                        text-align: justify;

                        font-weight: 700;]

                          Played by:

                        [/div]

                        [div=/* role text */

                        font-family: var(--BodyFont);

                        font-size: var(--BodySize);

                        line-height: var(--BodyLineHeight);

                        color: var(--textColor);

                        text-align: justify;]

                          [div=white-space: pre-line;] Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc. Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis. Nullam placerat ex et varius aliquam. Cras in nibh finibus nisl ullamcorper dignissim. Cras volutpat blandit ultricies.



Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.[/div]

                        [/div]

                        [comment] --- end of role 05 --- [/comment]

                      [/div]

                      [comment] --- end of role box --- [/comment]

                    [/div]

                    [comment] --- end of roles section --- [/comment]

                  [/div]

                [/div]

                [comment] --- start of tab cover --- [/comment]

                [div=/* nameplate */

                position: absolute;

                top: 46px;

                right: -20px;

                z-index: 5;]

                  [div=/* speech bubble main */

                  box-sizing: border-box;

                  border: 2px solid var(--White);

                  border-radius: 5px;

                  padding: 6px 0;

                  width: 40px;

                  background: var(--Color01);

                  font-family: var(--HeaderFont);

                  font-size: 12px;

                  line-height: 100%;

                  color: var(--White);

                  text-align: center;

                  text-transform: capitalize;

                  position: relative;

                  float: right;]

                    2

                  [/div]

                  [div=/* speech bubble corner */

                  margin-top: -2px;

                  width: 12px;

                  height: 9px;

                  background: var(--White);

                  clip-path: polygon(0 0, 0% 100%, 100% 0);

                  position: relative;

                  right: 7px;

                  float: right;

                  clear: right;]

                    [div=/* speech bubble corner inner */

                    width: 8px;

                    height: 5px;

                    background: var(--Color01);

                    clip-path: polygon(0 0, 0% 100%, 100% 0);

                    position: relative;

                    left: 2px;]

                    [/div]

                  [/div]

                [/div]

                [comment] --- end of tab cover --- [/comment]

              [/tab]









              [tab=03030303030303030303030303030303030303030303030303030303030303030303030303030303030303030303030303030303030303]

                [div=/* scrollbox outer */

                box-sizing: border-box;

                padding: 0 10px;

                width: calc(100% - 50px);

                height: 500px;

                overflow: hidden;

                position: absolute;

                top: 0;

                z-index: 5;

                line-height: initial;]

                  [div=/* scrollbox inner + flexbox */

                  box-sizing: content-box;

                  padding-right: 50px;

                  width: 100%;

                  height: 500px;

                  overflow-y: scroll;

                  overflow-x: hidden;]

                    [comment] --- start of rules section --- [/comment]

                    [div=/* flexbox */

                    margin-left: -20px;

                    display: flex;

                    flex-flow: row wrap;

                    width: calc(100% + 20px);]

                      [comment] --- start of section header --- [/comment]

                      [div=/* flex LEFT */

                      margin-top: 5px;

                      margin-left: 20px;

                      margin-bottom: 15px;

                      flex: 1;

                      width: 100%;

                      min-width: 150px;]

                        [div=/* subtitle header green border */

                        width: calc(100% - 5px);

                        background: var(--Color02);

                        position: sticky;

                        top: 5px;

                        left: 5px;]

                          [div=/* subtitle header main */

                          padding: 9px 0 7px;

                          width: 100%;

                          background: var(--White);

                          font-family: var(--HeaderFont);

                          font-size: var(--SubheaderSize);

                          font-weight: 700;

                          line-height: 100%;

                          color: var(--Color01);

                          text-align: center;

                          text-transform: uppercase;

                          position: relative;

                          top: -5px;

                          left: -5px;]

                            Rules

                          [/div]

                        [/div]

                      [/div]

                      [comment] --- end of section header --- [/comment]

                      [comment] --- start of textbox --- [/comment]

                      [div=/* flex RIGHT */

                      margin-left: 20px;

                      flex: 3;

                      width: 100%;

                      min-width: 250px;

                      font-family: var(--BodyFont);

                      font-size: var(--BodySize);

                      line-height: var(--BodyLineHeight);

                      color: var(--textColor);

                      text-align: justify;]

                        [div=white-space: pre-line; margin-top: -20px;]

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi.
                         
Quisque viverra ex nec massa sagittis, vitae elementum lorem malesuada. Aliquam a augue at risus venenatis interdum. Integer at justo viverra, sodales metus non, dapibus nunc.
                         
Quisque nec justo imperdiet, tincidunt ante interdum, scelerisque purus. Suspendisse efficitur mollis metus. Donec viverra gravida rutrum. Morbi pretium diam eget eros auctor rhoncus a in felis.
                         
Suspendisse et scelerisque felis. Proin pellentesque viverra lectus id eleifend. Nam rutrum at arcu convallis ultrices. Nulla facilisi. Aenean eu porttitor odio, nec efficitur tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                         
Pellentesque blandit vehicula pulvinar. Donec magna lectus, blandit non consectetur nec, porttitor sed nulla. Donec quis mattis lorem. Pellentesque a turpis ultricies, placerat orci in, mattis urna.
                         
Suspendisse et scelerisque felis.
                         
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quam sapien, condimentum sit amet nunc id, maximus sodales diam. Nulla facilisi. Quisque viverra ex nec massa sagittis.
                       
[/div]

                      [/div]

                      [comment] --- end of textbox --- [/comment]

                    [/div]

                    [comment] --- end of rules section --- [/comment]

                  [/div]

                [/div]

                [comment] --- start of tab cover --- [/comment]

                [div=/* nameplate */

                position: absolute;

                top: 92px;

                right: -20px;

                z-index: 5;]

                  [div=/* speech bubble main */

                  box-sizing: border-box;

                  border: 2px solid var(--White);

                  border-radius: 5px;

                  padding: 6px 0;

                  width: 40px;

                  background: var(--Color01);

                  font-family: var(--HeaderFont);

                  font-size: 12px;

                  line-height: 100%;

                  color: var(--White);

                  text-align: center;

                  text-transform: capitalize;

                  position: relative;

                  float: right;]

                    3

                  [/div]

                  [div=/* speech bubble corner */

                  margin-top: -2px;

                  width: 12px;

                  height: 9px;

                  background: var(--White);

                  clip-path: polygon(0 0, 0% 100%, 100% 0);

                  position: relative;

                  right: 7px;

                  float: right;

                  clear: right;]

                    [div=/* speech bubble corner inner */

                    width: 8px;

                    height: 5px;

                    background: var(--Color01);

                    clip-path: polygon(0 0, 0% 100%, 100% 0);

                    position: relative;

                    left: 2px;]

                    [/div]

                  [/div]

                [/div]

                [comment] --- end of tab cover --- [/comment]

              [/tab]









            [/tabs]

          [/div]

        [/div]

      [/div]

      [comment] --- end of tabs --- [/comment]

    [/div]

    [comment] --- start of credits --- [/comment]

    [div=margin-top: -50px;

    padding: 5px 0 4px;

    width: 100%;

    font-family: var(--BodyFont);

    font-size: .6em;

    line-height: 100%;

    text-align: center;

    text-transform: uppercase;

    background: var(--Color01);

    color: var(--White);]

      Code by Nano

    [/div]

    [comment] --- end of credits --- [/comment]

  [/div]

[/div]

[/nobr]





[nobr]

[div=

  width: 100%;

  position: relative;

  overflow: hidden;

  font-size: initial;

  line-height: initial;]

  [comment]

    Designed and coded by [USER=20950]@Nano[/USER].



    Please do not remove the credits or claim the code as your own work.



    If you found this code outside of my public workshop, please don't use it.

    I'd greatly appreciate it if you used the version of the code in that thread.



    [font=Poppins]sans-serif[/font]

    [font=Hind]serif[/font]

  [/comment]

  [div="

  /* <--------------------------------- general accents ---------------------------------> */



  /* colors */

  --Color01: #f98e8d; /* this is the red in the original */

  --Color02: #bde6d6; /* this is the green in the original */

  --bgColor: #f7e6e7;

  --textColor: #d13c3a;

  --White: #fefefe;



  /* fonts */

  --HeaderFont: 'Poppins', san-serif;

  --BodyFont: 'Hind', serif;



  --HeaderSize: 3em; /* font size of the titles of each role within role images */

  --BodySize: .92em; /* font size of body text */



  --BodyLineHeight: 150%;



  /* <--------------------------------- images ---------------------------------> */



  --mainIMG: url(https://i.imgur.com/F4Uui1Z.jpeg) top center/cover no-repeat;



  width: 100%;

  min-width: 300px;

  background: var(--bgColor);"]

    [div=/* code wrap */

    display: flex;

    justify-content: center;

    padding: 75px 25px 50px;

    width: calc(100% - 50px);

    min-width: 250px;]

      [div=/* flex start */

      display: flex;

      flex-flow: row wrap;

      justify-content: center;

      margin-left: -25px;

      width: calc(100% + 25px);

      max-width: 800px;]

        [comment] --- start of lefthand --- [/comment]

        [div=/* flex LEFT */

        display: flex;

        justify-content: center;

        align-items: center;

        box-sizing: border-box;

        border: 10px solid var(--Color01);

        border-radius: 15px;

        margin-left: 25px;

        flex: 1;

        width: 100%;

        min-width: 200px;

        min-height: 300px;

        max-height: 400px;

        background: var(--mainIMG);

        position: relative;]

          [comment] --- start of character name --- [/comment]

          [div=/* character name wrapper */

          font-family: var(--HeaderFont);

          font-size: var(--BodySize);

          line-height: 100%;

          color: var(--White);

          text-transform: capitalize;

          position: absolute;

          top: 20px;

          right: -40px;]

            [div=/* speech bubble main */

            box-sizing: border-box;

            border: 2px solid var(--White);

            border-radius: 5px;

            padding: 6px 12px;

            width: fit-content;

            background: var(--Color02);

            font-size: var(--BodySize);

            position: relative;

            float: right;]

              Character Name

            [/div]

            [div=/* speech bubble corner */

            margin-top: -2px;

            width: 15px;

            height: 12px;

            background: var(--White);

            clip-path: polygon(0 0, 0% 100%, 100% 0);

            position: relative;

            right: 10px;

            float: right;

            clear: right;]

              [div=/* speech bubble corner inner */

              width: 11px;

              height: 8px;

              background: var(--Color02);

              clip-path: polygon(0 0, 0% 100%, 100% 0);

              position: relative;

              left: 2px;]

              [/div]

            [/div]

          [/div]

          [comment] --- end of character name --- [/comment]

          [comment] --- start of role name --- [/comment]

          [div=/* role name */

          font-family: var(--HeaderFont);

          font-size: var(--HeaderSize);

          line-height: 100%;

          color: var(--Color01);

          font-weight: 700;

          text-transform: uppercase;

          text-shadow: -1px -1px 0 var(--Color01), 1px -1px 0 var(--Color01), -1px 1px 0 var(--Color01), 1px 1px 0 var(--Color01);]

            Role

          [/div]

          [comment] --- end of role name --- [/comment]

        [/div]

        [comment] --- end of lefthand --- [/comment]

        [comment] --- start of righthand --- [/comment]

        [div=/* flex RIGHT */

        margin-left: 25px;

        flex: 2;

        width: 100%;

        min-height: 300px;

        font-family: var(--BodyFont);

        font-size: var(--BodySize);

        line-height: var(--BodyLineHeight);

        color: var(--textColor);

        text-align: justify;]

          [comment] --- start of basic info tags --- [/comment]

          [div=/* tag wrapper */

          margin-top: 20px;

          margin-bottom: 20px;

          line-height: initial;

          color: var(--Color01);

          font-weight: 700;

          text-align: right;

          text-transform: lowercase;]

            [div=/* tag 01 */

            border-right: 5px solid var(--Color02);

            margin-bottom: 5px;

            padding: 3px 8px 3px 0;

            width: calc(100% - 12px);

            line-height: 100%;]

              age

            [/div]

            [div=/* tag 02 */

            border-right: 5px solid var(--Color02);

            margin-bottom: 5px;

            padding: 3px 8px 3px 0;

            width: calc(100% - 12px);

            line-height: 100%;]

              gender

            [/div]

          [/div]

          [comment] --- end of basic info tags --- [/comment]

          [comment] --- start of app text --- [/comment]

          [div=white-space: pre-line;]Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi dignissim urna sed eleifend pharetra. Nulla ultricies iaculis justo, eget dignissim augue iaculis a. Proin hendrerit iaculis lectus, quis scelerisque nibh volutpat ut. Ut viverra sapien pretium ipsum cursus maximus. Proin sit amet elit vitae mauris vehicula mattis. Curabitur mi augue, sagittis eget dignissim vel, viverra nec libero. Morbi ut ornare enim, quis ornare dolor. Nullam malesuada purus tellus, eu vestibulum metus interdum nec. Fusce cursus ligula ut laoreet tempor. Integer nulla nisl, lacinia sed sem ac, viverra interdum lorem. Donec sit amet nisi odio. Etiam tortor risus, venenatis varius fringilla id, bibendum a mi.



Praesent interdum commodo fermentum. Etiam suscipit ipsum ut tellus lacinia, quis dictum augue iaculis. Suspendisse ultricies ornare mi, vel pulvinar nisi ornare quis. Donec facilisis venenatis ipsum, quis rhoncus ex consectetur vitae. Praesent rhoncus pretium rhoncus. Sed interdum, turpis quis vehicula ultrices, justo nisi posuere tellus, quis egestas augue nulla vitae ipsum. In libero felis, finibus et magna a, aliquam aliquet odio. Proin vitae viverra libero, ut facilisis turpis. Sed malesuada ante ligula, id tristique purus imperdiet quis. Quisque tempus eget est malesuada imperdiet. Nullam tincidunt orci est, eget tristique mi vulputate vel. Ut eu lorem non turpis sodales rhoncus et vel ligula. Nunc vulputate ut dolor sed lacinia. Duis et nisl neque. Mauris diam tellus, feugiat quis orci quis, semper dictum libero. Curabitur dapibus erat imperdiet eros bibendum elementum.[/div]

          [comment] --- end of app text --- [/comment]

        [/div]

        [comment] --- end of righthand --- [/comment]

      [/div]

    [/div]

  [/div]

[/div]

[div=margin-top: 5px; width: 100%; font-size: .6em; line-height: 100%; text-align: center; text-transform: uppercase; opacity: .6;]Code by Nano[/div]

[/nobr]