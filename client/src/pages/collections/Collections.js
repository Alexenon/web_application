import React from "react";
import CardProduct from "../../components/card-product/CardProduct.js"

/**
 *  Collection Page with 24 most recent added products
 *  */
function Collections() {
    return (
        <div>
            <h1>Welcome to Collection Page</h1>
            <div>
                <CardProduct name={"Nike React Flyknit"}
                             image={"http://mistillas.cl/wp-content/uploads/2018/04/Nike-Epic-React-Flyknit-%E2%80%9CPearl-Pink%E2%80%9D-01.jpg"}
                             price={249.99}
                             description={"The Nike Epic React Flyknit foam cushioning is responsive yet light-weight, durable yet soft."}
                />
                <CardProduct name={"Nike React Flyknit"}
                             image={"http://mistillas.cl/wp-content/uploads/2018/04/Nike-Epic-React-Flyknit-%E2%80%9CPearl-Pink%E2%80%9D-01.jpg"}
                             price={249.99}
                             description={"The Nike Epic React Flyknit foam cushioning is responsive yet light-weight, durable yet soft."}
                />
                <CardProduct name={"Nike React Flyknit"}
                             image={"http://mistillas.cl/wp-content/uploads/2018/04/Nike-Epic-React-Flyknit-%E2%80%9CPearl-Pink%E2%80%9D-01.jpg"}
                             price={249.99}
                             description={"The Nike Epic React Flyknit foam cushioning is responsive yet light-weight, durable yet soft."}
                />
                <CardProduct name={"Nike React Flyknit"}
                             image={"http://mistillas.cl/wp-content/uploads/2018/04/Nike-Epic-React-Flyknit-%E2%80%9CPearl-Pink%E2%80%9D-01.jpg"}
                             price={249.99}
                             description={"The Nike Epic React Flyknit foam cushioning is responsive yet light-weight, durable yet soft."}
                />

            </div>
        </div>
    );
}

export default Collections;