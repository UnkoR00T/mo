package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f12325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f12326b;

    private static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f12327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f12328b = new AtomicInteger(0);

        a(Object obj) {
            this.f12327a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof i;
        }

        final void a() {
            this.f12328b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f12327a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
            ((TextWatcher) this.f12327a).beforeTextChanged(charSequence, i15, i16, i17);
        }

        final void c() {
            this.f12328b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i15, int i16) {
            if (this.f12328b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f12327a).onSpanAdded(spannable, obj, i15, i16);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i15, int i16, int i17, int i18) {
            int i19;
            int i25;
            if (this.f12328b.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i19 = i15;
                    i25 = i17;
                } else {
                    if (i15 > i16) {
                        i15 = 0;
                    }
                    if (i17 > i18) {
                        i19 = i15;
                        i25 = 0;
                    } else {
                        i19 = i15;
                        i25 = i17;
                    }
                }
                ((SpanWatcher) this.f12327a).onSpanChanged(spannable, obj, i19, i16, i25, i18);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i15, int i16) {
            if (this.f12328b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f12327a).onSpanRemoved(spannable, obj, i15, i16);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
            ((TextWatcher) this.f12327a).onTextChanged(charSequence, i15, i16, i17);
        }
    }

    n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f12326b = new ArrayList();
        i6.i.h(cls, "watcherClass cannot be null");
        this.f12325a = cls;
    }

    private void b() {
        for (int i15 = 0; i15 < this.f12326b.size(); i15++) {
            this.f12326b.get(i15).a();
        }
    }

    public static n c(Class<?> cls, CharSequence charSequence) {
        return new n(cls, charSequence);
    }

    private void e() {
        for (int i15 = 0; i15 < this.f12326b.size(); i15++) {
            this.f12326b.get(i15).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i15 = 0; i15 < this.f12326b.size(); i15++) {
            a aVar = this.f12326b.get(i15);
            if (aVar.f12327a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class<?> cls) {
        return this.f12325a == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i15 = 0; i15 < this.f12326b.size(); i15++) {
            this.f12326b.get(i15).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i15, int i16, Class<T> cls) {
        if (!g(cls)) {
            return (T[]) super.getSpans(i15, i16, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i15, i16, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i17 = 0; i17 < aVarArr.length; i17++) {
            tArr[i17] = aVarArr[i17].f12327a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i15, int i16, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i15, i16, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f12326b.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i15, int i16, int i17) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f12326b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i15, i16, i17);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i15, int i16) {
        return new n(this.f12325a, this, i15, i16);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i15, int i16) {
        super.delete(i15, i16);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i15, CharSequence charSequence) {
        super.insert(i15, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i15, int i16, CharSequence charSequence) {
        b();
        super.replace(i15, i16, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i15, CharSequence charSequence, int i16, int i17) {
        super.insert(i15, charSequence, i16, i17);
        return this;
    }

    n(Class<?> cls, CharSequence charSequence, int i15, int i16) {
        super(charSequence, i15, i16);
        this.f12326b = new ArrayList();
        i6.i.h(cls, "watcherClass cannot be null");
        this.f12325a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i15, int i16, CharSequence charSequence, int i17, int i18) {
        b();
        super.replace(i15, i16, charSequence, i17, i18);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c15) {
        super.append(c15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i15, int i16) {
        super.append(charSequence, i15, i16);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i15) {
        super.append(charSequence, obj, i15);
        return this;
    }
}
