const Pokemon = {
    name: "Rookidee",
    species: "Rookidee",
    ability: {
        name: "Keen Eye",
        description: "Prevents Accuracy from being lowered.",
    },
    nature: "Naughty",
    gender: "male",
    level: 5,
    dc: 11,
    form: "Base Form",
    origin: "Hatch",
    item: "None",
    dexNumber: "0821",
    types: ["Flying"],

    sprite: "https://files.jcink.net/uploads2/serenedreams/PokemonSprite/rookidee_s.png",

    affection: {
        hearts: 0,
        max: 10,
        tier: 0,
    },

    stats: {
        hp: {
            value: 20,
            iv: 25,
            ev: 0,
        },
        atk: {
            value: 12,
            iv: 31,
            ev: 0,
        },
        def: {
            value: 8,
            iv: 4,
            ev: 0,
        },
        spa: {
            value: 9,
            iv: 29,
            ev: 0,
        },
        spd: {
            value: 7,
            iv: 5,
            ev: 0,
        },
        spe: {
            value: 12,
            iv: 31,
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
            name: "Peck",
            level: 1,
            type: "Flying",
            category: "Physical",
            power: 35,
            description: "Inflicts regular damage.",
        },
        {
            name: "Power Trip",
            level: 4,
            type: "Dark",
            category: "Physical",
            power: 20,
            description: "Power increases based on the user's stat boosts.",
        },
        {
            name: "Rock Smash",
            level: 1,
            type: "Fighting",
            category: "Physical",
            power: 40,
            description: "May lower the target’s Defense.",
        },
        {
            name: "Defog",
            level: 1,
            type: "Flying",
            category: "Status",
            power: "—",
            description: "Lowers evasion and removes battlefield effects.",
        },
        {
            name: "Roost",
            level: 1,
            type: "Flying",
            category: "Status",
            power: "—",
            description: "Restores half of the user's maximum HP.",
        },
        {
            name: "Sky Attack",
            level: 1,
            type: "Flying",
            category: "Physical",
            power: 140,
            description:
                "Charges before attacking and may cause flinching.",
        },
    ],
};
