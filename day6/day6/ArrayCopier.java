package day6;
public class ArrayCopier {
	public void copy(int[] src, int[] dst) {
	int i = 0;
	int srclength= src.length;
	int dstlength= dst.length;
		if (srclength > dstlength) {
			for (i = 0; i < dstlength; i++) {
			dst[i] = src[i];
			} 
		} else {
			for (i = 0; i < srclength; i++) {
			dst[i] = src[i];
			}
			for (i = srclength; i < dstlength; i++) {

				dst[i] = 0;
				i++;
			}
		}
	}
}
		