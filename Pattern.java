import java.util.Scanner;

// Copyright 2017 Zishankhan22

// Licensed under the Apache License, Version 2.0 (the "License"); 
// you may not use this file except in compliance with the License. 
// You may obtain a copy of the License at
// http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, 
// software distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
// See the License for the specific language governing permissions and limitations under the License.


public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String finalString="";
		int num = sc.nextInt(); 
		int j = num;
		for(int i = 0; i < num; j--, i++) {

			finalString = finalString + String.format("%" + j + "s", " ")+String.format("%0" + (i+1) + "d", 0).replace("0", "*")+"\n";

			//System.out.print(String.format("%" + j + "s", " "));
			//System.out.println(String.format("%0" + (i+1) + "d", 0).replace("0", "*"));
		}
		System.out.println(finalString);
	}
}
