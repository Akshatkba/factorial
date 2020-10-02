int factorial(int n)
{
	int ans=1;
	for(int i=n; i>=2; i--)
	{
		ans*=i;
	}
	return ans;
}