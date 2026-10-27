
class Pantalla:
    def __init__(self, tipo, ancho, alto):
        self.__tipo = tipo
        self.__ancho = ancho
        self.__alto = alto

    def get_tipo(self):
        return self.__tipo

    def get_ancho(self):
        return self.__ancho

    def get_alto(self):
        return self.__alto

    def __str__(self):
        return f"{self.__tipo} {self.__ancho}x{self.__alto}"
