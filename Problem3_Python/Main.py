class Palindrome:
    def __init__(self):
        self.pal = ""

    def __init__(self, n_pal):
        self.pal = n_pal

    def is_palindrome(self):
        if len(self.pal) in range(2, 6):
            if str(self.pal) == str(self.pal[::-1]):
                print(self.pal, "is a palindrome!")
            else:
                print(p.pal, "is not a palindrome...")
        else:
            print(p.pal, "is not a palindrome...")


if __name__ == '__main__':
    p = Palindrome(str(input("Enter a palindrome:")))
    p.is_palindrome()
