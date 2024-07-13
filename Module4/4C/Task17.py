#OOP
class Human:

    group = "Africans"
    hair = "Short"

    def get_humans(self):
        return self.group + ":" + self.hair


africans = Human()
print(africans.group, africans.hair, africans.get_humans())