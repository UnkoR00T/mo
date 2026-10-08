package t14;

import a14.w;
import fr.t;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lt14/j;", "La14/w;", "Lmx/c;", "labelProvider", "La24/w;", "isNetworkUrlUseCase", "Lkx/d;", "intentActionManager", "Lpx/d;", "remoteLogger", "<init>", "(Lmx/c;La24/w;Lkx/d;Lpx/d;)V", "La14/w$b;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "d", "(La14/w$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "La24/w;", "c", "Lkx/d;", "Lpx/d;", "e", "Ldx/b$c;", "defaultError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a24.w isNetworkUrlUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f187098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f187099e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f187101g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f187099e = obj;
            this.f187101g |= PKIFailureInfo.systemUnavail;
            return j.this.c(null, this);
        }
    }

    public j(mx.c cVar, a24.w wVar, kx.d dVar, px.d dVar2) {
        this.labelProvider = cVar;
        this.isNetworkUrlUseCase = wVar;
        this.intentActionManager = dVar;
        this.remoteLogger = dVar2;
        this.defaultError = new dx.b.Business(w.a.GENERIC, null, cVar.c(s04.b.f177239r0), cVar.c(s04.b.V0), null, cVar.c(s04.b.f177233p0), null, 82, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(w.Params params, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        a aVar;
        kx.f fVarA;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f187101g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f187101g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f187099e;
        Object objE = uq.b.e();
        int i16 = aVar.f187101g;
        if (i16 == 0) {
            u.b(objD);
            if (params.getIsNetworkUrl()) {
                a24.w wVar = this.isNetworkUrlUseCase;
                a24.w.Params params2 = new a24.w.Params(params.getUrl());
                aVar.f187098d = params;
                aVar.f187101g = 1;
                objD = wVar.d(params2, aVar);
                if (objD == objE) {
                    return objE;
                }
            }
            fVarA = this.intentActionManager.a(new kx.a.OpenUrl(params.getUrl()));
            if (t.c(fVarA, kx.f.a.f112942a)) {
                return new dx.i.Left(this.defaultError);
            }
            if (t.c(fVarA, kx.f.b.f112943a)) {
                return new dx.i.Left(dx.b.Business.b(this.defaultError, w.a.SERVICE_NOT_FOUND, null, null, this.labelProvider.c(s04.b.I0), null, null, null, 118, null));
            }
            if (t.c(fVarA, kx.f.c.f112944a)) {
                return new dx.i.Right(i0.f148189a);
            }
            throw new p();
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        params = (w.Params) aVar.f187098d;
        u.b(objD);
        hz.g gVar = (hz.g) objD;
        if (gVar instanceof hz.g.Invalid) {
            this.remoteLogger.F8("OpenUrlIntentUC: (" + params.getUrl() + ") is not valid", px.d.a.ERROR);
            return new dx.i.Left(dx.b.Business.b(this.defaultError, null, null, null, ((hz.g.Invalid) gVar).b().getErrorMessage(), null, null, null, 119, null));
        }
        fVarA = this.intentActionManager.a(new kx.a.OpenUrl(params.getUrl()));
        if (t.c(fVarA, kx.f.a.f112942a)) {
            return new dx.i.Left(this.defaultError);
        }
        if (t.c(fVarA, kx.f.b.f112943a)) {
            return new dx.i.Left(dx.b.Business.b(this.defaultError, w.a.SERVICE_NOT_FOUND, null, null, this.labelProvider.c(s04.b.I0), null, null, null, 118, null));
        }
        if (t.c(fVarA, kx.f.c.f112944a)) {
            return new dx.i.Right(i0.f148189a);
        }
        throw new p();
    }
}
