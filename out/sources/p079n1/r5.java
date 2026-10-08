package p079n1;

import a4.k0;
import a4.w0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b1.i;
import b1.l;
import b1.n;
import er.p;
import er.q;
import f3.j;
import f3.m;
import ju.p0;
import m3.e;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import p076m2.x5;
import p143z0.b2;
import p143z0.b3;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf3/m;", "Lb1/l;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Lm3/e;", "Loq/i0;", "onTap", "c", "(Lf3/m;Lb1/l;ZLer/l;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r5 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p0 f130354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3<n.b> f130355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f130356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f6<er.l<e, i0>> f130357d;

        /* JADX INFO: renamed from: n1.r5$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz0/b2;", "Lm3/e;", "it", "Loq/i0;", "<anonymous>", "(Lz0/b2;Lm3/e;)V"}, k = 3, mv = {2, 1, 0})
        static final class C3238a extends k implements q<b2, e, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f130358e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f130359f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ long f130360g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ p0 f130361h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ a3<n.b> f130362j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ l f130363k;

            /* JADX INFO: renamed from: n1.r5$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C3239a extends k implements p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f130364e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f130365f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ a3<n.b> f130366g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ long f130367h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ l f130368j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C3239a(a3<n.b> a3Var, long j15, l lVar, tq.e<? super C3239a> eVar) {
                    super(2, eVar);
                    this.f130366g = a3Var;
                    this.f130367h = j15;
                    this.f130368j = lVar;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x005a  */
                /* JADX WARN: Code duplicated, block: B:25:0x0065  */
                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    a3<n.b> a3Var;
                    a3<n.b> a3Var2;
                    n.b bVar;
                    l lVar;
                    n.b bVar2;
                    Object objE = uq.b.e();
                    int i15 = this.f130365f;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            a3Var2 = (a3) this.f130364e;
                            u.b(obj);
                        } else {
                            if (i15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (n.b) this.f130364e;
                            u.b(obj);
                        }
                        bVar = bVar2;
                        this.f130366g.setValue(bVar);
                        return i0.f148189a;
                    }
                    u.b(obj);
                    n.b value = this.f130366g.getValue();
                    if (value == null) {
                        bVar = new n.b(this.f130367h, null);
                        lVar = this.f130368j;
                        if (lVar != null) {
                            this.f130364e = bVar;
                            this.f130365f = 2;
                            if (lVar.a(bVar, this) != objE) {
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                        }
                        this.f130366g.setValue(bVar);
                        return i0.f148189a;
                    }
                    l lVar2 = this.f130368j;
                    a3Var = this.f130366g;
                    n.a aVar = new n.a(value);
                    if (lVar2 == null) {
                        a3Var.setValue(null);
                        bVar = new n.b(this.f130367h, null);
                        lVar = this.f130368j;
                        if (lVar != null) {
                            this.f130364e = bVar;
                            this.f130365f = 2;
                            if (lVar.a(bVar, this) != objE) {
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                        }
                        this.f130366g.setValue(bVar);
                        return i0.f148189a;
                    }
                    this.f130364e = a3Var;
                    this.f130365f = 1;
                    if (lVar2.a(aVar, this) != objE) {
                        a3Var2 = a3Var;
                    }
                    return objE;
                    a3Var = a3Var2;
                    a3Var.setValue(null);
                    bVar = new n.b(this.f130367h, null);
                    lVar = this.f130368j;
                    if (lVar != null) {
                        this.f130364e = bVar;
                        this.f130365f = 2;
                        if (lVar.a(bVar, this) != objE) {
                            bVar2 = bVar;
                            bVar = bVar2;
                        }
                        return objE;
                    }
                    this.f130366g.setValue(bVar);
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((C3239a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C3239a(this.f130366g, this.f130367h, this.f130368j, eVar);
                }
            }

            /* JADX INFO: renamed from: n1.r5$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f130369e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f130370f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ a3<n.b> f130371g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f130372h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ l f130373j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(a3<n.b> a3Var, boolean z15, l lVar, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f130371g = a3Var;
                    this.f130372h = z15;
                    this.f130373j = lVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    a3<n.b> a3Var;
                    a3<n.b> a3Var2;
                    Object objE = uq.b.e();
                    int i15 = this.f130370f;
                    if (i15 == 0) {
                        u.b(obj);
                        n.b value = this.f130371g.getValue();
                        if (value != null) {
                            boolean z15 = this.f130372h;
                            l lVar = this.f130373j;
                            a3Var = this.f130371g;
                            i cVar = z15 ? new n.c(value) : new n.a(value);
                            if (lVar != null) {
                                this.f130369e = a3Var;
                                this.f130370f = 1;
                                if (lVar.a(cVar, this) == objE) {
                                    return objE;
                                }
                                a3Var2 = a3Var;
                            }
                            a3Var.setValue(null);
                        }
                        return i0.f148189a;
                    }
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a3Var2 = (a3) this.f130369e;
                    u.b(obj);
                    a3Var = a3Var2;
                    a3Var.setValue(null);
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((b) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new b(this.f130371g, this.f130372h, this.f130373j, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3238a(p0 p0Var, a3<n.b> a3Var, l lVar, tq.e<? super C3238a> eVar) {
                super(3, eVar);
                this.f130361h = p0Var;
                this.f130362j = a3Var;
                this.f130363k = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f130358e;
                if (i15 == 0) {
                    u.b(obj);
                    b2 b2Var = (b2) this.f130359f;
                    ju.k.d(this.f130361h, null, null, new C3239a(this.f130362j, this.f130360g, this.f130363k, null), 3, null);
                    this.f130358e = 1;
                    obj = b2Var.L1(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                ju.k.d(this.f130361h, null, null, new b(this.f130362j, ((Boolean) obj).booleanValue(), this.f130363k, null), 3, null);
                return i0.f148189a;
            }

            public final Object M(b2 b2Var, long j15, tq.e<? super i0> eVar) {
                C3238a c3238a = new C3238a(this.f130361h, this.f130362j, this.f130363k, eVar);
                c3238a.f130359f = b2Var;
                c3238a.f130360g = j15;
                return c3238a.J(i0.f148189a);
            }

            @Override // er.q
            public /* bridge */ /* synthetic */ Object w(b2 b2Var, e eVar, tq.e<? super i0> eVar2) {
                return M(b2Var, eVar.getPackedValue(), eVar2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(p0 p0Var, a3<n.b> a3Var, l lVar, f6<? extends er.l<? super e, i0>> f6Var) {
            this.f130354a = p0Var;
            this.f130355b = a3Var;
            this.f130356c = lVar;
            this.f130357d = f6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(f6 f6Var, e eVar) {
            ((er.l) f6Var.getValue()).b(eVar);
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            C3238a c3238a = new C3238a(this.f130354a, this.f130355b, this.f130356c, null);
            final f6<er.l<e, i0>> f6Var = this.f130357d;
            Object objG = b3.g(k0Var, c3238a, new er.l() { // from class: n1.q5
                @Override // er.l
                public final Object b(Object obj) {
                    return r5.a.b(f6Var, (e) obj);
                }
            }, eVar);
            return objG == uq.b.e() ? objG : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n1/r5$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f130374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f130375b;

        public b(a3 a3Var, l lVar) {
            this.f130374a = a3Var;
            this.f130375b = lVar;
        }

        @Override // p076m2.r0
        public void j() {
            n.b bVar = (n.b) this.f130374a.getValue();
            if (bVar != null) {
                n.a aVar = new n.a(bVar);
                l lVar = this.f130375b;
                if (lVar != null) {
                    lVar.b(aVar);
                }
                this.f130374a.setValue(null);
            }
        }
    }

    public static final m c(m mVar, final l lVar, boolean z15, final er.l<? super e, i0> lVar2) {
        return z15 ? j.c(mVar, null, new q() { // from class: n1.o5
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r5.d(lVar2, lVar, (m) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null) : mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m d(er.l lVar, final l lVar2, m mVar, r rVar, int i15) {
        rVar.X(-102778667);
        if (t.k()) {
            t.o(-102778667, i15, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = Function0.i(tq.j.f191408a, rVar);
            rVar.v(objE);
        }
        p0 p0Var = (p0) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = c6.e(null, null, 2, null);
            rVar.v(objE2);
        }
        final a3 a3Var = (a3) objE2;
        f6 f6VarP = x5.p(lVar, rVar, 0);
        boolean zW = rVar.W(lVar2);
        Object objE3 = rVar.E();
        if (zW || objE3 == companion.a()) {
            objE3 = new er.l() { // from class: n1.p5
                @Override // er.l
                public final Object b(Object obj) {
                    return r5.e(a3Var, lVar2, (s0) obj);
                }
            };
            rVar.v(objE3);
        }
        Function0.a(lVar2, (er.l) objE3, rVar, 0);
        m.Companion companion2 = m.INSTANCE;
        boolean zG = rVar.G(p0Var) | rVar.W(lVar2) | rVar.W(f6VarP);
        Object objE4 = rVar.E();
        if (zG || objE4 == companion.a()) {
            objE4 = new a(p0Var, a3Var, lVar2, f6VarP);
            rVar.v(objE4);
        }
        m mVarC = w0.c(companion2, lVar2, (PointerInputEventHandler) objE4);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 e(a3 a3Var, l lVar, s0 s0Var) {
        return new b(a3Var, lVar);
    }
}
