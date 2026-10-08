package p036e4;

import androidx.compose.ui.node.g;
import c5.r;
import er.l;
import er.p;
import fr.w;
import g4.p1;
import g4.q1;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import p076m2.e5;
import p076m2.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b \u0010\u001dR>\u0010&\u001a&\u0012\u0004\u0012\u00020\u0019\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0018\u0012\u0004\u0012\u00020\t0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0014\u0010)\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Le4/r2;", "", "Le4/t2;", "slotReusePolicy", "<init>", "(Le4/t2;)V", "()V", "slotId", "Lkotlin/Function0;", "Loq/i0;", "content", "Le4/r2$b;", "j", "(Ljava/lang/Object;Ler/p;)Le4/r2$b;", "Le4/r2$a;", "d", "(Ljava/lang/Object;Ler/p;)Le4/r2$a;", "e", "a", "Le4/t2;", "Le4/o0;", "b", "Le4/o0;", "_state", "Lkotlin/Function2;", "Landroidx/compose/ui/node/g;", "c", "Ler/p;", "h", "()Ler/p;", "setRoot", "Lm2/v;", "f", "setCompositionContext", "Le4/s2;", "Lc5/b;", "Le4/x0;", "g", "setMeasurePolicy", "i", "()Le4/o0;", "state", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47410f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t2 slotReusePolicy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private o0 _state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p<g, r2, i0> setRoot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p<g, v, i0> setCompositionContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p<g, p<? super s2, ? super c5.b, ? extends x0>, i0> setMeasurePolicy;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Le4/r2$a;", "", "Lm2/e5;", "shouldPause", "", "b", "(Lm2/e5;)Z", "Le4/r2$b;", "apply", "()Le4/r2$b;", "Loq/i0;", "cancel", "()V", "a", "()Z", "isComplete", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean getIsComplete();

        b apply();

        boolean b(e5 shouldPause);

        void cancel();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Le4/r2$b;", "", "Loq/i0;", "j", "()V", "", "index", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "f", "(IJ)V", "key", "Lkotlin/Function1;", "Lg4/q1;", "Lg4/p1;", "block", "e", "(Ljava/lang/Object;Ler/l;)V", "Lc5/r;", "d", "(I)J", "c", "()I", "placeablesCount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        default int c() {
            return 0;
        }

        default long d(int index) {
            return r.INSTANCE.a();
        }

        default void e(Object key, l<? super q1, ? extends p1> block) {
        }

        default void f(int index, long constraints) {
        }

        void j();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Lm2/v;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Lm2/v;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements p<g, v, i0> {
        c() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(g gVar, v vVar) {
            c(gVar, vVar);
            return i0.f148189a;
        }

        public final void c(g gVar, v vVar) {
            r2.this.i().R(vVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/node/g;", "Lkotlin/Function2;", "Le4/s2;", "Lc5/b;", "Le4/x0;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Ler/p;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements p<g, p<? super s2, ? super c5.b, ? extends x0>, i0> {
        d() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(g gVar, p<? super s2, ? super c5.b, ? extends x0> pVar) {
            c(gVar, pVar);
            return i0.f148189a;
        }

        public final void c(g gVar, p<? super s2, ? super c5.b, ? extends x0> pVar) {
            gVar.j(r2.this.i().x(pVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Le4/r2;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;Le4/r2;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends w implements p<g, r2, i0> {
        e() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(g gVar, r2 r2Var) {
            c(gVar, r2Var);
            return i0.f148189a;
        }

        public final void c(g gVar, r2 r2Var) {
            r2 r2Var2 = r2.this;
            o0 subcompositionsState = gVar.getSubcompositionsState();
            if (subcompositionsState == null) {
                subcompositionsState = new o0(gVar, r2.this.slotReusePolicy);
                gVar.j2(subcompositionsState);
            }
            r2Var2._state = subcompositionsState;
            r2.this.i().I();
            r2.this.i().S(r2.this.slotReusePolicy);
        }
    }

    public r2(t2 t2Var) {
        this.slotReusePolicy = t2Var;
        this.setRoot = new e();
        this.setCompositionContext = new c();
        this.setMeasurePolicy = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 i() {
        o0 o0Var = this._state;
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final a d(Object slotId, p<? super p076m2.r, ? super Integer, i0> content) {
        return i().O(slotId, content);
    }

    public final void e() {
        i().F();
    }

    public final p<g, v, i0> f() {
        return this.setCompositionContext;
    }

    public final p<g, p<? super s2, ? super c5.b, ? extends x0>, i0> g() {
        return this.setMeasurePolicy;
    }

    public final p<g, r2, i0> h() {
        return this.setRoot;
    }

    public final b j(Object slotId, p<? super p076m2.r, ? super Integer, i0> content) {
        return i().M(slotId, content);
    }

    public r2() {
        this(f1.f47240a);
    }
}
