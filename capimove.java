int test,i,j,k,n,max;
	Scanner fg=new Scanner(System.in);
	test=fg.nextInt();
	for(i=0;i<test;i++){
            ArrayList<Integer> out=new ArrayList();
            ArrayList<Integer> pop=new ArrayList();
            n=fg.nextInt();
		int tel2[]=new int[n-1];
		int tel1[]=new int[n-1];
		for(j=0;j<n;j++){
                    pop.add(fg.nextInt());
		}
                ArrayList<Integer> popu;
                for(k=0;k<n-1;k++){
			tel1[k]=fg.nextInt();
			tel2[k]=fg.nextInt();
		}
		for(j=1;j<=n;j++){
                    popu=(ArrayList<Integer>)pop.clone();
                    popu.remove(j-1);
			for(k=0;k<n-1;k++){
				if(tel1[k]==j){
					popu.remove(pop.get(tel2[k]-1));
				}
                                if(tel2[k]==j)
                                {
                                    popu.remove(pop.get(tel1[k]-1));
                                }
                                if(tel1[k]>j && tel2[k]>j)
                                    break;
			}
                       max=Collections.max(popu);
			out.add(pop.indexOf(max)+1);
                        popu.clear();
		}
                pop.clear();
              for(j=0;j<out.size();j++){
                  System.out.print(out.get(j)+" ");
              }
              System.out.println();
              out.clear();
	}   