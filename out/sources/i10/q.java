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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li10/q;", "Li10/f;", "Lvy/b;", "Luy/e;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ldx/i;", "Ldx/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "values", "j", "([F)Lvy/b;", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends f<Axis> implements uy.e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f88172d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f88174f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f88172d = obj;
            this.f88174f |= PKIFailureInfo.systemUnavail;
            return q.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Lvy/b;", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super dx.i.Right<Axis>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88175e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Lvy/b;", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super dx.i.Right<Axis>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f88177e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f88178f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f88178f = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f88177e;
                if (i15 == 0) {
                    u.b(obj);
                    mu.g<Axis> gVarF = this.f88178f.f();
                    this.f88177e = 1;
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
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f88178f, eVar);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88175e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            l0 l0VarB = g1.b();
            a aVar = new a(q.this, null);
            this.f88175e = 1;
            Object objG = ju.i.g(l0VarB, aVar, this);
            return objG == objE ? objE : objG;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i.Right<Axis>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return q.this.new b(eVar);
        }
    }

    public q(Context context) {
        super(context, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uy.e
    public Object a(tq.e<? super dx.i<? extends dx.b, Axis>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f88174f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f88174f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f88172d;
        Object objE = uq.b.e();
        int i16 = aVar.f88174f;
        try {
            if (i16 == 0) {
                u.b(objD);
                long j15 = r.f88179a;
                b bVar = new b(null);
                aVar.f88174f = 1;
                objD = g3.d(j15, bVar, aVar);
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
}
