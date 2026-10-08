package s1;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import n3.n1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.x5;
import q1.TextContextMenuData;
import q1.TextContextMenuItem;
import q1.TextContextMenuRemoteActionItem;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "content", "z", "(Lf3/m;Ler/p;Lm2/r;I)V", "Lu1/c;", ip.a.f96138c, "(Lm2/r;I)Lu1/c;", "Lq1/g;", "session", "Lu1/j;", "dataProvider", "Le4/b0;", "anchorLayoutCoordinates", "t", "(Lq1/g;Lu1/j;Ler/a;Lm2/r;I)V", "Lq1/c;", "data", "l", "(Lq1/g;Lq1/c;Lm2/r;I)V", "", "resId", "Landroidx/compose/ui/graphics/Color;", "tint", "q", "(IJLm2/r;I)V", "Landroidx/compose/ui/window/u;", "a", "Landroidx/compose/ui/window/u;", "DefaultPopupProperties", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.compose.ui.window.u f177317a = new androidx.compose.ui.window.u(true, false, false, false, false, 30, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.q<Color, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q1.b f177318a;

        a(q1.b bVar) {
            this.f177318a = bVar;
        }

        public final void c(long j15, p076m2.r rVar, int i15) {
            if ((i15 & 6) == 0) {
                i15 |= rVar.d(j15) ? 4 : 2;
            }
            if (!rVar.r((i15 & 19) != 18, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1930700965, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
            }
            j0.q(((TextContextMenuItem) this.f177318a).getLeadingIcon(), j15, rVar, (i15 << 3) & 112);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ oq.i0 w(Color color, p076m2.r rVar, Integer num) {
            c(color.m20unboximpl(), rVar, num.intValue());
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<TextContextMenuData> {
        b(Object obj) {
            super(0, obj, u1.j.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final TextContextMenuData a() {
            return ((u1.j) this.f66391b).A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(f3.m mVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        z(mVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final u1.c D(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1197778906, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.defaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:98)");
        }
        u1.c cVarM = u1.i.m(x.f177383a.d(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return cVarM;
    }

    private static final void l(final q1.g gVar, final TextContextMenuData textContextMenuData, p076m2.r rVar, final int i15) {
        int i16;
        final Context context;
        p076m2.r rVarH = rVar.h(1904307118);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(textContextMenuData) ? 32 : 16;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1904307118, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                rVarH.X(-1009482584);
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                rVarH.R();
            } else {
                rVarH.X(-1009433480);
                rVarH.R();
                context = null;
            }
            boolean zG = rVarH.G(textContextMenuData);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(gVar))) {
                z15 = true;
            }
            boolean zG2 = zG | z15 | rVarH.G(context);
            Object objE = rVarH.E();
            if (zG2 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: s1.e0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j0.m(textContextMenuData, context, gVar, (y0.r) obj);
                    }
                };
                rVarH.v(objE);
            }
            y0.d0.k(null, null, (er.l) objE, rVarH, 0, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.f0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j0.p(gVar, textContextMenuData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(TextContextMenuData textContextMenuData, Context context, final q1.g gVar, y0.r rVar) {
        y0.r rVar2;
        List<q1.b> listB = textContextMenuData.b();
        int size = listB.size();
        int i15 = 0;
        while (i15 < size) {
            final q1.b bVar = listB.get(i15);
            if (bVar instanceof TextContextMenuItem) {
                rVar2 = rVar;
                y0.r.g(rVar2, new er.p() { // from class: s1.g0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j0.n(bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, null, false, ((TextContextMenuItem) bVar).getLeadingIcon() == 0 ? null : y2.m.b(-1930700965, true, new a(bVar)), new er.a() { // from class: s1.h0
                    @Override // er.a
                    public final Object a() {
                        return j0.o(bVar, gVar);
                    }
                }, 6, null);
            } else {
                rVar2 = rVar;
                if (bVar instanceof TextContextMenuRemoteActionItem) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        d1.f177286a.q(rVar2, context, (TextContextMenuRemoteActionItem) bVar);
                    }
                } else if (bVar instanceof q1.f) {
                    rVar2.i();
                }
            }
            i15++;
            rVar = rVar2;
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(q1.b bVar, p076m2.r rVar, int i15) {
        rVar.X(666084174);
        if (p076m2.t.k()) {
            p076m2.t.o(666084174, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
        }
        String label = ((TextContextMenuItem) bVar).getLabel();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(q1.b bVar, q1.g gVar) {
        ((TextContextMenuItem) bVar).d().b(gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(q1.g gVar, TextContextMenuData textContextMenuData, int i15, p076m2.r rVar, int i16) {
        l(gVar, textContextMenuData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final int i15, final long j15, p076m2.r rVar, final int i16) {
        int i17;
        d5 d5VarM;
        er.p<? super p076m2.r, ? super Integer, oq.i0> pVar;
        p076m2.r rVarH = rVar.h(-1240244237);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.d(j15) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1240244237, i17, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            boolean zW = ((i17 & 14) == 4) | rVarH.W(context);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = Integer.valueOf(context.obtainStyledAttributes(new int[]{i15}).getResourceId(0, -1));
                rVarH.v(objE);
            }
            int iIntValue = ((Number) objE).intValue();
            if (iIntValue == -1) {
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM == null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: s1.i0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j0.r(i15, j15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(iIntValue, rVarH, 0);
                boolean z15 = (i17 & 112) == 32;
                Object objE2 = rVarH.E();
                if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = j15 == 16 ? null : n1.Companion.b(n1.INSTANCE, j15, 0, 2, null);
                    rVarH.v(objE2);
                }
                d1.r.b(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, y0.s.f222582a.g()), aVarC, false, null, p036e4.l.INSTANCE.e(), 0.0f, (n1) objE2, 22, null), rVarH, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
            d5VarM.a(pVar);
        }
        rVarH.O();
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            pVar = new er.p() { // from class: s1.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j0.s(i15, j15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            };
            d5VarM.a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(int i15, long j15, int i16, p076m2.r rVar, int i17) {
        q(i15, j15, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(int i15, long j15, int i16, p076m2.r rVar, int i17) {
        q(i15, j15, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final q1.g gVar, final u1.j jVar, final er.a<? extends p036e4.b0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2040393164);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2040393164, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            boolean z16 = (i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.W(jVar));
            Object objE = rVarH.E();
            if (z16 || objE == p076m2.r.INSTANCE.a()) {
                objE = new l0(new y0.n(new er.a() { // from class: s1.a0
                    @Override // er.a
                    public final Object a() {
                        return j0.u(jVar, aVar);
                    }
                }, (er.p) null, 2, (fr.k) null));
                rVarH.v(objE);
            }
            l0 l0Var = (l0) objE;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(gVar))) {
                z15 = true;
            }
            Object objE2 = rVarH.E();
            if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: s1.b0
                    @Override // er.a
                    public final Object a() {
                        return j0.v(gVar);
                    }
                };
                rVarH.v(objE2);
            }
            androidx.compose.ui.window.b.a(l0Var, (er.a) objE2, f177317a, y2.m.d(1315155414, true, new er.p() { // from class: s1.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j0.w(jVar, gVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 3456, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.d0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j0.y(gVar, jVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n u(u1.j jVar, er.a aVar) {
        return c5.n.c(c5.o.d(jVar.L0((p036e4.b0) aVar.a())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(q1.g gVar) {
        gVar.close();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(u1.j jVar, q1.g gVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1315155414, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
            }
            boolean zW = rVar.W(jVar);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = x5.d(new b(jVar));
                rVar.v(objE);
            }
            l(gVar, x((f6) objE), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final TextContextMenuData x(f6<TextContextMenuData> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(q1.g gVar, u1.j jVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        t(gVar, jVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(f3.m mVar, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        final f3.m mVar2;
        final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar2;
        p076m2.r rVarH = rVar.h(1392105195);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1392105195, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            mVar2 = mVar;
            pVar2 = pVar;
            u1.i.f(mVar2, u1.n.e(), x.f177383a.e(), pVar2, rVarH, (i16 & 14) | 432 | ((i16 << 6) & 7168));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            mVar2 = mVar;
            pVar2 = pVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j0.A(mVar2, pVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
