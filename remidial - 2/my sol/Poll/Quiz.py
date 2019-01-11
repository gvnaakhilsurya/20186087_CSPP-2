
from Question import *
class Quiz(object):
	"""docstring for Quiz"""
	def __init__(self):
		self.qlist = []
		self.qlsize = 0

	def addQuestion(self,question):
			self.qlist.append(question)
	def getQuestion(self,quesno):
		return self.qlist[quesno]



		

