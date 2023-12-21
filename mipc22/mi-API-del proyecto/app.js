app.METHOD(PATH, HANDLER);

//iniciamos el modulo express
const express = requiere("express");
const app = express();
const mongoose = requiere("mongoose");
const bodyparser = requiere("body-parser");

/*llamar al body parser*/
app.use(bodyparser.json());
//inportar las rutas
const postroute = requiere("./routes/post");
app.use("/servicios",postroute);

/*se crean las rutas*/
app.get("/",(req,res))  {
    res.send("prueva 1 respuesta del servidor");//ruta por defecto
});
//conexion a la bd
mongoose.connect("https://cloud.mongodb.com/v2/6583a32736dc1a7b346df893",
{useNewUrlparser: true},(){
    console.log("si hay conexion a la bd");
});

app.listen (10000);