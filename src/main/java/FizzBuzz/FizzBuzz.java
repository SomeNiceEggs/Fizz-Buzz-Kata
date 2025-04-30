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
	public int getNumbers()
    {
        int k = 0;
        for(int i = 0; i < 100; i++)
        {
            k += 1;
            System.out.println(k);
        }
        return k;
    }

    public String makeFizz()
    {
        int k = 0;
        String f = "Fizz";
        for(int i = 0; i < 6; i++)
        {
            k += 1;
            
            if(k % 3 == 0)
            {
                System.out.println(f);
            }
            else
            {
                System.out.println(k);
            }
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
}
