from urllib import request

csv_adress = "http://www.sample-videos.com/csv/Sample-Spreadsheet-10-rows.csv"


def downolad_from_web(adress):
    response = request.urlopen(adress)
    csv = response.read()
    csv_str = str(csv)
    lines = csv_str.split("\\n")
    destination_url = r'myverycsv'
    fx = open(destination_url, 'w')
    for line in lines:
        fx.write(line + " \n")
    fx.close()


downolad_from_web(csv_adress)
