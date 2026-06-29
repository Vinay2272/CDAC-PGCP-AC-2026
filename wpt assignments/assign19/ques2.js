import { useEffect, useState } from "react";

export default function Clock() {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    let t = setInterval(() => {
      setTime(new Date());
    }, 1000);

    return () => clearInterval(t);
  }, []);

  let hours = time.getHours();
  let bg = hours >= 12 ? "lightblue" : "lightyellow";

  return (
    <div style={{ height: "100vh", backgroundColor: bg }}>
      <h1>{time.toLocaleTimeString()}</h1>
    </div>
  );
}