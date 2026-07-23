import React, { useState } from "react";

function Register() {
  const [form, setForm] = useState({
    name: "",
    email: "",
    password: ""
  });

  const [errors, setErrors] = useState({});

  // Event Handler
  const handleChange = (e) => {
    const { name, value } = e.target;

    setForm({
      ...form,
      [name]: value
    });
  };

  // Form Submit
  const handleSubmit = (e) => {
    e.preventDefault();

    let error = {};

    // Name Validation
    if (form.name.length < 5) {
      error.name = "Name should have atleast 5 characters";
    }

    // Email Validation
    if (!(form.email.includes("@") && form.email.includes("."))) {
      error.email = "Enter a valid Email";
    }

    // Password Validation
    if (form.password.length < 8) {
      error.password = "Password should have atleast 8 characters";
    }

    setErrors(error);

    if (Object.keys(error).length === 0) {
      alert("Registration Successful");
    }
  };

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Mail Registration Form</h2>

      <form onSubmit={handleSubmit}>

        <div>
          <label>Name : </label>
          <input
            type="text"
            name="name"
            value={form.name}
            onChange={handleChange}
          />
          <br />
          <span style={{ color: "red" }}>{errors.name}</span>
        </div>

        <br />

        <div>
          <label>Email : </label>
          <input
            type="text"
            name="email"
            value={form.email}
            onChange={handleChange}
          />
          <br />
          <span style={{ color: "red" }}>{errors.email}</span>
        </div>

        <br />

        <div>
          <label>Password : </label>
          <input
            type="password"
            name="password"
            value={form.password}
            onChange={handleChange}
          />
          <br />
          <span style={{ color: "red" }}>{errors.password}</span>
        </div>

        <br />

        <button type="submit">Register</button>

      </form>
    </div>
  );
}

export default Register;