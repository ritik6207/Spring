import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";
import AllPosts from "./components/AllPosts";
// import { Search } from '@mui/icons-material';

function App() {
  return (
    <div>
      {/* <Navbar /> */}
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<AllPosts/>} />
          {/* <Route path="/create" element={<Create />} /> */}
          {/* <Route path="/edit" element={<Edit />} /> */}
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
