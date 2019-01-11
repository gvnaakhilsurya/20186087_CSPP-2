class Question(object):
    """docstring for Question"""
    global result
    result = {} 
    def __init__ (self, question = None,options = []):
        super(Question, self).__init__()
        self.question = question
        self.options = options
        

    def  getQuestion(self):
        return self.question
    def setQuestion(self,newquestion):
        self.question = newquestion
    def getOptions(self):
        return self.options
    def setOptions(self,newoptions):
        self.options = newoptions
        # print("setOptions",self.options)
    def setOptionVotes(self,option):
        count = 0
        if self.options[option] in result:
            count = result.get(self.options[option])
            result[self.options[option]] = count +1
        else:
            result[self.options[option]] = 1
            # print(result)
            
    def indexOf(self,name):
        for i in range(len(self.options)):
            if name == self.options[i]:
                return i
        return -1
    def getText(self):
        return self.question
    def commonSelectedOption(self):
        lv = list(result.values())
        lk = list(result.keys())
        givenvotes = max(lv)
        for name,votes in result.items():
            if votes == givenvotes:
                return name



        