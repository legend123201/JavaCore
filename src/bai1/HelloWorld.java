package bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HelloWorld {
	public static float quyDoiDiemChuQuaDiemHe4(String diemChu) {
		float result = 0;

		switch (diemChu) {
		case "A+": {
			result = 4.0f;
			break;
		}
		case "A": {
			result = 3.7f;
			break;
		}
		case "B+": {
			result = 3.5f;
			break;
		}
		case "B": {
			result = 3.0f;
			break;
		}
		case "C+": {
			result = 2.5f;
			break;
		}
		case "C": {
			result = 2.0f;
			break;
		}
		case "D+": {
			result = 1.5f;
			break;
		}
		case "D": {
			result = 1.0f;
			break;
		}
		default:
			result = 0f;
		}

		return result;
	}

	public static float tinhDiemTrungBinh(int[] arrSoTC, String[] arrDiemChu, int soMon) {
		int tongSoTC = 0;
		float phanTuSo = 0;

		// tinh tong so tin chi
		for (int i = 0; i < soMon; i++) {
			tongSoTC += arrSoTC[i];
		}

		// tinh tong so tin chi voi diem
		for (int i = 0; i < soMon; i++) {
			float diemHe4 = quyDoiDiemChuQuaDiemHe4(arrDiemChu[i]);
			phanTuSo += diemHe4 * (float) arrSoTC[i];
		}

		return phanTuSo / tongSoTC;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrSoTC1_1718 = new int[] { 3, 3, 2, 2 }; // 10
		String[] arrDiemChu1_1718 = new String[] { "B", "A", "B", "B" };
		int soMon1 = 4;

		System.out.printf("Ky 1 2017-2018: %f \n", tinhDiemTrungBinh(arrSoTC1_1718, arrDiemChu1_1718, soMon1));

		int[] arrSoTC2_1718 = new int[] { 4, 3, 3, 3, 2, 2 }; // 17
		String[] arrDiemChu2_1718 = new String[] { "B", "C+", "B", "C", "B", "A" };
		int soMon2 = 6;

		System.out.printf("Ky 2 2017-2018: %f \n", tinhDiemTrungBinh(arrSoTC2_1718, arrDiemChu2_1718, soMon2));

		int[] arrSoTC1_1819 = new int[] { 2, 4, 3, 3, 2, 4 }; // 18
		String[] arrDiemChu1_1819 = new String[] { "B", "B", "A", "B", "A+", "B+" };
		int soMon3 = 6;

		System.out.printf("Ky 1 2018-2019: %f \n", tinhDiemTrungBinh(arrSoTC1_1819, arrDiemChu1_1819, soMon3));

		int[] arrSoTC2_1819 = new int[] { 2, 3, 2, 3, 3, 3, 3 }; // 16
		String[] arrDiemChu2_1819 = new String[] { "B", "B", "A", "B", "A+", "A", "F" };
		int soMon4 = 7;

		System.out.printf("Ky 2 2018-2019: %f \n", tinhDiemTrungBinh(arrSoTC2_1819, arrDiemChu2_1819,soMon4));

		int[] arrSoTC1_1920 = new int[] { 3, 4, 2, 3, 3, 3 }; // 18
		String[] arrDiemChu1_1920 = new String[] { "A", "B+", "B", "C+", "B", "B" };
		int soMon5 = 6;

		System.out.printf("Ky 1 2019-2020: %f \n", tinhDiemTrungBinh(arrSoTC1_1920, arrDiemChu1_1920, soMon5));

		int[] arrSoTC2_1920 = new int[] { 2, 3, 3, 3, 2, 3 }; // 16
		String[] arrDiemChu2_1920 = new String[] { "A+", "B+", "A", "C+", "A", "C+" };
		int soMon6 = 6;

		System.out.printf("Ky 2 2019-2020: %f \n", tinhDiemTrungBinh(arrSoTC2_1920, arrDiemChu2_1920, soMon6));

		int[] arrSoTC1_2021 = new int[] { 2, 3, 3, 2, 3, 3 }; // 16
		String[] arrDiemChu1_2021 = new String[] { "B", "C", "B", "C", "B+", "B" };
		int soMon7 = 6;

		System.out.printf("Ky 1 2020-2021: %f \n", tinhDiemTrungBinh(arrSoTC1_2021, arrDiemChu1_2021, soMon7));

		int[] arrSoTC2_2021 = new int[] { 3, 3, 1, 3, 3, 3 }; // 16
		String[] arrDiemChu2_2021 = new String[] { "B", "B+", "B+", "A+", "A+", "C" };
		int soMon8 = 6;

		System.out.printf("Ky 2 2020-2021: %f \n", tinhDiemTrungBinh(arrSoTC2_2021, arrDiemChu2_2021, soMon8));
		
		int[] arrSoTC_ThucTap = new int[] { 4 }; // 4
		String[] arrDiemChu_ThucTap = new String[] { "C" };
		int soMon9 = 1;

		System.out.printf("Thuc tap: %f \n", tinhDiemTrungBinh(arrSoTC_ThucTap, arrDiemChu_ThucTap, soMon9));
		
		int[] arrSoTC_2MonThayThe = new int[] { 3, 3}; // 6
		String[] arrDiemChu_2MonThayThe = new String[] { "B", "A" };
		int soMon10 = 2;

		System.out.printf("2 mon thay the: %f \n", tinhDiemTrungBinh(arrSoTC_2MonThayThe, arrDiemChu_2MonThayThe, soMon10));
		
		// thay doi diem
		arrDiemChu2_1819[6] = "C";
//		arrDiemChu2_1718[2] = "A+";
//		arrDiemChu1_1819[1] = "A+";
//		arrDiemChu2_1819[1] = "A+";
//		arrDiemChu1_1920[1] = "A+";
		
		int tongSoMon = soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6 + soMon7 + soMon8 + soMon9 + soMon10;
		int[] arrSoTCCombine = new int[tongSoMon];
		System.arraycopy(arrSoTC1_1718, 0, arrSoTCCombine, 0, soMon1);
	    System.arraycopy(arrSoTC2_1718, 0, arrSoTCCombine, soMon1, soMon2);
	    System.arraycopy(arrSoTC1_1819, 0, arrSoTCCombine, soMon1 + soMon2, soMon3);
	    System.arraycopy(arrSoTC2_1819, 0, arrSoTCCombine, soMon1 + soMon2 + soMon3, soMon4);
	    System.arraycopy(arrSoTC1_1920, 0, arrSoTCCombine, soMon1 + soMon2 + soMon3 + soMon4, soMon5);
	    System.arraycopy(arrSoTC2_1920, 0, arrSoTCCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5, soMon6);
	    System.arraycopy(arrSoTC1_2021, 0, arrSoTCCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6, soMon7);
	    System.arraycopy(arrSoTC2_2021, 0, arrSoTCCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6 + soMon7, soMon8);
	    System.arraycopy(arrSoTC_ThucTap, 0, arrSoTCCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6 + soMon7 + soMon8, soMon9);
	    System.arraycopy(arrSoTC_2MonThayThe, 0, arrSoTCCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6 + soMon7 + soMon8 + soMon9, soMon10);
	    System.out.println(Arrays.toString(arrSoTCCombine));
	    
	    String[] arrDiemChuCombine = new String[tongSoMon];
	    System.arraycopy(arrDiemChu1_1718, 0, arrDiemChuCombine, 0, soMon1);
	    System.arraycopy(arrDiemChu2_1718, 0, arrDiemChuCombine, soMon1, soMon2);
	    System.arraycopy(arrDiemChu1_1819, 0, arrDiemChuCombine, soMon1 + soMon2, soMon3);
	    System.arraycopy(arrDiemChu2_1819, 0, arrDiemChuCombine, soMon1 + soMon2 + soMon3, soMon4);
	    System.arraycopy(arrDiemChu1_1920, 0, arrDiemChuCombine, soMon1 + soMon2 + soMon3 + soMon4, soMon5);
	    System.arraycopy(arrDiemChu2_1920, 0, arrDiemChuCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5, soMon6);
	    System.arraycopy(arrDiemChu1_2021, 0, arrDiemChuCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6, soMon7);
	    System.arraycopy(arrDiemChu2_2021, 0, arrDiemChuCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6 + soMon7, soMon8);
	    System.arraycopy(arrDiemChu_ThucTap, 0, arrDiemChuCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6 + soMon7 + soMon8, soMon9);
	    System.arraycopy(arrDiemChu_2MonThayThe, 0, arrDiemChuCombine, soMon1 + soMon2 + soMon3 + soMon4 + soMon5 + soMon6 + soMon7 + soMon8 + soMon9, soMon10);
	    System.out.println(Arrays.toString(arrDiemChuCombine));
	    
	    System.out.printf("Tat ca: %f \n", tinhDiemTrungBinh(arrSoTCCombine, arrDiemChuCombine, tongSoMon));
	}

}
