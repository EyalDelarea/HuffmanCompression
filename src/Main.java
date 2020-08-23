
public class Main {
    public static void main(String[] args) {


        //Adjust base path and what file to compress
        final String basePath = "C:\\Users\\eyald\\Desktop";
        final String fileToCompressPath = basePath + "\\Romeo and Juliet  Entire Play.txt";

        //don't change
        final String compressOutPutPath = basePath + "\\HuffmanCompressedFile";
        final String deCompressOutPutPath = basePath + "\\HuffmanDecompressed";
        final String outputKey = basePath + "\\MyKey";


        String[] paths = {fileToCompressPath};
        String[] output = {compressOutPutPath, outputKey, deCompressOutPutPath};


        HuffmanEncoderDecoder hf = new HuffmanEncoderDecoder();

        hf.Compress(paths, output);
        hf.decompress(paths, output);


    }
}
