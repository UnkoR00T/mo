package s02;

import eo0.OwTokens;
import mx.Label;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Ls02/c;", "", "Lgz/b$a$a;", "Leo0/i0$c;", "Lj02/b;", "dataSource", "Ls02/f;", "isOwTokenExpiredUC", "Lmx/c;", "labelProvider", "<init>", "(Lj02/b;Ls02/f;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lj02/b;", "b", "Ls02/f;", "Ldx/b$c;", "c", "Ldx/b$c;", "tokenNotProvidedError", "d", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f177086e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dx.b.Business f177087f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j02.b dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f isOwTokenExpiredUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business tokenNotProvidedError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f177093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f177094g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f177096j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177094g = obj;
            this.f177096j |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    static {
        n02.a aVar = n02.a.REFRESH_TOKEN_EXPIRED;
        Label.Companion companion = Label.INSTANCE;
        f177087f = new dx.b.Business(aVar, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    public c(j02.b bVar, f fVar, mx.c cVar) {
        this.dataSource = bVar;
        this.isOwTokenExpiredUC = fVar;
        this.tokenNotProvidedError = new dx.b.Business(n02.a.OW_TOKEN_NOT_PROVIDED, null, cVar.c(e02.a.f46611t0), null, null, cVar.c(e02.a.f46550j), null, 90, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, OwTokens.Refresh>> eVar) throws Throwable {
        b bVar;
        OwTokens.Refresh refresh;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f177096j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f177096j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objT = bVar.f177094g;
        Object objE = uq.b.e();
        int i16 = bVar.f177096j;
        if (i16 == 0) {
            u.b(objT);
            j02.b bVar2 = this.dataSource;
            bVar.f177091d = vq.j.a(c1792a);
            bVar.f177096j = 1;
            objT = bVar2.t(bVar);
            if (objT != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c1792a = (gz.b.a.C1792a) bVar.f177091d;
            u.b(objT);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            refresh = (OwTokens.Refresh) bVar.f177092e;
            u.b(objT);
        }
        return ((Boolean) objT).booleanValue() ? new dx.i.Left(f177087f) : new dx.i.Right(refresh);
        OwTokens.Refresh refresh2 = (OwTokens.Refresh) objT;
        if (refresh2 == null) {
            return new dx.i.Left(this.tokenNotProvidedError);
        }
        f fVar = this.isOwTokenExpiredUC;
        f.Params params = new f.Params(refresh2);
        bVar.f177091d = vq.j.a(c1792a);
        bVar.f177092e = refresh2;
        bVar.f177093f = 0;
        bVar.f177096j = 2;
        Object objD = fVar.d(params, bVar);
        if (objD != objE) {
            objT = objD;
            refresh = refresh2;
            if (((Boolean) objT).booleanValue()) {
            }
        }
        return objE;
    }
}
