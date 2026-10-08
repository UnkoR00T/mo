package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b3 f29646d = new b3(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u5 f29647a = new n5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29649c;

    private b3() {
    }

    public static int a(a3 a3Var, Object obj) {
        int iH;
        int iA;
        m6 m6VarC = a3Var.c();
        int iZza = a3Var.zza();
        a3Var.i();
        int iA2 = r2.a(iZza << 3);
        if (m6VarC == m6.f29775l) {
            byte[] bArr = t3.f30242b;
            if (((r4) obj) instanceof u1) {
                throw null;
            }
            iA2 += iA2;
        }
        n6 n6Var = n6.INT;
        int iB = 4;
        switch (m6VarC.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 1:
                ((Float) obj).getClass();
                return iA2 + iB;
            case 2:
                iB = r2.b(((Long) obj).longValue());
                return iA2 + iB;
            case 3:
                iB = r2.b(((Long) obj).longValue());
                return iA2 + iB;
            case 4:
                iB = r2.b(((Integer) obj).intValue());
                return iA2 + iB;
            case 5:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 6:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case 7:
                ((Boolean) obj).getClass();
                iB = 1;
                return iA2 + iB;
            case 8:
                if (obj instanceof j2) {
                    iH = ((j2) obj).h();
                    iA = r2.a(iH);
                    iB = iA + iH;
                } else {
                    iB = r2.C((String) obj);
                }
                return iA2 + iB;
            case 9:
                iB = ((r4) obj).u();
                return iA2 + iB;
            case 10:
                if (obj instanceof a4) {
                    iH = ((a4) obj).a();
                    iA = r2.a(iH);
                    iB = iA + iH;
                } else {
                    iB = r2.A((r4) obj);
                }
                return iA2 + iB;
            case 11:
                if (obj instanceof j2) {
                    iH = ((j2) obj).h();
                    iA = r2.a(iH);
                } else {
                    iH = ((byte[]) obj).length;
                    iA = r2.a(iH);
                }
                iB = iA + iH;
                return iA2 + iB;
            case 12:
                iB = r2.a(((Integer) obj).intValue());
                return iA2 + iB;
            case 13:
                iB = obj instanceof n3 ? r2.b(((n3) obj).zza()) : r2.b(((Integer) obj).intValue());
                return iA2 + iB;
            case 14:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case 15:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iB = r2.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iA2 + iB;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iB = r2.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iA2 + iB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static b3 d() {
        return f29646d;
    }

    private static Object l(Object obj) {
        if (obj instanceof w4) {
            return ((w4) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void m(Map.Entry entry) {
        a3 a3Var = (a3) entry.getKey();
        Object value = entry.getValue();
        boolean z15 = value instanceof a4;
        a3Var.i();
        if (a3Var.d() != n6.MESSAGE) {
            if (z15) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f29647a.put(a3Var, l(value));
            return;
        }
        Object objE = e(a3Var);
        if (objE != null) {
            if (z15) {
                throw null;
            }
            this.f29647a.put(a3Var, objE instanceof w4 ? a3Var.Z3((w4) objE, (w4) value) : a3Var.o3(((r4) objE).y(), (r4) value).k());
        } else {
            this.f29647a.put(a3Var, l(value));
            if (z15) {
                this.f29649c = true;
            }
        }
    }

    private static boolean n(Map.Entry entry) {
        a3 a3Var = (a3) entry.getKey();
        if (a3Var.d() != n6.MESSAGE) {
            return true;
        }
        a3Var.i();
        Object value = entry.getValue();
        if (value instanceof s4) {
            return ((s4) value).c();
        }
        if (value instanceof a4) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int o(Map.Entry entry) {
        int i15;
        int iA;
        int iA2;
        a3 a3Var = (a3) entry.getKey();
        Object value = entry.getValue();
        if (a3Var.d() != n6.MESSAGE) {
            return a(a3Var, value);
        }
        a3Var.i();
        a3Var.f();
        if (value instanceof a4) {
            int iZza = ((a3) entry.getKey()).zza();
            int iA3 = r2.a(8);
            i15 = iA3 + iA3;
            iA = r2.a(16) + r2.a(iZza);
            int iA4 = r2.a(24);
            int iA5 = ((a4) value).a();
            iA2 = iA4 + r2.a(iA5) + iA5;
        } else {
            int iZza2 = ((a3) entry.getKey()).zza();
            int iA6 = r2.a(8);
            i15 = iA6 + iA6;
            iA = r2.a(16) + r2.a(iZza2);
            iA2 = r2.a(24) + r2.A((r4) value);
        }
        return i15 + iA + iA2;
    }

    public final int b() {
        int iC = this.f29647a.c();
        int iO = 0;
        for (int i15 = 0; i15 < iC; i15++) {
            iO += o(this.f29647a.g(i15));
        }
        Iterator it = this.f29647a.d().iterator();
        while (it.hasNext()) {
            iO += o((Map.Entry) it.next());
        }
        return iO;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b3 clone() {
        b3 b3Var = new b3();
        int iC = this.f29647a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            Map.Entry entryG = this.f29647a.g(i15);
            b3Var.i((a3) ((o5) entryG).b(), entryG.getValue());
        }
        for (Map.Entry entry : this.f29647a.d()) {
            b3Var.i((a3) entry.getKey(), entry.getValue());
        }
        b3Var.f29649c = this.f29649c;
        return b3Var;
    }

    public final Object e(a3 a3Var) {
        Object obj = this.f29647a.get(a3Var);
        if (obj instanceof a4) {
            throw null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b3) {
            return this.f29647a.equals(((b3) obj).f29647a);
        }
        return false;
    }

    public final Iterator f() {
        if (this.f29647a.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f29649c ? new z3(this.f29647a.entrySet().iterator()) : this.f29647a.entrySet().iterator();
    }

    public final void g() {
        if (this.f29648b) {
            return;
        }
        int iC = this.f29647a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            Map.Entry entryG = this.f29647a.g(i15);
            if (entryG.getValue() instanceof l3) {
                ((l3) entryG.getValue()).A();
            }
        }
        this.f29647a.a();
        this.f29648b = true;
    }

    public final void h(b3 b3Var) {
        int iC = b3Var.f29647a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            m(b3Var.f29647a.g(i15));
        }
        Iterator it = b3Var.f29647a.d().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f29647a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.n3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.a4) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.google.android.gms.internal.mlkit_vision_barcode_bundled.a3 r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.i()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.m6 r0 = r3.c()
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.t3.f30242b
            r4.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.m6 r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.m6.f29766b
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.n6 r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.n6.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.n6 r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.r4
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.a4
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.n3
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.a4
            if (r0 == 0) goto L51
            r0 = 1
            r2.f29649c = r0
        L51:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.u5 r0 = r2.f29647a
            r0.put(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.m6 r3 = r3.c()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.n6 r3 = r3.b()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b3.i(com.google.android.gms.internal.mlkit_vision_barcode_bundled.a3, java.lang.Object):void");
    }

    public final boolean j() {
        return this.f29648b;
    }

    public final boolean k() {
        int iC = this.f29647a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            if (!n(this.f29647a.g(i15))) {
                return false;
            }
        }
        Iterator it = this.f29647a.d().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private b3(boolean z15) {
        g();
        g();
    }
}
