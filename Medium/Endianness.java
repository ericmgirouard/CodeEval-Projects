package Medium;

import java.nio.ByteOrder;

public class Endianness {

	public static void main(String[] args) {
		System.out.println( java.nio.ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "LittleEndian" : "BigEndian");
	}

}
	