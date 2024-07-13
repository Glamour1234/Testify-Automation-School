class Human:
    leg_count = 4

    def get_gender(self):
        return "Unknown"


class Man(Human):
      pass

class Woman(Human):
       pass


man = Man()
woman = Woman()
print(man.get_gender())












