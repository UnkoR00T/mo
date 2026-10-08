package com.google.android.gms.internal.oss_licenses;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f30900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f30901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f30902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30905f;

    private u(int[] iArr) {
        this.f30900a = iArr;
        s sVar = new s(-1, -1, null);
        this.f30901b = sVar;
        this.f30902c = sVar;
    }

    static u a(int[] iArr) {
        u uVar = new u(iArr);
        for (int i15 = 0; i15 < iArr.length; i15++) {
            uVar.f30905f++;
            int[] iArr2 = uVar.f30900a;
            int i16 = iArr2[i15];
            while (true) {
                s sVar = null;
                while (true) {
                    if (uVar.f30905f <= 0) {
                        break;
                    }
                    if (uVar.f30904e == 0) {
                        break;
                    }
                    int i17 = ((s) uVar.f30902c.f30885d.get(Integer.valueOf(iArr2[uVar.f30903d]))).f30882a;
                    int i18 = uVar.f30904e;
                    if (iArr2[i17 + i18] == i16) {
                        if (sVar != null) {
                            sVar.f30884c = uVar.f30902c;
                        }
                        uVar.f30904e = i18 + 1;
                        uVar.b();
                        break;
                    }
                    s sVar2 = (s) uVar.f30902c.f30885d.get(Integer.valueOf(iArr2[uVar.f30903d]));
                    int i19 = sVar2.f30882a;
                    s sVar3 = new s(i19, (uVar.f30904e + i19) - 1, null);
                    uVar.f30902c.f30885d.put(Integer.valueOf(iArr2[uVar.f30903d]), sVar3);
                    Map map = sVar3.f30885d;
                    int i25 = sVar3.f30883b + 1;
                    map.put(Integer.valueOf(iArr2[i25]), sVar2);
                    sVar2.f30882a = i25;
                    if (sVar != null) {
                        sVar.f30884c = sVar3;
                    }
                    map.put(Integer.valueOf(i16), new s(i15, 1073741824, null));
                    uVar.f30905f--;
                    uVar.c();
                    sVar = sVar3;
                }
                Map map2 = uVar.f30902c.f30885d;
                Integer numValueOf = Integer.valueOf(i16);
                if (map2.containsKey(numValueOf)) {
                    if (sVar != null) {
                        sVar.f30884c = uVar.f30902c;
                    }
                    uVar.f30903d = i15;
                    uVar.f30904e++;
                    uVar.b();
                    break;
                }
                uVar.f30902c.f30885d.put(numValueOf, new s(i15, 1073741824, null));
                if (sVar != null) {
                    sVar.f30884c = uVar.f30902c;
                }
                uVar.f30905f--;
                uVar.c();
            }
        }
        return uVar;
    }

    private final void e(s sVar, StringBuilder sb5) {
        for (s sVar2 : sVar.f30885d.values()) {
            sb5.append("  ");
            sb5.append(sVar);
            sb5.append(" -> ");
            sb5.append(sVar2);
            sb5.append(" [label=\"");
            int[] iArr = this.f30900a;
            sb5.append(Arrays.toString(Arrays.copyOfRange(iArr, sVar2.f30882a, Math.min(iArr.length, sVar2.f30883b + 1))));
            sb5.append("\"]\n");
            e(sVar2, sb5);
        }
    }

    private final boolean f(int i15, int i16, int i17, int i18) {
        if (i15 >= 0 && i17 >= 0) {
            int[] iArr = this.f30900a;
            int length = iArr.length;
            int iMin = Math.min(length, i16);
            if (iMin - i15 == Math.min(length, i18) - i17) {
                for (int i19 = i15; i19 <= iMin; i19++) {
                    if (iArr[i19] != iArr[(i17 + i19) - i15]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    final void b() {
        if (this.f30904e == 0) {
            return;
        }
        Map map = this.f30902c.f30885d;
        int[] iArr = this.f30900a;
        s sVar = (s) map.get(Integer.valueOf(iArr[this.f30903d]));
        while (true) {
            int i15 = (sVar.f30883b - sVar.f30882a) + 1;
            int i16 = this.f30904e;
            if (i15 > i16) {
                return;
            }
            int i17 = this.f30903d + i15;
            this.f30903d = i17;
            this.f30902c = sVar;
            int i18 = i16 - i15;
            this.f30904e = i18;
            if (i18 > 0) {
                sVar = (s) sVar.f30885d.get(Integer.valueOf(iArr[i17]));
            }
        }
    }

    final void c() {
        s sVar = this.f30902c.f30884c;
        if (sVar != null) {
            this.f30902c = sVar;
        } else {
            this.f30902c = this.f30901b;
            int i15 = this.f30904e;
            if (i15 > 0) {
                this.f30904e = i15 - 1;
            }
            if (this.f30905f > 0) {
                this.f30903d++;
            }
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    public final t d() {
        int i15;
        int i16;
        r rVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        s sVar = this.f30901b;
        r rVar2 = new r(sVar, 0, -1, -1, null);
        arrayDeque.push(rVar2);
        while (!arrayDeque.isEmpty()) {
            r rVar3 = (r) arrayDeque.pop();
            for (s sVar2 : rVar3.f30878d.f30885d.values()) {
                int i17 = rVar3.f30876b;
                int i18 = rVar3.f30877c;
                int i19 = sVar2.f30882a;
                int i25 = sVar2.f30883b;
                if (f(i17, i18, i19, i25)) {
                    rVar = new r(sVar2, rVar3.f30875a + 1, i17, i18, null);
                } else {
                    if (sVar2.f30885d.isEmpty()) {
                        int i26 = sVar2.f30882a;
                        if (f(i17, i18, i26, (i26 + i18) - i17)) {
                            rVar = new r(sVar2, rVar3.f30875a + 1, i17, i18, null);
                        }
                    }
                    rVar = new r(sVar2, 1, sVar2.f30882a, i25, null);
                }
                if (rVar2.f30875a < rVar.f30875a) {
                    rVar2 = rVar;
                }
                arrayDeque.push(rVar);
            }
        }
        int[] iArr = this.f30900a;
        int iMin = Math.min(iArr.length, rVar2.f30877c + 1);
        int i27 = 0;
        loop2: while (true) {
            i15 = rVar2.f30876b;
            i16 = iMin - i15;
            sVar = (s) sVar.f30885d.get(Integer.valueOf(iArr[(i27 % i16) + i15]));
            if (sVar == null) {
                break;
            }
            for (int i28 = sVar.f30882a; i28 < sVar.f30883b + 1 && i28 < iArr.length; i28++) {
                if (iArr[(i27 % i16) + i15] != iArr[i28]) {
                    break loop2;
                }
                i27++;
            }
        }
        return new t(i15, iMin, i27 / i16);
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder("digraph {\n");
        e(this.f30901b, sb5);
        sb5.append("}");
        return sb5.toString();
    }
}
