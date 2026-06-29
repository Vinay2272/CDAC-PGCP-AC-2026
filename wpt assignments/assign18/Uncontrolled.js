import { useRef } from "react";

export default function Uncontrolled() {
  const inputRef = useRef();

  function show() {
    console.log(inputRef.current.value);
  }

  return (
    <div>
      <input ref={inputRef} />
      <button onClick={show}>Show</button>
    </div>
  );
}