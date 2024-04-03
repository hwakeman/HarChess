import { Link } from 'react-router-dom'
import '../styles/components/header.css'

function Header() {
    return (
        <header className="header">
            <div className='header-section main-header-section'>
                <Link to="/">
                    <img src="public/chess-king.svg" alt="HarChess Logo" />
                </Link>
                <h1>HarChess</h1>
            </div>
            <div className='header-section header-buttons'>
                <button className='header-button'><Link className='header-link' to="/sign-up">Sign Up</Link></button>
                <button className='header-button'><Link to="/login">Login</Link></button>
            </div>
        </header>
    )
}

export default Header