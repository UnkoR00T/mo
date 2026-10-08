package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u4 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f29553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Object> f29554b = new ArrayList();

    u4() {
    }

    private final byte[] b() {
        byte[] bArr = new byte[e()];
        c(q4.q(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final u4 clone() {
        Object objClone;
        u4 u4Var = new u4();
        try {
            List<Object> list = this.f29554b;
            if (list == null) {
                u4Var.f29554b = null;
            } else {
                u4Var.f29554b.addAll(list);
            }
            Object obj = this.f29553a;
            if (obj != null) {
                if (obj instanceof w4) {
                    objClone = (w4) ((w4) obj).clone();
                } else if (obj instanceof byte[]) {
                    objClone = ((byte[]) obj).clone();
                } else {
                    int i15 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        u4Var.f29553a = bArr2;
                        while (i15 < bArr.length) {
                            bArr2[i15] = (byte[]) bArr[i15].clone();
                            i15++;
                        }
                    } else if (obj instanceof boolean[]) {
                        objClone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        objClone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        objClone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        objClone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        objClone = ((double[]) obj).clone();
                    } else if (obj instanceof w4[]) {
                        w4[] w4VarArr = (w4[]) obj;
                        w4[] w4VarArr2 = new w4[w4VarArr.length];
                        u4Var.f29553a = w4VarArr2;
                        while (i15 < w4VarArr.length) {
                            w4VarArr2[i15] = (w4) w4VarArr[i15].clone();
                            i15++;
                        }
                    }
                }
                u4Var.f29553a = objClone;
                return u4Var;
            }
            return u4Var;
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    final void c(q4 q4Var) {
        if (this.f29553a != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.f29554b.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
    }

    final int e() {
        if (this.f29553a != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.f29554b.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        it.next();
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        if (this.f29553a != null && u4Var.f29553a != null) {
            throw null;
        }
        List<Object> list2 = this.f29554b;
        if (list2 != null && (list = u4Var.f29554b) != null) {
            return list2.equals(list);
        }
        try {
            return Arrays.equals(b(), u4Var.b());
        } catch (IOException e15) {
            throw new IllegalStateException(e15);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e15) {
            throw new IllegalStateException(e15);
        }
    }
}
