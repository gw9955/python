from random import random
import sys

from PyQt5 import uic
from PyQt5.QtWidgets import *


form_class = uic.loadUiType("pyqt08.ui")[0]


class MyWindow(QMainWindow, form_class):

    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myClick)
        
    def star(self, cnt):
        str = ""
        for i in range(cnt):
            str += "*"
            
        str += "\n"
        return str
        
    def myClick(self):
        first = int(self.le_first.text())
        last = int(self.le_last.text())
        
        txt = ""
        for i in range(first, last + 1):
            txt += self.star(i)
            
        self.te.setText(txt)
        
            
if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
