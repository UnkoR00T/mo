package f10;

import dx.i;
import dx.j;
import iy.a0;
import iy.c0;
import iy.g;
import iy.h;
import iy.q;
import iy.r;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf10/f;", "Lf10/e;", "Liy/g;", "cipherAes", "<init>", "(Liy/g;)V", "Ljavax/crypto/SecretKey;", "masterKey", "passwordKey", "deviceKey", "Ldx/i;", "Ldx/b;", "Lqy/b;", "a", "(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "wrappedMasterKey", "b", "(Liy/a0;Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "Liy/g;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g cipherAes;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f55055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f55056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f55057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f55058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f55059h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f55060j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f55061k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f55062l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f55063m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55064n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f55065p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f55066q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55067r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f55068s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f55070v;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f55068s = obj;
            this.f55070v |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f55071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f55072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f55073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f55074g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f55075h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f55076j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f55077k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f55078l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f55079m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f55080n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f55081p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f55082q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55083r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f55084s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f55085t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f55086v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f55087w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f55088x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f55090z;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f55088x = obj;
            this.f55090z |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, null, null, this);
        }
    }

    public f(g gVar) {
        this.cipherAes = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x025f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0267  */
    /* JADX WARN: Code duplicated, block: B:58:0x0268 A[Catch: Exception -> 0x0059, c -> 0x005c, CancellationException -> 0x005f, TryCatch #10 {Exception -> 0x0059, blocks: (B:14:0x0054, B:55:0x0261, B:61:0x0286, B:58:0x0268, B:60:0x026c, B:62:0x029a, B:63:0x029f, B:70:0x02a9, B:73:0x02b7, B:47:0x018f, B:43:0x012c), top: B:88:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x026c A[Catch: Exception -> 0x0059, c -> 0x005c, CancellationException -> 0x005f, TryCatch #10 {Exception -> 0x0059, blocks: (B:14:0x0054, B:55:0x0261, B:61:0x0286, B:58:0x0268, B:60:0x026c, B:62:0x029a, B:63:0x029f, B:70:0x02a9, B:73:0x02b7, B:47:0x018f, B:43:0x012c), top: B:88:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x029a A[Catch: Exception -> 0x0059, c -> 0x005c, CancellationException -> 0x005f, TryCatch #10 {Exception -> 0x0059, blocks: (B:14:0x0054, B:55:0x0261, B:61:0x0286, B:58:0x0268, B:60:0x026c, B:62:0x029a, B:63:0x029f, B:70:0x02a9, B:73:0x02b7, B:47:0x018f, B:43:0x012c), top: B:88:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02df  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // f10.e
    public Object a(SecretKey secretKey, SecretKey secretKey2, SecretKey secretKey3, tq.e<? super i<? extends dx.b, qy.b>> eVar) throws Throwable {
        c cVar;
        String message;
        i iVarA;
        Object objB;
        j<dx.b> jVarA;
        ex.b aVar;
        SecretKey secretKey4;
        Object objC;
        SecretKey secretKey5;
        SecretKey secretKey6;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        byte[] bArr;
        SecretKey secretKey7;
        ex.b bVar3;
        SecretKey secretKey8;
        byte[] bArr2;
        h.a.b bVar4;
        ex.b bVar5;
        Object obj;
        j<dx.b> jVar;
        g gVar;
        int i25;
        int i26;
        int i27;
        ex.b bVar6;
        ex.b bVar7;
        i right;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i28 = cVar.f55090z;
            if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f55090z = i28 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objG = cVar.f55088x;
        Object objE = uq.b.e();
        ?? r15 = cVar.f55090z;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(objG);
                        jVarA = xw.c.f221622a.a();
                        aVar = new ex.a();
                        g gVar2 = this.cipherAes;
                        h.a.c cVar2 = new h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                        cVar.f55071d = vq.j.a(secretKey);
                        cVar.f55072e = vq.j.a(secretKey2);
                        cVar.f55073f = secretKey3;
                        cVar.f55074g = jVarA;
                        cVar.f55075h = vq.j.a(aVar);
                        cVar.f55076j = aVar;
                        cVar.f55077k = aVar;
                        cVar.f55083r = 0;
                        cVar.f55084s = 0;
                        cVar.f55085t = 0;
                        cVar.f55086v = 0;
                        cVar.f55087w = 0;
                        cVar.f55090z = 1;
                        secretKey4 = secretKey;
                        objC = gVar2.c(secretKey4, secretKey2, cVar2, cVar);
                        if (objC != objE) {
                            secretKey5 = secretKey3;
                            secretKey6 = secretKey2;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar;
                            bVar2 = bVar;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        if (r15 == 2) {
                            int i29 = cVar.f55087w;
                            int i35 = cVar.f55086v;
                            int i36 = cVar.f55085t;
                            int i37 = cVar.f55084s;
                            int i38 = cVar.f55083r;
                            byte[] bArr3 = (byte[]) cVar.f55082q;
                            ex.b bVar8 = (ex.b) cVar.f55081p;
                            h.a.b bVar9 = (h.a.b) cVar.f55080n;
                            byte[] bArr4 = (byte[]) cVar.f55079m;
                            g gVar3 = (g) cVar.f55078l;
                            ex.b bVar10 = (ex.b) cVar.f55077k;
                            ex.b bVar11 = (ex.b) cVar.f55076j;
                            ex.b bVar12 = (ex.b) cVar.f55075h;
                            j<dx.b> jVar2 = (j) cVar.f55074g;
                            SecretKey secretKey9 = (SecretKey) cVar.f55073f;
                            SecretKey secretKey10 = (SecretKey) cVar.f55072e;
                            SecretKey secretKey11 = (SecretKey) cVar.f55071d;
                            try {
                                u.b(objG);
                                bVar5 = bVar8;
                                bVar6 = bVar11;
                                i16 = i35;
                                jVar = jVar2;
                                secretKey8 = secretKey10;
                                secretKey7 = secretKey11;
                                bArr = bArr3;
                                aVar = bVar12;
                                obj = objG;
                                bArr2 = bArr4;
                                i25 = i38;
                                i17 = i36;
                                i26 = i29;
                                gVar = gVar3;
                                secretKey5 = secretKey9;
                                bVar4 = bVar9;
                                i27 = i37;
                                bVar3 = bVar10;
                                try {
                                    Cipher cipher = (Cipher) bVar5.a((i) obj);
                                    cVar.f55071d = vq.j.a(secretKey7);
                                    cVar.f55072e = vq.j.a(secretKey8);
                                    cVar.f55073f = vq.j.a(secretKey5);
                                    cVar.f55074g = jVar;
                                    cVar.f55075h = vq.j.a(aVar);
                                    cVar.f55076j = vq.j.a(bVar6);
                                    cVar.f55077k = bVar3;
                                    cVar.f55078l = vq.j.a(bArr2);
                                    cVar.f55079m = vq.j.a(bVar4);
                                    cVar.f55080n = null;
                                    cVar.f55081p = null;
                                    cVar.f55082q = null;
                                    cVar.f55083r = i25;
                                    cVar.f55084s = i27;
                                    cVar.f55085t = i17;
                                    cVar.f55086v = i16;
                                    cVar.f55087w = i26;
                                    cVar.f55090z = 3;
                                    objG = gVar.g(bArr, cipher, bVar4, cVar);
                                    if (objG != objE) {
                                        bVar7 = bVar3;
                                    }
                                    return objE;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r15 = jVar;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof i.Right)) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            } catch (ex.c e18) {
                                e = e18;
                                return new i.Left((dx.b) ex.d.a(e));
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
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar7 = (ex.b) cVar.f55077k;
                        u.b(objG);
                        right = (i) objG;
                        if (!(right instanceof i.Left)) {
                            if (right instanceof i.Right) {
                                throw new p();
                            }
                            right = new i.Right(qy.b.a(qy.b.b(c0.f((byte[]) ((i.Right) right).b()))));
                        }
                        return new i.Right(qy.b.a(((qy.b) bVar7.a(right)).getValue()));
                    }
                    int i39 = cVar.f55087w;
                    int i45 = cVar.f55086v;
                    int i46 = cVar.f55085t;
                    int i47 = cVar.f55084s;
                    int i48 = cVar.f55083r;
                    ex.b bVar13 = (ex.b) cVar.f55077k;
                    ex.b bVar14 = (ex.b) cVar.f55076j;
                    ex.b bVar15 = (ex.b) cVar.f55075h;
                    j<dx.b> jVar3 = (j) cVar.f55074g;
                    secretKey5 = (SecretKey) cVar.f55073f;
                    secretKey6 = (SecretKey) cVar.f55072e;
                    secretKey4 = (SecretKey) cVar.f55071d;
                    try {
                        u.b(objG);
                        bVar = bVar14;
                        i18 = i47;
                        i16 = i45;
                        jVarA = jVar3;
                        bVar2 = bVar13;
                        aVar = bVar15;
                        i19 = i48;
                        i17 = i46;
                        i15 = i39;
                        objC = objG;
                    } catch (ex.c e26) {
                        e = e26;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        r15 = jVar3;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                    bArr = (byte[]) bVar2.a((i) objC);
                    SecretKey secretKey12 = secretKey6;
                    secretKey7 = secretKey4;
                    h.a.b bVar16 = new h.a.b(0, new r.a(0, 1, null), 16, 1, null);
                    g gVar4 = this.cipherAes;
                    cVar.f55071d = vq.j.a(secretKey7);
                    cVar.f55072e = vq.j.a(secretKey12);
                    cVar.f55073f = vq.j.a(secretKey5);
                    cVar.f55074g = jVarA;
                    cVar.f55075h = vq.j.a(aVar);
                    cVar.f55076j = vq.j.a(bVar);
                    bVar3 = bVar;
                    cVar.f55077k = bVar3;
                    cVar.f55078l = gVar4;
                    cVar.f55079m = vq.j.a(bArr);
                    cVar.f55080n = bVar16;
                    cVar.f55081p = bVar3;
                    cVar.f55082q = bArr;
                    cVar.f55083r = i19;
                    cVar.f55084s = i18;
                    cVar.f55085t = i17;
                    cVar.f55086v = i16;
                    cVar.f55087w = i15;
                    cVar.f55090z = 2;
                    Object objI = gVar4.i(secretKey5, bVar16, cVar);
                    if (objI != objE) {
                        secretKey8 = secretKey12;
                        bArr2 = bArr;
                        bVar4 = bVar16;
                        bVar5 = bVar3;
                        obj = objI;
                        jVar = jVarA;
                        gVar = gVar4;
                        i25 = i19;
                        i26 = i15;
                        i27 = i18;
                        bVar6 = bVar5;
                        Cipher cipher2 = (Cipher) bVar5.a((i) obj);
                        cVar.f55071d = vq.j.a(secretKey7);
                        cVar.f55072e = vq.j.a(secretKey8);
                        cVar.f55073f = vq.j.a(secretKey5);
                        cVar.f55074g = jVar;
                        cVar.f55075h = vq.j.a(aVar);
                        cVar.f55076j = vq.j.a(bVar6);
                        cVar.f55077k = bVar3;
                        cVar.f55078l = vq.j.a(bArr2);
                        cVar.f55079m = vq.j.a(bVar4);
                        cVar.f55080n = null;
                        cVar.f55081p = null;
                        cVar.f55082q = null;
                        cVar.f55083r = i25;
                        cVar.f55084s = i27;
                        cVar.f55085t = i17;
                        cVar.f55086v = i16;
                        cVar.f55087w = i26;
                        cVar.f55090z = 3;
                        objG = gVar.g(bArr, cipher2, bVar4, cVar);
                        if (objG != objE) {
                            bVar7 = bVar3;
                            right = (i) objG;
                            if (!(right instanceof i.Left)) {
                                if (right instanceof i.Right) {
                                    throw new p();
                                }
                                right = new i.Right(qy.b.a(qy.b.b(c0.f((byte[]) ((i.Right) right).b()))));
                            }
                            return new i.Right(qy.b.a(((qy.b) bVar7.a(right)).getValue()));
                        }
                    }
                    return objE;
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // f10.e
    public Object b(a0 a0Var, SecretKey secretKey, SecretKey secretKey2, tq.e<? super i<? extends dx.b, ? extends SecretKey>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        ex.b bVar2;
        SecretKey secretKey3;
        SecretKey secretKey4;
        a0 a0Var2;
        int i17;
        j<dx.b> jVarA;
        ex.b bVar3;
        ex.b bVar4;
        int i18;
        int i19;
        ex.b bVar5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f55070v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f55070v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objJ = bVar.f55068s;
        Object objE = uq.b.e();
        ?? r15 = bVar.f55070v;
        try {
            try {
                if (r15 == 0) {
                    u.b(objJ);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    g gVar = this.cipherAes;
                    byte[] data = a0Var.getData();
                    i17 = 0;
                    h.a.b bVar6 = new h.a.b(0, new r.a(0, 1, null), 16, 1, null);
                    bVar.f55055d = vq.j.a(a0Var);
                    bVar.f55056e = secretKey;
                    bVar.f55057f = vq.j.a(secretKey2);
                    bVar.f55058g = jVarA;
                    bVar.f55059h = vq.j.a(aVar);
                    bVar.f55060j = aVar;
                    bVar.f55061k = aVar;
                    bVar.f55063m = 0;
                    bVar.f55064n = 0;
                    bVar.f55065p = 0;
                    bVar.f55066q = 0;
                    bVar.f55067r = 0;
                    bVar.f55070v = 1;
                    objJ = gVar.d(data, secretKey2, bVar6, bVar);
                    if (objJ != objE) {
                        a0Var2 = a0Var;
                        secretKey3 = secretKey2;
                        secretKey4 = secretKey;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        bVar2 = aVar;
                        bVar4 = bVar2;
                        bVar3 = bVar4;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = bVar.f55067r;
                        i15 = bVar.f55066q;
                        i16 = bVar.f55065p;
                        int i27 = bVar.f55064n;
                        int i28 = bVar.f55063m;
                        ex.b bVar7 = (ex.b) bVar.f55061k;
                        bVar2 = (ex.b) bVar.f55060j;
                        ex.b bVar8 = (ex.b) bVar.f55059h;
                        j<dx.b> jVar = (j) bVar.f55058g;
                        secretKey3 = (SecretKey) bVar.f55057f;
                        secretKey4 = (SecretKey) bVar.f55056e;
                        a0Var2 = (a0) bVar.f55055d;
                        try {
                            u.b(objJ);
                            i17 = i26;
                            jVarA = jVar;
                            bVar3 = bVar8;
                            bVar4 = bVar7;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
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
                            i iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar5 = (ex.b) bVar.f55061k;
                        u.b(objJ);
                    }
                    return new i.Right((SecretKey) bVar5.a((i) objJ));
                } catch (CancellationException e18) {
                    throw e18;
                }
                byte[] bArr = (byte[]) bVar4.a((i) objJ);
                g gVar2 = this.cipherAes;
                h.a.c cVar = new h.a.c(null, 0, new r.c(12, q.Suffix), 0, 3, null);
                bVar.f55055d = vq.j.a(a0Var2);
                bVar.f55056e = vq.j.a(secretKey4);
                bVar.f55057f = vq.j.a(secretKey3);
                bVar.f55058g = jVarA;
                bVar.f55059h = vq.j.a(bVar3);
                bVar.f55060j = vq.j.a(bVar2);
                bVar.f55061k = bVar2;
                bVar.f55062l = vq.j.a(bArr);
                bVar.f55063m = i18;
                bVar.f55064n = i19;
                bVar.f55065p = i16;
                bVar.f55066q = i15;
                bVar.f55067r = i17;
                bVar.f55070v = 2;
                objJ = gVar2.j(bArr, secretKey4, cVar, bVar);
                if (objJ != objE) {
                    bVar5 = bVar2;
                    return new i.Right((SecretKey) bVar5.a((i) objJ));
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
