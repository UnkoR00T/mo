package p047f5;

import c5.n;
import c5.o;
import er.l;
import fr.w;
import java.util.List;
import k5.h;
import n3.a2;
import n3.e3;
import oq.i0;
import p036e4.f0;
import p036e4.v0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a0\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013*\f\b\u0000\u0010\u0015\"\u00020\u00142\u00020\u0014*\f\b\u0000\u0010\u0017\"\u00020\u00162\u00020\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, d2 = {"", "b", "()Ljava/lang/Object;", "Le4/a2$a;", "Le4/a2;", "placeable", "Lk5/h;", "frame", "Lc5/n;", "offset", "Loq/i0;", "c", "(Le4/a2$a;Le4/a2;Lk5/h;J)V", "Lf5/d0;", "state", "", "Le4/v0;", "measurables", "a", "(Lf5/d0;Ljava/util/List;)V", "Lk5/d;", "SolverDimension", "Lk5/g;", "SolverState", "Lf5/o;", "startConstraint", "endConstraint", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/j$a", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln3/a2;", "Loq/i0;", "c", "(Ln3/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends w implements l<a2, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f59226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(1);
            this.f59226b = hVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2 a2Var) {
            c(a2Var);
            return i0.f148189a;
        }

        public final void c(a2 a2Var) {
            if (!Float.isNaN(this.f59226b.f108561f) || !Float.isNaN(this.f59226b.f108562g)) {
                a2Var.Y0(e3.a(Float.isNaN(this.f59226b.f108561f) ? 0.5f : this.f59226b.f108561f, Float.isNaN(this.f59226b.f108562g) ? 0.5f : this.f59226b.f108562g));
            }
            if (!Float.isNaN(this.f59226b.f108563h)) {
                a2Var.x(this.f59226b.f108563h);
            }
            if (!Float.isNaN(this.f59226b.f108564i)) {
                a2Var.z(this.f59226b.f108564i);
            }
            if (!Float.isNaN(this.f59226b.f108565j)) {
                a2Var.C(this.f59226b.f108565j);
            }
            if (!Float.isNaN(this.f59226b.f108566k)) {
                a2Var.N(this.f59226b.f108566k);
            }
            if (!Float.isNaN(this.f59226b.f108567l)) {
                a2Var.j(this.f59226b.f108567l);
            }
            if (!Float.isNaN(this.f59226b.f108568m)) {
                a2Var.B(this.f59226b.f108568m);
            }
            if (!Float.isNaN(this.f59226b.f108569n) || !Float.isNaN(this.f59226b.f108570o)) {
                a2Var.s(Float.isNaN(this.f59226b.f108569n) ? 1.0f : this.f59226b.f108569n);
                a2Var.D(Float.isNaN(this.f59226b.f108570o) ? 1.0f : this.f59226b.f108570o);
            }
            if (Float.isNaN(this.f59226b.f108571p)) {
                return;
            }
            a2Var.g(this.f59226b.f108571p);
        }
    }

    public static final void a(d0 d0Var, List<? extends v0> list) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            v0 v0Var = list.get(i15);
            Object objA = f0.a(v0Var);
            if (objA == null && (objA = m.a(v0Var)) == null) {
                objA = b();
            }
            d0Var.s(objA.toString(), v0Var);
            Object objB = m.b(v0Var);
            if (objB != null && (objB instanceof String) && (objA instanceof String)) {
                d0Var.y((String) objA, (String) objB);
            }
        }
    }

    public static final Object b() {
        return new a();
    }

    public static final void c(e4.a2.a aVar, p036e4.a2 a2Var, h hVar, long j15) {
        if (hVar.f108573r == 8) {
            return;
        }
        if (hVar.c()) {
            e4.a2.a.G(aVar, a2Var, o.a(hVar.f108557b - n.i(j15), hVar.f108558c - n.j(j15)), 0.0f, 2, null);
        } else {
            aVar.Y(a2Var, hVar.f108557b - n.i(j15), hVar.f108558c - n.j(j15), Float.isNaN(hVar.f108568m) ? 0.0f : hVar.f108568m, new b(hVar));
        }
    }

    public static /* synthetic */ void d(e4.a2.a aVar, p036e4.a2 a2Var, h hVar, long j15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            j15 = n.INSTANCE.b();
        }
        c(aVar, a2Var, hVar, j15);
    }
}
