import React from "react";
import CardProduct from "../../components/card-product/CardProduct.js"

function Collections() {
    return (
        <div>
            <h1>Welcome to Collection Page</h1>
            <CardProduct productName="Nike" price={249.99} />
        </div>
    );
}

export default Collections;