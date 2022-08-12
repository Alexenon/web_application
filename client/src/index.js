import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Header from "./components/header/Header";
import Home from "./pages/home/Home";
import About from "./pages/about/About";
import Contact from "./pages/contact/Contact";
import Collections from "./pages/collections/Collections";
import NotFound from "./pages/not-found-page/Not-found-page";

ReactDOM.render(
    <Router>
        <Header />
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/about" element={<About />} />
            <Route path="/contact" element={<Contact />} />
            <Route path="/collections" element={<Collections />} />
            <Route path="*" element={<NotFound />} />
        </Routes>
    </Router>,
    document.getElementById("root")
);


