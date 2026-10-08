package c04;

import iy.a0;
import iy.b0;
import iy.c0;
import iy.q;
import iy.r;
import java.security.PrivateKey;
import java.util.concurrent.CancellationException;
import javax.crypto.spec.SecretKeySpec;
import k34.u;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import y00.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096B¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lc04/d;", "Lwz3/c;", "Lpy/a;", "aesKeyDecoder", "Liy/a;", "base64Coder", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "Lzz3/a;", "authenticationContainersInteractor", "Liy/c;", "bytesConverter", "<init>", "(Lpy/a;Liy/a;Ly00/h0;Liy/i;Liy/g;Lzz3/a;Liy/c;)V", "Lrq0/b;", "Lk34/u;", "e", "(Lrq0/b;)Lk34/u;", "Lwz3/c$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lwz3/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpy/a;", "b", "Liy/a;", "c", "Ly00/h0;", "Liy/i;", "Liy/g;", "f", "Lzz3/a;", "g", "Liy/c;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements wz3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.a aesKeyDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.i cipherRsa;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zz3.a authenticationContainersInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f22394h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f22395j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f22396k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f22397l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f22398m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f22399n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f22400p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22401q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f22402r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f22403s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f22404t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f22405v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f22406w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f22407x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f22408y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f22409z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(py.a aVar, iy.a aVar2, h0 h0Var, iy.i iVar, iy.g gVar, zz3.a aVar3, iy.c cVar) {
        this.aesKeyDecoder = aVar;
        this.base64Coder = aVar2;
        this.securityProviderFactory = h0Var;
        this.cipherRsa = iVar;
        this.cipherAes = gVar;
        this.authenticationContainersInteractor = aVar3;
        this.bytesConverter = cVar;
    }

    private final u e(rq0.b bVar) {
        if (bVar == rq0.b.d.ID_CARD) {
            return u.MOBYWATEL;
        }
        if (bVar == rq0.b.d.STUDENT_CARD) {
            return u.STUDENT;
        }
        if (bVar == rq0.b.d.DIIA_REFUGEE_CARD) {
            return u.DIIA;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0533  */
    /* JADX WARN: Code duplicated, block: B:102:0x0537  */
    /* JADX WARN: Code duplicated, block: B:105:0x0544  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x037e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:96:0x0514  */
    /* JADX WARN: Code duplicated, block: B:99:0x0525  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x00f7: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:31:0x00f7 */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x00fc: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:33:0x00fc */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0101: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:35:0x0101 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(wz3.c.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        String str;
        dx.j<dx.b> jVar;
        u uVar;
        wz3.c.Params params2;
        ex.b bVar;
        ex.b bVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        PrivateKey privateKey;
        ex.b bVar3;
        u uVar2;
        String str2;
        byte[] bArr;
        Object objC;
        PrivateKey privateKey2;
        ex.b bVar4;
        byte[] bArr2;
        int i25;
        ex.b bVar5;
        int i26;
        int i27;
        int i28;
        wz3.c.Params params3;
        ex.b bVar6;
        byte[] bArr3;
        byte[] bArr4;
        ex.b bVar7;
        ex.b bVar8;
        String str3;
        PrivateKey privateKey3;
        u uVar3;
        char[] cArr;
        byte[] bArr5;
        byte[] bArr6;
        ?? r15;
        SecretKeySpec secretKeySpec;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        wz3.c.Params params4;
        ex.b bVar9;
        dx.j<dx.b> jVar2;
        byte[] bArr7;
        zz3.a aVar3;
        rq0.b documentType;
        b0 b0VarG;
        a0 a0Var;
        b0 b0Var;
        String str4;
        byte[] bArr8;
        byte[] bArr9;
        int i39;
        PrivateKey privateKey4;
        ?? r16;
        int i45;
        int i46;
        ex.b bVar10;
        char[] cArr2;
        byte[] bArr10;
        ex.b bVar11;
        char[] cArr3;
        byte[] bArr11;
        byte[] bArr12;
        Object objC2;
        ?? r17;
        Object obj;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i47 = aVar.C;
            if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.C = i47 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar4 = aVar;
        Object obj2 = aVar4.A;
        ?? E = uq.b.e();
        int i48 = aVar4.C;
        try {
            try {
                try {
                    if (i48 == 0) {
                        oq.u.b(obj2);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar2 = new ex.a();
                            String name = this.securityProviderFactory.b().getName();
                            this.cipherRsa.a(name);
                            this.cipherAes.a(name);
                            u uVarE = e(params.getDocumentType());
                            if (uVarE == null) {
                                return new dx.i.Left(new dx.b.Generic(null, 1, null));
                            }
                            zz3.a aVar5 = this.authenticationContainersInteractor;
                            aVar4.f22390d = params;
                            aVar4.f22391e = jVarA;
                            aVar4.f22392f = vq.j.a(aVar2);
                            aVar4.f22393g = aVar2;
                            aVar4.f22394h = vq.j.a(name);
                            aVar4.f22395j = vq.j.a(uVarE);
                            aVar4.f22396k = aVar2;
                            i15 = 0;
                            aVar4.f22405v = 0;
                            aVar4.f22406w = 0;
                            aVar4.f22407x = 0;
                            aVar4.f22408y = 0;
                            aVar4.f22409z = 0;
                            aVar4.C = 1;
                            Object objB2 = aVar5.b(uVarE, aVar4);
                            if (objB2 != E) {
                                str = name;
                                jVar = jVarA;
                                uVar = uVarE;
                                obj2 = objB2;
                                params2 = params;
                                bVar = aVar2;
                                bVar2 = bVar;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                privateKey = ((CertKeyPair) aVar2.a((dx.i) obj2)).getPrivateKey();
                                bVar3 = bVar;
                                uVar2 = uVar;
                                str2 = str;
                                bArr = (byte[]) bVar2.a(iy.a.c(this.base64Coder, params2.getCertResponse().getUserCertificate().getPasswordPKCS12Base64(), null, 2, null));
                                iy.i iVar = this.cipherRsa;
                                iy.h.c.C2299c c2299c = iy.h.c.C2299c.f97756b;
                                aVar4.f22390d = params2;
                                aVar4.f22391e = jVar;
                                aVar4.f22392f = vq.j.a(bVar3);
                                aVar4.f22393g = bVar2;
                                aVar4.f22394h = vq.j.a(str2);
                                aVar4.f22395j = privateKey;
                                aVar4.f22396k = vq.j.a(uVar2);
                                aVar4.f22397l = bVar2;
                                aVar4.f22398m = vq.j.a(bArr);
                                aVar4.f22405v = i15;
                                aVar4.f22406w = i19;
                                aVar4.f22407x = i18;
                                aVar4.f22408y = i17;
                                aVar4.f22409z = i16;
                                aVar4.C = 2;
                                objC = iVar.c(bArr, privateKey, c2299c, aVar4);
                                if (objC != E) {
                                    privateKey2 = privateKey;
                                    obj2 = objC;
                                    bVar4 = bVar2;
                                    bArr2 = bArr;
                                    i25 = i19;
                                    bVar5 = bVar3;
                                    i26 = i18;
                                    i27 = i17;
                                    i28 = i16;
                                    params3 = params2;
                                    bVar6 = bVar4;
                                    bArr10 = (byte[]) bVar4.a((dx.i) obj2);
                                    bVar11 = bVar5;
                                    cArr3 = (char[]) bVar6.a(this.bytesConverter.c(bArr10, iy.b.a.f97723a));
                                    bArr11 = bArr2;
                                    PrivateKey privateKey5 = privateKey2;
                                    bArr12 = (byte[]) bVar6.a(iy.a.c(this.base64Coder, params3.getCertResponse().getUserCertificate().getCertPKCS12AESSecretKeyBase64(), null, 2, null));
                                    iy.i iVar2 = this.cipherRsa;
                                    iy.h.c.C2299c c2299c2 = iy.h.c.C2299c.f97756b;
                                    aVar4.f22390d = params3;
                                    aVar4.f22391e = jVar;
                                    aVar4.f22392f = vq.j.a(bVar11);
                                    aVar4.f22393g = bVar6;
                                    aVar4.f22394h = vq.j.a(str2);
                                    aVar4.f22395j = vq.j.a(privateKey5);
                                    aVar4.f22396k = vq.j.a(uVar2);
                                    aVar4.f22397l = bVar6;
                                    aVar4.f22398m = vq.j.a(bArr11);
                                    aVar4.f22399n = vq.j.a(bArr10);
                                    aVar4.f22400p = cArr3;
                                    aVar4.f22401q = vq.j.a(bArr12);
                                    aVar4.f22405v = i15;
                                    aVar4.f22406w = i25;
                                    aVar4.f22407x = i26;
                                    aVar4.f22408y = i27;
                                    aVar4.f22409z = i28;
                                    aVar4.C = 3;
                                    privateKey4 = privateKey5;
                                    objC2 = iVar2.c(bArr12, privateKey4, c2299c2, aVar4);
                                    r17 = E;
                                    if (objC2 == r17) {
                                        return r17;
                                    }
                                    String str5 = str2;
                                    bVar7 = bVar11;
                                    str4 = str5;
                                    bArr4 = bArr10;
                                    bArr8 = bArr12;
                                    obj2 = objC2;
                                    jVar2 = jVar;
                                    i45 = i25;
                                    i39 = i15;
                                    i46 = i27;
                                    i29 = i26;
                                    cArr2 = cArr3;
                                    bVar10 = bVar6;
                                    i37 = i28;
                                    bArr9 = bArr11;
                                    params4 = params3;
                                    bVar9 = bVar10;
                                    r16 = r17;
                                }
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i48 != 1) {
                        if (i48 != 2) {
                            try {
                                if (i48 == 3) {
                                    int i49 = aVar4.f22409z;
                                    int i55 = aVar4.f22408y;
                                    int i56 = aVar4.f22407x;
                                    int i57 = aVar4.f22406w;
                                    int i58 = aVar4.f22405v;
                                    byte[] bArr13 = (byte[]) aVar4.f22401q;
                                    char[] cArr4 = (char[]) aVar4.f22400p;
                                    byte[] bArr14 = (byte[]) aVar4.f22399n;
                                    bArr9 = (byte[]) aVar4.f22398m;
                                    ex.b bVar12 = (ex.b) aVar4.f22397l;
                                    u uVar4 = (u) aVar4.f22396k;
                                    PrivateKey privateKey6 = (PrivateKey) aVar4.f22395j;
                                    str4 = (String) aVar4.f22394h;
                                    ex.b bVar13 = (ex.b) aVar4.f22393g;
                                    bVar7 = (ex.b) aVar4.f22392f;
                                    dx.j<dx.b> jVar3 = (dx.j) aVar4.f22391e;
                                    wz3.c.Params params5 = (wz3.c.Params) aVar4.f22390d;
                                    oq.u.b(obj2);
                                    r16 = E;
                                    jVar2 = jVar3;
                                    bArr4 = bArr14;
                                    i39 = i58;
                                    i45 = i57;
                                    bVar10 = bVar12;
                                    cArr2 = cArr4;
                                    privateKey4 = privateKey6;
                                    i29 = i56;
                                    i37 = i49;
                                    bArr8 = bArr13;
                                    params4 = params5;
                                    bVar9 = bVar13;
                                    uVar2 = uVar4;
                                    i46 = i55;
                                } else if (i48 == 4) {
                                    int i59 = aVar4.f22409z;
                                    i38 = aVar4.f22408y;
                                    int i65 = aVar4.f22407x;
                                    i36 = aVar4.f22406w;
                                    i35 = aVar4.f22405v;
                                    byte[] bArr15 = (byte[]) aVar4.f22404t;
                                    secretKeySpec = (SecretKeySpec) aVar4.f22403s;
                                    byte[] bArr16 = (byte[]) aVar4.f22402r;
                                    byte[] bArr17 = (byte[]) aVar4.f22401q;
                                    char[] cArr5 = (char[]) aVar4.f22400p;
                                    byte[] bArr18 = (byte[]) aVar4.f22399n;
                                    byte[] bArr19 = (byte[]) aVar4.f22398m;
                                    ex.b bVar14 = (ex.b) aVar4.f22397l;
                                    uVar3 = (u) aVar4.f22396k;
                                    privateKey3 = (PrivateKey) aVar4.f22395j;
                                    str3 = (String) aVar4.f22394h;
                                    bVar8 = (ex.b) aVar4.f22393g;
                                    bVar7 = (ex.b) aVar4.f22392f;
                                    dx.j<dx.b> jVar4 = (dx.j) aVar4.f22391e;
                                    wz3.c.Params params6 = (wz3.c.Params) aVar4.f22390d;
                                    oq.u.b(obj2);
                                    r15 = E;
                                    jVar2 = jVar4;
                                    bArr4 = bArr18;
                                    cArr = cArr5;
                                    bArr5 = bArr17;
                                    bArr6 = bArr16;
                                    bArr3 = bArr19;
                                    bArr7 = bArr15;
                                    params4 = params6;
                                    i29 = i65;
                                    bVar9 = bVar14;
                                    i37 = i59;
                                    byte[] bArr20 = (byte[]) bVar9.a((dx.i) obj2);
                                    byte[] bArr21 = bArr7;
                                    aVar3 = this.authenticationContainersInteractor;
                                    wz3.c.Params params7 = params4;
                                    documentType = params7.getDocumentType();
                                    b0VarG = c0.g(params7.getCertResponse().getPeselTicket());
                                    a0Var = new a0(bArr20);
                                    b0Var = new b0(cArr);
                                    aVar4.f22390d = vq.j.a(params7);
                                    aVar4.f22391e = jVar2;
                                    aVar4.f22392f = vq.j.a(bVar7);
                                    aVar4.f22393g = vq.j.a(bVar8);
                                    aVar4.f22394h = vq.j.a(str3);
                                    aVar4.f22395j = vq.j.a(privateKey3);
                                    aVar4.f22396k = vq.j.a(uVar3);
                                    aVar4.f22397l = vq.j.a(bArr3);
                                    aVar4.f22398m = vq.j.a(bArr4);
                                    aVar4.f22399n = vq.j.a(cArr);
                                    aVar4.f22400p = vq.j.a(bArr5);
                                    aVar4.f22401q = vq.j.a(bArr6);
                                    aVar4.f22402r = vq.j.a(secretKeySpec);
                                    aVar4.f22403s = vq.j.a(bArr21);
                                    aVar4.f22404t = vq.j.a(bArr20);
                                    aVar4.f22405v = i35;
                                    aVar4.f22406w = i36;
                                    aVar4.f22407x = i29;
                                    aVar4.f22408y = i38;
                                    aVar4.f22409z = i37;
                                    aVar4.C = 5;
                                    if (aVar3.c(documentType, b0VarG, a0Var, b0Var, aVar4) == r15) {
                                        return r15;
                                    }
                                } else {
                                    if (i48 != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    oq.u.b(obj2);
                                }
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                E = obj;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            int i66 = aVar4.f22409z;
                            int i67 = aVar4.f22408y;
                            int i68 = aVar4.f22407x;
                            int i69 = aVar4.f22406w;
                            int i75 = aVar4.f22405v;
                            byte[] bArr22 = (byte[]) aVar4.f22398m;
                            ex.b bVar15 = (ex.b) aVar4.f22397l;
                            u uVar5 = (u) aVar4.f22396k;
                            privateKey2 = (PrivateKey) aVar4.f22395j;
                            String str6 = (String) aVar4.f22394h;
                            bVar6 = (ex.b) aVar4.f22393g;
                            ex.b bVar16 = (ex.b) aVar4.f22392f;
                            dx.j<dx.b> jVar5 = (dx.j) aVar4.f22391e;
                            params3 = (wz3.c.Params) aVar4.f22390d;
                            try {
                                oq.u.b(obj2);
                                i27 = i67;
                                i28 = i66;
                                uVar2 = uVar5;
                                bVar4 = bVar15;
                                bArr2 = bArr22;
                                i15 = i75;
                                i25 = i69;
                                bVar5 = bVar16;
                                i26 = i68;
                                str2 = str6;
                                jVar = jVar5;
                                bArr10 = (byte[]) bVar4.a((dx.i) obj2);
                                bVar11 = bVar5;
                                cArr3 = (char[]) bVar6.a(this.bytesConverter.c(bArr10, iy.b.a.f97723a));
                                bArr11 = bArr2;
                                PrivateKey privateKey7 = privateKey2;
                                bArr12 = (byte[]) bVar6.a(iy.a.c(this.base64Coder, params3.getCertResponse().getUserCertificate().getCertPKCS12AESSecretKeyBase64(), null, 2, null));
                                iy.i iVar3 = this.cipherRsa;
                                iy.h.c.C2299c c2299c3 = iy.h.c.C2299c.f97756b;
                                aVar4.f22390d = params3;
                                aVar4.f22391e = jVar;
                                aVar4.f22392f = vq.j.a(bVar11);
                                aVar4.f22393g = bVar6;
                                aVar4.f22394h = vq.j.a(str2);
                                aVar4.f22395j = vq.j.a(privateKey7);
                                aVar4.f22396k = vq.j.a(uVar2);
                                aVar4.f22397l = bVar6;
                                aVar4.f22398m = vq.j.a(bArr11);
                                aVar4.f22399n = vq.j.a(bArr10);
                                aVar4.f22400p = cArr3;
                                aVar4.f22401q = vq.j.a(bArr12);
                                aVar4.f22405v = i15;
                                aVar4.f22406w = i25;
                                aVar4.f22407x = i26;
                                aVar4.f22408y = i27;
                                aVar4.f22409z = i28;
                                aVar4.C = 3;
                                privateKey4 = privateKey7;
                                objC2 = iVar3.c(bArr12, privateKey4, c2299c3, aVar4);
                                r17 = E;
                                if (objC2 == r17) {
                                    return r17;
                                }
                                String str7 = str2;
                                bVar7 = bVar11;
                                str4 = str7;
                                bArr4 = bArr10;
                                bArr8 = bArr12;
                                obj2 = objC2;
                                jVar2 = jVar;
                                i45 = i25;
                                i39 = i15;
                                i46 = i27;
                                i29 = i26;
                                cArr2 = cArr3;
                                bVar10 = bVar6;
                                i37 = i28;
                                bArr9 = bArr11;
                                params4 = params3;
                                bVar9 = bVar10;
                                r16 = r17;
                            } catch (ex.c e26) {
                                e = e26;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            } catch (Exception e28) {
                                e = e28;
                                E = jVar5;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        return new dx.i.Right(i0.f148189a);
                    }
                    i16 = aVar4.f22409z;
                    i17 = aVar4.f22408y;
                    i18 = aVar4.f22407x;
                    int i76 = aVar4.f22406w;
                    int i77 = aVar4.f22405v;
                    aVar2 = (ex.b) aVar4.f22396k;
                    u uVar6 = (u) aVar4.f22395j;
                    String str8 = (String) aVar4.f22394h;
                    ex.b bVar17 = (ex.b) aVar4.f22393g;
                    ex.b bVar18 = (ex.b) aVar4.f22392f;
                    jVar = (dx.j) aVar4.f22391e;
                    params2 = (wz3.c.Params) aVar4.f22390d;
                    try {
                        oq.u.b(obj2);
                        i19 = i76;
                        bVar = bVar18;
                        str = str8;
                        bVar2 = bVar17;
                        uVar = uVar6;
                        i15 = i77;
                        privateKey = ((CertKeyPair) aVar2.a((dx.i) obj2)).getPrivateKey();
                        bVar3 = bVar;
                        uVar2 = uVar;
                        str2 = str;
                        bArr = (byte[]) bVar2.a(iy.a.c(this.base64Coder, params2.getCertResponse().getUserCertificate().getPasswordPKCS12Base64(), null, 2, null));
                        iy.i iVar4 = this.cipherRsa;
                        iy.h.c.C2299c c2299c4 = iy.h.c.C2299c.f97756b;
                        aVar4.f22390d = params2;
                        aVar4.f22391e = jVar;
                        aVar4.f22392f = vq.j.a(bVar3);
                        aVar4.f22393g = bVar2;
                        aVar4.f22394h = vq.j.a(str2);
                        aVar4.f22395j = privateKey;
                        aVar4.f22396k = vq.j.a(uVar2);
                        aVar4.f22397l = bVar2;
                        aVar4.f22398m = vq.j.a(bArr);
                        aVar4.f22405v = i15;
                        aVar4.f22406w = i19;
                        aVar4.f22407x = i18;
                        aVar4.f22408y = i17;
                        aVar4.f22409z = i16;
                        aVar4.C = 2;
                        objC = iVar4.c(bArr, privateKey, c2299c4, aVar4);
                        if (objC != E) {
                            return E;
                        }
                        privateKey2 = privateKey;
                        obj2 = objC;
                        bVar4 = bVar2;
                        bArr2 = bArr;
                        i25 = i19;
                        bVar5 = bVar3;
                        i26 = i18;
                        i27 = i17;
                        i28 = i16;
                        params3 = params2;
                        bVar6 = bVar4;
                        bArr10 = (byte[]) bVar4.a((dx.i) obj2);
                        bVar11 = bVar5;
                        cArr3 = (char[]) bVar6.a(this.bytesConverter.c(bArr10, iy.b.a.f97723a));
                        bArr11 = bArr2;
                        PrivateKey privateKey8 = privateKey2;
                        bArr12 = (byte[]) bVar6.a(iy.a.c(this.base64Coder, params3.getCertResponse().getUserCertificate().getCertPKCS12AESSecretKeyBase64(), null, 2, null));
                        iy.i iVar5 = this.cipherRsa;
                        iy.h.c.C2299c c2299c5 = iy.h.c.C2299c.f97756b;
                        aVar4.f22390d = params3;
                        aVar4.f22391e = jVar;
                        aVar4.f22392f = vq.j.a(bVar11);
                        aVar4.f22393g = bVar6;
                        aVar4.f22394h = vq.j.a(str2);
                        aVar4.f22395j = vq.j.a(privateKey8);
                        aVar4.f22396k = vq.j.a(uVar2);
                        aVar4.f22397l = bVar6;
                        aVar4.f22398m = vq.j.a(bArr11);
                        aVar4.f22399n = vq.j.a(bArr10);
                        aVar4.f22400p = cArr3;
                        aVar4.f22401q = vq.j.a(bArr12);
                        aVar4.f22405v = i15;
                        aVar4.f22406w = i25;
                        aVar4.f22407x = i26;
                        aVar4.f22408y = i27;
                        aVar4.f22409z = i28;
                        aVar4.C = 3;
                        privateKey4 = privateKey8;
                        objC2 = iVar5.c(bArr12, privateKey4, c2299c5, aVar4);
                        r17 = E;
                        if (objC2 == r17) {
                            return r17;
                        }
                        String str9 = str2;
                        bVar7 = bVar11;
                        str4 = str9;
                        bArr4 = bArr10;
                        bArr8 = bArr12;
                        obj2 = objC2;
                        jVar2 = jVar;
                        i45 = i25;
                        i39 = i15;
                        i46 = i27;
                        i29 = i26;
                        cArr2 = cArr3;
                        bVar10 = bVar6;
                        i37 = i28;
                        bArr9 = bArr11;
                        params4 = params3;
                        bVar9 = bVar10;
                        r16 = r17;
                    } catch (ex.c e29) {
                        e = e29;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    } catch (Exception e36) {
                        e = e36;
                        E = jVar;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                    byte[] bArr23 = (byte[]) bVar10.a((dx.i) obj2);
                    SecretKeySpec secretKeySpec2 = (SecretKeySpec) bVar9.a(this.aesKeyDecoder.a(bArr23));
                    PrivateKey privateKey9 = privateKey4;
                    bArr3 = bArr9;
                    ?? r25 = r16;
                    byte[] bArr24 = (byte[]) bVar9.a(iy.a.c(this.base64Coder, params4.getCertResponse().getUserCertificate().getCertPKCS12Base64(), null, 2, null));
                    iy.g gVar = this.cipherAes;
                    iy.h.a.C2298a c2298a = new iy.h.a.C2298a(new r.c(16, q.Suffix), 17);
                    aVar4.f22390d = params4;
                    aVar4.f22391e = jVar2;
                    aVar4.f22392f = vq.j.a(bVar7);
                    aVar4.f22393g = vq.j.a(bVar9);
                    aVar4.f22394h = vq.j.a(str4);
                    aVar4.f22395j = vq.j.a(privateKey9);
                    aVar4.f22396k = vq.j.a(uVar2);
                    aVar4.f22397l = bVar9;
                    aVar4.f22398m = vq.j.a(bArr3);
                    aVar4.f22399n = vq.j.a(bArr4);
                    aVar4.f22400p = cArr2;
                    aVar4.f22401q = vq.j.a(bArr8);
                    aVar4.f22402r = vq.j.a(bArr23);
                    aVar4.f22403s = vq.j.a(secretKeySpec2);
                    aVar4.f22404t = vq.j.a(bArr24);
                    aVar4.f22405v = i39;
                    aVar4.f22406w = i45;
                    aVar4.f22407x = i29;
                    aVar4.f22408y = i46;
                    aVar4.f22409z = i37;
                    aVar4.C = 4;
                    Object objD = gVar.d(bArr24, secretKeySpec2, c2298a, aVar4);
                    ?? r18 = r25;
                    if (objD == r18) {
                        return r18;
                    }
                    bArr6 = bArr23;
                    obj2 = objD;
                    bArr7 = bArr24;
                    i36 = i45;
                    secretKeySpec = secretKeySpec2;
                    cArr = cArr2;
                    i38 = i46;
                    i35 = i39;
                    bArr5 = bArr8;
                    uVar3 = uVar2;
                    privateKey3 = privateKey9;
                    str3 = str4;
                    bVar8 = bVar9;
                    r15 = r18;
                    byte[] bArr25 = (byte[]) bVar9.a((dx.i) obj2);
                    byte[] bArr26 = bArr7;
                    aVar3 = this.authenticationContainersInteractor;
                    wz3.c.Params params8 = params4;
                    documentType = params8.getDocumentType();
                    b0VarG = c0.g(params8.getCertResponse().getPeselTicket());
                    a0Var = new a0(bArr25);
                    b0Var = new b0(cArr);
                    aVar4.f22390d = vq.j.a(params8);
                    aVar4.f22391e = jVar2;
                    aVar4.f22392f = vq.j.a(bVar7);
                    aVar4.f22393g = vq.j.a(bVar8);
                    aVar4.f22394h = vq.j.a(str3);
                    aVar4.f22395j = vq.j.a(privateKey3);
                    aVar4.f22396k = vq.j.a(uVar3);
                    aVar4.f22397l = vq.j.a(bArr3);
                    aVar4.f22398m = vq.j.a(bArr4);
                    aVar4.f22399n = vq.j.a(cArr);
                    aVar4.f22400p = vq.j.a(bArr5);
                    aVar4.f22401q = vq.j.a(bArr6);
                    aVar4.f22402r = vq.j.a(secretKeySpec);
                    aVar4.f22403s = vq.j.a(bArr26);
                    aVar4.f22404t = vq.j.a(bArr25);
                    aVar4.f22405v = i35;
                    aVar4.f22406w = i36;
                    aVar4.f22407x = i29;
                    aVar4.f22408y = i38;
                    aVar4.f22409z = i37;
                    aVar4.C = 5;
                    if (aVar3.c(documentType, b0VarG, a0Var, b0Var, aVar4) == r15) {
                        return r15;
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e37) {
                    e = e37;
                }
            } catch (CancellationException e38) {
                throw e38;
            }
        } catch (ex.c e39) {
            e = e39;
        } catch (CancellationException e45) {
            throw e45;
        }
    }
}
