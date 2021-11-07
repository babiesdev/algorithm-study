# Tree

## 104. Maximum Depth of Binary Tree

이진 트리의 루트가 주어지면 최대 깊이를 반환합니다.

바이너리 트리의 최대 깊이는 루트 노드에서 가장 먼 리프 노드까지 가장 긴 경로를 따라 있는 노드의 수입니다.

### Example 1:

![image](./tmp-tree.jpeg)

```
Input: root = [3,9,20,null,null,15,7]
Output: 3
```

### Example 2:

```
Input: root = [1,null,2]
Output: 2
```

### Example 3:

```
Input: root = []
Output: 0
```

### Example 4:

```
Input: root = [0]
Output: 1
```


## 100. Same Tree

두 이진 트리 p와 q의 루트가 주어졌을 때 같은지 아닌지 확인하는 함수를 작성하십시오.

두 개의 이진 트리가 구조적으로 동일하고 노드가 동일한 값을 갖는 경우 동일한 것으로 간주됩니다.

### Example 1:

![image](./ex1.jpeg)

```
Input: p = [1,2,3], q = [1,2,3]
Output: true
```

### Example 2:

![image](./ex2.jpeg)

```
Input: p = [1,2], q = [1,null,2]
Output: false
```