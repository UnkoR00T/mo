package com.google.android.gms.internal.oss_licenses;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f30765c;

    d(String str, UUID uuid, String str2, v vVar) {
        this.f30764b = str;
        this.f30763a = str2;
        this.f30765c = vVar.f30916d == null ? Thread.currentThread() : null;
    }

    public static String b(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // com.google.android.gms.internal.oss_licenses.y
    public final String a() {
        return this.f30763a;
    }

    @Override // com.google.android.gms.internal.oss_licenses.y
    public final String c() {
        return this.f30764b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVarC = j.c();
        y yVar = vVarC.f30914b;
        if (yVar == null) {
            String strC = c();
            StringBuilder sb5 = new StringBuilder(strC.length() + 101);
            sb5.append("Tried to end [");
            sb5.append(strC);
            sb5.append("], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new g(sb5.toString());
        }
        if (this == yVar) {
            if (vVarC.f30916d != null) {
                j.f(vVarC, null, 2);
            } else {
                j.f(vVarC, null, 4);
            }
            this.f30765c = null;
            return;
        }
        String strC2 = c();
        String str = ((d) yVar).f30764b;
        StringBuilder sb6 = new StringBuilder(strC2.length() + 79 + str.length() + 1);
        sb6.append("Tried to end span ");
        sb6.append(strC2);
        sb6.append(", but that span is not the current span. The current span is ");
        sb6.append(str);
        sb6.append(".");
        throw new h(sb6.toString());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    public final String toString() {
        t tVarD;
        l4 l4Var = j.f30794c;
        int i15 = 0;
        int length = 0;
        for (d dVar = this; dVar != null; dVar = null) {
            length += dVar.c().length();
            i15++;
        }
        if (i15 > 250) {
            int i16 = i15 - 1;
            String[] strArr = new String[i15];
            d dVar2 = this;
            while (i16 >= 0) {
                strArr[i16] = dVar2.c();
                dVar2.zzb();
                i16--;
                dVar2 = null;
            }
            r0 r0Var = new r0();
            e1 it = t0.o(strArr).iterator();
            int i17 = 0;
            while (it.hasNext()) {
                r0Var.a(it.next(), Integer.valueOf(i17));
                i17++;
            }
            s0 s0VarB = r0Var.b();
            int i18 = i15 >> 2;
            if (s0VarB.size() > i18) {
                tVarD = null;
            } else {
                int[] iArr = new int[i15 + 1];
                for (int i19 = 0; i19 < i15; i19++) {
                    iArr[i19] = ((Integer) s0VarB.get(strArr[i19])).intValue();
                }
                iArr[i15] = s0VarB.size();
                tVarD = u.a(iArr).d();
                if (tVarD.f30891c * (tVarD.f30890b - tVarD.f30889a) < i18) {
                    tVarD = null;
                }
            }
            String str = "";
            if (tVarD != null) {
                int i25 = tVarD.f30889a;
                String strConcat = i25 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i25))).concat(" -> ") : "";
                int i26 = tVarD.f30890b;
                int i27 = tVarD.f30891c;
                int i28 = ((i26 - i25) * i27) + i25;
                str = String.format(Locale.US, "%s{%s}x%d%s", strConcat, TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i25, i26)), Integer.valueOf(i27), i28 < i15 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i28, i15)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        for (d dVar3 = this; dVar3 != null; dVar3 = null) {
            String strC = dVar3.c();
            length -= strC.length();
            strC.getChars(0, strC.length(), cArr, length);
        }
        return new String(cArr);
    }

    @Override // com.google.android.gms.internal.oss_licenses.y
    public final Thread zza() {
        return this.f30765c;
    }

    @Override // com.google.android.gms.internal.oss_licenses.y
    public final y zzb() {
        return null;
    }
}
