#include<bits/stdc++.h>

using namespace std;

int main(){
	int T;
	int n,prev,next,peaks;
	cin >> n;
	while(n){
		vector<int> v(n);
		peaks = 0;
		for (int i = 0; i < n; ++i)
			cin >> v[i];

		for (int i = 0; i < n; i++)
		{
			prev = v[(i + n - 1)%n];
			next = v[(i + 1)%n];
			// cout << i << " " << prev << " " << v[i] << " "<< next << " " << endl;
			if (v[i] > prev && v[i] > next || v[i] < prev && v[i] < next)
				peaks++;
		}
		
		cout << peaks << endl;
		cin >> n;
	}
	return 0;
}