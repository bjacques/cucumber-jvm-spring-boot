package org.example;


import io.cucumber.core.cli.Main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Main.main(new String[]{
                "--glue",
                "org.example.step",
                "classpath:/features"
        });
    }
}
