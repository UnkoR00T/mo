package ae3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jb4.PayloadErrorData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.BEVehicleData;
import sv0.Insurance;
import sv0.ProcessId;
import sv0.StatementPersonalData;
import sv0.StatementVehicleData;
import sv0.VehicleCollisionFileName;
import sv0.VehicleCollisionUploadedFile;
import sv0.VehicleCompanyOwner;
import sv0.VehiclePhysicalOwner;
import sv0.v0;
import tv0.BENewCollisionData;
import tv0.BEPersonalData;
import tv0.BEVehicleDamage;
import tv0.BEVehicleDataWithType;
import tv0.YourDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002/1B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u0015*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e0\u0015*\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J8\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u0004\u0018\u00010$*\b\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010%\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u0004\u0018\u00010$*\b\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010%\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010'J\u0015\u0010*\u001a\u0004\u0018\u00010)*\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lae3/u;", "Lgz/b;", "Lae3/u$a;", "Lae3/u$b;", "Lae3/t;", "sendImageUC", "Law0/b0;", "postVehicleCollisionStatementUC", "Law0/s;", "getFileImageConfigurationUC", "Law0/i;", "refreshParticipantCollisionImagesUC", "<init>", "(Lae3/t;Law0/b0;Law0/s;Law0/i;)V", "Lsv0/y;", "processId", "Ldx/b;", "error", "", "Ltv0/b$a;", "sentPhotos", "Ldx/i;", "i", "(Lsv0/y;Ldx/b;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ltv0/e;", "Lsv0/e0;", "k", "(Ltv0/e;)Ldx/i;", "Lsv0/i0$a;", "statementImages", "Lsv0/i0;", "l", "(Ltv0/e;Ljava/util/List;)Ldx/i;", "photos", "m", "(Lsv0/y;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lsv0/o0;", "photo", "f", "(Ljava/util/List;Ltv0/b$a;)Lsv0/o0;", "g", "Ljb4/f;", "h", "(Ldx/b;)Ljb4/f;", "params", "j", "(Lae3/u$a;Ltq/e;)Ljava/lang/Object;", "a", "Lae3/t;", "b", "Law0/b0;", "c", "Law0/s;", "d", "Law0/i;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements gz.b<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t sendImageUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final aw0.b0 postVehicleCollisionStatementUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aw0.s getFileImageConfigurationUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw0.i refreshParticipantCollisionImagesUC;

    /* JADX INFO: renamed from: ae3.u$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae3/u$a;", "Lgz/b$a;", "Ltv0/e;", "newCollisionData", "<init>", "(Ltv0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/e;", "()Ltv0/e;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BENewCollisionData newCollisionData;

        public Params(BENewCollisionData bENewCollisionData) {
            this.newCollisionData = bENewCollisionData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BENewCollisionData getNewCollisionData() {
            return this.newCollisionData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.newCollisionData, ((Params) other).newCollisionData);
        }

        public int hashCode() {
            return this.newCollisionData.hashCode();
        }

        public String toString() {
            return "Params(newCollisionData=" + this.newCollisionData + ')';
        }
    }

    /* JADX INFO: renamed from: ae3.u$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lae3/u$b;", "Lgz/b$a;", "", "Ltv0/b$a;", "sentPhoto", "Ldx/i;", "Ldx/b;", "Loq/i0;", "either", "<init>", "(Ljava/util/List;Ldx/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ldx/i;", "()Ldx/i;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<YourDetails.Photo> sentPhoto;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.i<dx.b, i0> either;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(List<YourDetails.Photo> list, dx.i<? extends dx.b, i0> iVar) {
            this.sentPhoto = list;
            this.either = iVar;
        }

        public final dx.i<dx.b, i0> a() {
            return this.either;
        }

        public final List<YourDetails.Photo> b() {
            return this.sentPhoto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.sentPhoto, result.sentPhoto) && fr.t.c(this.either, result.either);
        }

        public int hashCode() {
            return (this.sentPhoto.hashCode() * 31) + this.either.hashCode();
        }

        public String toString() {
            return "Result(sentPhoto=" + this.sentPhoto + ", either=" + this.either + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5980h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5981j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5982k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5983l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5984m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5985n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5986p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5987q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5988r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f5989s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f5991v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5989s = obj;
            this.f5991v |= PKIFailureInfo.systemUnavail;
            return u.this.i(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {
        int A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5995g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5996h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5997j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5998k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5999l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f6000m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6001n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f6002p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f6003q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6004r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6005s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6006t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f6007v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f6008w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f6009x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f6010y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f6011z;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return u.this.j(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f6012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f6014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f6015g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f6016h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f6017j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f6018k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f6019l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f6020m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6021n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f6022p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6023q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6024r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6026t;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f6024r = obj;
            this.f6026t |= PKIFailureInfo.systemUnavail;
            return u.this.m(null, null, this);
        }
    }

    public u(t tVar, aw0.b0 b0Var, aw0.s sVar, aw0.i iVar) {
        this.sendImageUC = tVar;
        this.postVehicleCollisionStatementUC = b0Var;
        this.getFileImageConfigurationUC = sVar;
        this.refreshParticipantCollisionImagesUC = iVar;
    }

    private final VehicleCollisionFileName f(List<VehicleCollisionFileName> list, YourDetails.Photo photo) {
        Object fileName;
        Object next;
        VehicleCollisionFileName vehicleCollisionFileName;
        VehicleCollisionUploadedFile original;
        Iterator<T> it = list.iterator();
        do {
            fileName = null;
            if (it.hasNext()) {
                next = it.next();
                vehicleCollisionFileName = (VehicleCollisionFileName) next;
                StatementVehicleData.StatementImage uploadedStatementImage = photo.getUploadedStatementImage();
                if (uploadedStatementImage != null && (original = uploadedStatementImage.getOriginal()) != null) {
                    fileName = original.getFileName();
                }
            }
            return (VehicleCollisionFileName) fileName;
        } while (!fr.t.c(vehicleCollisionFileName, fileName));
        fileName = next;
        return (VehicleCollisionFileName) fileName;
    }

    private final VehicleCollisionFileName g(List<VehicleCollisionFileName> list, YourDetails.Photo photo) {
        Object fileName;
        Object next;
        VehicleCollisionFileName vehicleCollisionFileName;
        VehicleCollisionUploadedFile thumbnail;
        Iterator<T> it = list.iterator();
        do {
            fileName = null;
            if (it.hasNext()) {
                next = it.next();
                vehicleCollisionFileName = (VehicleCollisionFileName) next;
                StatementVehicleData.StatementImage uploadedStatementImage = photo.getUploadedStatementImage();
                if (uploadedStatementImage != null && (thumbnail = uploadedStatementImage.getThumbnail()) != null) {
                    fileName = thumbnail.getFileName();
                }
            }
            return (VehicleCollisionFileName) fileName;
        } while (!fr.t.c(vehicleCollisionFileName, fileName));
        fileName = next;
        return (VehicleCollisionFileName) fileName;
    }

    private final PayloadErrorData h(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [dx.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ae3.u] */
    public final Object i(ProcessId processId, dx.b bVar, List<YourDetails.Photo> list, tq.e<? super dx.i<? extends dx.b, ? extends List<YourDetails.Photo>>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.b bVar2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f5991v;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f5991v = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f5989s;
        Object objE = uq.b.e();
        int i16 = cVar.f5991v;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        PayloadErrorData payloadErrorDataH = h(bVar);
                        if (!fr.t.c(payloadErrorDataH != null ? payloadErrorDataH.getCode() : null, "FILE_UPLOAD_MAX_FILES_NUMBER_EXCEEDED")) {
                            if (fr.t.c(payloadErrorDataH != null ? payloadErrorDataH.getCode() : null, "VEHICLE_COLLISION_PARTICIPANT_MISSING_STORAGE_IMAGE")) {
                            }
                            return new dx.i.Right(list);
                        }
                        cVar.f5976d = vq.j.a(processId);
                        cVar.f5977e = vq.j.a(bVar);
                        cVar.f5978f = vq.j.a(list);
                        cVar.f5979g = jVarA;
                        cVar.f5980h = vq.j.a(aVar);
                        cVar.f5981j = vq.j.a(aVar);
                        cVar.f5982k = vq.j.a(payloadErrorDataH);
                        cVar.f5983l = aVar;
                        cVar.f5984m = 0;
                        cVar.f5985n = 0;
                        cVar.f5986p = 0;
                        cVar.f5987q = 0;
                        cVar.f5988r = 0;
                        cVar.f5991v = 1;
                        Object objM = m(processId, list, cVar);
                        if (objM == objE) {
                            return objE;
                        }
                        obj = objM;
                        bVar2 = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        bVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        dx.i iVarA = bVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) cVar.f5983l;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                list = (List) bVar2.a((dx.i) obj);
                return new dx.i.Right(list);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    private final dx.i<dx.b, StatementPersonalData> k(BENewCollisionData bENewCollisionData) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEPersonalData personalData = bENewCollisionData.getYourDetails().getPersonalData();
                    if (personalData != null) {
                        return new dx.i.Right(new StatementPersonalData(personalData.getPhoneNumber(), personalData.getEmail(), personalData.getAddress().getPostcode(), personalData.getAddress().getCity(), personalData.getAddress().getStreet(), personalData.getAddress().getBuildingNumber(), personalData.getAddress().getFlatNumber()));
                    }
                    aVar.b(new dx.b.Generic(new IllegalArgumentException("personalData cannot be null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final dx.i<dx.b, StatementVehicleData> l(BENewCollisionData bENewCollisionData, List<StatementVehicleData.StatementImage> list) {
        Object objB;
        Collection collectionN;
        List listN;
        List<Insurance> listN2;
        VehicleCompanyOwner vehicleCompanyOwner;
        BEVehicleData vehicleData;
        BEVehicleDamage vehicleDamage;
        Set<v0> setA;
        Map<tv0.l.PhysicalOwner.EnumC5029c, tv0.l.PhysicalOwner.PersonData> mapC;
        Collection<tv0.l.PhysicalOwner.PersonData> collectionValues;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEVehicleDataWithType selectedVehicle = bENewCollisionData.getYourDetails().getSelectedVehicle();
                    if (selectedVehicle == null) {
                        aVar.b(new dx.b.Generic(new IllegalArgumentException("selectedVehicle cannot be null")));
                        throw new oq.g();
                    }
                    tv0.h selectedDamage = bENewCollisionData.getYourDetails().getSelectedDamage();
                    if (selectedDamage == null) {
                        aVar.b(new dx.b.Generic(new IllegalArgumentException("selectedDamage cannot be null")));
                        throw new oq.g();
                    }
                    tv0.l selectedVehicleOwnerDetails = bENewCollisionData.getYourDetails().getSelectedVehicleOwnerDetails();
                    tv0.l.PhysicalOwner physicalOwner = selectedVehicleOwnerDetails instanceof tv0.l.PhysicalOwner ? (tv0.l.PhysicalOwner) selectedVehicleOwnerDetails : null;
                    if (physicalOwner == null || (mapC = physicalOwner.c()) == null || (collectionValues = mapC.values()) == null) {
                        collectionN = pq.v.n();
                    } else {
                        collectionN = new ArrayList();
                        for (Object obj : collectionValues) {
                            if (((tv0.l.PhysicalOwner.PersonData) obj).g()) {
                                collectionN.add(obj);
                            }
                        }
                    }
                    tv0.l selectedVehicleOwnerDetails2 = bENewCollisionData.getYourDetails().getSelectedVehicleOwnerDetails();
                    tv0.l.CompanyOwner companyOwner = selectedVehicleOwnerDetails2 instanceof tv0.l.CompanyOwner ? (tv0.l.CompanyOwner) selectedVehicleOwnerDetails2 : null;
                    if (companyOwner == null || !companyOwner.f()) {
                        companyOwner = null;
                    }
                    BEVehicleData vehicleData2 = selectedVehicle.getVehicleData();
                    if (!(selectedDamage instanceof tv0.h.Damaged) || (vehicleDamage = ((tv0.h.Damaged) selectedDamage).getVehicleDamage()) == null || (setA = vehicleDamage.a()) == null || (listN = pq.v.f1(setA)) == null) {
                        listN = pq.v.n();
                    }
                    List list2 = listN;
                    BEVehicleDataWithType selectedVehicle2 = bENewCollisionData.getYourDetails().getSelectedVehicle();
                    if (selectedVehicle2 == null || (vehicleData = selectedVehicle2.getVehicleData()) == null || (listN2 = vehicleData.e()) == null) {
                        listN2 = pq.v.n();
                    }
                    List<Insurance> list3 = listN2;
                    Collection<tv0.l.PhysicalOwner.PersonData> collection = collectionN;
                    ArrayList arrayList = new ArrayList(pq.v.y(collection, 10));
                    for (tv0.l.PhysicalOwner.PersonData personData : collection) {
                        iy.b0 name = personData.getName();
                        iy.b0 surname = personData.getSurname();
                        PhoneNumber phoneNumber = personData.getPhoneNumber();
                        if (iy.c0.e(phoneNumber.g()).length() <= 0) {
                            phoneNumber = null;
                        }
                        iy.b0 email = personData.getEmail();
                        if (iy.c0.e(email).length() <= 0) {
                            email = null;
                        }
                        arrayList.add(new VehiclePhysicalOwner(name, surname, phoneNumber, email));
                    }
                    if (companyOwner != null) {
                        iy.b0 name2 = companyOwner.getName();
                        PhoneNumber phoneNumber2 = companyOwner.getPhoneNumber();
                        if (iy.c0.e(phoneNumber2.g()).length() <= 0) {
                            phoneNumber2 = null;
                        }
                        iy.b0 email2 = companyOwner.getEmail();
                        vehicleCompanyOwner = new VehicleCompanyOwner(name2, phoneNumber2, iy.c0.e(email2).length() > 0 ? email2 : null);
                    } else {
                        vehicleCompanyOwner = null;
                    }
                    return new dx.i.Right(new StatementVehicleData(vehicleData2, list2, list3, arrayList, vehicleCompanyOwner, list));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public final Object m(ProcessId processId, List<YourDetails.Photo> list, tq.e<? super dx.i<? extends dx.b, ? extends List<YourDetails.Photo>>> eVar) throws Throwable {
        e eVar2;
        Exception exc;
        ?? r15;
        Object objB;
        dx.j<dx.b> jVarA;
        Object obj;
        ex.b bVar;
        ex.c cVar;
        List<YourDetails.Photo> list2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f6026t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f6026t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj2 = eVar2.f6024r;
        Object objE = uq.b.e();
        int i16 = eVar2.f6026t;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj2);
                    jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            StatementVehicleData.StatementImage uploadedStatementImage = ((YourDetails.Photo) it.next()).getUploadedStatementImage();
                            if (uploadedStatementImage != null) {
                                arrayList.add(uploadedStatementImage.getOriginal().getFileName());
                                arrayList.add(uploadedStatementImage.getThumbnail().getFileName());
                            }
                        }
                        aw0.i iVar = this.refreshParticipantCollisionImagesUC;
                        aw0.i.Params params = new aw0.i.Params(processId, arrayList);
                        eVar2.f6012d = vq.j.a(processId);
                        eVar2.f6013e = list;
                        eVar2.f6014f = jVarA;
                        eVar2.f6015g = vq.j.a(aVar);
                        eVar2.f6016h = vq.j.a(aVar);
                        eVar2.f6017j = vq.j.a(arrayList);
                        eVar2.f6018k = aVar;
                        eVar2.f6019l = 0;
                        eVar2.f6020m = 0;
                        eVar2.f6021n = 0;
                        eVar2.f6022p = 0;
                        eVar2.f6023q = 0;
                        eVar2.f6026t = 1;
                        Object objC = iVar.c(params, eVar2);
                        if (objC == objE) {
                            return objE;
                        }
                        obj = objC;
                        bVar = aVar;
                        list2 = list;
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        exc = e17;
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        dx.i iVarA = r15.a(exc);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) eVar2.f6018k;
                    dx.j<dx.b> jVar = (dx.j) eVar2.f6014f;
                    List<YourDetails.Photo> list3 = (List) eVar2.f6013e;
                    try {
                        oq.u.b(obj2);
                        obj = obj2;
                        jVarA = jVar;
                        list2 = list3;
                    } catch (ex.c e18) {
                        cVar = e18;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                List<VehicleCollisionFileName> list4 = (List) bVar.a((dx.i) obj);
                List<YourDetails.Photo> list5 = list2;
                ArrayList arrayList2 = new ArrayList(pq.v.y(list5, 10));
                for (YourDetails.Photo photoB : list5) {
                    VehicleCollisionFileName vehicleCollisionFileNameF = f(list4, photoB);
                    VehicleCollisionFileName vehicleCollisionFileNameG = g(list4, photoB);
                    if (vehicleCollisionFileNameF == null || vehicleCollisionFileNameG == null) {
                        photoB = YourDetails.Photo.b(photoB, null, null, null, null, 7, null);
                    }
                    arrayList2.add(photoB);
                }
                return new dx.i.Right(arrayList2);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            exc = e26;
            r15 = list;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public java.lang.Object j(ae3.u.Params r25, tq.e<? super ae3.u.Result> r26) {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.u.j(ae3.u$a, tq.e):java.lang.Object");
    }
}
