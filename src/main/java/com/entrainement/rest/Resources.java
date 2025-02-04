package com.entrainement.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.entrainement.model.Product;

@Tag(name = "Produit", description = "Opérations liées aux Produits")
@Path("/products")
public class Resources {

    @GET
    @Operation(summary = "Obtenir tous les produits", tags = { "Produit" })
    public Response getProducts() {
        // Logique pour traiter la requête GET et retourner une liste de produits.
        return Response.ok().entity("Liste de produits pour OpenAPI 3.X").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Creer un produit", tags = { "Produit" })
    public Response createProduct(Product product) {
        // Logique pour traiter la requête POST et créer un nouveau produit.
        return Response.status(Response.Status.CREATED).entity(product).build();
    }

    @PUT
    @Path("/{id}")
    @Operation(summary = "Modifier un produit par ID", tags = { "Produit" })
    public Response updateProduct(@PathParam("id") String id, Product product) {
        // Logique pour traiter la requête PUT et mettre à jour un produit.
        return Response.ok().entity("Produit mis à jour pour OpenAPI 3.X").build();
    }

    @DELETE
    @Path("/{id}")
    @Operation(summary = "Effacer un produit par ID", tags = { "Produit" })
    public Response deleteProduct(@PathParam("id") String id) {
        // Logique pour traiter la requête DELETE et supprimer un produit.
        return Response.ok().entity("Produit supprimé pour OpenAPI 3.X").build();
    }
}