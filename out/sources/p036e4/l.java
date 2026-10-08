package p036e4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Le4/l;", "", "Lm3/k;", "srcSize", "dstSize", "Le4/m2;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f47292a;

    /* JADX INFO: renamed from: e4.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0018\u0010\u001aR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0005\u0010\b¨\u0006 "}, d2 = {"Le4/l$a;", "", "<init>", "()V", "Le4/l;", "b", "Le4/l;", "a", "()Le4/l;", "getCrop$annotations", "Crop", "c", "e", "getFit$annotations", "Fit", "d", "getFillHeight$annotations", "FillHeight", "getFillWidth$annotations", "FillWidth", "f", "getInside$annotations", "Inside", "Le4/o;", "g", "Le4/o;", "()Le4/o;", "getNone$annotations", "None", "h", "getFillBounds$annotations", "FillBounds", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f47292a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final l Crop = new C1086a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final l Fit = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final l FillHeight = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final l FillWidth = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final l Inside = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final FixedScale None = new FixedScale(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final l FillBounds = new b();

        /* JADX INFO: renamed from: e4.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"e4/l$a$a", "Le4/l;", "Lm3/k;", "srcSize", "dstSize", "Le4/m2;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1086a implements l {
            C1086a() {
            }

            @Override // p036e4.l
            public long a(long srcSize, long dstSize) {
                float fC = m.c(srcSize, dstSize);
                return m2.a((((long) Float.floatToRawIntBits(fC)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fC))));
            }
        }

        /* JADX INFO: renamed from: e4.l$a$b */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"e4/l$a$b", "Le4/l;", "Lm3/k;", "srcSize", "dstSize", "Le4/m2;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements l {
            b() {
            }

            @Override // p036e4.l
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (srcSize & BodyPartID.bodyIdMax));
                return m2.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
            }
        }

        /* JADX INFO: renamed from: e4.l$a$c */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"e4/l$a$c", "Le4/l;", "Lm3/k;", "srcSize", "dstSize", "Le4/m2;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements l {
            c() {
            }

            @Override // p036e4.l
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (srcSize & BodyPartID.bodyIdMax));
                return m2.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax));
            }
        }

        /* JADX INFO: renamed from: e4.l$a$d */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"e4/l$a$d", "Le4/l;", "Lm3/k;", "srcSize", "dstSize", "Le4/m2;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements l {
            d() {
            }

            @Override // p036e4.l
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                return m2.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax));
            }
        }

        /* JADX INFO: renamed from: e4.l$a$e */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"e4/l$a$e", "Le4/l;", "Lm3/k;", "srcSize", "dstSize", "Le4/m2;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements l {
            e() {
            }

            @Override // p036e4.l
            public long a(long srcSize, long dstSize) {
                float fD = m.d(srcSize, dstSize);
                return m2.a((((long) Float.floatToRawIntBits(fD)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fD))));
            }
        }

        /* JADX INFO: renamed from: e4.l$a$f */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"e4/l$a$f", "Le4/l;", "Lm3/k;", "srcSize", "dstSize", "Le4/m2;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements l {
            f() {
            }

            @Override // p036e4.l
            public long a(long srcSize, long dstSize) {
                if (Float.intBitsToFloat((int) (srcSize >> 32)) <= Float.intBitsToFloat((int) (dstSize >> 32)) && Float.intBitsToFloat((int) (srcSize & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax))) {
                    return m2.a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & BodyPartID.bodyIdMax));
                }
                float fD = m.d(srcSize, dstSize);
                return m2.a((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & BodyPartID.bodyIdMax));
            }
        }

        private Companion() {
        }

        public final l a() {
            return Crop;
        }

        public final l b() {
            return FillBounds;
        }

        public final l c() {
            return FillHeight;
        }

        public final l d() {
            return FillWidth;
        }

        public final l e() {
            return Fit;
        }

        public final l f() {
            return Inside;
        }

        public final FixedScale g() {
            return None;
        }
    }

    long a(long srcSize, long dstSize);
}
