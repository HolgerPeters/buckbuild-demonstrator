from statistics import median

def med(values):
    if len(values) > 0:
        return median(values)
    else:
        return None
