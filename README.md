# ROAD-REPAIR-PROBLEM-HACKERRANK
A number of points along the highway are in need of repair. An equal number of crews are available, stationed at various points along the highway. They must move along the highway to reach an assigned point. Given that one crew must be assigned to each job, what is the minimum total amount of distance traveled by all crews before they can begin work?

For example, given crews at points {1,3,5} and required repairs at {3,5,7}, one possible minimum assignment would be {1→ 3, 3 → 5, 5 → 7} for a total of 6 units traveled.

The above mentioned is the problem statement. The solution is really simple and easily approachable.

1) First I check whether the length of both the given arrays are the same. If they are the same, I proceed with the below logic.
2) I'll just sort the two given arrays, Find the difference between both the i'th elements and return the sum of the differences.
