#include "grader.h"
#include "cluedo.h"

void Solve(){
   int r,m=1,l=1,w=1;
	while(1){
		r=Theory(m,l,w);
		switch(r){
		case 1:m++;break;				
		case 2:l++;break;
		case 3:w++;break;
		case 0:return;
		}
	}
}
