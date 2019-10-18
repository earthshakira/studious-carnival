#include<bits/stdc++.h>

using namespace std;

int main(){
	int T;
	int n;
	cin >> T;
	for(int t=0;t<T;t++){
		cin >> n;
		char c;
		int v;
		map<char,int> mp;
		
		for (int i = 0; i < n; ++i){
			cin >> c >> v;
			mp[c]=v;
		}
		long long value = 0;
		cin >> n;
		string s;
		getline(cin,s);
		for (int i = 0; i < n; ++i){
			getline(cin,s);
			for(char t:s)
				value+=mp[t];
		}
		printf("%d.%02d$\n",value/100,value%100);
		
	}
	return 0;
}