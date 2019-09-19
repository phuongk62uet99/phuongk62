package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testt {

	@Test
	
//		Sort s =new Sort();
		
		 void testt1() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low, high);
			}
	@Test
	 void testt2() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low - 1, high);
			}
	@Test
	 void testt3() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low + 1, high);
			}
	@Test
	 void testt4() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low, high - 1);
			}
	@Test
	 void testt5() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low + 1, high - 1);
			}
	@Test
	 void testt6() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low - 1, high - 1);
			}
	@Test
	 void testt7() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low , high + 1);
	 }
	@Test
		 void testt8() {
			Sort s =new Sort();
			int [] a = {0 ,1 ,2 ,3 ,4 ,5};
			int [] b = { 2, 0,  1, 3, 5 ,4};
			int low = 0;
			int high = 5;
			s.mergeSort2(a, low + 1, high + 1);
			}
	@Test
		 void testt9() {
				Sort s =new Sort();
				int [] a = {0 ,1 ,2 ,3 ,4 ,5};
				int [] b = { 2, 0,  1, 3, 5 ,4};
				int low = 0;
				int high = 5;
				s.mergeSort2(a, low - 1, high + 1);
		 }
	

}
