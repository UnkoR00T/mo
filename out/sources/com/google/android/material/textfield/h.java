package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
class h extends lj.h {
    b P;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // lj.h
        protected void w(Canvas canvas) {
            if (this.P.f35717x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.P.f35717x);
            super.w(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h x0(b bVar) {
        return new c(bVar);
    }

    static h y0(lj.l lVar) {
        if (lVar == null) {
            lVar = new lj.l();
        }
        return x0(new b(lVar, new RectF()));
    }

    void A0() {
        B0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void B0(float f15, float f16, float f17, float f18) {
        if (f15 == this.P.f35717x.left && f16 == this.P.f35717x.top && f17 == this.P.f35717x.right && f18 == this.P.f35717x.bottom) {
            return;
        }
        this.P.f35717x.set(f15, f16, f17, f18);
        invalidateSelf();
    }

    void C0(RectF rectF) {
        B0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.P = new b(this.P);
        return this;
    }

    boolean z0() {
        return !this.P.f35717x.isEmpty();
    }

    private static final class b extends lj.h.c {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f35717x;

        @Override // lj.h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarX0 = h.x0(this);
            hVarX0.invalidateSelf();
            return hVarX0;
        }

        private b(lj.l lVar, RectF rectF) {
            super(lVar, null);
            this.f35717x = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f35717x = bVar.f35717x;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.P = bVar;
    }
}
