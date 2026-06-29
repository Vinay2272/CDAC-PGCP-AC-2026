import { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function Login({ setUser }) {
  const [uname, setUname] = useState("");
  const [pass, setPass] = useState("");
  const nav = useNavigate();

  function login() {
    if (uname === "iet" && pass === "iet") {
      setUser(uname);
      nav("/home");
    }
  }

  return (
    <div>
      <input onChange={(e) => setUname(e.target.value)} />
      <input type="password" onChange={(e) => setPass(e.target.value)} />
      <button onClick={login}>Login</button>
    </div>
  );
}