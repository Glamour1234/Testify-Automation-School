class Human:
    leg_count = 4

    def get_gender(self):
        return self.leg_count


class Man(Human):

    hair = "dark"

    def __int__(self,leg_count):
        self.leg_count = leg_count



man1 = Human()
man1.get_gender()












