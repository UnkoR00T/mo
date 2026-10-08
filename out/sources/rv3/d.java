package rv3;

import j44.Refresh;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ov3.OwTokens;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0013\u001a\u00020\u0003*\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lrv3/d;", "Lgz/b;", "Lgz/b$a$a;", "", "Ll44/d;", "getOwRefreshTokenUC", "Lrv3/c;", "isOwTokenExpiredUC", "Ll44/e;", "getUserEdorAddressUC", "Lnv3/a;", "backendInteractor", "Ll44/g;", "saveOwAccessTokenUC", "Ll44/h;", "saveOwRefreshTokenUC", "<init>", "(Ll44/d;Lrv3/c;Ll44/e;Lnv3/a;Ll44/g;Ll44/h;)V", "Lj44/g;", "d", "(Lj44/g;Ltq/e;)Ljava/lang/Object;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ll44/d;", "b", "Lrv3/c;", "c", "Ll44/e;", "Lnv3/a;", "e", "Ll44/g;", "f", "Ll44/h;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.d getOwRefreshTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c isOwTokenExpiredUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nv3.a backendInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l44.g saveOwAccessTokenUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l44.h saveOwRefreshTokenUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f176511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f176512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f176513h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f176515k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176513h = obj;
            this.f176515k |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    public d(l44.d dVar, c cVar, l44.e eVar, nv3.a aVar, l44.g gVar, l44.h hVar) {
        this.getOwRefreshTokenUC = dVar;
        this.isOwTokenExpiredUC = cVar;
        this.getUserEdorAddressUC = eVar;
        this.backendInteractor = aVar;
        this.saveOwAccessTokenUC = gVar;
        this.saveOwRefreshTokenUC = hVar;
    }

    private final Object d(Refresh refresh, tq.e<? super Boolean> eVar) {
        return this.isOwTokenExpiredUC.d(new c.Params(new OwTokens.Refresh(refresh.getValue(), refresh.getExpiration())), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r14 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r13, tq.e<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.d.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
