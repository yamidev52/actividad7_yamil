package com.yamidev.actividad7;

// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerProducts;
    private ProductAdapter productAdapter;
    private List<Producto> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupProducts();
        setupRecyclerView();
    }

    private void initViews() {
        recyclerProducts = findViewById(R.id.recyclerProducts);
    }

    private void setupProducts() {
        productList = new ArrayList<>();
        productList.add(new Producto(
                "Jersey adidas Real Madrid Local 24/25 Hombre",
                1595,
                "Camiseta oficial local del Real Madrid para la temporada 2024-25, confeccionada con tecnología que ayuda a controlar la humedad, escudo bordado y detalles clásicos del club.",
                "https://assets.adidas.com/images/h_2000,f_auto,q_auto,fl_lossy,c_fill,g_auto/486d1232144c454ba6b9cd03a1ef4753_9366/Jersey_Local_Real_Madrid_24-25_Blanco_IU5011_HM30.jpg",
                "https://www.adidas.mx/jersey-local-real-madrid-24-25/IU5011.html"
        ));
        productList.add(new Producto(
                "Nike Jersey Tottenham Hotspur FC Primera Equipación 2025‑26",
                1899,
                "Equipación “home” oficial de Tottenham Hotspur para la temporada 2025-26, con diseño moderno, corte atlético y tecnología Nike Dri-FIT para ventilación.",
                "https://ss205.liverpool.com.mx/xl/1169954772.jpg",
                "www.liverpool.com.mx/tienda/pdp/jersey-de-tottenham-visitante-manga-corta-nike-para-hombre/1169954772"
        ));
        productList.add(new Producto(
                "Atlético de Madrid Home 2025‑26 (Hombre)",
                1899,
                "Camiseta oficial local del Atlético de Madrid temporada 2025-26, con los colores rojiblancos característicos, materiales ligeros y detalles de club.",
                "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/6de1f762-6f18-4e4a-af5a-f80841ac415e/ATM+M+NK+DF+JSY+SS+STAD+HM.png",
                "https://www.nike.com/mx/t/club-atlético-de-madrid-local-2025-26-stadium-jersey-de-fútbol-dri-fit-replica-pjBxXnPW/HJ4587-615?cp=10643313266_ad_pdisp_"
        ));
        productList.add(new Producto(
                "Nike FC Barcelona Tercera Equipación 2025‑26",
                1899,
                "Equipación alternativa (tercera) oficial del FC Barcelona para la temporada 2025-26, con diseño diferenciado para partidos fuera de casa y material performance.",
                "https://ss205.liverpool.com.mx/xl/1174975965.jpg",
                "https://www.liverpool.com.mx/tienda/pdp/jersey-de-futbol-club-barcelona-local-nike-para-hombre/1174975965"
        ));
        productList.add(new Producto(
                "Tottenham Hotspur Away 2025‑26",
                1899,
                "Camiseta visitante oficial de Tottenham Hotspur temporada 2025-26, con un diseño alternativo (colores distintos del uniforme local) y tecnología para confort en el juego.",
                "https://martimx.vtexassets.com/arquivos/ids/1511217-1200-1200?v=638884614019400000&width=1200&height=1200&aspect=true",
                "https://www.marti.mx/jersey-nike-futbol-1127981812/p?idsku=442295"
        ));
    }

    private void setupRecyclerView() {
        productAdapter = new ProductAdapter(this, productList);
        recyclerProducts.setLayoutManager(new LinearLayoutManager(this));
        recyclerProducts.setAdapter(productAdapter);
    }
}