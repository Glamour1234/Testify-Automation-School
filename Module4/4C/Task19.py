#Methods -
# def_init is a method constructor
class Human:

    leg_count = 4
    can_walk = True

    def get_description(self):
        print("This is Human")

    def get_leg_count(self):
        return self.leg_count

# instantiate the human class
man = Human()

# invoke the get description method
man.get_description()

print(man.get_leg_count())











