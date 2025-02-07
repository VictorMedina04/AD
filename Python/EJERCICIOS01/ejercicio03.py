def string_diferentes(str1, str2):
    out1 = ''.join(c for c in str1 if c not in str2)
    out2 = ''.join(c for c in str2 if c not in str1)
    return out1, out2

print(string_diferentes("abcdef", "acdfg"))