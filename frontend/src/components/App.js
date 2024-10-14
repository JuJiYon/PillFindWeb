import React from 'react';
import Header from './Header';
import Nav from './Nav';
import Banner from './Banner';
import Carousel from './Carousel';
import Footer from './Footer';
import '../App.css'; 

function App() {
  return (
    <div className="App">
      <div id="page-wrapper">
        <Header />
        <Nav />
        <Banner />
        <Carousel />
        <Footer />
      </div>
    </div>
  );
}

export default App;
