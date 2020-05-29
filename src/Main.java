
/**
 * Assignment 1
 * Submitted by:
 * Student 1. 	ID# 206109621 Eyal Delarea
 * Student 2. 	ID# 203000005 Yohai Mizrahi
 * Student 3.   ID# 311272173 Gabriel Noghryan
 */


public class Main {
    public static void main(String[] args) {


        //NOTE - Please define your own base path for the project
        String basePath = "C:\\Users\\eyald\\IdeaProjects\\Compression\\src";


        String filePath = basePath+"\\opp.txt";
        String filePath1 = basePath+"\\OnTheOrigin.txt";
        String filepathPhoto = basePath+"\\Smiley.bmp";
        String filepathPhoto1 = basePath+"\\Red_Flowers.bmp";
        String outputFile = basePath+"\\MyCompressedFile";
        String outputKey = basePath+"\\MyKey";
        String decompressedFile = basePath+"\\decompressed";

        //String arrays
        String[] paths = {filePath, filePath1,filepathPhoto,filepathPhoto1};
        String[] output = {outputFile,outputKey,decompressedFile};


        HuffmanEncoderDecoder hf = new HuffmanEncoderDecoder();
        hf.Compress(paths,output);
        hf.decompress(paths,output);


    }
}
