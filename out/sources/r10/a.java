package r10;

import dx.i;
import dx.j;
import er.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lr10/a;", "Laz/a;", "Lxw/d;", "dispatcherProvider", "<init>", "(Lxw/d;)V", "", "data", "Ldx/i;", "Ldx/b;", "b", "([BLtq/e;)Ljava/lang/Object;", "a", "Lxw/d;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements az.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: r10.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4314a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f170387h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f170388j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f170389k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f170390l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f170392n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f170394q;

        C4314a(tq.e<? super C4314a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170392n = obj;
            this.f170394q |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f170396f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(byte[] bArr, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f170396f = bArr;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170395e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f170396f);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    ar.a.b(byteArrayInputStream, gZIPOutputStream, 0, 2, null);
                    ar.b.a(byteArrayInputStream, null);
                    ar.b.a(gZIPOutputStream, null);
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ar.b.a(byteArrayInputStream, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    ar.b.a(gZIPOutputStream, th6);
                    throw th7;
                }
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f170396f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170400g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f170401h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f170402j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f170403k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f170404l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170405m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f170406n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f170408q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170406n = obj;
            this.f170408q |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f170410f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(byte[] bArr, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f170410f = bArr;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170409e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f170410f);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                ar.a.b(gZIPInputStream, byteArrayOutputStream, 0, 2, null);
                ar.b.a(gZIPInputStream, null);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(gZIPInputStream, th4);
                    throw th5;
                }
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f170410f, eVar);
        }
    }

    public a(xw.d dVar) {
        this.dispatcherProvider = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // az.a
    public Object a(byte[] bArr, tq.e<? super i<? extends dx.b, byte[]>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f170408q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f170408q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f170406n;
        Object objE = uq.b.e();
        int i16 = cVar.f170408q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        xw.d dVar = this.dispatcherProvider;
                        d dVar2 = new d(bArr, null);
                        cVar.f170397d = vq.j.a(bArr);
                        cVar.f170398e = jVarA;
                        cVar.f170399f = vq.j.a(aVar);
                        cVar.f170400g = vq.j.a(aVar);
                        cVar.f170401h = 0;
                        cVar.f170402j = 0;
                        cVar.f170403k = 0;
                        cVar.f170404l = 0;
                        cVar.f170405m = 0;
                        cVar.f170408q = 1;
                        Object objA = dVar.a(dVar2, cVar);
                        if (objA == objE) {
                            return objE;
                        }
                        obj = objA;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        bArr = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bArr));
                        i iVarA = bArr.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right((byte[]) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // az.a
    public Object b(byte[] bArr, tq.e<? super i<? extends dx.b, byte[]>> eVar) throws Throwable {
        C4314a c4314a;
        Object objB;
        ex.c e15;
        if (eVar instanceof C4314a) {
            c4314a = (C4314a) eVar;
            int i15 = c4314a.f170394q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4314a.f170394q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4314a = new C4314a(eVar);
            }
        } else {
            c4314a = new C4314a(eVar);
        }
        Object obj = c4314a.f170392n;
        Object objE = uq.b.e();
        int i16 = c4314a.f170394q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        xw.d dVar = this.dispatcherProvider;
                        b bVar = new b(bArr, null);
                        c4314a.f170383d = vq.j.a(bArr);
                        c4314a.f170384e = jVarA;
                        c4314a.f170385f = vq.j.a(aVar);
                        c4314a.f170386g = vq.j.a(aVar);
                        c4314a.f170387h = 0;
                        c4314a.f170388j = 0;
                        c4314a.f170389k = 0;
                        c4314a.f170390l = 0;
                        c4314a.f170391m = 0;
                        c4314a.f170394q = 1;
                        Object objA = dVar.a(bVar, c4314a);
                        if (objA == objE) {
                            return objE;
                        }
                        obj = objA;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        bArr = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bArr));
                        i iVarA = bArr.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right((byte[]) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
