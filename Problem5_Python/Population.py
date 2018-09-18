class Population:
    def __init__(self):
        self.population = ""
        self.growth_rate = ""
        self.diff = ""

    def __init__(self, p, g):
        self.population = p
        self.growth_rate = g

    def get_population(self):
        return self.population

    def get_growth_rate(self):
        return self.growth_rate

    def get_diff(self):
        return self.diff

    def set_population(self, p):
        self.population = p

    def set_growth_rate(self, g):
        self.growth_rate = g

    def set_diff(self, s):
        self.diff = s

    def advance(self):
        self.set_diff(self.get_population() * self.get_growth_rate() - self.get_population())
        self.set_population(self.get_population() * self.get_growth_rate())
