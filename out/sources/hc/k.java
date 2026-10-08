package hc;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessInfoMessage;
import fr.t;
import fu.r;
import ic.m;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import oq.u;
import oq.z;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import p005Con.i1;
import p019auX.e1;
import p027coN.f2;
import p027coN.g2;
import p027coN.h2;
import p027coN.i2;
import p027coN.m2;
import p027coN.s2;
import p028con.d3;
import p028con.j3;
import p028con.m3;
import p028con.n3;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INfcService f83082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AUX.a f83083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n3 f83084c = n3.Can;

    public k(INfcService iNfcService, AUX.a aVar) {
        this.f83082a = iNfcService;
        this.f83083b = aVar;
    }

    public final Object a(String str, m mVar, e1 e1Var) {
        byte[] bArrH;
        if (str.length() == 6) {
            bArrH = r.D(str);
        } else {
            this.f83084c = n3.Mrz;
            AUX.a aVar = this.f83083b;
            byte[] bArrD = r.D(str);
            j3 j3Var = j3.SHA1;
            aVar.getClass();
            bArrH = n.H(new byte[0], MessageDigest.getInstance("SHA-1").digest(bArrD));
        }
        return b(bArrH, mVar, e1Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0485  */
    /* JADX WARN: Code duplicated, block: B:103:0x048f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0497  */
    /* JADX WARN: Code duplicated, block: B:107:0x049f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[PHI: r1 r2 r5 r15
      0x0071: PHI (r1v22 ??) = (r1v56 ??), (r1v57 ??) binds: [B:85:0x031f, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r2v62 java.lang.Object) = (r2v58 java.lang.Object), (r2v1 java.lang.Object) binds: [B:85:0x031f, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r5v10 con.d3) = (r5v9 con.d3), (r5v21 con.d3) binds: [B:85:0x031f, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r15v6 ic.m) = (r15v5 ic.m), (r15v13 ic.m) binds: [B:85:0x031f, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0223  */
    /* JADX WARN: Code duplicated, block: B:58:0x0235  */
    /* JADX WARN: Code duplicated, block: B:60:0x0291  */
    /* JADX WARN: Code duplicated, block: B:61:0x0294  */
    /* JADX WARN: Code duplicated, block: B:64:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0330  */
    /* JADX WARN: Code duplicated, block: B:92:0x0419  */
    /* JADX WARN: Code duplicated, block: B:95:0x042c  */
    /* JADX WARN: Code duplicated, block: B:97:0x045a  */
    /* JADX WARN: Code duplicated, block: B:99:0x047b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v17, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r2v31, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v12, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r7v10, types: [byte[], java.io.Serializable] */
    public final Object b(byte[] bArr, m mVar, vq.d dVar) throws Throwable {
        j jVar;
        d3 d3Var;
        String str;
        byte[] bArr2;
        d3 d3Var2;
        m mVar2;
        String str2;
        d3 d3Var3;
        byte[] bArr3;
        m2 m2Var;
        ?? DoFinal;
        Object objTransreceive;
        ?? r15;
        m2 m2Var2;
        jc.a aVar;
        byte[] bArr4;
        X9ECParameters x9ECParameters;
        ECPoint eCPointNormalize;
        X9ECParameters x9ECParameters2;
        Integer numValueOf;
        ECPoint eCPointNormalize2;
        ECPoint eCPointMultiply;
        ECCurve curve;
        ECPoint g15;
        ECPoint eCPointMultiply2;
        ECPoint eCPointAdd;
        ?? r16;
        d3 d3Var4;
        ?? r17;
        m2 m2Var3;
        ?? A1;
        byte[] bArrA1;
        Object objTransreceive2;
        byte[] bArr5;
        ?? r18;
        m mVar3;
        ?? r19;
        d3 d3Var5;
        m2 m2Var4;
        String strA;
        byte[] bArr6;
        m mVar4 = mVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i15 = jVar.f83081l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f83081l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(this, dVar);
            }
        } else {
            jVar = new j(this, dVar);
        }
        Object objTransreceive3 = jVar.f83079j;
        Object objE = uq.b.e();
        int i16 = jVar.f83081l;
        int i17 = 3;
        if (i16 == 0) {
            u.b(objTransreceive3);
            String str3 = mVar4.f90890b.f101385b;
            if (r.b0(str3, "DES", true)) {
                d3Var = d3.f37100b;
            } else if (r.d0(str3, "128", false, 2, null)) {
                d3Var = d3.f37101c;
            } else if (r.d0(str3, "192", false, 2, null)) {
                d3Var = d3.f37102d;
            } else {
                if (!r.d0(str3, "256", false, 2, null)) {
                    throw new gc.i("PACE exception: protocol description does not contain any supported block cipher algorithm", gc.h.UnsupportedCipherAlgorithm);
                }
                d3Var = d3.f37103e;
            }
            str = r.b0(mVar4.f90890b.f101385b, "DES", true) ? "secp256r1" : "brainpoolp384r1";
            s2 s2Var = new s2(mVar4.f90890b, this.f83084c.f37142a);
            INfcService iNfcService = this.f83082a;
            byte[] bArrA = s2Var.a();
            bArr2 = bArr;
            jVar.f83074d = bArr2;
            jVar.f83075e = mVar4;
            jVar.f83076f = d3Var;
            jVar.f83077g = str;
            jVar.f83081l = 1;
            Object objTransreceive4 = iNfcService.transreceive(bArrA, jVar);
            if (objTransreceive4 != objE) {
                d3Var2 = d3Var;
                objTransreceive3 = objTransreceive4;
            }
            return objE;
        }
        if (i16 == 1) {
            String str4 = (String) jVar.f83077g;
            d3 d3Var6 = (d3) jVar.f83076f;
            m mVar5 = (m) jVar.f83075e;
            bArr2 = (byte[]) jVar.f83074d;
            u.b(objTransreceive3);
            str = str4;
            mVar4 = mVar5;
            d3Var2 = d3Var6;
        } else {
            if (i16 == 2) {
                str2 = (String) jVar.f83077g;
                d3Var3 = (d3) jVar.f83076f;
                mVar2 = (m) jVar.f83075e;
                bArr3 = (byte[]) jVar.f83074d;
                u.b(objTransreceive3);
                i17 = 3;
                m2Var = new m2((byte[]) objTransreceive3);
                if (m2Var.f28660c == m3.Ok) {
                    throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                }
                this.f83083b.getClass();
                byte[] bArrA2 = v.a1(n.c1(AUX.a.a(d3Var3).digest(n.H(bArr3, new byte[]{0, 0, 0, 3})), lr.m.e(d3Var3.f37105a / 8, 16)));
                byte[] bArrA3 = v.a1(v.X0(n.i0(m2Var.f28659b, 4), m2Var.f28659b[i17]));
                this.f83083b.getClass();
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrA2, "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/NOPADDING");
                cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[16]));
                DoFinal = cipher.doFinal(bArrA3, 0, bArrA3.length);
                AUX.a aVar2 = this.f83083b;
                aVar2.getClass();
                X9ECParameters byName = ECNamedCurveTable.getByName(str2);
                byte[] bArr7 = new byte[byName.getCurve().getFieldSize() / 8];
                new SecureRandom().nextBytes(bArr7);
                ECPoint eCPointNormalize3 = byName.getG().multiply(new BigInteger(1, bArr7)).normalize();
                aVar2.f0a = new jc.a(eCPointNormalize3.getEncoded(false), bArr7);
                aVar2.f1b = byName;
                byte[] bArrA4 = new g2(eCPointNormalize3.getEncoded(false)).a();
                INfcService iNfcService2 = this.f83082a;
                jVar.f83074d = mVar2;
                jVar.f83075e = d3Var3;
                jVar.f83076f = DoFinal;
                jVar.f83077g = null;
                jVar.f83081l = i17;
                objTransreceive = iNfcService2.transreceive(bArrA4, jVar);
                if (objTransreceive != objE) {
                    objTransreceive3 = objTransreceive;
                    r15 = DoFinal;
                    m2Var2 = new m2((byte[]) objTransreceive3);
                    if (m2Var2.f28660c != m3.Ok) {
                        throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                    }
                    byte[] bArrA5 = v.a1(v.X0(n.i0(m2Var2.f28659b, 4), z.e(m2Var2.f28659b[3]) & 255));
                    AUX.a aVar3 = this.f83083b;
                    aVar3.getClass();
                    ECCurve curve2 = aVar3.f1b.getCurve();
                    int length = (bArrA5.length - 1) / 2;
                    ECPoint eCPointNormalize4 = curve2.createPoint(new BigInteger(1, v.a1(v.X0(n.i0(bArrA5, 1), length))), new BigInteger(1, v.a1(v.X0(n.i0(bArrA5, length + 1), length)))).normalize();
                    aVar = aVar3.f0a;
                    if (aVar != null) {
                        bArr4 = aVar.f101383b;
                    } else {
                        bArr4 = null;
                    }
                    ECPoint eCPointNormalize5 = eCPointNormalize4.multiply(new BigInteger(1, bArr4)).normalize();
                    x9ECParameters = aVar3.f1b;
                    if (x9ECParameters != null) {
                        eCPointNormalize = null;
                    } else {
                        eCPointNormalize = null;
                    }
                    x9ECParameters2 = aVar3.f1b;
                    if (x9ECParameters2 != null) {
                        numValueOf = null;
                    } else {
                        numValueOf = null;
                    }
                    byte[] bArr8 = new byte[numValueOf.intValue() / 8];
                    new SecureRandom().nextBytes(bArr8);
                    if (eCPointNormalize != null) {
                        eCPointNormalize2 = null;
                    } else {
                        eCPointNormalize2 = null;
                    }
                    aVar3.f0a = new jc.a(eCPointNormalize2.getEncoded(false), bArr8);
                    ?? encoded = eCPointNormalize2.getEncoded(false);
                    byte[] bArrA6 = new i2(encoded).a();
                    INfcService iNfcService3 = this.f83082a;
                    jVar.f83074d = mVar2;
                    jVar.f83075e = d3Var3;
                    jVar.f83076f = encoded;
                    jVar.f83081l = 4;
                    objTransreceive3 = iNfcService3.transreceive(bArrA6, jVar);
                    r16 = encoded;
                    if (objTransreceive3 != objE) {
                        d3Var4 = d3Var3;
                        r17 = r16;
                        m2Var3 = new m2((byte[]) objTransreceive3);
                        if (m2Var3.f28660c == m3.Ok) {
                            throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                        }
                        byte[] bArrA7 = v.a1(v.X0(n.i0(m2Var3.f28659b, 4), z.e(m2Var3.f28659b[3]) & 255));
                        AUX.a aVar4 = this.f83083b;
                        aVar4.getClass();
                        ECCurve curve3 = aVar4.f1b.getCurve();
                        int length2 = (bArrA7.length - 1) / 2;
                        byte[] encoded2 = curve3.createPoint(new BigInteger(1, v.a1(v.X0(n.i0(bArrA7, 1), length2))), new BigInteger(1, v.a1(v.X0(n.i0(bArrA7, length2 + 1), length2)))).normalize().multiply(new BigInteger(1, aVar4.f0a.f101383b)).normalize().getXCoord().getEncoded();
                        this.f83083b.getClass();
                        A1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded2, new byte[]{0, 0, 0, 1})), lr.m.e(d3Var4.f37105a / 8, 16)));
                        this.f83083b.getClass();
                        bArrA1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded2, new byte[]{0, 0, 0, 2})), lr.m.e(d3Var4.f37105a / 8, 16)));
                        AUX.a aVar5 = this.f83083b;
                        byte[] bArr9 = mVar2.f90890b.f101384a;
                        aVar5.getClass();
                        byte[] bArrA8 = new h2(AUX.a.b(bArr9, bArrA7, bArrA1, d3Var4)).a();
                        INfcService iNfcService4 = this.f83082a;
                        jVar.f83074d = mVar2;
                        jVar.f83075e = d3Var4;
                        jVar.f83076f = r17;
                        jVar.f83077g = A1;
                        jVar.f83078h = bArrA1;
                        jVar.f83081l = 5;
                        objTransreceive2 = iNfcService4.transreceive(bArrA8, jVar);
                        if (objTransreceive2 != objE) {
                            bArr5 = bArrA1;
                            r18 = A1;
                            mVar3 = mVar2;
                            objTransreceive3 = objTransreceive2;
                            r19 = r17;
                        }
                    }
                }
                return objE;
            }
            if (i16 == 3) {
                byte[] bArr10 = (byte[]) jVar.f83076f;
                d3Var3 = (d3) jVar.f83075e;
                mVar2 = (m) jVar.f83074d;
                u.b(objTransreceive3);
                r15 = bArr10;
                m2Var2 = new m2((byte[]) objTransreceive3);
                if (m2Var2.f28660c != m3.Ok) {
                    throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                }
                byte[] bArrA9 = v.a1(v.X0(n.i0(m2Var2.f28659b, 4), z.e(m2Var2.f28659b[3]) & 255));
                AUX.a aVar6 = this.f83083b;
                aVar6.getClass();
                ECCurve curve4 = aVar6.f1b.getCurve();
                int length3 = (bArrA9.length - 1) / 2;
                ECPoint eCPointNormalize6 = curve4.createPoint(new BigInteger(1, v.a1(v.X0(n.i0(bArrA9, 1), length3))), new BigInteger(1, v.a1(v.X0(n.i0(bArrA9, length3 + 1), length3)))).normalize();
                aVar = aVar6.f0a;
                if (aVar != null) {
                    bArr4 = aVar.f101383b;
                } else {
                    bArr4 = null;
                }
                ECPoint eCPointNormalize7 = eCPointNormalize6.multiply(new BigInteger(1, bArr4)).normalize();
                x9ECParameters = aVar6.f1b;
                if (x9ECParameters != null || (g15 = x9ECParameters.getG()) == null || (eCPointMultiply2 = g15.multiply(new BigInteger(1, (byte[]) r15))) == null || (eCPointAdd = eCPointMultiply2.add(eCPointNormalize7)) == null) {
                    eCPointNormalize = null;
                } else {
                    eCPointNormalize = eCPointAdd.normalize();
                }
                x9ECParameters2 = aVar6.f1b;
                if (x9ECParameters2 != null || (curve = x9ECParameters2.getCurve()) == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(curve.getFieldSize());
                }
                byte[] bArr11 = new byte[numValueOf.intValue() / 8];
                new SecureRandom().nextBytes(bArr11);
                if (eCPointNormalize != null || (eCPointMultiply = eCPointNormalize.multiply(new BigInteger(1, bArr11))) == null) {
                    eCPointNormalize2 = null;
                } else {
                    eCPointNormalize2 = eCPointMultiply.normalize();
                }
                aVar6.f0a = new jc.a(eCPointNormalize2.getEncoded(false), bArr11);
                ?? encoded3 = eCPointNormalize2.getEncoded(false);
                byte[] bArrA10 = new i2(encoded3).a();
                INfcService iNfcService5 = this.f83082a;
                jVar.f83074d = mVar2;
                jVar.f83075e = d3Var3;
                jVar.f83076f = encoded3;
                jVar.f83081l = 4;
                objTransreceive3 = iNfcService5.transreceive(bArrA10, jVar);
                r16 = encoded3;
                if (objTransreceive3 != objE) {
                    d3Var4 = d3Var3;
                    r17 = r16;
                    m2Var3 = new m2((byte[]) objTransreceive3);
                    if (m2Var3.f28660c == m3.Ok) {
                        throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                    }
                    byte[] bArrA11 = v.a1(v.X0(n.i0(m2Var3.f28659b, 4), z.e(m2Var3.f28659b[3]) & 255));
                    AUX.a aVar7 = this.f83083b;
                    aVar7.getClass();
                    ECCurve curve5 = aVar7.f1b.getCurve();
                    int length4 = (bArrA11.length - 1) / 2;
                    byte[] encoded4 = curve5.createPoint(new BigInteger(1, v.a1(v.X0(n.i0(bArrA11, 1), length4))), new BigInteger(1, v.a1(v.X0(n.i0(bArrA11, length4 + 1), length4)))).normalize().multiply(new BigInteger(1, aVar7.f0a.f101383b)).normalize().getXCoord().getEncoded();
                    this.f83083b.getClass();
                    A1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded4, new byte[]{0, 0, 0, 1})), lr.m.e(d3Var4.f37105a / 8, 16)));
                    this.f83083b.getClass();
                    bArrA1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded4, new byte[]{0, 0, 0, 2})), lr.m.e(d3Var4.f37105a / 8, 16)));
                    AUX.a aVar8 = this.f83083b;
                    byte[] bArr12 = mVar2.f90890b.f101384a;
                    aVar8.getClass();
                    byte[] bArrA12 = new h2(AUX.a.b(bArr12, bArrA11, bArrA1, d3Var4)).a();
                    INfcService iNfcService6 = this.f83082a;
                    jVar.f83074d = mVar2;
                    jVar.f83075e = d3Var4;
                    jVar.f83076f = r17;
                    jVar.f83077g = A1;
                    jVar.f83078h = bArrA1;
                    jVar.f83081l = 5;
                    objTransreceive2 = iNfcService6.transreceive(bArrA12, jVar);
                    if (objTransreceive2 != objE) {
                        bArr5 = bArrA1;
                        r18 = A1;
                        mVar3 = mVar2;
                        objTransreceive3 = objTransreceive2;
                        r19 = r17;
                    }
                }
                return objE;
            }
            if (i16 == 4) {
                byte[] bArr13 = (byte[]) jVar.f83076f;
                d3Var3 = (d3) jVar.f83075e;
                m mVar6 = (m) jVar.f83074d;
                u.b(objTransreceive3);
                mVar2 = mVar6;
                r16 = bArr13;
                d3Var4 = d3Var3;
                r17 = r16;
                m2Var3 = new m2((byte[]) objTransreceive3);
                if (m2Var3.f28660c == m3.Ok) {
                    throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                }
                byte[] bArrA13 = v.a1(v.X0(n.i0(m2Var3.f28659b, 4), z.e(m2Var3.f28659b[3]) & 255));
                AUX.a aVar9 = this.f83083b;
                aVar9.getClass();
                ECCurve curve6 = aVar9.f1b.getCurve();
                int length5 = (bArrA13.length - 1) / 2;
                byte[] encoded5 = curve6.createPoint(new BigInteger(1, v.a1(v.X0(n.i0(bArrA13, 1), length5))), new BigInteger(1, v.a1(v.X0(n.i0(bArrA13, length5 + 1), length5)))).normalize().multiply(new BigInteger(1, aVar9.f0a.f101383b)).normalize().getXCoord().getEncoded();
                this.f83083b.getClass();
                A1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded5, new byte[]{0, 0, 0, 1})), lr.m.e(d3Var4.f37105a / 8, 16)));
                this.f83083b.getClass();
                bArrA1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded5, new byte[]{0, 0, 0, 2})), lr.m.e(d3Var4.f37105a / 8, 16)));
                AUX.a aVar10 = this.f83083b;
                byte[] bArr14 = mVar2.f90890b.f101384a;
                aVar10.getClass();
                byte[] bArrA14 = new h2(AUX.a.b(bArr14, bArrA13, bArrA1, d3Var4)).a();
                INfcService iNfcService7 = this.f83082a;
                jVar.f83074d = mVar2;
                jVar.f83075e = d3Var4;
                jVar.f83076f = r17;
                jVar.f83077g = A1;
                jVar.f83078h = bArrA1;
                jVar.f83081l = 5;
                objTransreceive2 = iNfcService7.transreceive(bArrA14, jVar);
                if (objTransreceive2 != objE) {
                    bArr5 = bArrA1;
                    r18 = A1;
                    mVar3 = mVar2;
                    objTransreceive3 = objTransreceive2;
                    r19 = r17;
                }
                return objE;
            }
            if (i16 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] bArr15 = jVar.f83078h;
            byte[] bArr16 = (byte[]) jVar.f83077g;
            byte[] bArr17 = (byte[]) jVar.f83076f;
            d3Var4 = (d3) jVar.f83075e;
            mVar3 = (m) jVar.f83074d;
            u.b(objTransreceive3);
            bArr5 = bArr15;
            r18 = bArr16;
            r19 = bArr17;
        }
        d3Var5 = d3Var4;
        m2Var4 = new m2((byte[]) objTransreceive3);
        if (m2Var4.f28660c == m3.Ok) {
            throw new gc.i("PACE EXCEPTION: incorrect Secret.", gc.h.PaceIncorrectSecret);
        }
        byte[] bArr18 = m2Var4.f28659b;
        strA = i1.a(v.a1(v.X0(n.i0(bArr18, 4), bArr18[3])));
        AUX.a aVar11 = this.f83083b;
        bArr6 = mVar3.f90890b.f101384a;
        aVar11.getClass();
        if (t.c(strA, i1.a(AUX.a.b(bArr6, r19, bArr5, d3Var5)))) {
            throw new gc.i("PACE exception: token mismatch in MUTUAL AUTHENTICATE", gc.h.PaceTokenMismatch);
        }
        Messenger messengerInstance = Messenger.INSTANCE.Instance();
        dv.b bVar = dv.b.IncorrectCan;
        messengerInstance.Send(new ProcessInfoMessage("Secure communication with the card has been established", 105));
        return new jc.c(r18, bArr5, new byte[d3Var5.f37105a / 16], d3Var5, this.f83083b);
        if (new m2((byte[]) objTransreceive3).f28660c != m3.Ok) {
            throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
        }
        byte[] bArrA15 = new f2().a();
        INfcService iNfcService8 = this.f83082a;
        jVar.f83074d = bArr2;
        jVar.f83075e = mVar4;
        jVar.f83076f = d3Var2;
        jVar.f83077g = str;
        jVar.f83081l = 2;
        objTransreceive3 = iNfcService8.transreceive(bArrA15, jVar);
        if (objTransreceive3 != objE) {
            byte[] bArr19 = bArr2;
            mVar2 = mVar4;
            str2 = str;
            d3Var3 = d3Var2;
            bArr3 = bArr19;
            m2Var = new m2((byte[]) objTransreceive3);
            if (m2Var.f28660c == m3.Ok) {
                throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
            }
            this.f83083b.getClass();
            byte[] bArrA16 = v.a1(n.c1(AUX.a.a(d3Var3).digest(n.H(bArr3, new byte[]{0, 0, 0, 3})), lr.m.e(d3Var3.f37105a / 8, 16)));
            byte[] bArrA17 = v.a1(v.X0(n.i0(m2Var.f28659b, 4), m2Var.f28659b[i17]));
            this.f83083b.getClass();
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArrA16, "AES");
            Cipher cipher2 = Cipher.getInstance("AES/CBC/NOPADDING");
            cipher2.init(2, secretKeySpec2, new IvParameterSpec(new byte[16]));
            DoFinal = cipher2.doFinal(bArrA17, 0, bArrA17.length);
            AUX.a aVar12 = this.f83083b;
            aVar12.getClass();
            X9ECParameters byName2 = ECNamedCurveTable.getByName(str2);
            byte[] bArr20 = new byte[byName2.getCurve().getFieldSize() / 8];
            new SecureRandom().nextBytes(bArr20);
            ECPoint eCPointNormalize8 = byName2.getG().multiply(new BigInteger(1, bArr20)).normalize();
            aVar12.f0a = new jc.a(eCPointNormalize8.getEncoded(false), bArr20);
            aVar12.f1b = byName2;
            byte[] bArrA18 = new g2(eCPointNormalize8.getEncoded(false)).a();
            INfcService iNfcService9 = this.f83082a;
            jVar.f83074d = mVar2;
            jVar.f83075e = d3Var3;
            jVar.f83076f = DoFinal;
            jVar.f83077g = null;
            jVar.f83081l = i17;
            objTransreceive = iNfcService9.transreceive(bArrA18, jVar);
            if (objTransreceive != objE) {
                objTransreceive3 = objTransreceive;
                r15 = DoFinal;
                m2Var2 = new m2((byte[]) objTransreceive3);
                if (m2Var2.f28660c != m3.Ok) {
                    throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                }
                byte[] bArrA19 = v.a1(v.X0(n.i0(m2Var2.f28659b, 4), z.e(m2Var2.f28659b[3]) & 255));
                AUX.a aVar13 = this.f83083b;
                aVar13.getClass();
                ECCurve curve7 = aVar13.f1b.getCurve();
                int length6 = (bArrA19.length - 1) / 2;
                ECPoint eCPointNormalize9 = curve7.createPoint(new BigInteger(1, v.a1(v.X0(n.i0(bArrA19, 1), length6))), new BigInteger(1, v.a1(v.X0(n.i0(bArrA19, length6 + 1), length6)))).normalize();
                aVar = aVar13.f0a;
                if (aVar != null) {
                    bArr4 = aVar.f101383b;
                } else {
                    bArr4 = null;
                }
                ECPoint eCPointNormalize10 = eCPointNormalize9.multiply(new BigInteger(1, bArr4)).normalize();
                x9ECParameters = aVar13.f1b;
                if (x9ECParameters != null) {
                    eCPointNormalize = null;
                } else {
                    eCPointNormalize = null;
                }
                x9ECParameters2 = aVar13.f1b;
                if (x9ECParameters2 != null) {
                    numValueOf = null;
                } else {
                    numValueOf = null;
                }
                byte[] bArr110 = new byte[numValueOf.intValue() / 8];
                new SecureRandom().nextBytes(bArr110);
                if (eCPointNormalize != null) {
                    eCPointNormalize2 = null;
                } else {
                    eCPointNormalize2 = null;
                }
                aVar13.f0a = new jc.a(eCPointNormalize2.getEncoded(false), bArr110);
                ?? encoded6 = eCPointNormalize2.getEncoded(false);
                byte[] bArrA110 = new i2(encoded6).a();
                INfcService iNfcService10 = this.f83082a;
                jVar.f83074d = mVar2;
                jVar.f83075e = d3Var3;
                jVar.f83076f = encoded6;
                jVar.f83081l = 4;
                objTransreceive3 = iNfcService10.transreceive(bArrA110, jVar);
                r16 = encoded6;
                if (objTransreceive3 != objE) {
                    d3Var4 = d3Var3;
                    r17 = r16;
                    m2Var3 = new m2((byte[]) objTransreceive3);
                    if (m2Var3.f28660c == m3.Ok) {
                        throw new gc.i("PACE EXCEPTION: protocol step was not established correctly", gc.h.PaceStepFailure);
                    }
                    byte[] bArrA111 = v.a1(v.X0(n.i0(m2Var3.f28659b, 4), z.e(m2Var3.f28659b[3]) & 255));
                    AUX.a aVar14 = this.f83083b;
                    aVar14.getClass();
                    ECCurve curve8 = aVar14.f1b.getCurve();
                    int length7 = (bArrA111.length - 1) / 2;
                    byte[] encoded7 = curve8.createPoint(new BigInteger(1, v.a1(v.X0(n.i0(bArrA111, 1), length7))), new BigInteger(1, v.a1(v.X0(n.i0(bArrA111, length7 + 1), length7)))).normalize().multiply(new BigInteger(1, aVar14.f0a.f101383b)).normalize().getXCoord().getEncoded();
                    this.f83083b.getClass();
                    A1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded7, new byte[]{0, 0, 0, 1})), lr.m.e(d3Var4.f37105a / 8, 16)));
                    this.f83083b.getClass();
                    bArrA1 = v.a1(n.c1(AUX.a.a(d3Var4).digest(n.H(encoded7, new byte[]{0, 0, 0, 2})), lr.m.e(d3Var4.f37105a / 8, 16)));
                    AUX.a aVar15 = this.f83083b;
                    byte[] bArr111 = mVar2.f90890b.f101384a;
                    aVar15.getClass();
                    byte[] bArrA112 = new h2(AUX.a.b(bArr111, bArrA111, bArrA1, d3Var4)).a();
                    INfcService iNfcService11 = this.f83082a;
                    jVar.f83074d = mVar2;
                    jVar.f83075e = d3Var4;
                    jVar.f83076f = r17;
                    jVar.f83077g = A1;
                    jVar.f83078h = bArrA1;
                    jVar.f83081l = 5;
                    objTransreceive2 = iNfcService11.transreceive(bArrA112, jVar);
                    if (objTransreceive2 != objE) {
                        bArr5 = bArrA1;
                        r18 = A1;
                        mVar3 = mVar2;
                        objTransreceive3 = objTransreceive2;
                        r19 = r17;
                        d3Var5 = d3Var4;
                        m2Var4 = new m2((byte[]) objTransreceive3);
                        if (m2Var4.f28660c == m3.Ok) {
                            throw new gc.i("PACE EXCEPTION: incorrect Secret.", gc.h.PaceIncorrectSecret);
                        }
                        byte[] bArr112 = m2Var4.f28659b;
                        strA = i1.a(v.a1(v.X0(n.i0(bArr112, 4), bArr112[3])));
                        AUX.a aVar16 = this.f83083b;
                        bArr6 = mVar3.f90890b.f101384a;
                        aVar16.getClass();
                        if (t.c(strA, i1.a(AUX.a.b(bArr6, r19, bArr5, d3Var5)))) {
                            throw new gc.i("PACE exception: token mismatch in MUTUAL AUTHENTICATE", gc.h.PaceTokenMismatch);
                        }
                        Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
                        dv.b bVar2 = dv.b.IncorrectCan;
                        messengerInstance2.Send(new ProcessInfoMessage("Secure communication with the card has been established", 105));
                        return new jc.c(r18, bArr5, new byte[d3Var5.f37105a / 16], d3Var5, this.f83083b);
                    }
                }
            }
        }
        return objE;
    }
}
