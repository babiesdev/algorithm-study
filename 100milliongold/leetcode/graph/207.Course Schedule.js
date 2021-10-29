/**
 * @param {number} numCourses
 * @param {number[][]} prerequisites
 * @return {boolean}
 */
// 토폴로지 순서가 가능한지 확인하기 위해 Kahn's algorithm 알고리즘을 사용합니다.
// 이 문제에서 prequisites 배열의 각 항목은 [a,b] 형식으로 나타납니다.
var canFinish = function(numCourses, prerequisites) {
    // 각 코스가 'a'였던 횟수를 포함하는 배열을 초기화합니다.
    // 즉, 수강하기 전에 다른 과정을 수강해야 함을 의미합니다.
    // 그래프로 상상하면 이 코스는 모두 다른 꼭짓점에서 들어가는 가장자리를 가지며 개수는 각 꼭짓점으로 들어가는 가장자리의 총 수를 나타냅니다.
    const inDegree = new Array(numCourses).fill(0);
    // 각 코스가 'a'인 횟수를 계산합니다.
    // 각 코스 수는 inDegree 배열의 해당 인덱스에 배치됩니다.
    for(const pre of prerequisites) {
        inDegree[pre[0]]++
    }
    // 전제 조건이 없는 과정의 배열을 초기화합니다. 이는 항상 [a,b] 그룹의 'b' 위치에 있습니다.
    // 그래프로 상상한다면, 이 코스는 그들을 가리키는 에지가 없을 것입니다.
    const zeroDegree = [];
    // 코스에 대한 전제 조건이 없으면 개수는 0이 됩니다.
    // 이것을 zeroDegree 배열에 추가합니다.
    for(let i = 0; i < numCourses; i++) {
        if(inDegree[i]===0) {
            zeroDegree.push(i);
        }
    }
    // zeroDegree 배열이 비어 있으면 다른 하나를 먼저 수강할 필요 없이 한 과목을 수강할 수 없기 때문에 계층적 관계가 없음을 의미합니다.
    if(zeroDegree.length === 0) return false;

    // zeroDegree 배열을 통해 루프
    while(zeroDegree.length) {
        // 반복할 때마다 배열에서 코스를 제거합니다.
        const course = zeroDegree.pop();
        // 이 코스가 다른 코스의 선행 코스였다는 전제 조건 배열의 모든 시간을 고려합니다. 즉, 코스는 'b' 위치에 있었습니다.
        for(const pre of prerequisites) {
            if(course === pre[1]) {
                // 일치하는 '' 코스의 개수에서 빼기
                inDegree[pre[0]]--
                // 이 관계의 'a' 과정이 inDegree 배열에서 0이면 사용된 모든 시간을 설명했음을 의미합니다.
                // 그래프로 상상하면 이 꼭짓점으로 이어지는 모든 가장자리를 설명했습니다.
                if(inDegree[pre[0]]===0) {
                    // 이 코스를 zeroDegree로 푸시하고 다른 코스의 선행 코스로 필요한지 확인합니다.
                    // 그래프로 상상하면 이 정점에 다른 정점을 가리키는 가장자리가 있는지 확인합니다.
                    zeroDegree.push(pre[0])
                }
            }
        }
    }
    // 배열에 0이 아닌 인덱스가 있으면 설명되지 않는 사전 과정 관계가 있음을 의미합니다.
    for(const num of inDegree) {
        if(num!== 0) return false
    }
    return true;
};




console.log(2 , [[1,0]]);