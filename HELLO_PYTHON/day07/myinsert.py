import pymysql
db = pymysql.connect(host='localhost', port=3305, user='root', passwd='python',
                      db='python', charset='utf8')

curs = db.cursor()

sql = """insert into emp(e_id, e_name, sex, addr)
         values (%s, %s, %s, %s)"""
         
cnt = curs.execute(sql, ('3', '3', '3', '3'))
print("cnt",cnt)

db.commit()
curs.close()
db.close()