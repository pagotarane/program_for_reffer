import java.io.*;

enum Selection
{
ROCK,PAPER,SCISSOR;
}
class Game
{
public static void main(String args[])
{
Console c = System.console();
Selection user,comp;
int nt=0, uw=0 ,cw=0;

int g= Integer.parseInt(c.readLine("Enter number of games in tourn......."));
int count=1;
while(count++ <= g)
{
int r = (int)(Math.random()*3);
if(r==0)
	comp=Selection.ROCK;
else if(r==1)
	comp=Selection.PAPER;
else
	comp=Selection.SCISSOR;

int u = Integer.parseInt(c.readLine("0 ROCK, 1 PAPER, 2 SCISSOR "));

if(u==0)
	user=Selection.ROCK;
else if(r==1)
	user=Selection.PAPER;
else
	user=Selection.SCISSOR;

if(user==Selection.ROCK && comp==Selection.ROCK)
	nt++;
else if(user==Selection.PAPER && comp==Selection.PAPER)
	nt++;
else if(user==Selection.SCISSOR && comp==Selection.SCISSOR)
	nt++;
else if(user==Selection.ROCK && comp==Selection.SCISSOR)
	uw++;
else if(user==Selection.PAPER && comp==Selection.ROCK)
	uw++;
else if(user==Selection.SCISSOR && comp==Selection.PAPER)
	uw++;
else if(comp==Selection.ROCK && user==Selection.SCISSOR)
	cw++;
else if(comp==Selection.PAPER && user==Selection.ROCK)
	cw++;
else if(comp==Selection.SCISSOR && user==Selection.PAPER)
	cw++;

System.out.println(user+ " " +comp);
}
System.out.println("Tie " + nt + "user " + uw + " comp " + cw);
try
{
File f=new File("score.txt");
FileWriter fw=new FileWriter(f,true);
PrintWriter pw=new PrintWriter(fw);
pw.println("Tie " + nt + "user " + uw + " comp " + cw + "-- " + new java.util.Date());
pw.close();
}
catch(IOException e)
{
System.out.println("issue" + e);
}

}
}







