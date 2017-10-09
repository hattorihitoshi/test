def permutation(s1, s2):
    if len(s1) != len(s2):
        return False
    if list(s1).sort() == list(s2).sort():
        return True
    else:
        return False

print(permutation('abc', 'cbb'))