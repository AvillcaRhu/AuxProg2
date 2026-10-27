
from laptop import Laptop
from aplicacion import Aplicacion


def laptop_con_mas_apps(laptops):
    """b) y e) Retorna la laptop con mas aplicaciones (la primera si hay empate)."""
    mayor = laptops[0]
    for laptop in laptops[1:]:
        if laptop.get_cant_apps() > mayor.get_cant_apps():
            mayor = laptop
    return mayor


def agregar_app_a_modelo(laptops, modelo, app):
    """c) Agrega la aplicacion a la laptop del modelo indicado."""
    for laptop in laptops:
        if laptop.get_modelo() == modelo:
            return laptop.agregar_aplicacion(app)
    return False


def eliminar_apps_por_ancho(laptops, ancho):
    """d) Elimina las apps de todas las laptops cuya pantalla tenga el ancho indicado."""
    afectadas = 0
    for laptop in laptops:
        if laptop.get_pantalla().get_ancho() == ancho:
            laptop.eliminar_aplicaciones()
            afectadas += 1
    return afectadas


def mostrar_todas(laptops):
    for laptop in laptops:
        print(laptop)


# Aplicaciones independientes (agregacion): varias laptops pueden compartirlas
catalogo = [
    Aplicacion("Chrome", 300), Aplicacion("Word", 450),
    Aplicacion("Excel", 450), Aplicacion("Spotify", 200),
    Aplicacion("VSCode", 350), Aplicacion("Zoom", 200),
    Aplicacion("Steam", 600),
]
tipos = ["LED", "OLED", "IPS"]
anchos = [1366, 1920, 2560]
altos = [768, 1080, 1440]

# a) Instanciar N objetos Laptop en un vector (lista)
n = int(input("Cantidad de laptops N: "))
laptops = []
for i in range(n):
    laptop = Laptop(f"M{i + 1}", tipos[i % 3], anchos[i % 3], altos[i % 3])
    cantidad = 1 + (i * 2) % len(catalogo)  # cantidad de apps distinta por laptop
    for j in range(cantidad):
        laptop.agregar_aplicacion(catalogo[(i + j) % len(catalogo)])
    laptops.append(laptop)

print("\n--- Laptops creadas ---")
mostrar_todas(laptops)

# b) Laptop con mas aplicaciones
print("\n--- b) Laptop con mas aplicaciones ---")
print(laptop_con_mas_apps(laptops))

# c) Agregar una aplicacion a la laptop de modelo X
modelo = input("\n--- c) Modelo X al que agregar la app (ej. M1): ")
if agregar_app_a_modelo(laptops, modelo, Aplicacion("Photoshop", 800)):
    print(f"Aplicacion agregada a {modelo}")
else:
    print("No se pudo agregar (modelo inexistente o laptop llena)")

# d) Eliminar las apps de las laptops con pantalla de ancho Y
y = int(input("\n--- d) Ancho Y de pantalla (1366, 1920 o 2560): "))
print(f"Laptops afectadas: {eliminar_apps_por_ancho(laptops, y)}")

# e) Laptop con mas aplicaciones (despues de los cambios)
print("\n--- e) Laptop con mas aplicaciones ---")
print(laptop_con_mas_apps(laptops))

# f) Ordenar las apps de cada laptop (tamanio decreciente, empate por nombre)
for laptop in laptops:
    laptop.ordenar_aplicaciones()
print("\n--- f) Apps ordenadas ---")
mostrar_todas(laptops)
