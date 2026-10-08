package o14;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lo14/b;", "Lo14/a;", "Ls10/a;", "fileRegistry", "Laz/f;", "fileManager", "<init>", "(Ls10/a;Laz/f;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls10/a;", "b", "Laz/f;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s10.a fileRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f140556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f140557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f140558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f140559h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f140560j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f140561k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f140562l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f140563m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f140564n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f140565p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f140566q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f140567r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f140568s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f140569t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f140570v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f140572x;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140570v = obj;
            this.f140572x |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(s10.a aVar, az.f fVar) {
        this.fileRegistry = aVar;
        this.fileManager = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011f A[Catch: Exception -> 0x017c, c -> 0x017f, CancellationException -> 0x0182, TryCatch #7 {c -> 0x017f, CancellationException -> 0x0182, Exception -> 0x017c, blocks: (B:48:0x0119, B:50:0x011f, B:61:0x0185, B:47:0x0109, B:43:0x00d0), top: B:92:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0176 -> B:54:0x017a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r21, tq.e<? super dx.i<? extends dx.b, oq.i0>> r22) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o14.b.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
