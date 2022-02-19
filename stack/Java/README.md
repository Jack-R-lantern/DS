# Stack
스택(Stack)은 후입선출(Last In, First Out) 형식의 선형(linear) 자료구조다.
리스트(List)와 마찬가지로 실제 데이터의 저장은 배열 또는 연결 기반 리스트일 수 있다.
기본적으로 후입선출 방식의 자료구조이기 때문에 데이터 삽입 또는 삭제를 위한 마지막 데이터에 대한 정보만 관리하면 된다.
후입선출의 특징으로 데이터 개수(n)에 대한 삽입, 삭제 시간 복잡도는 아래와 같다.

|     | pop() | push |
|-----|-------|------|
| 스택  | n(1)  | n(1) |

jdk 8 기준, java 내 java.util.Stack 클래스는 legacy다.
대신 Deque 인터페이스를 구현한 클래스를 사용하는 것을 권장한다.

## ArrayStack.java
- 배열(array) 구조를 이용해 데이터를 하도록 구현했다.
- 배열이 꽉찼을 경우 기존 배열의 *2 크기로 확장한다.
- Search() 메서드의 경우 데이터 비교를 위한 java.util.Comparator를 이용하는 것을 고려 필요