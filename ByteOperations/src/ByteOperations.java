/**
 * Created with IntelliJ IDEA.
 * User: Oleg
 * Date: 27.03.2014
 * Time: 11:29
 */
public class ByteOperations {
	public static void main(String[] args) {
		byte i = 42;
		byte j = 15;

		String byteI = String.format("%8s", Integer.toBinaryString(i & 0xFF)).replace(' ', '0');
		String byteJ = String.format("%8s", Integer.toBinaryString(j & 0xFF)).replace(' ', '0');

		System.out.println("i: " + i + " >> " + byteI);
		System.out.println("j: " + j + " >> " + byteJ);
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "~ NOT >> --------------------");

		String resultNotI = String.format("%8s", Integer.toBinaryString(~i & 0xFF)).replace(' ', '0');
		String resultNotJ = String.format("%8s", Integer.toBinaryString(~j & 0xFF)).replace(' ', '0');
		System.out.println("~i: " + i + " >> " + resultNotI + " >> " + (byte) (~i));
		System.out.println("~j: " + j + " >> " + resultNotJ + " >> " + (byte) (~j));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "& AND >> --------------------");

		String resultAnd = String.format("%8s", Integer.toBinaryString(i & j & 0xFF)).replace(' ', '0');
		System.out.println("i & j: " + i + " >> " + resultAnd + " >> " + (byte) (i & j));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "| OR >> --------------------");

		String resultOr = String.format("%8s", Integer.toBinaryString(i | j & 0xFF)).replace(' ', '0');
		System.out.println("i | j: " + i + " >> " + resultOr + " >> " + (byte) (i | j));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "^ XOR >> --------------------");

		String resultXor = String.format("%8s", Integer.toBinaryString(i ^ j & 0xFF)).replace(' ', '0');
		System.out.println("i ^ j: " + i + " >> " + resultXor + " >> " + (byte) (i ^ j));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "<< LeftShift 1 bit >> --------------------");

		String resultShiftI = String.format("%8s", Integer.toBinaryString(i << 1)).replace(' ', '0');
		String resultShiftJ = String.format("%8s", Integer.toBinaryString(j << 1)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftI + " >> " + (byte) (i << 1));
		System.out.println("j: " + j + " >> " + resultShiftJ + " >> " + (byte) (j << 1));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "<< LeftShift 2 bit >> --------------------");

		String resultShiftI2 = String.format("%8s", Integer.toBinaryString(i << 2)).replace(' ', '0');
		String resultShiftJ2 = String.format("%8s", Integer.toBinaryString(j << 2)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftI2 + " >> " + (byte) (i << 2));
		System.out.println("j: " + j + " >> " + resultShiftJ2 + " >> " + (byte) (j << 2));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "<< LeftShift 3 bit >> --------------------");

		String resultShiftI3 = String.format("%8s", Integer.toBinaryString(i << 3)).replace(' ', '0');
		String resultShiftJ3 = String.format("%8s", Integer.toBinaryString(j << 3)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftI3 + " >> " + (byte) (i << 3));
		System.out.println("j: " + j + " >> " + resultShiftJ3 + " >> " + (byte) (j << 3));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + "<< LeftShift 4 bit >> --------------------");

		String resultShiftI4 = String.format("%8s", Integer.toBinaryString(i << 4)).replace(' ', '0');
		String resultShiftJ4 = String.format("%8s", Integer.toBinaryString(j << 4)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftI4 + " >> " + (byte) (i << 4));
		System.out.println("j: " + j + " >> " + resultShiftJ4 + " >> " + (byte) (j << 4));
		System.out.println();


		System.out.println(">> " + '\t' + '\t' + ">> RightShift 1 bit >> --------------------");

		String resultShiftRI = String.format("%8s", Integer.toBinaryString(i >> 1)).replace(' ', '0');
		String resultShiftRJ = String.format("%8s", Integer.toBinaryString(j >> 1)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftRI + " >> " + (byte) (i >> 1));
		System.out.println("j: " + j + " >> " + resultShiftRJ + " >> " + (byte) (j >> 1));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + ">> RightShift 2 bit >> --------------------");

		String resultShiftIR2 = String.format("%8s", Integer.toBinaryString(i >> 2)).replace(' ', '0');
		String resultShiftJR2 = String.format("%8s", Integer.toBinaryString(j >> 2)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftIR2 + " >> " + (byte) (i >> 2));
		System.out.println("j: " + j + " >> " + resultShiftJR2 + " >> " + (byte) (j >> 2));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + ">> RightShift 3 bit >> --------------------");

		String resultShiftIR3 = String.format("%8s", Integer.toBinaryString(i >> 3)).replace(' ', '0');
		String resultShiftJR3 = String.format("%8s", Integer.toBinaryString(j >> 3)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftIR3 + " >> " + (byte) (i >> 3));
		System.out.println("j: " + j + " >> " + resultShiftJR3 + " >> " + (byte) (j >> 3));
		System.out.println();

		System.out.println(">> " + '\t' + '\t' + ">> RightShift 4 bit >> --------------------");

		String resultShiftIR4 = String.format("%8s", Integer.toBinaryString(i >> 4)).replace(' ', '0');
		String resultShiftJR4 = String.format("%8s", Integer.toBinaryString(j >> 4)).replace(' ', '0');
		System.out.println("i: " + i + " >> " + resultShiftIR4 + " >> " + (byte) (i >> 4));
		System.out.println("j: " + j + " >> " + resultShiftJR4 + " >> " + (byte) (j >> 4));
		System.out.println();
	}
}
