package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;

public final class cp
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static long[] fact,inv_fact;
	static long mod=(long)(1e9+7);
	static int maxn=(int)(5e5+5);
	
	static long pow(long a,long b)
	{
		long x=1,y=a;
		while(b>0)
		{
			if(b%2==1)
			{
				x=(x*y)%mod;
			}
			y=(y*y)%mod;b=b/2;
		}
		
		return x;
	}
	
	static void build()
	{
		fact=new long[maxn];fact[0]=fact[1]=1;inv_fact=new long[maxn];
		
		for(int i=2;i<maxn;i++)
		{
			fact[i]=(fact[i-1]*i)%mod;
		}
		
		inv_fact[maxn-1]=pow(fact[maxn-1],mod-2);
		
		for(int i=maxn-2;i>=0;i--)
		{
			inv_fact[i]=(inv_fact[i+1]*(i+1))%mod;
		}
	}
	
	static long nCr(int n,int r)
	{
		long val1=fact[n],val2=inv_fact[r],val3=inv_fact[n-r],val4=(val2*val3)%mod;
		
		return (val1*val4)%mod;
	}
	
    public static void main(String args[]) throws Exception
    {
		build();int t=sc.nextInt();
		
		while(t>0)
		{
		
		
			char[] a=sc.next().toCharArray();int[] cnt=new int[4];

			for(int i=0;i<a.length;i++)
			{
				cnt[a[i]-'a']++;
			}

			int val1=Math.min(cnt[0],cnt[1]),val2=Math.min(cnt[2],cnt[3]);

			long res1=0,res2=0;

			for(int i=0;i<=val1;i++)
			{
				long now1 = nCr(cnt[0],i),now2=nCr(cnt[1],i);

				long x=(now1*now2)%mod;

				res1=(res1+x)%mod;
			}

			for(int i=0;i<=val2;i++)
			{
				long now1 = nCr(cnt[2],i),now2=nCr(cnt[3],i);

				long x=(now1*now2)%mod;

				res2=(res2+x)%mod;
			}

			long ans = (res1*res2)%mod; ans=(ans-1+mod)%mod;
			
			out.println(ans);t--;
		}
		
		out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}