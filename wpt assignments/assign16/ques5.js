import { useState } from "react";

export default function Stock() {
  const [data, setData] = useState([]);

  function loadData() {
    fetch("shopstock.json")
      .then(res => res.json())
      .then(res => setData(res));
  }

  return (
    <div>
      <button onClick={loadData}>Load Data</button>

      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {data.map((item, i) => (
            <tr key={i}>
              <td>{item.id}</td>
              <td>{item.name}</td>
              <td>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}