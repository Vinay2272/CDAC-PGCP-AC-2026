export default function Dropdown() {
  let data = ['C', 'C++', 'Java', 'AdvJava', 'WPT'];

  return (
    <div>
      <select>
        {data.map((item, index) => (
          <option key={index}>{item}</option>
        ))}
      </select>
    </div>
  );
}