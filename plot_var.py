# -*- coding: utf-8 -*-
"""
Created on Fri Sep  4 11:20:27 2020

@author: satis
"""

import numpy as np
import matplotlib.pyplot as plt
data = np.loadtxt('sample.txt')
x = data[:, 0]
y1 = data[:, 1]
y2 = data[:, 2]
y3 = data[:, 3]
y4 = data[:, 4]
y5 = data[:, 5]
y6 = data[:, 6]
y7 = data[:, 7]
y8 = data[:, 8]
y9 = data[:, 9]
y10 = data[:, 10]
yn = np.linspace(500,86500,26)
#plt.plot(x,y1,'r',label='w= 50')
plt.plot(x,y2,'g',label='w= 100')

#plt.plot(x,y3,'r',label='w= 150')
plt.plot(x,y4,'r',label='w= 200')

#plt.plot(x,y5,'r',label='w= 250')
plt.plot(x,y6,'y',label='w= 300')

#plt.plot(x,y7,'r',label='w= 350')
plt.plot(x,y8,'m',label='w= 400')

#plt.plot(x,y9,'r',label='w= 450')
plt.plot(x,y10,'b',label='w= 500')

plt.xlabel('probability')
plt.ylabel('time to cross(sec)')
plt.yticks(yn)
plt.legend()
plt.grid()
plt.show()