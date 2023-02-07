import Student from "./Student";
function User(props) {
 
  return (
    <>
      {/* <button type="button" onClick={() => props.data(name)}>
        Click me
      </button> */}
      <Student data1={props.data} />
    </>
  );
}
export default User;
