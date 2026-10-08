package y2;

import fr.w0;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d4;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"J^\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020.\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Ly2/l;", "Ly2/f;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()V", "Lm2/r;", "composer", "G", "(Lm2/r;)V", "I", "(Ljava/lang/Object;)V", "c", "changed", "u", "(Lm2/r;I)Ljava/lang/Object;", "p1", "s", "(Ljava/lang/Object;Lm2/r;I)Ljava/lang/Object;", "p2", "r", "(Ljava/lang/Object;Ljava/lang/Object;Lm2/r;I)Ljava/lang/Object;", "p3", "q", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lm2/r;I)Ljava/lang/Object;", "p4", "m", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lm2/r;I)Ljava/lang/Object;", "p5", "p6", "l", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lm2/r;I)Ljava/lang/Object;", "a", "getKey", "()I", "b", "Z", "Ljava/lang/Object;", "_block", "Lm2/d4;", "d", "Lm2/d4;", "scope", "", "e", "Ljava/util/List;", "scopes", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object _block;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d4 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<d4> scopes;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.a implements er.p<p076m2.r, Integer, i0> {
        a(Object obj) {
            super(2, obj, l.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            ((l) this.f66376a).u(rVar, i15);
        }
    }

    public l(int i15, boolean z15, Object obj) {
        this.key = i15;
        this.tracked = z15;
        this._block = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(l lVar, Object obj, Object obj2, Object obj3, Object obj4, int i15, p076m2.r rVar, int i16) {
        lVar.m(obj, obj2, obj3, obj4, rVar, g4.a(i15) | 1);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(l lVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i15, p076m2.r rVar, int i16) {
        lVar.l(obj, obj2, obj3, obj4, obj5, obj6, rVar, g4.a(i15) | 1);
        return i0.f148189a;
    }

    private final void G(p076m2.r composer) {
        d4 d4VarA;
        if (!this.tracked || (d4VarA = composer.A()) == null) {
            return;
        }
        composer.L(d4VarA);
        if (m.e(this.scope, d4VarA)) {
            this.scope = d4VarA;
            return;
        }
        List<d4> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(d4VarA);
            return;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (m.e(list.get(i15), d4VarA)) {
                list.set(i15, d4VarA);
                return;
            }
        }
        list.add(d4VarA);
    }

    private final void H() {
        if (this.tracked) {
            d4 d4Var = this.scope;
            if (d4Var != null) {
                d4Var.invalidate();
                this.scope = null;
            }
            List<d4> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    list.get(i15).invalidate();
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, Object obj, int i15, p076m2.r rVar, int i16) {
        lVar.s(obj, rVar, g4.a(i15) | 1);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(l lVar, Object obj, Object obj2, int i15, p076m2.r rVar, int i16) {
        lVar.r(obj, obj2, rVar, g4.a(i15) | 1);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(l lVar, Object obj, Object obj2, Object obj3, int i15, p076m2.r rVar, int i16) {
        lVar.q(obj, obj2, obj3, rVar, g4.a(i15) | 1);
        return i0.f148189a;
    }

    @Override // er.p
    public /* bridge */ /* synthetic */ Object B(p076m2.r rVar, Integer num) {
        return u(rVar, num.intValue());
    }

    @Override // er.s
    public /* bridge */ /* synthetic */ Object C(Object obj, Object obj2, Object obj3, p076m2.r rVar, Integer num) {
        return q(obj, obj2, obj3, rVar, num.intValue());
    }

    public final void I(Object block) {
        if (fr.t.c(this._block, block)) {
            return;
        }
        boolean z15 = this._block == null;
        this._block = block;
        if (z15) {
            return;
        }
        H();
    }

    @Override // er.r
    public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, p076m2.r rVar, Integer num) {
        return r(obj, obj2, rVar, num.intValue());
    }

    @Override // er.v
    public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p076m2.r rVar, Integer num) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, rVar, num.intValue());
    }

    public Object l(final Object p15, final Object p16, final Object p17, final Object p18, final Object p19, final Object p25, p076m2.r c15, final int changed) {
        p076m2.r rVarH = c15.h(this.key);
        G(rVarH);
        Object objK = ((er.v) w0.g(this._block, 8)).k(p15, p16, p17, p18, p19, p25, rVarH, Integer.valueOf(changed | (rVarH.W(this) ? m.c(6) : m.f(6))));
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.F(this.f223387a, p15, p16, p17, p18, p19, p25, changed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
        return objK;
    }

    public Object m(final Object p15, final Object p16, final Object p17, final Object p18, p076m2.r c15, final int changed) {
        p076m2.r rVarH = c15.h(this.key);
        G(rVarH);
        Object objO = ((er.t) w0.g(this._block, 6)).o(p15, p16, p17, p18, rVarH, Integer.valueOf((rVarH.W(this) ? m.c(4) : m.f(4)) | changed));
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.E(this.f223376a, p15, p16, p17, p18, changed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
        return objO;
    }

    @Override // er.t
    public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, p076m2.r rVar, Integer num) {
        return m(obj, obj2, obj3, obj4, rVar, num.intValue());
    }

    public Object q(final Object p15, final Object p16, final Object p17, p076m2.r c15, final int changed) {
        p076m2.r rVarH = c15.h(this.key);
        G(rVarH);
        Object objC = ((er.s) w0.g(this._block, 5)).C(p15, p16, p17, rVarH, Integer.valueOf((rVarH.W(this) ? m.c(3) : m.f(3)) | changed));
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.z(this.f223382a, p15, p16, p17, changed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
        return objC;
    }

    public Object r(final Object p15, final Object p16, p076m2.r c15, final int changed) {
        p076m2.r rVarH = c15.h(this.key);
        G(rVarH);
        Object objG = ((er.r) w0.g(this._block, 4)).g(p15, p16, rVarH, Integer.valueOf((rVarH.W(this) ? m.c(2) : m.f(2)) | changed));
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.x(this.f223369a, p15, p16, changed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
        return objG;
    }

    public Object s(final Object p15, p076m2.r c15, final int changed) {
        p076m2.r rVarH = c15.h(this.key);
        G(rVarH);
        Object objW = ((er.q) w0.g(this._block, 3)).w(p15, rVarH, Integer.valueOf((rVarH.W(this) ? m.c(1) : m.f(1)) | changed));
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.v(this.f223373a, p15, changed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
        return objW;
    }

    public Object u(p076m2.r c15, int changed) {
        p076m2.r rVarH = c15.h(this.key);
        G(rVarH);
        Object objB = ((er.p) w0.g(this._block, 2)).B(rVarH, Integer.valueOf(changed | (rVarH.W(this) ? m.c(0) : m.f(0))));
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new a(this));
        }
        return objB;
    }

    @Override // er.q
    public /* bridge */ /* synthetic */ Object w(Object obj, p076m2.r rVar, Integer num) {
        return s(obj, rVar, num.intValue());
    }
}
