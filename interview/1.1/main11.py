def unique_char(s):
    if len(s) > 128:
        return False
    char_set = [False] * 128
    for c in s:
        char_int = ord(c) - ord('A')
        print(char_int)
        if char_set[char_int] == False:
            char_set[char_int] = True
        else:
            return False
    return True

print(unique_char('abced'))
print(unique_char('abceda'))
print(unique_char('abcedA'))