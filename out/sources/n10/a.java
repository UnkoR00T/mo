package n10;

import ay.j;
import dx.i;
import iy.a0;
import iy.g;
import iy.h;
import iy.q;
import iy.r;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ln10/a;", "Ln10/c;", "Lay/j;", "jsonSerializer", "Lp10/b;", "databaseKeyProvider", "Liy/g;", "aes", "Lpy/a;", "aesKeyDecoder", "<init>", "(Lay/j;Lp10/b;Liy/g;Lpy/a;)V", "", "data", "Ldx/i;", "Ldx/b;", "Ln10/b;", "f", "([BLtq/e;)Ljava/lang/Object;", "encryptedData", "e", "(Ln10/b;Ltq/e;)Ljava/lang/Object;", "T", "obj", "Lmr/p;", "type", "a", "(Ljava/lang/Object;Lmr/p;Ltq/e;)Ljava/lang/Object;", "b", "(Ln10/b;Lmr/p;Ltq/e;)Ljava/lang/Object;", "Lay/j;", "Lp10/b;", "c", "Liy/g;", "d", "Lpy/a;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements n10.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p10.b databaseKeyProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g aes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final py.a aesKeyDecoder;

    /* JADX INFO: renamed from: n10.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3241a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f130590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f130591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f130592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f130593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f130594h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f130595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f130596k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f130597l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f130598m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f130599n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f130600p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f130602r;

        C3241a(e<? super C3241a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f130600p = obj;
            this.f130602r |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f130603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f130604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f130605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f130606g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f130607h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f130608j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f130609k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f130610l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f130611m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f130612n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f130613p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f130614q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f130616s;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f130614q = obj;
            this.f130616s |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f130617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f130618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f130619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f130620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f130621h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f130622j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f130623k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f130624l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f130625m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f130626n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f130627p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f130629r;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f130627p = obj;
            this.f130629r |= PKIFailureInfo.systemUnavail;
            return a.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f130630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f130631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f130632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f130633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f130634h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f130635j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f130636k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f130637l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f130638m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f130639n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f130640p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f130641q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f130642r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f130644t;

        d(e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f130642r = obj;
            this.f130644t |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, this);
        }
    }

    public a(j jVar, p10.b bVar, g gVar, py.a aVar) {
        this.jsonSerializer = jVar;
        this.databaseKeyProvider = bVar;
        this.aes = gVar;
        this.aesKeyDecoder = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final Object e(EncryptedDataField encryptedDataField, e<? super i<? extends dx.b, byte[]>> eVar) throws Throwable {
        C3241a c3241a;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        ex.b bVar;
        if (eVar instanceof C3241a) {
            c3241a = (C3241a) eVar;
            int i15 = c3241a.f130602r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3241a.f130602r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3241a = new C3241a(eVar);
            }
        } else {
            c3241a = new C3241a(eVar);
        }
        Object obj = c3241a.f130600p;
        Object objE = uq.b.e();
        int i16 = c3241a.f130602r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        g gVar = this.aes;
                        byte[] content = encryptedDataField.getContent();
                        SecretKey secretKey = (SecretKey) aVar.a(this.aesKeyDecoder.a(((a0) aVar.a(this.databaseKeyProvider.getKey())).getData()));
                        h.a.b bVar2 = new h.a.b(0, new r.c(16, q.Suffix), 17, 1, null);
                        c3241a.f130590d = vq.j.a(encryptedDataField);
                        c3241a.f130591e = jVarA;
                        c3241a.f130592f = vq.j.a(aVar);
                        c3241a.f130593g = vq.j.a(aVar);
                        c3241a.f130594h = aVar;
                        c3241a.f130595j = 0;
                        c3241a.f130596k = 0;
                        c3241a.f130597l = 0;
                        c3241a.f130598m = 0;
                        c3241a.f130599n = 0;
                        c3241a.f130602r = 1;
                        Object objD = gVar.d(content, secretKey, bVar2, c3241a);
                        if (objD == objE) {
                            return objE;
                        }
                        obj = objD;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        exc = e17;
                        r15 = jVarA;
                        f fVar = f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        i iVarA = r15.a(exc);
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
                    bVar = (ex.b) c3241a.f130594h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        cVar = e18;
                        return new i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right((byte[]) bVar.a((i) obj));
            } catch (Exception e25) {
                exc = e25;
                r15 = objE;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final Object f(byte[] bArr, e<? super i<? extends dx.b, EncryptedDataField>> eVar) throws Throwable {
        c cVar;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar2;
        ex.b bVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f130629r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f130629r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f130627p;
        Object objE = uq.b.e();
        int i16 = cVar.f130629r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        g gVar = this.aes;
                        SecretKey secretKey = (SecretKey) aVar.a(this.aesKeyDecoder.a(((a0) aVar.a(this.databaseKeyProvider.getKey())).getData()));
                        h.a.b bVar2 = new h.a.b(0, new r.c(16, q.Suffix), 17, 1, null);
                        cVar.f130617d = vq.j.a(bArr);
                        cVar.f130618e = jVarA;
                        cVar.f130619f = vq.j.a(aVar);
                        cVar.f130620g = vq.j.a(aVar);
                        cVar.f130621h = aVar;
                        cVar.f130622j = 0;
                        cVar.f130623k = 0;
                        cVar.f130624l = 0;
                        cVar.f130625m = 0;
                        cVar.f130626n = 0;
                        cVar.f130629r = 1;
                        Object objF = gVar.f(bArr, secretKey, bVar2, cVar);
                        if (objF == objE) {
                            return objE;
                        }
                        obj = objF;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        cVar2 = e15;
                        return new i.Left((dx.b) ex.d.a(cVar2));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        exc = e17;
                        r15 = jVarA;
                        f fVar = f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        i iVarA = r15.a(exc);
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
                    bVar = (ex.b) cVar.f130621h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        cVar2 = e18;
                        return new i.Left((dx.b) ex.d.a(cVar2));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right(new EncryptedDataField((byte[]) bVar.a((i) obj)));
            } catch (Exception e25) {
                exc = e25;
                r15 = objE;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [n10.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, mr.p] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // n10.c
    public <T> Object a(T t15, mr.p pVar, e<? super i<? extends dx.b, EncryptedDataField>> eVar) throws Throwable {
        d dVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f130644t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f130644t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f130642r;
        Object objE = uq.b.e();
        int i16 = dVar.f130644t;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        String strB = this.jsonSerializer.b(t15, pVar);
                        byte[] bytes = strB.getBytes(fu.d.UTF_8);
                        dVar.f130630d = vq.j.a(t15);
                        dVar.f130631e = vq.j.a(pVar);
                        dVar.f130632f = jVarA;
                        dVar.f130633g = vq.j.a(aVar);
                        dVar.f130634h = vq.j.a(aVar);
                        dVar.f130635j = vq.j.a(strB);
                        dVar.f130636k = aVar;
                        dVar.f130637l = 0;
                        dVar.f130638m = 0;
                        dVar.f130639n = 0;
                        dVar.f130640p = 0;
                        dVar.f130641q = 0;
                        dVar.f130644t = 1;
                        Object objF = f(bytes, dVar);
                        if (objF == objE) {
                            return objE;
                        }
                        obj = objF;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        pVar = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(pVar));
                        i iVarA = pVar.a(e);
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
                    bVar = (ex.b) dVar.f130636k;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right((EncryptedDataField) bVar.a((i) obj));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [n10.a] */
    /* JADX WARN: Type inference failed for: r6v22, types: [ay.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, mr.p] */
    /* JADX WARN: Type inference failed for: r7v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [mr.p] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // n10.c
    public <T> Object b(EncryptedDataField encryptedDataField, mr.p pVar, e<? super i<? extends dx.b, ? extends T>> eVar) throws Throwable {
        b bVar;
        Object objB;
        dx.j<dx.b> jVarA;
        Object obj;
        ex.b bVar2;
        ex.c e15;
        ?? r15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f130616s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f130616s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj2 = bVar.f130614q;
        Object objE = uq.b.e();
        int i16 = bVar.f130616s;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj2);
                    jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        bVar.f130603d = vq.j.a(encryptedDataField);
                        bVar.f130604e = pVar;
                        bVar.f130605f = jVarA;
                        bVar.f130606g = vq.j.a(aVar);
                        bVar.f130607h = vq.j.a(aVar);
                        bVar.f130608j = aVar;
                        bVar.f130609k = 0;
                        bVar.f130610l = 0;
                        bVar.f130611m = 0;
                        bVar.f130612n = 0;
                        bVar.f130613p = 0;
                        bVar.f130616s = 1;
                        Object objE2 = e(encryptedDataField, bVar);
                        if (objE2 == objE) {
                            return objE;
                        }
                        obj = objE2;
                        bVar2 = aVar;
                        r15 = pVar;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        pVar = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(pVar));
                        i iVarA = pVar.a(e);
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
                    bVar2 = (ex.b) bVar.f130608j;
                    dx.j<dx.b> jVar = (dx.j) bVar.f130605f;
                    mr.p pVar2 = (mr.p) bVar.f130604e;
                    try {
                        u.b(obj2);
                        obj = obj2;
                        jVarA = jVar;
                        r15 = pVar2;
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(this.jsonSerializer.a(new String((byte[]) bVar2.a((i) obj), fu.d.UTF_8), r15));
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
