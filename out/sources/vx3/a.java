package vx3;

import dx.i;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import ur0.BEAlias;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lvx3/a;", "Lgz/b;", "Lgz/b$a$a;", "Ldx/i;", "Ldx/b;", "Ltx3/a;", "Lbs0/a;", "getAliasesUseCase", "<init>", "(Lbs0/a;)V", "", "Lur0/a;", "aliases", "d", "(Ljava/util/List;)Ltx3/a;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lbs0/a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<gz.b.a.C1792a, i<? extends dx.b, ? extends tx3.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bs0.a getAliasesUseCase;

    /* JADX INFO: renamed from: vx3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5484a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f208654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f208655e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f208657g;

        C5484a(e<? super C5484a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f208655e = obj;
            this.f208657g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(bs0.a aVar) {
        this.getAliasesUseCase = aVar;
    }

    private final tx3.a d(List<BEAlias> aliases) {
        return aliases.isEmpty() ? tx3.a.C5038a.f192591a : new tx3.a.OneClickAliasesList(aliases);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, ? extends tx3.a>> eVar) throws Throwable {
        C5484a c5484a;
        if (eVar instanceof C5484a) {
            c5484a = (C5484a) eVar;
            int i15 = c5484a.f208657g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5484a.f208657g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5484a = new C5484a(eVar);
            }
        } else {
            c5484a = new C5484a(eVar);
        }
        Object objC = c5484a.f208655e;
        Object objE = uq.b.e();
        int i16 = c5484a.f208657g;
        if (i16 == 0) {
            u.b(objC);
            bs0.a aVar = this.getAliasesUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            c5484a.f208654d = j.a(c1792a);
            c5484a.f208657g = 1;
            objC = aVar.c(c1792a2, c5484a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(d((List) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
