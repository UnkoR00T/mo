package z9;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import p114t0.y0;
import p136y9.d1;
import p136y9.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aó\u0001\u0010\u0017\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u001e\b\u0002\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\b2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018\u001aW\u0010\u001b\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly9/d1;", "", "route", "", "Ly9/r;", "arguments", "Ly9/v0;", "deepLinks", "Lkotlin/Function1;", "Lt0/h;", "Ly9/w;", "Lt0/c0;", "enterTransition", "Lt0/e0;", "exitTransition", "popEnterTransition", "popExitTransition", "Lt0/y0;", "sizeTransform", "Lkotlin/Function2;", "Lt0/f;", "Loq/i0;", "content", "a", "(Ly9/d1;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/r;)V", "Landroidx/compose/ui/window/l;", "dialogProperties", "c", "(Ly9/d1;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/l;Ler/q;)V", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t {
    public static final void a(d1 d1Var, String str, List<p136y9.r> list, List<v0> list2, er.l<p114t0.h<p136y9.w>, p114t0.c0> lVar, er.l<p114t0.h<p136y9.w>, p114t0.e0> lVar2, er.l<p114t0.h<p136y9.w>, p114t0.c0> lVar3, er.l<p114t0.h<p136y9.w>, p114t0.e0> lVar4, er.l<p114t0.h<p136y9.w>, y0> lVar5, er.r<? super p114t0.f, ? super p136y9.w, ? super p076m2.r, ? super Integer, oq.i0> rVar) {
        f fVar = new f((e) d1Var.getProvider().d(e.class), str, rVar);
        for (p136y9.r rVar2 : list) {
            fVar.a(rVar2.getName(), rVar2.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            fVar.c((v0) it.next());
        }
        fVar.h(lVar);
        fVar.i(lVar2);
        fVar.j(lVar3);
        fVar.k(lVar4);
        fVar.l(lVar5);
        d1Var.i(fVar);
    }

    public static /* synthetic */ void b(d1 d1Var, String str, List list, List list2, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.l lVar5, er.r rVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            list = pq.v.n();
        }
        List list3 = list;
        if ((i15 & 4) != 0) {
            list2 = pq.v.n();
        }
        List list4 = list2;
        er.l lVar6 = (i15 & 8) != 0 ? null : lVar;
        er.l lVar7 = (i15 & 16) != 0 ? null : lVar2;
        a(d1Var, str, list3, list4, lVar6, lVar7, (i15 & 32) != 0 ? lVar6 : lVar3, (i15 & 64) != 0 ? lVar7 : lVar4, (i15 & 128) != 0 ? null : lVar5, rVar);
    }

    public static final void c(d1 d1Var, String str, List<p136y9.r> list, List<v0> list2, androidx.compose.ui.window.l lVar, er.q<? super p136y9.w, ? super p076m2.r, ? super Integer, oq.i0> qVar) {
        o oVar = new o((n) d1Var.getProvider().d(n.class), str, lVar, qVar);
        for (p136y9.r rVar : list) {
            oVar.a(rVar.getName(), rVar.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            oVar.c((v0) it.next());
        }
        d1Var.i(oVar);
    }
}
