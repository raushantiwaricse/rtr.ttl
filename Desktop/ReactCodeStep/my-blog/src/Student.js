import { useRef } from "react";
function Student() {
  let email = useRef(null);
  function handleInput() {
    const Email = email.current.value;
    email.current.focus();
    email.current.style.color = "red";
    console.log(Email);
  }
  return (
    <div>
      <input type="text" ref={email} />
      <button type="button" onClick={handleInput}>
        Click me
      </button>
    </div>
  );
}
export default Student;
