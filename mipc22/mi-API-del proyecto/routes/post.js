Router.post("/",async (req,res) {

    const post = new post({
        title: req.body.title,
        description: req.body.description
    });
    try {
        const savedPost = await post.save();
        res.json(savedPost);
     } catch(error){
        res.json({message:error});
     }
});

//bloque para mostrar solo un post
router.get("/:postId", async (req,res) {
    try{
        const post = await post.findById(req.params.postI)
        res.json(post);
    } catch (error) {
        res.json({message: error});
    }

});

//bloque para borrar un post
router.get("/:postId", async (req,res) [{
	
}]{
    try{
        const removedPost = await post.remove({req.params.postId});
        res.json(removedPost);
    } catch (error) {
        res.json({message: error});
    }

});
module.exports = router;
