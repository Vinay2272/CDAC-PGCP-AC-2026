import { useContext } from "react";
import MyContext from "./Context";

export default function Child() {
  const user = useContext(MyContext);

  return <h2>Hello {user}</h2>;
}