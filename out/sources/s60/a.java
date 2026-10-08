package s60;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u0002\u0012\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010/\u001a\b\u0018\u00010,R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Ls60/a;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/hardware/SensorEvent;", "event", "Loq/i0;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Ls60/c;", "a", "()Ls60/c;", "c", "()V", "d", "", "isPreview", "b", "(Z)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "accelerometer", "", "[Ls60/c;", "vectorHistory", "e", "I", "index", "f", "Ls60/c;", "vector", "Ls60/a$b;", "g", "Ls60/a$b;", "simulator", "h", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements SensorEventListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f178235i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private SensorManager sensorManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Sensor accelerometer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Vector[] vectorHistory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Vector vector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private b simulator;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ls60/a$b;", "", "<init>", "(Ls60/a;)V", "Ls60/c;", "a", "()Ls60/c;", "", "I", "getInd", "()I", "setInd", "(I)V", "ind", "", "b", "[Ls60/c;", "sample", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int ind;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Vector[] sample = {new Vector(0.7567f, -1.279f, 58.0146f), new Vector(0.8632f, -1.5416f, 67.8455f), new Vector(0.8632f, -1.5416f, 67.8455f), new Vector(0.9488f, -1.7599f, 77.5526f), new Vector(1.0385f, -1.9783f, 87.1275f), new Vector(1.1192f, -2.2265f, 96.8106f), new Vector(1.1127f, -2.4425f, 106.5973f), new Vector(1.1402f, -2.6387f, 116.4545f), new Vector(1.346f, -2.8959f, 126.3979f), new Vector(1.6349f, -3.1507f, 136.4154f), new Vector(1.8323f, -3.39f, 146.1021f), new Vector(1.8323f, -3.39f, 146.1021f), new Vector(2.0267f, -3.6987f, 155.8678f), new Vector(2.1613f, -3.9571f, 165.7436f), new Vector(2.1769f, -4.0253f, 175.4585f), new Vector(2.5639f, -4.1743f, 185.5376f), new Vector(3.1202f, -4.5679f, 195.6509f), new Vector(3.4325f, -4.7671f, 195.7736f), new Vector(3.4325f, -4.7671f, 195.7736f), new Vector(3.7208f, -4.922f, 196.2043f), new Vector(3.999f, -4.8969f, 196.5117f), new Vector(4.3609f, -5.0315f, 196.5363f), new Vector(4.7438f, -5.056f, 196.1899f), new Vector(5.5609f, -5.1906f, 195.877f), new Vector(6.4774f, -5.2845f, 195.7981f), new Vector(6.4774f, -5.2845f, 195.7981f), new Vector(7.2873f, -5.3336f, 195.8256f), new Vector(8.333f, -5.4736f, 196.0451f), new Vector(9.2836f, -5.5783f, 195.9297f), new Vector(10.3328f, -5.6782f, 195.645f), new Vector(11.4987f, -6.0287f, 195.5887f), new Vector(12.606f, -6.9284f, 195.9979f), new Vector(13.873f, -7.2072f, 195.4978f), new Vector(15.1322f, -8.0453f, 196.1056f), new Vector(16.1611f, -8.1876f, 196.2474f), new Vector(17.7458f, -8.7452f, 195.965f), new Vector(19.6588f, -9.3769f, 195.5959f), new Vector(21.5049f, -10.0074f, 195.0958f), new Vector(23.3282f, -10.4752f, 194.6143f), new Vector(25.4243f, -10.9304f, 195.1245f), new Vector(27.5528f, -11.0979f, 195.2514f), new Vector(29.1751f, -11.2786f, 194.2894f), new Vector(29.1751f, -11.2786f, 194.2894f), new Vector(31.4309f, -11.3749f, 193.3221f), new Vector(34.477f, -11.6698f, 193.0464f), new Vector(34.477f, -11.6698f, 193.0464f), new Vector(37.9328f, -12.1932f, 193.2928f), new Vector(41.2259f, -12.6425f, 193.5997f), new Vector(43.9238f, -12.8632f, 192.9315f), new Vector(46.5344f, -12.9864f, 191.2177f), new Vector(49.5081f, -12.8991f, 189.8902f), new Vector(49.5081f, -12.8991f, 189.8902f), new Vector(53.0973f, -12.9637f, 188.2224f), new Vector(57.5934f, -13.0331f, 186.5313f), new Vector(57.5934f, -13.0331f, 186.5313f), new Vector(62.0848f, -12.5689f, 184.4376f), new Vector(66.3649f, -12.5557f, 183.4715f), new Vector(70.3574f, -11.8923f, 180.9494f), new Vector(73.8969f, -11.5041f, 178.6003f), new Vector(77.2289f, -10.9125f, 176.36f), new Vector(81.0048f, -10.5147f, 174.63f), new Vector(84.9637f, -10.1186f, 172.9933f), new Vector(88.7618f, -9.6072f, 171.1383f), new Vector(92.1123f, -9.0251f, 168.7167f), new Vector(92.1123f, -9.0251f, 168.7167f), new Vector(94.9346f, -8.7434f, 165.7706f), new Vector(99.14f, -8.7852f, 163.3909f), new Vector(103.0152f, -8.6393f, 162.368f), new Vector(105.8017f, -8.3575f, 161.0005f), new Vector(107.3337f, -7.8742f, 158.9139f), new Vector(108.4673f, -7.2526f, 156.1909f), new Vector(110.4563f, -7.0684f, 154.6786f), new Vector(112.5452f, -6.9266f, 155.0986f), new Vector(114.1359f, -6.7358f, 155.6214f), new Vector(114.1359f, -6.7358f, 155.6214f), new Vector(113.6441f, -5.9498f, 156.7861f), new Vector(113.6441f, -5.9498f, 156.7861f), new Vector(112.4346f, -5.1817f, 156.7993f), new Vector(111.1448f, -4.5936f, 156.2848f), new Vector(110.5993f, -4.2281f, 157.1558f), new Vector(110.2834f, -4.0905f, 158.2876f), new Vector(109.489f, -3.8022f, 159.9877f), new Vector(109.489f, -3.8022f, 159.9877f), new Vector(107.9785f, -3.3194f, 161.549f), new Vector(105.3183f, -2.7996f, 162.4296f), new Vector(102.3727f, -2.2427f, 163.1492f), new Vector(100.1994f, -1.8473f, 163.8665f), new Vector(98.1039f, -1.4824f, 166.2282f), new Vector(94.8377f, -0.92f, 169.0978f), new Vector(90.5582f, -0.3517f, 170.4013f), new Vector(86.2768f, 0.3093f, 171.8202f), new Vector(82.3634f, 1.0271f, 173.4916f), new Vector(78.5899f, 1.4991f, 175.5476f), new Vector(74.5855f, 2.1673f, 177.7718f), new Vector(70.0583f, 2.9815f, 179.1363f), new Vector(65.4868f, 3.5121f, 180.3548f), new Vector(61.1474f, 4.1067f, 181.6499f), new Vector(56.7362f, 4.7527f, 183.0013f), new Vector(52.218f, 5.2552f, 184.7971f), new Vector(52.218f, 5.2552f, 184.7971f), new Vector(47.6076f, 5.528f, 186.4721f), new Vector(42.4888f, 5.8971f, 187.4292f), new Vector(37.885f, 6.0239f, 188.6824f), new Vector(32.814f, 6.2889f, 189.4715f), new Vector(27.6766f, 6.3033f, 189.9447f), new Vector(23.2271f, 6.5186f, 190.6458f), new Vector(19.0899f, 6.6275f, 191.8194f), new Vector(19.0899f, 6.6275f, 191.8194f), new Vector(14.2905f, 6.7777f, 192.9913f), new Vector(9.4684f, 7.017f, 193.3317f), new Vector(4.8048f, 7.3017f, 193.4477f), new Vector(0.8824f, 7.3023f, 193.9329f), new Vector(-3.2596f, 7.404f, 194.2966f), new Vector(-7.529f, 7.3286f, 194.6519f), new Vector(-12.1442f, 7.1486f, 194.7291f), new Vector(-16.9711f, 7.0546f, 194.2069f), new Vector(-21.8883f, 7.1252f, 193.3909f), new Vector(-26.6237f, 7.3932f, 192.5355f), new Vector(-31.1474f, 7.5027f, 192.0139f), new Vector(-35.6112f, 7.4315f, 191.0173f), new Vector(-40.3107f, 7.3316f, 189.6641f), new Vector(-45.1029f, 7.41f, 188.4557f), new Vector(-49.7743f, 7.5368f, 187.5608f), new Vector(-54.481f, 8.0279f, 186.2818f), new Vector(-58.5249f, 8.3504f, 185.1016f), new Vector(-62.272f, 8.6399f, 183.9255f), new Vector(-66.0401f, 8.522f, 182.9887f), new Vector(-70.1324f, 8.2445f, 182.0023f), new Vector(-74.6106f, 8.0381f, 180.7921f), new Vector(-78.8782f, 8.1452f, 178.8007f), new Vector(-82.1612f, 8.2564f, 177.3279f), new Vector(-84.612f, 7.9095f, 177.2268f), new Vector(-86.6405f, 7.2329f, 177.0527f), new Vector(-87.8411f, 6.4588f, 176.9606f), new Vector(-88.5751f, 6.0497f, 177.1766f), new Vector(-88.9693f, 5.2397f, 176.9708f), new Vector(-88.9693f, 5.2397f, 176.9708f), new Vector(-88.8264f, 3.8327f, 176.7255f), new Vector(-87.8094f, 1.2455f, 176.3606f), new Vector(-87.8094f, 1.2455f, 176.3606f), new Vector(-86.5974f, -0.2076f, 176.9522f), new Vector(-84.8004f, -1.9298f, 177.8938f), new Vector(-82.5925f, -3.7035f, 179.0029f), new Vector(-80.1141f, -5.6357f, 179.6723f), new Vector(-77.561f, -7.8987f, 179.8493f), new Vector(-74.7901f, -10.1204f, 179.957f), new Vector(-72.0192f, -12.3841f, 180.8771f), new Vector(-68.9109f, -14.5226f, 182.1363f), new Vector(-65.1781f, -16.9771f, 183.4625f), new Vector(-61.0888f, -19.6726f, 184.8701f), new Vector(-56.6842f, -22.532f, 186.4739f), new Vector(-52.8264f, -25.617f, 187.3891f), new Vector(-49.6971f, -28.3173f, 186.8382f), new Vector(-49.6971f, -28.3173f, 186.8382f), new Vector(-46.3346f, -30.8273f, 186.2041f), new Vector(-42.6108f, -33.4403f, 185.5006f), new Vector(-38.4688f, -36.5761f, 185.0065f), new Vector(-34.6056f, -39.5001f, 185.3403f), new Vector(-30.8907f, -42.3775f, 185.8828f), new Vector(-27.3081f, -45.9595f, 186.4852f), new Vector(-23.6231f, -49.4872f, 186.0342f), new Vector(-23.6231f, -49.4872f, 186.0342f), new Vector(-19.8879f, -53.0094f, 185.5161f), new Vector(-15.9817f, -56.2834f, 184.6224f), new Vector(-12.3553f, -59.5837f, 183.6779f), new Vector(-8.7697f, -62.7404f, 182.8278f), new Vector(-5.3737f, -65.8696f, 182.4593f), new Vector(-2.0883f, -69.0688f, 182.2242f), new Vector(1.1438f, -72.2088f, 181.574f), new Vector(4.4489f, -75.3817f, 180.356f), new Vector(7.9825f, -77.7655f, 178.8916f), new Vector(7.9825f, -77.7655f, 178.8916f), new Vector(11.8373f, -79.8569f, 177.0683f), new Vector(15.2554f, -81.9093f, 175.5728f), new Vector(18.2237f, -83.6256f, 174.1138f), new Vector(21.4696f, -85.7402f, 173.4886f), new Vector(25.4267f, -88.2024f, 173.6926f), new Vector(28.8024f, -89.93f, 173.7028f), new Vector(31.2712f, -90.877f, 172.2934f), new Vector(31.2712f, -90.877f, 172.2934f), new Vector(33.6251f, -91.5177f, 170.3989f), new Vector(36.5157f, -91.7354f, 168.1281f), new Vector(39.8937f, -91.7839f, 166.6631f), new Vector(43.7743f, -91.7432f, 165.8412f), new Vector(47.3085f, -91.3155f, 165.0288f), new Vector(50.0507f, -90.6084f, 164.7064f), new Vector(50.0507f, -90.6084f, 164.7064f), new Vector(52.197f, -89.4311f, 164.7387f), new Vector(54.2668f, -88.0295f, 164.147f), new Vector(57.6778f, -86.3713f, 163.7863f), new Vector(60.9542f, -84.4942f, 163.7803f), new Vector(63.8094f, -82.4489f, 163.8168f), new Vector(65.2971f, -80.2595f, 163.4872f), new Vector(66.9488f, -77.6896f, 163.0864f), new Vector(68.6399f, -75.1173f, 163.1905f), new Vector(70.5942f, -72.417f, 163.4477f), new Vector(70.5942f, -72.417f, 163.4477f), new Vector(72.6461f, -69.7328f, 164.5574f), new Vector(74.3821f, -66.4289f, 165.1742f), new Vector(75.0868f, -62.3887f, 164.7943f), new Vector(75.35f, -58.7689f, 164.3588f), new Vector(76.7294f, -55.3185f, 164.6352f), new Vector(77.7757f, -52.0523f, 165.6629f), new Vector(78.0814f, -48.7364f, 167.1614f), new Vector(78.0814f, -48.7364f, 167.1614f), new Vector(77.6979f, -45.5605f, 168.3799f), new Vector(76.1306f, -42.1573f, 169.5387f), new Vector(73.8042f, -38.8888f, 170.7094f), new Vector(71.7542f, -35.4227f, 171.1795f), new Vector(70.2234f, -32.0889f, 172.0487f), new Vector(68.6136f, -29.0991f, 173.5622f), new Vector(68.6136f, -29.0991f, 173.5622f), new Vector(65.0285f, -26.0919f, 174.9542f), new Vector(61.3454f, -23.2313f, 176.1704f), new Vector(58.3071f, -21.0574f, 178.629f), new Vector(55.2018f, -18.8118f, 181.1498f), new Vector(50.7889f, -16.7545f, 182.1094f), new Vector(45.8052f, -14.9157f, 183.4625f), new Vector(45.8052f, -14.9157f, 183.4625f), new Vector(40.605f, -13.3238f, 185.3289f), new Vector(34.992f, -11.6818f, 186.6509f), new Vector(29.1709f, -10.0762f, 187.0081f), new Vector(23.6967f, -9.1675f, 188.6358f), new Vector(17.7075f, -8.1936f, 190.7433f), new Vector(10.7444f, -7.1492f, 192.3704f), new Vector(4.52f, -6.3296f, 192.95f), new Vector(4.52f, -6.3296f, 192.95f), new Vector(-7.3693f, -4.3813f, 193.6739f), new Vector(-12.3559f, -3.3709f, 193.2384f), new Vector(-12.3559f, -3.3709f, 193.2384f), new Vector(-16.6875f, -2.5226f, 193.2575f), new Vector(-20.7751f, -1.8108f, 194.0035f), new Vector(-24.7203f, -1.2239f, 193.8851f), new Vector(-28.5189f, -0.3135f, 193.7457f), new Vector(-31.5057f, 0.2895f, 194.0047f), new Vector(-33.8004f, 0.917f, 193.9437f), new Vector(-33.8004f, 0.917f, 193.9437f), new Vector(-36.1179f, 2.3324f, 191.9373f), new Vector(-37.727f, 3.7502f, 190.4597f), new Vector(-38.7464f, 4.4794f, 191.0382f), new Vector(-39.6216f, 5.4628f, 191.1076f), new Vector(-40.285f, 6.8166f, 191.4192f), new Vector(-39.8614f, 7.4112f, 192.0641f), new Vector(-39.2453f, 8.4144f, 192.5427f), new Vector(-39.2453f, 8.4144f, 192.5427f), new Vector(-38.5735f, 9.2776f, 191.5263f), new Vector(-36.6808f, 10.0546f, 190.7588f), new Vector(-33.9745f, 10.7988f, 190.2091f), new Vector(-30.4092f, 11.5047f, 189.8113f), new Vector(-27.81f, 11.616f, 190.0787f), new Vector(-24.6287f, 12.2931f, 191.8553f), new Vector(-22.8102f, 13.1689f, 192.572f), new Vector(-21.2381f, 13.931f, 193.1397f), new Vector(-19.3717f, 14.138f, 194.1608f), new Vector(-19.3717f, 14.138f, 194.1608f), new Vector(-17.0578f, 13.9789f, 194.4276f), new Vector(-15.058f, 13.7569f, 194.9104f), new Vector(-12.9512f, 13.797f, 194.9863f), new Vector(-11.8044f, 13.9944f, 195.0366f), new Vector(-10.748f, 13.9059f, 195.2717f), new Vector(-8.8277f, 13.9334f, 196.239f), new Vector(-7.2963f, 14.15f, 196.233f), new Vector(-7.2963f, 14.15f, 196.233f), new Vector(-5.3791f, 13.9089f, 196.6278f), new Vector(-3.5073f, 13.2568f, 196.1403f), new Vector(-2.2008f, 13.0983f, 195.2795f), new Vector(-0.9918f, 12.4517f, 195.3064f), new Vector(0.0933f, 12.1454f, 195.6019f), new Vector(0.6179f, 11.8971f, 195.1903f), new Vector(0.6179f, 11.8971f, 195.1903f)};

        public b() {
        }

        public final Vector a() {
            int i15 = this.ind + 1;
            this.ind = i15;
            Vector[] vectorArr = this.sample;
            if (i15 >= vectorArr.length) {
                this.ind = 0;
            }
            return vectorArr[this.ind];
        }
    }

    public a(Context context) {
        this.context = context;
        Vector[] vectorArr = new Vector[20];
        for (int i15 = 0; i15 < 20; i15++) {
            vectorArr[i15] = Vector.INSTANCE.a();
        }
        this.vectorHistory = vectorArr;
    }

    public final Vector a() {
        b bVar = this.simulator;
        if (bVar != null) {
            return bVar.a();
        }
        Vector vector = this.vector;
        return vector == null ? Vector.INSTANCE.a() : vector;
    }

    public final void b(boolean isPreview) {
        if (isPreview) {
            this.simulator = new b();
            return;
        }
        SensorManager sensorManager = (SensorManager) this.context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.accelerometer = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        Arrays.fill(this.vectorHistory, Vector.INSTANCE.a());
    }

    public final void c() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.accelerometer, 1);
        }
    }

    public final void d() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        int i15 = this.index % 20;
        Vector[] vectorArr = this.vectorHistory;
        this.index = i15 + 1;
        float[] fArr = event.values;
        vectorArr[i15] = new Vector(fArr[0], fArr[1], fArr[2]);
        Vector.Companion companion = Vector.INSTANCE;
        Vector[] vectorArr2 = this.vectorHistory;
        this.vector = companion.b((Vector[]) Arrays.copyOf(vectorArr2, vectorArr2.length));
    }
}
