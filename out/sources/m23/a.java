package m23;

import dx.i;
import dx.j;
import fr.t;
import iy.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jb4.PayloadErrorData;
import k23.AttachmentFile;
import o04.UploadedFile;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import tt0.BEAttachments;
import tt0.BEAttachmentsConfiguration;
import tt0.BESendReportResponse;
import tt0.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm23/a;", "Lgz/b;", "Lm23/a$a;", "Lm23/a$b;", "Lm23/b;", "uploadAttachmentsUC", "Lut0/e;", "beSendReportUC", "<init>", "(Lm23/b;Lut0/e;)V", "Ldx/b;", "Ljb4/f;", "d", "(Ldx/b;)Ljb4/f;", "params", "e", "(Lm23/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lm23/b;", "b", "Lut0/e;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b uploadAttachmentsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ut0.e beSendReportUC;

    /* JADX INFO: renamed from: m23.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lm23/a$a;", "Lgz/b$a;", "Ltt0/s;", "report", "", "Lk23/a;", "attachments", "Ltt0/b;", "attachmentsConfiguration", "<init>", "(Ltt0/s;Ljava/util/List;Ltt0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/s;", "c", "()Ltt0/s;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Ltt0/b;", "()Ltt0/b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s report;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AttachmentFile> attachments;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEAttachmentsConfiguration attachmentsConfiguration;

        public Params(s sVar, List<AttachmentFile> list, BEAttachmentsConfiguration bEAttachmentsConfiguration) {
            this.report = sVar;
            this.attachments = list;
            this.attachmentsConfiguration = bEAttachmentsConfiguration;
        }

        public final List<AttachmentFile> a() {
            return this.attachments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEAttachmentsConfiguration getAttachmentsConfiguration() {
            return this.attachmentsConfiguration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final s getReport() {
            return this.report;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.report, params.report) && t.c(this.attachments, params.attachments) && t.c(this.attachmentsConfiguration, params.attachmentsConfiguration);
        }

        public int hashCode() {
            int iHashCode = ((this.report.hashCode() * 31) + this.attachments.hashCode()) * 31;
            BEAttachmentsConfiguration bEAttachmentsConfiguration = this.attachmentsConfiguration;
            return iHashCode + (bEAttachmentsConfiguration == null ? 0 : bEAttachmentsConfiguration.hashCode());
        }

        public String toString() {
            return "Params(report=" + this.report + ", attachments=" + this.attachments + ", attachmentsConfiguration=" + this.attachmentsConfiguration + ')';
        }
    }

    /* JADX INFO: renamed from: m23.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"Lm23/a$b;", "Lgz/b$a;", "", "Lk23/a;", "updatedAttachments", "Ltt0/b;", "updatedAttachmentsConfiguration", "Ldx/i;", "Ldx/b;", "Ltt0/t;", "either", "<init>", "(Ljava/util/List;Ltt0/b;Ldx/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ltt0/b;", "c", "()Ltt0/b;", "Ldx/i;", "()Ldx/i;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AttachmentFile> updatedAttachments;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEAttachmentsConfiguration updatedAttachmentsConfiguration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final i<dx.b, BESendReportResponse> either;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(List<AttachmentFile> list, BEAttachmentsConfiguration bEAttachmentsConfiguration, i<? extends dx.b, BESendReportResponse> iVar) {
            this.updatedAttachments = list;
            this.updatedAttachmentsConfiguration = bEAttachmentsConfiguration;
            this.either = iVar;
        }

        public final i<dx.b, BESendReportResponse> a() {
            return this.either;
        }

        public final List<AttachmentFile> b() {
            return this.updatedAttachments;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BEAttachmentsConfiguration getUpdatedAttachmentsConfiguration() {
            return this.updatedAttachmentsConfiguration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.updatedAttachments, result.updatedAttachments) && t.c(this.updatedAttachmentsConfiguration, result.updatedAttachmentsConfiguration) && t.c(this.either, result.either);
        }

        public int hashCode() {
            int iHashCode = this.updatedAttachments.hashCode() * 31;
            BEAttachmentsConfiguration bEAttachmentsConfiguration = this.updatedAttachmentsConfiguration;
            return ((iHashCode + (bEAttachmentsConfiguration == null ? 0 : bEAttachmentsConfiguration.hashCode())) * 31) + this.either.hashCode();
        }

        public String toString() {
            return "Result(updatedAttachments=" + this.updatedAttachments + ", updatedAttachmentsConfiguration=" + this.updatedAttachmentsConfiguration + ", either=" + this.either + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f123329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f123331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f123332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f123333h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f123334j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f123335k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f123336l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f123337m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123338n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f123339p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f123340q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f123341r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f123343t;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f123341r = obj;
            this.f123343t |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    public a(b bVar, ut0.e eVar) {
        this.uploadAttachmentsUC = bVar;
        this.beSendReportUC = eVar;
    }

    private final PayloadErrorData d(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x0173 A[Catch: Exception -> 0x0195, c -> 0x019a, CancellationException -> 0x019f, TryCatch #6 {c -> 0x019a, CancellationException -> 0x019f, Exception -> 0x0195, blocks: (B:61:0x014d, B:62:0x016d, B:64:0x0173, B:66:0x017f, B:73:0x01a4, B:74:0x01b8, B:75:0x01b9, B:77:0x01bf, B:80:0x01c7, B:83:0x01cf, B:89:0x021e, B:90:0x0232), top: B:111:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x017f A[Catch: Exception -> 0x0195, c -> 0x019a, CancellationException -> 0x019f, LOOP:0: B:62:0x016d->B:66:0x017f, LOOP_END, TryCatch #6 {c -> 0x019a, CancellationException -> 0x019f, Exception -> 0x0195, blocks: (B:61:0x014d, B:62:0x016d, B:64:0x0173, B:66:0x017f, B:73:0x01a4, B:74:0x01b8, B:75:0x01b9, B:77:0x01bf, B:80:0x01c7, B:83:0x01cf, B:89:0x021e, B:90:0x0232), top: B:111:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf A[Catch: Exception -> 0x0195, c -> 0x019a, CancellationException -> 0x019f, TryCatch #6 {c -> 0x019a, CancellationException -> 0x019f, Exception -> 0x0195, blocks: (B:61:0x014d, B:62:0x016d, B:64:0x0173, B:66:0x017f, B:73:0x01a4, B:74:0x01b8, B:75:0x01b9, B:77:0x01bf, B:80:0x01c7, B:83:0x01cf, B:89:0x021e, B:90:0x0232), top: B:111:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7 A[Catch: Exception -> 0x0195, c -> 0x019a, CancellationException -> 0x019f, TryCatch #6 {c -> 0x019a, CancellationException -> 0x019f, Exception -> 0x0195, blocks: (B:61:0x014d, B:62:0x016d, B:64:0x0173, B:66:0x017f, B:73:0x01a4, B:74:0x01b8, B:75:0x01b9, B:77:0x01bf, B:80:0x01c7, B:83:0x01cf, B:89:0x021e, B:90:0x0232), top: B:111:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf A[Catch: Exception -> 0x0195, c -> 0x019a, CancellationException -> 0x019f, TRY_LEAVE, TryCatch #6 {c -> 0x019a, CancellationException -> 0x019f, Exception -> 0x0195, blocks: (B:61:0x014d, B:62:0x016d, B:64:0x0173, B:66:0x017f, B:73:0x01a4, B:74:0x01b8, B:75:0x01b9, B:77:0x01bf, B:80:0x01c7, B:83:0x01cf, B:89:0x021e, B:90:0x0232), top: B:111:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x020c  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e A[Catch: Exception -> 0x0195, c -> 0x019a, CancellationException -> 0x019f, TRY_ENTER, TryCatch #6 {c -> 0x019a, CancellationException -> 0x019f, Exception -> 0x0195, blocks: (B:61:0x014d, B:62:0x016d, B:64:0x0173, B:66:0x017f, B:73:0x01a4, B:74:0x01b8, B:75:0x01b9, B:77:0x01bf, B:80:0x01c7, B:83:0x01cf, B:89:0x021e, B:90:0x0232), top: B:111:0x014d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [m23.b$b] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public Object e(Params params, tq.e<? super Result> eVar) throws Throwable {
        c cVar;
        Object objB;
        i left;
        ?? r15;
        int i15;
        Params params2;
        List<AttachmentFile> list;
        BEAttachmentsConfiguration bEAttachmentsConfiguration;
        b.Result result;
        i<dx.b, i0> iVarA;
        j<dx.b> jVarA;
        b.Result result2;
        ex.a aVar;
        ut0.e eVar2;
        s report;
        ArrayList arrayList;
        Iterator it;
        BEAttachmentsConfiguration updatedConfiguration;
        b0 fileEncryptionKey;
        ry.a aVarA;
        Object objC;
        ex.b bVar;
        UploadedFile uploadedFile;
        PayloadErrorData payloadErrorDataD;
        String code;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i16 = cVar.f123343t;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f123343t = i16 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f123341r;
        Object objE = uq.b.e();
        ?? r16 = cVar.f123343t;
        ?? r17 = 3;
        try {
            try {
                if (r16 == 0) {
                    u.b(objD);
                    List<AttachmentFile> listA = params.a();
                    if (!(listA instanceof Collection) || !listA.isEmpty()) {
                        Iterator it4 = listA.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                i15 = 0;
                                break;
                            }
                            if (((AttachmentFile) it4.next()).getUploadedFile() == null) {
                                i15 = 1;
                                break;
                            }
                        }
                    } else {
                        i15 = 0;
                        break;
                    }
                    if (i15 == 0) {
                        List<AttachmentFile> listA2 = params.a();
                        BEAttachmentsConfiguration attachmentsConfiguration = params.getAttachmentsConfiguration();
                        ut0.e eVar3 = this.beSendReportUC;
                        ut0.e.Params params3 = new ut0.e.Params(params.getReport(), null);
                        cVar.f123329d = vq.j.a(params);
                        cVar.f123330e = listA2;
                        cVar.f123331f = attachmentsConfiguration;
                        cVar.f123335k = i15;
                        cVar.f123343t = 1;
                        Object objC2 = eVar3.c(params3, cVar);
                        if (objC2 != objE) {
                            list = listA2;
                            objD = objC2;
                            bEAttachmentsConfiguration = attachmentsConfiguration;
                            return new Result(list, bEAttachmentsConfiguration, (i) objD);
                        }
                    } else {
                        b bVar2 = this.uploadAttachmentsUC;
                        b.Params params4 = new b.Params(params.a(), params.getAttachmentsConfiguration());
                        cVar.f123329d = params;
                        cVar.f123335k = i15;
                        cVar.f123343t = 2;
                        objD = bVar2.d(params4, cVar);
                        if (objD != objE) {
                            params2 = params;
                            result = (b.Result) objD;
                            iVarA = result.a();
                            if (iVarA instanceof i.Left) {
                                dx.b bVar3 = (dx.b) ((i.Left) iVarA).b();
                                payloadErrorDataD = d(bVar3);
                                if (payloadErrorDataD != null) {
                                    code = payloadErrorDataD.getCode();
                                } else {
                                    code = null;
                                }
                                if (t.c(code, "FILE_UPLOAD_MAX_FILES_NUMBER_EXCEEDED")) {
                                }
                            }
                            jVarA = xw.c.f221622a.a();
                            aVar = new ex.a();
                            eVar2 = this.beSendReportUC;
                            report = params2.getReport();
                            List<AttachmentFile> listB = result.b();
                            arrayList = new ArrayList(v.y(listB, 10));
                            it = listB.iterator();
                            while (it.hasNext()) {
                                uploadedFile = ((AttachmentFile) it.next()).getUploadedFile();
                                if (uploadedFile != null) {
                                    aVar.b(new dx.b.Generic(new Exception("uploadedFile is null")));
                                    throw new oq.g();
                                }
                                arrayList.add(new BEAttachments.Attachment(uploadedFile.getEncryptionIV(), uploadedFile.getFileName().a(), null));
                            }
                            updatedConfiguration = result.getUpdatedConfiguration();
                            if (updatedConfiguration != null) {
                                fileEncryptionKey = updatedConfiguration.getFileEncryptionKey();
                            } else {
                                fileEncryptionKey = null;
                            }
                            if (fileEncryptionKey != null) {
                                aVarA = ry.a.a(fileEncryptionKey);
                            } else {
                                aVarA = null;
                            }
                            if (aVarA != null) {
                                aVar.b(new dx.b.Generic(new Exception("encryptionKey is null")));
                                throw new oq.g();
                            }
                            ut0.e.Params params5 = new ut0.e.Params(report, new BEAttachments(arrayList, aVarA.getData(), null));
                            cVar.f123329d = vq.j.a(params2);
                            cVar.f123330e = result;
                            cVar.f123331f = jVarA;
                            cVar.f123332g = vq.j.a(aVar);
                            cVar.f123333h = vq.j.a(aVar);
                            cVar.f123334j = aVar;
                            cVar.f123335k = i15;
                            cVar.f123336l = 0;
                            cVar.f123337m = 0;
                            cVar.f123338n = 0;
                            cVar.f123339p = 0;
                            cVar.f123340q = 0;
                            cVar.f123343t = 3;
                            objC = eVar2.c(params5, cVar);
                            if (objC != objE) {
                                bVar = aVar;
                                objD = objC;
                                result2 = result;
                                left = new i.Right((BESendReportResponse) bVar.a((i) objD));
                                r15 = result2;
                            }
                        }
                    }
                    return objE;
                }
                if (r16 == 1) {
                    bEAttachmentsConfiguration = (BEAttachmentsConfiguration) cVar.f123331f;
                    list = (List) cVar.f123330e;
                    u.b(objD);
                    return new Result(list, bEAttachmentsConfiguration, (i) objD);
                }
                if (r16 == 2) {
                    i15 = cVar.f123335k;
                    params2 = (Params) cVar.f123329d;
                    u.b(objD);
                    result = (b.Result) objD;
                    iVarA = result.a();
                    if (iVarA instanceof i.Left) {
                        dx.b bVar4 = (dx.b) ((i.Left) iVarA).b();
                        payloadErrorDataD = d(bVar4);
                        if (payloadErrorDataD != null) {
                            code = payloadErrorDataD.getCode();
                        } else {
                            code = null;
                        }
                        return t.c(code, "FILE_UPLOAD_MAX_FILES_NUMBER_EXCEEDED") ? new Result(result.b(), null, new i.Left(bVar4)) : new Result(result.b(), result.getUpdatedConfiguration(), new i.Left(bVar4));
                    }
                    jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        eVar2 = this.beSendReportUC;
                        report = params2.getReport();
                        List<AttachmentFile> listB2 = result.b();
                        arrayList = new ArrayList(v.y(listB2, 10));
                        it = listB2.iterator();
                        while (it.hasNext()) {
                            uploadedFile = ((AttachmentFile) it.next()).getUploadedFile();
                            if (uploadedFile != null) {
                                aVar.b(new dx.b.Generic(new Exception("uploadedFile is null")));
                                throw new oq.g();
                            }
                            arrayList.add(new BEAttachments.Attachment(uploadedFile.getEncryptionIV(), uploadedFile.getFileName().a(), null));
                        }
                        updatedConfiguration = result.getUpdatedConfiguration();
                        if (updatedConfiguration != null) {
                            fileEncryptionKey = updatedConfiguration.getFileEncryptionKey();
                        } else {
                            fileEncryptionKey = null;
                        }
                        if (fileEncryptionKey != null) {
                            aVarA = ry.a.a(fileEncryptionKey);
                        } else {
                            aVarA = null;
                        }
                        if (aVarA != null) {
                            aVar.b(new dx.b.Generic(new Exception("encryptionKey is null")));
                            throw new oq.g();
                        }
                        ut0.e.Params params6 = new ut0.e.Params(report, new BEAttachments(arrayList, aVarA.getData(), null));
                        cVar.f123329d = vq.j.a(params2);
                        cVar.f123330e = result;
                        cVar.f123331f = jVarA;
                        cVar.f123332g = vq.j.a(aVar);
                        cVar.f123333h = vq.j.a(aVar);
                        cVar.f123334j = aVar;
                        cVar.f123335k = i15;
                        cVar.f123336l = 0;
                        cVar.f123337m = 0;
                        cVar.f123338n = 0;
                        cVar.f123339p = 0;
                        cVar.f123340q = 0;
                        cVar.f123343t = 3;
                        objC = eVar2.c(params6, cVar);
                        if (objC != objE) {
                            bVar = aVar;
                            objD = objC;
                            result2 = result;
                            left = new i.Right((BESendReportResponse) bVar.a((i) objD));
                            r15 = result2;
                        }
                        return objE;
                    } catch (ex.c e15) {
                        e = e15;
                        result2 = result;
                        left = new i.Left((dx.b) ex.d.a(e));
                        r15 = result2;
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r17 = result;
                        r16 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(r16));
                        i iVarA2 = r16.a(e);
                        if (iVarA2 instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA2).b());
                        } else {
                            if (!(iVarA2 instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA2).b();
                        }
                        left = new i.Left(objB);
                        r15 = r17;
                    }
                } else {
                    if (r16 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) cVar.f123334j;
                    result2 = (b.Result) cVar.f123330e;
                    try {
                        u.b(objD);
                        result2 = result2;
                        left = new i.Right((BESendReportResponse) bVar.a((i) objD));
                        r15 = result2;
                    } catch (ex.c e18) {
                        e = e18;
                        left = new i.Left((dx.b) ex.d.a(e));
                        r15 = result2;
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
        return new Result(r15.b(), r15.getUpdatedConfiguration(), left);
    }
}
