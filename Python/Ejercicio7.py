#Declaramos la constante
IVA = 0.18

# Inicializamos una lista vacía para almacenar los productos y sus precios
productos = []

# Solicitamos al usuario la información del producto y la almacenamos en la lista
while True:
    nombre_producto = input("Introduce el nombre del producto (o 'salir' para finalizar): ")
    
    # Si el usuario ingresa 'salir', terminamos el bucle
    if nombre_producto.lower() == 'salir':
        break
    
    precio_producto = float(input("Introduce el precio del producto: "))
    
    # Agregamos el producto y su precio a la lista
    productos.append((nombre_producto, precio_producto))

# Calculamos el valor total de la factura sin IVA
total_sin_iva = sum(precio for _, precio in productos)

# Calculamos el valor total de la factura con IVA (suponiendo un IVA del 19%)

total_con_iva = total_sin_iva * (1 + IVA)

# Imprimimos la factura
print("\nFactura:")
print("---------------------------------------------------")
print("Nombre del Producto \t Precio")
print("---------------------------------------------------")
for nombre, precio in productos:
    print(f"{nombre} \t\t\t ${precio:.2f}")
print("---------------------------------------------------")
print(f"Total sin IVA: ${total_sin_iva:.2f}")
print(f"Total con IVA (19%): ${total_con_iva:.2f}")
