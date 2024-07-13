# OOP Principle - Data Abstraction(hiding unnecessary code from user)
class User:
    __password = "password"

    def get_password(self):
        return self.__password


class ActiveUser(User):
    def get_password(self):
        return "********"

user = ActiveUser()
print(user.get_password())
















