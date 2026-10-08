package ae3;

import java.util.List;
import java.util.concurrent.CancellationException;
import o04.UploadedFile;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.StatementVehicleData;
import sv0.Uploader;
import sv0.VehicleCollisionUploadedFile;
import tv0.YourDetails;
import wx.FileContent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f!B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lae3/t;", "Lgz/b;", "Lae3/t$a;", "Lae3/t$b;", "Lp04/b;", "uploadFileToCloudUC", "Law0/s;", "getFileImageConfigurationUC", "Lez/a;", "currentTimeProvider", "Lbc4/e;", "createThumbnailUseCase", "<init>", "(Lp04/b;Law0/s;Lez/a;Lbc4/e;)V", "Lsv0/q0;", "configuration", "Lwx/k$a;", "image", "Ldx/i;", "Ldx/b;", "Lsv0/i0$a;", "g", "(Lsv0/q0;Lwx/k$a;Ltq/e;)Ljava/lang/Object;", "Lo04/e;", "fileToUpload", "Lsv0/t0;", "h", "(Lo04/e;Lsv0/q0;Ltq/e;)Ljava/lang/Object;", "params", "f", "(Lae3/t$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp04/b;", "b", "Law0/s;", "c", "Lez/a;", "d", "Lbc4/e;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements gz.b<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p04.b uploadFileToCloudUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final aw0.s getFileImageConfigurationUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.e createThumbnailUseCase;

    /* JADX INFO: renamed from: ae3.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lae3/t$a;", "Lgz/b$a;", "Lsv0/y;", "processId", "", "Ltv0/b$a;", "vehiclePhotos", "Lsv0/q0;", "configuration", "<init>", "(Lsv0/y;Ljava/util/List;Lsv0/q0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "b", "()Lsv0/y;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lsv0/q0;", "()Lsv0/q0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<YourDetails.Photo> vehiclePhotos;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Uploader configuration;

        public Params(ProcessId processId, List<YourDetails.Photo> list, Uploader uploader) {
            this.processId = processId;
            this.vehiclePhotos = list;
            this.configuration = uploader;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uploader getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        public final List<YourDetails.Photo> c() {
            return this.vehiclePhotos;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.processId, params.processId) && fr.t.c(this.vehiclePhotos, params.vehiclePhotos) && fr.t.c(this.configuration, params.configuration);
        }

        public int hashCode() {
            return (((this.processId.hashCode() * 31) + this.vehiclePhotos.hashCode()) * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "Params(processId=" + this.processId + ", vehiclePhotos=" + this.vehiclePhotos + ", configuration=" + this.configuration + ')';
        }
    }

    /* JADX INFO: renamed from: ae3.t$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lae3/t$b;", "Lgz/b$a;", "", "Ltv0/b$a;", "sentPhotos", "Ldx/i;", "Ldx/b;", "Loq/i0;", "either", "<init>", "(Ljava/util/List;Ldx/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ldx/i;", "()Ldx/i;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<YourDetails.Photo> sentPhotos;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.i<dx.b, i0> either;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(List<YourDetails.Photo> list, dx.i<? extends dx.b, i0> iVar) {
            this.sentPhotos = list;
            this.either = iVar;
        }

        public final dx.i<dx.b, i0> a() {
            return this.either;
        }

        public final List<YourDetails.Photo> b() {
            return this.sentPhotos;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.sentPhotos, result.sentPhotos) && fr.t.c(this.either, result.either);
        }

        public int hashCode() {
            return (this.sentPhotos.hashCode() * 31) + this.either.hashCode();
        }

        public String toString() {
            return "Result(sentPhotos=" + this.sentPhotos + ", either=" + this.either + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {
        int A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5931h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5932j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5933k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5934l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5935m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5936n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f5937p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f5938q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5939r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5940s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5941t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f5942v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f5943w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f5944x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f5945y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f5946z;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return t.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5951h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5954l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5955m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5956n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5957p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5958q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5959r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5960s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5961t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f5963w;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5961t = obj;
            this.f5963w |= PKIFailureInfo.systemUnavail;
            return t.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5966f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5968h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5966f = obj;
            this.f5968h |= PKIFailureInfo.systemUnavail;
            return t.this.h(null, null, this);
        }
    }

    public t(p04.b bVar, aw0.s sVar, ez.a aVar, bc4.e eVar) {
        this.uploadFileToCloudUC = bVar;
        this.getFileImageConfigurationUC = sVar;
        this.currentTimeProvider = aVar;
        this.createThumbnailUseCase = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x0183 A[Catch: Exception -> 0x00a6, c -> 0x00aa, CancellationException -> 0x00ae, TRY_LEAVE, TryCatch #7 {c -> 0x00aa, CancellationException -> 0x00ae, Exception -> 0x00a6, blocks: (B:25:0x0097, B:51:0x0177, B:53:0x0183, B:59:0x01e0, B:61:0x01e4, B:62:0x01f8, B:63:0x01f9, B:64:0x01fe), top: B:86:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e0 A[Catch: Exception -> 0x00a6, c -> 0x00aa, CancellationException -> 0x00ae, TRY_ENTER, TryCatch #7 {c -> 0x00aa, CancellationException -> 0x00ae, Exception -> 0x00a6, blocks: (B:25:0x0097, B:51:0x0177, B:53:0x0183, B:59:0x01e0, B:61:0x01e4, B:62:0x01f8, B:63:0x01f9, B:64:0x01fe), top: B:86:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e4 A[Catch: Exception -> 0x00a6, c -> 0x00aa, CancellationException -> 0x00ae, TryCatch #7 {c -> 0x00aa, CancellationException -> 0x00ae, Exception -> 0x00a6, blocks: (B:25:0x0097, B:51:0x0177, B:53:0x0183, B:59:0x01e0, B:61:0x01e4, B:62:0x01f8, B:63:0x01f9, B:64:0x01fe), top: B:86:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01f9 A[Catch: Exception -> 0x00a6, c -> 0x00aa, CancellationException -> 0x00ae, TryCatch #7 {c -> 0x00aa, CancellationException -> 0x00ae, Exception -> 0x00a6, blocks: (B:25:0x0097, B:51:0x0177, B:53:0x0183, B:59:0x01e0, B:61:0x01e4, B:62:0x01f8, B:63:0x01f9, B:64:0x01fe), top: B:86:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0217  */
    /* JADX WARN: Code duplicated, block: B:74:0x0228  */
    /* JADX WARN: Code duplicated, block: B:75:0x0236  */
    /* JADX WARN: Code duplicated, block: B:77:0x023a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0246  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [ae3.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final Object g(Uploader uploader, wx.k.Image image, tq.e<? super dx.i<? extends dx.b, StatementVehicleData.StatementImage>> eVar) throws Throwable {
        d dVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        wx.k.Image image2;
        Uploader uploader2;
        int i19;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        int i25;
        dx.j<dx.b> jVar;
        wx.k.Image image3;
        ex.b bVar3;
        ex.b bVar4;
        FileContent fileContent;
        o04.c cVar;
        Object obj;
        int i26;
        VehicleCollisionUploadedFile vehicleCollisionUploadedFile;
        VehicleCollisionUploadedFile vehicleCollisionUploadedFile2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i27 = dVar.f5963w;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f5963w = i27 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objH = dVar.f5961t;
        Object objE = uq.b.e();
        ?? r15 = dVar.f5963w;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objH);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    bc4.e eVar2 = this.createThumbnailUseCase;
                    bc4.e.Params params = new bc4.e.Params(image);
                    dVar.f5947d = uploader;
                    dVar.f5948e = image;
                    dVar.f5949f = jVarA;
                    dVar.f5950g = vq.j.a(aVar);
                    dVar.f5951h = aVar;
                    i19 = 0;
                    dVar.f5956n = 0;
                    dVar.f5957p = 0;
                    dVar.f5958q = 0;
                    dVar.f5959r = 0;
                    dVar.f5960s = 0;
                    dVar.f5963w = 1;
                    Object objC = eVar2.c(params, dVar);
                    if (objC != objE) {
                        image2 = image;
                        bVar2 = aVar;
                        uploader2 = uploader;
                        i15 = 0;
                        i17 = 0;
                        i18 = 0;
                        bVar = bVar2;
                        objH = objC;
                        i16 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            int i28 = dVar.f5960s;
                            int i29 = dVar.f5959r;
                            i25 = dVar.f5958q;
                            i17 = dVar.f5957p;
                            i18 = dVar.f5956n;
                            bVar = (ex.b) dVar.f5954l;
                            o04.c cVar2 = (o04.c) dVar.f5953k;
                            FileContent fileContent2 = (FileContent) dVar.f5952j;
                            ex.b bVar5 = (ex.b) dVar.f5951h;
                            ex.b bVar6 = (ex.b) dVar.f5950g;
                            jVar = (dx.j) dVar.f5949f;
                            image3 = (wx.k.Image) dVar.f5948e;
                            Uploader uploader3 = (Uploader) dVar.f5947d;
                            try {
                                oq.u.b(objH);
                                bVar3 = bVar6;
                                uploader2 = uploader3;
                                bVar4 = bVar5;
                                fileContent = fileContent2;
                                cVar = cVar2;
                                i19 = i29;
                                obj = objH;
                                i26 = i28;
                                vehicleCollisionUploadedFile2 = (VehicleCollisionUploadedFile) bVar.a((dx.i) obj);
                                if (cVar instanceof o04.c.Content) {
                                    if (cVar instanceof o04.c.Empty) {
                                        throw new oq.p();
                                    }
                                    bVar4.b(new dx.b.Generic(new IllegalStateException("Thumbnail can not be empty")));
                                    throw new oq.g();
                                }
                                o04.e.UploadFileThumbnail uploadFileThumbnail = new o04.e.UploadFileThumbnail((o04.c.Content) cVar);
                                dVar.f5947d = vq.j.a(uploader2);
                                dVar.f5948e = vq.j.a(image3);
                                dVar.f5949f = jVar;
                                dVar.f5950g = vq.j.a(bVar3);
                                dVar.f5951h = vq.j.a(bVar4);
                                dVar.f5952j = vq.j.a(fileContent);
                                dVar.f5953k = vq.j.a(cVar);
                                dVar.f5954l = vehicleCollisionUploadedFile2;
                                dVar.f5955m = bVar4;
                                dVar.f5956n = i18;
                                dVar.f5957p = i17;
                                dVar.f5958q = i25;
                                dVar.f5959r = i19;
                                dVar.f5960s = i26;
                                dVar.f5963w = 3;
                                objH = h(uploadFileThumbnail, uploader2, dVar);
                                if (objH != objE) {
                                    vehicleCollisionUploadedFile = vehicleCollisionUploadedFile2;
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) dVar.f5955m;
                        vehicleCollisionUploadedFile = (VehicleCollisionUploadedFile) dVar.f5954l;
                        oq.u.b(objH);
                        return new dx.i.Right(new StatementVehicleData.StatementImage(vehicleCollisionUploadedFile, (VehicleCollisionUploadedFile) bVar4.a((dx.i) objH)));
                    }
                    i15 = dVar.f5960s;
                    int i35 = dVar.f5959r;
                    i16 = dVar.f5958q;
                    i17 = dVar.f5957p;
                    i18 = dVar.f5956n;
                    bVar = (ex.b) dVar.f5951h;
                    ex.b bVar7 = (ex.b) dVar.f5950g;
                    dx.j<dx.b> jVar2 = (dx.j) dVar.f5949f;
                    image2 = (wx.k.Image) dVar.f5948e;
                    uploader2 = (Uploader) dVar.f5947d;
                    try {
                        oq.u.b(objH);
                        i19 = i35;
                        jVarA = jVar2;
                        bVar2 = bVar7;
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar2;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (CancellationException e26) {
                    throw e26;
                }
                FileContent fileContent3 = (FileContent) objH;
                o04.c cVarA = o04.c.INSTANCE.a(fileContent3, image2.getMetadata());
                o04.e.UploadFile uploadFile = new o04.e.UploadFile(image2);
                dVar.f5947d = uploader2;
                dVar.f5948e = vq.j.a(image2);
                dVar.f5949f = jVarA;
                dVar.f5950g = vq.j.a(bVar2);
                dVar.f5951h = bVar;
                dVar.f5952j = vq.j.a(fileContent3);
                dVar.f5953k = cVarA;
                dVar.f5954l = bVar;
                dVar.f5956n = i18;
                dVar.f5957p = i17;
                dVar.f5958q = i16;
                dVar.f5959r = i19;
                dVar.f5960s = i15;
                dVar.f5963w = 2;
                Object objH2 = h(uploadFile, uploader2, dVar);
                if (objH2 != objE) {
                    jVar = jVarA;
                    bVar3 = bVar2;
                    obj = objH2;
                    cVar = cVarA;
                    i26 = i15;
                    i25 = i16;
                    bVar4 = bVar;
                    image3 = image2;
                    fileContent = fileContent3;
                    vehicleCollisionUploadedFile2 = (VehicleCollisionUploadedFile) bVar.a((dx.i) obj);
                    if (cVar instanceof o04.c.Content) {
                        if (cVar instanceof o04.c.Empty) {
                            throw new oq.p();
                        }
                        bVar4.b(new dx.b.Generic(new IllegalStateException("Thumbnail can not be empty")));
                        throw new oq.g();
                    }
                    o04.e.UploadFileThumbnail uploadFileThumbnail2 = new o04.e.UploadFileThumbnail((o04.c.Content) cVar);
                    dVar.f5947d = vq.j.a(uploader2);
                    dVar.f5948e = vq.j.a(image3);
                    dVar.f5949f = jVar;
                    dVar.f5950g = vq.j.a(bVar3);
                    dVar.f5951h = vq.j.a(bVar4);
                    dVar.f5952j = vq.j.a(fileContent);
                    dVar.f5953k = vq.j.a(cVar);
                    dVar.f5954l = vehicleCollisionUploadedFile2;
                    dVar.f5955m = bVar4;
                    dVar.f5956n = i18;
                    dVar.f5957p = i17;
                    dVar.f5958q = i25;
                    dVar.f5959r = i19;
                    dVar.f5960s = i26;
                    dVar.f5963w = 3;
                    objH = h(uploadFileThumbnail2, uploader2, dVar);
                    if (objH != objE) {
                        vehicleCollisionUploadedFile = vehicleCollisionUploadedFile2;
                        return new dx.i.Right(new StatementVehicleData.StatementImage(vehicleCollisionUploadedFile, (VehicleCollisionUploadedFile) bVar4.a((dx.i) objH)));
                    }
                }
                return objE;
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(o04.e eVar, Uploader uploader, tq.e<? super dx.i<? extends dx.b, VehicleCollisionUploadedFile>> eVar2) throws Throwable {
        e eVar3;
        if (eVar2 instanceof e) {
            eVar3 = (e) eVar2;
            int i15 = eVar3.f5968h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar3.f5968h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar3 = new e(eVar2);
            }
        } else {
            eVar3 = new e(eVar2);
        }
        Object objC = eVar3.f5966f;
        Object objE = uq.b.e();
        int i16 = eVar3.f5968h;
        if (i16 == 0) {
            oq.u.b(objC);
            p04.b bVar = this.uploadFileToCloudUC;
            p04.b.Params params = new p04.b.Params(xd3.c.c(uploader), eVar);
            eVar3.f5964d = vq.j.a(eVar);
            eVar3.f5965e = vq.j.a(uploader);
            eVar3.f5968h = 1;
            objC = bVar.c(params, eVar3);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(xd3.c.f((UploadedFile) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x01af A[Catch: Exception -> 0x01bd, c -> 0x01c1, CancellationException -> 0x01c7, TryCatch #10 {c -> 0x01c1, CancellationException -> 0x01c7, Exception -> 0x01bd, blocks: (B:44:0x01a9, B:46:0x01af, B:48:0x01b9, B:60:0x0227, B:82:0x02bc), top: B:117:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b9 A[Catch: Exception -> 0x01bd, c -> 0x01c1, CancellationException -> 0x01c7, TRY_LEAVE, TryCatch #10 {c -> 0x01c1, CancellationException -> 0x01c7, Exception -> 0x01bd, blocks: (B:44:0x01a9, B:46:0x01af, B:48:0x01b9, B:60:0x0227, B:82:0x02bc), top: B:117:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01d7 A[Catch: Exception -> 0x0295, c -> 0x029a, CancellationException -> 0x029f, TRY_LEAVE, TryCatch #13 {c -> 0x029a, CancellationException -> 0x029f, Exception -> 0x0295, blocks: (B:56:0x01cd, B:58:0x01d7), top: B:113:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0232  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a4  */
    /* JADX WARN: Path cross not found for [B:111:0x0028, B:27:0x00e6], limit reached: 122 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x02b3 -> B:117:0x01a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object f(ae3.t.Params r30, tq.e<? super ae3.t.Result> r31) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.t.f(ae3.t$a, tq.e):java.lang.Object");
    }
}
