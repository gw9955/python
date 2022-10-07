import pymysql
db = pymysql.connect(host='localhost', port=3305, user='root', passwd='python',
                      db='python', charset='utf8')

cursor = db.cursor()

sql = "SELECT * FROM emp"

# 5. SQL 구문 실행하기
cursor.execute(sql)

result = cursor.fetchall()
for record in result:
    print(record)
    
cursor.close()
db.close()