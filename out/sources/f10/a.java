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
import javax.crypto.spec.SecretKeySpec;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0013\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf10/a;", "Lf10/b;", "Liy/g;", "cipherAes", "Lwy/a;", "masterKeyProvider", "Lpy/a;", "aesKeyDecoder", "<init>", "(Liy/g;Lwy/a;Lpy/a;)V", "Liy/h$a$b;", "c", "()Liy/h$a$b;", "Liy/a0;", "encryptedData", "Ldx/i;", "Ldx/b;", "a", "(Liy/a0;Ltq/e;)Ljava/lang/Object;", "data", "b", "Liy/g;", "Lwy/a;", "Lpy/a;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f10.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g cipherAes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final py.a aesKeyDecoder;

    /* JADX INFO: renamed from: f10.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1297a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f54940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f54941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f54942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f54943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f54944h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f54945j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f54946k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f54947l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f54948m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54949n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f54950p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f54951q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f54953s;

        C1297a(tq.e<? super C1297a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f54951q = obj;
            this.f54953s |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f54954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f54955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f54956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f54957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f54958h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f54959j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f54960k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f54961l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f54962m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54963n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f54964p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f54965q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f54967s;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f54965q = obj;
            this.f54967s |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    public a(g gVar, wy.a aVar, py.a aVar2) {
        this.cipherAes = gVar;
        this.masterKeyProvider = aVar;
        this.aesKeyDecoder = aVar2;
    }

    private final h.a.b c() {
        return new h.a.b(0, new r.c(12, q.Suffix), 16, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // f10.b
    public Object a(a0 a0Var, tq.e<? super i<? extends dx.b, a0>> eVar) throws Throwable {
        C1297a c1297a;
        Object objB;
        ex.b bVar;
        if (eVar instanceof C1297a) {
            c1297a = (C1297a) eVar;
            int i15 = c1297a.f54953s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1297a.f54953s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1297a = new C1297a(eVar);
            }
        } else {
            c1297a = new C1297a(eVar);
        }
        Object obj = c1297a.f54951q;
        ?? E = uq.b.e();
        int i16 = c1297a.f54953s;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        SecretKeySpec secretKeySpec = (SecretKeySpec) aVar.a(this.aesKeyDecoder.a(this.masterKeyProvider.c().getData()));
                        g gVar = this.cipherAes;
                        byte[] data = a0Var.getData();
                        h.a.b bVarC = c();
                        c1297a.f54940d = vq.j.a(a0Var);
                        c1297a.f54941e = jVarA;
                        c1297a.f54942f = vq.j.a(aVar);
                        c1297a.f54943g = vq.j.a(aVar);
                        c1297a.f54944h = vq.j.a(secretKeySpec);
                        c1297a.f54945j = aVar;
                        c1297a.f54946k = 0;
                        c1297a.f54947l = 0;
                        c1297a.f54948m = 0;
                        c1297a.f54949n = 0;
                        c1297a.f54950p = 0;
                        c1297a.f54953s = 1;
                        Object objD = gVar.d(data, secretKeySpec, bVarC, c1297a);
                        if (objD == E) {
                            return E;
                        }
                        obj = objD;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        i iVarA = E.a(e);
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
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) c1297a.f54945j;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right(c0.f((byte[]) bVar.a((i) obj)));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // f10.b
    public Object b(a0 a0Var, tq.e<? super i<? extends dx.b, a0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b bVar2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f54967s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f54967s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f54965q;
        ?? E = uq.b.e();
        int i16 = bVar.f54967s;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        SecretKeySpec secretKeySpec = (SecretKeySpec) aVar.a(this.aesKeyDecoder.a(this.masterKeyProvider.c().getData()));
                        g gVar = this.cipherAes;
                        byte[] data = a0Var.getData();
                        h.a.b bVarC = c();
                        bVar.f54954d = vq.j.a(a0Var);
                        bVar.f54955e = jVarA;
                        bVar.f54956f = vq.j.a(aVar);
                        bVar.f54957g = vq.j.a(aVar);
                        bVar.f54958h = vq.j.a(secretKeySpec);
                        bVar.f54959j = aVar;
                        bVar.f54960k = 0;
                        bVar.f54961l = 0;
                        bVar.f54962m = 0;
                        bVar.f54963n = 0;
                        bVar.f54964p = 0;
                        bVar.f54967s = 1;
                        Object objF = gVar.f(data, secretKeySpec, bVarC, bVar);
                        if (objF == E) {
                            return E;
                        }
                        obj = objF;
                        bVar2 = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        i iVarA = E.a(e);
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
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f54959j;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right(c0.f((byte[]) bVar2.a((i) obj)));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
