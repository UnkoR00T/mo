package w24;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lw24/f;", "Lw24/e;", "Ls10/a;", "fileRegistry", "Ls24/b;", "containersInteractor", "Lpx/d;", "remoteLogger", "<init>", "(Ls10/a;Ls24/b;Lpx/d;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls10/a;", "b", "Ls24/b;", "c", "Lpx/d;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s10.a fileRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s24.b containersInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209579h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209580j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209581k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209582l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209583m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209584n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209585p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209586q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209587r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209588s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f209589t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f209590v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f209592x;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209590v = obj;
            this.f209592x |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(s10.a aVar, s24.b bVar, px.d dVar) {
        this.fileRegistry = aVar;
        this.containersInteractor = bVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x012f A[Catch: Exception -> 0x00c5, c -> 0x00c9, CancellationException -> 0x00cd, TryCatch #7 {c -> 0x00c9, CancellationException -> 0x00cd, Exception -> 0x00c5, blocks: (B:54:0x0183, B:48:0x0129, B:50:0x012f, B:55:0x01a5, B:34:0x00b8, B:47:0x0116), top: B:92:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x017b -> B:54:0x0183). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r20, tq.e<? super dx.i<? extends dx.b, oq.i0>> r21) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w24.f.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
