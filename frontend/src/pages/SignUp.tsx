import { Link } from 'react-router-dom'
import '../styles/pages/sign-up.css'

function Signup() {
    return (
        <div className="sign-up-container">
            <Link to="/" className='sign-up-home-link'><img src='src/assets/icons/home.svg'></img></Link>
            <form className="sign-up-form">
                <label>Username: <input type="text" placeholder="Username" /></label>
                <label>Password: <input type="password" placeholder="Password" /></label>
                <button type="submit">Sign Up</button>
            </form>
        </div>    
      )
}

export default Signup