package hw3;

import az.f;
import fr.k;
import fr.t;
import java.io.ByteArrayInputStream;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;
import wx.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhw3/b;", "Lgz/b;", "Lhw3/b$a;", "Lhw3/b$b;", "Lh14/a;", "capturePhotoWhileScanningUC", "Lhw3/a;", "cameraPhotoTransformer", "Laz/f;", "fileManager", "Lmx/c;", "labelProvider", "<init>", "(Lh14/a;Lhw3/a;Laz/f;Lmx/c;)V", "params", "d", "(Lhw3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lh14/a;", "b", "Lhw3/a;", "c", "Laz/f;", "Lmx/c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, InterfaceC2032b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h14.a capturePhotoWhileScanningUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a cameraPhotoTransformer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f fileManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: hw3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\r¨\u0006\u0019"}, d2 = {"Lhw3/b$a;", "Lgz/b$a;", "Lxw/a;", "maxSize", "", "targetWidth", "targetHeight", "<init>", "(FIILfr/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "I", "c", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int targetWidth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int targetHeight;

        public /* synthetic */ Params(float f15, int i15, int i16, k kVar) {
            this(f15, i15, i16);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getMaxSize() {
            return this.maxSize;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTargetHeight() {
            return this.targetHeight;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTargetWidth() {
            return this.targetWidth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return xw.a.d(this.maxSize, params.maxSize) && this.targetWidth == params.targetWidth && this.targetHeight == params.targetHeight;
        }

        public int hashCode() {
            return (((xw.a.e(this.maxSize) * 31) + Integer.hashCode(this.targetWidth)) * 31) + Integer.hashCode(this.targetHeight);
        }

        public String toString() {
            return "Params(maxSize=" + ((Object) xw.a.f(this.maxSize)) + ", targetWidth=" + this.targetWidth + ", targetHeight=" + this.targetHeight + ')';
        }

        private Params(float f15, int i15, int i16) {
            this.maxSize = f15;
            this.targetWidth = i15;
            this.targetHeight = i16;
        }
    }

    /* JADX INFO: renamed from: hw3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lhw3/b$b;", "", "d", "a", "c", "b", "Lhw3/b$b$a;", "Lhw3/b$b$b;", "Lhw3/b$b$c;", "Lhw3/b$b$d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC2032b {

        /* JADX INFO: renamed from: hw3.b$b$a */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhw3/b$b$a;", "Lhw3/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC2032b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f86799a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1319227453;
            }

            public String toString() {
                return "DetachedState";
            }
        }

        /* JADX INFO: renamed from: hw3.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhw3/b$b$b;", "Lhw3/b$b;", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "getError", "()Ldx/b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements InterfaceC2032b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            public Error(dx.b bVar) {
                this.error = bVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && t.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: hw3.b$b$c */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhw3/b$b$c;", "Lhw3/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements InterfaceC2032b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f86801a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 920695822;
            }

            public String toString() {
                return "Failure";
            }
        }

        /* JADX INFO: renamed from: hw3.b$b$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhw3/b$b$d;", "Lhw3/b$b;", "Lwx/i$a;", "image", "<init>", "(Lwx/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "()Lwx/i$a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements InterfaceC2032b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f86802b = i.Image.f215739c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final i.Image image;

            public Success(i.Image image) {
                this.image = image;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final i.Image getImage() {
                return this.image;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && t.c(this.image, ((Success) other).image);
            }

            public int hashCode() {
                return this.image.hashCode();
            }

            public String toString() {
                return "Success(image=" + this.image + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86806f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f86807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f86808h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f86809j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f86810k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f86811l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86813n;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86811l = obj;
            this.f86813n |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(h14.a aVar, a aVar2, f fVar, mx.c cVar) {
        this.capturePhotoWhileScanningUC = aVar;
        this.cameraPhotoTransformer = aVar2;
        this.fileManager = fVar;
        this.labelProvider = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0126  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:45:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, e<? super InterfaceC2032b> eVar) throws Throwable {
        c cVar;
        h14.a.b bVar;
        Params params2;
        int i15;
        dx.i iVar;
        Object objD;
        dx.i iVar2;
        dx.i iVar3;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i16 = cVar.f86813n;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f86813n = i16 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f86811l;
        Object objE = uq.b.e();
        int i17 = cVar.f86813n;
        if (i17 == 0) {
            u.b(objC);
            h14.a aVar = this.capturePhotoWhileScanningUC;
            h14.a.Params params3 = new h14.a.Params("id_captured_photo", fw3.b.a(), null);
            cVar.f86804d = params;
            cVar.f86813n = 1;
            objC = aVar.c(params3, cVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i17 == 1) {
            params = (Params) cVar.f86804d;
            u.b(objC);
        } else {
            if (i17 == 2) {
                i15 = cVar.f86808h;
                bVar = (h14.a.b) cVar.f86805e;
                params2 = (Params) cVar.f86804d;
                u.b(objC);
                iVar = (dx.i) objC;
                if (iVar instanceof dx.i.Right) {
                    i.Image image = (i.Image) ((dx.i.Right) iVar).b();
                    f fVar = this.fileManager;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(image.getFileContent().getBytes());
                    String absolutePath = ((h14.a.b.Success) bVar).getAbsolutePath();
                    cVar.f86804d = j.a(params2);
                    cVar.f86805e = j.a(bVar);
                    cVar.f86806f = iVar;
                    cVar.f86807g = j.a(image);
                    cVar.f86808h = i15;
                    cVar.f86809j = 0;
                    cVar.f86810k = 0;
                    cVar.f86813n = 3;
                    objD = fVar.d(byteArrayInputStream, absolutePath, cVar);
                    if (objD != objE) {
                        objC = objD;
                        iVar2 = iVar;
                    }
                    return objE;
                }
                if (iVar instanceof dx.i.Left) {
                    return new InterfaceC2032b.Error((dx.b) ((dx.i.Left) iVar).b());
                }
                if (iVar instanceof dx.i.Right) {
                    return new InterfaceC2032b.Success((i.Image) ((dx.i.Right) iVar).b());
                }
                throw new p();
            }
            if (i17 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar2 = (dx.i) cVar.f86806f;
            u.b(objC);
        }
        iVar3 = (dx.i) objC;
        if (iVar3 instanceof dx.i.Left) {
            return new InterfaceC2032b.Error((dx.b) ((dx.i.Left) iVar3).b());
        }
        iVar = iVar2;
        if (iVar instanceof dx.i.Left) {
            return new InterfaceC2032b.Error((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new InterfaceC2032b.Success((i.Image) ((dx.i.Right) iVar).b());
        }
        throw new p();
        bVar = (h14.a.b) objC;
        if (t.c(bVar, h14.a.b.C1817a.f79648a)) {
            return InterfaceC2032b.a.f86799a;
        }
        if (t.c(bVar, h14.a.b.C1818b.f79649a)) {
            return InterfaceC2032b.c.f86801a;
        }
        if (!(bVar instanceof h14.a.b.Success)) {
            throw new p();
        }
        a aVar2 = this.cameraPhotoTransformer;
        a.PhotoData photoData = new a.PhotoData(this.labelProvider.c(bw3.a.f21866e).getText(), fw3.b.a(), ((h14.a.b.Success) bVar).getAbsolutePath(), null);
        a.Requirements requirements = new a.Requirements(params.getMaxSize(), params.getTargetWidth(), params.getTargetHeight(), null);
        cVar.f86804d = j.a(params);
        cVar.f86805e = bVar;
        cVar.f86808h = 0;
        cVar.f86813n = 2;
        objC = aVar2.a(photoData, requirements, cVar);
        if (objC != objE) {
            params2 = params;
            i15 = 0;
            iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Right) {
                i.Image image2 = (i.Image) ((dx.i.Right) iVar).b();
                f fVar2 = this.fileManager;
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(image2.getFileContent().getBytes());
                String absolutePath2 = ((h14.a.b.Success) bVar).getAbsolutePath();
                cVar.f86804d = j.a(params2);
                cVar.f86805e = j.a(bVar);
                cVar.f86806f = iVar;
                cVar.f86807g = j.a(image2);
                cVar.f86808h = i15;
                cVar.f86809j = 0;
                cVar.f86810k = 0;
                cVar.f86813n = 3;
                objD = fVar2.d(byteArrayInputStream2, absolutePath2, cVar);
                if (objD != objE) {
                    objC = objD;
                    iVar2 = iVar;
                    iVar3 = (dx.i) objC;
                    if (iVar3 instanceof dx.i.Left) {
                        return new InterfaceC2032b.Error((dx.b) ((dx.i.Left) iVar3).b());
                    }
                    iVar = iVar2;
                }
            }
            if (iVar instanceof dx.i.Left) {
                return new InterfaceC2032b.Error((dx.b) ((dx.i.Left) iVar).b());
            }
            if (iVar instanceof dx.i.Right) {
                return new InterfaceC2032b.Success((i.Image) ((dx.i.Right) iVar).b());
            }
            throw new p();
        }
        return objE;
    }
}
