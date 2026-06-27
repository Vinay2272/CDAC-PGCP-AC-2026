export default function Child({ onSelect }) {
  return (
    <select onChange={(e) => onSelect(e.target.value)}>
      <option value="">Select</option>
      <option value="add">Addition</option>
      <option value="sub">Subtraction</option>
      <option value="mul">Multiplication</option>
      <option value="div">Division</option>
    </select>
  );
}