import { Link, Outlet} from 'react-router-dom';

function Home() {
    return (
        <>
            <Link to="/login">Login</Link>
            <Outlet />
        </>
    )
}

export default Home