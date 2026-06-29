import { useContext } from "react";
import MyContext from "./Context";

export default function Contact() {
  const user = useContext(MyContext);
  return <h2>Hello {user} - Contact Us</h2>;
}