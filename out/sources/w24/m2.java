package w24;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lw24/m2;", "Lk24/o;", "Lv24/a;", "repository", "Liy/d;", "bytesGenerator", "Liy/c;", "bytesConverter", "Liy/v;", "pkcs12Manager", "<init>", "(Lv24/a;Liy/d;Liy/c;Liy/v;)V", "Lk24/o$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lk24/o$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/a;", "b", "Liy/d;", "c", "Liy/c;", "Liy/v;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m2 implements k24.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.d bytesGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.v pkcs12Manager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209836a;

        static {
            int[] iArr = new int[f24.c.values().length];
            try {
                iArr[f24.c.UNIVERSITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f209836a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209839f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209840g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209841h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209842j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209843k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209844l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f209845m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f209846n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209847p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209848q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209849r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209850s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f209851t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f209852v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f209854x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209852v = obj;
            this.f209854x |= PKIFailureInfo.systemUnavail;
            return m2.this.c(null, this);
        }
    }

    public m2(v24.a aVar, iy.d dVar, iy.c cVar, iy.v vVar) {
        this.repository = aVar;
        this.bytesGenerator = dVar;
        this.bytesConverter = cVar;
        this.pkcs12Manager = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0313  */
    /* JADX WARN: Code duplicated, block: B:114:0x0324  */
    /* JADX WARN: Code duplicated, block: B:115:0x0332  */
    /* JADX WARN: Code duplicated, block: B:117:0x0336  */
    /* JADX WARN: Code duplicated, block: B:120:0x0343  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x0247  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(k24.o.Params params, tq.e<? super dx.i<? extends dx.b, Integer>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        Object objA;
        int i16;
        int i17;
        k24.o.Params params2;
        ex.b bVar2;
        ex.b bVar3;
        int i18;
        int i19;
        byte[] bArr;
        char[] cArr;
        iy.v vVar;
        iy.a0 decryptedCert;
        iy.b0 password;
        ex.b bVar4;
        iy.b0 b0Var;
        ?? r25;
        Object objB2;
        byte[] bArr2;
        int i25;
        int i26;
        ex.b bVar5;
        char[] cArr2;
        int i27;
        ex.b bVar6;
        iy.a0 a0Var;
        ex.b bVar7;
        String str;
        byte[] bArr3;
        ?? r18;
        Object objA2;
        ex.b bVar8;
        ex.b bVar9;
        byte[] bArr4;
        iy.a0 a0Var2;
        Object obj;
        char[] cArr3;
        ?? r15;
        String str2;
        int i28;
        int i29;
        int i35;
        int i36;
        ex.b bVar10;
        ex.b bVar11;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i37 = bVar.f209854x;
            if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f209854x = i37 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.f209852v;
        Object objE = uq.b.e();
        ?? r16 = bVar.f209854x;
        try {
            try {
                try {
                    try {
                        try {
                            if (r16 == 0) {
                                oq.u.b(objG);
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                ex.a aVar = new ex.a();
                                i15 = 0;
                                bVar.f209837d = params;
                                bVar.f209838e = jVarA;
                                bVar.f209839f = vq.j.a(aVar);
                                bVar.f209840g = aVar;
                                bVar.f209847p = 0;
                                bVar.f209848q = 0;
                                bVar.f209849r = 0;
                                bVar.f209850s = 0;
                                bVar.f209851t = 0;
                                bVar.f209854x = 1;
                                objA = this.bytesGenerator.a(new byte[0], 16, bVar);
                                if (objA != objE) {
                                    i16 = 0;
                                    i17 = 0;
                                    params2 = params;
                                    bVar2 = aVar;
                                    bVar3 = bVar2;
                                    i18 = 0;
                                    i19 = 0;
                                    r16 = jVarA;
                                }
                                return objE;
                            }
                            if (r16 == 1) {
                                int i38 = bVar.f209851t;
                                int i39 = bVar.f209850s;
                                int i45 = bVar.f209849r;
                                int i46 = bVar.f209848q;
                                int i47 = bVar.f209847p;
                                ex.b bVar12 = (ex.b) bVar.f209840g;
                                ex.b bVar13 = (ex.b) bVar.f209839f;
                                dx.j jVar = (dx.j) bVar.f209838e;
                                params2 = (k24.o.Params) bVar.f209837d;
                                try {
                                    oq.u.b(objG);
                                    i16 = i39;
                                    r16 = jVar;
                                    bVar2 = bVar12;
                                    i17 = i46;
                                    bVar3 = bVar13;
                                    i19 = i47;
                                    i18 = i45;
                                    i15 = i38;
                                    objA = objG;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r16 = jVar;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r16));
                                    iVarA = r16.a(e);
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
                            } else {
                                if (r16 != 2) {
                                    if (r16 == 3) {
                                        int i48 = bVar.f209851t;
                                        int i49 = bVar.f209850s;
                                        int i55 = bVar.f209849r;
                                        int i56 = bVar.f209848q;
                                        int i57 = bVar.f209847p;
                                        String str3 = (String) bVar.f209845m;
                                        iy.a0 a0Var3 = (iy.a0) bVar.f209844l;
                                        ex.b bVar14 = (ex.b) bVar.f209843k;
                                        char[] cArr4 = (char[]) bVar.f209842j;
                                        byte[] bArr5 = (byte[]) bVar.f209841h;
                                        bVar9 = (ex.b) bVar.f209840g;
                                        ex.b bVar15 = (ex.b) bVar.f209839f;
                                        dx.j jVar2 = (dx.j) bVar.f209838e;
                                        k24.o.Params params3 = (k24.o.Params) bVar.f209837d;
                                        try {
                                            oq.u.b(objG);
                                            params2 = params3;
                                            obj = objG;
                                            cArr3 = cArr4;
                                            i15 = i48;
                                            r15 = jVar2;
                                            bArr4 = bArr5;
                                            bVar8 = bVar14;
                                            a0Var2 = a0Var3;
                                            str2 = str3;
                                            i28 = i57;
                                            i29 = i56;
                                            i35 = i55;
                                            i36 = i49;
                                            bVar10 = bVar15;
                                            CertKeyPair certKeyPair = (CertKeyPair) bVar8.a((dx.i) obj);
                                            v24.a aVar2 = this.repository;
                                            f24.c certificateType = params2.getCertificateType();
                                            ex.b bVar16 = bVar10;
                                            iy.b0 peselTicket = params2.getPeselTicket();
                                            bVar.f209837d = vq.j.a(params2);
                                            bVar.f209838e = r15;
                                            bVar.f209839f = vq.j.a(bVar16);
                                            bVar.f209840g = vq.j.a(bVar9);
                                            bVar.f209841h = vq.j.a(bArr4);
                                            bVar.f209842j = vq.j.a(cArr3);
                                            bVar.f209843k = bVar9;
                                            bVar.f209844l = vq.j.a(a0Var2);
                                            bVar.f209845m = vq.j.a(certKeyPair);
                                            bVar.f209846n = vq.j.a(str2);
                                            bVar.f209847p = i28;
                                            bVar.f209848q = i29;
                                            bVar.f209849r = i35;
                                            bVar.f209850s = i36;
                                            bVar.f209851t = i15;
                                            bVar.f209854x = 4;
                                            objG = aVar2.g(certificateType, certKeyPair, peselTicket, bVar);
                                            if (objG != objE) {
                                                bVar11 = bVar9;
                                            }
                                            return objE;
                                        } catch (ex.c e18) {
                                            e = e18;
                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e19) {
                                            throw e19;
                                        } catch (Exception e25) {
                                            e = e25;
                                            r16 = jVar2;
                                            px.f fVar2 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar2.d(message, e, px.c.a(r16));
                                            iVarA = r16.a(e);
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
                                    }
                                    if (r16 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bVar11 = (ex.b) bVar.f209843k;
                                    oq.u.b(objG);
                                    return new dx.i.Right(vq.b.e(((Number) bVar11.a((dx.i) objG)).intValue()));
                                }
                                int i58 = bVar.f209851t;
                                int i59 = bVar.f209850s;
                                int i65 = bVar.f209849r;
                                int i66 = bVar.f209848q;
                                i26 = bVar.f209847p;
                                bVar6 = (ex.b) bVar.f209843k;
                                cArr2 = (char[]) bVar.f209842j;
                                byte[] bArr6 = (byte[]) bVar.f209841h;
                                ex.b bVar17 = (ex.b) bVar.f209840g;
                                bVar5 = (ex.b) bVar.f209839f;
                                dx.j jVar3 = (dx.j) bVar.f209838e;
                                k24.o.Params params4 = (k24.o.Params) bVar.f209837d;
                                try {
                                    oq.u.b(objG);
                                    i16 = i59;
                                    r16 = jVar3;
                                    bArr2 = bArr6;
                                    bVar2 = bVar17;
                                    params2 = params4;
                                    i27 = i66;
                                    i25 = i65;
                                    i15 = i58;
                                    objB2 = objG;
                                    try {
                                        a0Var = (iy.a0) bVar6.a((dx.i) objB2);
                                        bVar7 = bVar5;
                                        if (a.f209836a[params2.getCertificateType().ordinal()] == 1) {
                                            str = "mlWork";
                                        } else {
                                            str = "mtWork";
                                        }
                                        iy.v vVar2 = this.pkcs12Manager;
                                        bArr3 = bArr2;
                                        iy.b0 b0Var2 = new iy.b0(cArr2);
                                        bVar.f209837d = params2;
                                        bVar.f209838e = r16;
                                        r18 = r16;
                                        try {
                                            bVar.f209839f = vq.j.a(bVar7);
                                            bVar.f209840g = bVar2;
                                            bVar.f209841h = vq.j.a(bArr3);
                                            bVar.f209842j = vq.j.a(cArr2);
                                            bVar.f209843k = bVar2;
                                            bVar.f209844l = vq.j.a(a0Var);
                                            bVar.f209845m = vq.j.a(str);
                                            bVar.f209847p = i26;
                                            bVar.f209848q = i27;
                                            bVar.f209849r = i25;
                                            bVar.f209850s = i16;
                                            bVar.f209851t = i15;
                                            bVar.f209854x = 3;
                                            objA2 = vVar2.a(str, a0Var, b0Var2, bVar);
                                            if (objA2 != objE) {
                                                bVar8 = bVar2;
                                                bVar9 = bVar8;
                                                bArr4 = bArr3;
                                                a0Var2 = a0Var;
                                                obj = objA2;
                                                cArr3 = cArr2;
                                                r15 = r18;
                                                str2 = str;
                                                i28 = i26;
                                                i29 = i27;
                                                i35 = i25;
                                                i36 = i16;
                                                bVar10 = bVar7;
                                                CertKeyPair certKeyPair2 = (CertKeyPair) bVar8.a((dx.i) obj);
                                                v24.a aVar3 = this.repository;
                                                f24.c certificateType2 = params2.getCertificateType();
                                                ex.b bVar18 = bVar10;
                                                iy.b0 peselTicket2 = params2.getPeselTicket();
                                                bVar.f209837d = vq.j.a(params2);
                                                bVar.f209838e = r15;
                                                bVar.f209839f = vq.j.a(bVar18);
                                                bVar.f209840g = vq.j.a(bVar9);
                                                bVar.f209841h = vq.j.a(bArr4);
                                                bVar.f209842j = vq.j.a(cArr3);
                                                bVar.f209843k = bVar9;
                                                bVar.f209844l = vq.j.a(a0Var2);
                                                bVar.f209845m = vq.j.a(certKeyPair2);
                                                bVar.f209846n = vq.j.a(str2);
                                                bVar.f209847p = i28;
                                                bVar.f209848q = i29;
                                                bVar.f209849r = i35;
                                                bVar.f209850s = i36;
                                                bVar.f209851t = i15;
                                                bVar.f209854x = 4;
                                                objG = aVar3.g(certificateType2, certKeyPair2, peselTicket2, bVar);
                                                if (objG != objE) {
                                                    bVar11 = bVar9;
                                                    return new dx.i.Right(vq.b.e(((Number) bVar11.a((dx.i) objG)).intValue()));
                                                }
                                            }
                                            return objE;
                                        } catch (ex.c e26) {
                                            e = e26;
                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e27) {
                                            throw e27;
                                        } catch (Exception e28) {
                                            e = e28;
                                            r16 = r18;
                                            px.f fVar3 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar3.d(message, e, px.c.a(r16));
                                            iVarA = r16.a(e);
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
                                    } catch (ex.c e29) {
                                        e = e29;
                                    } catch (CancellationException e35) {
                                        throw e35;
                                    } catch (Exception e36) {
                                        e = e36;
                                    }
                                } catch (ex.c e37) {
                                    e = e37;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e38) {
                                    throw e38;
                                } catch (Exception e39) {
                                    e = e39;
                                    r16 = jVar3;
                                    px.f fVar4 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar4.d(message, e, px.c.a(r16));
                                    iVarA = r16.a(e);
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
                            }
                            bVar.f209839f = vq.j.a(bVar4);
                            bVar.f209840g = bVar2;
                            bVar.f209841h = vq.j.a(bArr);
                            bVar.f209842j = cArr;
                            bVar.f209843k = bVar2;
                            bVar.f209847p = i19;
                            bVar.f209848q = i17;
                            bVar.f209849r = i18;
                            bVar.f209850s = i16;
                            bVar.f209851t = i15;
                            bVar.f209854x = 2;
                            objB2 = vVar.b(decryptedCert, password, b0Var, bVar);
                            if (objB2 != objE) {
                                bArr2 = bArr;
                                i25 = i18;
                                i26 = i19;
                                bVar5 = bVar4;
                                r16 = r25;
                                cArr2 = cArr;
                                i27 = i17;
                                bVar6 = bVar2;
                                a0Var = (iy.a0) bVar6.a((dx.i) objB2);
                                bVar7 = bVar5;
                                if (a.f209836a[params2.getCertificateType().ordinal()] == 1) {
                                    str = "mlWork";
                                } else {
                                    str = "mtWork";
                                }
                                iy.v vVar3 = this.pkcs12Manager;
                                bArr3 = bArr2;
                                iy.b0 b0Var3 = new iy.b0(cArr2);
                                bVar.f209837d = params2;
                                bVar.f209838e = r16;
                                r18 = r16;
                                bVar.f209839f = vq.j.a(bVar7);
                                bVar.f209840g = bVar2;
                                bVar.f209841h = vq.j.a(bArr3);
                                bVar.f209842j = vq.j.a(cArr2);
                                bVar.f209843k = bVar2;
                                bVar.f209844l = vq.j.a(a0Var);
                                bVar.f209845m = vq.j.a(str);
                                bVar.f209847p = i26;
                                bVar.f209848q = i27;
                                bVar.f209849r = i25;
                                bVar.f209850s = i16;
                                bVar.f209851t = i15;
                                bVar.f209854x = 3;
                                objA2 = vVar3.a(str, a0Var, b0Var3, bVar);
                                if (objA2 != objE) {
                                    bVar8 = bVar2;
                                    bVar9 = bVar8;
                                    bArr4 = bArr3;
                                    a0Var2 = a0Var;
                                    obj = objA2;
                                    cArr3 = cArr2;
                                    r15 = r18;
                                    str2 = str;
                                    i28 = i26;
                                    i29 = i27;
                                    i35 = i25;
                                    i36 = i16;
                                    bVar10 = bVar7;
                                    CertKeyPair certKeyPair3 = (CertKeyPair) bVar8.a((dx.i) obj);
                                    v24.a aVar4 = this.repository;
                                    f24.c certificateType3 = params2.getCertificateType();
                                    ex.b bVar19 = bVar10;
                                    iy.b0 peselTicket3 = params2.getPeselTicket();
                                    bVar.f209837d = vq.j.a(params2);
                                    bVar.f209838e = r15;
                                    bVar.f209839f = vq.j.a(bVar19);
                                    bVar.f209840g = vq.j.a(bVar9);
                                    bVar.f209841h = vq.j.a(bArr4);
                                    bVar.f209842j = vq.j.a(cArr3);
                                    bVar.f209843k = bVar9;
                                    bVar.f209844l = vq.j.a(a0Var2);
                                    bVar.f209845m = vq.j.a(certKeyPair3);
                                    bVar.f209846n = vq.j.a(str2);
                                    bVar.f209847p = i28;
                                    bVar.f209848q = i29;
                                    bVar.f209849r = i35;
                                    bVar.f209850s = i36;
                                    bVar.f209851t = i15;
                                    bVar.f209854x = 4;
                                    objG = aVar4.g(certificateType3, certKeyPair3, peselTicket3, bVar);
                                    if (objG != objE) {
                                        bVar11 = bVar9;
                                        return new dx.i.Right(vq.b.e(((Number) bVar11.a((dx.i) objG)).intValue()));
                                    }
                                }
                            }
                            return objE;
                        } catch (ex.c e45) {
                            e = e45;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e46) {
                            throw e46;
                        } catch (Exception e47) {
                            e = e47;
                            r16 = r25;
                            px.f fVar5 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar5.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
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
                        bArr = (byte[]) objA;
                        cArr = (char[]) bVar2.a(this.bytesConverter.c(bArr, iy.b.a.f97723a));
                        vVar = this.pkcs12Manager;
                        decryptedCert = params2.getDecryptedCert();
                        password = params2.getPassword();
                        bVar4 = bVar3;
                        b0Var = new iy.b0(cArr);
                        bVar.f209837d = params2;
                        bVar.f209838e = r16;
                        r25 = r16;
                    } catch (ex.c e48) {
                        e = e48;
                    } catch (CancellationException e49) {
                        throw e49;
                    } catch (Exception e55) {
                        e = e55;
                    }
                } catch (Exception e56) {
                    e = e56;
                }
            } catch (CancellationException e57) {
                throw e57;
            }
        } catch (ex.c e58) {
            e = e58;
        } catch (CancellationException e59) {
            throw e59;
        }
    }
}
