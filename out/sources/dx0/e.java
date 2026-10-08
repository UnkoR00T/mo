package dx0;

import iy.b0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import th0.AppActivationChallengeWithBeKeys;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldx0/e;", "Ldx0/d;", "Lax0/b;", "extractSamlArtUseCase", "Luh0/j;", "generateWkAppActivationChallengeUC", "Lpx/d;", "remoteLogger", "<init>", "(Lax0/b;Luh0/j;Lpx/d;)V", "Ldx0/d$a;", "params", "Ldx/i;", "Ldx/b;", "Lth0/b;", "d", "(Ldx0/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lax0/b;", "b", "Luh0/j;", "c", "Lpx/d;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ax0.b extractSamlArtUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uh0.j generateWkAppActivationChallengeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45142h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45143j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f45144k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f45145l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f45146m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45147n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f45148p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f45149q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f45151s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45149q = obj;
            this.f45151s |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(ax0.b bVar, uh0.j jVar, px.d dVar) {
        this.extractSamlArtUseCase = bVar;
        this.generateWkAppActivationChallengeUC = jVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(d.Params params, tq.e<? super dx.i<? extends dx.b, AppActivationChallengeWithBeKeys>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        int i16;
        d.Params params2;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar2;
        int i18;
        int i19;
        ex.b bVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f45151s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f45151s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f45149q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f45151s;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    ax0.b bVar4 = this.extractSamlArtUseCase;
                    ax0.b.Params params3 = new ax0.b.Params(params.getSamlArtHtmlContent());
                    aVar.f45138d = vq.j.a(params);
                    aVar.f45139e = jVarA;
                    aVar.f45140f = vq.j.a(aVar2);
                    aVar.f45141g = aVar2;
                    aVar.f45142h = aVar2;
                    i17 = 0;
                    aVar.f45144k = 0;
                    aVar.f45145l = 0;
                    aVar.f45146m = 0;
                    aVar.f45147n = 0;
                    aVar.f45148p = 0;
                    aVar.f45151s = 1;
                    objC = bVar4.c(params3, aVar);
                    if (objC != objE) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        i18 = 0;
                        bVar2 = aVar2;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f45148p;
                        i15 = aVar.f45147n;
                        i16 = aVar.f45146m;
                        int i27 = aVar.f45145l;
                        int i28 = aVar.f45144k;
                        ex.b bVar5 = (ex.b) aVar.f45142h;
                        ex.b bVar6 = (ex.b) aVar.f45141g;
                        ex.b bVar7 = (ex.b) aVar.f45140f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f45139e;
                        params2 = (d.Params) aVar.f45138d;
                        try {
                            u.b(objC);
                            i17 = i26;
                            jVarA = jVar;
                            bVar = bVar7;
                            bVar2 = bVar5;
                            aVar2 = bVar6;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) aVar.f45142h;
                        u.b(objC);
                    }
                    return new dx.i.Right((AppActivationChallengeWithBeKeys) bVar3.a((dx.i) objC));
                } catch (CancellationException e18) {
                    throw e18;
                }
                dx.i iVar = (dx.i) objC;
                if (iVar instanceof dx.i.Left) {
                    this.remoteLogger.F8("AsyncGenerateCertActivationChallengeUC: wrong samlArt", px.d.a.ERROR);
                }
                b0 b0Var = (b0) bVar2.a(iVar);
                uh0.j jVar2 = this.generateWkAppActivationChallengeUC;
                uh0.j.Params params4 = new uh0.j.Params(b0Var);
                aVar.f45138d = vq.j.a(params2);
                aVar.f45139e = jVarA;
                aVar.f45140f = vq.j.a(bVar);
                aVar.f45141g = vq.j.a(aVar2);
                aVar.f45142h = aVar2;
                aVar.f45143j = vq.j.a(b0Var);
                aVar.f45144k = i18;
                aVar.f45145l = i19;
                aVar.f45146m = i16;
                aVar.f45147n = i15;
                aVar.f45148p = i17;
                aVar.f45151s = 2;
                objC = jVar2.c(params4, aVar);
                if (objC != objE) {
                    bVar3 = aVar2;
                    return new dx.i.Right((AppActivationChallengeWithBeKeys) bVar3.a((dx.i) objC));
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
