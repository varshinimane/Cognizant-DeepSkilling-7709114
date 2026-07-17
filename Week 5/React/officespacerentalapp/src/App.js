import React from "react";
import officeImage from "./Images/office.jpg";

function App() {

  const office = {
    Name: "ABC Tech Park",
    Rent: 55000,
    Address: "Madhapur, Hyderabad"
  };

  const officeList = [
    {
      Name: "ABC Tech Park",
      Rent: 55000,
      Address: "Hyderabad"
    },
    {
      Name: "Global Towers",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "Cyber Plaza",
      Rent: 65000,
      Address: "Chennai"
    }
  ];

  return (

    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="400"
        height="250"
      />

      <h2>Single Office Details</h2>

      <p><b>Name :</b> {office.Name}</p>

      <p>
        <b>Rent :</b>

        <span
          style={{
            color: office.Rent < 60000 ? "red" : "green"
          }}
        >
          {office.Rent}
        </span>

      </p>

      <p><b>Address :</b> {office.Address}</p>

      <hr />

      <h2>Office List</h2>

      {
        officeList.map((item, index) => (

          <div key={index}>

            <p><b>Name :</b> {item.Name}</p>

            <p>

              <b>Rent :</b>

              <span
                style={{
                  color: item.Rent < 60000 ? "red" : "green"
                }}
              >
                {item.Rent}
              </span>

            </p>

            <p><b>Address :</b> {item.Address}</p>

            <hr />

          </div>

        ))
      }

    </div>

  );

}

export default App;