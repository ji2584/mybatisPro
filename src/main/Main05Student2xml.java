package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.Student;
import util.MybatisConnection;

public class Main05Student2xml {

	static final String NS = "xml.student2.";
	
	public static void main(String[] args) {
	//xml :student2.xml
	//namespace : xml.studentt2
		
		
		
		
		
		SqlSession sqlSession = MybatisConnection.getConnection();
		System.out.println("selectIf=============");
		Map map = new HashMap();
		map.put("grade", 2);
		List<Student> li = sqlSession.selectList(NS+"selectIf",map); 
		
		System.out.println("selectChoose=========");
		map.clear();
		map.put("height", 180);
		li = sqlSession.selectList(NS + "selectChoose",map);
		
		System.out.println("selectCollection===============");
		
		List<Integer> ali = Arrays.asList(101,102);
		map.clear();
		map.put("col","deptno1");
		map.put("datas", ali);
		li = sqlSession.selectList(NS + "selectCollection",map);
		
		
				
		
		Main02Professor1xml.print(li);
		
		
		
		
		
		
		
	}
}
