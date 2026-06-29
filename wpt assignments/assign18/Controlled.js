import { useState } from "react";

export default function Controlled() {
  const [val, setVal] = useState("");

  return (
    <div>
      <input value={val} onChange={(e) => setVal(e.target.value)} />
      <p>{val}</p>
    </div>
  );
}