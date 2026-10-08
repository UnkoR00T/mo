package e82;

import er.p;
import fr.t;
import iy.b0;
import java.util.concurrent.CancellationException;
import ju.p0;
import ju.q0;
import ju.w0;
import k34.u;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Le82/k;", "", "Lgz/b$a$a;", "Le82/k$b;", "Ly72/a;", "giosContainersInteractor", "<init>", "(Ly72/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ly72/a;", "b", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f48462b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48463c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f48464d = u.MOBYWATEL;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y72.a giosContainersInteractor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le82/k$a;", "", "<init>", "()V", "Lk34/u;", "identityType", "Lk34/u;", "a", "()Lk34/u;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final u a() {
            return k.f48464d;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: e82.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Le82/k$b;", "", "Lfp0/d;", "identity", "Lry/c;", "certKeyPair", "<init>", "(Lfp0/d;Lry/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp0/d;", "b", "()Lfp0/d;", "Lry/c;", "()Lry/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fp0.d identity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certKeyPair;

        public Result(fp0.d dVar, CertKeyPair certKeyPair) {
            this.identity = dVar;
            this.certKeyPair = certKeyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertKeyPair() {
            return this.certKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fp0.d getIdentity() {
            return this.identity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.identity, result.identity) && t.c(this.certKeyPair, result.certKeyPair);
        }

        public int hashCode() {
            return (this.identity.hashCode() * 31) + this.certKeyPair.hashCode();
        }

        public String toString() {
            return "Result(identity=" + this.identity + ", certKeyPair=" + this.certKeyPair + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Le82/k$b;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f48469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f48470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f48471h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f48472j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f48473k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f48474l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f48475m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48476n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f48477p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f48478q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48479r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f48480s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f48481t;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lry/c;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends CertKeyPair>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f48483e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f48484f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f48484f = kVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f48483e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                y72.a aVar = this.f48484f.giosContainersInteractor;
                u uVarA = k.f48462b.a();
                this.f48483e = 1;
                Object objB = aVar.b(uVarA, this);
                return objB == objE ? objE : objB;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f48484f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Liy/b0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class b extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends b0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f48485e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f48486f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k kVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f48486f = kVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f48485e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                y72.a aVar = this.f48486f.giosContainersInteractor;
                u uVarA = k.f48462b.a();
                this.f48485e = 1;
                Object objG = aVar.g(uVarA, this);
                return objG == objE ? objE : objG;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, b0>> eVar) {
                return ((b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f48486f, eVar);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x012f  */
        /* JADX WARN: Code duplicated, block: B:49:0x0164  */
        /* JADX WARN: Code duplicated, block: B:52:0x0175  */
        /* JADX WARN: Code duplicated, block: B:53:0x0183  */
        /* JADX WARN: Code duplicated, block: B:55:0x0187  */
        /* JADX WARN: Code duplicated, block: B:58:0x0193  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v3 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            ex.b aVar;
            w0 w0VarB;
            Object objI;
            int i15;
            int i16;
            int i17;
            int i18;
            w0 w0Var;
            ex.b bVar;
            int i19;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            fp0.d.Ticket ticket;
            Object objI2;
            fp0.d dVar;
            p0 p0Var = (p0) this.f48481t;
            Object objE = uq.b.e();
            ?? r15 = this.f48480s;
            try {
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(obj);
                            k kVar = k.this;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                aVar = new ex.a();
                                w0VarB = ju.k.b(p0Var, null, null, new a(kVar, null), 3, null);
                                w0 w0VarB2 = ju.k.b(p0Var, null, null, new b(kVar, null), 3, null);
                                this.f48481t = vq.j.a(p0Var);
                                this.f48468e = jVarA;
                                this.f48469f = vq.j.a(aVar);
                                this.f48470g = aVar;
                                this.f48471h = w0VarB;
                                this.f48472j = vq.j.a(w0VarB2);
                                this.f48473k = aVar;
                                this.f48475m = 0;
                                this.f48476n = 0;
                                this.f48477p = 0;
                                this.f48478q = 0;
                                this.f48479r = 0;
                                this.f48480s = 1;
                                objI = w0VarB2.I(this);
                                if (objI != objE) {
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    w0Var = w0VarB2;
                                    bVar = aVar;
                                    i19 = 0;
                                    jVar = jVarA;
                                    bVar2 = bVar;
                                    ticket = new fp0.d.Ticket((b0) bVar2.a((dx.i) objI));
                                    this.f48481t = vq.j.a(p0Var);
                                    this.f48468e = jVar;
                                    this.f48469f = vq.j.a(bVar);
                                    this.f48470g = vq.j.a(aVar);
                                    this.f48471h = vq.j.a(w0VarB);
                                    this.f48472j = vq.j.a(w0Var);
                                    this.f48473k = aVar;
                                    this.f48474l = ticket;
                                    this.f48475m = i19;
                                    this.f48476n = i18;
                                    this.f48477p = i17;
                                    this.f48478q = i16;
                                    this.f48479r = i15;
                                    this.f48480s = 2;
                                    objI2 = w0VarB.I(this);
                                    if (objI2 != objE) {
                                        dVar = ticket;
                                        return new dx.i.Right(new Result(dVar, (CertKeyPair) aVar.a((dx.i) objI2)));
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
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 == 1) {
                            int i25 = this.f48479r;
                            int i26 = this.f48478q;
                            int i27 = this.f48477p;
                            int i28 = this.f48476n;
                            int i29 = this.f48475m;
                            ex.b bVar3 = (ex.b) this.f48473k;
                            w0 w0Var2 = (w0) this.f48472j;
                            w0 w0Var3 = (w0) this.f48471h;
                            aVar = (ex.b) this.f48470g;
                            ex.b bVar4 = (ex.b) this.f48469f;
                            dx.j<dx.b> jVar2 = (dx.j) this.f48468e;
                            try {
                                oq.u.b(obj);
                                bVar = bVar4;
                                w0Var = w0Var2;
                                i19 = i29;
                                i17 = i27;
                                i15 = i25;
                                jVar = jVar2;
                                w0VarB = w0Var3;
                                bVar2 = bVar3;
                                i18 = i28;
                                i16 = i26;
                                objI = obj;
                                ticket = new fp0.d.Ticket((b0) bVar2.a((dx.i) objI));
                                this.f48481t = vq.j.a(p0Var);
                                this.f48468e = jVar;
                                this.f48469f = vq.j.a(bVar);
                                this.f48470g = vq.j.a(aVar);
                                this.f48471h = vq.j.a(w0VarB);
                                this.f48472j = vq.j.a(w0Var);
                                this.f48473k = aVar;
                                this.f48474l = ticket;
                                this.f48475m = i19;
                                this.f48476n = i18;
                                this.f48477p = i17;
                                this.f48478q = i16;
                                this.f48479r = i15;
                                this.f48480s = 2;
                                objI2 = w0VarB.I(this);
                                if (objI2 != objE) {
                                    dVar = ticket;
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
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
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = (fp0.d) this.f48474l;
                        ex.b bVar5 = (ex.b) this.f48473k;
                        oq.u.b(obj);
                        aVar = bVar5;
                        objI2 = obj;
                        return new dx.i.Right(new Result(dVar, (CertKeyPair) aVar.a((dx.i) objI2)));
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f48481t = obj;
            return cVar;
        }
    }

    public k(y72.a aVar) {
        this.giosContainersInteractor = aVar;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
        return q0.e(new c(null), eVar);
    }
}
