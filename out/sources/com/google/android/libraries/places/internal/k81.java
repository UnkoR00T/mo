package com.google.android.libraries.places.internal;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class k81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f32718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i81 f32719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i81 f32720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32723f;

    private k81(int[] iArr) {
        this.f32718a = iArr;
        i81 i81Var = new i81(-1, -1, null);
        this.f32719b = i81Var;
        this.f32720c = i81Var;
    }

    static k81 a(int[] iArr) {
        k81 k81Var = new k81(iArr);
        for (int i15 = 0; i15 < iArr.length; i15++) {
            k81Var.f32723f++;
            int[] iArr2 = k81Var.f32718a;
            int i16 = iArr2[i15];
            while (true) {
                i81 i81Var = null;
                while (true) {
                    if (k81Var.f32723f <= 0) {
                        break;
                    }
                    if (k81Var.f32722e == 0) {
                        break;
                    }
                    int i17 = ((i81) k81Var.f32720c.f32539d.get(Integer.valueOf(iArr2[k81Var.f32721d]))).f32536a;
                    int i18 = k81Var.f32722e;
                    if (iArr2[i17 + i18] == i16) {
                        if (i81Var != null) {
                            i81Var.f32538c = k81Var.f32720c;
                        }
                        k81Var.f32722e = i18 + 1;
                        k81Var.b();
                        break;
                    }
                    i81 i81Var2 = (i81) k81Var.f32720c.f32539d.get(Integer.valueOf(iArr2[k81Var.f32721d]));
                    int i19 = i81Var2.f32536a;
                    i81 i81Var3 = new i81(i19, (k81Var.f32722e + i19) - 1, null);
                    k81Var.f32720c.f32539d.put(Integer.valueOf(iArr2[k81Var.f32721d]), i81Var3);
                    Map map = i81Var3.f32539d;
                    int i25 = i81Var3.f32537b + 1;
                    map.put(Integer.valueOf(iArr2[i25]), i81Var2);
                    i81Var2.f32536a = i25;
                    if (i81Var != null) {
                        i81Var.f32538c = i81Var3;
                    }
                    map.put(Integer.valueOf(i16), new i81(i15, 1073741824, null));
                    k81Var.f32723f--;
                    k81Var.c();
                    i81Var = i81Var3;
                }
                Map map2 = k81Var.f32720c.f32539d;
                Integer numValueOf = Integer.valueOf(i16);
                if (map2.containsKey(numValueOf)) {
                    if (i81Var != null) {
                        i81Var.f32538c = k81Var.f32720c;
                    }
                    k81Var.f32721d = i15;
                    k81Var.f32722e++;
                    k81Var.b();
                    break;
                }
                k81Var.f32720c.f32539d.put(numValueOf, new i81(i15, 1073741824, null));
                if (i81Var != null) {
                    i81Var.f32538c = k81Var.f32720c;
                }
                k81Var.f32723f--;
                k81Var.c();
            }
        }
        return k81Var;
    }

    private final void e(i81 i81Var, StringBuilder sb5) {
        for (i81 i81Var2 : i81Var.f32539d.values()) {
            sb5.append("  ");
            sb5.append(i81Var);
            sb5.append(" -> ");
            sb5.append(i81Var2);
            sb5.append(" [label=\"");
            int[] iArr = this.f32718a;
            sb5.append(Arrays.toString(Arrays.copyOfRange(iArr, i81Var2.f32536a, Math.min(iArr.length, i81Var2.f32537b + 1))));
            sb5.append("\"]\n");
            e(i81Var2, sb5);
        }
    }

    private final boolean f(int i15, int i16, int i17, int i18) {
        if (i15 >= 0 && i17 >= 0) {
            int[] iArr = this.f32718a;
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
        if (this.f32722e == 0) {
            return;
        }
        Map map = this.f32720c.f32539d;
        int[] iArr = this.f32718a;
        i81 i81Var = (i81) map.get(Integer.valueOf(iArr[this.f32721d]));
        while (true) {
            int i15 = (i81Var.f32537b - i81Var.f32536a) + 1;
            int i16 = this.f32722e;
            if (i15 > i16) {
                return;
            }
            int i17 = this.f32721d + i15;
            this.f32721d = i17;
            this.f32720c = i81Var;
            int i18 = i16 - i15;
            this.f32722e = i18;
            if (i18 > 0) {
                i81Var = (i81) i81Var.f32539d.get(Integer.valueOf(iArr[i17]));
            }
        }
    }

    final void c() {
        i81 i81Var = this.f32720c.f32538c;
        if (i81Var != null) {
            this.f32720c = i81Var;
        } else {
            this.f32720c = this.f32719b;
            int i15 = this.f32722e;
            if (i15 > 0) {
                this.f32722e = i15 - 1;
            }
            if (this.f32723f > 0) {
                this.f32721d++;
            }
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    public final j81 d() {
        int i15;
        int i16;
        g81 g81Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        i81 i81Var = this.f32719b;
        g81 g81Var2 = new g81(i81Var, 0, -1, -1, null);
        arrayDeque.push(g81Var2);
        while (!arrayDeque.isEmpty()) {
            g81 g81Var3 = (g81) arrayDeque.pop();
            for (i81 i81Var2 : g81Var3.f32377d.f32539d.values()) {
                int i17 = g81Var3.f32375b;
                int i18 = g81Var3.f32376c;
                int i19 = i81Var2.f32536a;
                int i25 = i81Var2.f32537b;
                if (f(i17, i18, i19, i25)) {
                    g81Var = new g81(i81Var2, g81Var3.f32374a + 1, i17, i18, null);
                } else {
                    if (i81Var2.f32539d.isEmpty()) {
                        int i26 = i81Var2.f32536a;
                        if (f(i17, i18, i26, (i26 + i18) - i17)) {
                            g81Var = new g81(i81Var2, g81Var3.f32374a + 1, i17, i18, null);
                        }
                    }
                    g81Var = new g81(i81Var2, 1, i81Var2.f32536a, i25, null);
                }
                if (g81Var2.f32374a < g81Var.f32374a) {
                    g81Var2 = g81Var;
                }
                arrayDeque.push(g81Var);
            }
        }
        int[] iArr = this.f32718a;
        int iMin = Math.min(iArr.length, g81Var2.f32376c + 1);
        int i27 = 0;
        loop2: while (true) {
            i15 = g81Var2.f32375b;
            i16 = iMin - i15;
            i81Var = (i81) i81Var.f32539d.get(Integer.valueOf(iArr[(i27 % i16) + i15]));
            if (i81Var == null) {
                break;
            }
            for (int i28 = i81Var.f32536a; i28 < i81Var.f32537b + 1 && i28 < iArr.length; i28++) {
                if (iArr[(i27 % i16) + i15] != iArr[i28]) {
                    break loop2;
                }
                i27++;
            }
        }
        return new j81(i15, iMin, i27 / i16);
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder("digraph {\n");
        e(this.f32719b, sb5);
        sb5.append("}");
        return sb5.toString();
    }
}
