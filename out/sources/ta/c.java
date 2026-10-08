package ta;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import ju.p0;
import oa.c0;
import oa.f0;
import oa.g0;
import oa.u;
import oa.v;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"R", "Loa/u;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Lya/b;", "block", "d", "(Loa/u;ZZLer/l;Ltq/e;)Ljava/lang/Object;", "b", "(Loa/u;ZZLer/l;)Ljava/lang/Object;", "Ltq/e;", "", "c", "(Loa/u;Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltq/i;", "a", "(Loa/u;ZLtq/e;)Ljava/lang/Object;", "Ljava/io/File;", "databaseFile", "", "e", "(Ljava/io/File;)I", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
final /* synthetic */ class c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class a<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ tq.i f189006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f189007g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f189008h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f189009j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ er.l<ya.b, R> f189010k;

        /* JADX INFO: renamed from: ta.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        static final class C4908a extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f189011e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f189012f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f189013g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f189014h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ er.l<ya.b, R> f189015j;

            /* JADX INFO: renamed from: ta.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Loa/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            public static final class C4909a extends vq.k implements er.p<g0, tq.e<? super R>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f189016e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f189017f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                /* synthetic */ Object f189018g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f189019h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ boolean f189020j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ u f189021k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ er.l f189022l;

                /* JADX INFO: renamed from: ta.c$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Loa/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                public static final class C4910a extends vq.k implements er.p<f0<R>, tq.e<? super R>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f189023e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private /* synthetic */ Object f189024f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ er.l f189025g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4910a(tq.e eVar, er.l lVar) {
                        super(2, eVar);
                        this.f189025g = lVar;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        uq.b.e();
                        if (this.f189023e != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                        return this.f189025g.b(((qa.q) ((f0) this.f189024f)).getDelegate());
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(f0<R> f0Var, tq.e<? super R> eVar) {
                        return ((C4910a) v(f0Var, eVar)).J(i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                        C4910a c4910a = new C4910a(eVar, this.f189025g);
                        c4910a.f189024f = obj;
                        return c4910a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4909a(boolean z15, boolean z16, u uVar, tq.e eVar, er.l lVar) {
                    super(2, eVar);
                    this.f189019h = z15;
                    this.f189020j = z16;
                    this.f189021k = uVar;
                    this.f189022l = lVar;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
                  0x00a2: PHI (r1v11 oa.g0) = (r1v8 oa.g0), (r1v18 oa.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
                  0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    g0.a aVar;
                    g0 g0Var;
                    g0 g0Var2;
                    g0.a aVar2;
                    g0 g0Var3;
                    Object objC;
                    Object obj2;
                    Object objE = uq.b.e();
                    int i15 = this.f189017f;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        g0 g0Var4 = (g0) this.f189018g;
                        if (!this.f189019h) {
                            return this.f189022l.b(((qa.q) g0Var4).getDelegate());
                        }
                        boolean z15 = this.f189020j;
                        aVar = z15 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                        if (z15) {
                            g0Var = g0Var4;
                            C4910a c4910a = new C4910a(null, this.f189022l);
                            this.f189018g = g0Var;
                            this.f189016e = null;
                            this.f189017f = 3;
                            obj = g0Var.a(aVar, c4910a, this);
                            if (obj != objE) {
                                if (this.f189020j) {
                                    return obj;
                                }
                                this.f189018g = obj;
                                this.f189017f = 4;
                                objC = g0Var.c(this);
                                if (objC != objE) {
                                    obj2 = obj;
                                    obj = objC;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f189021k.u().u();
                                    }
                                    return obj2;
                                }
                            }
                        } else {
                            this.f189018g = g0Var4;
                            this.f189016e = aVar;
                            this.f189017f = 1;
                            Object objC2 = g0Var4.c(this);
                            if (objC2 != objE) {
                                g0Var2 = g0Var4;
                                obj = objC2;
                                aVar2 = aVar;
                            }
                        }
                        return objE;
                    }
                    if (i15 == 1) {
                        aVar2 = (g0.a) this.f189016e;
                        g0Var2 = (g0) this.f189018g;
                        oq.u.b(obj);
                    } else {
                        if (i15 == 2) {
                            aVar2 = (g0.a) this.f189016e;
                            g0Var3 = (g0) this.f189018g;
                            oq.u.b(obj);
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C4910a c4910a2 = new C4910a(null, this.f189022l);
                            this.f189018g = g0Var;
                            this.f189016e = null;
                            this.f189017f = 3;
                            obj = g0Var.a(aVar, c4910a2, this);
                            if (obj != objE) {
                                if (this.f189020j) {
                                    return obj;
                                }
                                this.f189018g = obj;
                                this.f189017f = 4;
                                objC = g0Var.c(this);
                                if (objC != objE) {
                                    obj2 = obj;
                                    obj = objC;
                                }
                            }
                            return objE;
                        }
                        if (i15 == 3) {
                            g0Var = (g0) this.f189018g;
                            oq.u.b(obj);
                            if (this.f189020j) {
                                return obj;
                            }
                            this.f189018g = obj;
                            this.f189017f = 4;
                            objC = g0Var.c(this);
                            if (objC != objE) {
                                obj2 = obj;
                                obj = objC;
                            }
                            return objE;
                        }
                        if (i15 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f189018g;
                        oq.u.b(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        this.f189021k.u().u();
                    }
                    return obj2;
                    if (((Boolean) obj).booleanValue()) {
                        aVar = aVar2;
                        g0Var = g0Var2;
                        C4910a c4910a3 = new C4910a(null, this.f189022l);
                        this.f189018g = g0Var;
                        this.f189016e = null;
                        this.f189017f = 3;
                        obj = g0Var.a(aVar, c4910a3, this);
                        if (obj != objE) {
                            if (this.f189020j) {
                                return obj;
                            }
                            this.f189018g = obj;
                            this.f189017f = 4;
                            objC = g0Var.c(this);
                            if (objC != objE) {
                                obj2 = obj;
                                obj = objC;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f189021k.u().u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        androidx.room.c cVarU = this.f189021k.u();
                        this.f189018g = g0Var2;
                        this.f189016e = aVar2;
                        this.f189017f = 2;
                        if (cVarU.A(this) != objE) {
                            g0Var3 = g0Var2;
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C4910a c4910a4 = new C4910a(null, this.f189022l);
                            this.f189018g = g0Var;
                            this.f189016e = null;
                            this.f189017f = 3;
                            obj = g0Var.a(aVar, c4910a4, this);
                            if (obj != objE) {
                                if (this.f189020j) {
                                    return obj;
                                }
                                this.f189018g = obj;
                                this.f189017f = 4;
                                objC = g0Var.c(this);
                                if (objC != objE) {
                                    obj2 = obj;
                                    obj = objC;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f189021k.u().u();
                                    }
                                    return obj2;
                                }
                            }
                        }
                    }
                    return objE;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(g0 g0Var, tq.e<? super R> eVar) {
                    return ((C4909a) v(g0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    C4909a c4909a = new C4909a(this.f189019h, this.f189020j, this.f189021k, eVar, this.f189022l);
                    c4909a.f189018g = obj;
                    return c4909a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C4908a(u uVar, boolean z15, boolean z16, er.l<? super ya.b, ? extends R> lVar, tq.e<? super C4908a> eVar) {
                super(2, eVar);
                this.f189012f = uVar;
                this.f189013g = z15;
                this.f189014h = z16;
                this.f189015j = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f189011e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                boolean z15 = !(this.f189012f.H() && this.f189012f.I()) && this.f189013g;
                u uVar = this.f189012f;
                boolean z16 = this.f189014h;
                C4909a c4909a = new C4909a(z15, z16, uVar, null, this.f189015j);
                this.f189011e = 1;
                Object objY = uVar.Y(z16, c4909a, this);
                return objY == objE ? objE : objY;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super R> eVar) {
                return ((C4908a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C4908a(this.f189012f, this.f189013g, this.f189014h, this.f189015j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(tq.i iVar, u uVar, boolean z15, boolean z16, er.l<? super ya.b, ? extends R> lVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f189006f = iVar;
            this.f189007g = uVar;
            this.f189008h = z15;
            this.f189009j = z16;
            this.f189010k = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189005e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            tq.i iVar = this.f189006f;
            C4908a c4908a = new C4908a(this.f189007g, this.f189008h, this.f189009j, this.f189010k, null);
            this.f189005e = 1;
            Object objG = ju.i.g(iVar, c4908a, this);
            return objG == objE ? objE : objG;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f189006f, this.f189007g, this.f189008h, this.f189009j, this.f189010k, eVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f189027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l f189028g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tq.e eVar, u uVar, er.l lVar) {
            super(2, eVar);
            this.f189027f = uVar;
            this.f189028g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189026e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            u uVar = this.f189027f;
            e eVar = new e(true, false, uVar, null, this.f189028g);
            this.f189026e = 1;
            Object objY = uVar.Y(false, eVar, this);
            return objY == objE ? objE : objY;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(eVar, this.f189027f, this.f189028g);
        }
    }

    /* JADX INFO: renamed from: ta.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C4911c<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f189029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f189032g;

        C4911c(tq.e<? super C4911c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189031f = obj;
            this.f189032g |= PKIFailureInfo.systemUnavail;
            return ta.a.d(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<R> extends vq.k implements er.l<tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f189034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super R>, Object> f189035g;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Loa/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends vq.k implements er.p<g0, tq.e<? super R>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f189036e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f189037f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f189038g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f189039h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f189040j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ u f189041k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ er.l f189042l;

            /* JADX INFO: renamed from: ta.c$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Loa/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            public static final class C4912a extends vq.k implements er.p<f0<R>, tq.e<? super R>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f189043e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f189044f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ er.l f189045g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4912a(tq.e eVar, er.l lVar) {
                    super(2, eVar);
                    this.f189045g = lVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f189043e;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                        return obj;
                    }
                    oq.u.b(obj);
                    er.l lVar = this.f189045g;
                    this.f189043e = 1;
                    fr.r.c(6);
                    Object objB = lVar.b(this);
                    fr.r.c(7);
                    return objB == objE ? objE : objB;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(f0<R> f0Var, tq.e<? super R> eVar) {
                    return ((C4912a) v(f0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    C4912a c4912a = new C4912a(eVar, this.f189045g);
                    c4912a.f189044f = obj;
                    return c4912a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z15, boolean z16, u uVar, tq.e eVar, er.l lVar) {
                super(2, eVar);
                this.f189039h = z15;
                this.f189040j = z16;
                this.f189041k = uVar;
                this.f189042l = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
              0x00a8: PHI (r1v12 oa.g0) = (r1v9 oa.g0), (r1v19 oa.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
              0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
            
                if (r9.A(r8) == r0) goto L51;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ta.c.d.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(g0 g0Var, tq.e<? super R> eVar) {
                return ((a) v(g0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f189039h, this.f189040j, this.f189041k, eVar, this.f189042l);
                aVar.f189038g = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(u uVar, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f189034f = uVar;
            this.f189035g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189033e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            u uVar = this.f189034f;
            a aVar = new a(true, false, uVar, null, this.f189035g);
            this.f189033e = 1;
            Object objY = uVar.Y(false, aVar, this);
            return objY == objE ? objE : objY;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new d(this.f189034f, this.f189035g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super R> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Loa/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e<R> extends vq.k implements er.p<g0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f189049h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f189050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ u f189051k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ er.l f189052l;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Loa/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends vq.k implements er.p<f0<R>, tq.e<? super R>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f189053e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f189054f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.l f189055g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(tq.e eVar, er.l lVar) {
                super(2, eVar);
                this.f189055g = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f189053e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                er.l lVar = this.f189055g;
                this.f189053e = 1;
                fr.r.c(6);
                Object objB = lVar.b(this);
                fr.r.c(7);
                return objB == objE ? objE : objB;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(f0<R> f0Var, tq.e<? super R> eVar) {
                return ((a) v(f0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(eVar, this.f189055g);
                aVar.f189054f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z15, boolean z16, u uVar, tq.e eVar, er.l lVar) {
            super(2, eVar);
            this.f189049h = z15;
            this.f189050j = z16;
            this.f189051k = uVar;
            this.f189052l = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
          0x00a8: PHI (r1v12 oa.g0) = (r1v9 oa.g0), (r1v19 oa.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            if (r9.A(r8) == r0) goto L51;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta.c.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(g0 g0Var, tq.e<? super R> eVar) {
            return ((e) v(g0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f189049h, this.f189050j, this.f189051k, eVar, this.f189052l);
            eVar2.f189048g = obj;
            return eVar2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f189057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f189058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f189059h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.l f189060j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tq.e eVar, u uVar, boolean z15, boolean z16, er.l lVar) {
            super(2, eVar);
            this.f189057f = uVar;
            this.f189058g = z15;
            this.f189059h = z16;
            this.f189060j = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189056e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            u uVar = this.f189057f;
            boolean z15 = this.f189058g;
            h hVar = new h(this.f189059h, z15, uVar, null, this.f189060j);
            this.f189056e = 1;
            Object objY = uVar.Y(z15, hVar, this);
            return objY == objE ? objE : objY;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new f(eVar, this.f189057f, this.f189058g, this.f189059h, this.f189060j);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f189061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f189063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f189064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f189065h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f189066j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189065h = obj;
            this.f189066j |= PKIFailureInfo.systemUnavail;
            return ta.a.e(null, false, false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Loa/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h<R> extends vq.k implements er.p<g0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189069g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f189070h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f189071j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ u f189072k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ er.l f189073l;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Loa/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends vq.k implements er.p<f0<R>, tq.e<? super R>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f189074e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f189075f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.l f189076g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(tq.e eVar, er.l lVar) {
                super(2, eVar);
                this.f189076g = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f189074e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return this.f189076g.b(((qa.q) ((f0) this.f189075f)).getDelegate());
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(f0<R> f0Var, tq.e<? super R> eVar) {
                return ((a) v(f0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(eVar, this.f189076g);
                aVar.f189075f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z15, boolean z16, u uVar, tq.e eVar, er.l lVar) {
            super(2, eVar);
            this.f189070h = z15;
            this.f189071j = z16;
            this.f189072k = uVar;
            this.f189073l = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 oa.g0) = (r1v8 oa.g0), (r1v18 oa.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g0.a aVar;
            g0 g0Var;
            g0 g0Var2;
            g0.a aVar2;
            g0 g0Var3;
            Object objC;
            Object obj2;
            Object objE = uq.b.e();
            int i15 = this.f189068f;
            if (i15 == 0) {
                oq.u.b(obj);
                g0 g0Var4 = (g0) this.f189069g;
                if (!this.f189070h) {
                    return this.f189073l.b(((qa.q) g0Var4).getDelegate());
                }
                boolean z15 = this.f189071j;
                aVar = z15 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                if (z15) {
                    g0Var = g0Var4;
                    a aVar3 = new a(null, this.f189073l);
                    this.f189069g = g0Var;
                    this.f189067e = null;
                    this.f189068f = 3;
                    obj = g0Var.a(aVar, aVar3, this);
                    if (obj != objE) {
                        if (this.f189071j) {
                            return obj;
                        }
                        this.f189069g = obj;
                        this.f189068f = 4;
                        objC = g0Var.c(this);
                        if (objC != objE) {
                            obj2 = obj;
                            obj = objC;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f189072k.u().u();
                            }
                            return obj2;
                        }
                    }
                } else {
                    this.f189069g = g0Var4;
                    this.f189067e = aVar;
                    this.f189068f = 1;
                    Object objC2 = g0Var4.c(this);
                    if (objC2 != objE) {
                        g0Var2 = g0Var4;
                        obj = objC2;
                        aVar2 = aVar;
                    }
                }
                return objE;
            }
            if (i15 == 1) {
                aVar2 = (g0.a) this.f189067e;
                g0Var2 = (g0) this.f189069g;
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    aVar2 = (g0.a) this.f189067e;
                    g0Var3 = (g0) this.f189069g;
                    oq.u.b(obj);
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar4 = new a(null, this.f189073l);
                    this.f189069g = g0Var;
                    this.f189067e = null;
                    this.f189068f = 3;
                    obj = g0Var.a(aVar, aVar4, this);
                    if (obj != objE) {
                        if (this.f189071j) {
                            return obj;
                        }
                        this.f189069g = obj;
                        this.f189068f = 4;
                        objC = g0Var.c(this);
                        if (objC != objE) {
                            obj2 = obj;
                            obj = objC;
                        }
                    }
                    return objE;
                }
                if (i15 == 3) {
                    g0Var = (g0) this.f189069g;
                    oq.u.b(obj);
                    if (this.f189071j) {
                        return obj;
                    }
                    this.f189069g = obj;
                    this.f189068f = 4;
                    objC = g0Var.c(this);
                    if (objC != objE) {
                        obj2 = obj;
                        obj = objC;
                    }
                    return objE;
                }
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f189069g;
                oq.u.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f189072k.u().u();
            }
            return obj2;
            if (((Boolean) obj).booleanValue()) {
                aVar = aVar2;
                g0Var = g0Var2;
                a aVar5 = new a(null, this.f189073l);
                this.f189069g = g0Var;
                this.f189067e = null;
                this.f189068f = 3;
                obj = g0Var.a(aVar, aVar5, this);
                if (obj != objE) {
                    if (this.f189071j) {
                        return obj;
                    }
                    this.f189069g = obj;
                    this.f189068f = 4;
                    objC = g0Var.c(this);
                    if (objC != objE) {
                        obj2 = obj;
                        obj = objC;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f189072k.u().u();
                        }
                        return obj2;
                    }
                }
            } else {
                androidx.room.c cVarU = this.f189072k.u();
                this.f189069g = g0Var2;
                this.f189067e = aVar2;
                this.f189068f = 2;
                if (cVarU.A(this) != objE) {
                    g0Var3 = g0Var2;
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar6 = new a(null, this.f189073l);
                    this.f189069g = g0Var;
                    this.f189067e = null;
                    this.f189068f = 3;
                    obj = g0Var.a(aVar, aVar6, this);
                    if (obj != objE) {
                        if (this.f189071j) {
                            return obj;
                        }
                        this.f189069g = obj;
                        this.f189068f = 4;
                        objC = g0Var.c(this);
                        if (objC != objE) {
                            obj2 = obj;
                            obj = objC;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f189072k.u().u();
                            }
                            return obj2;
                        }
                    }
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(g0 g0Var, tq.e<? super R> eVar) {
            return ((h) v(g0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = new h(this.f189070h, this.f189071j, this.f189072k, eVar, this.f189073l);
            hVar.f189069g = obj;
            return hVar;
        }
    }

    public static final Object a(u uVar, boolean z15, tq.e<? super tq.i> eVar) {
        c0 c0Var = (c0) eVar.getContext().m(c0.INSTANCE);
        tq.i transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        if (uVar.H()) {
            if (transactionDispatcher != null) {
                return uVar.w().n0(transactionDispatcher);
            }
            return z15 ? uVar.D() : uVar.w();
        }
        tq.i iVarW = uVar.w();
        if (transactionDispatcher == null) {
            transactionDispatcher = tq.j.f191408a;
        }
        return iVarW.n0(transactionDispatcher);
    }

    public static final <R> R b(u uVar, boolean z15, boolean z16, er.l<? super ya.b, ? extends R> lVar) {
        uVar.g();
        uVar.h();
        tq.i iVar = uVar.C().get();
        if (iVar == null) {
            iVar = tq.j.f191408a;
        }
        return (R) qa.r.a(new a(iVar, uVar, z16, z15, lVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final <R> Object c(u uVar, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super R> eVar) throws Throwable {
        C4911c c4911c;
        u uVar2;
        er.l<? super tq.e<? super R>, ? extends Object> lVar2;
        if (eVar instanceof C4911c) {
            c4911c = (C4911c) eVar;
            int i15 = c4911c.f189032g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4911c.f189032g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4911c = new C4911c(eVar);
            }
        } else {
            c4911c = new C4911c(eVar);
        }
        C4911c c4911c2 = c4911c;
        Object objB = c4911c2.f189031f;
        Object objE = uq.b.e();
        int i16 = c4911c2.f189032g;
        if (i16 == 0) {
            oq.u.b(objB);
            if (uVar.H()) {
                d dVar = new d(uVar, lVar, null);
                c4911c2.f189032g = 1;
                Object objE2 = v.e(uVar, dVar, c4911c2);
                if (objE2 != objE) {
                    return objE2;
                }
            } else if (uVar.H() && uVar.O() && uVar.I()) {
                e eVar2 = new e(true, false, uVar, null, lVar);
                c4911c2.f189032g = 2;
                Object objY = uVar.Y(false, eVar2, c4911c2);
                if (objY != objE) {
                    return objY;
                }
            } else {
                c4911c2.f189029d = uVar;
                c4911c2.f189030e = lVar;
                c4911c2.f189032g = 3;
                objB = ta.a.b(uVar, true, c4911c2);
                if (objB != objE) {
                    uVar2 = uVar;
                    lVar2 = lVar;
                }
            }
        }
        if (i16 == 1) {
            oq.u.b(objB);
            return objB;
        }
        if (i16 == 2) {
            oq.u.b(objB);
            return objB;
        }
        if (i16 != 3) {
            if (i16 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
            return objB;
        }
        lVar2 = (er.l) c4911c2.f189030e;
        uVar2 = (u) c4911c2.f189029d;
        oq.u.b(objB);
        b bVar = new b(null, uVar2, lVar2);
        c4911c2.f189029d = null;
        c4911c2.f189030e = null;
        c4911c2.f189032g = 4;
        Object objG = ju.i.g((tq.i) objB, bVar, c4911c2);
        return objG == objE ? objE : objG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final <R> Object d(u uVar, boolean z15, boolean z16, er.l<? super ya.b, ? extends R> lVar, tq.e<? super R> eVar) throws Throwable {
        g gVar;
        u uVar2;
        boolean z17;
        er.l<? super ya.b, ? extends R> lVar2;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f189066j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f189066j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f189065h;
        Object objE = uq.b.e();
        int i16 = gVar2.f189066j;
        if (i16 == 0) {
            oq.u.b(obj);
            if (uVar.H() && uVar.O() && uVar.I()) {
                h hVar = new h(z16, z15, uVar, null, lVar);
                gVar2.f189066j = 1;
                Object objY = uVar.Y(z15, hVar, gVar2);
                if (objY != objE) {
                    return objY;
                }
            } else {
                gVar2.f189061d = uVar;
                gVar2.f189062e = lVar;
                gVar2.f189063f = z15;
                gVar2.f189064g = z16;
                gVar2.f189066j = 2;
                Object objB = ta.a.b(uVar, z16, gVar2);
                if (objB != objE) {
                    uVar2 = uVar;
                    obj = objB;
                    z17 = z16;
                    lVar2 = lVar;
                }
            }
        }
        if (i16 == 1) {
            oq.u.b(obj);
            return obj;
        }
        if (i16 != 2) {
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return obj;
        }
        boolean z18 = gVar2.f189064g;
        z15 = gVar2.f189063f;
        er.l<? super ya.b, ? extends R> lVar3 = (er.l) gVar2.f189062e;
        u uVar3 = (u) gVar2.f189061d;
        oq.u.b(obj);
        z17 = z18;
        lVar2 = lVar3;
        uVar2 = uVar3;
        f fVar = new f(null, uVar2, z15, z17, lVar2);
        gVar2.f189061d = null;
        gVar2.f189062e = null;
        gVar2.f189066j = 3;
        Object objG = ju.i.g((tq.i) obj, fVar, gVar2);
        return objG == objE ? objE : objG;
    }

    public static final int e(File file) {
        FileChannel channel = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i15 = byteBufferAllocate.getInt();
            ar.b.a(channel, null);
            return i15;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(channel, th4);
                throw th5;
            }
        }
    }
}
