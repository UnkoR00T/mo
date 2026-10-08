package y00;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010 J4\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b$\u0010%J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b&\u0010 J<\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J4\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b,\u0010-J4\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b0\u0010%J,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b1\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00104R$\u00109\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u00105\u001a\u0004\b6\u00107\"\u0004\b2\u00108¨\u0006:"}, d2 = {"Ly00/l;", "Liy/i;", "Liy/w;", "secureRandomFactory", "Ly00/c0;", "securityExceptionParser", "<init>", "(Liy/w;Ly00/c0;)V", "", "mode", "Liy/h$c;", "algorithm", "Ljava/security/Key;", "key", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "k", "(ILiy/h$c;Ljava/security/Key;Ltq/e;)Ljava/lang/Object;", "", "transformation", "i", "(Ljava/lang/String;)Ljavax/crypto/Cipher;", "", "data", "Ljava/security/PublicKey;", "publicKey", "Ldx/i;", "Ldx/b;", "e", "([BLjava/security/PublicKey;Liy/h$c;Ltq/e;)Ljava/lang/Object;", "initializedCipher", "h", "([BLjavax/crypto/Cipher;Ltq/e;)Ljava/lang/Object;", "encryptedData", "Ljava/security/PrivateKey;", "privateKey", "c", "([BLjava/security/PrivateKey;Liy/h$c;Ltq/e;)Ljava/lang/Object;", "g", "wrappingKey", "Liy/h0;", "encoding", "d", "(Ljava/security/Key;Ljava/security/PublicKey;Liy/h$c;Liy/h0;Ltq/e;)Ljava/lang/Object;", "m", "(Ljava/security/Key;Liy/h0;Ljavax/crypto/Cipher;Ltq/e;)Ljava/lang/Object;", "wrappedKey", "unwrappingKey", "b", "l", "a", "Liy/w;", "Ly00/c0;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "explicitProvider", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements iy.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.w secureRandomFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String explicitProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222749a;

        static {
            int[] iArr = new int[iy.h0.values().length];
            try {
                iArr[iy.h0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iy.h0.ASN1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f222749a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222753g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f222754h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f222755j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f222756k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f222757l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f222758m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f222759n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f222760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f222761q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f222762r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f222764t;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222762r = obj;
            this.f222764t |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222767f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222768g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f222769h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f222770j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f222771k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f222772l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f222773m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f222774n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f222775p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f222776q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f222777r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f222779t;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222777r = obj;
            this.f222779t |= PKIFailureInfo.systemUnavail;
            return l.this.e(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222782f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f222784h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f222786k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222784h = obj;
            this.f222786k |= PKIFailureInfo.systemUnavail;
            return l.this.k(0, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f222791h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f222792j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f222793k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f222794l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f222795m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f222796n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f222797p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f222798q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f222799r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f222801t;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222799r = obj;
            this.f222801t |= PKIFailureInfo.systemUnavail;
            return l.this.b(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f222806h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f222807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f222808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f222809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f222810m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f222811n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f222812p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f222813q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f222814r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f222815s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f222817v;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222815s = obj;
            this.f222817v |= PKIFailureInfo.systemUnavail;
            return l.this.d(null, null, null, null, this);
        }
    }

    public l(iy.w wVar, c0 c0Var) {
        this.secureRandomFactory = wVar;
        this.securityExceptionParser = c0Var;
    }

    private final Cipher i(String transformation) {
        return getExplicitProvider() == null ? Cipher.getInstance(transformation) : Cipher.getInstance(transformation, getExplicitProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(int i15, iy.h.c cVar, Key key, tq.e<? super Cipher> eVar) throws Throwable {
        d dVar;
        Cipher cipher;
        Cipher cipher2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i16 = dVar.f222786k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f222786k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f222784h;
        Object objE = uq.b.e();
        int i17 = dVar.f222786k;
        if (i17 != 0) {
            if (i17 == 1) {
                i15 = dVar.f222780d;
                cipher = (Cipher) dVar.f222783g;
                key = (Key) dVar.f222782f;
                oq.u.b(obj);
                cipher.init(i15, key, (SecureRandom) obj);
                return cipher;
            }
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = dVar.f222780d;
            cipher2 = (Cipher) dVar.f222783g;
            key = (Key) dVar.f222782f;
            oq.u.b(obj);
            cipher2.init(i15, key, m.a(), (SecureRandom) obj);
            return cipher2;
        }
        oq.u.b(obj);
        if ((cVar instanceof iy.h.c.Other) || fr.t.c(cVar, iy.h.c.C2299c.f97756b)) {
            Cipher cipherI = i(cVar.getTransformation());
            iy.w wVar = this.secureRandomFactory;
            dVar.f222781e = vq.j.a(cVar);
            dVar.f222782f = key;
            dVar.f222783g = cipherI;
            dVar.f222780d = i15;
            dVar.f222786k = 1;
            Object objC = iy.w.c(wVar, null, dVar, 1, null);
            if (objC != objE) {
                obj = objC;
                cipher = cipherI;
                cipher.init(i15, key, (SecureRandom) obj);
                return cipher;
            }
        } else {
            if (!fr.t.c(cVar, iy.h.c.b.f97755b)) {
                throw new oq.p();
            }
            Cipher cipherI2 = i(cVar.getTransformation());
            iy.w wVar2 = this.secureRandomFactory;
            dVar.f222781e = vq.j.a(cVar);
            dVar.f222782f = key;
            dVar.f222783g = cipherI2;
            dVar.f222780d = i15;
            dVar.f222786k = 2;
            Object objC2 = iy.w.c(wVar2, null, dVar, 1, null);
            if (objC2 != objE) {
                obj = objC2;
                cipher2 = cipherI2;
                cipher2.init(i15, key, m.a(), (SecureRandom) obj);
                return cipher2;
            }
        }
        return objE;
    }

    @Override // iy.i
    public void a(String str) {
        this.explicitProvider = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [y00.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // iy.i
    public Object b(byte[] bArr, PrivateKey privateKey, iy.h.c cVar, tq.e<? super dx.i<? extends dx.b, ? extends Key>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        int i15;
        ex.b bVar;
        iy.h.c cVar2;
        PrivateKey privateKey2;
        byte[] bArr2;
        int i16;
        dx.j jVar;
        ex.b bVar2;
        int i17;
        int i18;
        ex.b bVar3;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i19 = eVar2.f222801t;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f222801t = i19 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objL = eVar2.f222799r;
        Object objE = uq.b.e();
        ?? r15 = eVar2.f222801t;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objL);
                    jVar = this.securityExceptionParser;
                    ex.a aVar = new ex.a();
                    eVar2.f222787d = bArr;
                    eVar2.f222788e = vq.j.a(privateKey);
                    eVar2.f222789f = vq.j.a(cVar);
                    eVar2.f222790g = jVar;
                    eVar2.f222791h = vq.j.a(aVar);
                    eVar2.f222792j = aVar;
                    i16 = 0;
                    eVar2.f222795m = 0;
                    eVar2.f222796n = 0;
                    eVar2.f222797p = 0;
                    eVar2.f222798q = 0;
                    eVar2.f222801t = 1;
                    Object objK = k(4, cVar, privateKey, eVar2);
                    if (objK != objE) {
                        bArr2 = bArr;
                        objL = objK;
                        i15 = 0;
                        privateKey2 = privateKey;
                        cVar2 = cVar;
                        bVar = aVar;
                        bVar2 = bVar;
                        i18 = 0;
                        i17 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i25 = eVar2.f222798q;
                        i15 = eVar2.f222797p;
                        int i26 = eVar2.f222796n;
                        int i27 = eVar2.f222795m;
                        bVar = (ex.b) eVar2.f222792j;
                        ex.b bVar4 = (ex.b) eVar2.f222791h;
                        dx.j jVar2 = (dx.j) eVar2.f222790g;
                        cVar2 = (iy.h.c) eVar2.f222789f;
                        privateKey2 = (PrivateKey) eVar2.f222788e;
                        bArr2 = (byte[]) eVar2.f222787d;
                        try {
                            oq.u.b(objL);
                            i16 = i25;
                            jVar = jVar2;
                            bVar2 = bVar4;
                            i17 = i27;
                            i18 = i26;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar2;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) eVar2.f222794l;
                        oq.u.b(objL);
                    }
                    return new dx.i.Right((Key) bVar3.a((dx.i) objL));
                } catch (CancellationException e18) {
                    throw e18;
                }
                Cipher cipher = (Cipher) objL;
                eVar2.f222787d = vq.j.a(bArr2);
                eVar2.f222788e = vq.j.a(privateKey2);
                eVar2.f222789f = vq.j.a(cVar2);
                eVar2.f222790g = jVar;
                eVar2.f222791h = vq.j.a(bVar2);
                eVar2.f222792j = vq.j.a(bVar);
                eVar2.f222793k = vq.j.a(cipher);
                eVar2.f222794l = bVar;
                eVar2.f222795m = i17;
                eVar2.f222796n = i18;
                eVar2.f222797p = i15;
                eVar2.f222798q = i16;
                eVar2.f222801t = 2;
                objL = l(bArr2, cipher, eVar2);
                if (objL != objE) {
                    bVar3 = bVar;
                    return new dx.i.Right((Key) bVar3.a((dx.i) objL));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [y00.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // iy.i
    public Object c(byte[] bArr, PrivateKey privateKey, iy.h.c cVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        ex.b bVar2;
        iy.h.c cVar2;
        PrivateKey privateKey2;
        byte[] bArr2;
        int i16;
        dx.j jVar;
        ex.b bVar3;
        int i17;
        int i18;
        ex.b bVar4;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i19 = bVar.f222764t;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f222764t = i19 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.f222762r;
        Object objE = uq.b.e();
        ?? r15 = bVar.f222764t;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objG);
                    jVar = this.securityExceptionParser;
                    ex.a aVar = new ex.a();
                    bVar.f222750d = bArr;
                    bVar.f222751e = vq.j.a(privateKey);
                    bVar.f222752f = vq.j.a(cVar);
                    bVar.f222753g = jVar;
                    bVar.f222754h = vq.j.a(aVar);
                    bVar.f222755j = aVar;
                    i16 = 0;
                    bVar.f222758m = 0;
                    bVar.f222759n = 0;
                    bVar.f222760p = 0;
                    bVar.f222761q = 0;
                    bVar.f222764t = 1;
                    Object objK = k(2, cVar, privateKey, bVar);
                    if (objK != objE) {
                        bArr2 = bArr;
                        privateKey2 = privateKey;
                        i15 = 0;
                        cVar2 = cVar;
                        objG = objK;
                        bVar2 = aVar;
                        bVar3 = bVar2;
                        i18 = 0;
                        i17 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i25 = bVar.f222761q;
                        i15 = bVar.f222760p;
                        int i26 = bVar.f222759n;
                        int i27 = bVar.f222758m;
                        bVar2 = (ex.b) bVar.f222755j;
                        ex.b bVar5 = (ex.b) bVar.f222754h;
                        dx.j jVar2 = (dx.j) bVar.f222753g;
                        cVar2 = (iy.h.c) bVar.f222752f;
                        privateKey2 = (PrivateKey) bVar.f222751e;
                        bArr2 = (byte[]) bVar.f222750d;
                        try {
                            oq.u.b(objG);
                            i16 = i25;
                            jVar = jVar2;
                            bVar3 = bVar5;
                            i17 = i27;
                            i18 = i26;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar2;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) bVar.f222757l;
                        oq.u.b(objG);
                    }
                    return new dx.i.Right((byte[]) bVar4.a((dx.i) objG));
                } catch (CancellationException e18) {
                    throw e18;
                }
                Cipher cipher = (Cipher) objG;
                bVar.f222750d = vq.j.a(bArr2);
                bVar.f222751e = vq.j.a(privateKey2);
                bVar.f222752f = vq.j.a(cVar2);
                bVar.f222753g = jVar;
                bVar.f222754h = vq.j.a(bVar3);
                bVar.f222755j = vq.j.a(bVar2);
                bVar.f222756k = vq.j.a(cipher);
                bVar.f222757l = bVar2;
                bVar.f222758m = i17;
                bVar.f222759n = i18;
                bVar.f222760p = i15;
                bVar.f222761q = i16;
                bVar.f222764t = 2;
                objG = g(bArr2, cipher, bVar);
                if (objG != objE) {
                    bVar4 = bVar2;
                    return new dx.i.Right((byte[]) bVar4.a((dx.i) objG));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [y00.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // iy.i
    public Object d(Key key, PublicKey publicKey, iy.h.c cVar, iy.h0 h0Var, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        f fVar;
        Object objB;
        int i15;
        int i16;
        iy.h0 h0Var2;
        PublicKey publicKey2;
        Key key2;
        int i17;
        dx.j jVar;
        iy.h.c cVar2;
        ex.b bVar;
        ex.b aVar;
        int i18;
        ex.b bVar2;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i19 = fVar.f222817v;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f222817v = i19 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objM = fVar.f222815s;
        Object objE = uq.b.e();
        ?? r15 = fVar.f222817v;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objM);
                    jVar = this.securityExceptionParser;
                    aVar = new ex.a();
                    fVar.f222802d = key;
                    fVar.f222803e = vq.j.a(publicKey);
                    fVar.f222804f = vq.j.a(cVar);
                    fVar.f222805g = h0Var;
                    fVar.f222806h = jVar;
                    fVar.f222807j = vq.j.a(aVar);
                    fVar.f222808k = aVar;
                    i17 = 0;
                    fVar.f222811n = 0;
                    fVar.f222812p = 0;
                    fVar.f222813q = 0;
                    fVar.f222814r = 0;
                    fVar.f222817v = 1;
                    cVar2 = cVar;
                    Object objK = k(3, cVar2, publicKey, fVar);
                    if (objK != objE) {
                        key2 = key;
                        objM = objK;
                        h0Var2 = h0Var;
                        i15 = 0;
                        i16 = 0;
                        publicKey2 = publicKey;
                        bVar = aVar;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i25 = fVar.f222814r;
                        i15 = fVar.f222813q;
                        i16 = fVar.f222812p;
                        int i26 = fVar.f222811n;
                        ex.b bVar3 = (ex.b) fVar.f222808k;
                        ex.b bVar4 = (ex.b) fVar.f222807j;
                        dx.j jVar2 = (dx.j) fVar.f222806h;
                        h0Var2 = (iy.h0) fVar.f222805g;
                        iy.h.c cVar3 = (iy.h.c) fVar.f222804f;
                        publicKey2 = (PublicKey) fVar.f222803e;
                        key2 = (Key) fVar.f222802d;
                        try {
                            oq.u.b(objM);
                            i17 = i25;
                            jVar = jVar2;
                            cVar2 = cVar3;
                            bVar = bVar4;
                            aVar = bVar3;
                            i18 = i26;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
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
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) fVar.f222810m;
                        oq.u.b(objM);
                    }
                    return new dx.i.Right((byte[]) bVar2.a((dx.i) objM));
                } catch (CancellationException e18) {
                    throw e18;
                }
                Cipher cipher = (Cipher) objM;
                fVar.f222802d = vq.j.a(key2);
                fVar.f222803e = vq.j.a(publicKey2);
                fVar.f222804f = vq.j.a(cVar2);
                fVar.f222805g = vq.j.a(h0Var2);
                fVar.f222806h = jVar;
                fVar.f222807j = vq.j.a(bVar);
                fVar.f222808k = vq.j.a(aVar);
                fVar.f222809l = vq.j.a(cipher);
                fVar.f222810m = aVar;
                fVar.f222811n = i18;
                fVar.f222812p = i16;
                fVar.f222813q = i15;
                fVar.f222814r = i17;
                fVar.f222817v = 2;
                objM = m(key2, h0Var2, cipher, fVar);
                if (objM != objE) {
                    bVar2 = aVar;
                    return new dx.i.Right((byte[]) bVar2.a((dx.i) objM));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [y00.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // iy.i
    public Object e(byte[] bArr, PublicKey publicKey, iy.h.c cVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        c cVar2;
        Object objB;
        int i15;
        ex.b bVar;
        iy.h.c cVar3;
        PublicKey publicKey2;
        byte[] bArr2;
        int i16;
        dx.j jVar;
        ex.b bVar2;
        int i17;
        int i18;
        ex.b bVar3;
        if (eVar instanceof c) {
            cVar2 = (c) eVar;
            int i19 = cVar2.f222779t;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f222779t = i19 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(eVar);
            }
        } else {
            cVar2 = new c(eVar);
        }
        Object objH = cVar2.f222777r;
        Object objE = uq.b.e();
        ?? r15 = cVar2.f222779t;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objH);
                    jVar = this.securityExceptionParser;
                    ex.a aVar = new ex.a();
                    cVar2.f222765d = bArr;
                    cVar2.f222766e = vq.j.a(publicKey);
                    cVar2.f222767f = vq.j.a(cVar);
                    cVar2.f222768g = jVar;
                    cVar2.f222769h = vq.j.a(aVar);
                    cVar2.f222770j = aVar;
                    i16 = 0;
                    cVar2.f222773m = 0;
                    cVar2.f222774n = 0;
                    cVar2.f222775p = 0;
                    cVar2.f222776q = 0;
                    cVar2.f222779t = 1;
                    Object objK = k(1, cVar, publicKey, cVar2);
                    if (objK != objE) {
                        bArr2 = bArr;
                        objH = objK;
                        i15 = 0;
                        publicKey2 = publicKey;
                        cVar3 = cVar;
                        bVar = aVar;
                        bVar2 = bVar;
                        i18 = 0;
                        i17 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i25 = cVar2.f222776q;
                        i15 = cVar2.f222775p;
                        int i26 = cVar2.f222774n;
                        int i27 = cVar2.f222773m;
                        bVar = (ex.b) cVar2.f222770j;
                        ex.b bVar4 = (ex.b) cVar2.f222769h;
                        dx.j jVar2 = (dx.j) cVar2.f222768g;
                        cVar3 = (iy.h.c) cVar2.f222767f;
                        publicKey2 = (PublicKey) cVar2.f222766e;
                        bArr2 = (byte[]) cVar2.f222765d;
                        try {
                            oq.u.b(objH);
                            i16 = i25;
                            jVar = jVar2;
                            bVar2 = bVar4;
                            i17 = i27;
                            i18 = i26;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar2;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) cVar2.f222772l;
                        oq.u.b(objH);
                    }
                    return new dx.i.Right((byte[]) bVar3.a((dx.i) objH));
                } catch (CancellationException e18) {
                    throw e18;
                }
                Cipher cipher = (Cipher) objH;
                cVar2.f222765d = vq.j.a(bArr2);
                cVar2.f222766e = vq.j.a(publicKey2);
                cVar2.f222767f = vq.j.a(cVar3);
                cVar2.f222768g = jVar;
                cVar2.f222769h = vq.j.a(bVar2);
                cVar2.f222770j = vq.j.a(bVar);
                cVar2.f222771k = vq.j.a(cipher);
                cVar2.f222772l = bVar;
                cVar2.f222773m = i17;
                cVar2.f222774n = i18;
                cVar2.f222775p = i15;
                cVar2.f222776q = i16;
                cVar2.f222779t = 2;
                objH = h(bArr2, cipher, cVar2);
                if (objH != objE) {
                    bVar3 = bVar;
                    return new dx.i.Right((byte[]) bVar3.a((dx.i) objH));
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

    public Object g(byte[] bArr, Cipher cipher, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        Object objB;
        c0 c0Var = this.securityExceptionParser;
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(cipher.doFinal(bArr));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
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

    public Object h(byte[] bArr, Cipher cipher, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        Object objB;
        c0 c0Var = this.securityExceptionParser;
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(cipher.doFinal(bArr));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
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

    /* JADX INFO: renamed from: j, reason: from getter */
    public String getExplicitProvider() {
        return this.explicitProvider;
    }

    public Object l(byte[] bArr, Cipher cipher, tq.e<? super dx.i<? extends dx.b, ? extends Key>> eVar) {
        Object objB;
        c0 c0Var = this.securityExceptionParser;
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(cipher.unwrap(bArr, "RSA", 3));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(c0Var));
                    dx.i<Exception, dx.b> iVarA = c0Var.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public Object m(Key key, iy.h0 h0Var, Cipher cipher, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        Object objB;
        c0 c0Var = this.securityExceptionParser;
        try {
            try {
                try {
                    new ex.a();
                    byte[] bArrWrap = cipher.wrap(key);
                    int i15 = a.f222749a[h0Var.ordinal()];
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new oq.p();
                        }
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        aSN1EncodableVector.add(new DEROctetString(bArrWrap));
                        bArrWrap = new DERSequence(aSN1EncodableVector).getEncoded();
                    }
                    return new dx.i.Right(bArrWrap);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(c0Var));
                    dx.i<Exception, dx.b> iVarA = c0Var.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
