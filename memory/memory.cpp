#include "grader.h"
#include "memory.h"

void play() {
	int  m[50];
	for(int i=0;i<50;i++)m[i]=0;
	char prev,now;
		for(int i=1;i<=50;i++){
		if(i%2==0){
			prev=faceup(i);
			prev-=65;
			if(m[prev]>0)
				faceup(m[prev]);
			else m[prev]=i;
		}else{
			now=faceup(i);
			now-=65;
			if(now==prev)
				continue;
			if(m[now]>0){
				faceup(i);
				faceup(m[now]);
			}else{
				m[now]=i;
			}
		}
	}

}
