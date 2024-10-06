# Minor-2
NLP based SQL query generation with a GUI

The puropse of this project is to convert natural language spoken by humans to SQL querry that is riggered into a Database 
through JDBC.

#The required .jar files are included in Lib folder 
#Voice to text and main are two indivisual modules 
 
Modules are :

1. Creating a GUI – The Graphical User Interface

There is a GUI that serves the communication between the user and the application. This GUI is
built using swing. It consists of a JFrame. A JFrame consists of JLabels, JButtons and
JTextFeilds.

2 Training the dataset

The dataset will be created in excel. There will be three datasets. The first dataset consists of
words of natural language. This will act as a dictionary and will let us map the natural language
word to its respective SQL word. Second dataset will consists of names of all attributes. And the
last one will consist of table names.

3 Accessing the database

Now since the dataset is trained now we will require a database. We will establish connections
using JDBC driver. The generated query will act on this database.

4 Tokenization

Now, when all the above things are done we will break the query in tokens. This will be done
using OpenNLP Tokenizer.

5 Query Generation

The tokenized words will be mapped in datasets. And accordingly a query will be generated.
