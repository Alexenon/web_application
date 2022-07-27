import React from "react";
import "./CardProduct.css";

function CardProduct(productInfo) {
    return (
        <div className="card-wrapper">
            <a href="#">
                <img className="card-image"
                     src={productInfo.image}
                     alt={productInfo.name}/>
            </a>
            <div className="card-information">
                <h5 className="product-name">
                    {productInfo.name}
                </h5>
                <p className="description">
                    {productInfo.description}
                </p>
                <h2 className="price">
                    ${productInfo.price}
                </h2>
            </div>
        </div>
    );
}

export default CardProduct;