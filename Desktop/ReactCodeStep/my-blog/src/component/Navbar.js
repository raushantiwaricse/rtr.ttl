import { NavLink } from "react-router-dom";
export default function Navbar() {
  return (
    <div className="App">
      <ul className="navbar">
        <li>
          <NavLink className="nav-link" to="/about">
            About
          </NavLink>
        </li>
        <li>
          <NavLink className="nav-link" to="/">
            Home
          </NavLink>
        </li>
        <li>
          <NavLink className="nav-link" to="/users/Raushan">
            Raushan
          </NavLink>
        </li>
        <li>
          <NavLink className="nav-link" to="/users/Ram">
            Ram
          </NavLink>
        </li>
      </ul>
    </div>
  );
}
