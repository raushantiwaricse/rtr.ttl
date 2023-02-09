import { Routes, Route, BrowserRouter } from "react-router-dom";
import Home from "./component/Home";
import About from "./component/About";
import Navbar from "./component/Navbar";
import PageNotFound from "./component/PageNotFound";
import Users from "./component/Users";
export default function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar></Navbar>
        <Routes>
          <Route path="/home" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/*" element={<PageNotFound />} />
          <Route path="/users/:name" element={<Users />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}
