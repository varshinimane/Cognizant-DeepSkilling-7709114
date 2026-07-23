import React, { Component } from "react";
import GitClient from "./Gitclient";

class App extends Component {

  constructor() {
    super();

    this.state = {
      repos: []
    };
  }

  componentDidMount() {

    GitClient.getRepositories("techiesyed")
      .then(data => {
        this.setState({
          repos: data
        });
      });

  }

  render() {

    return (
      <div style={{marginLeft:"30px"}}>
        <h2>GitHub Repository Names</h2>

        <ul>
          {
            this.state.repos.map((repo,index)=>(
              <li key={index}>{repo}</li>
            ))
          }
        </ul>

      </div>
    );
  }

}

export default App;