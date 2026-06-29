import { useContext } from "react";
import MyContext from "./Context";

export default function About() {
  const user = useContext(MyContext);
  return <h2>Hello {user} - About Us</h2>;
}