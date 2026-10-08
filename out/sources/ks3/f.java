package ks3;

import androidx.p016lifecycle.t0;
import er.l;
import fr.q;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lks3/f;", "Landroidx/lifecycle/t0;", "Lks3/b;", "", "Lls3/a;", "screenMapper", "<init>", "(Lls3/a;)V", "Loq/i0;", "c9", "()V", "d9", "Lxw/b;", "Lks3/a;", "b", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lks3/b$a;", "c", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends t0 implements ks3.b, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ks3.a> navAction = new xw.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0<ks3.b.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112631e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112631e;
            if (i15 == 0) {
                u.b(obj);
                f fVar = f.this;
                ks3.a.C2724a c2724a = ks3.a.C2724a.f112620a;
                this.f112631e = 1;
                if (fVar.F(c2724a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112633e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112633e;
            if (i15 == 0) {
                u.b(obj);
                f fVar = f.this;
                ks3.a.b bVar = ks3.a.b.f112621a;
                this.f112633e = 1;
                if (fVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends q implements er.a<i0> {
        c(Object obj) {
            super(0, obj, f.class, "onApplicationTopicClick", "onApplicationTopicClick()V", 0);
        }

        public final void E() {
            ((f) this.f66391b).c9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, f.class, "onOtherTopicClick", "onOtherTopicClick()V", 0);
        }

        public final void E() {
            ((f) this.f66391b).d9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public f(ls3.a aVar) {
        this.state = r0.a(aVar.b(new ls3.a.Params(new c(this), new d(this))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c9() {
        i00.a.a(this, new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d9() {
        i00.a.a(this, new b(null));
    }

    @Override // zx.b
    public xw.b<ks3.a> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: b9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ks3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: e9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // l00.e
    public p0<ks3.b.Data> getState() {
        return this.state;
    }
}
