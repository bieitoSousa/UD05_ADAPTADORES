#ADAPTADORES

## LISTVIEW

### CARACTERISTICAS
```
LISTVIEW -> MUESTRA TODOS LOS ELEMENTOS -> USUARIO SELLECIONA
         -> ESTA COMPUESTO POR VARIOS ITEMS
         -> ITEM -> [1 , VARIOS (DATOS)]
NOTA: RECYCLERVIEW -> CONSUME MENOS RECURSOS
```
### PROPIEDADES (XML) AL PULSAR LISTA ELEMENTO QUEDE "MARCADO"
 ```xml 
  android:choiceMode="singleChoice"
  android:listSelector="@color/colorPrimary"
  ```
### TRATAMIENTO DE ITEMS:   
#### OP 1 ARRAY (XML)  
```java

```         
#### OP 2 LISTA
```java
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_01_list_view);
        ListView lvFrutas = (ListView) findViewById(R.id.lv_frutas);
        //Fuente de datos
        String[] frutas = new String[] { "Pera", "Manzana", "Plátano" };
        //Enlace del adaptador con la fuente de datos
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.
                R.layout.simple_list_item_1, frutas);
        //Enlace del adaptador con ListView
        lvFrutas.setAdapter(adaptador);
        //Escuchador
        lvFrutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // TODO Auto-generated method stub
        //Toast.makeText(getBaseContext(), "Seleccionaches: "
        // + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Seleccionaste: " + ((TextView) view).getText(), Toast.
                        LENGTH_SHORT).show();
            }
        });
    }
```
#### OP 3 ADAPTADOR
```java

``` 


## RECYCLERVIEW

### RECYCLERVIEW : CARACTERISTICAS 

```
1. FUNCION -> CREAR LISTAS CON SCROLL
2. (+) EFICIENTE -> UPDATE -> RELOAD VIEW ONLY UPDATE ELEMENT 
3. ARRAYADAPTER -> CREA TODOS LOS ELEMENTOS DE UNA LISTA [VISIBLES, NO VISIBLES]
4. UPDATE -> ARRAYADAPTER -> GENERA ELEMENT UPDATE
5. ITEMS -> CARDVIEW
```
#### RECYCLERVIEW : IMPLEMENTACION : AÑADIR LIBRERIAS
```xml
    implementation 'com.android.support:recyclerview-v7:28.0.0'
    implementation 'com.android.support:cardview-v7:28.0.0'
```

### RECYCLERVIEW : IMPLEMENTACION
```
0. INSTANCIAR RECYCLEVIEW
    [RecyclerView recyclerView = findViewById(R.id.rvwRecycleView);]
1. DEFINIR EL ATRIBUTO RecyclerView.LayoutManager
    1.1 DEFINIR ATRIBUTO
     [  RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
        this,LinearLayoutManager.HORIZONTAL,false);]
    1.2 ASOCIARLO AL RECYCLEVIEW 
    [recyclerView.setLayoutManager(layoutManager);]
2. DEFINIR EL ADAPTADOR RecyclerView.LayoutManager   
    1.1 INSTANCIAR ADAPTADOR
    [ RecycleViewAdapter recycleAdapter = new RecycleViewAdapter();]
    1.2 ASOCIARLO AL RECYCLEVIEW
    [ recyclerView.setAdapter(recycleAdapter);]
```

``` JAVA
public class UD04_01_RecycleViewCardView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_01__recycle_view_card_view);
        // INSTANCIAR ADAPTADOR
        RecycleViewAdapter recycleAdapter = new RecycleViewAdapter();
        // INSTANCIAR LAYOUTMANAGER
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        // INSTANCIAR VIEW
        RecyclerView recyclerView = findViewById(R.id.rvwRecycleView);
        // ASOCIAR VIEW <-> LAYOUTMANAGER
        recyclerView.setLayoutManager(layoutManager);
        // ASOCIAR VIEW <-> ADAPTADOR
        recyclerView.setAdapter(recycleAdapter);
    }
}

```
####  RECYCLERVIEW : IMPLEMENTACION : CARDVIEW

##### CARDVIEW : CARACTERISTICAS
```
FUNCION -> PRESENTAR INFORMACION DEL COMPONETE EN FORMA DE TARJETA
REPRESNTA -> CADA FILA DE UN RECYCLERVIEW
```

##### CARDVIEW : PROPIEDADES

```
1. cardBackgroundColor: Color de fondo de la tarjeta.
2. cardCornerRadius: El perfil redondeado de las tarjetas.
3. cardElevation: Elevación (Material Design)
4. contentPadding: Padding de todo el contenido que está dentro da tarjeta.
5. Para separar una tarjeta de otra podemos hacer uso de los márgenes a nivel de CardView.
```
####  RECYCLERVIEW : IMPLEMENTACION : MANEJADOR FUENTE DATOS : RECYCLERVIEW.ADAPTER

##### RECYCLERVIEW.ADAPTER : CARACTERISTICAS
```
FUNCION -> GENERAR ITEM -> 1, VARIOS DATOS
TRABAJA -> CLASS: VIEWHOLDER
```
##### RECYCLERVIEW.ADAPTER : IMPLEMENTACION
```
1. :CLASS extends RecyclerView.Adapter -> VAMOS A EXCENDER DE RecyclerView.Adapter
2. IMPLEMENTAMOS LOS METODOS DE RecyclerView.Adapter
    2.1  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    [OUPUT (:CLASS) ViewHolder -->  GENERADO A PARTIR DE INPUT : VIEWGROUP]
    [ViewHolder -->  visualizar el contenido de la lista.'cargaremos' el diseño de fila]
        2.1.1 TRABAJAMOS CON LA CLASE VIEWHOLDER PARA GENERAR LOS DATOS
            1. OBTENER REFERENCIA LAYOUT
            2. INFLAR NUESTRO LAYOUT CON -> VIEWGROUP 
            3. INSTANCIAR VIEWHOLDER
    2.2  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) 
    [   INPUT : ViewHolder -> onCreateViewHolder    INPUT: INDICE Nº DE ITEMS ]
    [asociamos a cada componente gráfico de dicho View el dato que queremos que visualice.]
    2.3  public int getItemCount()
    [   OUPUT : INDICE Nº DE ITEMS ]
3. DEFINIR EL ATRIBUTO RecyclerView.LayoutManager
    3.1 DEFINIR ATRIBUTO
     [  RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
        this,LinearLayoutManager.HORIZONTAL,false);]
    3.2 ASOCIARLO AL RECYCLEVIEW 
    []

```
```JAVA
    public class RecycleViewAdapter_UD04_01_RecycleViewCardView extends RecyclerView.Adapter {
        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
        }
        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        }
        @Override
        public int getItemCount() {
        return 0;
        }
    }
```
##### RECYCLERVIEW.ADAPTER : LAYOU , INFLAR INSTACIAR VIEWHOLDER 
```
EN onCreateViewHolder:
    NECESITAMOS DEVOLVER UN OBJ : viewHolder 
```

```JAVA
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
/*********************************************************************************************************************
                Primero obtenemos una referencia a dicha clase de una de las siguientes formas:
 *********************************************************************************************************************/
        LayoutInflater mInflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater mInflater = LayoutInflater.from(viewgroup.getContext());
/*********************************************************************************************************************
Después llamamos al método 'inflate' para que devuelva por programación una referencia al layout donde están definidos
los elementos gráficos de una fila (un View):
 *********************************************************************************************************************/
        View v = mInflater.inflate(R.layout.card_layout_ud04_01_recycleviewcardview,viewGroup,false);
/*********************************************************************************************************************
Y por último creamos el ViewHolder creando un objeto de la clase ViewHolder creada por nosotros previamente (View-
Holder_UD04_01_RecycleViewCardView) y pasando como parámetro al constructor el View anterior:
 *********************************************************************************************************************/
        RecyclerView.ViewHolder viewHolder = new ViewHolder_UD04_01_RecycleViewCardView(v);
    return viewHolder;
    }
```

##### ATRIBUTO RecyclerView.LayoutManager
```JAVA
 // LinearLayout con distribución vertical (por defecto):
RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
 // LinearLayout con distribución horizontal:
RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
this,LinearLayoutManager.HORIZONTAL,false);
// GridLayout con dos columnas:
RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
// Una vez creado el LayoutManager hay que asociarlo al RecycleView.
```

##### VIEWHOLDER : CARACTERISTICAS
```
FUNCION -> GENERAR ITEMS -> 1, VARIOS DATOS
TRABAJA -> LIST DE DATOS Y LOS ASOCIA A CADA ITEM
```
##### VIEWHOLDER : IMPLEMENTACION
```
ACTUA EMPAQUETANDO Y DANDO FORMATO A LOS DATOS  ES : CONTRUCTOR , GET/SET METHOS
```
```JAVA
    public class ViewHolder_UD04_01_RecycleViewCardView extends RecyclerView.ViewHolder {
        public ImageView itemImagen;
        public TextView itemTexto;
        public ViewHolder_UD04_01_RecycleViewCardView(@NonNull View itemView) {
         super(itemView);
            itemImagen = itemView.findViewById(R.id.imgImaxe_UD04_01_CardLayout);
            itemTexto = itemView.findViewById(R.id.tvTexto_UD04_01_CardView);
        }
    }
```


