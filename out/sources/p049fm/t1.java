package p049fm;

import android.view.View;
import er.l;
import lh.e;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.m;
import p076m2.r;
import p076m2.t;
import p076m2.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llh/e;", "Landroidx/compose/ui/platform/b;", "view", "Lkotlin/Function1;", "Landroid/view/View;", "Loq/i0;", "onAddedToWindow", "Lm2/v;", "parentContext", "c", "(Llh/e;Landroidx/compose/ui/platform/b;Ler/l;Lm2/v;)V", "Lfm/r$a;", "e", "(Llh/e;Landroidx/compose/ui/platform/b;Lm2/v;)Lfm/r$a;", "Lfm/w4;", "a", "(Llh/e;)Lfm/w4;", "Lfm/r;", "b", "(Lm2/r;I)Lfm/r;", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class t1 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fm/t1$a", "Lfm/r;", "Landroidx/compose/ui/platform/b;", "view", "Lfm/r$a;", "a", "(Landroidx/compose/ui/platform/b;)Lfm/r$a;", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f65292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f65293b;

        a(e eVar, v vVar) {
            this.f65292a = eVar;
            this.f65293b = vVar;
        }

        @Override // p049fm.r
        public r.a a(androidx.compose.ui.platform.b view) {
            return t1.e(this.f65292a, view, this.f65293b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"fm/t1$b", "Lfm/r$a;", "Loq/i0;", "j", "()V", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w4 f65294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.b f65295b;

        b(w4 w4Var, androidx.compose.ui.platform.b bVar) {
            this.f65294a = w4Var;
            this.f65295b = bVar;
        }

        @Override // fm.r.a, java.io.Closeable, java.lang.AutoCloseable
        public /* bridge */ void close() {
            super.close();
        }

        @Override // fm.r.a
        public void j() {
            this.f65294a.removeView(this.f65295b);
        }
    }

    private static final w4 a(e eVar) {
        w4 w4Var = (w4) eVar.findViewById(p5.f65241a);
        if (w4Var != null) {
            return w4Var;
        }
        w4 w4Var2 = new w4(eVar.getContext());
        w4Var2.setId(p5.f65241a);
        eVar.addView(w4Var2);
        return w4Var2;
    }

    public static final r b(r rVar, int i15) {
        if (t.k()) {
            t.o(124209494, i15, -1, "com.google.maps.android.compose.rememberComposeUiViewRenderer (MapComposeViewRender.kt:70)");
        }
        e eVarM = ((g1) rVar.l()).getMapView();
        v vVarE = m.e(rVar, 0);
        boolean zW = rVar.W(vVarE);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new a(eVarM, vVarE);
            rVar.v(objE);
        }
        a aVar = (a) objE;
        if (t.k()) {
            t.n();
        }
        return aVar;
    }

    public static final void c(e eVar, androidx.compose.ui.platform.b bVar, l<? super View, i0> lVar, v vVar) {
        r.a aVarE = e(eVar, bVar, vVar);
        if (lVar != null) {
            try {
                lVar.b(bVar);
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(aVarE, th4);
                    throw th5;
                }
            }
        }
        ar.b.a(aVarE, null);
    }

    public static /* synthetic */ void d(e eVar, androidx.compose.ui.platform.b bVar, l lVar, v vVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            lVar = null;
        }
        c(eVar, bVar, lVar, vVar);
    }

    public static final r.a e(e eVar, androidx.compose.ui.platform.b bVar, v vVar) {
        w4 w4VarA = a(eVar);
        w4VarA.addView(bVar);
        bVar.setParentCompositionContext(vVar);
        return new b(w4VarA, bVar);
    }
}
