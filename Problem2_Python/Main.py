class SalesPerson:
    def __init__(self):
        self.items = []
        self.rate = .09
        self.salary = 200

    def add_item(self, item):
        self.items.append(1)
        self.items[len(self.items) - 1] = item

    def print(self):
        print("Item Code\tValue")
        for i in range(1, len(self.items) + 1):
            print(i, "\t\t\t", self.items[i-1])


if __name__ == '__main__':
    p = SalesPerson()
    text = ""

    print("\nEnter q to exit")

    while text != 'q':
        text = input("Enter amount items sold for:")
        if text != 'q':
            p.add_item(int(text))

    if len(p.items) != 0:
        p.print()
    print("Salesperson has earned $", sum(p.items) + p.salary, "this week!")