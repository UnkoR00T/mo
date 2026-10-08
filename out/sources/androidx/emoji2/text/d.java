package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes3.dex */
class d implements e.InterfaceC0261e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f12241b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f12242a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f12242a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f12241b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.InterfaceC0261e
    public boolean a(CharSequence charSequence, int i15, int i16, int i17) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i15 < i16) {
            sbB.append(charSequence.charAt(i15));
            i15++;
        }
        return x5.i.a(this.f12242a, sbB.toString());
    }
}
