package g10;

import ay.j;
import dx.i;
import fr.q0;
import h10.DecodedPasswordKeyData;
import h10.EncodedPasswordKeyData;
import iy.a0;
import iy.c0;
import iy.g;
import iy.h;
import iy.r;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lg10/b;", "Lg10/a;", "Liy/g;", "cipherAes", "Lay/j;", "jsonSerializer", "Liy/a;", "base64Coder", "<init>", "(Liy/g;Lay/j;Liy/a;)V", "Ljavax/crypto/SecretKey;", "deviceKey", "", "iterationsCount", "Liy/a0;", "salt", "saltLength", "Ldx/i;", "Ldx/b;", "Lsy/a;", "b", "(Ljavax/crypto/SecretKey;ILiy/a0;ILtq/e;)Ljava/lang/Object;", "", "encryptedPasswordKeyData", "Lh10/a;", "a", "([BLjavax/crypto/SecretKey;ILtq/e;)Ljava/lang/Object;", "Liy/g;", "c", "Lay/j;", "d", "Liy/a;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements g10.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g cipherAes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f69485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f69486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f69487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f69488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f69489h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f69490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f69491k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f69492l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f69493m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69494n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f69495p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f69496q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f69497r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f69499t;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f69497r = obj;
            this.f69499t |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: g10.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1557b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f69500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f69501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f69502f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f69503g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f69504h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f69505j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f69506k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f69507l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f69508m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69509n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f69510p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f69511q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f69512r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f69513s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f69514t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f69515v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f69516w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f69517x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f69519z;

        C1557b(e<? super C1557b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f69517x = obj;
            this.f69519z |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, 0, null, 0, this);
        }
    }

    public b(g gVar, j jVar, iy.a aVar) {
        this.cipherAes = gVar;
        this.jsonSerializer = jVar;
        this.base64Coder = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // g10.a
    public Object a(byte[] bArr, SecretKey secretKey, int i15, e<? super i<? extends dx.b, DecodedPasswordKeyData>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        ex.b bVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f69499t;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f69499t = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f69497r;
        Object objE = uq.b.e();
        ?? r15 = aVar.f69499t;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    g gVar = this.cipherAes;
                    h.a.b bVar3 = new h.a.b(0, new r.a(0, 1, null), i15, 1, null);
                    aVar.f69485d = vq.j.a(bArr);
                    aVar.f69486e = vq.j.a(secretKey);
                    aVar.f69487f = jVarA;
                    aVar.f69488g = vq.j.a(aVar2);
                    aVar.f69489h = aVar2;
                    aVar.f69490j = aVar2;
                    aVar.f69491k = i15;
                    aVar.f69492l = 0;
                    aVar.f69493m = 0;
                    aVar.f69494n = 0;
                    aVar.f69495p = 0;
                    aVar.f69496q = 0;
                    aVar.f69499t = 1;
                    Object objD = gVar.d(bArr, secretKey, bVar3, aVar);
                    if (objD == objE) {
                        return objE;
                    }
                    bVar = aVar2;
                    obj = objD;
                    bVar2 = bVar;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) aVar.f69490j;
                    bVar = (ex.b) aVar.f69489h;
                    try {
                        u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                EncodedPasswordKeyData encodedPasswordKeyData = (EncodedPasswordKeyData) this.jsonSerializer.a(new String((byte[]) bVar2.a((i) obj), fu.d.UTF_8), q0.n(EncodedPasswordKeyData.class));
                return new i.Right(new DecodedPasswordKeyData(c0.f((byte[]) bVar.a(iy.a.c(this.base64Coder, encodedPasswordKeyData.getSalt(), null, 2, null))), encodedPasswordKeyData.getIterations()));
            } catch (Exception e16) {
                f fVar = f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                i iVarA = r15.a(e16);
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
        } catch (ex.c e17) {
            return new i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x01bd A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:41:0x01b6, B:47:0x01da, B:44:0x01bd, B:46:0x01c1, B:48:0x01ef, B:49:0x01f4, B:62:0x0207, B:65:0x0215), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c1 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:41:0x01b6, B:47:0x01da, B:44:0x01bd, B:46:0x01c1, B:48:0x01ef, B:49:0x01f4, B:62:0x0207, B:65:0x0215), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01ef A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:41:0x01b6, B:47:0x01da, B:44:0x01bd, B:46:0x01c1, B:48:0x01ef, B:49:0x01f4, B:62:0x0207, B:65:0x0215), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x021e  */
    /* JADX WARN: Code duplicated, block: B:71:0x022f  */
    /* JADX WARN: Code duplicated, block: B:72:0x023d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0241  */
    /* JADX WARN: Code duplicated, block: B:77:0x024e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // g10.a
    public Object b(SecretKey secretKey, int i15, a0 a0Var, int i16, e<? super i<? extends dx.b, sy.a>> eVar) throws Throwable {
        C1557b c1557b;
        String message;
        i iVarA;
        Object objB;
        int i17;
        a0 a0Var2;
        int i18;
        dx.j<dx.b> jVar;
        int i19;
        int i25;
        int i26;
        Object obj;
        SecretKey secretKey2;
        g gVar;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i27;
        int i28;
        byte[] bArr;
        h.a.b bVar4;
        ex.b bVar5;
        ex.b bVar6;
        Object right;
        if (eVar instanceof C1557b) {
            c1557b = (C1557b) eVar;
            int i29 = c1557b.f69519z;
            if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                c1557b.f69519z = i29 - PKIFailureInfo.systemUnavail;
            } else {
                c1557b = new C1557b(eVar);
            }
        } else {
            c1557b = new C1557b(eVar);
        }
        Object objG = c1557b.f69517x;
        ?? E = uq.b.e();
        int i35 = c1557b.f69519z;
        try {
            try {
                if (i35 != 0) {
                    if (i35 == 1) {
                        int i36 = c1557b.f69516w;
                        int i37 = c1557b.f69515v;
                        int i38 = c1557b.f69514t;
                        int i39 = c1557b.f69513s;
                        int i45 = c1557b.f69512r;
                        i17 = c1557b.f69511q;
                        i18 = c1557b.f69510p;
                        g gVar2 = (g) c1557b.f69509n;
                        byte[] bArr2 = (byte[]) c1557b.f69508m;
                        ex.b bVar7 = (ex.b) c1557b.f69507l;
                        bVar2 = (ex.b) c1557b.f69506k;
                        h.a.b bVar8 = (h.a.b) c1557b.f69505j;
                        ex.b bVar9 = (ex.b) c1557b.f69504h;
                        ex.b bVar10 = (ex.b) c1557b.f69503g;
                        dx.j<dx.b> jVar2 = (dx.j) c1557b.f69502f;
                        a0 a0Var3 = (a0) c1557b.f69501e;
                        SecretKey secretKey3 = (SecretKey) c1557b.f69500d;
                        try {
                            u.b(objG);
                            i27 = i36;
                            secretKey2 = secretKey3;
                            i19 = i39;
                            jVar = jVar2;
                            bVar3 = bVar10;
                            bVar = bVar9;
                            a0Var2 = a0Var3;
                            obj = objG;
                            gVar = gVar2;
                            i28 = i38;
                            i25 = i45;
                            i26 = i37;
                            bArr = bArr2;
                            bVar4 = bVar8;
                            bVar5 = bVar7;
                            try {
                                Cipher cipher = (Cipher) bVar5.a((i) obj);
                                c1557b.f69500d = vq.j.a(secretKey2);
                                c1557b.f69501e = vq.j.a(a0Var2);
                                c1557b.f69502f = jVar;
                                c1557b.f69503g = vq.j.a(bVar3);
                                c1557b.f69504h = vq.j.a(bVar);
                                c1557b.f69505j = vq.j.a(bVar4);
                                c1557b.f69506k = bVar2;
                                c1557b.f69507l = null;
                                c1557b.f69508m = null;
                                c1557b.f69509n = null;
                                c1557b.f69510p = i18;
                                c1557b.f69511q = i17;
                                c1557b.f69512r = i25;
                                c1557b.f69513s = i19;
                                c1557b.f69514t = i28;
                                c1557b.f69515v = i26;
                                c1557b.f69516w = i27;
                                c1557b.f69519z = 2;
                                objG = gVar.g(bArr, cipher, bVar4, c1557b);
                                if (objG != E) {
                                    bVar6 = bVar2;
                                    right = (i) objG;
                                    if (!(right instanceof i.Left)) {
                                        if (!(right instanceof i.Right)) {
                                            throw new p();
                                        }
                                        right = new i.Right(sy.a.a(sy.a.b(c0.f((byte[]) ((i.Right) right).b()))));
                                    }
                                    return new i.Right(sy.a.a(((sy.a) bVar6.a(right)).getValue()));
                                }
                                return E;
                            } catch (ex.c e15) {
                                e = e15;
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                E = jVar;
                                f fVar = f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
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
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            E = jVar2;
                            f fVar2 = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
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
                        if (i35 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar6 = (ex.b) c1557b.f69506k;
                        try {
                            u.b(objG);
                            right = (i) objG;
                            if (!(right instanceof i.Left)) {
                                if (!(right instanceof i.Right)) {
                                    throw new p();
                                }
                                right = new i.Right(sy.a.a(sy.a.b(c0.f((byte[]) ((i.Right) right).b()))));
                            }
                            return new i.Right(sy.a.a(((sy.a) bVar6.a(right)).getValue()));
                        } catch (ex.c e26) {
                            e = e26;
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new i.Left((dx.b) ex.d.a(e));
                }
                u.b(objG);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    h.a.b bVar11 = new h.a.b(0, new r.a(0, 1, null), i16, 1, null);
                    g gVar3 = this.cipherAes;
                    byte[] bytes = this.jsonSerializer.b(new EncodedPasswordKeyData(iy.a.e(this.base64Coder, a0Var.getData(), null, 2, null), i15), q0.n(EncodedPasswordKeyData.class)).getBytes(fu.d.UTF_8);
                    g gVar4 = this.cipherAes;
                    c1557b.f69500d = vq.j.a(secretKey);
                    c1557b.f69501e = vq.j.a(a0Var);
                    c1557b.f69502f = jVarA;
                    c1557b.f69503g = vq.j.a(aVar);
                    c1557b.f69504h = vq.j.a(aVar);
                    c1557b.f69505j = bVar11;
                    c1557b.f69506k = aVar;
                    c1557b.f69507l = aVar;
                    c1557b.f69508m = bytes;
                    c1557b.f69509n = gVar3;
                    c1557b.f69510p = i15;
                    i17 = i16;
                    c1557b.f69511q = i17;
                    c1557b.f69512r = 0;
                    c1557b.f69513s = 0;
                    c1557b.f69514t = 0;
                    c1557b.f69515v = 0;
                    c1557b.f69516w = 0;
                    c1557b.f69519z = 1;
                    Object objI = gVar4.i(secretKey, bVar11, c1557b);
                    if (objI != E) {
                        a0Var2 = a0Var;
                        i18 = i15;
                        jVar = jVarA;
                        i19 = 0;
                        i25 = 0;
                        i26 = 0;
                        obj = objI;
                        secretKey2 = secretKey;
                        gVar = gVar3;
                        bVar = aVar;
                        bVar2 = bVar;
                        bVar3 = bVar2;
                        i27 = 0;
                        i28 = 0;
                        bArr = bytes;
                        bVar4 = bVar11;
                        bVar5 = bVar3;
                        Cipher cipher2 = (Cipher) bVar5.a((i) obj);
                        c1557b.f69500d = vq.j.a(secretKey2);
                        c1557b.f69501e = vq.j.a(a0Var2);
                        c1557b.f69502f = jVar;
                        c1557b.f69503g = vq.j.a(bVar3);
                        c1557b.f69504h = vq.j.a(bVar);
                        c1557b.f69505j = vq.j.a(bVar4);
                        c1557b.f69506k = bVar2;
                        c1557b.f69507l = null;
                        c1557b.f69508m = null;
                        c1557b.f69509n = null;
                        c1557b.f69510p = i18;
                        c1557b.f69511q = i17;
                        c1557b.f69512r = i25;
                        c1557b.f69513s = i19;
                        c1557b.f69514t = i28;
                        c1557b.f69515v = i26;
                        c1557b.f69516w = i27;
                        c1557b.f69519z = 2;
                        objG = gVar.g(bArr, cipher2, bVar4, c1557b);
                        if (objG != E) {
                            bVar6 = bVar2;
                            right = (i) objG;
                            if (!(right instanceof i.Left)) {
                                if (!(right instanceof i.Right)) {
                                    throw new p();
                                }
                                right = new i.Right(sy.a.a(sy.a.b(c0.f((byte[]) ((i.Right) right).b()))));
                            }
                            return new i.Right(sy.a.a(((sy.a) bVar6.a(right)).getValue()));
                        }
                    }
                    return E;
                } catch (ex.c e28) {
                    e = e28;
                } catch (CancellationException e29) {
                    throw e29;
                } catch (Exception e35) {
                    e = e35;
                    E = jVarA;
                    f fVar3 = f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar3.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
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
            } catch (Exception e36) {
                e = e36;
            }
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
