package i10;

import android.content.Context;
import ju.g1;
import ju.g3;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Axis;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Li10/a;", "Li10/f;", "Lvy/b;", "Luy/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ldx/i;", "Ldx/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "values", "j", "([F)Lvy/b;", "Lmu/g;", "", "d", "Lmu/g;", "w", "()Lmu/g;", "rotation", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends f<Axis> implements uy.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<Float> rotation;

    /* JADX INFO: renamed from: i10.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2068a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f88100d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f88102f;

        C2068a(tq.e<? super C2068a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f88100d = obj;
            this.f88102f |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Lvy/b;", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super dx.i.Right<Axis>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88103e;

        /* JADX INFO: renamed from: i10.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Lvy/b;", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
        static final class C2069a extends vq.k implements er.p<p0, tq.e<? super dx.i.Right<Axis>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f88105e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f88106f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2069a(a aVar, tq.e<? super C2069a> eVar) {
                super(2, eVar);
                this.f88106f = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f88105e;
                if (i15 == 0) {
                    u.b(obj);
                    mu.g<Axis> gVarF = this.f88106f.f();
                    this.f88105e = 1;
                    obj = mu.i.z(gVarF, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return new dx.i.Right(obj);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super dx.i.Right<Axis>> eVar) {
                return ((C2069a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C2069a(this.f88106f, eVar);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88103e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            l0 l0VarB = g1.b();
            C2069a c2069a = new C2069a(a.this, null);
            this.f88103e = 1;
            Object objG = ju.i.g(l0VarB, c2069a, this);
            return objG == objE ? objE : objG;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i.Right<Axis>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f88107a;

        /* JADX INFO: renamed from: i10.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2070a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f88108a;

            /* JADX INFO: renamed from: i10.a$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2071a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f88109d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f88110e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f88111f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f88113h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f88114j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f88115k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f88116l;

                public C2071a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f88109d = obj;
                    this.f88110e |= PKIFailureInfo.systemUnavail;
                    return C2070a.this.F(null, this);
                }
            }

            public C2070a(mu.h hVar) {
                this.f88108a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2071a c2071a;
                if (eVar instanceof C2071a) {
                    c2071a = (C2071a) eVar;
                    int i15 = c2071a.f88110e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2071a.f88110e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2071a = new C2071a(eVar);
                    }
                } else {
                    c2071a = new C2071a(eVar);
                }
                Object obj2 = c2071a.f88109d;
                Object objE = uq.b.e();
                int i16 = c2071a.f88110e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f88108a;
                    Axis axis = (Axis) obj;
                    Float fD = vq.b.d(axis.getX() + axis.getY() + axis.getZ());
                    c2071a.f88111f = vq.j.a(obj);
                    c2071a.f88113h = vq.j.a(c2071a);
                    c2071a.f88114j = vq.j.a(obj);
                    c2071a.f88115k = vq.j.a(hVar);
                    c2071a.f88116l = 0;
                    c2071a.f88110e = 1;
                    if (hVar.F(fD, c2071a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(mu.g gVar) {
            this.f88107a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super Float> hVar, tq.e eVar) {
            Object objA = this.f88107a.a(new C2070a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public a(Context context) {
        super(context, 1);
        this.rotation = new c(f());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uy.a
    public Object a(tq.e<? super dx.i<? extends dx.b, Axis>> eVar) throws Throwable {
        C2068a c2068a;
        if (eVar instanceof C2068a) {
            c2068a = (C2068a) eVar;
            int i15 = c2068a.f88102f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2068a.f88102f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2068a = new C2068a(eVar);
            }
        } else {
            c2068a = new C2068a(eVar);
        }
        Object objD = c2068a.f88100d;
        Object objE = uq.b.e();
        int i16 = c2068a.f88102f;
        try {
            if (i16 == 0) {
                u.b(objD);
                long j15 = i10.b.f88117a;
                b bVar = new b(null);
                c2068a.f88102f = 1;
                objD = g3.d(j15, bVar, c2068a);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objD);
            }
            return (dx.i) objD;
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i10.f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Axis h(float[] values) {
        return new Axis(values[0], values[1], values[2]);
    }

    @Override // uy.a
    public mu.g<Float> w() {
        return this.rotation;
    }
}
