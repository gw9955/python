import sys

from PyQt5 import uic
from PyQt5.QtWidgets import *


form_class = uic.loadUiType("pyqt06.ui")[0]


class MyWindow(QMainWindow, form_class):

    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myClick)
        
    def myClick(self):
        le = int(self.le.text())
        plus = ""
        
        # plus += f"{le}*{1}={le*1}\n"
        # plus += f"{le}*{2}={le*2}\n"
        # plus += f"{le}*{3}={le*3}\n"
        # plus += f"{le}*{4}={le*4}\n"
        # plus += f"{le}*{5}={le*5}\n"
        # plus += f"{le}*{6}={le*6}\n"
        # plus += f"{le}*{7}={le*7}\n"
        # plus += f"{le}*{8}={le*8}\n"
        # plus += f"{le}*{9}={le*9}\n"
        
        for i in range(1, 10):
            # plus += str("{}*{}={}\n".format(le, i, le * i))
            plus += f"{le}*{i}={le*i}\n"
            self.te.setText(plus)
            
            
if __name__ == "__main__":
    app = QApplication(sys.argv) 
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
