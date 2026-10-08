package p036e4;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.j;
import c5.c;
import er.l;
import fr.w;
import n3.a2;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/j;", "lookaheadCapablePlaceable", "Le4/a2$a;", "a", "(Landroidx/compose/ui/node/j;)Le4/a2$a;", "Landroidx/compose/ui/node/Owner;", "owner", "b", "(Landroidx/compose/ui/node/Owner;)Le4/a2$a;", "Lkotlin/Function1;", "Ln3/a2;", "Loq/i0;", "Ler/l;", "DefaultLayerBlock", "Lc5/b;", "J", "DefaultConstraints", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<a2, i0> f47203a = a.f47205b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f47204b = c.b(0, 0, 0, 0, 15, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln3/a2;", "Loq/i0;", "c", "(Ln3/a2;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<a2, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47205b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2 a2Var) {
            c(a2Var);
            return i0.f148189a;
        }

        public final void c(a2 a2Var) {
        }
    }

    public static final a2.a a(j jVar) {
        return new p0(jVar);
    }

    public static final a2.a b(Owner owner) {
        return new w1(owner);
    }
}
