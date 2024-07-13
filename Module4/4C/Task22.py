# OOP Principles - Encapsulation
# In python, we create a private variable with an underscore

class Hunt:

    __weapon = "Assault Rifle"

    def get_weapon(self):
        return "Not Available"

hunt = Hunt()
print(hunt.get_weapon())












