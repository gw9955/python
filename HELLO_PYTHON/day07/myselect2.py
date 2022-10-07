import pymysql
conn = pymysql.connect(host='localhost', port=3305, user='root', passwd='python',
                      db='python', charset='utf8')

cursor = conn.cursor(pymysql.cursors.DictCursor)

sql = "SELECT * FROM emp"

# 5. SQL 구문 실행하기
cursor.execute(sql)

rows = cursor.fetchall()
print(rows)
    
cursor.close()
conn.close()