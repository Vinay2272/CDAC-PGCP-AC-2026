import { useState } from "react";

export default function IsPalindrome() {
  const [num, setNum] = useState("");
  const [result, setResult] = useState("");

  function check() {
    let str = num.toString();
    let rev = str.split("").reverse().join("");
    if (str === rev) {
      setResult("Palindrome");
    } else {
      setResult("Not Palindrome");
    }
  }

  return (
    <div>
      <input type="number" onChange={(e) => setNum(e.target.value)} />
      <button onClick={check}>Check</button>
      <p>{result}</p>
    </div>
  );
}