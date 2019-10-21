#include<bits/stdc++.h>

using namespace std;

int main(){
	int T,t=1,c;
	int n;
	cin >> T;
	string ans;
	while(T){
		ans = "POSSIBLE\n";
		vector<int> p(T+1);
		p[0] = 0;
		for (int i = 0; i < T; ++i)
			cin >> p[i+1];
		sort(p.begin(), p.end());

		for (int i = 1; i <= T; ++i)
			if((p[i] - p[i-1]) > 200){
				ans = "IMPOSSIBLE\n";
				break;
			}
		if(2*(1422 - p[T]) > 200)
			ans = "IMPOSSIBLE\n";

		cout << ans;
		cin >> T;
	}
	return 0;
}