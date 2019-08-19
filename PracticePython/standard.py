# -*- coding: utf-8 -*-
msg = "Hello"
print msg

print "10 * 5 = ", 10 * 5 #50
print "10 // 3 = ", 10 // 3 #3 整数の商
print "10 % 3 = ", 10 % 3 #1 割った余り
print "2 ** 3 = ", 2**3 #8 2*2*2をする

# """で改行も考慮する
print """改行を考慮した文字列の囲い方
<html lnag="ja">
<body>
</body>
</html>"""

# 文字列の扱い
str = "abcdefghijklmn"
print str
print "len(str) = ", len(str) # 文字列の長さ
print "str.find(\"d\") = ", str.find("d") # 文字の位置

print "文字列の切り出し"
print "str[2]", str[2]
print "str[2:5]", str[2:5]
print "str[:5]", str[:5]
print "str[2:-1]", str[2:-1]

# 文字列 -> 数値
strNum = "5"
print "5 + int(strNum) % 10 = ", 5 + int(strNum) % 10
print "5 + float(strNum) % 10.0 = ", 5 + float(strNum) % 10.0

# 数値 -> 文字列(以下の例は別にstrキャストしなくても行ける)
age = 21
print "私の年齢は", str(age), "才です。"

# リスト