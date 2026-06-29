import { useReducer } from "react";

function reducer(state, action) {
  switch (action.type) {
    case "inc":
      return { count: state.count + 1 };
    case "dec":
      return { count: state.count - 1 };
    default:
      return state;
  }
}

export default function Counter() {
  const [state, dispatch] = useReducer(reducer, { count: 0 });

  return (
    <div>
      <h2>{state.count}</h2>
      <button onClick={() => dispatch({ type: "inc" })}>Increment</button>
      <button onClick={() => dispatch({ type: "dec" })}>Decrement</button>
    </div>
  );
}