package org.saram.test;

import java.util.List;

import org.saram.model.SaramDao;
import org.saram.model.SaramDto;

public class SaramDaoTest {
	public static void main(String[] args) {
		testSaramSelectAll();
//		testSaramSelectOne();
		System.out.println();
		testSaramSelectByName();
//		testInsert();
//		testUpdate();
//		testDelete();
//		testSaramSelectById();
	}

	private static void testDelete() {
		SaramDao.delete(new SaramDto(6,"","",0));
		testSaramSelectAll();
	}

	private static void testUpdate() {
		SaramDao.update(new SaramDto(5,"KANG","gildong",20));
		testSaramSelectAll();
	}

	private static void testInsert() {
		SaramDao.insert(new SaramDto(0,"PARK","gildong",20));
		testSaramSelectAll();
	}
	private static void testSaramSelectByName() {
		List<SaramDto> list = SaramDao.selectByName(new SaramDto(0,"","gildong",0));
		for(SaramDto saram : list) {
			System.out.println(saram);
		}
	}
	private static void testSaramSelectById() {
		SaramDto saram = SaramDao.selectById(new SaramDto(0,"KIM","",0));
		System.out.println(saram);
	}
	private static void testSaramSelectOne() {
		SaramDto saram = SaramDao.selectOne(new SaramDto(1,"","",0));
		System.out.println(saram);
	}
	private static void testSaramSelectAll() {
		List<SaramDto> list = SaramDao.selectAll();
		
		for(SaramDto saram : list) {
			System.out.println(saram);
		}
	}
}
