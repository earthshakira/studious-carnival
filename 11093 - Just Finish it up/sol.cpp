#include<bits/stdc++.h>

using namespace std;

int main(){
	int T;
	int n;
	cin >> T;
	for(int t=1;t<=T;t++){
		cin >> n;
		string ans = "Not possible";
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
			// cout << d[i] << " ";
			sum += d[i];
		}
		// cout << endl;
		if(sum < 0){
			cout << "Case "<< t << ": " << ans << endl;
			continue;
		}
		int fuel = d[0];
		int starter = 0;
		for (int i = 1; i < n; ++i){
			if (fuel<0){
				fuel = d[i];
				starter = i;
				continue;
			}
			fuel+=d[i];
		}
		cout << "Case "<< t << ": Possible from station " <<  starter + 1 << endl;
	}
	return 0;
}