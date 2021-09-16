package com.pega.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	//1,1,7  1,1,4  2,1,12 
//	1lb=5sb
	
	public boolean isBrickPossible(int sBricks, int lBricks, int targetSize) {
		int lbSize = lBricks * 5;
		if (lbSize < targetSize) {
			if (targetSize - lbSize > sBricks)
				return false;//return targetSize - lbSize;
			else
				return true;
		} else if (lbSize > targetSize) {
			if (targetSize % 5 <= sBricks)	//return targetSize % 5;
				return true;
			else
				return false;
		} else {
			return true;//return 0; 
		}

	}

	
	class DataObject{
		String objName;
		String data;		
		
	}
	class Producer{
		DataMonitor dm;
		void produce() {
			DataObject obj = new DataObject();
			//set data to obj
			//dm.getList().add(obj);//pushes to the queue
		}
	}
	
	class DataMonitorQ{
		List<DataObject> list =new ArrayList<Test.DataObject>();
		
		//getter to return 
	}
	
	class Consumer{
		DataMonitor dm;
		
		dm.getList()//pop
	}
	
	
	
}
