# -*- coding: utf-8 -*-
# 標準出力
print ("Hello, World")

# 関数
def inputName(name):
    print ("よろしくお願いします、" + name + " さん！")

inputName(input("name = "))

while True:
    inputYear = int(input("西暦> "))

    if inputYear % 400:
        print (str(inputYear) + "年は閏年です")
    elif inputYear % 100:
        print (str(inputYear) + "年は平年です")
    elif inputYear % 4:
        print (str(inputYear) + "年は閏年です")
    else:
        print (str(inputYear) + "年は平年です")

