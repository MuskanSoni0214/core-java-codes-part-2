/** @author Muskan Soni
*   @version 2.0
*   @since 2015
**/

package javadocdemo;

/**
*@author MuskanSoni
*@class for Library Book
**/


public class Book
{

/**
* @value 10 default value
**/

static int val=10;

/**
* Parameteized Constructor
* @param s Book Name
**/

public Book(String s){}

/**
* Issue a book to a Student
* @param roll roll number of a student
* @throws Exception if book is not available, throws Exception
**/

Public void issue(int roll) throws Exception{}

/**
* Check if book is available
* @param str Book Name
* @return if book is available returns true else false
**/

public boolean available(String str){}

/**
* Get book name
* @param id book id
* @return returns book name
**/

public String getName(int id){}
}