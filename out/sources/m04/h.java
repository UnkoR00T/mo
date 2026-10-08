package m04;

import fr.t;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y00.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lm04/h;", "Lg04/h;", "Lg04/g;", "checkBiometricStatusUseCase", "Lv64/j;", "compareWithCurrentPasswordUseCase", "Lg04/l;", "getPasswordFromBiometricUseCase", "Lv64/i;", "comparePinWithCommonContainerUseCase", "Liy/c;", "bytesConverter", "Ly00/c0;", "securityExceptionParser", "Lpx/d;", "remoteLogger", "<init>", "(Lg04/g;Lv64/j;Lg04/l;Lv64/i;Liy/c;Ly00/c0;Lpx/d;)V", "Lg04/h$a;", "params", "Ldx/i;", "Ldx/b;", "Lg04/n;", "d", "(Lg04/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg04/g;", "b", "Lv64/j;", "c", "Lg04/l;", "Lv64/i;", "e", "Liy/c;", "f", "Ly00/c0;", "g", "Lpx/d;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements g04.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v64.j compareWithCurrentPasswordUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g04.l getPasswordFromBiometricUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v64.i comparePinWithCommonContainerUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f122240h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f122241j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f122242k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f122243l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122244m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122245n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f122246p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f122247q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f122248r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f122250t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122248r = obj;
            this.f122250t |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(g04.g gVar, v64.j jVar, g04.l lVar, v64.i iVar, iy.c cVar, c0 c0Var, px.d dVar) {
        this.checkBiometricStatusUseCase = gVar;
        this.compareWithCurrentPasswordUseCase = jVar;
        this.getPasswordFromBiometricUseCase = lVar;
        this.comparePinWithCommonContainerUseCase = iVar;
        this.bytesConverter = cVar;
        this.securityExceptionParser = c0Var;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:110:0x0304  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e3 A[Catch: Exception -> 0x00c3, c -> 0x00c7, CancellationException -> 0x00cb, TryCatch #7 {c -> 0x00c7, CancellationException -> 0x00cb, Exception -> 0x00c3, blocks: (B:67:0x01d4, B:69:0x01e3, B:72:0x01ed, B:71:0x01eb, B:73:0x01f6, B:74:0x01fb, B:35:0x00b7, B:63:0x0190), top: B:119:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb A[Catch: Exception -> 0x00c3, c -> 0x00c7, CancellationException -> 0x00cb, TryCatch #7 {c -> 0x00c7, CancellationException -> 0x00cb, Exception -> 0x00c3, blocks: (B:67:0x01d4, B:69:0x01e3, B:72:0x01ed, B:71:0x01eb, B:73:0x01f6, B:74:0x01fb, B:35:0x00b7, B:63:0x0190), top: B:119:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f6 A[Catch: Exception -> 0x00c3, c -> 0x00c7, CancellationException -> 0x00cb, TryCatch #7 {c -> 0x00c7, CancellationException -> 0x00cb, Exception -> 0x00c3, blocks: (B:67:0x01d4, B:69:0x01e3, B:72:0x01ed, B:71:0x01eb, B:73:0x01f6, B:74:0x01fb, B:35:0x00b7, B:63:0x0190), top: B:119:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x023c A[Catch: Exception -> 0x0050, c -> 0x0053, CancellationException -> 0x0056, TryCatch #0 {Exception -> 0x0050, blocks: (B:15:0x004b, B:81:0x0234, B:83:0x023c, B:85:0x0264, B:91:0x02ab, B:84:0x0262, B:95:0x02bd, B:98:0x02cb, B:53:0x0105), top: B:113:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0262 A[Catch: Exception -> 0x0050, c -> 0x0053, CancellationException -> 0x0056, TryCatch #0 {Exception -> 0x0050, blocks: (B:15:0x004b, B:81:0x0234, B:83:0x023c, B:85:0x0264, B:91:0x02ab, B:84:0x0262, B:95:0x02bd, B:98:0x02cb, B:53:0x0105), top: B:113:0x0029 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(g04.h.Params params, tq.e<? super dx.i<? extends dx.b, ? extends g04.n>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        dx.j jVar;
        g04.h.Params params2;
        ex.b bVar2;
        ex.b aVar2;
        int i19;
        e04.e eVar2;
        ex.b bVar3;
        dx.j jVar2;
        ex.b bVar4;
        g04.h.Params params3;
        int i25;
        ex.b bVar5;
        b0 b0Var;
        ex.b bVar6;
        ex.b bVar7;
        ex.b bVar8;
        g04.h.Params params4;
        Object correct;
        dx.i right;
        boolean zBooleanValue;
        Object correct2;
        b0 b0Var2;
        Object objC;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i26 = aVar.f122250t;
            if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f122250t = i26 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC2 = aVar.f122248r;
        Object objE = uq.b.e();
        int i27 = aVar.f122250t;
        ?? r15 = 4;
        try {
            try {
                if (i27 == 0) {
                    u.b(objC2);
                    c0 c0Var = this.securityExceptionParser;
                    aVar2 = new ex.a();
                    g04.g gVar = this.checkBiometricStatusUseCase;
                    g04.g.Params params5 = new g04.g.Params(true);
                    aVar.f122236d = params;
                    aVar.f122237e = c0Var;
                    aVar.f122238f = vq.j.a(aVar2);
                    aVar.f122239g = aVar2;
                    aVar.f122240h = aVar2;
                    aVar.f122244m = 0;
                    aVar.f122245n = 0;
                    aVar.f122246p = 0;
                    aVar.f122247q = 0;
                    aVar.f122250t = 1;
                    objC2 = gVar.c(params5, aVar);
                    if (objC2 != objE) {
                        jVar = c0Var;
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        bVar2 = aVar2;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            if (i27 != 3) {
                                if (i27 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar7 = (ex.b) aVar.f122240h;
                                bVar8 = (ex.b) aVar.f122239g;
                                params4 = (g04.h.Params) aVar.f122236d;
                                u.b(objC2);
                                if (((Boolean) objC2).booleanValue()) {
                                    correct = new g04.n.Correct(new b0((char[]) bVar8.a(this.bytesConverter.c(params4.getBiometricResult().getData(), new iy.b.Standard(null, 1, null)))));
                                } else {
                                    correct = g04.n.b.f69227a;
                                }
                                right = new dx.i.Right(correct);
                                aVar2 = bVar7;
                                return new dx.i.Right((g04.n) aVar2.a(right));
                            }
                            b0Var = (b0) aVar.f122243l;
                            bVar5 = (ex.b) aVar.f122241j;
                            bVar6 = (ex.b) aVar.f122240h;
                            dx.j jVar3 = (dx.j) aVar.f122237e;
                            try {
                                u.b(objC2);
                                jVar2 = jVar3;
                                zBooleanValue = ((Boolean) bVar5.a((dx.i) objC2)).booleanValue();
                                if (zBooleanValue) {
                                    correct2 = new g04.n.Correct(b0Var);
                                } else {
                                    if (zBooleanValue) {
                                        throw new p();
                                    }
                                    correct2 = g04.n.b.f69227a;
                                }
                                right = new dx.i.Right(correct2);
                                aVar2 = bVar6;
                                return new dx.i.Right((g04.n) aVar2.a(right));
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar3;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
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
                        }
                        int i28 = aVar.f122247q;
                        int i29 = aVar.f122246p;
                        int i35 = aVar.f122245n;
                        i19 = aVar.f122244m;
                        eVar2 = (e04.e) aVar.f122242k;
                        ex.b bVar9 = (ex.b) aVar.f122241j;
                        ex.b bVar10 = (ex.b) aVar.f122240h;
                        ex.b bVar11 = (ex.b) aVar.f122239g;
                        bVar3 = (ex.b) aVar.f122238f;
                        jVar2 = (dx.j) aVar.f122237e;
                        g04.h.Params params6 = (g04.h.Params) aVar.f122236d;
                        try {
                            u.b(objC2);
                            bVar4 = bVar9;
                            i17 = i35;
                            params3 = params6;
                            i16 = i29;
                            i25 = i28;
                            bVar5 = bVar11;
                            aVar2 = bVar10;
                            b0Var2 = (b0) bVar4.a((dx.i) objC2);
                            v64.j jVar4 = this.compareWithCurrentPasswordUseCase;
                            v64.j.Params params7 = new v64.j.Params(b0Var2);
                            aVar.f122236d = vq.j.a(params3);
                            aVar.f122237e = jVar2;
                            aVar.f122238f = vq.j.a(bVar3);
                            aVar.f122239g = vq.j.a(bVar5);
                            aVar.f122240h = aVar2;
                            aVar.f122241j = bVar5;
                            aVar.f122242k = vq.j.a(eVar2);
                            aVar.f122243l = b0Var2;
                            aVar.f122244m = i19;
                            aVar.f122245n = i17;
                            aVar.f122246p = i16;
                            aVar.f122247q = i25;
                            aVar.f122250t = 3;
                            objC = jVar4.c(params7, aVar);
                            if (objC != objE) {
                                return objE;
                            }
                            b0Var = b0Var2;
                            objC2 = objC;
                            bVar6 = aVar2;
                            zBooleanValue = ((Boolean) bVar5.a((dx.i) objC2)).booleanValue();
                            if (zBooleanValue) {
                                correct2 = new g04.n.Correct(b0Var);
                            } else {
                                if (zBooleanValue) {
                                    throw new p();
                                }
                                correct2 = g04.n.b.f69227a;
                            }
                            right = new dx.i.Right(correct2);
                            aVar2 = bVar6;
                            return new dx.i.Right((g04.n) aVar2.a(right));
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r15 = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
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
                    }
                    i15 = aVar.f122247q;
                    i16 = aVar.f122246p;
                    i17 = aVar.f122245n;
                    i18 = aVar.f122244m;
                    ex.b bVar12 = (ex.b) aVar.f122240h;
                    ex.b bVar13 = (ex.b) aVar.f122239g;
                    bVar = (ex.b) aVar.f122238f;
                    jVar = (dx.j) aVar.f122237e;
                    params2 = (g04.h.Params) aVar.f122236d;
                    try {
                        u.b(objC2);
                        bVar2 = bVar12;
                        aVar2 = bVar13;
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        r15 = jVar;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                } catch (CancellationException e29) {
                    throw e29;
                }
                e04.e eVar3 = (e04.e) bVar2.a((dx.i) objC2);
                if (!t.c(eVar3, e04.e.b.a.f46688a)) {
                    if (t.c(eVar3, e04.e.b.C1057b.f46689a)) {
                        v64.i iVar = this.comparePinWithCommonContainerUseCase;
                        b0 providedPin = params2.getProvidedPin();
                        aVar.f122236d = params2;
                        aVar.f122237e = jVar;
                        aVar.f122238f = vq.j.a(bVar);
                        aVar.f122239g = aVar2;
                        aVar.f122240h = aVar2;
                        aVar.f122241j = vq.j.a(eVar3);
                        aVar.f122244m = i18;
                        aVar.f122245n = i17;
                        aVar.f122246p = i16;
                        aVar.f122247q = i15;
                        aVar.f122250t = 4;
                        objC2 = iVar.c(providedPin, aVar);
                        if (objC2 != objE) {
                            params4 = params2;
                            bVar7 = aVar2;
                            bVar8 = bVar7;
                            if (((Boolean) objC2).booleanValue()) {
                                correct = new g04.n.Correct(new b0((char[]) bVar8.a(this.bytesConverter.c(params4.getBiometricResult().getData(), new iy.b.Standard(null, 1, null)))));
                            } else {
                                correct = g04.n.b.f69227a;
                            }
                            right = new dx.i.Right(correct);
                            aVar2 = bVar7;
                        }
                    } else {
                        if (!(eVar3 instanceof e04.e.a)) {
                            throw new p();
                        }
                        this.remoteLogger.F8("Biometric auth status is disabled: " + eVar3, px.d.a.GENERAL);
                        right = new dx.i.Left(new dx.b.InterfaceC1027b.a.UnknownError(0, new IllegalStateException("Illegal biometric status (disabled): " + eVar3), 1, null));
                    }
                    return new dx.i.Right((g04.n) aVar2.a(right));
                }
                g04.l lVar = this.getPasswordFromBiometricUseCase;
                g04.l.Params params8 = new g04.l.Params(params2.getBiometricResult(), params2.getProvidedPin());
                aVar.f122236d = vq.j.a(params2);
                aVar.f122237e = jVar;
                aVar.f122238f = vq.j.a(bVar);
                aVar.f122239g = aVar2;
                aVar.f122240h = aVar2;
                aVar.f122241j = aVar2;
                aVar.f122242k = vq.j.a(eVar3);
                aVar.f122244m = i18;
                aVar.f122245n = i17;
                aVar.f122246p = i16;
                aVar.f122247q = i15;
                aVar.f122250t = 2;
                Object objC3 = lVar.c(params8, aVar);
                if (objC3 != objE) {
                    eVar2 = eVar3;
                    objC2 = objC3;
                    bVar4 = aVar2;
                    bVar3 = bVar;
                    params3 = params2;
                    jVar2 = jVar;
                    i19 = i18;
                    i25 = i15;
                    bVar5 = bVar4;
                    b0Var2 = (b0) bVar4.a((dx.i) objC2);
                    v64.j jVar5 = this.compareWithCurrentPasswordUseCase;
                    v64.j.Params params9 = new v64.j.Params(b0Var2);
                    aVar.f122236d = vq.j.a(params3);
                    aVar.f122237e = jVar2;
                    aVar.f122238f = vq.j.a(bVar3);
                    aVar.f122239g = vq.j.a(bVar5);
                    aVar.f122240h = aVar2;
                    aVar.f122241j = bVar5;
                    aVar.f122242k = vq.j.a(eVar2);
                    aVar.f122243l = b0Var2;
                    aVar.f122244m = i19;
                    aVar.f122245n = i17;
                    aVar.f122246p = i16;
                    aVar.f122247q = i25;
                    aVar.f122250t = 3;
                    objC = jVar5.c(params9, aVar);
                    if (objC != objE) {
                        b0Var = b0Var2;
                        objC2 = objC;
                        bVar6 = aVar2;
                        zBooleanValue = ((Boolean) bVar5.a((dx.i) objC2)).booleanValue();
                        if (zBooleanValue) {
                            correct2 = new g04.n.Correct(b0Var);
                        } else {
                            if (zBooleanValue) {
                                throw new p();
                            }
                            correct2 = g04.n.b.f69227a;
                        }
                        right = new dx.i.Right(correct2);
                        aVar2 = bVar6;
                        return new dx.i.Right((g04.n) aVar2.a(right));
                    }
                }
                return objE;
            } catch (Exception e35) {
                e = e35;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
