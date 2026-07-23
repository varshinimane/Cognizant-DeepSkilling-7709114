import React from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showBooks = true;

    if (showBooks) {
        return <BookDetails />;
    } else {
        return <BlogDetails />;
    }
}

export default App;