import React from "react";

function GuestPage() {
  return (
    <div>
      <h1>Please Sign Up</h1>

      <h2>Flight Details</h2>

      <table border="1">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Indigo</td>
            <td>Chennai</td>
            <td>Bangalore</td>
            <td>₹4000</td>
          </tr>

          <tr>
            <td>Air India</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹6500</td>
          </tr>
        </tbody>
      </table>

      <p>Login to book your tickets.</p>
    </div>
  );
}

export default GuestPage;