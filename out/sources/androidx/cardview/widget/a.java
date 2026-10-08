package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d o(b bVar) {
        return (d) bVar.d();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, float f15) {
        o(bVar).h(f15);
    }

    @Override // androidx.cardview.widget.c
    public float b(b bVar) {
        return o(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void c(b bVar, float f15) {
        bVar.f().setElevation(f15);
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return o(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList e(b bVar) {
        return o(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public float f(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void g(b bVar) {
        n(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void h(b bVar, Context context, ColorStateList colorStateList, float f15, float f16, float f17) {
        bVar.b(new d(colorStateList, f15));
        View viewF = bVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f16);
        n(bVar, f17);
    }

    @Override // androidx.cardview.widget.c
    public float i(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void j(b bVar) {
        n(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void k() {
    }

    @Override // androidx.cardview.widget.c
    public float l(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, float f15) {
        o(bVar).g(f15, bVar.c(), bVar.e());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.c()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float fD = d(bVar);
        float fB = b(bVar);
        int iCeil = (int) Math.ceil(e.a(fD, fB, bVar.e()));
        int iCeil2 = (int) Math.ceil(e.b(fD, fB, bVar.e()));
        bVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
