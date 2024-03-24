import { Link, Outlet} from 'react-router-dom';

function Login() {
    return (
        <>
            <Link to="/">Home</Link>
            <Outlet />
        </>
      )
}

export default Login