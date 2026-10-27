
from pantalla import Pantalla

MAX_APPS = 50


class Laptop:
    def __init__(self, modelo, tipo_pantalla, ancho, alto):
        self.__modelo = modelo
        self.__cant_apps = 0
        self.__apps = [None] * MAX_APPS
        # La Pantalla se crea dentro de la Laptop (composicion)
        self.__pantalla = Pantalla(tipo_pantalla, ancho, alto)

    def get_modelo(self):
        return self.__modelo

    def get_cant_apps(self):
        return self.__cant_apps

    def get_pantalla(self):
        return self.__pantalla

    def agregar_aplicacion(self, app):
        """c) Agrega una aplicacion; retorna False si la laptop ya tiene 50."""
        if self.__cant_apps >= MAX_APPS:
            return False
        self.__apps[self.__cant_apps] = app
        self.__cant_apps += 1
        return True

    def eliminar_aplicaciones(self):
        """d) Elimina todas las aplicaciones de la laptop."""
        self.__apps = [None] * MAX_APPS
        self.__cant_apps = 0

    def ordenar_aplicaciones(self):
        """f) Ordena las apps de mayor a menor tamanio; si empatan, por nombre."""
        usadas = self.__apps[:self.__cant_apps]
        usadas.sort(key=lambda a: (-a.get_tamanio(), a.get_nombre()))
        self.__apps[:self.__cant_apps] = usadas

    def __str__(self):
        texto = (f"Laptop {self.__modelo} | Pantalla: {self.__pantalla} "
                 f"| Apps ({self.__cant_apps}):")
        if self.__cant_apps == 0:
            texto += " ninguna"
        for i in range(self.__cant_apps):
            texto += f"\n    - {self.__apps[i]}"
        return texto
