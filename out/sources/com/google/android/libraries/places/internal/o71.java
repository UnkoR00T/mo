package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
abstract class o71 implements n81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f33163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread f33166d;

    o71(String str, UUID uuid, String str2, l81 l81Var) {
        this.f33165c = (String) zj.p.q(str);
        this.f33163a = uuid;
        this.f33164b = str2;
        l81Var.getClass();
        this.f33166d = Thread.currentThread();
    }

    public static String b(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final UUID a() {
        return this.f33163a;
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final String c() {
        return this.f33164b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f71 f71Var = y71.f34350b;
        zj.p.q(this);
        l81 l81VarD = y71.d();
        n81 n81Var = l81VarD.f32805b;
        if (n81Var == null) {
            String strD = d();
            StringBuilder sb5 = new StringBuilder(String.valueOf(strD).length() + 101);
            sb5.append("Tried to end [");
            sb5.append(strD);
            sb5.append("], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new v71(sb5.toString());
        }
        if (this == n81Var) {
            y71.c(l81VarD, null);
            this.f33166d = null;
            return;
        }
        String strD2 = d();
        String strD3 = n81Var.d();
        StringBuilder sb6 = new StringBuilder(String.valueOf(strD2).length() + 79 + String.valueOf(strD3).length() + 1);
        sb6.append("Tried to end span ");
        sb6.append(strD2);
        sb6.append(", but that span is not the current span. The current span is ");
        sb6.append(strD3);
        sb6.append(".");
        throw new w71(sb6.toString());
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final String d() {
        return this.f33165c;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    public final String toString() {
        j81 j81VarD;
        f71 f71Var = y71.f34350b;
        int i15 = 0;
        int length = 0;
        for (o71 o71Var = this; o71Var != null; o71Var = null) {
            length += o71Var.d().length();
            i15++;
        }
        if (i15 > 250) {
            int i16 = i15 - 1;
            String[] strArr = new String[i15];
            o71 o71Var2 = this;
            while (i16 >= 0) {
                strArr[i16] = o71Var2.d();
                o71Var2.zzb();
                i16--;
                o71Var2 = null;
            }
            ak.p0.a aVarA = ak.p0.a();
            ak.h2 it = ak.u0.w(strArr).iterator();
            int i17 = 0;
            while (it.hasNext()) {
                aVarA.g(it.next(), Integer.valueOf(i17));
                i17++;
            }
            ak.p0 p0VarD = aVarA.d();
            int i18 = i15 >> 2;
            if (p0VarD.size() > i18) {
                j81VarD = null;
            } else {
                int[] iArr = new int[i15 + 1];
                for (int i19 = 0; i19 < i15; i19++) {
                    iArr[i19] = ((Integer) p0VarD.get(strArr[i19])).intValue();
                }
                iArr[i15] = p0VarD.size();
                j81VarD = k81.a(iArr).d();
                if (j81VarD.f32650c * (j81VarD.f32649b - j81VarD.f32648a) < i18) {
                    j81VarD = null;
                }
            }
            String str = "";
            if (j81VarD != null) {
                int i25 = j81VarD.f32648a;
                String strConcat = i25 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i25))).concat(" -> ") : "";
                int i26 = j81VarD.f32649b;
                int i27 = j81VarD.f32650c;
                int i28 = ((i26 - i25) * i27) + i25;
                str = String.format(Locale.US, "%s{%s}x%d%s", strConcat, TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i25, i26)), Integer.valueOf(i27), i28 < i15 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i28, i15)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        for (o71 o71Var3 = this; o71Var3 != null; o71Var3 = null) {
            String strD = o71Var3.d();
            length -= strD.length();
            strD.getChars(0, strD.length(), cArr, length);
        }
        return new String(cArr);
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final Thread zza() {
        return this.f33166d;
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final n81 zzb() {
        return null;
    }
}
