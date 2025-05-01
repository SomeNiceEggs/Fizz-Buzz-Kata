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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;
import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTests 
{
    private FizzBuzz f;

    @BeforeEach
    public void setUp()
    {
        f = new FizzBuzz();
    }
    
    @Test
	public void testGetNumbers()
    {
        assertEquals(100, f.getNumbers());
    }

    @Test
    public void testMakeFizz()
    {
        assertEquals("Fizz", f.makeFizz());
    }

    @Test
    public void testMakeBuzz()
    {
        assertEquals("Buzz", f.makeBuzz());
    }

    @Test
    public void exceptionTestCheckIfFizz() throws IOException
    {
        String w = "";
        boolean thrown = false;

        try
        {
            f.checkIfFizz(w);
        } 
        catch(IOException exc)
        {
            System.out.println("Invalid argument error");
            thrown = true;
        }
        assertTrue(thrown);
    }

    // @Test
    // public void testMakeFizzBuzz()
    // {
    //     assertEquals("FizzBuzz", f.makeFizzBuzz());
    // }
}
