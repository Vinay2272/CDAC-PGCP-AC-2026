import { useContext } from "react";
import MyContext from "./Context";

export default function Home() {
  const user = useContext(MyContext);
  return <h2>Hello {user}</h2>;
}