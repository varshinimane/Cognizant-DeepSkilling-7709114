import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const average = props.Total / props.Goal;

    return(
        <div className="box">

            <h2>Student Management Portal</h2>

            <p>Name : {props.Name}</p>

            <p>School : {props.School}</p>

            <p>Total Marks : {props.Total}</p>

            <p>Number of Subjects : {props.Goal}</p>

            <h3>Average Score : {average}</h3>

        </div>
    );

}

export default CalculateScore;