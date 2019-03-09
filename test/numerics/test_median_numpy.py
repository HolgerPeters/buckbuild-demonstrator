import unittest

from src.numerics.numpy_based_lib import med


class MedianTest(unittest.TestCase):
    def test_median_is_found(self):

        x = [1, 2, 2, 2, 10]

        result = med(x)

        self.assertEqual(2.0, result)
