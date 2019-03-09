from .plumbing import internal
import sys


def main(args):
    print("Median, v. 0.1")
    median = internal.med([float(v) for v in args[1:]])
    print(median)


if __name__ == "__main__":
    main(sys.argv)
