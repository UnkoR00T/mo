package s02;

import eo0.OwTokens;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ls02/d;", "", "Lgz/b$a$a;", "Leo0/i0;", "Ls02/c;", "getOwRefreshTokenUseCase", "Ls02/b;", "getOwAccessTokenUseCase", "<init>", "(Ls02/c;Ls02/b;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls02/c;", "b", "Ls02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c getOwRefreshTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b getOwAccessTokenUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f177102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f177103h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f177104j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f177106l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177104j = obj;
            this.f177106l |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    public d(c cVar, b bVar) {
        this.getOwRefreshTokenUseCase = cVar;
        this.getOwAccessTokenUseCase = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar) throws Throwable {
        a aVar;
        OwTokens.Refresh refresh;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f177106l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f177106l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f177104j;
        Object objE = uq.b.e();
        int i16 = aVar.f177106l;
        if (i16 == 0) {
            u.b(objA);
            c cVar = this.getOwRefreshTokenUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f177099d = vq.j.a(c1792a);
            aVar.f177106l = 1;
            objA = cVar.a(c1792a2, aVar);
            if (objA != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c1792a = (gz.b.a.C1792a) aVar.f177099d;
            u.b(objA);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            refresh = (OwTokens.Refresh) aVar.f177101f;
            u.b(objA);
        }
        iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new OwTokens(refresh, (OwTokens.Access) ((dx.i.Right) iVar).b()));
        }
        throw new p();
        dx.i iVar2 = (dx.i) objA;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new p();
        }
        OwTokens.Refresh refresh2 = (OwTokens.Refresh) ((dx.i.Right) iVar2).b();
        b bVar = this.getOwAccessTokenUseCase;
        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
        aVar.f177099d = vq.j.a(c1792a);
        aVar.f177100e = vq.j.a(iVar2);
        aVar.f177101f = refresh2;
        aVar.f177102g = 0;
        aVar.f177103h = 0;
        aVar.f177106l = 2;
        objA = bVar.a(c1792a3, aVar);
        if (objA != objE) {
            refresh = refresh2;
            iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(new OwTokens(refresh, (OwTokens.Access) ((dx.i.Right) iVar).b()));
            }
            throw new p();
        }
        return objE;
    }
}
