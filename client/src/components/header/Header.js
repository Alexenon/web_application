import React from "react";
import {NavLink} from "react-router-dom";
import "./Header.css";

function Header() {
    return (
        <div className="header">
            <nav className="navbar">
                <div className="container">
                    <NavLink className="navbar-logo" to="/">
                        Brand Logo
                    </NavLink>
                    <div>
                        <ul className="navbar-list">
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/">
                                    Home
                                </NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/about">
                                    About
                                </NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/contact">
                                    Contact
                                </NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/collections">
                                    Collections
                                </NavLink>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    );
}

export default Header;