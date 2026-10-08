package wb4;

import fr.t;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwb4/g;", "Lqb4/g;", "Lqb4/c;", "checkBiometricRequirementsUseCase", "Lqb4/e;", "deactivateBiometricUseCase", "Lpx/d;", "remoteLogger", "Lqb4/f;", "getBiometricInAppStatusUseCase", "<init>", "(Lqb4/c;Lqb4/e;Lpx/d;Lqb4/f;)V", "Lqb4/g$a;", "params", "Ldx/i;", "Ldx/b;", "Lpb4/e;", "d", "(Lqb4/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lqb4/c;", "b", "Lqb4/e;", "c", "Lpx/d;", "Lqb4/f;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements qb4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qb4.c checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qb4.e deactivateBiometricUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qb4.f getBiometricInAppStatusUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f212002a;

        static {
            int[] iArr = new int[pb4.d.values().length];
            try {
                iArr[pb4.d.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pb4.d.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f212002a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f212007h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f212008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f212009k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f212011m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212009k = obj;
            this.f212011m |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(qb4.c cVar, qb4.e eVar, px.d dVar, qb4.f fVar) {
        this.checkBiometricRequirementsUseCase = cVar;
        this.deactivateBiometricUseCase = eVar;
        this.remoteLogger = dVar;
        this.getBiometricInAppStatusUseCase = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0131  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(qb4.g.Params params, tq.e<? super dx.i<? extends dx.b, ? extends pb4.e>> eVar) throws Throwable {
        b bVar;
        qb4.g.Params params2;
        pb4.d dVar;
        dx.i iVar;
        int i15;
        Object obj;
        dx.b bVar2;
        qb4.e eVar2;
        gz.b.a.C1792a c1792a;
        dx.b bVar3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i16 = bVar.f212011m;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f212011m = i16 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f212009k;
        Object objE = uq.b.e();
        int i17 = bVar.f212011m;
        boolean z15 = false;
        if (i17 == 0) {
            u.b(objC);
            qb4.f fVar = this.getBiometricInAppStatusUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            bVar.f212003d = params;
            bVar.f212011m = 1;
            objC = fVar.c(c1792a2, bVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i17 == 1) {
            params = (qb4.g.Params) bVar.f212003d;
            u.b(objC);
        } else {
            if (i17 == 2) {
                dVar = (pb4.d) bVar.f212004e;
                params2 = (qb4.g.Params) bVar.f212003d;
                u.b(objC);
                iVar = (dx.i) objC;
                if (iVar instanceof dx.i.Left) {
                    if (iVar instanceof dx.i.Right) {
                        throw new p();
                    }
                    i15 = a.f212002a[dVar.ordinal()];
                    if (i15 != 1) {
                        obj = pb4.e.b.f154093a;
                    } else {
                        if (i15 == 2) {
                            throw new p();
                        }
                        obj = pb4.e.a.C3815a.f154090a;
                    }
                    return new dx.i.Right(obj);
                }
                bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                if (a.f212002a[dVar.ordinal()] == 1) {
                    eVar2 = this.deactivateBiometricUseCase;
                    c1792a = gz.b.a.C1792a.f78542a;
                    bVar.f212003d = j.a(params2);
                    bVar.f212004e = j.a(dVar);
                    bVar.f212005f = j.a(iVar);
                    bVar.f212006g = bVar2;
                    bVar.f212007h = 0;
                    bVar.f212008j = 0;
                    bVar.f212011m = 3;
                    if (eVar2.c(c1792a, bVar) != objE) {
                        bVar3 = bVar2;
                    }
                    return objE;
                }
                if (!(bVar2 instanceof dx.b.InterfaceC1027b.a) || t.c(bVar2, dx.b.j.a.f45086a)) {
                    return new dx.i.Right(new pb4.e.a.System(z15, bVar2));
                }
                px.b.y5(this.remoteLogger, "Biometric requirements error: " + bVar2, null, px.c.a(this), 2, null);
                return new dx.i.Left(bVar2);
            }
            if (i17 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar3 = (dx.b) bVar.f212006g;
            u.b(objC);
        }
        bVar2 = bVar3;
        z15 = true;
        if (bVar2 instanceof dx.b.InterfaceC1027b.a) {
        }
        return new dx.i.Right(new pb4.e.a.System(z15, bVar2));
        pb4.d dVar2 = (pb4.d) objC;
        qb4.c cVar = this.checkBiometricRequirementsUseCase;
        qb4.c.Params params3 = new qb4.c.Params(params.getCheckBiometricKeyGeneration(), dVar2 == pb4.d.ENABLED);
        bVar.f212003d = j.a(params);
        bVar.f212004e = dVar2;
        bVar.f212011m = 2;
        Object objC2 = cVar.c(params3, bVar);
        if (objC2 != objE) {
            params2 = params;
            dVar = dVar2;
            objC = objC2;
            iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                if (iVar instanceof dx.i.Right) {
                    throw new p();
                }
                i15 = a.f212002a[dVar.ordinal()];
                if (i15 != 1) {
                    obj = pb4.e.b.f154093a;
                } else {
                    if (i15 == 2) {
                        throw new p();
                    }
                    obj = pb4.e.a.C3815a.f154090a;
                }
                return new dx.i.Right(obj);
            }
            bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            if (a.f212002a[dVar.ordinal()] == 1) {
                eVar2 = this.deactivateBiometricUseCase;
                c1792a = gz.b.a.C1792a.f78542a;
                bVar.f212003d = j.a(params2);
                bVar.f212004e = j.a(dVar);
                bVar.f212005f = j.a(iVar);
                bVar.f212006g = bVar2;
                bVar.f212007h = 0;
                bVar.f212008j = 0;
                bVar.f212011m = 3;
                if (eVar2.c(c1792a, bVar) != objE) {
                    bVar3 = bVar2;
                    bVar2 = bVar3;
                    z15 = true;
                }
            }
            if (bVar2 instanceof dx.b.InterfaceC1027b.a) {
            }
            return new dx.i.Right(new pb4.e.a.System(z15, bVar2));
        }
        return objE;
    }
}
