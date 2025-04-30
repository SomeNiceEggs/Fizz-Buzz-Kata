/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class FizzBuzz 
{
    private int k = 0;
    private String f = "Fizz";
    private String b = "Buzz";
    private String lastNum = "";
    
	public int getNumbers()
    {
        for(int i = 0; i < 100; i++)
        {
            k += 1;
            System.out.println(k);
        }
        return k;
    }

    public void checkIfFizz(int k)
    {
        if(k % 3 == 0)
            {
                System.out.println(f);
            }
            else
            {
                System.out.println(k);
            }
    }

    public void checkIfBuzz(int k)
    {
        if(k % 5 == 0)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(k);
        }
    }

    public String checkLastBuzz(int k)
    {
        if(k % 5 == 0)
        {
            return b;
        }
        else
        {
            String str = Integer.toString(k);
            return str;
        }
    }

    public String checkLastFizz(int k)
    {
        if(k % 3 == 0)
        {
            return f;
        }
        else
        {
            String str = Integer.toString(k);
            return str;
        }
    }

    public String makeFizz()
    {
        for(int i = 0; i < 6; i++)
        {
            k += 1;
            
            checkIfFizz(k);
        }

        if(k % 3 == 0)
        {
            return f;
        }
        else
        {
            String str = Integer.toString(k);
            return str;
        }
    }

    public String makeBuzz()
    {
        for(int i = 0; i < 10; i++)
        {
            k += 1;
            checkIfBuzz(k);
        }
        lastNum = checkLastBuzz(k);
        return lastNum;
    }
}
