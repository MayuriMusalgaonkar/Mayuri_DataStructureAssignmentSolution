# Mayuri_DataStructureAssignmentSolution

1.SkyScraperBuilding Construction----

Your friend is a chief architect, who is working on building a skyscraper, in Mumbai. The
construction is in such a way that the floors will be constructed in other factories and they will be
assembled. All the sizes will be distinct.
The skyscraper needs to be constructed in N days with the following conditions:
a) Every day a floor is constructed in a separate factory of distinct size.
b) The floor with the larger size must be placed at the bottom of the building.
c) The floor with the smaller size must be placed at the top of the building.
Note: A floor cannot be assembled in the building until all floors larger in size are placed.
As a friend, he wants you to build a small program that will help him analyze the construction
process, to avoid manual work and errors.
Input
First Line: contains the total floors N in the building
Second Line onwards: Contains N inputs in which the ith integer denotes the size of the floor
that will be given to architect by factories on the ith day.
Output
You are required to print N lines. Print the size of the floor in descending order, which can be
assembled.
If no floor can be assembled on the ith day, leave the line empty.
Sample Test Cases
TestCase 1
enter the total no of floors in the building
3
enter the floor size given on day : 1
3
enter the floor size given on day : 2
1
enter the floor size given on day : 3
2
The order of construction is as follows
Day: 1
Graded Assignment 3 - Data Structures
3
Day: 2
Day: 3
2 1
Explanation
The largest floor size is available on day 1 itself, hence it will be assembled on day 1.
On the second day floor of size 1 is available and cannot be assembled as the floor of size 2 is
not available.
On the third day floor of size 2, is available and accordingly, the remaining floor (2,1) will
assemble in the order 2,1
---------------------------------------------


2. BSTToSkewedBT--
You are working in an MNC, which manages the Transactions, where only BST is used as a
Data Structure. The company stores all the data of transactions in BST such that the tree is
always a complete BST.
A new business requirement has arrived where the BST should not contain any left node.
You are required to modify the existing BST and display the node values present in ascending
order.
Hint: ( Convert the Binary Search Tree into a Skewed Tree)
