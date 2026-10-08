package u6;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lu6/k0;", "", "<init>", "()V", "Loq/i0;", "b", "(Ltq/e;)Ljava/lang/Object;", "a", "c", "Lsu/a;", "Lsu/a;", "runMutex", "Lju/x;", "Lju/x;", "didRun", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final su.a runMutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ju.x<oq.i0> didRun = ju.z.c(null, 1, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195560e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195562g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195560e = obj;
            this.f195562g |= PKIFailureInfo.systemUnavail;
            return k0.this.c(this);
        }
    }

    public final Object a(tq.e<? super oq.i0> eVar) {
        Object objI = this.didRun.I(eVar);
        return objI == uq.b.e() ? objI : oq.i0.f148189a;
    }

    protected abstract Object b(tq.e<? super oq.i0> eVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        su.a aVar2;
        su.a aVar3;
        Throwable th4;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f195562g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f195562g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f195560e;
        Object objE = uq.b.e();
        int i16 = aVar.f195562g;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                if (this.didRun.r()) {
                    return oq.i0.f148189a;
                }
                aVar2 = this.runMutex;
                aVar.f195559d = aVar2;
                aVar.f195562g = 1;
                if (aVar2.h(null, aVar) != objE) {
                }
                return objE;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (su.a) aVar.f195559d;
                try {
                    oq.u.b(obj);
                    ju.x<oq.i0> xVar = this.didRun;
                    oq.i0 i0Var = oq.i0.f148189a;
                    xVar.d0(i0Var);
                    aVar3.r(null);
                    return i0Var;
                } catch (Throwable th5) {
                    th4 = th5;
                    aVar3.r(null);
                    throw th4;
                }
            }
            su.a aVar4 = (su.a) aVar.f195559d;
            oq.u.b(obj);
            aVar2 = aVar4;
            if (this.didRun.r()) {
                oq.i0 i0Var2 = oq.i0.f148189a;
                aVar2.r(null);
                return i0Var2;
            }
            aVar.f195559d = aVar2;
            aVar.f195562g = 2;
            if (b(aVar) != objE) {
                aVar3 = aVar2;
                ju.x<oq.i0> xVar2 = this.didRun;
                oq.i0 i0Var3 = oq.i0.f148189a;
                xVar2.d0(i0Var3);
                aVar3.r(null);
                return i0Var3;
            }
            return objE;
        } catch (Throwable th6) {
            aVar3 = aVar2;
            th4 = th6;
            aVar3.r(null);
            throw th4;
        }
    }
}
