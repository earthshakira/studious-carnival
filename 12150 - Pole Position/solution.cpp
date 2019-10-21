#include<bits/stdc++.h>

using namespace std;

int main(){
	int n,a,b;
	
	while(1){
		cin >> n;
		if (!n)
			break;
		vector<pair<int,long int>> v;
		vector<int> init(n,-1);
		bool ans = true;
		for (int i = 0; i < n; ++i)
		{
			cin >> a >> b;
			b+=i;
			if(b<0 || b>=n)
				ans = false;
			else {
				init[b] = a;
			}
		}
		for(int x:init){
			if (x == -1)
				ans = false;
		}

		if (ans){
			for (int i = 0; i < n; ++i)
				cout << init[i] << ((i + 1) < n ? " ": "");
			cout << "\n";
		} else 
			cout <<  "-1\n";


	}
}