import "./App.css";
import User from "./User";
import { useRef } from "react";
function App() {
  let inputRef = useRef(null);
  function update() {
    inputRef.current.value = "1000";
    inputRef.current.style.color = "blue";
    inputRef.current.focus();
  }
  return (
    <div className="App">
      <User ref={inputRef} />
      <br />
      <button type="button" onClick={update}>
        Click mee!!
      </button>
    </div>
  );
}

export default App;
