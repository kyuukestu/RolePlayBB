const Pokemon = {
    name: "Rhiannon",
    species: "Noibat",
    ability: {
        name: "Telepathy",
        description: "Protects against friendly Pokemons damaging moves.",
    },
    nature: "Lax",
    gender: "female",
    level: 5,
    dc: 13,
    form: "Base Form",
    origin: "Hatch",
    item: "None",
    dexNumber: "0821",
    types: ["Flying", "Dragon"],

    sprite: "https://files.jcink.net/uploads2/serenedreams/PokemonSprite/egg.png",

    affection: {
        hearts: 1,
        max: 10,
        tier: 1,
    },

    stats: {
        hp: {
            value: 19,
            iv: 16,
            ev: 0,
        },
        atk: {
            value: 8,
            iv: 6,
            ev: 0,
        },
        def: {
            value: 10,
            iv: 25,
            ev: 0,
        },
        spa: {
            value: 10,
            iv: 21,
            ev: 0,
        },
        spd: {
            value: 9,
            iv: 31,
            ev: 0,
        },
        spe: {
            value: 11,
            iv: 22,
            ev: 0,
        },
    },

    moves: [
        {
            name: "Absorb",
            level: 1,
            type: "Grass",
            category: "Special",
            power: 10,
            description:
                "Drains half the damage inflicted to heal the user.",
        },
        {
            name: "Screech",
            level: 1,
            type: "Normal",
            category: "Status",
            power: "—",
            description:
                "Lowers the target’s Defense by two stages.",
        },
        {
            name: "Supersonic",
            level: 1,
            type: "Normal",
            category: "Status",
            power: "—",
            description:
                "Confuses the target.",
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
            name: "Gust",
            level: 4,
            type: "Flying",
            category: "Special",
            power: 20,
            description:
                "Inflicts regular damage and can hit Pokémon in the air.",
        },
        {
            name: "Leech Life",
            level: 5,
            type: "Bug",
            category: "Physical",
            power: 40,
            description:
                "Drains half the damage inflicted to heal the user.",
        },
        {
            name: "Defog",
            level: "—",
            type: "Flying",
            category: "Status",
            power: "—",
            description:
                "Lowers the target’s evasion by one stage. Removes field effects from the enemy field.",
        },
        {
            name: "Tailwind",
            level: "—",
            type: "Flying",
            category: "Status",
            power: "—",
            description:
                "For three turns, friendly Pokémon have doubled Speed.",
        },
        {
            name: "Snatch",
            level: "—",
            type: "Dark",
            category: "Status",
            power: "—",
            description:
                "Steals the target’s move, if it’s self-targeted.",
        },
        {
            name: "Switcheroo",
            level: "—",
            type: "Dark",
            category: "Status",
            power: "—",
            description:
                "User and target swap items.",
        },
    ],
};
