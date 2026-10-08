package iw3;

import cw3.IdentityPhotoData;
import fr.t;
import jw3.MaskDefinition;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Liw3/f;", "Lgz/b;", "Liw3/f$a;", "", "Liw3/d;", "isFaceInMaskUC", "Liw3/c;", "isFaceFacingTheLensUC", "Liw3/e;", "isFaceNotTiltedUC", "<init>", "(Liw3/d;Liw3/c;Liw3/e;)V", "params", "d", "(Liw3/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Liw3/d;", "b", "Liw3/c;", "c", "Liw3/e;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b<Params, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d isFaceInMaskUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iw3.c isFaceFacingTheLensUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e isFaceNotTiltedUC;

    /* JADX INFO: renamed from: iw3.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Liw3/f$a;", "Lgz/b$a;", "Lvx/a;", "faceDetectorResult", "Ljw3/b;", "maskDefinition", "<init>", "(Lvx/a;Ljw3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvx/a;", "()Lvx/a;", "b", "Ljw3/b;", "()Ljw3/b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vx.a faceDetectorResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MaskDefinition maskDefinition;

        public Params(vx.a aVar, MaskDefinition maskDefinition) {
            this.faceDetectorResult = aVar;
            this.maskDefinition = maskDefinition;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final vx.a getFaceDetectorResult() {
            return this.faceDetectorResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MaskDefinition getMaskDefinition() {
            return this.maskDefinition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.faceDetectorResult, params.faceDetectorResult) && t.c(this.maskDefinition, params.maskDefinition);
        }

        public int hashCode() {
            return (this.faceDetectorResult.hashCode() * 31) + this.maskDefinition.hashCode();
        }

        public String toString() {
            return "Params(faceDetectorResult=" + this.faceDetectorResult + ", maskDefinition=" + this.maskDefinition + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97492a;

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
            f97492a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f97493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f97496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f97497h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f97498j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f97499k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f97500l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f97501m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97502n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f97503p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f97504q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f97505r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f97506s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f97507t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f97509w;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f97507t = obj;
            this.f97509w |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, this);
        }
    }

    public f(d dVar, iw3.c cVar, e eVar) {
        this.isFaceInMaskUC = dVar;
        this.isFaceFacingTheLensUC = cVar;
        this.isFaceNotTiltedUC = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x012b  */
    /* JADX WARN: Code duplicated, block: B:36:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0237  */
    /* JADX WARN: Code duplicated, block: B:57:0x028c  */
    /* JADX WARN: Code duplicated, block: B:60:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0150 -> B:59:0x02a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01af -> B:47:0x01b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(iw3.f.Params r22, tq.e<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iw3.f.d(iw3.f$a, tq.e):java.lang.Object");
    }
}
