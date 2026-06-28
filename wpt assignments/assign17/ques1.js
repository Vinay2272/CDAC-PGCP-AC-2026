import { useState, useEffect, useCallback } from "react";

export default function PasswordGenerator() {
  const [length, setLength] = useState(8);
  const [password, setPassword] = useState("");

  const generatePassword = useCallback(() => {
    let chars =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
    let pass = "";
    for (let i = 0; i < length; i++) {
      pass += chars.charAt(Math.floor(Math.random() * chars.length));
    }
    setPassword(pass);
  }, [length]);

  useEffect(() => {
    generatePassword();
  }, [generatePassword]);

  return (
    <div>
      <input
        type="number"
        value={length}
        onChange={(e) => setLength(e.target.value)}
      />
      <button onClick={generatePassword}>Generate</button>
      <p>{password}</p>
    </div>
  );
}