import { Link } from "react-router-dom"
import '../styles/components/sidebar.css'

function Sidebar() {
    return (
        <nav className="sidebar">
            <Link to="/">Home</Link>
            <Link to="/login">Login</Link>
        </nav>
    )
}

export default Sidebar