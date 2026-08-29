        const Pokemon = {
            name: "Azalais",
            species: "piplup",
            ability: {
                name: "Competitive",
                description: "Raises Special Attack by two stages upon having any stat lowered.",
            },
            nature: "Docile",
            gender: "female",
            level: 5,
            dc: 11,
            form: "Base Form",
            origin: "Hatch",
            item: "None",
            dexNumber: "0821",
            types: ["Water"],

            sprite: "https://files.jcink.net/uploads2/serenedreams/PokemonSprite/egg.png",

            affection: {
                hearts: 1,
                max: 10,
                tier: 1,
            },

            stats: {
                hp: {
                    value: 21,
                    iv: 28,
                    ev: 0,
                },
                atk: {
                    value: 11,
                    iv: 24,
                    ev: 0,
                },
                def: {
                    value: 10,
                    iv: 08,
                    ev: 0,
                },
                spa: {
                    value: 12,
                    iv: 20,
                    ev: 0,
                },
                spd: {
                    value: 11,
                    iv: 23,
                    ev: 0,
                },
                spe: {
                    value: 09,
                    iv: 02,
                    ev: 0,
                },
            },

            moves: [
              {
                      name: "Pound",
                      level: 1,
                      type: "Normal",
                      category: "Physical",
                      power: 20,
                      description: "Inflicts regular damage with no additional effect.",
                  },
                  {
                      name: "Tackle",
                      level: 1,
                      type: "Normal",
                      category: "Physical",
                      power: 20,
                      description: "Inflicts regular damage with no additional effect.",
                  },
                  {
                      name: "Growl",
                      level: 4,
                      type: "Normal",
                      category: "Status",
                      power: "—",
                      description: "Lowers the target’s Attack by one stage.",
                  },
                {
                    name: "Bide",
                    level: "—",
                    type: "Normal",
                    category: "Physical",
                    power: "—",
                    description:
                        "User waits for two turns, then hits back for twice the damage it took.",
                },
                {
                    name: "Flail",
                    level: "—",
                    type: "Normal",
                    category: "Physical",
                    power: "—",
                    description:
                        "Inflicts more damage when the user has less HP remaining, with a maximum of 200 power.",
                },
                {
                    name: "Mud Slap",
                    level: "—",
                    type: "Ground",
                    category: "Special",
                    power: 10,
                    description: "Has a chance to lower the target’s accuracy by one stage.",
                },
                {
                    name: "Roost",
                    level: "—",
                    type: "Flying",
                    category: "Status",
                    power: "—",
                    description: "Heals the user by half its max HP.",
                },
            ],
        };
