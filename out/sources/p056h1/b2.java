package p056h1;

import er.l;
import er.p;
import f3.m;
import fr.t;
import g4.i1;
import g4.j1;
import ju.p0;
import n4.CollectionInfo;
import n4.ScrollAxisRange;
import n4.f0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p143z0.a2;
import tq.e;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Lh1/b2;", "Lf3/m$c;", "Lg4/i1;", "Lkotlin/Function0;", "Lh1/o0;", "itemProviderLambda", "Lh1/t1;", "state", "Lz0/a2;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Ler/a;Lh1/t1;Lz0/a2;ZZ)V", "Loq/i0;", "y3", "()V", "x3", "Ln4/i0;", "E2", "(Ln4/i0;)V", "r", "Ler/a;", "s", "Lh1/t1;", "t", "Lz0/a2;", "v", "Z", "w", "Ln4/n;", "x", "Ln4/n;", "scrollAxisRange", "Lkotlin/Function1;", "", "", "y", "Ler/l;", "indexForKeyMapping", "z", "scrollToIndexAction", "w3", "()Z", "isVertical", "Ln4/d;", "u3", "()Ln4/d;", "collectionInfo", "R2", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b2 extends m.c implements i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.a<? extends o0> itemProviderLambda;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private t1 state;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean userScrollEnabled;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange scrollAxisRange;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final l<Object, Integer> indexForKeyMapping = new l() { // from class: h1.w1
        @Override // er.l
        public final Object b(Object obj) {
            return Integer.valueOf(b2.v3(this.f79618a, obj));
        }
    };

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private l<? super Integer, Boolean> scrollToIndexAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79329e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f79331g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i15, e<? super a> eVar) {
            super(2, eVar);
            this.f79331g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f79329e;
            if (i15 == 0) {
                u.b(obj);
                t1 t1Var = b2.this.state;
                int i16 = this.f79331g;
                this.f79329e = 1;
                if (t1Var.f(i16, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return b2.this.new a(this.f79331g, eVar);
        }
    }

    public b2(er.a<? extends o0> aVar, t1 t1Var, a2 a2Var, boolean z15, boolean z16) {
        this.itemProviderLambda = aVar;
        this.state = t1Var;
        this.orientation = a2Var;
        this.userScrollEnabled = z15;
        this.reverseScrolling = z16;
        y3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float A3(b2 b2Var) {
        return b2Var.state.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B3(b2 b2Var, int i15) {
        o0 o0VarA = b2Var.itemProviderLambda.a();
        if (!(i15 >= 0 && i15 < o0VarA.a())) {
            c1.e.a("Can't scroll to index " + i15 + ", it is out of bounds [0, " + o0VarA.a() + ')');
        }
        ju.k.d(b2Var.M2(), null, null, b2Var.new a(i15, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float t3(b2 b2Var) {
        return Float.valueOf(b2Var.state.d() - b2Var.state.a());
    }

    private final CollectionInfo u3() {
        return this.state.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v3(b2 b2Var, Object obj) {
        o0 o0VarA = b2Var.itemProviderLambda.a();
        int iA = o0VarA.a();
        for (int i15 = 0; i15 < iA; i15++) {
            if (t.c(o0VarA.d(i15), obj)) {
                return i15;
            }
        }
        return -1;
    }

    private final boolean w3() {
        return this.orientation == a2.Vertical;
    }

    private final void y3() {
        this.scrollAxisRange = new ScrollAxisRange(new er.a() { // from class: h1.x1
            @Override // er.a
            public final Object a() {
                return Float.valueOf(b2.z3(this.f79623a));
            }
        }, new er.a() { // from class: h1.y1
            @Override // er.a
            public final Object a() {
                return Float.valueOf(b2.A3(this.f79624a));
            }
        }, this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new l() { // from class: h1.z1
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(b2.B3(this.f79626a, ((Integer) obj).intValue()));
            }
        } : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float z3(b2 b2Var) {
        return b2Var.state.e();
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        f0.u(i0Var, this.indexForKeyMapping);
        if (w3()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                scrollAxisRange = null;
            }
            f0.J0(i0Var, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                scrollAxisRange2 = null;
            }
            f0.j0(i0Var, scrollAxisRange2);
        }
        l<? super Integer, Boolean> lVar = this.scrollToIndexAction;
        if (lVar != null) {
            f0.X(i0Var, null, lVar, 1, null);
        }
        f0.q(i0Var, null, new er.a() { // from class: h1.a2
            @Override // er.a
            public final Object a() {
                return b2.t3(this.f79305a);
            }
        }, 1, null);
        f0.Z(i0Var, u3());
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void x3(er.a<? extends o0> itemProviderLambda, t1 state, a2 orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = itemProviderLambda;
        this.state = state;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            j1.d(this);
        }
        if (this.userScrollEnabled == userScrollEnabled && this.reverseScrolling == reverseScrolling) {
            return;
        }
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        y3();
        j1.d(this);
    }
}
