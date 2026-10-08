package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import c5.t;
import fr.w;
import g4.b1;
import g4.c1;
import g4.d1;
import g4.f1;
import g4.i1;
import g4.s;
import g4.s0;
import g4.t0;
import g4.y;
import g4.z;
import java.util.HashSet;
import l3.f0;
import l3.h0;
import l3.l0;
import n4.u;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.b0;
import p036e4.g2;
import p036e4.k0;
import p036e4.k1;
import p036e4.o1;
import p036e4.p1;
import p036e4.v;
import p036e4.v0;
import p036e4.x0;
import p036e4.x1;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J#\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00101J#\u00104\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00101J#\u00105\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J\u0013\u00107\u001a\u00020\u0014*\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0014*\u000209H\u0016¢\u0006\u0004\b:\u0010;J'\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010\u0016J\u000f\u0010E\u001a\u00020\u0014H\u0016¢\u0006\u0004\bE\u0010\u0016J\u000f\u0010F\u001a\u00020\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0017H\u0016¢\u0006\u0004\bH\u0010GJ\u001f\u0010L\u001a\u0004\u0018\u00010J*\u00020I2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00142\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00142\u0006\u0010R\u001a\u00020@H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00142\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bU\u0010QJ\u0017\u0010X\u001a\u00020\u00142\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00142\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010\u0013R\u0016\u0010i\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR:\u0010w\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030o0nj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030o`p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010}\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010R\u001a\u00030\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010G¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/ui/node/a;", "Lg4/z;", "Lg4/q;", "Lg4/i1;", "Lg4/f1;", "Lf4/h;", "Lf4/k;", "Lg4/d1;", "Lg4/y;", "Lg4/s;", "Ll3/j;", "Ll3/z;", "Ll3/h0;", "Lg4/b1;", "Lk3/b;", "Lf3/m$c;", "Lf3/m$b;", "element", "<init>", "(Lf3/m$b;)V", "Loq/i0;", "t3", "()V", "", "duringAttach", "q3", "(Z)V", "u3", "Lf4/j;", "w3", "(Lf4/j;)V", "W2", "X2", "a2", "r3", "v3", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "k", "O", "Lp3/c;", "y", "(Lp3/c;)V", "Ln4/i0;", "E2", "(Ln4/i0;)V", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "I", "Z1", "z2", "()Z", "z0", "Lc5/d;", "", "parentData", "n", "(Lc5/d;Ljava/lang/Object;)Ljava/lang/Object;", "Le4/b0;", "coordinates", "h", "(Le4/b0;)V", "size", "e", "(J)V", "E", "Ll3/l0;", "focusState", "i", "(Ll3/l0;)V", "Ll3/v;", "focusProperties", "I0", "(Ll3/v;)V", "", "toString", "()Ljava/lang/String;", "value", "r", "Lf3/m$b;", "o3", "()Lf3/m$b;", "s3", "s", "Z", "invalidateCache", "Lf4/a;", "t", "Lf4/a;", "_providedValues", "Ljava/util/HashSet;", "Lf4/c;", "Lkotlin/collections/HashSet;", "v", "Ljava/util/HashSet;", "p3", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "w", "Le4/b0;", "lastOnPlacedCoordinates", "getDensity", "()Lc5/d;", "density", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "Lm3/k;", "a", "()J", "Lf4/g;", "F0", "()Lf4/g;", "providedValues", "K1", "isValidOwnerScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f3.m.c implements z, g4.q, i1, f1, f4.h, f4.k, d1, y, s, l3.j, l3.z, h0, b1, k3.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private f3.m.b element;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean invalidateCache;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private f4.a _providedValues;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private HashSet<f4.c<?>> readValues;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private b0 lastOnPlacedCoordinates;

    /* JADX INFO: renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class C0216a extends w implements er.a<i0> {
        C0216a() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            a.this.v3();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/a$b", "Landroidx/compose/ui/node/Owner$b;", "Loq/i0;", "q", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Owner.b {
        b() {
        }

        @Override // androidx.compose.ui.node.Owner.b
        public void q() {
            if (a.this.lastOnPlacedCoordinates == null) {
                a aVar = a.this;
                aVar.E(g4.h.n(aVar, s0.a(4194304)));
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f3.m.b f10044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f10045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f3.m.b bVar, a aVar) {
            super(0);
            this.f10044b = bVar;
            this.f10045c = aVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            ((k3.i) this.f10044b).x(this.f10045c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements er.a<i0> {
        d() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            ((f4.d) a.this.getElement()).j(a.this);
        }
    }

    public a(f3.m.b bVar) {
        h3(t0.f(bVar));
        this.element = bVar;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void q3(boolean duringAttach) {
        if (!getIsAttached()) {
            d4.a.c("initializeModifier called on unattached node");
        }
        f3.m.b bVar = this.element;
        if ((s0.a(32) & getKindSet()) != 0) {
            if (bVar instanceof f4.d) {
                l3(new C0216a());
            }
            if (bVar instanceof f4.j) {
                w3((f4.j) bVar);
            }
        }
        if ((s0.a(4) & getKindSet()) != 0) {
            if (bVar instanceof k3.i) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                g4.b0.a(this);
            }
        }
        if ((s0.a(2) & getKindSet()) != 0) {
            if (androidx.compose.ui.node.b.e(this)) {
                NodeCoordinator coordinator = getCoordinator();
                ((f) coordinator).u4(this);
                coordinator.F3();
            }
            if (!duringAttach) {
                g4.b0.a(this);
                g4.h.s(this).W0();
            }
        }
        if (bVar instanceof g2) {
            ((g2) bVar).v(g4.h.s(this));
        }
        if ((s0.a(128) & getKindSet()) != 0 && (bVar instanceof p1) && androidx.compose.ui.node.b.e(this)) {
            g4.h.s(this).W0();
        }
        if ((s0.a(4194304) & getKindSet()) != 0 && (bVar instanceof o1)) {
            this.lastOnPlacedCoordinates = null;
            if (androidx.compose.ui.node.b.e(this)) {
                g4.h.t(this).A(new b());
            }
        }
        if ((s0.a(256) & getKindSet()) != 0 && (bVar instanceof k1) && androidx.compose.ui.node.b.e(this)) {
            g4.h.s(this).W0();
        }
        if (bVar instanceof f0) {
            ((f0) bVar).g().d().d(this);
        }
        if ((s0.a(16) & getKindSet()) != 0 && (bVar instanceof a4.i0)) {
            ((a4.i0) bVar).getPointerInputFilter().f(getCoordinator());
        }
        if ((s0.a(8) & getKindSet()) != 0) {
            g4.h.t(this).L();
        }
    }

    private final void t3() {
        if (!getIsAttached()) {
            d4.a.c("unInitializeModifier called on unattached node");
        }
        f3.m.b bVar = this.element;
        if ((s0.a(32) & getKindSet()) != 0) {
            if (bVar instanceof f4.j) {
                g4.h.t(this).getModifierLocalManager().d(this, ((f4.j) bVar).getKey());
            }
            if (bVar instanceof f4.d) {
                ((f4.d) bVar).j(androidx.compose.ui.node.b.f10047a);
            }
        }
        if ((s0.a(8) & getKindSet()) != 0) {
            g4.h.t(this).L();
        }
        if (bVar instanceof f0) {
            ((f0) bVar).g().d().t(this);
        }
    }

    private final void u3() {
        f3.m.b bVar = this.element;
        if (bVar instanceof k3.i) {
            c1 snapshotObserver = g4.h.t(this).getSnapshotObserver();
            snapshotObserver.observer.k(this, androidx.compose.ui.node.b.f10048b, new c(bVar, this));
        }
        this.invalidateCache = false;
    }

    private final void w3(f4.j<?> element) {
        f4.a aVar = this._providedValues;
        if (aVar != null && aVar.a(element.getKey())) {
            aVar.c(element);
            g4.h.t(this).getModifierLocalManager().f(this, element.getKey());
        } else {
            this._providedValues = new f4.a(element);
            if (androidx.compose.ui.node.b.e(this)) {
                g4.h.t(this).getModifierLocalManager().a(this, element.getKey());
            }
        }
    }

    @Override // g4.y
    public void E(b0 coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        f3.m.b bVar = this.element;
        if (bVar instanceof o1) {
            ((o1) bVar).E(coordinates);
        }
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        ((SemanticsConfiguration) i0Var).f(((u) this.element).f());
    }

    @Override // f4.h
    public f4.g F0() {
        f4.a aVar = this._providedValues;
        return aVar != null ? aVar : f4.i.a();
    }

    @Override // g4.z
    public int H(p036e4.w wVar, v vVar, int i15) {
        return ((k0) this.element).H(wVar, vVar, i15);
    }

    @Override // g4.g, g4.f1
    public void I() {
        if (this.element instanceof a4.i0) {
            Z1();
        }
    }

    @Override // l3.z
    public void I0(l3.v focusProperties) {
        f3.m.b bVar = this.element;
        if (!(bVar instanceof l3.r)) {
            d4.a.c("applyFocusProperties called on wrong node");
        }
        ((l3.r) bVar).z(new l3.q(focusProperties));
    }

    @Override // g4.z
    public int K(p036e4.w wVar, v vVar, int i15) {
        return ((k0) this.element).K(wVar, vVar, i15);
    }

    @Override // g4.b1
    public boolean K1() {
        return getIsAttached();
    }

    @Override // g4.z
    public int O(p036e4.w wVar, v vVar, int i15) {
        return ((k0) this.element).O(wVar, vVar, i15);
    }

    @Override // f3.m.c
    public void W2() {
        q3(true);
    }

    @Override // f3.m.c
    public void X2() {
        t3();
    }

    @Override // g4.f1
    public void Y(a4.o pointerEvent, a4.q pass, long bounds) {
        ((a4.i0) this.element).getPointerInputFilter().e(pointerEvent, pass, bounds);
    }

    @Override // g4.f1
    public void Z1() {
        ((a4.i0) this.element).getPointerInputFilter().d();
    }

    @Override // k3.b
    public long a() {
        return c5.s.e(g4.h.n(this, s0.a(128)).b());
    }

    @Override // g4.q
    public void a2() {
        this.invalidateCache = true;
        g4.r.a(this);
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        return ((k0) this.element).c(y0Var, v0Var, j15);
    }

    @Override // g4.y, g4.k0
    public void e(long size) {
        f3.m.b bVar = this.element;
        if (bVar instanceof p1) {
            ((p1) bVar).e(size);
        }
    }

    @Override // k3.b
    public c5.d getDensity() {
        return g4.h.s(this).getDensity();
    }

    @Override // k3.b
    public t getLayoutDirection() {
        return g4.h.s(this).getLayoutDirection();
    }

    @Override // g4.s
    public void h(b0 coordinates) {
        ((k1) this.element).h(coordinates);
    }

    @Override // l3.j
    public void i(l0 focusState) {
        f3.m.b bVar = this.element;
        if (!(bVar instanceof l3.i)) {
            d4.a.c("onFocusEvent called on wrong node");
        }
        ((l3.i) bVar).i(focusState);
    }

    @Override // g4.z
    public int k(p036e4.w wVar, v vVar, int i15) {
        return ((k0) this.element).k(wVar, vVar, i15);
    }

    @Override // g4.d1
    public Object n(c5.d dVar, Object obj) {
        return ((x1) this.element).n(dVar, obj);
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final f3.m.b getElement() {
        return this.element;
    }

    public final HashSet<f4.c<?>> p3() {
        return this.readValues;
    }

    public final void r3() {
        this.invalidateCache = true;
        g4.r.a(this);
    }

    public final void s3(f3.m.b bVar) {
        if (getIsAttached()) {
            t3();
        }
        this.element = bVar;
        h3(t0.f(bVar));
        if (getIsAttached()) {
            q3(false);
        }
    }

    public String toString() {
        return this.element.toString();
    }

    public final void v3() {
        if (getIsAttached()) {
            this.readValues.clear();
            c1 snapshotObserver = g4.h.t(this).getSnapshotObserver();
            snapshotObserver.observer.k(this, androidx.compose.ui.node.b.f10049c, new d());
        }
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        f3.m.b bVar = this.element;
        k3.j jVar = (k3.j) bVar;
        if (this.invalidateCache && (bVar instanceof k3.i)) {
            u3();
        }
        jVar.y(cVar);
    }

    @Override // g4.f1
    public boolean z0() {
        return ((a4.i0) this.element).getPointerInputFilter().a();
    }

    @Override // g4.f1
    public boolean z2() {
        return ((a4.i0) this.element).getPointerInputFilter().c();
    }
}
