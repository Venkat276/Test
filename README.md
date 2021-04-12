Lai Yang Global Snapshot Algoritham

![alt text](/res/laiyang_sample.jpg)

Sample Input according to above image.

- Message(20, 1, 2, 1, 2)
- Message(30, 1, 2, 2, 6)
- Message(10, 1, 2, 3, 5)
- Message(30, 2, 1, 4, 6)
- Message(20, 2, 1, 7, 8)


`
========================================================
	Lai Yang Global Snapshot Algoritham
========================================================

Enter initial value for process P1:
800
Enter initial value for process P2:
200
Enter total number of timestamps
10
Enter total number of messages
5
Processes Initialized Successfully.
Initial Value P1 = 800
Initial Value P2 = 200
Total System Value = 1000

========================================================
Enter values for message 1
Amount: 
20
From Process[1 OR 2]: 
1
To Process[1 OR 2]: 
2
Start Timestamp[0-10]:
1
End Timestamp[0-10]:
2
Enter values for message 2
Amount: 
30
From Process[1 OR 2]: 
1
To Process[1 OR 2]: 
2
Start Timestamp[0-10]:
2
End Timestamp[0-10]:
6
Enter values for message 3
Amount: 
10
From Process[1 OR 2]: 
1
To Process[1 OR 2]: 
2
Start Timestamp[0-10]:
3
End Timestamp[0-10]:
5
Enter values for message 4
Amount: 
30
From Process[1 OR 2]: 
2
To Process[1 OR 2]: 
1
Start Timestamp[0-10]:
4
End Timestamp[0-10]:
6
Enter values for message 5
Amount: 
20
From Process[1 OR 2]: 
2
To Process[1 OR 2]: 
1
Start Timestamp[0-10]:
7
End Timestamp[0-10]:
8

==========================
|  Timestamp   P1      P2 |
==========================
|   T0  |  800  |  200  |
==========================
|   T1  |  780  |  200  |
==========================
|   T2  |  750  |  220  |
==========================
|   T3  |  740  |  220  |
==========================
|   T4  |  740  |  190  |
==========================
|   T5  |  740  |  200  |
==========================
|   T6  |  770  |  230  |
==========================
|   T7  |  770  |  210  |
==========================
|   T8  |  790  |  210  |
==========================
|   T9  |  790  |  210  |
Enter red message index[1-5]:
1
Local State P1: 780
Local State P2: 200
Total of sent messages from P1 to P2:  20
Total of messages received from P1 to P2:  0
Total of sent messages from P2 to P1:  0
Total of messages received from P2 to P1:  0
Total Initial Value 1000 == Total Snapshot Value 1000
Initial system value is EQUAL to snapshot value hence it is a consistant global state.

========================================================
	END OF ALGORITHAM
========================================================
`

