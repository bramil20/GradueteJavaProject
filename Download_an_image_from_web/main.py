import random
import urllib.request

def download_web_image(url):
    image_id=random.randrange(1,1000)
    image_name= str(image_id) +'.jpg'
    urllib.request.urlretrieve(url, image_name)

download_web_image("https://thenewboston.com/photos/users/2/resized/869b40793dc9aa91a438b1eb6ceeaa96.jpg")