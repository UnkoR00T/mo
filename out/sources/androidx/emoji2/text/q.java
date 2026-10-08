package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes3.dex */
class q implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12335a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spannable f12336b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof h6.f;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.q.b
        boolean a(CharSequence charSequence) {
            return h6.c.a(charSequence) || (charSequence instanceof h6.f);
        }
    }

    q(Spannable spannable) {
        this.f12336b = spannable;
    }

    private void a() {
        Spannable spannable = this.f12336b;
        if (!this.f12335a && c().a(spannable)) {
            this.f12336b = new SpannableString(spannable);
        }
        this.f12335a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f12336b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i15) {
        return this.f12336b.charAt(i15);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f12336b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f12336b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f12336b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f12336b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f12336b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i15, int i16, Class<T> cls) {
        return (T[]) this.f12336b.getSpans(i15, i16, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f12336b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i15, int i16, Class cls) {
        return this.f12336b.nextSpanTransition(i15, i16, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f12336b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i15, int i16, int i17) {
        a();
        this.f12336b.setSpan(obj, i15, i16, i17);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i15, int i16) {
        return this.f12336b.subSequence(i15, i16);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f12336b.toString();
    }

    q(CharSequence charSequence) {
        this.f12336b = new SpannableString(charSequence);
    }
}
