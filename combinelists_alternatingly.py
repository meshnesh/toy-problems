



list1 = ['a', 'b', 'c']
list2 = ['1', '2','3']
num = min(len(list1), len(list2))
result = [None]*(num*2)
result[::2] = list1[:num]
result[1::2] = list2[:num]
result.extend(list1[num:])
result.extend(list2[num:])
print(result)