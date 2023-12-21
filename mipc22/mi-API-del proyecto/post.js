const mongoose = requiere ("mongoose");
const postSchema = mongoose.schema({
    title:{
        type: String,
        requiere:true 
    },
    description:{
        type: String,
        requiere:true 
    },
    date: {
        type:Date,
        default:Date.now 
    }
});
module.exports = mongoose.model("post",postSchema);