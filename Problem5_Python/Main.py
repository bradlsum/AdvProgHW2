# By Sumner Bradley
# 9/17/18
# World population approx. 7.6b and growth is approx. 1.1-1.2% I used 1.2 for this calculation.

from Population import Population

if __name__ == '__main__':
    starting_pop = 760000000
    gRate = 1.2
    year = 0

    p = Population(starting_pop, gRate)
    p2 = Population

    print("{:<7}".format("Year"), "{:<25}".format("Population"), "Difference")

    for i in range(1, 76):
        p.advance()
        print("{:<7}".format(i), "{:<25}".format(p.get_population()), p.get_diff())

        if (p.get_diff() > starting_pop) & (year == 0):
            p2 = p
            year = i

    if year != 0:
        print("\nThe population of the world will double by year", year)
