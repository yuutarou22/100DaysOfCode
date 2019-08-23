import requests
from bs4 import BeautifulSoup

html = requests.get ('https://news.yahoo.co.jp/')
yahoo = BeautifulSoup (html.content, 'html.parser')

roopNum = 0
for title in yahoo.select ('ul.topicsList_main'):
    roopNum+=1
    print(title.getText())

print ('------------------')
print (html.encoding)
print (roopNum)