package yw3;

import cw3.IdentityPhotoData;
import jw3.MaskDefinition;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0003\f\n\u000eB#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lyw3/e;", "", "", "isCameraPermissionGranted", "Lcw3/a$a;", "maskType", "Ljw3/c;", "scaleType", "<init>", "(ZLcw3/a$a;Ljw3/c;)V", "a", "Z", "c", "()Z", "b", "Lcw3/a$a;", "()Lcw3/a$a;", "Ljw3/c;", "()Ljw3/c;", "d", "Lyw3/e$a;", "Lyw3/e$c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f230028d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230029e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCameraPermissionGranted;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final IdentityPhotoData.AbstractC0815a maskType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jw3.c scaleType;

    /* JADX INFO: renamed from: yw3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"Lyw3/e$a;", "Lyw3/e;", "", "isCameraPermissionGranted", "Ljw3/b;", "maskDefinition", "Lsx/d;", "lensSide", "<init>", "(ZLjw3/b;Lsx/d;)V", "d", "(ZLjw3/b;Lsx/d;)Lyw3/e$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "c", "()Z", "g", "Ljw3/b;", "()Ljw3/b;", "h", "Lsx/d;", "()Lsx/d;", "", "i", "F", "()F", "zoom", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Camera extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCameraPermissionGranted;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final MaskDefinition maskDefinition;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final sx.d lensSide;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final float zoom;

        /* JADX INFO: renamed from: yw3.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C6178a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f230037a;

            static {
                int[] iArr = new int[sx.d.values().length];
                try {
                    iArr[sx.d.FRONT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sx.d.BACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f230037a = iArr;
            }
        }

        public /* synthetic */ Camera(boolean z15, MaskDefinition maskDefinition, sx.d dVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, maskDefinition, dVar);
        }

        public static /* synthetic */ Camera e(Camera camera, boolean z15, MaskDefinition maskDefinition, sx.d dVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = camera.isCameraPermissionGranted;
            }
            if ((i15 & 2) != 0) {
                maskDefinition = camera.maskDefinition;
            }
            if ((i15 & 4) != 0) {
                dVar = camera.lensSide;
            }
            return camera.d(z15, maskDefinition, dVar);
        }

        @Override // yw3.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsCameraPermissionGranted() {
            return this.isCameraPermissionGranted;
        }

        public final Camera d(boolean isCameraPermissionGranted, MaskDefinition maskDefinition, sx.d lensSide) {
            return new Camera(isCameraPermissionGranted, maskDefinition, lensSide);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Camera)) {
                return false;
            }
            Camera camera = (Camera) other;
            return this.isCameraPermissionGranted == camera.isCameraPermissionGranted && fr.t.c(this.maskDefinition, camera.maskDefinition) && this.lensSide == camera.lensSide;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final sx.d getLensSide() {
            return this.lensSide;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final MaskDefinition getMaskDefinition() {
            return this.maskDefinition;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isCameraPermissionGranted) * 31) + this.maskDefinition.hashCode()) * 31) + this.lensSide.hashCode();
        }

        public String toString() {
            return "Camera(isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", maskDefinition=" + this.maskDefinition + ", lensSide=" + this.lensSide + ')';
        }

        public Camera(boolean z15, MaskDefinition maskDefinition, sx.d dVar) {
            float f15;
            super(z15, maskDefinition.getMaskType(), null, 4, null);
            this.isCameraPermissionGranted = z15;
            this.maskDefinition = maskDefinition;
            this.lensSide = dVar;
            int i15 = C6178a.f230037a[dVar.ordinal()];
            if (i15 == 1) {
                f15 = 2.0f;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                f15 = 1.0f;
            }
            this.zoom = f15;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyw3/e$b;", "", "<init>", "()V", "", "FRONT_CAMERA_ZOOM", "F", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ e(boolean z15, IdentityPhotoData.AbstractC0815a abstractC0815a, jw3.c cVar, fr.k kVar) {
        this(z15, abstractC0815a, cVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentityPhotoData.AbstractC0815a getMaskType() {
        return this.maskType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jw3.c getScaleType() {
        return this.scaleType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getIsCameraPermissionGranted() {
        return this.isCameraPermissionGranted;
    }

    private e(boolean z15, IdentityPhotoData.AbstractC0815a abstractC0815a, jw3.c cVar) {
        this.isCameraPermissionGranted = z15;
        this.maskType = abstractC0815a;
        this.scaleType = cVar;
    }

    /* JADX INFO: renamed from: yw3.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lyw3/e$c;", "Lyw3/e;", "", "isCameraPermissionGranted", "Lcw3/a$a;", "maskType", "<init>", "(ZLcw3/a$a;)V", "d", "(ZLcw3/a$a;)Lyw3/e$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "c", "()Z", "g", "Lcw3/a$a;", "a", "()Lcw3/a$a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Measuring extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCameraPermissionGranted;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdentityPhotoData.AbstractC0815a maskType;

        public Measuring(boolean z15, IdentityPhotoData.AbstractC0815a abstractC0815a) {
            super(z15, abstractC0815a, null, 4, null);
            this.isCameraPermissionGranted = z15;
            this.maskType = abstractC0815a;
        }

        public static /* synthetic */ Measuring e(Measuring measuring, boolean z15, IdentityPhotoData.AbstractC0815a abstractC0815a, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = measuring.isCameraPermissionGranted;
            }
            if ((i15 & 2) != 0) {
                abstractC0815a = measuring.maskType;
            }
            return measuring.d(z15, abstractC0815a);
        }

        @Override // yw3.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public IdentityPhotoData.AbstractC0815a getMaskType() {
            return this.maskType;
        }

        @Override // yw3.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsCameraPermissionGranted() {
            return this.isCameraPermissionGranted;
        }

        public final Measuring d(boolean isCameraPermissionGranted, IdentityPhotoData.AbstractC0815a maskType) {
            return new Measuring(isCameraPermissionGranted, maskType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Measuring)) {
                return false;
            }
            Measuring measuring = (Measuring) other;
            return this.isCameraPermissionGranted == measuring.isCameraPermissionGranted && fr.t.c(this.maskType, measuring.maskType);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isCameraPermissionGranted) * 31) + this.maskType.hashCode();
        }

        public String toString() {
            return "Measuring(isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", maskType=" + this.maskType + ')';
        }

        public /* synthetic */ Measuring(boolean z15, IdentityPhotoData.AbstractC0815a abstractC0815a, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, abstractC0815a);
        }
    }

    public /* synthetic */ e(boolean z15, IdentityPhotoData.AbstractC0815a abstractC0815a, jw3.c cVar, int i15, fr.k kVar) {
        this(z15, abstractC0815a, (i15 & 4) != 0 ? jw3.c.FILL : cVar, null);
    }
}
