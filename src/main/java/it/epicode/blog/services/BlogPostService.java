package it.epicode.blog.services;
import it.epicode.blog.entities.BlogPost;
import it.epicode.blog.repositories.BlogPostRepository;
import it.epicode.blog.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {
    @Autowired
    private BlogPostRepository blogPostRepository;
    public List<BlogPost>getAllBlogPosts(){
        return blogPostRepository.findAll();
    }

    public BlogPost getBlogPostById(Long id) {
        BlogPost blogPost = blogPostRepository.findById(id).orElse(null);
        if (blogPost == null) {
            throw new EntityNotFoundException("Il post con l'id " + id + "non è stato trovato");
        }
        return blogPost;
    }

    public BlogPost createBlogPost (BlogPost blogPost){
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost (Long id, BlogPost updatedBlogPost) {
        BlogPost existingBlogPost = blogPostRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Post con id"+id+"non trovato"));
        existingBlogPost.setCategoria(updatedBlogPost.getCategoria());

        return null;
    }

    public void deleteBlogPost(Long id){

    }
}
