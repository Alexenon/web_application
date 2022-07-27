import React from "react";
import "./CardProduct.css";

function CardProduct(productInfo) {
    return (
        <div className="card-wrapper">
            <a href="#">
                <img className="card-image"
                     src="http://mistillas.cl/wp-content/uploads/2018/04/Nike-Epic-React-Flyknit-%E2%80%9CPearl-Pink%E2%80%9D-01.jpg"
                     alt={productInfo.productName}/>
            </a>
            <div className="property-description">
                <h5>{productInfo.productName}</h5>
                <p className="product-description">
                    The Nike Epic React Flyknit foam cushioning is responsive yet light-weight, durable yet soft.
                </p>
                <h2>${productInfo.price}</h2>
            </div>
        </div>
    );
}

export default CardProduct;