#static methods (static methods are methods that are bound to  class rather than the class object)

class Utilities:

     def print_name(name):
          print(name)


Utilities.print_name = staticmethod(Utilities.print_name)

print(Utilities.print_name("Rose"))
