#include <bits/stdc++.h>
#include <algorithm>
#include <iostream>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int t,n;
	cin>>t;
	while(t-->0)
	{
		cin>>n;
		int arr[n];
		for(int i=0;i<n;i++)
			cin>>arr[i];
		//cout<<arr[2];
		if(next_permutation(arr, arr+n))
			for(int i=0;i<n;i++)
				cout<<arr[i]<<" ";
		else
			for(int i=0;i<n;i++)
				cout<<arr[i]<<" ";
		cout<<endl;
	}
return 0;
}