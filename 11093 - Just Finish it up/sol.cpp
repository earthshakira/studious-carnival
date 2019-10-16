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
		for(int i = n-2;i>=0;i--){
			d[i]+=d[i+1];
		for(int xx:d)
			cout << xx << " ";
		if(sum >= 0){

		}
		cout << "Case "<< t << ":" << ans << endl;
	}
	return 0;
}