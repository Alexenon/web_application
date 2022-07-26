import React from "react";
import "./CardProduct.css";

function CardProduct(productInfo) {
    return (
        <div className="card-wrapper">
            <div className="card-image"></div>
            <div className="card-information">
                <h5>Product name {productInfo.productName}</h5>
            </div>
            <div className="price">
                <p>$ {productInfo.price}</p>
            </div>
        </div>
    );
}

export default CardProduct;