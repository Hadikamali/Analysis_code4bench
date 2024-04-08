# Analysis_Code4Bench
Analysis and examination of the relationship between errors in the codes on the data Code4Bench

code4bench is now available for download at http://doi.org/10.5281/zenodo.2582968

# Question (import)
We aim to perform fault localization with the help of a network. To do this, it's necessary to first obtain the required information from the program. Then, by using network analysis tools like Gephi, we carry out the analysis.
The information needed in the program for constructing the network includes:

Node type 1: Test cases
Node type 2: Program building blocks
Edge type 1: Program coverage (source test case - destination building block covered by the test case)
Edge type 2: Data dependency among building blocks (both source and destination are building blocks)
Edge type 3: Control dependency among building blocks (both source and destination are building blocks)

1. For the given programs, obtain the necessary information and then analyze using the network metrics available (such as degree centrality, betweenness centrality, etc.) to interpret what each metric means for fault localization, and how the available data can be used for fault localization.

2. Identify which one of the three types of edges has more value in fault localization.


# installation (import)
1.	Download and unzip file from the given url
2.	Install mysql version 5.7
3.	Create database name it “code4bench”
4.	In MySQL Workbench <br>
  a.	Server->Data Import <br>
  b.	Select the extracted folder <br>
  c.	Push Start Import (it’s may take a time) <br>
5.	Finish

# Code4Bench Schema
The schema of Code4Bench is drawn below
![alt text](https://github.com/code4bench/Code4Bench/blob/master/DBSchema.png)


# Data in Code4Bench
The number of submissions for each programming language are listed below

<table>
<thead><tr><th>ID</th><th>Language</th><th>Submission Count</th></tr></thead><tbody>
 <tr><td>1</td><td>GNU C++ 14</td><td>604,155</td></tr>
 <tr><td>2</td><td>GNU C</td><td>93,492</td></tr>
 <tr><td>3</td><td>MS C++</td><td>164,912</td></tr>
 <tr><td>4</td><td>GNU C++ 11</td><td>906,811</td></tr>
 <tr><td>5</td><td>FPC</td><td>47,522</td></tr>
 <tr><td>6</td><td>GNU C++</td><td>1,167,214</td></tr>
 <tr><td>7</td><td>Java 8</td><td>154,087</td></tr>
 <tr><td>8</td><td>Python 3</td><td>52,433</td></tr>
 <tr><td>9</td><td>Go</td><td>3,011</td></tr>
 <tr><td>10</td><td>D</td><td>742</td></tr>
 <tr><td>11</td><td>MS C#</td><td>14,896</td></tr>
 <tr><td>12</td><td>GNU C 11</td><td>18,574</td></tr>
 <tr><td>13</td><td>Python 2</td><td>36,469</td></tr>
 <tr><td>14</td><td>PyPy 2</td><td>4,507</td></tr>
 <tr><td>15</td><td>Ruby</td><td>3,806</td></tr>
 <tr><td>16</td><td>PHP</td><td>2,570</td></tr>
 <tr><td>17</td><td>PyPy 3</td><td>3,222</td></tr>
 <tr><td>18</td><td>Delphi</td><td>9,698</td></tr>
 <tr><td>19</td><td>Kotlin</td><td>4,739</td></tr>
 <tr><td>20</td><td>JavaScript</td><td>3,020</td></tr>
 <tr><td>21</td><td>Haskell</td><td>3,585</td></tr>
 <tr><td>22</td><td>OCaml</td><td>543</td></tr>
 <tr><td>23</td><td>Scala</td><td>2,131</td></tr>
 <tr><td>24</td><td>Mono C#</td><td>5,199</td></tr>
 <tr><td>25</td><td>Java 7</td><td>27,931</td></tr>
 <tr><td>26</td><td>Rust</td><td>599</td></tr>
 <tr><td>27</td><td>Perl</td><td>784</td></tr>
 <tr><td>28</td><td>GNU C++ 11</td><td>1,083</td></tr>
 <tr><td>29</td><td>Java 8 ZIP</td><td>107</td></tr>
 <tr><td>30</td><td>J</td><td>2,673</td></tr>
 <tr><td>31</td><td>GNU C++ 0X</td><td>34,746</td></tr>
 <tr><td>32</td><td>Java 6</td><td>22,988</td></tr>
 <tr><td>33</td><td>Pike</td><td>4,076</td></tr>
 <tr><td>34</td><td>Befunge</td><td>4,343</td></tr>
 <tr><td>35</td><td>Cobol</td><td>2,114</td></tr>
 <tr><td>36</td><td>Factor</td><td>2,606</td></tr>
 <tr><td>37</td><td>Secret-171</td><td>158</td></tr>
 <tr><td>38</td><td>Roco</td><td>3,136</td></tr>
 <tr><td>39</td><td>Tcl</td><td>3,752</td></tr>
 <tr><td>40</td><td>F#</td><td>15</td></tr>
 <tr><td>41</td><td>Io</td><td>2,908</td></tr>
</tbody></table>

    
      
