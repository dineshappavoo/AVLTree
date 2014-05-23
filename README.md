AVL Tree
=========

An AVL tree (Adelson-Velskii and Landis' tree, named after the inventors) is a self-balancing binary search tree. 
It was the first such data structure to be invented.[1] In an AVL tree, the heights of the two child subtrees of 
any node differ by at most one; if at any time they differ by more than one, rebalancing is done to restore this 
property. Lookup, insertion, and deletion all take O(log n) time in both the average and worst cases, where n is 
the number of nodes in the tree prior to the operation. Insertions and deletions may require the tree to be rebalanced 
by one or more tree rotations.

##Functionalities

Implementation of SplayTree in java. The library to implement SplayTree with the following operations,


    insert() - To add new (key, value) pair to the SplayTree
    find() - To get an element from the SplayTree by passing the key
    findMin() - To get the minimum element from the SplayTree
    findMax() - To get the maximum element from the SplayTree
    remove() - To remove a particular key from the SplayTree
    removeValue() - To remove all key matching the values from the list
    size() - To return the total size of the list
    

##Original release notes from 2014

SplayTree is a randomized data structure. The following code snippet shows how to run the library,


    	SplayTree<Long, Long> splayTree=new SplayTree<Long, Long>();
		
		splayTree.insert(10L, 25L);
		splayTree.insert(12L, 35L);
		splayTree.insert(13L, 45L);
		splayTree.insert(14L, 55L);
		System.out.println(splayTree.find(10L));
		System.out.println(splayTree.findMin());
		System.out.println(splayTree.findMax());
		splayTree.remove(13L);
		System.out.println(splayTree.size());
		
##Project Contributor

* Dinesh Appavoo ([@DineshAppavoo](https://twitter.com/DineshAppavoo))
