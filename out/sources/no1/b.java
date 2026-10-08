package no1;

import fr.t;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lno1/b;", "", "Lno1/b$a;", "", "Lo04/f;", "Lp04/b;", "uploadFileToCloudUC", "Lno1/a;", "developerUploadFilesParametersProviderUC", "<init>", "(Lp04/b;Lno1/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lno1/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp04/b;", "b", "Lno1/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p04.b uploadFileToCloudUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a developerUploadFilesParametersProviderUC;

    /* JADX INFO: renamed from: no1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lno1/b$a;", "Lgz/b$a;", "", "Lwx/b;", "files", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<wx.b> files;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(List<? extends wx.b> list) {
            this.files = list;
        }

        public final List<wx.b> a() {
            return this.files;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.files, ((Params) other).files);
        }

        public int hashCode() {
            return this.files.hashCode();
        }

        public String toString() {
            return "Params(files=" + this.files + ')';
        }
    }

    /* JADX INFO: renamed from: no1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3393b extends d {
        int A;
        int B;
        /* synthetic */ Object C;
        int E;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f137539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f137540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f137541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f137542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f137543h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f137544j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f137545k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f137546l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f137547m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f137548n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f137549p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f137550q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f137551r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f137552s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f137553t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f137554v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f137555w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f137556x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f137557y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f137558z;

        C3393b(e<? super C3393b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.C = obj;
            this.E |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(p04.b bVar, a aVar) {
        this.uploadFileToCloudUC = bVar;
        this.developerUploadFilesParametersProviderUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x017b A[Catch: Exception -> 0x029b, c -> 0x029d, CancellationException -> 0x02a1, TRY_LEAVE, TryCatch #8 {c -> 0x029d, CancellationException -> 0x02a1, Exception -> 0x029b, blocks: (B:47:0x0281, B:35:0x0175, B:37:0x017b, B:60:0x02b0), top: B:83:0x0281 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x01df  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0267  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0098: MOVE (r9 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:16:0x0098 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0267 -> B:83:0x0281). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(no1.b.Params r27, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<o04.UploadedFile>>> r28) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no1.b.d(no1.b$a, tq.e):java.lang.Object");
    }
}
