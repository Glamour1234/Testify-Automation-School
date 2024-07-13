# OOP principles - Polymorphism(is the capability of many class methods to perform the same task)
class Human:
    leg_count = 4

    def get_gender(self):
        return "unknown"


class Man(Human):

    def get_gender(self):
        return "man"

class Woman(Human):

    def get_gender(self):
        return "woman"


man = Man()
print(man.get_gender())

woman = Woman()
print(woman.get_gender())











