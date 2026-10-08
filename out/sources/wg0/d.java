package wg0;

import fr.t;
import iy.a0;
import iy.b0;
import iy.c0;
import iy.w;
import iy.x;
import java.security.SecureRandom;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pg0.KeyParamsData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lwg0/d;", "", "Lwg0/d$b;", "Lwg0/l;", "Lpy/b;", "aesKeyGenerator", "Liy/w;", "secureRandomFactory", "<init>", "(Lpy/b;Liy/w;)V", "", "iterationCount", "Liy/a0;", "salt", "Liy/b0;", "pin", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "f", "(ILiy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "e", "(Ltq/e;)Ljava/lang/Object;", "g", "()I", "params", "h", "(Lwg0/d$b;Ltq/e;)Ljava/lang/Object;", "a", "Lpy/b;", "b", "Liy/w;", "c", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.b aesKeyGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w secureRandomFactory;

    /* JADX INFO: renamed from: wg0.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwg0/d$b;", "Lgz/b$a;", "Liy/b0;", "pin", "Lpg0/c;", "keyParams", "<init>", "(Liy/b0;Lpg0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Lpg0/c;", "()Lpg0/c;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyParamsData keyParams;

        public Params(b0 b0Var, KeyParamsData keyParamsData) {
            this.pin = b0Var;
            this.keyParams = keyParamsData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final KeyParamsData getKeyParams() {
            return this.keyParams;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getPin() {
            return this.pin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.pin, params.pin) && t.c(this.keyParams, params.keyParams);
        }

        public int hashCode() {
            int iHashCode = this.pin.hashCode() * 31;
            KeyParamsData keyParamsData = this.keyParams;
            return iHashCode + (keyParamsData == null ? 0 : keyParamsData.hashCode());
        }

        public String toString() {
            return "Params(pin=" + this.pin + ", keyParams=" + this.keyParams + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f213029d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213031f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213029d = obj;
            this.f213031f |= PKIFailureInfo.systemUnavail;
            return d.this.e(this);
        }
    }

    /* JADX INFO: renamed from: wg0.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5629d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213035g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213036h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213037j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f213038k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f213039l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f213040m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213041n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213042p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f213043q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f213044r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f213046t;

        C5629d(tq.e<? super C5629d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213044r = obj;
            this.f213046t |= PKIFailureInfo.systemUnavail;
            return d.this.h(null, this);
        }
    }

    public d(py.b bVar, w wVar) {
        this.aesKeyGenerator = bVar;
        this.secureRandomFactory = wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tq.e<? super a0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f213031f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f213031f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f213029d;
        Object objE = uq.b.e();
        int i16 = cVar.f213031f;
        if (i16 == 0) {
            u.b(objC);
            w wVar = this.secureRandomFactory;
            cVar.f213031f = 1;
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

    private final Object f(int i15, a0 a0Var, b0 b0Var, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) {
        return this.aesKeyGenerator.a(new py.d.PBEKeySpec(i15, a0Var, b0Var), eVar);
    }

    private final int g() {
        return lr.m.s(new lr.i(600000, 700000), jr.c.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [wg0.d] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public Object h(Params params, tq.e<? super dx.i<? extends dx.b, PassKeyAndParams>> eVar) {
        C5629d c5629d;
        String message;
        dx.i iVarA;
        Object objB;
        Object objA;
        ex.b aVar;
        int i15;
        Params params2;
        Object obj;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        PassKeyAndParams passKeyAndParams;
        a0 a0Var;
        int iG;
        Object objF;
        a0 a0Var2;
        int i25;
        Params params3 = params;
        if (eVar instanceof C5629d) {
            c5629d = (C5629d) eVar;
            int i26 = c5629d.f213046t;
            if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                c5629d.f213046t = i26 - PKIFailureInfo.systemUnavail;
            } else {
                c5629d = new C5629d(eVar);
            }
        } else {
            c5629d = new C5629d(eVar);
        }
        Object obj2 = c5629d.f213044r;
        Object objE = uq.b.e();
        int i27 = c5629d.f213046t;
        ?? r15 = 3;
        try {
            try {
                try {
                    if (i27 == 0) {
                        u.b(obj2);
                        objA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            i15 = 0;
                            if (params3.getKeyParams() != null) {
                                int iterationCount = params3.getKeyParams().getIterationCount();
                                a0 salt = params3.getKeyParams().getSalt();
                                b0 pin = params3.getPin();
                                c5629d.f213032d = params3;
                                c5629d.f213033e = objA;
                                c5629d.f213034f = vq.j.a(aVar);
                                c5629d.f213035g = vq.j.a(aVar);
                                c5629d.f213036h = aVar;
                                c5629d.f213038k = 0;
                                c5629d.f213039l = 0;
                                c5629d.f213040m = 0;
                                c5629d.f213041n = 0;
                                c5629d.f213042p = 0;
                                c5629d.f213046t = 1;
                                Object objF2 = f(iterationCount, salt, pin, c5629d);
                                if (objF2 != objE) {
                                    objA = objA;
                                    obj2 = objF2;
                                    passKeyAndParams = new PassKeyAndParams((SecretKey) aVar.a((dx.i) obj2), params3.getKeyParams());
                                }
                            } else {
                                c5629d.f213032d = params3;
                                c5629d.f213033e = objA;
                                c5629d.f213034f = vq.j.a(aVar);
                                c5629d.f213035g = aVar;
                                c5629d.f213038k = 0;
                                c5629d.f213039l = 0;
                                c5629d.f213040m = 0;
                                c5629d.f213041n = 0;
                                c5629d.f213042p = 0;
                                c5629d.f213046t = 2;
                                Object objE2 = e(c5629d);
                                if (objE2 != objE) {
                                    objA = objA;
                                    params2 = params3;
                                    obj = objA;
                                    obj2 = objE2;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    bVar = aVar;
                                    a0Var = (a0) obj2;
                                    iG = g();
                                    b0 pin2 = params2.getPin();
                                    c5629d.f213032d = vq.j.a(params2);
                                    c5629d.f213033e = obj;
                                    c5629d.f213034f = vq.j.a(aVar);
                                    c5629d.f213035g = vq.j.a(bVar);
                                    c5629d.f213036h = bVar;
                                    c5629d.f213037j = a0Var;
                                    c5629d.f213038k = i19;
                                    c5629d.f213039l = i18;
                                    c5629d.f213040m = i17;
                                    c5629d.f213041n = i15;
                                    c5629d.f213042p = i16;
                                    c5629d.f213043q = iG;
                                    c5629d.f213046t = 3;
                                    objF = f(iG, a0Var, pin2, c5629d);
                                    objA = a0Var;
                                    if (objF != objE) {
                                        a0Var2 = a0Var;
                                        obj2 = objF;
                                        i25 = iG;
                                        passKeyAndParams = new PassKeyAndParams((SecretKey) bVar.a((dx.i) obj2), new KeyParamsData(a0Var2, i25));
                                    }
                                }
                            }
                            objA = objA;
                            objA = objA;
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = objA;
                            px.f fVar = px.f.f163100a;
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
                    if (i27 != 1) {
                        if (i27 == 2) {
                            i16 = c5629d.f213042p;
                            int i28 = c5629d.f213041n;
                            i17 = c5629d.f213040m;
                            i18 = c5629d.f213039l;
                            int i29 = c5629d.f213038k;
                            ex.b bVar2 = (ex.b) c5629d.f213035g;
                            aVar = (ex.b) c5629d.f213034f;
                            obj = (dx.j) c5629d.f213033e;
                            params2 = (Params) c5629d.f213032d;
                            try {
                                u.b(obj2);
                                i15 = i28;
                                bVar = bVar2;
                                i19 = i29;
                                obj = obj;
                                a0Var = (a0) obj2;
                                iG = g();
                                b0 pin3 = params2.getPin();
                                c5629d.f213032d = vq.j.a(params2);
                                c5629d.f213033e = obj;
                                c5629d.f213034f = vq.j.a(aVar);
                                c5629d.f213035g = vq.j.a(bVar);
                                c5629d.f213036h = bVar;
                                c5629d.f213037j = a0Var;
                                c5629d.f213038k = i19;
                                c5629d.f213039l = i18;
                                c5629d.f213040m = i17;
                                c5629d.f213041n = i15;
                                c5629d.f213042p = i16;
                                c5629d.f213043q = iG;
                                c5629d.f213046t = 3;
                                objF = f(iG, a0Var, pin3, c5629d);
                                objA = a0Var;
                                if (objF != objE) {
                                    a0Var2 = a0Var;
                                    obj2 = objF;
                                    i25 = iG;
                                }
                                objA = objA;
                                objA = objA;
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                r15 = obj;
                                px.f fVar2 = px.f.f163100a;
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
                        }
                        if (i27 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i25 = c5629d.f213043q;
                        a0 a0Var3 = (a0) c5629d.f213037j;
                        bVar = (ex.b) c5629d.f213036h;
                        u.b(obj2);
                        a0Var2 = a0Var3;
                        passKeyAndParams = new PassKeyAndParams((SecretKey) bVar.a((dx.i) obj2), new KeyParamsData(a0Var2, i25));
                    } else {
                        ex.b bVar3 = (ex.b) c5629d.f213036h;
                        Params params4 = (Params) c5629d.f213032d;
                        u.b(obj2);
                        aVar = bVar3;
                        params3 = params4;
                        passKeyAndParams = new PassKeyAndParams((SecretKey) aVar.a((dx.i) obj2), params3.getKeyParams());
                    }
                    return new dx.i.Right(passKeyAndParams);
                } catch (Exception e26) {
                    e = e26;
                }
            } catch (CancellationException e27) {
                throw e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
