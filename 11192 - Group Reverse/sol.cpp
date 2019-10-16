#include<bits/stdc++.h>

using namespace std;

int main(){
	int n,g,l,r;
	char tmp;
	cin >> n;
	while(n){
		string a;
		cin >> a;
		int g  = a.length()/n;
		for (int i = 0; i <= a.length();i+=g){
			l = i;
			r = min(i+g,(int)a.length()) - 1;

			while(l<r){
				tmp = a[l];
				a[l] = a[r];
				a[r] = tmp;
				l++;
				r--;
			}
		}
		cout << a << endl;
		cin >> n;
	}
	return 0;
}
/*

XWVUTSRQPONMLKJIHGFEDCBA
LKJIHGFEDCBAXWVUTSRQPONM
HGFEDCBAPONMLKJIXWVUTSRQ
FEDCBALKJIHGRQPONMXWVUTS
DCBAHGFELKJIPONMTSRQXWVU
CBAFEDIHGLKJONMRQPUTSXWV
*/
