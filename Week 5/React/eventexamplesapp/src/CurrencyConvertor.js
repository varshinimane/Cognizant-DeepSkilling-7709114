import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);

    this.state = {
      rupees: "",
      euro: ""
    };
  }

  handleChange = (event) => {
    this.setState({
      rupees: event.target.value
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const euro = this.state.rupees / 90;

    this.setState({
      euro: euro.toFixed(2)
    });
  };

  render() {
    return (
      <div>
        <h1>Currency Convertor</h1>

        <form onSubmit={this.handleSubmit}>

          <label>
            Indian Rupees:
          </label>

          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
          />

          <br /><br />

          <button type="submit">
            Convert
          </button>

        </form>

        {this.state.euro && (
          <h3>Euro: {this.state.euro}</h3>
        )}

      </div>
    );
  }
}

export default CurrencyConvertor;