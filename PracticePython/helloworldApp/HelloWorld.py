# -*- coding: utf-8 -*-

from kivy.app import App
from kivy.uix.widget import Widget

from kivy.properties import StringProperty

class TextWidget(Widget):
    pass

class HelloWorldApp(App):
    def __init__(self, **kvargs):
        super(HelloWorldApp, self).__init__(**kvargs)
        self.title = 'greeting' # ウィンドウ名を表示

    def build(self):
        return TextWidget()

if __name__ == '__main__':
    HelloWorldApp().run()

