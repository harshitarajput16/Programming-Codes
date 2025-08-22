class student:
    def __init__(self, id, Name, Course):
        self.id = id
        self.name = Name
        self.course = Course

    def display(self):
        print(f"{self.id}, {self.name}, {self.course}")

s1 = student(101,"riya", "BCA")
s2 = student(102,"Tiya", "BBA")
s3 = student(103,"Diya", "BMA")

s1.display()
s2.display()
s3.display()

print("-----------------------------------------------")
print("-----------------------------------------------")

class employee:
    def __init__(self, id , name, branch, salary, contact):
        self.id = id
        self.name = name
        self.branch = branch
        self.salary = salary
        self.contact = contact
        
    def display(self):
        print(f"{self.id}, {self.name}, {self.branch}, {self.salary}, {self.contact}")

s1 = employee(101,"Maahesh","sales",200000,9278364547)
s2 = employee(102,"ahesh","HR",230000,9278364547)
s3 = employee(103,"suresh","Adver",240000,9278364547)
s4 = employee(104,"Mukesh","marketing",250000,9278364547)
s5 = employee(105,"Ramesh","It",260000,9278364547)

s1.display()
s2.display()
s3.display()
s4.display()
s5.display()