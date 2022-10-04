import sys

from PyQt5 import uic
from PyQt5.QtWidgets import *


form_class = uic.loadUiType("pyqt03.ui")[0]


class MyWindow(QMainWindow, form_class):

    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myClick)
        
    def myClick(self):
        le1 = int(self.le1.text())
        le2 = int(self.le2.text())
        sum = le1+le2
        self.le3.setText(str(sum))
        
    
if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
