from Quiz import *
from Participant import *
from Question import *
def Solution():
    """docstring for Solution"""
    questions = int(input())
    options = []
    quesObj = Question()
    quiz = Quiz()
    for i in range(questions):
        question = str(input())
        for i in range(4):
            options.append(str(input()))
        quesObj = Question(question,options)
        quiz.addQuestion(quesObj)
    participants = int(input())
    for i in range(participants):
        name = str(input())
        for i in range(questions):
            lines = input().split(" ")
            q = int(lines[0])
            parsObj = Participant(name,q-1,lines[1])
            x = quesObj.indexOf((lines[1]))
            quesObj.setOptionVotes(x)

    for i in range(questions):
        print("Highest number of votes for question : "+ quiz.getQuestion(i).getText()  + " : " + quiz.getQuestion(i).commonSelectedOption())

def main():
    Solution()


if __name__ == '__main__':
    main()




        
