class Cars:
    def __init__(self,manuf,Model,make,transmi,color):
        self.manuf=manuf
        self.Model=Model
        self.make=make
        self.transmi=transmi
        self.color=color
    def accelarate(self):
        print(self.manuf,self.Model,"is Moving")
    def Stop(self):
        print(self.manuf,self.Model,"is stopped")


Etios = Cars("Toyata",2010,"India","Manual","Black")
Tiago = Cars("Tata",2012,"India","Manual","Red")
Alto = Cars("Suzuki",2011,"India","Manual","Green")
Etios.accelarate()
Etios.Stop()
Tiago.accelarate()
Tiago.Stop()
Alto.accelarate()
Alto.Stop()
