 const Pokemon = {
     name: "Mór-Ríoghain",
     species: "Growlithe-Hisui",
     ability: {
         name: "Rock Head",
         description: "Protects against recoil damage.",
     },
     nature: "Gentle",
     gender: "female",
     level: 15,
     dc: 13,
     form: "Base Form",
     origin: "Starter",
     item: "None",
     dexNumber: "0821",
     types: ["Fire", "Rock"],

     sprite: "https://files.jcink.net/uploads2/serenedreams/PokemonSprite/growlithe_hisui.png",

     affection: {
         hearts: 5,
         max: 10,
         tier: 5,
     },

     stats: {
         hp: {
             value: 45,
             iv: 17,
             ev: 0,
         },
         atk: {
             value: 27,
             iv: 0,
             ev: 0,
         },
         def: {
             value: 16,
             iv: 0,
             ev: 0,
         },
         spa: {
             value: 28,
             iv: 28,
             ev: 0,
         },
         spd: {
             value: 25,
             iv: 20,
             ev: 0,
         },
         spe: {
             value: 23,
             iv: 13,
             ev: 0,
         },
     },

     moves: [
         {
             name: "Ember",
             level: 1,
             type: "Fire",
             category: "Special",
             power: 20,
             description: "Has a chance to burn the target.",
         },
         {
             name: "Leer",
             level: 1,
             type: "Normal",
             category: "Status",
             power: "—",
             description: "Lowers the target's Defense by one stage.",
         },
         {
             name: "Tackle",
             level: 1,
             type: "Normal",
             category: "Physical",
             power: 20,
             description:
                 "Inflicts regular damage with no additional effect.",
         },
         {
             name: "Howl",
             level: 4,
             type: "Normal",
             category: "Status",
             power: "—",
             description: "Raises the user's Attack by one stage.",
         },
         {
             name: "Bite",
             level: 8,
             type: "Dark",
             category: "Physical",
             power: 30,
             description: "Has a chance to make the target flinch.",
         },
         {
             name: "Flame Wheel",
             level: 12,
             type: "Fire",
             category: "Physical",
             power: 30,
             description:
                 "Has a chance to burn the target. Lets frozen Pokémon thaw themselves.",
         },
         {
             name: "Fire Fang",
             level: 15,
             type: "Fire",
             category: "Physical",
             power: 32,
             description:
                 "Has a chance to burn the target and make it flinch.",
         },
     ],
 };
