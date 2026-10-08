package iw3;

import cw3.IdentityPhotoData;
import fr.t;
import jw3.MaskDefinition;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Liw3/h;", "", "Liw3/h$a;", "Ljw3/a;", "Liw3/d;", "isFaceInMaskUC", "Liw3/b;", "arePhotoProportionCorrectUC", "Liw3/c;", "isFaceFacingTheLensUC", "Liw3/e;", "isFaceNotTiltedUC", "Liw3/g;", "isNoSmileOnFaceUC", "Liw3/a;", "areEyesOpenUC", "Lmx/c;", "labelProvider", "<init>", "(Liw3/d;Liw3/b;Liw3/c;Liw3/e;Liw3/g;Liw3/a;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Liw3/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Liw3/d;", "b", "Liw3/b;", "c", "Liw3/c;", "Liw3/e;", "e", "Liw3/g;", "f", "Liw3/a;", "g", "Lmx/c;", "Ldx/b$c;", "h", "Ldx/b$c;", "processingFailureDomainError", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d isFaceInMaskUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iw3.b arePhotoProportionCorrectUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iw3.c isFaceFacingTheLensUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e isFaceNotTiltedUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g isNoSmileOnFaceUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a areEyesOpenUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business processingFailureDomainError;

    /* JADX INFO: renamed from: iw3.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Liw3/h$a;", "Lgz/b$a;", "Lvx/a;", "faceDetectorResult", "Ljw3/b;", "maskDefinition", "", "originalImageHeight", "originalImageWidth", "<init>", "(Lvx/a;Ljw3/b;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvx/a;", "()Lvx/a;", "b", "Ljw3/b;", "()Ljw3/b;", "c", "I", "d", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vx.a faceDetectorResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MaskDefinition maskDefinition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int originalImageHeight;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int originalImageWidth;

        public Params(vx.a aVar, MaskDefinition maskDefinition, int i15, int i16) {
            this.faceDetectorResult = aVar;
            this.maskDefinition = maskDefinition;
            this.originalImageHeight = i15;
            this.originalImageWidth = i16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final vx.a getFaceDetectorResult() {
            return this.faceDetectorResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MaskDefinition getMaskDefinition() {
            return this.maskDefinition;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getOriginalImageHeight() {
            return this.originalImageHeight;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getOriginalImageWidth() {
            return this.originalImageWidth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.faceDetectorResult, params.faceDetectorResult) && t.c(this.maskDefinition, params.maskDefinition) && this.originalImageHeight == params.originalImageHeight && this.originalImageWidth == params.originalImageWidth;
        }

        public int hashCode() {
            return (((((this.faceDetectorResult.hashCode() * 31) + this.maskDefinition.hashCode()) * 31) + Integer.hashCode(this.originalImageHeight)) * 31) + Integer.hashCode(this.originalImageWidth);
        }

        public String toString() {
            return "Params(faceDetectorResult=" + this.faceDetectorResult + ", maskDefinition=" + this.maskDefinition + ", originalImageHeight=" + this.originalImageHeight + ", originalImageWidth=" + this.originalImageWidth + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97524a;

        static {
            int[] iArr = new int[IdentityPhotoData.c.values().length];
            try {
                iArr[IdentityPhotoData.c.FACE_IN_MASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentityPhotoData.c.FACE_FACING_THE_LENS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentityPhotoData.c.NOT_TILTED_FACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentityPhotoData.c.NO_SMILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentityPhotoData.c.OPEN_EYES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentityPhotoData.c.SINGLE_PERSON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdentityPhotoData.c.DETECT_FACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdentityPhotoData.c.PROPORTIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f97524a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {
        int A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f97525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97527f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f97528g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f97529h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f97530j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f97531k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f97532l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f97533m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97534n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f97535p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f97536q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f97537r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f97538s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f97539t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f97540v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f97541w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f97542x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f97543y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f97544z;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return h.this.d(null, this);
        }
    }

    public h(d dVar, iw3.b bVar, iw3.c cVar, e eVar, g gVar, a aVar, mx.c cVar2) {
        this.isFaceInMaskUC = dVar;
        this.arePhotoProportionCorrectUC = bVar;
        this.isFaceFacingTheLensUC = cVar;
        this.isFaceNotTiltedUC = eVar;
        this.isNoSmileOnFaceUC = gVar;
        this.areEyesOpenUC = aVar;
        this.labelProvider = cVar2;
        this.processingFailureDomainError = new dx.b.Business(bx3.d.b.ML_KIT_ERROR, dx.b.f.FAILURE, cVar2.c(bw3.a.f21880l), cVar2.c(bw3.a.f21878k), null, cVar2.c(bw3.a.f21882m), cVar2.c(bw3.a.f21874i), 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x069b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0712  */
    /* JADX WARN: Code duplicated, block: B:77:0x0338 A[Catch: Exception -> 0x041d, c -> 0x0422, CancellationException -> 0x0427, TRY_LEAVE, TryCatch #8 {c -> 0x0422, CancellationException -> 0x0427, Exception -> 0x041d, blocks: (B:75:0x0332, B:77:0x0338, B:82:0x0360, B:103:0x0443, B:111:0x04eb, B:119:0x057e, B:127:0x0611, B:135:0x06a2, B:143:0x0746, B:144:0x0753, B:146:0x0759, B:148:0x076b, B:149:0x0777, B:154:0x0789, B:169:0x07ce, B:155:0x078f, B:39:0x0275, B:41:0x0279, B:43:0x0281, B:45:0x0289, B:48:0x0293, B:58:0x02b3, B:72:0x02f4, B:74:0x02f8, B:156:0x0792, B:157:0x0797, B:158:0x0798, B:159:0x07aa, B:161:0x07b0, B:165:0x07be, B:167:0x07c2, B:168:0x07cc), top: B:195:0x0275 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v32 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [dx.j] */
    /* JADX WARN: Type inference failed for: r4v78, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x042c -> B:141:0x0733). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x04cb -> B:141:0x0733). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x03d2 -> B:193:0x03e9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(iw3.h.Params r28, tq.e<? super dx.i<? extends dx.b, ? extends jw3.a>> r29) {
        /*
            Method dump skipped, instruction units count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iw3.h.d(iw3.h$a, tq.e):java.lang.Object");
    }
}
