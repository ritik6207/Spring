import React, { useEffect, useState } from "react";
import { AppBar, Toolbar, Box, Grid, Card, Typography } from "@mui/material";
// import { Grid2 } from "@mui/material/Grid2";
import axios from "axios";
import Button from '@mui/material/Button';

const Search = () => {
  const [post, setPost] = useState([]);

  useEffect(() => {
    const fetchInitialPosts = async () => {
      try {
        const response = await axios.get(`http://localhost:8080/jobPosts`);
        console.log(response);
        setPost(response.data);
      } catch (error) {
        console.error("Error fetching posts:", error);
      }
    };
    fetchInitialPosts();
  }, []);

  return (
    <Grid container spacing={2} sx={{ margin: "2%" }}>
      {/* AppBar */}
      <Box sx={{ flexGrow: 1 }}>
        <AppBar position="static">
          <Toolbar>
            <Typography
              variant="h6"
              align="center"
              component="div"
              sx={{ flexGrow: 1 }}
            >
              Job Portal
            </Typography>
          </Toolbar>
        </AppBar>
      </Box>

      {/* Placeholder */}
      <Grid item xs={12}></Grid>

      {/* Job Cards */}
      {post.map(p => (
        <Grid key={p.id} item xs={12} md={6} lg={4}>
          <Card
            sx={{
              padding: "3%",
              overflow: "hidden",
              width: "84%",
              backgroundColor: "#f7f7f7", // background color
            }}
          >
            <Typography
              variant="h5"
              sx={{
                fontSize: "2rem",
                fontWeight: "600",
                color: "#333", // text color
              }}
            >
              {p.postProfile}
            </Typography>
            <Typography
              sx={{
                color: "#666", // text color
                marginTop: "2%",
              }}
              variant="body2"
            >
              Description: {p.postDesc}
            </Typography>
            <br />
            <br />
            <Typography
              variant="h6"
              sx={{
                color: "#444", // text color
              }}
            >
              Years of Experience: {p.reqExperience} years
            </Typography>
            <Typography
              gutterBottom
              variant="body2"
              sx={{
                color: "#666", // text color
              }}
            >
              Skills:
            </Typography>
            {p.postTechStack.map((s, i) => (
              <Typography
                variant="body2"
                gutterBottom
                key={i}
                sx={{
                  color: "#666", // text color
                }}
              >
                {s}.
              </Typography>
            ))}
            <Button
              variant="contained"
              color="primary"
              sx={{
                marginTop: "2%",
                width: "100%",
              }}
            >
              Apply Now
            </Button>
          </Card>
        </Grid>
      ))}
    </Grid>
  );
};

export default Search;
