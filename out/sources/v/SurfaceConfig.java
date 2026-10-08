package v;

import android.util.Size;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: v.q3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0004\u001b&!\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010(\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0018¨\u0006)"}, d2 = {"Lv/q3;", "", "Lv/q3$d;", "configType", "Lv/q3$b;", "configSize", "Lv/o3;", "streamUseCase", "<init>", "(Lv/q3$d;Lv/q3$b;Lv/o3;)V", "other", "", "g", "(Lv/q3;)Z", "Lv/r3;", "definition", "Landroid/util/Size;", "e", "(Lv/r3;)Landroid/util/Size;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Lv/q3$d;", "getConfigType", "()Lv/q3$d;", "b", "Lv/q3$b;", "c", "()Lv/q3$b;", "Lv/o3;", "f", "()Lv/o3;", "d", "I", "imageFormat", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SurfaceConfig {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o3 f202784f = o3.DEFAULT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b[] f202785g = {b.f202794e, b.f202796g, b.f202797h, b.f202799k, b.f202800l, b.f202793d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<d, Integer> f202786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Integer, d> f202787i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d configType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b configSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final o3 streamUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int imageFormat;

    /* JADX INFO: renamed from: v.q3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lv/q3$a;", "", "<init>", "()V", "Lv/q3$d;", "type", "Lv/q3$b;", "size", "Lv/o3;", "streamUseCase", "Lv/q3;", "a", "(Lv/q3$d;Lv/q3$b;Lv/o3;)Lv/q3;", "", "imageFormat", "c", "(I)Lv/q3$d;", "Landroid/util/Size;", "Lv/r3;", "surfaceSizeDefinition", "cameraMode", "Lv/q3$c;", "configSource", "d", "(ILandroid/util/Size;Lv/r3;ILv/q3$c;Lv/o3;)Lv/q3;", "DEFAULT_STREAM_USE_CASE", "Lv/o3;", "", "FEATURE_COMBO_QUERY_SUPPORTED_SIZES", "[Lv/q3$b;", "", "IMAGE_FORMATS_BY_CONFIG_TYPE", "Ljava/util/Map;", "CONFIG_TYPES_BY_IMAGE_FORMAT", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ SurfaceConfig b(Companion companion, d dVar, b bVar, o3 o3Var, int i15, Object obj) {
            if ((i15 & 4) != 0) {
                o3Var = SurfaceConfig.f202784f;
            }
            return companion.a(dVar, bVar, o3Var);
        }

        public static /* synthetic */ SurfaceConfig e(Companion companion, int i15, Size size, r3 r3Var, int i16, c cVar, o3 o3Var, int i17, Object obj) {
            if ((i17 & 8) != 0) {
                i16 = 0;
            }
            int i18 = i16;
            if ((i17 & 16) != 0) {
                cVar = c.CAPTURE_SESSION_TABLES;
            }
            c cVar2 = cVar;
            if ((i17 & 32) != 0) {
                o3Var = SurfaceConfig.f202784f;
            }
            return companion.d(i15, size, r3Var, i18, cVar2, o3Var);
        }

        public final SurfaceConfig a(d type, b size, o3 streamUseCase) {
            return new SurfaceConfig(type, size, streamUseCase);
        }

        public final d c(int imageFormat) {
            d dVar = (d) SurfaceConfig.f202787i.get(Integer.valueOf(imageFormat));
            return dVar == null ? d.PRIV : dVar;
        }

        public final SurfaceConfig d(int imageFormat, Size size, r3 surfaceSizeDefinition, int cameraMode, c configSource, o3 streamUseCase) {
            d dVarC = c(imageFormat);
            b bVar = b.f202806s;
            int iB = f0.d.b(size);
            if (cameraMode == 1) {
                if (iB <= f0.d.b(surfaceSizeDefinition.m(imageFormat))) {
                    bVar = b.f202794e;
                } else if (iB <= f0.d.b(surfaceSizeDefinition.k(imageFormat))) {
                    bVar = b.f202798j;
                }
            } else if (configSource == c.FEATURE_COMBINATION_TABLE) {
                Size sizeG = surfaceSizeDefinition.g(imageFormat);
                for (b bVar2 : SurfaceConfig.f202785g) {
                    if (fr.t.c(size, bVar2.getRelatedFixedSize())) {
                        bVar = bVar2;
                        break;
                    }
                }
                if (bVar == b.f202806s && fr.t.c(size, sizeG)) {
                    bVar = b.f202802n;
                }
            } else if (iB <= f0.d.b(surfaceSizeDefinition.b())) {
                bVar = b.f202792c;
            } else if (iB <= f0.d.b(surfaceSizeDefinition.i())) {
                bVar = b.f202795f;
            } else if (iB <= f0.d.b(surfaceSizeDefinition.j())) {
                bVar = b.f202801m;
            } else {
                Size sizeG2 = surfaceSizeDefinition.g(imageFormat);
                Size sizeO = surfaceSizeDefinition.o(imageFormat);
                if ((sizeG2 == null || iB <= f0.d.b(sizeG2)) && cameraMode != 2) {
                    bVar = b.f202802n;
                } else if (sizeO != null && iB <= f0.d.b(sizeO)) {
                    bVar = b.f202805r;
                }
            }
            return a(dVarC, bVar, streamUseCase);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: v.q3$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\nj\u0002\b\u0012j\u0002\b\u000ej\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lv/q3$b;", "", "", "id", "Landroid/util/Size;", "relatedFixedSize", "<init>", "(Ljava/lang/String;IILandroid/util/Size;)V", "a", "I", "e", "()I", "b", "Landroid/util/Size;", "g", "()Landroid/util/Size;", "c", "d", "f", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f202795f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f202801m;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ b[] f202807t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ wq.a f202808v;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Size relatedFixedSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f202792c = new b("VGA", 0, 0, new Size(640, 480));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f202793d = new b("X_VGA", 1, 1, new Size(1024, 768));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f202794e = new b("S720P_16_9", 2, 2, new Size(1280, 720));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f202796g = new b("S1080P_4_3", 4, 4, new Size(1440, 1080));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f202797h = new b("S1080P_16_9", 5, 5, new Size(1920, 1080));

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f202798j = new b("S1440P_4_3", 6, 6, new Size(1920, 1440));

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f202799k = new b("S1440P_16_9", 7, 7, new Size(2560, 1440));

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f202800l = new b("UHD", 8, 8, new Size(3840, 2160));

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f202802n = new b("MAXIMUM", 10, 10, null, 2, null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f202803p = new b("MAXIMUM_4_3", 11, 11, null, 2, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f202804q = new b("MAXIMUM_16_9", 12, 12, null, 2, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f202805r = new b("ULTRA_MAXIMUM", 13, 13, null, 2, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f202806s = new b("NOT_SUPPORT", 14, 14, null, 2, null);

        static {
            int i15 = 2;
            fr.k kVar = null;
            Size size = null;
            f202795f = new b("PREVIEW", 3, 3, size, i15, kVar);
            f202801m = new b("RECORD", 9, 9, size, i15, kVar);
            b[] bVarArrB = b();
            f202807t = bVarArrB;
            f202808v = wq.b.a(bVarArrB);
        }

        private b(String str, int i15, int i16, Size size) {
            super(str, i15);
            this.id = i16;
            this.relatedFixedSize = size;
        }

        private static final /* synthetic */ b[] b() {
            return new b[]{f202792c, f202793d, f202794e, f202795f, f202796g, f202797h, f202798j, f202799k, f202800l, f202801m, f202802n, f202803p, f202804q, f202805r, f202806s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f202807t.clone();
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Size getRelatedFixedSize() {
            return this.relatedFixedSize;
        }

        /* synthetic */ b(String str, int i15, int i16, Size size, int i17, fr.k kVar) {
            this(str, i15, i16, (i17 & 2) != 0 ? null : size);
        }
    }

    /* JADX INFO: renamed from: v.q3$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lv/q3$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        FEATURE_COMBINATION_TABLE,
        CAPTURE_SESSION_TABLES;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f202814d = wq.b.a(b());
    }

    /* JADX INFO: renamed from: v.q3$d */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lv/q3$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f202821g = wq.b.a(b());
    }

    /* JADX INFO: renamed from: v.q3$e */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202822a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f202795f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f202801m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f202802n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f202803p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f202804q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f202805r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f202806s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f202822a = iArr;
        }
    }

    static {
        Map<d, Integer> mapL = pq.v0.l(oq.y.a(d.YUV, 35), oq.y.a(d.JPEG, 256), oq.y.a(d.JPEG_R, 4101), oq.y.a(d.RAW, 32), oq.y.a(d.PRIV, 34));
        f202786h = mapL;
        Set<Map.Entry<d, Integer>> setEntrySet = mapL.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d) entry.getKey());
        }
        f202787i = linkedHashMap;
    }

    public SurfaceConfig(d dVar, b bVar, o3 o3Var) {
        this.configType = dVar;
        this.configSize = bVar;
        this.streamUseCase = o3Var;
        Integer num = f202786h.get(dVar);
        this.imageFormat = num != null ? num.intValue() : 0;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getConfigSize() {
        return this.configSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getImageFormat() {
        return this.imageFormat;
    }

    public final Size e(r3 definition) {
        switch (e.f202822a[this.configSize.ordinal()]) {
            case 1:
                return definition.i();
            case 2:
                return definition.j();
            case 3:
                return definition.g(this.imageFormat);
            case 4:
                return definition.e(this.imageFormat);
            case 5:
                return definition.c(this.imageFormat);
            case 6:
                return definition.o(this.imageFormat);
            case 7:
                throw new IllegalStateException("Not supported config size");
            default:
                return this.configSize.getRelatedFixedSize();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) other;
        return this.configType == surfaceConfig.configType && this.configSize == surfaceConfig.configSize && this.streamUseCase == surfaceConfig.streamUseCase;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o3 getStreamUseCase() {
        return this.streamUseCase;
    }

    public final boolean g(SurfaceConfig other) {
        o3 o3Var;
        if (other.configSize.getId() > this.configSize.getId() || other.configType != this.configType) {
            return false;
        }
        o3 o3Var2 = this.streamUseCase;
        o3 o3Var3 = o3.DEFAULT;
        return o3Var2 == o3Var3 || (o3Var = other.streamUseCase) == o3Var3 || o3Var == o3Var2;
    }

    public int hashCode() {
        return (((this.configType.hashCode() * 31) + this.configSize.hashCode()) * 31) + this.streamUseCase.hashCode();
    }

    public String toString() {
        return "SurfaceConfig(configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + ')';
    }
}
