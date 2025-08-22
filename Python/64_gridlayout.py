import sys
from PyQt5.QtCore import * 
from PyQt5.QtGui import * 
from PyQt5.QtWidgets import *

btns = ["Red","Green","Blue","Orrange","Sky Blue","Pink"]

class Window():
    def __init__(self):
        app = QApplication(sys.argv)
        win = QWidget()
        win.resize(500,400)
        
        gridLayout = QGridLayout() # QVBoxLayoyt
        for i in range(3):
            for j in range(2):
                b = QPushButton(btns[i+j])
                gridLayout.addWidget(b,i,j) 
        win.setLayout(gridLayout)
        win.setWindowTitle("PyQt")
        win.show()
        sys.exit(app.exec_())
            

if __name__=="__main__":
    w = Window();