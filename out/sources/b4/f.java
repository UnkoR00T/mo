package b4;

import fr.k;
import lr.m;
import oq.p;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)¨\u0006/"}, d2 = {"Lb4/f;", "", "", "isDataDifferential", "Lb4/f$a;", "strategy", "<init>", "(ZLb4/f$a;)V", "(Z)V", "", "dataPoints", "time", "", "sampleCount", "", "b", "([F[FI)F", "", "timeMillis", "dataPoint", "Loq/i0;", "a", "(JF)V", "c", "()F", "maximumVelocity", "d", "(F)F", "e", "()V", "Z", "()Z", "Lb4/f$a;", "I", "minSampleSize", "", "Lb4/a;", "[Lb4/a;", "samples", "index", "f", "[F", "reusableDataPointsArray", "g", "reusableTimeArray", "h", "reusableVelocityCoefficients", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16477i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDataDifferential;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a strategy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minSampleSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DataPointAtTime[] samples;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableDataPointsArray;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableTimeArray;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableVelocityCoefficients;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lb4/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        Lsq2,
        Impulse;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f16489d = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16490a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16490a = iArr;
        }
    }

    public f(boolean z15, a aVar) {
        this.isDataDifferential = z15;
        this.strategy = aVar;
        if (z15 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i15 = b.f16490a[aVar.ordinal()];
        int i16 = 2;
        if (i15 != 1) {
            if (i15 != 2) {
                throw new p();
            }
            i16 = 3;
        }
        this.minSampleSize = i16;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    private final float b(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return h.h(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long timeMillis, float dataPoint) {
        int i15 = (this.index + 1) % 20;
        this.index = i15;
        h.i(this.samples, i15, timeMillis, dataPoint);
    }

    public final float c() {
        float fE;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i15 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i15];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i16 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i15];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == a.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i16] = dataPointAtTime3.getDataPoint();
            fArr2[i16] = -time;
            if (i15 == 0) {
                i15 = 20;
            }
            i15--;
            i16++;
            if (i16 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i16 < this.minSampleSize) {
            return 0.0f;
        }
        int i17 = b.f16490a[this.strategy.ordinal()];
        if (i17 == 1) {
            fE = h.e(fArr, fArr2, i16, this.isDataDifferential);
        } else {
            if (i17 != 2) {
                throw new p();
            }
            fE = b(fArr, fArr2, i16);
        }
        return fE * 1000;
    }

    public final float d(float maximumVelocity) {
        if (!(maximumVelocity > 0.0f)) {
            d4.a.c("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? m.i(fC, maximumVelocity) : m.d(fC, -maximumVelocity);
    }

    public final void e() {
        n.E(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public /* synthetic */ f(boolean z15, a aVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? a.Lsq2 : aVar);
    }

    public f(boolean z15) {
        this(z15, a.Impulse);
    }
}
