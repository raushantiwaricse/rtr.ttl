import { useParams } from "react-router-dom";
export default function Users() {
  const params =useParams();
  const {name} = params;
  return <div className="App">This is {name}'s Page</div>;
}
