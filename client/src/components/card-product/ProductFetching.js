import React, {useState, useEffect} from "react";
import axios from 'axios';
import CardProduct from "./CardProduct";

function ProductFetching() {

    const [posts, setPosts] = useState([]);

    useEffect(() => {
        axios.get('https://jsonplaceholder.typicode.com/posts')
            .then(response => {
                console.log(response)
                setPosts(response.data)
            })
            .catch(err => {
                console.log(err)
            })
    }, [])

    /* Return a div with all data received from API */
    return (
        <div className="container col-3">
            {posts.map(post =>
                <CardProduct name={post.id}
                             image="https://assets.adidas.com/images/w_600,f_auto,q_auto/4e894c2b76dd4c8e9013aafc016047af_9366/Superstar_Shoes_White_FV3284_01_standard.jpg"
                             price={post.id * 10}
                             description={post.title}
                />)}
        </div>
    )
}

export default ProductFetching;