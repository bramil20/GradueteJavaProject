import requests
from bs4 import BeautifulSoup
import sys


def doto_spider(max_pages):
    page = 1
    while page <= max_pages:
        url = 'https://www.dota2.com/news/updates/?p=' + str(page)
        source_code = requests.get(url)
        plain_text = source_code.text
        soup = BeautifulSoup(plain_text, "html.parser")
        for link in soup.findAll('a', {'rel': 'bookmark'}):
            date_of_patch = link.string

            months_to_remove = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September',
                                'October', 'November', 'December']
            x = 1
            for month in months_to_remove:

                if month in date_of_patch:
                    date_of_patch = date_of_patch.replace(month, '' + str(x) + '.')
                x += 1
            date_of_patch = date_of_patch.replace(',', '.')

            things_to_remove = ['th', 'st', 'rd', 'nd', '-', '#', ' ']
            for thing in things_to_remove:
                if thing in date_of_patch:
                    date_of_patch = date_of_patch.replace(thing, '')
            date_of_patch = date_of_patch[11:]

            number_of_commas = date_of_patch.count('.')
            year = date_of_patch[-4:]
            day_and_month = date_of_patch[:-4]
            if number_of_commas != 2:
                date_of_patch = day_and_month + '.' + year
            href = link.get('href')

            print(date_of_patch)
            print(href)
        page += 1


doto_spider(8)

def dissect_game_updates(max_pages):
    page = 1
    while page <= max_pages:
        url = 'https://www.dota2.com/news/updates/?p=' + str(page)
        source_code = requests.get(url)
        plain_text = source_code.text
        soup = BeautifulSoup(plain_text, 'html.parser')
        for html_content in soup.findAll('div', {'class': 'entry-content'}):

            plain_content = html_content.text
            game_update_chars = ['---', '===']
            for update in game_update_chars:
                if update in plain_content:
                    print('\n')
                    plain_content = plain_content.replace('*', '\n')
                    sys.stdout.write(plain_content)

        page += 1


#dissect_game_updates(8)
