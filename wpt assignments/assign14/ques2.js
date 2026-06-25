import { useState } from "react";

export default function Demo() {
  const [text, setText] = useState("");

  function handleClick() {
    console.log(text);
  }

  return (
    <div>
      <input type="text" onChange={(e) => setText(e.target.value)} />
      <button onClick={handleClick}>Click</button>
    </div>
  );
}