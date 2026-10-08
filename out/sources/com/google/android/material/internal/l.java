package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f35421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f35422d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ij.d f35425g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f35419a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.f f35420b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35423e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<b> f35424f = new WeakReference<>(null);

    class a extends ij.f {
        a() {
        }

        @Override // ij.f
        public void a(int i15) {
            l.this.f35423e = true;
            b bVar = (b) l.this.f35424f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // ij.f
        public void b(Typeface typeface, boolean z15) {
            if (z15) {
                return;
            }
            l.this.f35423e = true;
            b bVar = (b) l.this.f35424f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public l(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f35419a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f35419a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f35421c = d(str);
        this.f35422d = c(str);
        this.f35423e = false;
    }

    public ij.d e() {
        return this.f35425g;
    }

    public float f(String str) {
        if (!this.f35423e) {
            return this.f35422d;
        }
        i(str);
        return this.f35422d;
    }

    public TextPaint g() {
        return this.f35419a;
    }

    public float h(String str) {
        if (!this.f35423e) {
            return this.f35421c;
        }
        i(str);
        return this.f35421c;
    }

    public void j(b bVar) {
        this.f35424f = new WeakReference<>(bVar);
    }

    public void k(ij.d dVar, Context context) {
        if (this.f35425g != dVar) {
            this.f35425g = dVar;
            if (dVar != null) {
                dVar.q(context, this.f35419a, this.f35420b);
                b bVar = this.f35424f.get();
                if (bVar != null) {
                    this.f35419a.drawableState = bVar.getState();
                }
                dVar.p(context, this.f35419a, this.f35420b);
                this.f35423e = true;
            }
            b bVar2 = this.f35424f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z15) {
        this.f35423e = z15;
    }

    public void m(boolean z15) {
        this.f35423e = z15;
    }

    public void n(Context context) {
        this.f35425g.p(context, this.f35419a, this.f35420b);
    }
}
