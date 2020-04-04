
package c_collection;

import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		
		ArrayList data=dataSet(); // 얘도 배열임
		for(int i =0; i<data.size(); i++) { // ArrayList의 갯수는  .size로 찾는다.
			System.out.println(data.get(i));  // 각 인덱스의 값을 불러오는 것은 get 로 한다.
			//-- > 배열의 갯수를 신경쓰지 않을 수 있다.
		}
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		ArrayList data = new ArrayList(2);
		data.add(name);
		data.add(age);
		data.add(height);

		return data;

	}
}
