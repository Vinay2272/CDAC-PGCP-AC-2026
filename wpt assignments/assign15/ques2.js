import React, { Component } from "react";

class LoginForm extends Component {
  constructor() {
    super();
    this.state = { username: "", password: "", msg: "" };

    this.handleChange = this.handleChange.bind(this);
    this.login = this.login.bind(this);
  }

  handleChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  login() {
    if (
      this.state.username === "iet" &&
      this.state.password === "iet"
    ) {
      this.setState({ msg: "Hello " + this.state.username });
    } else {
      this.setState({ msg: "Invalid Credentials" });
    }
  }

  render() {
    return (
      <div>
        <input
          type="text"
          name="username"
          onChange={this.handleChange}
        />
        <input
          type="password"
          name="password"
          onChange={this.handleChange}
        />
        <button onClick={this.login}>Login</button>
        <p>{this.state.msg}</p>
      </div>
    );
  }
}

export default LoginForm;