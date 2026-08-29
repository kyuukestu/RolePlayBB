  const Pokemon = {
      name: "Jue-Jue",
      species: "Zorua-Hisui",
      ability: {
          name: "Illusion",
          description:
              "Takes the appearance of the last conscious party Pokémon upon being sent out until hit by a damaging move.",
      },
      nature: "Timid",
      gender: "female",
      level: 15,
      dc: 11,
      form: "Base Form",
      origin: "Starter",
      item: "None",
      dexNumber: "0821",
      types: ["Normal", "Ghost"],

      sprite: "https://files.jcink.net/uploads2/serenedreams/PokemonSprite/zorua_hisui.png",

      affection: {
          hearts: 3,
          max: 10,
          tier: 3,
      },

      stats: {
          hp: {
              value: 37,
              iv: 13,
              ev: 0,
          },
          atk: {
              value: 24,
              iv: 29,
              ev: 0,
          },
          def: {
              value: 17,
              iv: 6,
              ev: 0,
          },
          spa: {
              value: 32,
              iv: 15,
              ev: 0,
          },
          spd: {
              value: 18,
              iv: 13,
              ev: 0,
          },
          spe: {
              value: 33,
              iv: 28,
              ev: 0,
          },
      },

      moves: [
          {
              name: "Leer",
              level: 1,
              type: "Normal",
              category: "Status",
              power: "—",
              description: "Lowers the target’s Defense by one stage.",
          },
          {
              name: "Scratch",
              level: 1,
              type: "Normal",
              category: "Physical",
              power: 20,
              description:
                  "Inflicts regular damage with no additional effect.",
          },
          {
              name: "Shadow Sneak",
              level: 1,
              type: "Ghost",
              category: "Physical",
              power: 20,
              description:
                  "Inflicts regular damage with no additional effect.",
          },
          {
              name: "Torment",
              level: 4,
              type: "Dark",
              category: "Status",
              power: "—",
              description:
                  "Prevents the target from using the same move twice in a row.",
          },
          {
              name: "Snarl",
              level: 6,
              type: "Dark",
              category: "Special",
              power: 27,
              description:
                  "Has a chance to lower the target’s Special Attack by one stage.",
          },
          {
              name: "Hone Claws",
              level: 8,
              type: "Dark",
              category: "Status",
              power: "—",
              description:
                  "Raises the user’s Attack and accuracy by one stage.",
          },
          {
              name: "Swift",
              level: 11,
              type: "Normal",
              category: "Special",
              power: 30,
              description: "Never misses.",
          },
      ],
  };
