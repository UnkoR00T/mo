package bd4;

import dx.j;
import g04.i;
import g04.k;
import g04.m;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lbd4/a;", "Lz64/a;", "Lc54/b;", "isFeatureEnabledUseCase", "Lg04/k;", "getHashedPinUC", "Lg04/m;", "hashPinUseCase", "Lg04/i;", "deactivateBiometricUseCase", "<init>", "(Lc54/b;Lg04/k;Lg04/m;Lg04/i;)V", "Ldx/i;", "Ldx/b;", "Liy/b0;", "a", "(Ltq/e;)Ljava/lang/Object;", "pin", "c", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "Lc54/b;", "Lg04/k;", "Lg04/m;", "d", "Lg04/i;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements z64.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k getHashedPinUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m hashPinUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i deactivateBiometricUseCase;

    /* JADX INFO: renamed from: bd4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0469a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f18552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f18553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f18554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f18555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f18556m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18558p;

        C0469a(tq.e<? super C0469a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f18556m = obj;
            this.f18558p |= PKIFailureInfo.systemUnavail;
            return a.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f18563h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f18564j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f18565k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f18566l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f18567m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f18568n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18570q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f18568n = obj;
            this.f18570q |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f18571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f18572e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18574g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f18572e = obj;
            this.f18574g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(c54.b bVar, k kVar, m mVar, i iVar) {
        this.isFeatureEnabledUseCase = bVar;
        this.getHashedPinUC = kVar;
        this.hashPinUseCase = mVar;
        this.deactivateBiometricUseCase = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bd4.a$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // z64.a
    public Object a(tq.e<? super dx.i<? extends dx.b, b0>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        ex.b bVar2;
        if (eVar instanceof b) {
            b bVar3 = (b) eVar;
            int i15 = bVar3.f18570q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar3.f18570q = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar3;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f18568n;
        Object objE = uq.b.e();
        int i16 = bVar.f18570q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        if (!this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                            aVar.b(new dx.b.Generic(new UnsupportedOperationException("Feature flag is not active")));
                            throw new g();
                        }
                        k kVar = this.getHashedPinUC;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        bVar.f18564j = jVarA;
                        bVar.f18565k = vq.j.a(aVar);
                        bVar.f18566l = vq.j.a(aVar);
                        bVar.f18567m = aVar;
                        bVar.f18559d = 0;
                        bVar.f18560e = 0;
                        bVar.f18561f = 0;
                        bVar.f18562g = 0;
                        bVar.f18563h = 0;
                        bVar.f18570q = 1;
                        Object objC = kVar.c(c1792a, bVar);
                        if (objC == objE) {
                            return objE;
                        }
                        obj = objC;
                        bVar2 = aVar;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        bVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        dx.i iVarA = bVar.a(e);
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
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f18567m;
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((b0) bVar2.a((dx.i) obj));
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bd4.a$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // z64.a
    public Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? c0469a;
        Object objB;
        ex.c e15;
        if (eVar instanceof C0469a) {
            C0469a c0469a2 = (C0469a) eVar;
            int i15 = c0469a2.f18558p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0469a2.f18558p = i15 - PKIFailureInfo.systemUnavail;
                c0469a = c0469a2;
            } else {
                c0469a = new C0469a(eVar);
            }
        } else {
            c0469a = new C0469a(eVar);
        }
        Object obj = c0469a.f18556m;
        Object objE = uq.b.e();
        int i16 = c0469a.f18558p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        i iVar = this.deactivateBiometricUseCase;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        c0469a.f18553j = jVarA;
                        c0469a.f18554k = vq.j.a(aVar);
                        c0469a.f18555l = vq.j.a(aVar);
                        c0469a.f18548d = 0;
                        c0469a.f18549e = 0;
                        c0469a.f18550f = 0;
                        c0469a.f18551g = 0;
                        c0469a.f18552h = 0;
                        c0469a.f18558p = 1;
                        if (iVar.c(c1792a, c0469a) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        c0469a = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(c0469a));
                        dx.i iVarA = c0469a.a(e);
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
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z64.a
    public Object c(b0 b0Var, tq.e<? super dx.i<? extends dx.b, b0>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f18574g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f18574g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f18572e;
        Object objE = uq.b.e();
        int i16 = cVar.f18574g;
        if (i16 == 0) {
            u.b(objC);
            m mVar = this.hashPinUseCase;
            cVar.f18571d = vq.j.a(b0Var);
            cVar.f18574g = 1;
            objC = mVar.c(b0Var, cVar);
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(c0.g((String) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
