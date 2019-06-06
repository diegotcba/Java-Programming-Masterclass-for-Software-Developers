/**
 * Created by DiegoT on 03/06/2019.
 */
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if((width <= 0 || height <= 0 || areaPerBucket <= 0) || extraBuckets < 0) {
            return -1;
        }

        double totalArea = width * height;

        int buckets = getBucketCount(totalArea, areaPerBucket);

        return buckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int)Math.ceil((double)area / (double)areaPerBucket);
    }
}
