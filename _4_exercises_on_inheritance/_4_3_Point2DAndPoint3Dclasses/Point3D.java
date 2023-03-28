public class Point3D extends Point2D {
    private float z = 0.0F;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[]{0.0F, 0.0F, this.z};
        return result;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "," + this.z + ")";
    }
}