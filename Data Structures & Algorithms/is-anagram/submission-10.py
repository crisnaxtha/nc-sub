class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        scount = {}
        tcount = {}

        for i in s:
            scount[i] = scount.get(i, 0) + 1

        for j in t:
            tcount[j] = tcount.get(j, 0) + 1

        for k in s:
            if scount[k] != tcount.get(k, 0):
                return False

        return True