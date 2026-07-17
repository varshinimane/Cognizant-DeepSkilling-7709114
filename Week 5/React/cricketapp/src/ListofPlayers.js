import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat", score: 98 },
        { name: "Rohit", score: 82 },
        { name: "Gill", score: 75 },
        { name: "Rahul", score: 65 },
        { name: "Hardik", score: 55 },
        { name: "Jadeja", score: 80 },
        { name: "Ashwin", score: 45 },
        { name: "Shami", score: 72 },
        { name: "Bumrah", score: 60 },
        { name: "Siraj", score: 68 },
        { name: "Kuldeep", score: 88 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (

        <div>

            <h2>List of Players</h2>

            {
                players.map((player, index) =>

                    <p key={index}>
                        {player.name} - {player.score}
                    </p>

                )
            }

            <h2>Players having score below 70</h2>

            {
                below70.map((player, index) =>

                    <p key={index}>
                        {player.name} - {player.score}
                    </p>

                )
            }

        </div>

    );
}

export default ListofPlayers;