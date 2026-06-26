import React, { Component } from "react";

class LifeCycleDemo extends Component {
  constructor() {
    super();
    console.log("Constructor");
  }

  componentDidMount() {
    console.log("Component Did Mount");
  }

  componentDidUpdate() {
    console.log("Component Did Update");
  }

  componentWillUnmount() {
    console.log("Component Will Unmount");
  }

  render() {
    console.log("Render");
    return <h2>Lifecycle Demo</h2>;
  }
}

export default LifeCycleDemo;