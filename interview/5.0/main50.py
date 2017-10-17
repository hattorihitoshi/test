
def set_bit(num, i):
    return num | (1 << i)

def clear_bit(num, i):
    return num & ~(1 << i)

print(1 << 1)
print(~1)

print(set_bit(1, 5))
print(clear_bit(-1, 5))