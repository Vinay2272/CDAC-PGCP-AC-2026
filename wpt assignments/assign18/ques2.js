import { useState, useCallback } from "react";

export default function Counter() {
  const [cnt, setCnt] = useState(0);

  const inc = useCallback(() => setCnt(cnt + 1), []);
  const dec = useCallback(() => setCnt(cnt - 1), []);

  return (
    <div>
      <h2>{cnt}</h2>
      <button onClick={inc}>Increment</button>
      <button onClick={dec}>Decrement</button>
    </div>
  );
}