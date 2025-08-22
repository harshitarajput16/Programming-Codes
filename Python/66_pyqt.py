import sys
from PyQt5 import QtCore, QtGui, QtWidgets

class MyApp(object):
    def setup(self,Dialog):
        Dialog.setObjectName("My Screen")
        Dialog.resize(500,300)

        self.button = QtWidgets.QPushButton(Dialog)
        self.button.setGeometry(QtCore.QRect(100,20,200,100))
        _translate = QtCore.QCoreApplication.translate
        self.button.setText(_translate("Dailog","Please click"))
        self.button.clicked.connect(self.btnClickEvent)

        self.label = QtWidgets.QLabel(Dialog)
        self.label.setGeometry(QtCore.QRect(0,30,100,30))
        self.label.setText(_translate("Dailog","my Name :"))    
    def btnClickEvent(self,Dailog):
        print("you clicked me...") 

if __name__ == "__main__":
    print("Creating...")
    app = QtWidgets.QApplication(sys.argv)
    mainWindow = QtWidgets.QMainWindow() 
    ui = MyApp()
    ui.setup(mainWindow)
    mainWindow.show()
    sys.exit(app.exec_())       
