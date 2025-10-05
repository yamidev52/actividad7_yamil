package com.yamidev.actividad7;
// ProductAdapter.java
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Producto> products;
    private Context context;

    public ProductAdapter(Context context, List<Producto> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Producto product = products.get(position);

        holder.tvProductName.setText(product.getNombre());
        holder.tvProductDescription.setText(product.getDescripcion());
        holder.tvProductPrice.setText(String.valueOf(product.getPrecio()));



        holder.btnViewProduct.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(product.getWebUrl()));
            context.startActivity(intent);
        });

        // Opcional: Cargar imagen si tienes una URL real
        Glide.with(context).load(product.getImagenUrl()).into(holder.ivProductImage);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView tvProductName, tvProductDescription, tvProductPrice;
        ImageView ivProductImage;
        Button btnViewProduct;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvProductPrice = itemView.findViewById(R.id.tvProductPrice);
            tvProductDescription = itemView.findViewById(R.id.tvProductDescription);
            ivProductImage = itemView.findViewById(R.id.ivProductImage);
            btnViewProduct = itemView.findViewById(R.id.btnViewProduct);
        }
    }
}