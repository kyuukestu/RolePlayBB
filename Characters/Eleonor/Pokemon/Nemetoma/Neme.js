const Pokemon = {
  name: "Nematoma",
  species: "hatenna",
  ability: {
    name: "Anticipation",
    description: "",
  },
  nature: "Impish",
  gender: "female",
  level: 5,
  dc: 11,
  form: "Base Form",
  origin: "Hatch",
  item: "None",
  dexNumber: "0856",
  types: ["Psychic"],

  sprite:
    "https://files.jcink.net/uploads2/serenedreams/PokemonSprite/hatenna.png",

  affection: {
    hearts: 1,
    max: 10,
    tier: 1,
  },

  stats: {
    hp: {
      value: 19,
      iv: 9,
      ev: 0,
    },
    atk: {
      value: 9,
      iv: 31,
      ev: 0,
    },
    def: {
      value: 11,
      iv: 15,
      ev: 0,
    },
    spa: {
      value: 10,
      iv: 23,
      ev: 0,
    },
    spd: {
      value: 10,
      iv: 2,
      ev: 0,
    },
    spe: {
      value: 9,
      iv: 13,
      ev: 0,
    },
  },

  moves: [
    {
      name: "Confusion",
      level: 1,
      type: "Psychic",
      category: "Special",
      power: 25,
      description: "Has a chance to confuse the target.",
    },
    {
      name: "Play Nice",
      level: 1,
      type: "Normal",
      category: "Status",
      power: null,
      description: "Lowers the target’s Attack by one stage.",
    },
    {
      name: "Life Dew",
      level: 5,
      type: "Water",
      category: "Status",
      power: null,
      description:
        "Each Pokémon on the user’s side restores 1/4 of its maximum HP, rounded half up.",
    },
    {
      name: "Nuzzle",
      level: null,
      type: "Electric",
      category: "Physical",
      power: 10,
      description: "Has a chance to paralyze the target.",
    },
    {
      name: "After You",
      level: null,
      type: "Normal",
      category: "Status",
      power: null,
      description: "Makes the target act next this turn.",
    },
    {
      name: "Mystical Fire",
      level: null,
      type: "Fire",
      category: "Special",
      power: 37,
      description:
        "Has a chance to lower the target’s Special Attack by one stage.",
    },
    {
      name: "Quash",
      level: null,
      type: "Dark",
      category: "Status",
      power: null,
      description: "Makes the target act last this turn.",
    },
  ],
};
