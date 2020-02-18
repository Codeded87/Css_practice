from urllib.parse import urlparse

#get domain name (example.com)
def get_domain_name(url):
    try:
        result = get_domain_name(url).split('.')
        return result[-2] + '.' + result[-1]
    except:
        return ''

def get_sub_domain_name(url):
    try:
        return uriparse(url).notloc
    except:
        return ''
        