package y20;

import er.p;
import er.q;
import fr.q0;
import k10.c0;
import k10.l;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly20/f;", "Lk10/t;", "Ly20/b;", "Ln20/a;", "Ljx/g;", "systemInfo", "<init>", "(Ljx/g;)V", "f", "Ljx/g;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends t<y20.b, n20.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jx.g systemInfo;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Ly20/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<c0<y20.b>, tq.e<? super l<? extends y20.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223438f;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y20.b O(f fVar, y20.b bVar) {
            return fVar.systemInfo.r() ? new y20.b.AnimationsEnabled(false) : new y20.b.AnimationsDisabled(false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f223438f;
            uq.b.e();
            if (this.f223437e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final f fVar = f.this;
            return c0Var.d(new er.l() { // from class: y20.e
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.a.O(fVar, (b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<y20.b> c0Var, tq.e<? super l<? extends y20.b>> eVar) {
            return ((a) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = f.this.new a(eVar);
            aVar.f223438f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly20/a;", "<unused var>", "Lk10/c0;", "Ly20/b;", "state", "Lk10/l;", "<anonymous>", "(Ly20/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements q<y20.a, c0<y20.b>, tq.e<? super l<? extends y20.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223441f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y20.b O(c0 c0Var, y20.b bVar) {
            y20.b bVar2 = (y20.b) c0Var.a();
            if (bVar2 instanceof y20.b.AnimationsEnabled) {
                return new y20.b.AnimationsDisabled(false, 1, null);
            }
            if (bVar2 instanceof y20.b.AnimationsDisabled) {
                return new y20.b.AnimationsEnabled(true);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f223441f;
            uq.b.e();
            if (this.f223440e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: y20.g
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.b.O(c0Var, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y20.a aVar, c0<y20.b> c0Var, tq.e<? super l<? extends y20.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f223441f = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    public f(jx.g gVar) {
        super(new y20.b.AnimationsEnabled(false, 1, null));
        this.systemInfo = gVar;
        g(new er.l() { // from class: y20.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.j(this.f223433a, (v) obj);
            }
        });
    }

    public static i0 h(f fVar, z zVar) {
        zVar.A(fVar.new a(null));
        b bVar = new b(null);
        zVar.v(q0.c(y20.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final f fVar, v vVar) {
        vVar.c(q0.c(y20.b.class), new er.l() { // from class: y20.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.h(this.f223434a, (z) obj);
            }
        });
        return i0.f148189a;
    }
}
