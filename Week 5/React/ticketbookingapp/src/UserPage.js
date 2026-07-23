import React from "react";

function UserPage() {
  return (
    <div>
      <h1>Welcome Back</h1>

      <h2>Flight Details</h2>

      <table border="1">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Price</th>
            <th>Booking</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Indigo</td>
            <td>Chennai</td>
            <td>Bangalore</td>
            <td>₹4000</td>
            <td>
              <button>Book Ticket</button>
            </td>
          </tr>

          <tr>
            <td>Air India</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹6500</td>
            <td>
              <button>Book Ticket</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default UserPage;