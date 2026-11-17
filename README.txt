IMPORT INTO ECLIPSE
1. Unzip get-contract-demo.zip
2. Eclipse: File > Import > Maven > Existing Maven Projects > select the get-contract-demo folder > Finish
3. Right-click project > Maven > Update Project (tick Force Update)

SEE OUTPUT
A) Contract test: Right-click project > Run As > Maven build... > Goals: clean test > Run
   Console shows: Tests run: 1, Failures: 0, Errors: 0 ... BUILD SUCCESS
B) Real response: Right-click DemoApplication.java > Run As > Java Application
   Browser: http://localhost:8080/get?a=s&b=10
   Output : mz='1.1' addition=15
