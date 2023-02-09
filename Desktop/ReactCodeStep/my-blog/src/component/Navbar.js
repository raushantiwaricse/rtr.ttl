import { Link } from "react-router-dom";
export default function Navbar() {
  return (
    <div className="App">
      <ul>
        <li>
          <Link to="/about">About</Link>
        </li>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/users/Raushan">Raushan</Link>
        </li>
        <li>
        <Link to="/users/Ram">Ram</Link>
        </li>
      </ul>
    </div>
  );
}
