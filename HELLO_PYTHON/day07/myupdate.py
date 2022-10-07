import pymysql

e_id = "3"
e_name = "5"
sex = "5"
addr = "5"

conn = pymysql.connect(host='127.0.0.1', port=3305, user='root', password='python', db='python', charset='utf8')
curs = conn.cursor()

sql = f"""UPDATE emp
         SET    e_name = '{e_name}'
              , sex = '{sex}'
              , addr = '{addr}'
         WHERE  e_id = '{e_id}'"""
         
row = curs.execute(sql)
print(row)

conn.commit()
curs.close()
conn.close()     