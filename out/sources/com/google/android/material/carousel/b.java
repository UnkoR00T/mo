package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f34993a;

    class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f34994b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i15, CarouselLayoutManager carouselLayoutManager) {
            super(i15, null);
            this.f34994b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f15 = rectF2.top;
            float f16 = rectF3.top;
            if (f15 < f16 && rectF2.bottom > f16) {
                float f17 = f16 - f15;
                rectF.top += f17;
                rectF3.top += f17;
            }
            float f18 = rectF2.bottom;
            float f19 = rectF3.bottom;
            if (f18 <= f19 || rectF2.top >= f19) {
                return;
            }
            float f25 = f18 - f19;
            rectF.bottom = Math.max(rectF.bottom - f25, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f25, rectF2.top);
        }

        @Override // com.google.android.material.carousel.b
        public RectF e(float f15, float f16, float f17, float f18) {
            return new RectF(0.0f, f17, f16, f15 - f17);
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f34994b.b0();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return this.f34994b.i0();
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return this.f34994b.s0() - this.f34994b.j0();
        }

        @Override // com.google.android.material.carousel.b
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.b
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        public void k(View view, int i15, int i16) {
            int iG = g();
            this.f34994b.D0(view, iG, i15, iG + n(view), i16);
        }

        @Override // com.google.android.material.carousel.b
        public void l(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override // com.google.android.material.carousel.b
        public void m(View view, Rect rect, float f15, float f16) {
            view.offsetTopAndBottom((int) (f16 - (rect.top + f15)));
        }

        int n(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f34994b.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    class C0744b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f34995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0744b(int i15, CarouselLayoutManager carouselLayoutManager) {
            super(i15, null);
            this.f34995b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.b
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f15 = rectF2.left;
            float f16 = rectF3.left;
            if (f15 < f16 && rectF2.right > f16) {
                float f17 = f16 - f15;
                rectF.left += f17;
                rectF2.left += f17;
            }
            float f18 = rectF2.right;
            float f19 = rectF3.right;
            if (f18 <= f19 || rectF2.left >= f19) {
                return;
            }
            float f25 = f18 - f19;
            rectF.right = Math.max(rectF.right - f25, rectF.left);
            rectF2.right = Math.max(rectF2.right - f25, rectF2.left);
        }

        @Override // com.google.android.material.carousel.b
        public RectF e(float f15, float f16, float f17, float f18) {
            return new RectF(f18, 0.0f, f16 - f18, f15);
        }

        @Override // com.google.android.material.carousel.b
        int f() {
            return this.f34995b.b0() - this.f34995b.h0();
        }

        @Override // com.google.android.material.carousel.b
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.b
        int h() {
            return this.f34995b.s0();
        }

        @Override // com.google.android.material.carousel.b
        int i() {
            return this.f34995b.F2() ? h() : g();
        }

        @Override // com.google.android.material.carousel.b
        int j() {
            return this.f34995b.k0();
        }

        @Override // com.google.android.material.carousel.b
        public void k(View view, int i15, int i16) {
            int iJ = j();
            this.f34995b.D0(view, i15, iJ, i16, iJ + n(view));
        }

        @Override // com.google.android.material.carousel.b
        public void l(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override // com.google.android.material.carousel.b
        public void m(View view, Rect rect, float f15, float f16) {
            view.offsetLeftAndRight((int) (f16 - (rect.left + f15)));
        }

        int n(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f34995b.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
    }

    /* synthetic */ b(int i15, a aVar) {
        this(i15);
    }

    private static b b(CarouselLayoutManager carouselLayoutManager) {
        return new C0744b(0, carouselLayoutManager);
    }

    static b c(CarouselLayoutManager carouselLayoutManager, int i15) {
        if (i15 == 0) {
            return b(carouselLayoutManager);
        }
        if (i15 == 1) {
            return d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static b d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    abstract RectF e(float f15, float f16, float f17, float f18);

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View view, int i15, int i16);

    abstract void l(RectF rectF, RectF rectF2, RectF rectF3);

    abstract void m(View view, Rect rect, float f15, float f16);

    private b(int i15) {
        this.f34993a = i15;
    }
}
