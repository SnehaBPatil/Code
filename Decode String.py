class Solution:
    def decodeString(self, s: str) -> str:
        stack=[]
        i=0
        while(i<len(s)):
            if(s[i]==']'):
                n=""
                while(stack[-1]!='['):
                    n=stack.pop()+n
                stack.pop()
                ans=""
                a=""
                while(len(stack)!=0 and (stack[-1]=="1" or stack[-1]=="2" or stack[-1]=="3" or stack[-1]=="4" or stack[-1]=="5" or stack[-1]=="6" or stack[-1]=="7" or stack[-1]=="8" or stack[-1]=="9" or stack[-1]=="0" )):
                    a=stack.pop()+a
                a=int(a)
                j=0
                for j in range(0,a):
                    ans=ans+n
                stack.append(ans)
                i=i+1
            else:
                stack.append(s[i])
                i=i+1
        ans=""
        for i in stack:
            ans=ans+i
        return ans
