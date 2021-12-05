class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        new_list = sorted(strs, key=lambda x: sorted(map(sorted, x)))

        li = []
        temp_li = []

        for word in new_list:
            if len(temp_li) == 0:
                temp_li.append(word)
                sorted_word = sorted(word)
                continue

            if sorted_word == sorted(word):
                temp_li.append(word)
            else:
                li.append(temp_li)
                temp_li = [word]
                sorted_word = sorted(word)

        if temp_li:
            li.append(temp_li)

        return li
