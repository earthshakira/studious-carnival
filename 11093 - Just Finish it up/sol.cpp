#include<bits/stdc++.h>

using namespace std;

int main(){
	int T;
	int n;
	cin >> T;
	for(int t=1;t<=T;t++){
		cin >> n;
		string ans = "Not Possible";
		vector<int> p(n);
		vector<int> q(n);
		vector<int> d(n);
		for (int i = 0; i < n; ++i)
			cin >> p[i];

		for (int i = 0; i < n; ++i)
			cin >> q[i];
		long long int sum = 0;
		for (int i = 0; i < n; ++i){
			d[i] = p[i] - q[i];
			sum += d[i];
		}
		if(sum < 0){
			cout << "Case "<< t << ":" << ans << endl;
			continue;
		}
		
		cout << "Case "<< t << ":" << ans << endl;
	}
	return 0;
}