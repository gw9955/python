import pymysql

conn = pymysql.connect(host='127.0.0.1', port=3305, user='root', password='python', db='python', charset='utf8')
curs = conn.cursor()

sql = """DELETE FROM emp WHERE e_id='3'"""
         
row = curs.execute(sql)
print(row)

conn.commit()
curs.close()
conn.close()     