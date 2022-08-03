import React from "react";
import { NavLink } from "react-router-dom";
import "./Header.css";

function Header() {

    const changeStyle = () => {
        document.getElementsByClassName("nav-link").style.display = "none";
    };


    return (
        <section className="header">
            <nav className="navbar">
                <div className="navbar-list">
                    <a className="nav-item">
                        <NavLink className="nav-link" to="/">Home</NavLink>
                    </a>


                    <a className="nav-item dropdown">
                        <NavLink className="nav-link" to="/collections">Shop</NavLink>
                        <span class="material-symbols-outlined">arrow_drop_down</span>
                        <div className="dropdown-content">
                            <NavLink onClick={changeStyle} className="nav-link" to="/collections">Collections</NavLink>
                            <NavLink onClick={changeStyle} className="nav-link" to="/collections">Collections</NavLink>
                        </div>
                    </a>


                    <a className="nav-item dropdown">
                        <NavLink className="nav-link" to="/about">Our World</NavLink>
                        <span class="material-symbols-outlined">arrow_drop_down</span>
                        <div className="dropdown-content">
                            <NavLink onClick={changeStyle} className="nav-link" to="/collections">Collections</NavLink>
                            <NavLink onClick={changeStyle} className="nav-link" to="/collections">Collections</NavLink>
                        </div>
                    </a>
                </div>
                <NavLink className="navbar-logo" to="/">
                    Brand
                </NavLink>
                <div className="nav-icons">
                    <span class="material-symbols-outlined">search</span>
                    <span class="material-symbols-outlined">person</span>
                    <span class="material-symbols-outlined">shopping_bag</span>
                </div>
            </nav>
        </section>

    );
}

export default Header;