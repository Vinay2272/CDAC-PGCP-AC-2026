import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";

export default function Todo() {
  const [task, setTask] = useState("");
  const dispatch = useDispatch();
  const list = useSelector((state) => state.list);

  return (
    <div>
      <input onChange={(e) => setTask(e.target.value)} />
      <button onClick={() => dispatch({ type: "ADD", payload: task })}>
        Add
      </button>

      <ul>
        {list.map((item, i) => (
          <li key={i}>
            {item}
            <button onClick={() => dispatch({ type: "DELETE", index: i })}>
              Delete
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}