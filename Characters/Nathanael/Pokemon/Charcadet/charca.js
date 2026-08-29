const Pokemon = {
    name: "Charcadet ",
    species: "charcadet",
    ability: {
        name: "Flash Fire",
        description: "Protects against Fire moves. Once one has been blocked, the Pokemons own Fire moves inflict 1.5x damage until it leaves battle.",
    },
    nature: "Careful",
    gender: "female",
    level: 5,
    dc: 13,
    form: "Base Form",
    origin: "Hatch",
    item: "None",
    dexNumber: "0821",
    types: ["Fire"],

    sprite: "https://files.jcink.net/uploads2/serenedreams/PokemonSprite/charcadet.png",

    affection: {
        hearts: 1,
        max: 10,
        tier: 1,
    },

    stats: {
        hp: {
            value: 20,
            iv: 21,
            ev: 0,
        },
        atk: {
            value: 11,
            iv: 29,
            ev: 0,
        },
        def: {
            value: 09,
            iv: 08,
            ev: 0,
        },
        spa: {
            value: 9,
            iv: 11,
            ev: 0,
        },
        spd: {
            value: 11,
            iv: 25,
            ev: 0,
        },
        spe: {
            value: 10,
            iv: 30,
            ev: 0,
        },
    },

    moves: [
        {
            name: "Astonish",
            level: 1,
            type: "Ghost",
            category: "Physical",
            power: 15,
            description: "Has a chance to make the target flinch.",
        },
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
            description: "Lowers the target’s Defense by one stage.",
        },
        {
            name: "Disable",
            level: "TM",
            type: "Normal",
            category: "Status",
            power: "—",
            description:
                "Disables the target’s last used move for 1-8 turns.",
        },
        {
            name: "Destiny Bond",
            level: "TM",
            type: "Ghost",
            category: "Status",
            power: "—",
            description:
                "If the user faints this turn, the target automatically will, too.",
        },
    ],
};
