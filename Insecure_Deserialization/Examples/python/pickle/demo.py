# importinig the module 
import pickle 

data = {'name': 'naveenj', 'id': '1', 'add': 'India'} 
with open('data.pickle', 'wb') as f1 :		 
	
	# converts object to byte stream(list, dict, etc.) 
	pickle.dump(data, f1)	 
	print('Pickling Completed...') 

with open('data.pickle', 'rb') as f2 : 
	print('Unpickling the data : ') 
	
	# converts byte stream(generated through pickling)back into object 
	data = pickle.load(f2) 
	print(data)

