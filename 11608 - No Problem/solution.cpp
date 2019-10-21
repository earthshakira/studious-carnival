#include<bits/stdc++.h>

using namespace std;

int main(){
	int T,t=1,c;
	int n;
	cin >> T;
	while(T>=0){
		vector<int> p(13);
		p[0] = T;
		for (int i = 0; i < 12; ++i)
			cin >> p[i+1];
		cout << "Case "<< t++ << ":" << endl;
		for (int i = 0; i < 12; ++i){
			cin >> c;
			if (c  > p[i]){
				cout << "No problem. :(" << endl;
				c = 0;
			} else {
				cout << "No problem! :D" << endl; 
			}
			p[i+1] += (p[i] - c);
		}
		cin >> T;
	}
	return 0;
}