package g10;

import dx.j;
import iy.a0;
import iy.c0;
import iy.w;
import iy.x;
import java.security.SecureRandom;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import lr.i;
import lr.m;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lg10/d;", "Lg10/c;", "Lpy/b;", "aesKeyGenerator", "Liy/w;", "secureRandomFactory", "<init>", "(Lpy/b;Liy/w;)V", "Liy/a0;", "d", "(Ltq/e;)Ljava/lang/Object;", "", "c", "()I", "Lg10/c$a;", "params", "Ldx/i;", "Ldx/b;", "Lg10/c$b;", "a", "(Lg10/c$a;Ltq/e;)Ljava/lang/Object;", "Lpy/b;", "b", "Liy/w;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements g10.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.b aesKeyGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w secureRandomFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f69530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f69531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f69532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f69533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f69534h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f69535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f69536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f69537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f69538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69539n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f69540p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f69541q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f69542r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f69544t;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f69542r = obj;
            this.f69544t |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f69545d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f69547f;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f69545d = obj;
            this.f69547f |= PKIFailureInfo.systemUnavail;
            return d.this.d(this);
        }
    }

    public d(py.b bVar, w wVar) {
        this.aesKeyGenerator = bVar;
        this.secureRandomFactory = wVar;
    }

    private final int c() {
        return m.s(new i(600000, 700000), jr.c.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(e<? super a0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f69547f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f69547f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f69545d;
        Object objE = uq.b.e();
        int i16 = cVar.f69547f;
        if (i16 == 0) {
            u.b(objC);
            w wVar = this.secureRandomFactory;
            cVar.f69547f = 1;
            objC = w.c(wVar, null, cVar, 1, null);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        return c0.f(x.a((SecureRandom) objC, 16));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x019c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [g10.d] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // g10.c
    public Object a(g10.c.a aVar, e<? super dx.i<? extends dx.b, g10.c.PasswordKeyResult>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int iterationsCount;
        int i15;
        g10.c.a aVar3;
        j<dx.b> jVar;
        int i16;
        a0 salt;
        int i17;
        int i18;
        int i19;
        int i25;
        ex.b bVar2;
        int i26;
        int i27;
        ex.b bVar3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i28 = bVar.f69544t;
            if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f69544t = i28 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f69542r;
        Object objE = uq.b.e();
        int i29 = bVar.f69544t;
        ?? r15 = 2;
        try {
            try {
                if (i29 == 0) {
                    u.b(objA);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        if (aVar instanceof g10.c.a.New) {
                            iterationsCount = c();
                        } else {
                            if (!(aVar instanceof g10.c.a.Specific)) {
                                throw new p();
                            }
                            iterationsCount = ((g10.c.a.Specific) aVar).getIterationsCount();
                        }
                        i15 = 0;
                        if (aVar instanceof g10.c.a.New) {
                            bVar.f69530d = aVar;
                            bVar.f69531e = jVarA;
                            bVar.f69532f = vq.j.a(aVar2);
                            bVar.f69533g = aVar2;
                            bVar.f69536k = 0;
                            bVar.f69537l = 0;
                            bVar.f69538m = 0;
                            bVar.f69539n = 0;
                            bVar.f69540p = 0;
                            bVar.f69541q = iterationsCount;
                            bVar.f69544t = 1;
                            Object objD = d(bVar);
                            if (objD != objE) {
                                aVar3 = aVar;
                                jVar = jVarA;
                                i16 = iterationsCount;
                                objA = objD;
                                i26 = 0;
                                i18 = 0;
                                i19 = 0;
                                i27 = 0;
                                bVar2 = aVar2;
                            }
                        } else {
                            if (!(aVar instanceof g10.c.a.Specific)) {
                                throw new p();
                            }
                            aVar3 = aVar;
                            jVar = jVarA;
                            i16 = iterationsCount;
                            salt = ((g10.c.a.Specific) aVar).getSalt();
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            i25 = 0;
                            bVar2 = aVar2;
                            py.b bVar4 = this.aesKeyGenerator;
                            py.d.PBEKeySpec pBEKeySpec = new py.d.PBEKeySpec(i16, salt, aVar3.getPassword());
                            bVar.f69530d = vq.j.a(aVar3);
                            bVar.f69531e = jVar;
                            bVar.f69532f = vq.j.a(bVar2);
                            bVar.f69533g = vq.j.a(aVar2);
                            bVar.f69534h = salt;
                            bVar.f69535j = aVar2;
                            bVar.f69536k = i15;
                            bVar.f69537l = i17;
                            bVar.f69538m = i19;
                            bVar.f69539n = i18;
                            bVar.f69540p = i25;
                            bVar.f69541q = i16;
                            bVar.f69544t = 2;
                            objA = bVar4.a(pBEKeySpec, bVar);
                            if (objA != objE) {
                                bVar3 = aVar2;
                                return new dx.i.Right(new g10.c.PasswordKeyResult((SecretKey) bVar3.a((dx.i) objA), i16, salt));
                            }
                        }
                        return objE;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVarA;
                        f fVar = f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                if (i29 != 1) {
                    if (i29 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i16 = bVar.f69541q;
                    bVar3 = (ex.b) bVar.f69535j;
                    salt = (a0) bVar.f69534h;
                    try {
                        u.b(objA);
                        return new dx.i.Right(new g10.c.PasswordKeyResult((SecretKey) bVar3.a((dx.i) objA), i16, salt));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                i16 = bVar.f69541q;
                i26 = bVar.f69540p;
                i18 = bVar.f69539n;
                i19 = bVar.f69538m;
                i15 = bVar.f69537l;
                i27 = bVar.f69536k;
                aVar2 = (ex.b) bVar.f69533g;
                bVar2 = (ex.b) bVar.f69532f;
                jVar = (j) bVar.f69531e;
                aVar3 = (g10.c.a) bVar.f69530d;
                try {
                    u.b(objA);
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    r15 = jVar;
                    f fVar2 = f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
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
                int i35 = i26;
                salt = (a0) objA;
                i17 = i15;
                i15 = i27;
                i25 = i35;
                py.b bVar5 = this.aesKeyGenerator;
                py.d.PBEKeySpec pBEKeySpec2 = new py.d.PBEKeySpec(i16, salt, aVar3.getPassword());
                bVar.f69530d = vq.j.a(aVar3);
                bVar.f69531e = jVar;
                bVar.f69532f = vq.j.a(bVar2);
                bVar.f69533g = vq.j.a(aVar2);
                bVar.f69534h = salt;
                bVar.f69535j = aVar2;
                bVar.f69536k = i15;
                bVar.f69537l = i17;
                bVar.f69538m = i19;
                bVar.f69539n = i18;
                bVar.f69540p = i25;
                bVar.f69541q = i16;
                bVar.f69544t = 2;
                objA = bVar5.a(pBEKeySpec2, bVar);
                if (objA != objE) {
                    bVar3 = aVar2;
                    return new dx.i.Right(new g10.c.PasswordKeyResult((SecretKey) bVar3.a((dx.i) objA), i16, salt));
                }
                return objE;
            } catch (Exception e28) {
                e = e28;
            }
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
