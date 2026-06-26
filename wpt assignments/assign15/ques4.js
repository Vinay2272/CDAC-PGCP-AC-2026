import React, { Component } from "react";

class Todo extends Component {
  constructor() {
    super();
    this.state = { task: "", list: [] };

    this.handleChange = this.handleChange.bind(this);
    this.addTask = this.addTask.bind(this);
  }

  handleChange(e) {
    this.setState({ task: e.target.value });
  }

  addTask() {
    this.setState({
      list: [...this.state.list, this.state.task],
      task: ""
    });
  }

  render() {
    return (
      <div>
        <input value={this.state.task} onChange={this.handleChange} />
        <button onClick={this.addTask}>Add</button>

        <ol>
          {this.state.list.map((t, i) => (
            <li key={i}>{t}</li>
          ))}
        </ol>
      </div>
    );
  }
}

export default Todo;