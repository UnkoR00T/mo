package sc4;

import fk0.BECompanyRepresentatives;
import fk0.BERepresentativeRemovalStatement;
import hk0.c0;
import hk0.u;
import hk0.w;
import ma1.CompanyRepresentativesResponse;
import ma1.RepresentativeRemovalStatementResponse;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0011\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0010J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsc4/e;", "Lla1/b;", "Lhk0/c0;", "modifyRepresentativeUC", "Lhk0/w;", "getRepresentativesUC", "Lhk0/u;", "getRepresentativeRemovalStatementUC", "<init>", "(Lhk0/c0;Lhk0/w;Lhk0/u;)V", "", "cmsSignedData", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "entryId", "Lma1/o;", "b", "representativeId", "Lma1/t;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lhk0/c0;", "Lhk0/w;", "Lhk0/u;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements la1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 modifyRepresentativeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w getRepresentativesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u getRepresentativeRemovalStatementUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180203f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f180205h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180203f = obj;
            this.f180205h |= PKIFailureInfo.systemUnavail;
            return e.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180207e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180209g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180207e = obj;
            this.f180209g |= PKIFailureInfo.systemUnavail;
            return e.this.b(null, this);
        }
    }

    public e(c0 c0Var, w wVar, u uVar) {
        this.modifyRepresentativeUC = c0Var;
        this.getRepresentativesUC = wVar;
        this.getRepresentativeRemovalStatementUC = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.b
    public Object a(String str, String str2, tq.e<? super dx.i<? extends dx.b, RepresentativeRemovalStatementResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f180205h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f180205h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f180203f;
        Object objE = uq.b.e();
        int i16 = aVar.f180205h;
        if (i16 == 0) {
            oq.u.b(objC);
            u uVar = this.getRepresentativeRemovalStatementUC;
            u.Params params = new u.Params(str, str2);
            aVar.f180201d = j.a(str);
            aVar.f180202e = j.a(str2);
            aVar.f180205h = 1;
            objC = uVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(f.e((BERepresentativeRemovalStatement) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, CompanyRepresentativesResponse>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f180209g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f180209g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f180207e;
        Object objE = uq.b.e();
        int i16 = bVar.f180209g;
        if (i16 == 0) {
            oq.u.b(objC);
            w wVar = this.getRepresentativesUC;
            w.Params params = new w.Params(str);
            bVar.f180206d = j.a(str);
            bVar.f180209g = 1;
            objC = wVar.c(params, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(f.d((BECompanyRepresentatives) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // la1.b
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.modifyRepresentativeUC.c(new c0.Params(str), eVar);
    }
}
