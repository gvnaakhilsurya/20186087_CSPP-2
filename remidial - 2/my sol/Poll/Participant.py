class Participant(object):
	"""docstring for Participant"""
	def __init__(self,name,option,optedName):
		# super(Participant, self).__init__()
		self.name = name
		self.option = option
		self.optedName = optedName

	def getName(self):
		return self.name
	def setName(self,newname):
		self.name = newname

	def getOption(self):
		return self.option
	def setOption(self,newoption):
		self.option = newoption

	def getOptedname(self):
		return self.optedName
	def setOptedname(self,newoptedname):
		self.optedName = newoptedname
