import numpy as np

def med(values):
    if len(values) > 0:
        return np.median(np.asarray(values))
    else:
        return None
