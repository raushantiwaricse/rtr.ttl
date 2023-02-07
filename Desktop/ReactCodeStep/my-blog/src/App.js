import "./App.css";
import { useState, useMemo } from "react";
function App() {
  const [count, setCount] = useState(0);
  const [data, setData] = useState(10);

  const multiCountMemo = useMemo(
    function multiple() {
      console.log("rtr");
      return count * 5;
    },
    [count]
  );

  return (
    <div className="App">
      <h1>Count: {count}</h1>
      <h1>data:{data}</h1>
      <h1>{multiCountMemo}</h1>
      <button type="button" onClick={() => setCount(count + 1)}>
        count click me
      </button>
      &nbsp;
      <button type="button" onClick={() => setData(data * 10)}>
        Data click me
      </button>
    </div>
  );
}

export default App;
