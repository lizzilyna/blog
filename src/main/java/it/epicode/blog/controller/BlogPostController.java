package it.epicode.blog.controller;
import it.epicode.blog.entities.BlogPost;
import it.epicode.blog.services.BlogPostService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/blogPosts")
@Data
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<BlogPost> getAllBlogPosts() {
        // Logica per ottenere la lista di tutti i blog posts
        return blogPostService.getAllBlogPosts();
    }

    @GetMapping("/{id}")
    public BlogPost getBlogPostById(@PathVariable Long id) {
        // Logica per ottenere un singolo blog post
        return blogPostService.getBlogPostById(id);
    }
    @PostMapping
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost){
        return blogPostService.createBlogPost(blogPost);
    }

    @PutMapping ("/{id}")
    public BlogPost updateBlogPost(@PathVariable Long id, @RequestBody BlogPost blogPost){
        return  blogPostService.updateBlogPost(id, blogPost);
    }

    @DeleteMapping ("/{id}")
    public void deleteBlogPost(@PathVariable Long id){
        blogPostService.deleteBlogPost(id);
    }



}
