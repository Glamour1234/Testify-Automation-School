#Abstract Class
import abc


class Vehicle(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def drive_direction(self):
        pass


class Car(Vehicle):

    def drive_direction(self):
      return "Drive forward"


class Plane(Vehicle):


    def drive_direction(self):
        return "Drive Upward"


car = Car()
print(car.drive_direction())

plane = Plane()
print(plane.drive_direction())












