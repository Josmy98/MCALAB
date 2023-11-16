#include<stdio.h>
int u[10],b[10],n;
void display(int x[]) {
int i;
printf("{");
for(i=0;i<n;i++)
   printf("%d",x[i]);
printf("}");
void bitdis(int x[]) {
int i;
printf("{")
for(i=0;i<n;i++)
   if(x[i]==1)
      printf("%d",u[i]);
}
printf("}");
}
