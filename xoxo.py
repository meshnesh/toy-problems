def xoxo(str):
  # code goes here
  countX = str.count('x')
  countO = str.count('o')
  if countO == countX:
  	print('There are {} xs and {} os'.format(countX, countO))
  	print('True')
  else:
  	print('There are {} xs and {} os'.format(countX, countO))
  	print('False')

def main():
	prompt = "Enter the string "
	strs = input(prompt)
	xoxo(strs)



if __name__ == "__main__": main()