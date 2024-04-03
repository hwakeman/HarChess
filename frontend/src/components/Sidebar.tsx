import { Link } from "react-router-dom"
import '../styles/components/sidebar.css'

function Sidebar() {
    return (
        <nav className="sidebar">
            <div className="sidebar-content">
                <h2 className="sidebar-link"><Link to="/">Home</Link></h2>
                <h2 className="sidebar-link"><Link to="/">Play</Link></h2>
                <h2 className="sidebar-link"><Link to="/">Puzzles</Link></h2>
            </div>
        </nav>
    )
}

export default Sidebar