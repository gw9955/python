import sys

from PyQt5 import uic
from PyQt5.QtWidgets import *
from random import random


form_class = uic.loadUiType("pyqt05.ui")[0]


class MyWindow(QMainWindow, form_class):

    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myClick)
        self.leMine.returnPressed.connect(self.myClick)
        
    def myClick(self):
        mine = self.leMine.text()
        com = ""
        result = ""
        rnd = random()
        
        
        if rnd > 0.5:
            com = "홀"
        else:
            com = "짝"
    
        if com == mine:
            result = "승리"
        else:
            result = "패배"
            
        # leCom = com
        # leResult = result
        
        self.leCom.setText(str(com))
        self.leResult.setText(str(result))
        
    
if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
