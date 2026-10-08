package ae3;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.Download;
import sv0.VehicleCollisionFileToDownload;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lae3/d;", "", "Lae3/d$a;", "Loq/i0;", "Lae3/e;", "downloadImageUC", "La14/a0;", "saveFilesOnDeviceUseCase", "Lpx/d;", "remoteLogger", "<init>", "(Lae3/e;La14/a0;Lpx/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lae3/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lae3/e;", "b", "La14/a0;", "c", "Lpx/d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e downloadImageUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: ae3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lae3/d$a;", "Lgz/b$a;", "Lsv0/p0;", "initialConfiguration", "", "Lsv0/r0;", "files", "<init>", "(Lsv0/p0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/p0;", "b", "()Lsv0/p0;", "Ljava/util/List;", "()Ljava/util/List;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Download initialConfiguration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<VehicleCollisionFileToDownload> files;

        public Params(Download download, List<VehicleCollisionFileToDownload> list) {
            this.initialConfiguration = download;
            this.files = list;
        }

        public final List<VehicleCollisionFileToDownload> a() {
            return this.files;
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
            return fr.t.c(this.initialConfiguration, params.initialConfiguration) && fr.t.c(this.files, params.files);
        }

        public int hashCode() {
            return (this.initialConfiguration.hashCode() * 31) + this.files.hashCode();
        }

        public String toString() {
            return "Params(initialConfiguration=" + this.initialConfiguration + ", files=" + this.files + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5695h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5696j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5697k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5698l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5699m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5700n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f5701p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5702q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5703r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5704s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5705t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f5706v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f5707w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f5708x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f5709y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f5710z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    public d(e eVar, a14.a0 a0Var, px.d dVar) {
        this.downloadImageUC = eVar;
        this.saveFilesOnDeviceUseCase = a0Var;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0122 A[Catch: Exception -> 0x02d2, c -> 0x02d5, CancellationException -> 0x02d8, TRY_LEAVE, TryCatch #12 {c -> 0x02d5, CancellationException -> 0x02d8, Exception -> 0x02d2, blocks: (B:35:0x011c, B:37:0x0122), top: B:146:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0175  */
    /* JADX WARN: Code duplicated, block: B:41:0x0178  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a4 A[Catch: Exception -> 0x026f, c -> 0x0274, CancellationException -> 0x0279, TryCatch #13 {c -> 0x0274, CancellationException -> 0x0279, Exception -> 0x026f, blocks: (B:55:0x0233, B:57:0x0239, B:42:0x0188, B:46:0x01a4, B:48:0x01a8, B:51:0x01b9), top: B:144:0x0233 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a8 A[Catch: Exception -> 0x026f, c -> 0x0274, CancellationException -> 0x0279, TRY_LEAVE, TryCatch #13 {c -> 0x0274, CancellationException -> 0x0279, Exception -> 0x026f, blocks: (B:55:0x0233, B:57:0x0239, B:42:0x0188, B:46:0x01a4, B:48:0x01a8, B:51:0x01b9), top: B:144:0x0233 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x022e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0239 A[Catch: Exception -> 0x026f, c -> 0x0274, CancellationException -> 0x0279, TRY_LEAVE, TryCatch #13 {c -> 0x0274, CancellationException -> 0x0279, Exception -> 0x026f, blocks: (B:55:0x0233, B:57:0x0239, B:42:0x0188, B:46:0x01a4, B:48:0x01a8, B:51:0x01b9), top: B:144:0x0233 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0252 A[Catch: Exception -> 0x0255, c -> 0x0258, CancellationException -> 0x025b, TryCatch #20 {Exception -> 0x0255, blocks: (B:59:0x0246, B:61:0x0252, B:70:0x0261, B:72:0x0267, B:117:0x02e5, B:120:0x02f3, B:97:0x02bd, B:98:0x02c2), top: B:135:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x025e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0261 A[Catch: Exception -> 0x0255, c -> 0x0258, CancellationException -> 0x025b, TryCatch #20 {Exception -> 0x0255, blocks: (B:59:0x0246, B:61:0x0252, B:70:0x0261, B:72:0x0267, B:117:0x02e5, B:120:0x02f3, B:97:0x02bd, B:98:0x02c2), top: B:135:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0266  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x027e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0192 -> B:45:0x019f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x022e -> B:144:0x0233). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(ae3.d.Params r27, tq.e<? super dx.i<? extends dx.b, oq.i0>> r28) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.d.d(ae3.d$a, tq.e):java.lang.Object");
    }
}
