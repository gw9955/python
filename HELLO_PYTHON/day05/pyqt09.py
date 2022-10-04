from random import random
import sys

from PyQt5 import uic
from PyQt5.QtWidgets import *

form_class = uic.loadUiType("pyqt09.ui")[0]


class MyWindow(QMainWindow, form_class):

    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb1.clicked.connect(self.myClick)
        self.pb2.clicked.connect(self.myClick)
        self.pb3.clicked.connect(self.myClick)
        self.pb4.clicked.connect(self.myClick)
        self.pb5.clicked.connect(self.myClick)
        self.pb6.clicked.connect(self.myClick)
        self.pb7.clicked.connect(self.myClick)
        self.pb8.clicked.connect(self.myClick)
        self.pb9.clicked.connect(self.myClick)
        self.pb0.clicked.connect(self.myClick)
        self.pb_call.clicked.connect(self.myCall)
        
    def myCall(self):
        str_tel = self.le.text()
        QMessageBox.information(self,'calling',str_tel)
        
    def myClick(self):
        str_new = self.sender().text()
        str_old = self.le.text()

        self.le.setText(str_old+str_new)
            
if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
