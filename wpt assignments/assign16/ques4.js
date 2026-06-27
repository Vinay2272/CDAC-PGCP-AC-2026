import { useState, useEffect } from "react";

export default function LifeCycle() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log("Component Mounted / Updated");
    return () => {
      console.log("Cleanup");
    };
  }, [count]);

  return (
    <div>
      <h2>{count}</h2>
      <button onClick={() => setCount(count + 1)}>Update</button>
    </div>
  );
}