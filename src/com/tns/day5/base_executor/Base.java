package com.tns.day5.base_executor;

public class Base
{
int varDefault=10;
public int varPublic=20;
private int varPrivate=30;
protected int varProtected=80;

void methodDefault()
{
	System.out.println("iam a default method");
	System.out.println("Default Variable : "+varDefault);
}

public void methodPublic()
{
	System.out.println("iam a public method");
	System.out.println("public Variable : "+varPublic);
}

private void methodPrivate()
{
	System.out.println("iam a private method");
System.out.println("private Variable : "+varPrivate);
}

protected void methodProtected()
{
	System.out.println("iam a protected method");
	System.out.println("protected Variable : "+varProtected);
}

}

