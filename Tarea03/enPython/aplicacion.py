
class Aplicacion:
    def __init__(self, nombre, tamanio):
        self.__nombre = nombre
        self.__tamanio = tamanio

    def get_nombre(self):
        return self.__nombre

    def get_tamanio(self):
        return self.__tamanio

    def __str__(self):
        return f"{self.__nombre} ({self.__tamanio} MB)"
