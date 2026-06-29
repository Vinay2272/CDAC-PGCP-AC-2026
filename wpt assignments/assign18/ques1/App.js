import { BrowserRouter, Routes, Route } from "react-router-dom";
import { useState } from "react";
import MyContext from "../Context";
import Login from "./Login";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";
import Info from "./Info";

export default function App() {
  const [user, setUser] = useState("");

  return (
    <MyContext.Provider value={user}>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Login setUser={setUser} />} />
          <Route path="/home" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/info" element={<Info />} />
        </Routes>
      </BrowserRouter>
    </MyContext.Provider>
  );
}