
def no_edit(str1, str2):
    if str1 == str2:
        return True
    else:
        return False

def one_edit_insert(str1, str2):
    len1 = len(str1)
    len2 = len(str2)
    diff = len1 - len2
    if abs(diff) > 1:
        return False
    if diff > 0:
        strl = str1
        strs = str2
    else:
        strl = str2
        strs = str1

    indexl = 0
    indexs = 0
    while indexl < len(strl) and indexs < len(strs):
        if strl[indexl] != strs[indexs]:
            if indexl != indexs:
                return False

            indexl += 1
        else:
            indexl += 1
            indexs += 1
    
    return True

def one_edit_replace(str1, str2):
    if len(str1) != len(str2):
        return False

    i = 0
    found_diff = False
    while i < len(str1):
        if str1[i] != str2[i]:
            if found_diff:
                return False
            else:
                found_diff = True
        i += 1

    return True

print(one_edit_insert('abc', 'abbc'))
print(one_edit_replace('abced', 'abeee'))

