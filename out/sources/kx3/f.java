package kx3;

import eo0.OwTokens;
import eo0.x;
import go0.d0;
import iy.b0;
import java.time.Instant;
import k54.i;
import k54.k;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lkx3/f;", "", "Lgz/b$a$a;", "Loq/i0;", "Lk54/e;", "getKeycloakRefreshTokenUseCase", "Lgo0/d0;", "refreshOwTokensUseCase", "Lk54/f;", "getUserEdorAddressUC", "Lk54/k;", "saveKeycloakRefreshTokenUseCase", "Lk54/i;", "saveKeycloakAccessTokenUseCase", "<init>", "(Lk54/e;Lgo0/d0;Lk54/f;Lk54/k;Lk54/i;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lk54/e;", "b", "Lgo0/d0;", "c", "Lk54/f;", "d", "Lk54/k;", "e", "Lk54/i;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k54.e getKeycloakRefreshTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 refreshOwTokensUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k54.f getUserEdorAddressUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k saveKeycloakRefreshTokenUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i saveKeycloakAccessTokenUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f113105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f113106h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f113108k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113106h = obj;
            this.f113108k |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, this);
        }
    }

    public f(k54.e eVar, d0 d0Var, k54.f fVar, k kVar, i iVar) {
        this.getKeycloakRefreshTokenUseCase = eVar;
        this.refreshOwTokensUseCase = d0Var;
        this.getUserEdorAddressUC = fVar;
        this.saveKeycloakRefreshTokenUseCase = kVar;
        this.saveKeycloakAccessTokenUseCase = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        a aVar;
        gz.b.a.C1792a c1792a2;
        i54.b.Refresh refresh;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f113108k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f113108k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f113106h;
        Object objE = uq.b.e();
        int i16 = aVar.f113108k;
        if (i16 == 0) {
            u.b(objC);
            k54.e eVar2 = this.getKeycloakRefreshTokenUseCase;
            gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
            aVar.f113102d = j.a(c1792a);
            aVar.f113108k = 1;
            objC = eVar2.c(c1792a3, aVar);
            if (objC != objE) {
                c1792a2 = c1792a;
            }
            return objE;
        }
        if (i16 == 1) {
            c1792a2 = (gz.b.a.C1792a) aVar.f113102d;
            u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            refresh = (i54.b.Refresh) aVar.f113103e;
            u.b(objC);
        }
        iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            throw new p();
        }
        OwTokens owTokens = (OwTokens) ((dx.i.Right) iVar).b();
        this.saveKeycloakAccessTokenUseCase.a(new i.Params(new i54.b.Access(owTokens.getAccess().getValue(), Instant.ofEpochSecond(owTokens.getAccess().getExpirationTime()))));
        OwTokens.Refresh refresh2 = owTokens.getRefresh();
        this.saveKeycloakRefreshTokenUseCase.a(new k.Params(new i54.b.Refresh(refresh.getRefreshOwTokenUrl(), refresh2.getValue(), Instant.ofEpochSecond(refresh2.getExpirationTime()))));
        return new dx.i.Right(i0.f148189a);
        i54.b.Refresh refresh3 = (i54.b.Refresh) objC;
        if (refresh3 == null) {
            return new dx.i.Left(new dx.b.Generic(null, 1, null));
        }
        b0 b0VarA = this.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
        d0 d0Var = this.refreshOwTokensUseCase;
        d0.Params params = new d0.Params(refresh3.getRefreshOwTokenUrl(), x.a(b0VarA), new OwTokens.Refresh(refresh3.getValue(), refresh3.getExpiration().getEpochSecond()), null);
        aVar.f113102d = j.a(c1792a2);
        aVar.f113103e = refresh3;
        aVar.f113104f = j.a(b0VarA);
        aVar.f113105g = 0;
        aVar.f113108k = 2;
        Object objC2 = d0Var.c(params, aVar);
        if (objC2 != objE) {
            refresh = refresh3;
            objC = objC2;
            iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                throw new p();
            }
            OwTokens owTokens2 = (OwTokens) ((dx.i.Right) iVar).b();
            this.saveKeycloakAccessTokenUseCase.a(new i.Params(new i54.b.Access(owTokens2.getAccess().getValue(), Instant.ofEpochSecond(owTokens2.getAccess().getExpirationTime()))));
            OwTokens.Refresh refresh4 = owTokens2.getRefresh();
            this.saveKeycloakRefreshTokenUseCase.a(new k.Params(new i54.b.Refresh(refresh.getRefreshOwTokenUrl(), refresh4.getValue(), Instant.ofEpochSecond(refresh4.getExpirationTime()))));
            return new dx.i.Right(i0.f148189a);
        }
        return objE;
    }
}
