package ae3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.Download;
import sv0.VehicleCollisionFileToDownload;
import wx.FileContent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lae3/e;", "", "Lae3/e$a;", "Lwx/c;", "Lp04/a;", "downloadFileFromCloudUC", "<init>", "(Lp04/a;)V", "Lsv0/p0;", "configuration", "Lsv0/r0;", "file", "Ldx/i;", "Ldx/b;", "e", "(Lsv0/p0;Lsv0/r0;Ltq/e;)Ljava/lang/Object;", "params", "f", "(Lae3/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp04/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p04.a downloadFileFromCloudUC;

    /* JADX INFO: renamed from: ae3.e$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lae3/e$a;", "Lgz/b$a;", "Lsv0/p0;", "initialConfiguration", "Lsv0/r0;", "file", "<init>", "(Lsv0/p0;Lsv0/r0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/p0;", "b", "()Lsv0/p0;", "Lsv0/r0;", "()Lsv0/r0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Download initialConfiguration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleCollisionFileToDownload file;

        public Params(Download download, VehicleCollisionFileToDownload vehicleCollisionFileToDownload) {
            this.initialConfiguration = download;
            this.file = vehicleCollisionFileToDownload;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VehicleCollisionFileToDownload getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Download getInitialConfiguration() {
            return this.initialConfiguration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.initialConfiguration, params.initialConfiguration) && fr.t.c(this.file, params.file);
        }

        public int hashCode() {
            return (this.initialConfiguration.hashCode() * 31) + this.file.hashCode();
        }

        public String toString() {
            return "Params(initialConfiguration=" + this.initialConfiguration + ", file=" + this.file + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5718f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5720h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5718f = obj;
            this.f5720h |= PKIFailureInfo.systemUnavail;
            return e.this.e(null, null, this);
        }
    }

    public e(p04.a aVar) {
        this.downloadFileFromCloudUC = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Download download, VehicleCollisionFileToDownload vehicleCollisionFileToDownload, tq.e<? super dx.i<? extends dx.b, FileContent>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f5720h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f5720h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f5718f;
        Object objE = uq.b.e();
        int i16 = bVar.f5720h;
        if (i16 == 0) {
            oq.u.b(objC);
            p04.a aVar = this.downloadFileFromCloudUC;
            p04.a.Params params = new p04.a.Params(xd3.c.b(download), xd3.c.d(vehicleCollisionFileToDownload));
            bVar.f5716d = vq.j.a(download);
            bVar.f5717e = vq.j.a(vehicleCollisionFileToDownload);
            bVar.f5720h = 1;
            objC = aVar.c(params, bVar);
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
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            px.f fVar = px.f.f163100a;
            dx.b.Generic generic = bVar2 instanceof dx.b.Generic ? (dx.b.Generic) bVar2 : null;
            fVar.d("Image download failed", generic != null ? generic.getE() : null, px.c.a(this));
        }
        return iVar;
    }

    public Object f(Params params, tq.e<? super dx.i<? extends dx.b, FileContent>> eVar) {
        return e(params.getInitialConfiguration(), params.getFile(), eVar);
    }
}
