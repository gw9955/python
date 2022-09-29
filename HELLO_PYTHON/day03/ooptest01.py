class Animal:
    
    def __init__(self):
        self.hungry = 5
    
    def timegoby(self):
        if self.hungry > 0:
            self.hungry -= 1
    
    def manttang(self):
        self.hungry = 10
        
# ani = Animal()
# print(ani.hungry)
# ani.timegoby()
# ani.manttang()
# print(ani.hungry)

        
class Human(Animal):

    def __init__(self):
        super().__init__()
        self.skill_lang = 0
    
    def momstouch(self, stroke):
        self.skill_lang += stroke
        return self.skill_lang

        
a = Human()
print(a.hungry)
print(a.skill_lang)
a.manttang()
a.momstouch(11)
print(a.hungry)
print(a.skill_lang)
