#wapp to download a pdf file from mu.ac.in

import requests

paper_url="http://results.mu.ac.in/choose_nob.php?exam_id=4647&exam_year=2018&exam_month=NOV"
res=requests.get(paper_url)
print(res)

f=open("meit.pdf","wb")
f.write(res.content)
f.close()