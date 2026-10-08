package ka2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lka2/a;", "Lz92/a;", "Lja2/a;", "repository", "Lmx/c;", "labelProvider", "Lha2/a;", "historyDocumentsInteractor", "<init>", "(Lja2/a;Lmx/c;Lha2/a;)V", "Lgz/b$a$a;", "params", "", "Ly92/c;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lja2/a;", "b", "Lmx/c;", "c", "Lha2/a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements z92.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ja2.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ha2.a historyDocumentsInteractor;

    /* JADX INFO: renamed from: ka2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2610a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f109339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f109340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f109341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f109342g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f109343h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f109344j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f109345k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f109346l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f109347m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109348n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f109349p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f109350q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f109352s;

        C2610a(tq.e<? super C2610a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f109350q = obj;
            this.f109352s |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(ja2.a aVar, mx.c cVar, ha2.a aVar2) {
        this.repository = aVar;
        this.labelProvider = cVar;
        this.historyDocumentsInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0124 -> B:43:0x0125). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r18, tq.e<? super java.util.List<y92.InstitutionHistoryModel>> r19) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka2.a.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
