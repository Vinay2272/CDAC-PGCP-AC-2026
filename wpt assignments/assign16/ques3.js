import { useState } from "react";
import Child from "./Child";

export default function Parent() {
  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);
  const [result, setResult] = useState(0);

  function calculate(op) {
    let res = 0;
    if (op === "add") res = Number(num1) + Number(num2);
    if (op === "sub") res = num1 - num2;
    if (op === "mul") res = num1 * num2;
    if (op === "div") res = num2 != 0 ? num1 / num2 : 0;
    setResult(res);
  }

  return (
    <div>
      <input onChange={(e) => setNum1(e.target.value)} />
      <input onChange={(e) => setNum2(e.target.value)} />
      <Child onSelect={calculate} />
      <h3>Result: {result}</h3>
    </div>
  );
}