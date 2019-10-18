#include<bits/stdc++.h>

using namespace std;

int main(){
	int T,n,x;
	cin >> T;
	for(int t=1;t<=T;t++){
		vector<int> v[3];
		map<int,bool> s[3];
		int max_val = -1;
		for (int i = 0; i < 3; ++i){
			cin >> n;
			while(n--){
				cin >> x;
				s[i][x] = true;
				max_val = max(max_val,x);
			}
		}
		for (int j = 0; j <=max_val; ++j){
			if ((s[0][j] + s[1][j] + s[2][j]) == 1){
				for (int i = 0; i < 3; ++i)
					if(s[i][j])v[i].push_back(j);
			}
		}

		cout << "Case #"<< t << ":\n";
		int max = 0;
		
		for(int i =0;i<3;i++)
			if(v[i].size() > v[max].size())
				max = i;

		for (int i = 0; i < 3; ++i){
			if (v[i].size() != v[max].size())
				continue;
			cout << i + 1 << " " << v[i].size();
			for(int q:v[i])
				cout << " " << q;
			cout << endl;
		}
	}
	return 0;
}