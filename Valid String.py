class Solution:
    def valuableString(self, n, arr):
        from collections import OrderedDict
        l={}
        for i in range  (0,n):
            k=str(arr[i])
            con=0
            vow=0
            for j in k:
                if(j=='a' or j=='e'or j=='i' or j=='o' or j=='u'):
                    vow=vow+1
                else:
                    con=con+1
            if(l.get(abs(con-vow))==None):
                l[abs(vow-con)]=i
        dict1 = OrderedDict(sorted(l.items(),reverse=True))
        value=list(dict1.values())[0]
        return str(arr[value])
