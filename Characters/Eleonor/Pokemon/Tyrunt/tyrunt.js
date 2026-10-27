const Pokemon = {
  name: "",
  species: "tyrunt",
  ability: {
    name: "Sturdy",
    description: "",
  },
  nature: "Hasty",
  gender: "female",
  level: 5,
  dc: 13,
  form: "Base Form",
  origin: "Hatch",
  item: "None",
  dexNumber: "0856",
  types: ["Rock", "Dragon"],


  affection: {
    hearts: 1,
    max: 10,
    tier: 1,
  },

  stats: {
    hp: {
      value: 22,
      iv: 31,
      ev: 0,
    },
    atk: {
      value: 15,
      iv: 31,
      ev: 0,
    },
    def: {
      value: 11,
      iv: 12,
      ev: 0,
    },
    spa: {
      value: 11,
      iv: 31,
      ev: 0,
    },
    spd: {
      value: 11,
      iv: 31,
      ev: 0,
    },
    spe: {
      value: 12,
      iv: 31,
      ev: 0,
    },
  },

  moves:[
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
          name: "Tail Whip",
          level: 1,
          type: "Normal",
          category: "Status",
          power: null,
          description:
              "Lowers the target’s Defense by one stage.",
      },
      {
          name: "Roar",
          level: 4,
          type: "Normal",
          category: "Status",
          power: null,
          description:
              "Immediately ends wild battles. Forces trainers to switch Pokémon.",
      },
      {
          name: "Ice Fang",
          level: null,
          type: "Ice",
          category: "Physical",
          power: 32,
          description:
              "Has a chance to freeze the target and a chance to make the target flinch.",
      },
      {
          name: "Dragon Dance",
          level: null,
          type: "Dragon",
          category: "Status",
          power: null,
          description:
              "Raises the user’s Attack and Speed by one stage.",
      },
      {
          name: "Rock Polish",
          level: null,
          type: "Rock",
          category: "Status",
          power: null,
          description:
              "Raises the user’s Speed by two stages.",
      },
      {
          name: "Poison Fang",
          level: null,
          type: "Poison",
          category: "Physical",
          power: 25,
          description:
              "Has a chance to badly poison the target.",
      },
  ],
};
