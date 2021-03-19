# importing the module 
import marshal 

data = {'name': 'naveen','age': 23,'address': 'India'} 

# dumps() return byte object stored in variable 'bytes' 
bytes = marshal.dumps(data)	 
print('----------------------------------------')
print('Serialized Data : ', bytes) 

# loads() convert byte object to value 
new_data = marshal.loads(bytes)	 
print('----------------------------------------')
print('Deserilization Data : ', new_data)
print('_____________________________________________________________________________')
