package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import zj.q;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class i {
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof xf.a);
    }

    public static void c(wf.a.b bVar) {
        bVar.b();
        if (bVar.c() instanceof Spanned) {
            if (!(bVar.c() instanceof Spannable)) {
                bVar.h(SpannableString.valueOf(bVar.c()));
            }
            e((Spannable) bg.a.b(bVar.c()), new q() { // from class: com.google.android.exoplayer2.ui.g
                @Override // zj.q
                public final boolean apply(Object obj) {
                    return i.b(obj);
                }
            });
        }
        d(bVar);
    }

    public static void d(wf.a.b bVar) {
        bVar.j(-3.4028235E38f, PKIFailureInfo.systemUnavail);
        if (bVar.c() instanceof Spanned) {
            if (!(bVar.c() instanceof Spannable)) {
                bVar.h(SpannableString.valueOf(bVar.c()));
            }
            e((Spannable) bg.a.b(bVar.c()), new q() { // from class: com.google.android.exoplayer2.ui.h
                @Override // zj.q
                public final boolean apply(Object obj) {
                    return i.a(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, q<Object> qVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (qVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i15, float f15, int i16, int i17) {
        float f16;
        if (f15 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i15 == 0) {
            f16 = i17;
        } else {
            if (i15 != 1) {
                if (i15 != 2) {
                    return -3.4028235E38f;
                }
                return f15;
            }
            f16 = i16;
        }
        return f15 * f16;
    }
}
