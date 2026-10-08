package b74;

import iy.b0;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qy.MasterKeyModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lb74/q;", "Lv64/n;", "La74/a;", "userRepository", "La10/a;", "deviceKeyGenerator", "Lf10/c;", "masterKeyGenerator", "Liy/s;", "keyInspector", "Lpx/d;", "remoteLogger", "<init>", "(La74/a;La10/a;Lf10/c;Liy/s;Lpx/d;)V", "Lv64/n$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lv64/n$a;Ltq/e;)Ljava/lang/Object;", "a", "La74/a;", "b", "La10/a;", "c", "Lf10/c;", "Liy/s;", "e", "Lpx/d;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements v64.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a74.a userRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a10.a deviceKeyGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f10.c masterKeyGenerator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.s keyInspector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f17216f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f17217g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f17218h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f17219j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f17220k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f17221l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17222m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17223n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f17224p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17225q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f17226r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f17227s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f17228t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f17230w;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17228t = obj;
            this.f17230w |= PKIFailureInfo.systemUnavail;
            return q.this.c(null, this);
        }
    }

    public q(a74.a aVar, a10.a aVar2, f10.c cVar, iy.s sVar, px.d dVar) {
        this.userRepository = aVar;
        this.deviceKeyGenerator = aVar2;
        this.masterKeyGenerator = cVar;
        this.keyInspector = sVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:104:0x02af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x023c  */
    /* JADX WARN: Code duplicated, block: B:95:0x027f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0290  */
    /* JADX WARN: Code duplicated, block: B:99:0x029e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(v64.n.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        v64.n.Params params2;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        dx.i iVar;
        int i25;
        int i26;
        ex.b bVar4;
        ex.b bVar5;
        v64.n.Params params3;
        int i27;
        v64.n.Params params4;
        int i28;
        int i29;
        int i35;
        ex.b bVar6;
        ex.b bVar7;
        ?? r15;
        dx.i iVar2;
        int i36;
        ?? r16;
        SecretKey secretKey;
        ex.b bVar8;
        ex.b bVar9;
        ?? r17;
        ex.b bVar10;
        ex.b bVar11;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i37 = aVar.f17230w;
            if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17230w = i37 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f17228t;
        Object objE = uq.b.e();
        int i38 = aVar.f17230w;
        ?? r18 = 4;
        try {
            try {
                try {
                    try {
                        if (i38 == 0) {
                            oq.u.b(objC);
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            ex.a aVar2 = new ex.a();
                            a10.a aVar3 = this.deviceKeyGenerator;
                            params2 = params;
                            aVar.f17214d = params2;
                            aVar.f17215e = jVarA;
                            aVar.f17216f = vq.j.a(aVar2);
                            aVar.f17217g = aVar2;
                            aVar.f17218h = aVar2;
                            aVar.f17221l = 0;
                            aVar.f17222m = 0;
                            aVar.f17223n = 0;
                            aVar.f17224p = 0;
                            aVar.f17225q = 0;
                            aVar.f17230w = 1;
                            Object objA = aVar3.a("mobKeyAlias", aVar);
                            if (objA != objE) {
                                bVar = aVar2;
                                bVar2 = bVar;
                                bVar3 = bVar2;
                                objC = objA;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                r18 = jVarA;
                            }
                            return objE;
                        }
                        if (i38 != 1) {
                            if (i38 != 2) {
                                if (i38 == 3) {
                                    i15 = aVar.f17225q;
                                    i16 = aVar.f17224p;
                                    i27 = aVar.f17223n;
                                    i25 = aVar.f17222m;
                                    i26 = aVar.f17221l;
                                    secretKey = (SecretKey) aVar.f17219j;
                                    ex.b bVar12 = (ex.b) aVar.f17218h;
                                    ex.b bVar13 = (ex.b) aVar.f17217g;
                                    bVar9 = (ex.b) aVar.f17216f;
                                    dx.j jVar = (dx.j) aVar.f17215e;
                                    params3 = (v64.n.Params) aVar.f17214d;
                                    try {
                                        oq.u.b(objC);
                                        bVar8 = bVar12;
                                        bVar4 = bVar13;
                                        r17 = jVar;
                                        bVar8.a((dx.i) objC);
                                        this.remoteLogger.F8("MasterKey generated", px.d.a.GENERAL);
                                        f10.c cVar = this.masterKeyGenerator;
                                        b0 password = params3.getPassword();
                                        aVar.f17214d = vq.j.a(params3);
                                        aVar.f17215e = r17;
                                        aVar.f17216f = vq.j.a(bVar9);
                                        aVar.f17217g = bVar4;
                                        aVar.f17218h = bVar4;
                                        aVar.f17219j = vq.j.a(secretKey);
                                        aVar.f17221l = i26;
                                        aVar.f17222m = i25;
                                        aVar.f17223n = i27;
                                        aVar.f17224p = i16;
                                        aVar.f17225q = i15;
                                        aVar.f17230w = 4;
                                        objC = cVar.b(password, secretKey, aVar);
                                        if (objC != objE) {
                                            bVar10 = bVar4;
                                            bVar11 = bVar10;
                                        }
                                        return objE;
                                    } catch (ex.c e15) {
                                        e = e15;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e16) {
                                        throw e16;
                                    } catch (Exception e17) {
                                        e = e17;
                                        r18 = jVar;
                                        px.f fVar = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e, px.c.a(r18));
                                        iVarA = r18.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                }
                                if (i38 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar10 = (ex.b) aVar.f17218h;
                                bVar11 = (ex.b) aVar.f17217g;
                                oq.u.b(objC);
                                MasterKeyModel masterKeyModel = (MasterKeyModel) bVar10.a((dx.i) objC);
                                this.remoteLogger.F8("MasterKey encrypted", px.d.a.GENERAL);
                                bVar11.a(this.userRepository.g(masterKeyModel.getWrappedMasterKey(), masterKeyModel.getEncryptedPasswordData()));
                                return new dx.i.Right(i0.f148189a);
                            }
                            i15 = aVar.f17225q;
                            i36 = aVar.f17224p;
                            i28 = aVar.f17223n;
                            i29 = aVar.f17222m;
                            i35 = aVar.f17221l;
                            iVar2 = (dx.i) aVar.f17219j;
                            bVar6 = (ex.b) aVar.f17218h;
                            bVar7 = (ex.b) aVar.f17217g;
                            bVar5 = (ex.b) aVar.f17216f;
                            dx.j jVar2 = (dx.j) aVar.f17215e;
                            params4 = (v64.n.Params) aVar.f17214d;
                            try {
                                oq.u.b(objC);
                                r15 = jVar2;
                                ?? r19 = r15;
                                params3 = params4;
                                r16 = r19;
                                i16 = i36;
                                i27 = i28;
                                i25 = i29;
                                i26 = i35;
                                iVar = iVar2;
                                bVar4 = bVar7;
                                bVar = bVar6;
                                secretKey = (SecretKey) bVar.a(iVar);
                                this.remoteLogger.F8("DeviceKey generated", px.d.a.GENERAL);
                                f10.c cVar2 = this.masterKeyGenerator;
                                aVar.f17214d = params3;
                                aVar.f17215e = r16;
                                aVar.f17216f = vq.j.a(bVar5);
                                aVar.f17217g = bVar4;
                                aVar.f17218h = bVar4;
                                aVar.f17219j = secretKey;
                                aVar.f17220k = null;
                                aVar.f17221l = i26;
                                aVar.f17222m = i25;
                                aVar.f17223n = i27;
                                aVar.f17224p = i16;
                                aVar.f17225q = i15;
                                aVar.f17230w = 3;
                                objC = cVar2.c(aVar);
                                if (objC != objE) {
                                    bVar8 = bVar4;
                                    bVar9 = bVar5;
                                    r17 = r16;
                                    bVar8.a((dx.i) objC);
                                    this.remoteLogger.F8("MasterKey generated", px.d.a.GENERAL);
                                    f10.c cVar3 = this.masterKeyGenerator;
                                    b0 password2 = params3.getPassword();
                                    aVar.f17214d = vq.j.a(params3);
                                    aVar.f17215e = r17;
                                    aVar.f17216f = vq.j.a(bVar9);
                                    aVar.f17217g = bVar4;
                                    aVar.f17218h = bVar4;
                                    aVar.f17219j = vq.j.a(secretKey);
                                    aVar.f17221l = i26;
                                    aVar.f17222m = i25;
                                    aVar.f17223n = i27;
                                    aVar.f17224p = i16;
                                    aVar.f17225q = i15;
                                    aVar.f17230w = 4;
                                    objC = cVar3.b(password2, secretKey, aVar);
                                    if (objC != objE) {
                                        bVar10 = bVar4;
                                        bVar11 = bVar10;
                                        MasterKeyModel masterKeyModel2 = (MasterKeyModel) bVar10.a((dx.i) objC);
                                        this.remoteLogger.F8("MasterKey encrypted", px.d.a.GENERAL);
                                        bVar11.a(this.userRepository.g(masterKeyModel2.getWrappedMasterKey(), masterKeyModel2.getEncryptedPasswordData()));
                                        return new dx.i.Right(i0.f148189a);
                                    }
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                r18 = jVar2;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(r18));
                                iVarA = r18.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        i15 = aVar.f17225q;
                        int i39 = aVar.f17224p;
                        i17 = aVar.f17223n;
                        i18 = aVar.f17222m;
                        i19 = aVar.f17221l;
                        bVar = (ex.b) aVar.f17218h;
                        bVar2 = (ex.b) aVar.f17217g;
                        bVar3 = (ex.b) aVar.f17216f;
                        dx.j jVar3 = (dx.j) aVar.f17215e;
                        params2 = (v64.n.Params) aVar.f17214d;
                        try {
                            oq.u.b(objC);
                            i16 = i39;
                            r18 = jVar3;
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            r18 = jVar3;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(r18));
                            iVarA = r18.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Right) {
                            SecretKey secretKey2 = (SecretKey) ((dx.i.Right) iVar).b();
                            iy.s sVar = this.keyInspector;
                            aVar.f17214d = params2;
                            aVar.f17215e = r18;
                            ?? r110 = r18;
                            try {
                                aVar.f17216f = vq.j.a(bVar3);
                                aVar.f17217g = bVar2;
                                aVar.f17218h = bVar;
                                aVar.f17219j = iVar;
                                aVar.f17220k = vq.j.a(secretKey2);
                                aVar.f17221l = i19;
                                aVar.f17222m = i18;
                                aVar.f17223n = i17;
                                aVar.f17224p = i16;
                                aVar.f17225q = i15;
                                aVar.f17226r = 0;
                                aVar.f17227s = 0;
                                aVar.f17230w = 2;
                                if (sVar.d(secretKey2, true, aVar) != objE) {
                                    params4 = params2;
                                    i28 = i17;
                                    i29 = i18;
                                    i35 = i19;
                                    bVar6 = bVar;
                                    bVar7 = bVar2;
                                    bVar5 = bVar3;
                                    r15 = r110;
                                    iVar2 = iVar;
                                    i36 = i16;
                                    ?? r111 = r15;
                                    params3 = params4;
                                    r16 = r111;
                                    i16 = i36;
                                    i27 = i28;
                                    i25 = i29;
                                    i26 = i35;
                                    iVar = iVar2;
                                    bVar4 = bVar7;
                                    bVar = bVar6;
                                    secretKey = (SecretKey) bVar.a(iVar);
                                    this.remoteLogger.F8("DeviceKey generated", px.d.a.GENERAL);
                                    f10.c cVar4 = this.masterKeyGenerator;
                                    aVar.f17214d = params3;
                                    aVar.f17215e = r16;
                                    aVar.f17216f = vq.j.a(bVar5);
                                    aVar.f17217g = bVar4;
                                    aVar.f17218h = bVar4;
                                    aVar.f17219j = secretKey;
                                    aVar.f17220k = null;
                                    aVar.f17221l = i26;
                                    aVar.f17222m = i25;
                                    aVar.f17223n = i27;
                                    aVar.f17224p = i16;
                                    aVar.f17225q = i15;
                                    aVar.f17230w = 3;
                                    objC = cVar4.c(aVar);
                                    if (objC != objE) {
                                        bVar8 = bVar4;
                                        bVar9 = bVar5;
                                        r17 = r16;
                                        bVar8.a((dx.i) objC);
                                        this.remoteLogger.F8("MasterKey generated", px.d.a.GENERAL);
                                        f10.c cVar5 = this.masterKeyGenerator;
                                        b0 password3 = params3.getPassword();
                                        aVar.f17214d = vq.j.a(params3);
                                        aVar.f17215e = r17;
                                        aVar.f17216f = vq.j.a(bVar9);
                                        aVar.f17217g = bVar4;
                                        aVar.f17218h = bVar4;
                                        aVar.f17219j = vq.j.a(secretKey);
                                        aVar.f17221l = i26;
                                        aVar.f17222m = i25;
                                        aVar.f17223n = i27;
                                        aVar.f17224p = i16;
                                        aVar.f17225q = i15;
                                        aVar.f17230w = 4;
                                        objC = cVar5.b(password3, secretKey, aVar);
                                        if (objC != objE) {
                                            bVar10 = bVar4;
                                            bVar11 = bVar10;
                                            MasterKeyModel masterKeyModel3 = (MasterKeyModel) bVar10.a((dx.i) objC);
                                            this.remoteLogger.F8("MasterKey encrypted", px.d.a.GENERAL);
                                            bVar11.a(this.userRepository.g(masterKeyModel3.getWrappedMasterKey(), masterKeyModel3.getEncryptedPasswordData()));
                                            return new dx.i.Right(i0.f148189a);
                                        }
                                    }
                                }
                            } catch (ex.c e29) {
                                e = e29;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e35) {
                                throw e35;
                            } catch (Exception e36) {
                                e = e36;
                                r18 = r110;
                                px.f fVar4 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar4.d(message, e, px.c.a(r18));
                                iVarA = r18.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            i25 = i18;
                            i26 = i19;
                            bVar4 = bVar2;
                            bVar5 = bVar3;
                            params3 = params2;
                            i27 = i17;
                            r16 = r18;
                            secretKey = (SecretKey) bVar.a(iVar);
                            this.remoteLogger.F8("DeviceKey generated", px.d.a.GENERAL);
                            f10.c cVar6 = this.masterKeyGenerator;
                            aVar.f17214d = params3;
                            aVar.f17215e = r16;
                            aVar.f17216f = vq.j.a(bVar5);
                            aVar.f17217g = bVar4;
                            aVar.f17218h = bVar4;
                            aVar.f17219j = secretKey;
                            aVar.f17220k = null;
                            aVar.f17221l = i26;
                            aVar.f17222m = i25;
                            aVar.f17223n = i27;
                            aVar.f17224p = i16;
                            aVar.f17225q = i15;
                            aVar.f17230w = 3;
                            objC = cVar6.c(aVar);
                            if (objC != objE) {
                                bVar8 = bVar4;
                                bVar9 = bVar5;
                                r17 = r16;
                                bVar8.a((dx.i) objC);
                                this.remoteLogger.F8("MasterKey generated", px.d.a.GENERAL);
                                f10.c cVar7 = this.masterKeyGenerator;
                                b0 password4 = params3.getPassword();
                                aVar.f17214d = vq.j.a(params3);
                                aVar.f17215e = r17;
                                aVar.f17216f = vq.j.a(bVar9);
                                aVar.f17217g = bVar4;
                                aVar.f17218h = bVar4;
                                aVar.f17219j = vq.j.a(secretKey);
                                aVar.f17221l = i26;
                                aVar.f17222m = i25;
                                aVar.f17223n = i27;
                                aVar.f17224p = i16;
                                aVar.f17225q = i15;
                                aVar.f17230w = 4;
                                objC = cVar7.b(password4, secretKey, aVar);
                                if (objC != objE) {
                                    bVar10 = bVar4;
                                    bVar11 = bVar10;
                                    MasterKeyModel masterKeyModel4 = (MasterKeyModel) bVar10.a((dx.i) objC);
                                    this.remoteLogger.F8("MasterKey encrypted", px.d.a.GENERAL);
                                    bVar11.a(this.userRepository.g(masterKeyModel4.getWrappedMasterKey(), masterKeyModel4.getEncryptedPasswordData()));
                                    return new dx.i.Right(i0.f148189a);
                                }
                            }
                        }
                        return objE;
                    } catch (ex.c e37) {
                        e = e37;
                    } catch (CancellationException e38) {
                        throw e38;
                    } catch (Exception e39) {
                        e = e39;
                    }
                } catch (Exception e45) {
                    e = e45;
                }
            } catch (CancellationException e46) {
                throw e46;
            }
        } catch (ex.c e47) {
            e = e47;
        } catch (CancellationException e48) {
            throw e48;
        }
    }
}
