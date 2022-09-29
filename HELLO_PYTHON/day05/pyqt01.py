import sys

from PyQt5 import uic
from PyQt5.QtWidgets import *


form_main = uic.loadUiType("pyqt01.ui")[0]


class MainWindow(QMainWindow, QWidget, form_main):

    def __init__(self):
        super().__init__()
        self.initUI()
        self.show()
    
    def initUI(self):
        self.setupUi(self)
        self.pb.clicked.connect(self.btnClicked)
    
    def btnClicked(self):
        self.lbl.setText("Good Evening")

        
if __name__ == "__main__":
    app = QApplication(sys.argv) 
    window = MainWindow() 
    sys.exit(app.exec_())
