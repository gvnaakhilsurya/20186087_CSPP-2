
class Reservation:
    def __init__(self,name,roomnumber=100):
        self.name = name
        self.roomnumber = roomnumber
    def setRoomnumber(self,newroomnumber):
        self.roomnumber = newroomnumber
    def setName(self,newname):
        self.name = newname
    def getRoomnumber(self):
        return self.roomnumber
    def getName(self):
        return self.name
class Hotel:
    def __init__(self):
        self.rooms = [None,None,None,None,None]
        self.size = 5
        self.count = 0
        # for i in range(self.size):
        #     self.rooms[i] = None
    def reservationRoom(self,name):
        if self.size == self.count:
            print("All Rooms are reserved")
            return
        # print("count is ",self.count)
        # print("reservationRoom.....",self.size)
        for i in range(self.size):
            if self.rooms[i]  == None:
                resObj = Reservation(name)
                resObj.setRoomnumber(i+1)
                self.rooms[i] = resObj
                self.count += 1
                return i + 1
        return -1
    def reserveRoom(self,person,roomnumber):
        # print("reserve room function",self.size)
        # print("lengt",len(self.rooms))
        # print("romm num", roomnumber)
        if self.size == self.count:
            print("All Rooms are reserved")
            # return
        elif (self.rooms[roomnumber-1] == None):
            # print("elif block")
            resObj = Reservation(person,roomnumber)
            self.rooms[roomnumber-1] = resObj
            self.count += 1
            return True
        else:
            # print("last block")
            print("Room is already reserved")
        return False
    def cancelReservation(self,name):
        for i in range(self.size):
            if self.rooms[i] != None and self.rooms[i].getName() == name:
                self.rooms[i] = None
                self.count = self.count - 1
    def printReservations(self):
        print("count is ",self.count)
        for i in range(self.count):
            if self.rooms[i] != None:
                print(self.rooms[i].getName()," ",self.rooms[i].getRoomnumber())
    def buildRooms(self,roomnumber):
        if roomnumber > 0:
            for i in range(roomnumber):
                self.rooms.append(None)
            self.size = self.size + roomnumber
            return True
        else:
            return False
class Solution1:
    hotel = Hotel()
    input_1 = int(input())
    c = 0
    while c < input_1:
        line = str(input())
        line = line.split(" ")
        if line[0] == "reserve":
            name = line[1]
            roomnumber = -1
            if name != None:
                roomnumber = hotel.reservationRoom(name)
            elif roomnumber != -1:
                print(name, " ",roomnumber)
            # return
        if line[0] == "reserveN":
            # print("reserveN case")
            name = line[1]
            if name == None:
                roomnumber = -1
            else :
                roomnumber = int(line[2])
            if(hotel.reserveRoom(name,roomnumber)):
                print(name," ",roomnumber)
            # return
        if line[0] == "print":
            hotel.printReservations()
        if line[0] == "cancel":
            name = line[1]
            if name != None:
                hotel.cancelReservation(name)
                print(name,"now has no reservations.")
            else:
                print("No input")
        if line[0] == "build":
            roomnumber = int(line[1])
            if(hotel.buildRooms(roomnumber)):
                print("Added",roomnumber,"more rooms")
            else:
                print("no rooms are added")
        c = c + 1

def main():
    solution = Solution1()
if __name__ == '__main__':
    main()

