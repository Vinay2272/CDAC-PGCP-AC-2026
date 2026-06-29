import { useState } from "react";
import MyContext from "./Context";
import Child from "./Child";

export default function App() {
  const [user, setUser] = useState("Vinay");

  return (
    <MyContext.Provider value={user}>
      <Child />
    </MyContext.Provider>
  );
}