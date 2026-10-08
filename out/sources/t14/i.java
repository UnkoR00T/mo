package t14;

import a14.q;
import a14.v;
import fr.t;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lt14/i;", "La14/v;", "Lmx/c;", "labelProvider", "Lkx/d;", "intentActionManager", "La14/q;", "goToStoreIntentUseCase", "<init>", "(Lmx/c;Lkx/d;La14/q;)V", "La14/v$a;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "d", "(La14/v$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lkx/d;", "c", "La14/q;", "Ldx/b$c;", "defaultError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f187087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f187088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f187089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f187090g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f187092j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f187090g = obj;
            this.f187092j |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    public i(mx.c cVar, kx.d dVar, q qVar) {
        this.labelProvider = cVar;
        this.intentActionManager = dVar;
        this.goToStoreIntentUseCase = qVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(s04.b.f177239r0), cVar.c(s04.b.V0), null, cVar.c(s04.b.f177233p0), null, 83, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(v.Params params, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f187092j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f187092j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f187090g;
        Object objE = uq.b.e();
        int i16 = aVar.f187092j;
        if (i16 == 0) {
            u.b(objC);
            kx.f fVarA = this.intentActionManager.a(new kx.a.OpenUrl(params.getDeeplink()));
            if (t.c(fVarA, kx.f.a.f112942a)) {
                return new dx.i.Left(this.defaultError);
            }
            if (!t.c(fVarA, kx.f.b.f112943a)) {
                if (t.c(fVarA, kx.f.c.f112944a)) {
                    return new dx.i.Right(i0.f148189a);
                }
                throw new p();
            }
            q qVar = this.goToStoreIntentUseCase;
            q.Params params2 = new q.Params(params.getStorePackage());
            aVar.f187087d = vq.j.a(params);
            aVar.f187088e = vq.j.a(fVarA);
            aVar.f187089f = 0;
            aVar.f187092j = 1;
            objC = qVar.c(params2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left(dx.b.Business.b(this.defaultError, null, null, null, this.labelProvider.c(s04.b.I0), null, null, null, 119, null));
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(i0.f148189a);
    }
}
