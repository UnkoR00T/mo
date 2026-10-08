package ly0;

import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lly0/i;", "", "Lgz/b$a$a;", "Loq/i0;", "Lky0/a;", "legacyRepository", "Llh0/a;", "addFavouritePointUC", "<init>", "(Lky0/a;Llh0/a;)V", "Ldx/b;", "Ljb4/f;", "d", "(Ldx/b;)Ljb4/f;", "params", "Ldx/i;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lky0/a;", "b", "Llh0/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ky0.a legacyRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lh0.a addFavouritePointUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f121431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121432g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121434j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121432g = obj;
            this.f121434j |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, this);
        }
    }

    public i(ky0.a aVar, lh0.a aVar2) {
        this.legacyRepository = aVar;
        this.addFavouritePointUC = aVar2;
    }

    private final PayloadErrorData d(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r7, tq.e<? super dx.i<? extends dx.b, oq.i0>> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly0.i.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
