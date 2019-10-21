#include<bits/stdc++.h>

using namespace std;

string p(int i){
	if (i)
		cout << i;
	else cout << '*';
	return "";
}
int main(){
	int l,r;

	while(1){
		int n, b;
		cin >> n >> b;
		if (n == 0 && b==0)
			break;
		vector<int> lefty(n+1);
		vector<int> righty(n+1);

		for (int i = 1; i <= n; ++i)
			lefty[i] = i-1;
		for (int i = 0; i < n; ++i)
			righty[i] = i+1;
		
		lefty[1] = 0;
		righty[n] = 0;

		while(b--){
			cin >> l >> r;
			// printf("\n(%d,%d) ",l,r);
			l = lefty[l];
			r = righty[r];
			// printf("(%d,%d)\n",l,r);

			if (l > 0)
				righty[l] = r;
			if (r > 0)
				lefty[r] = l;
			cout << p(l) << " " << p(r) << endl;
		}
		cout << "-\n";
	}
	return 0;
}