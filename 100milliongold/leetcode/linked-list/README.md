# Linked List

## 206. Reverse Linked List

단일 연결 목록의 머리가 주어지면 목록을 뒤집고 역 목록을 반환합니다.


### Example 1:

![image](./image1.jpeg)

```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```

### Example 2:

![image](./image2.jpeg)

```
Input: head = [1,2]
Output: [2,1]
```

## 141. Linked List Cycle

연결 목록의 머리인 머리가 주어지면 연결 목록에 순환이 있는지 확인합니다.

다음 포인터를 계속 따라가서 다시 도달할 수 있는 노드가 목록에 있는 경우 연결 목록에 주기가 있습니다.
내부적으로 pos는 꼬리의 다음 포인터가 연결된 노드의 색인을 나타내는 데 사용됩니다. pos는 매개변수로 전달되지 않습니다.

연결 목록에 주기가 있으면 true를 반환합니다. 그렇지 않으면 false를 반환합니다.

### Example 1:

```
Input: head = [3,2,0,-4], pos = 1
Output: true
설명: 연결 목록에는 꼬리가 첫 번째 노드(0-인덱싱됨)에 연결되는 주기가 있습니다.
```

### Example 2:

```
Input: head = [1,2], pos = 0
Output: true
설명: 연결 목록에는 꼬리가 0번째 노드에 연결되는 주기가 있습니다.
```

### Example 3:

```
Input: head = [1], pos = -1
Output: false
설명: 연결 목록에 주기가 없습니다.
```

