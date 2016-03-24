CONST_MAX = 100000

def printPairs(arr, arr_size, difference,):

	binmap = [0]*CONST_MAX
	for i in range(0,arr_size):
		temp = difference+arr[i]
		if (temp>=0 and binmap[temp]==1):
			# num += 1
			print ( "Pair with the given sum is", arr[i], "and", temp)
		binmap[arr[i]]=0

		# print(num)

A = [1,1,3,3,5,6]
n = 2
printPairs(A, len(A), n,)