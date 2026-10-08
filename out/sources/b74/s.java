package b74;

import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096B¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lb74/s;", "Lv64/p;", "Lu64/b;", "repository", "Lz92/g;", "storeLocalAppActivityLogUC", "Lb74/v;", "shouldGenerateMasterKeyUC", "Lv64/n;", "generateAndSaveAppActivationKeysUC", "Lpx/d;", "remoteLogger", "Lb74/e;", "authenticateUserToAppUC", "Lz64/b;", "userCommonInteractor", "<init>", "(Lu64/b;Lz92/g;Lb74/v;Lv64/n;Lpx/d;Lb74/e;Lz64/b;)V", "Liy/b0;", "password", "Ldx/i;", "Ldx/b;", "", "e", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lv64/p$a;", "params", "", "f", "(Lv64/p$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu64/b;", "b", "Lz92/g;", "c", "Lb74/v;", "d", "Lv64/n;", "Lpx/d;", "Lb74/e;", "g", "Lz64/b;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements v64.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u64.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z92.g storeLocalAppActivityLogUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v shouldGenerateMasterKeyUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v64.n generateAndSaveAppActivationKeysUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e authenticateUserToAppUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z64.b userCommonInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17241a;

        static {
            int[] iArr = new int[u64.a.values().length];
            try {
                iArr[u64.a.LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u64.a.LOGIN_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u64.a.ACTIVATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u64.a.UNKNOWN_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17241a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f17244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f17245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f17246h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f17247j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f17248k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f17249l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17250m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17251n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f17252p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f17254r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17252p = obj;
            this.f17254r |= PKIFailureInfo.systemUnavail;
            return s.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17257f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17259h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17257f = obj;
            this.f17259h |= PKIFailureInfo.systemUnavail;
            return s.this.c(null, this);
        }
    }

    public s(u64.b bVar, z92.g gVar, v vVar, v64.n nVar, px.d dVar, e eVar, z64.b bVar2) {
        this.repository = bVar;
        this.storeLocalAppActivityLogUC = gVar;
        this.shouldGenerateMasterKeyUC = vVar;
        this.generateAndSaveAppActivationKeysUC = nVar;
        this.remoteLogger = dVar;
        this.authenticateUserToAppUC = eVar;
        this.userCommonInteractor = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x011d A[Catch: Exception -> 0x0044, c -> 0x0048, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0044, blocks: (B:14:0x003f, B:58:0x018e, B:60:0x0194, B:61:0x01ba, B:63:0x01be, B:64:0x01d2, B:65:0x01d6, B:67:0x01dc, B:70:0x01eb, B:25:0x006c, B:47:0x0117, B:49:0x011d, B:50:0x0143, B:52:0x0147, B:53:0x015b, B:41:0x00e1, B:43:0x00e9, B:54:0x0161, B:37:0x00b0), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0147 A[Catch: Exception -> 0x0044, c -> 0x0048, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0044, blocks: (B:14:0x003f, B:58:0x018e, B:60:0x0194, B:61:0x01ba, B:63:0x01be, B:64:0x01d2, B:65:0x01d6, B:67:0x01dc, B:70:0x01eb, B:25:0x006c, B:47:0x0117, B:49:0x011d, B:50:0x0143, B:52:0x0147, B:53:0x015b, B:41:0x00e1, B:43:0x00e9, B:54:0x0161, B:37:0x00b0), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0194 A[Catch: Exception -> 0x0044, c -> 0x0048, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0044, blocks: (B:14:0x003f, B:58:0x018e, B:60:0x0194, B:61:0x01ba, B:63:0x01be, B:64:0x01d2, B:65:0x01d6, B:67:0x01dc, B:70:0x01eb, B:25:0x006c, B:47:0x0117, B:49:0x011d, B:50:0x0143, B:52:0x0147, B:53:0x015b, B:41:0x00e1, B:43:0x00e9, B:54:0x0161, B:37:0x00b0), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01be A[Catch: Exception -> 0x0044, c -> 0x0048, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0044, blocks: (B:14:0x003f, B:58:0x018e, B:60:0x0194, B:61:0x01ba, B:63:0x01be, B:64:0x01d2, B:65:0x01d6, B:67:0x01dc, B:70:0x01eb, B:25:0x006c, B:47:0x0117, B:49:0x011d, B:50:0x0143, B:52:0x0147, B:53:0x015b, B:41:0x00e1, B:43:0x00e9, B:54:0x0161, B:37:0x00b0), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x011d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0194, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final Object e(b0 b0Var, tq.e<? super dx.i<? extends dx.b, ? extends Object>> eVar) throws Throwable {
        b bVar;
        ex.c cVar;
        Exception exc;
        ?? r15;
        Object objB;
        b0 b0Var2;
        int i15;
        ex.b bVar2;
        int i16;
        int i17;
        int i18;
        dx.j<dx.b> jVarA;
        ex.b bVar3;
        int i19;
        ex.b bVar4;
        ex.b bVar5;
        dx.i iVar;
        Object objA;
        dx.i iVar2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f17254r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f17254r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f17252p;
        Object objE = uq.b.e();
        int i26 = bVar.f17254r;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    v vVar = this.shouldGenerateMasterKeyUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    bVar.f17242d = b0Var;
                    bVar.f17243e = jVarA;
                    bVar.f17244f = vq.j.a(aVar);
                    bVar.f17245g = aVar;
                    i15 = 0;
                    bVar.f17247j = 0;
                    bVar.f17248k = 0;
                    bVar.f17249l = 0;
                    bVar.f17250m = 0;
                    bVar.f17251n = 0;
                    bVar.f17254r = 1;
                    objC = vVar.c(c1792a, bVar);
                    if (objC != objE) {
                        b0Var2 = b0Var;
                        i18 = 0;
                        i17 = 0;
                        i16 = 0;
                        bVar2 = aVar;
                        bVar3 = bVar2;
                        i19 = 0;
                    }
                    return objE;
                }
                try {
                    if (i26 != 1) {
                        if (i26 == 2) {
                            bVar2 = (ex.b) bVar.f17246h;
                            bVar4 = (ex.b) bVar.f17245g;
                            oq.u.b(objC);
                            iVar2 = (dx.i) objC;
                            if (iVar2 instanceof dx.i.Left) {
                                dx.b bVar6 = (dx.b) ((dx.i.Left) iVar2).b();
                                px.b.y5(this.remoteLogger, "MasterKey generation after activated app login error: " + bVar6, null, px.c.a(bVar4), 2, null);
                            }
                            if (iVar2 instanceof dx.i.Right) {
                                px.f.f163100a.g("Login, MasterKey successfully generated", px.c.a(bVar4));
                            }
                            bVar2.a(iVar2);
                            objA = i0.f148189a;
                            return new dx.i.Right(objA);
                        }
                        if (i26 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) bVar.f17246h;
                        bVar5 = (ex.b) bVar.f17245g;
                        oq.u.b(objC);
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            dx.b bVar7 = (dx.b) ((dx.i.Left) iVar).b();
                            px.b.y5(this.remoteLogger, "User passwordKey authentication error: " + bVar7, null, px.c.a(bVar5), 2, null);
                        }
                        if (iVar instanceof dx.i.Right) {
                            px.f.f163100a.g("Logged in with masterKey", px.c.a(bVar5));
                        }
                        objA = bVar2.a(iVar);
                        return new dx.i.Right(objA);
                    }
                    int i27 = bVar.f17251n;
                    int i28 = bVar.f17250m;
                    int i29 = bVar.f17249l;
                    int i35 = bVar.f17248k;
                    int i36 = bVar.f17247j;
                    ex.b bVar8 = (ex.b) bVar.f17245g;
                    ex.b bVar9 = (ex.b) bVar.f17244f;
                    dx.j<dx.b> jVar = (dx.j) bVar.f17243e;
                    b0Var2 = (b0) bVar.f17242d;
                    try {
                        oq.u.b(objC);
                        i15 = i27;
                        bVar2 = bVar8;
                        i16 = i35;
                        i17 = i29;
                        i18 = i28;
                        jVarA = jVar;
                        bVar3 = bVar9;
                        i19 = i36;
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        exc = e17;
                        r15 = jVar;
                        px.f fVar = px.f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        dx.i iVarA = r15.a(exc);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (CancellationException e18) {
                    throw e18;
                }
                if (((Boolean) objC).booleanValue()) {
                    v64.n nVar = this.generateAndSaveAppActivationKeysUC;
                    v64.n.Params params = new v64.n.Params(b0Var2);
                    bVar.f17242d = vq.j.a(b0Var2);
                    bVar.f17243e = jVarA;
                    bVar.f17244f = vq.j.a(bVar3);
                    bVar.f17245g = bVar2;
                    bVar.f17246h = bVar2;
                    bVar.f17247j = i19;
                    bVar.f17248k = i16;
                    bVar.f17249l = i17;
                    bVar.f17250m = i18;
                    bVar.f17251n = i15;
                    bVar.f17254r = 2;
                    objC = nVar.c(params, bVar);
                    if (objC != objE) {
                        bVar4 = bVar2;
                        iVar2 = (dx.i) objC;
                        if (iVar2 instanceof dx.i.Left) {
                            dx.b bVar10 = (dx.b) ((dx.i.Left) iVar2).b();
                            px.b.y5(this.remoteLogger, "MasterKey generation after activated app login error: " + bVar10, null, px.c.a(bVar4), 2, null);
                        }
                        if (iVar2 instanceof dx.i.Right) {
                            px.f.f163100a.g("Login, MasterKey successfully generated", px.c.a(bVar4));
                        }
                        bVar2.a(iVar2);
                        objA = i0.f148189a;
                        return new dx.i.Right(objA);
                    }
                } else {
                    e eVar2 = this.authenticateUserToAppUC;
                    e.Params params2 = new e.Params(b0Var2);
                    bVar.f17242d = vq.j.a(b0Var2);
                    bVar.f17243e = jVarA;
                    bVar.f17244f = vq.j.a(bVar3);
                    bVar.f17245g = bVar2;
                    bVar.f17246h = bVar2;
                    bVar.f17247j = i19;
                    bVar.f17248k = i16;
                    bVar.f17249l = i17;
                    bVar.f17250m = i18;
                    bVar.f17251n = i15;
                    bVar.f17254r = 3;
                    objC = eVar2.c(params2, bVar);
                    if (objC != objE) {
                        bVar5 = bVar2;
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            dx.b bVar11 = (dx.b) ((dx.i.Left) iVar).b();
                            px.b.y5(this.remoteLogger, "User passwordKey authentication error: " + bVar11, null, px.c.a(bVar5), 2, null);
                        }
                        if (iVar instanceof dx.i.Right) {
                            px.f.f163100a.g("Logged in with masterKey", px.c.a(bVar5));
                        }
                        objA = bVar2.a(iVar);
                        return new dx.i.Right(objA);
                    }
                }
                return objE;
            } catch (Exception e19) {
                exc = e19;
                r15 = i26;
            }
        } catch (ex.c e25) {
            cVar = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        if (r2.c(r5, r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
    
        if (e(r2, r0) == r1) goto L66;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(v64.p.Params r10, tq.e<? super java.lang.Boolean> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b74.s.c(v64.p$a, tq.e):java.lang.Object");
    }
}
