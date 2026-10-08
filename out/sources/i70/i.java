package i70;

import androidx.compose.ui.platform.ComposeView;
import fr.q;
import mu.b0;
import mu.p0;
import mu.r0;
import oq.i0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Li70/i;", "Li70/f;", "Li70/e;", "", "<init>", "()V", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "LCON/p;", "activity", "e", "(LCON/p;)V", "b", "(Lm2/r;I)V", "Lmu/b0;", "Li70/p;", "a", "Lmu/b0;", "_snackBarVisibilityState", "Lmu/p0;", "Lmu/p0;", "j", "()Lmu/p0;", "snackBarVisibilityState", "snackBarState", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements f, e, ty.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<p> _snackBarVisibilityState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<p> snackBarVisibilityState;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, i.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((i) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public i() {
        b0<p> b0VarA = r0.a(p.a.f89857a);
        this._snackBarVisibilityState = b0VarA;
        this.snackBarVisibilityState = b0VarA;
    }

    private static final p g(f6<? extends p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i iVar, int i15, r rVar, int i16) {
        iVar.b(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(i iVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1362627956, i15, -1, "pl.gov.coi.common.ui.snackBar.GlobalSnackBarManagerImpl.connect.<anonymous> (GlobalSnackBarManager.kt:41)");
            }
            iVar.b(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this._snackBarVisibilityState.f(p.a.f89857a);
    }

    @Override // ty.a
    public void b(r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(562713901);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(562713901, i16, -1, "pl.gov.coi.common.ui.snackBar.GlobalSnackBarManagerImpl.Render (GlobalSnackBarManager.kt:46)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            al alVar = (al) objE;
            f6 f6VarC = m7.b.c(j(), null, null, null, rVarH, 0, 7);
            p pVarG = g(f6VarC);
            boolean zG = rVarH.G(this);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(this);
                rVarH.v(objE2);
            }
            m.d(alVar, pVarG, (er.a) ((mr.g) objE2), null, null, rVarH, 6, 24);
            d.d(alVar, g(f6VarC), false, rVarH, 6, 4);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i70.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(this.f89837a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // oz.c
    public void e(CON.p activity) {
        ComposeView composeView = (ComposeView) activity.findViewById(c20.c.f22739a);
        if (composeView != null) {
            composeView.setContent(y2.m.b(-1362627956, true, new er.p() { // from class: i70.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(this.f89836a, (r) obj, ((Integer) obj2).intValue());
                }
            }));
        }
    }

    public p0<p> j() {
        return this.snackBarVisibilityState;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this._snackBarVisibilityState.f(new p.Visible(snackBarData));
    }
}
