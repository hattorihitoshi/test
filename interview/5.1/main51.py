def updateBits(N, M, i, j):
    
    allOnes = -1
    left = allOnes << (j + 1)
    right = 1 << i - 1
    mask = left | right

    N_cleared = N & mask
    M_shifted = M << i

    return N_cleared | M_shifted

print(updateBits(0, 35, 3, 7))