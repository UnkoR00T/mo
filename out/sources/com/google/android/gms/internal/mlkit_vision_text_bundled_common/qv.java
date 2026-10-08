package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class qv {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final qv f30563d = new qv(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final gy f30564a = new yx();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30566c;

    private qv() {
    }

    static int a(vy vyVar, int i15, Object obj) {
        int iG;
        int iD;
        int iD2 = gv.d(i15 << 3);
        if (vyVar == vy.f30666m) {
            kw.d((jx) obj);
            iD2 += iD2;
        }
        wy wyVar = wy.INT;
        int iE = 4;
        switch (vyVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iE = 8;
                return iD2 + iE;
            case 1:
                ((Float) obj).getClass();
                return iD2 + iE;
            case 2:
                iE = gv.e(((Long) obj).longValue());
                return iD2 + iE;
            case 3:
                iE = gv.e(((Long) obj).longValue());
                return iD2 + iE;
            case 4:
                iE = gv.e(((Integer) obj).intValue());
                return iD2 + iE;
            case 5:
                ((Long) obj).getClass();
                iE = 8;
                return iD2 + iE;
            case 6:
                ((Integer) obj).getClass();
                return iD2 + iE;
            case 7:
                ((Boolean) obj).getClass();
                iE = 1;
                return iD2 + iE;
            case 8:
                if (obj instanceof yu) {
                    iG = ((yu) obj).g();
                    iD = gv.d(iG);
                    iE = iD + iG;
                } else {
                    iE = gv.c((String) obj);
                }
                return iD2 + iE;
            case 9:
                iE = ((jx) obj).b();
                return iD2 + iE;
            case 10:
                if (obj instanceof rw) {
                    iG = ((rw) obj).a();
                    iD = gv.d(iG);
                    iE = iD + iG;
                } else {
                    iE = gv.a((jx) obj);
                }
                return iD2 + iE;
            case 11:
                if (obj instanceof yu) {
                    iG = ((yu) obj).g();
                    iD = gv.d(iG);
                } else {
                    iG = ((byte[]) obj).length;
                    iD = gv.d(iG);
                }
                iE = iD + iG;
                return iD2 + iE;
            case 12:
                iE = gv.d(((Integer) obj).intValue());
                return iD2 + iE;
            case 13:
                iE = obj instanceof dw ? gv.e(((dw) obj).m()) : gv.e(((Integer) obj).intValue());
                return iD2 + iE;
            case 14:
                ((Integer) obj).getClass();
                return iD2 + iE;
            case 15:
                ((Long) obj).getClass();
                iE = 8;
                return iD2 + iE;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iE = gv.d((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iD2 + iE;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iE = gv.e((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iD2 + iE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int b(pv pvVar, Object obj) {
        vy vyVarZ = pvVar.Z();
        pvVar.m();
        pvVar.K1();
        return a(vyVarZ, 32149011, obj);
    }

    public static qv e() {
        return f30563d;
    }

    static void k(gv gvVar, vy vyVar, int i15, Object obj) {
        if (vyVar == vy.f30666m) {
            jx jxVar = (jx) obj;
            kw.d(jxVar);
            gvVar.B(i15, 3);
            jxVar.j(gvVar);
            gvVar.B(i15, 4);
            return;
        }
        gvVar.B(i15, vyVar.m());
        wy wyVar = wy.INT;
        switch (vyVar.ordinal()) {
            case 0:
                gvVar.r(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                gvVar.p(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                gvVar.F(((Long) obj).longValue());
                break;
            case 3:
                gvVar.F(((Long) obj).longValue());
                break;
            case 4:
                gvVar.t(((Integer) obj).intValue());
                break;
            case 5:
                gvVar.r(((Long) obj).longValue());
                break;
            case 6:
                gvVar.p(((Integer) obj).intValue());
                break;
            case 7:
                gvVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof yu)) {
                    gvVar.A((String) obj);
                } else {
                    gvVar.n((yu) obj);
                }
                break;
            case 9:
                ((jx) obj).j(gvVar);
                break;
            case 10:
                gvVar.w((jx) obj);
                break;
            case 11:
                if (!(obj instanceof yu)) {
                    byte[] bArr = (byte[]) obj;
                    gvVar.l(bArr, 0, bArr.length);
                } else {
                    gvVar.n((yu) obj);
                }
                break;
            case 12:
                gvVar.D(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof dw)) {
                    gvVar.t(((Integer) obj).intValue());
                } else {
                    gvVar.t(((dw) obj).m());
                }
                break;
            case 14:
                gvVar.p(((Integer) obj).intValue());
                break;
            case 15:
                gvVar.r(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                gvVar.D((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                gvVar.F((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static Object n(Object obj) {
        if (obj instanceof ox) {
            return ((ox) obj).r();
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

    private final void o(Map.Entry entry) {
        pv pvVar = (pv) entry.getKey();
        Object value = entry.getValue();
        boolean z15 = value instanceof rw;
        pvVar.K1();
        if (pvVar.b0() != wy.MESSAGE) {
            if (z15) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f30564a.put(pvVar, n(value));
            return;
        }
        Object objF = f(pvVar);
        if (objF != null) {
            if (z15) {
                throw null;
            }
            this.f30564a.put(pvVar, objF instanceof ox ? pvVar.N2((ox) objF, (ox) value) : pvVar.S1(((jx) objF).g(), (jx) value).L());
        } else {
            this.f30564a.put(pvVar, n(value));
            if (z15) {
                this.f30566c = true;
            }
        }
    }

    private static boolean p(Map.Entry entry) {
        pv pvVar = (pv) entry.getKey();
        if (pvVar.b0() != wy.MESSAGE) {
            return true;
        }
        pvVar.K1();
        Object value = entry.getValue();
        if (value instanceof kx) {
            return ((kx) value).c();
        }
        if (value instanceof rw) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int q(Map.Entry entry) {
        int i15;
        int iD;
        int iD2;
        pv pvVar = (pv) entry.getKey();
        Object value = entry.getValue();
        if (pvVar.b0() != wy.MESSAGE) {
            return b(pvVar, value);
        }
        pvVar.K1();
        pvVar.x1();
        if (value instanceof rw) {
            ((pv) entry.getKey()).m();
            int iD3 = gv.d(8);
            i15 = iD3 + iD3;
            iD = gv.d(16) + gv.d(32149011);
            int iD4 = gv.d(24);
            int iA = ((rw) value).a();
            iD2 = iD4 + gv.d(iA) + iA;
        } else {
            ((pv) entry.getKey()).m();
            int iD5 = gv.d(8);
            i15 = iD5 + iD5;
            iD = gv.d(16) + gv.d(32149011);
            iD2 = gv.d(24) + gv.a((jx) value);
        }
        return i15 + iD + iD2;
    }

    public final int c() {
        int iC = this.f30564a.c();
        int iQ = 0;
        for (int i15 = 0; i15 < iC; i15++) {
            iQ += q(this.f30564a.g(i15));
        }
        Iterator it = this.f30564a.d().iterator();
        while (it.hasNext()) {
            iQ += q((Map.Entry) it.next());
        }
        return iQ;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final qv clone() {
        qv qvVar = new qv();
        int iC = this.f30564a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            Map.Entry entryG = this.f30564a.g(i15);
            qvVar.j((pv) ((zx) entryG).b(), entryG.getValue());
        }
        for (Map.Entry entry : this.f30564a.d()) {
            qvVar.j((pv) entry.getKey(), entry.getValue());
        }
        qvVar.f30566c = this.f30566c;
        return qvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qv) {
            return this.f30564a.equals(((qv) obj).f30564a);
        }
        return false;
    }

    public final Object f(pv pvVar) {
        Object obj = this.f30564a.get(pvVar);
        if (obj instanceof rw) {
            throw null;
        }
        return obj;
    }

    public final Iterator g() {
        if (this.f30564a.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f30566c ? new qw(this.f30564a.entrySet().iterator()) : this.f30564a.entrySet().iterator();
    }

    public final void h() {
        if (this.f30565b) {
            return;
        }
        int iC = this.f30564a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            Map.Entry entryG = this.f30564a.g(i15);
            if (entryG.getValue() instanceof bw) {
                ((bw) entryG.getValue()).h();
            }
        }
        this.f30564a.a();
        this.f30565b = true;
    }

    public final int hashCode() {
        return this.f30564a.hashCode();
    }

    public final void i(qv qvVar) {
        int iC = qvVar.f30564a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            o(qvVar.f30564a.g(i15));
        }
        Iterator it = qvVar.f30564a.d().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.dw) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.rw) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.google.android.gms.internal.mlkit_vision_text_bundled_common.pv r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.K1()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.vy r0 = r3.Z()
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.kw.f30477b
            r4.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.vy r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.vy.f30657c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wy r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.wy.INT
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wy r0 = r0.b()
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
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.jx
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.rw
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.dw
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
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
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.rw
            if (r0 == 0) goto L51
            r0 = 1
            r2.f30566c = r0
        L51:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.gy r0 = r2.f30564a
            r0.put(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3.m()
            r1 = 32149011(0x1ea8e13, float:8.616189E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.vy r3 = r3.Z()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wy r3 = r3.b()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.qv.j(com.google.android.gms.internal.mlkit_vision_text_bundled_common.pv, java.lang.Object):void");
    }

    public final boolean l() {
        return this.f30565b;
    }

    public final boolean m() {
        int iC = this.f30564a.c();
        for (int i15 = 0; i15 < iC; i15++) {
            if (!p(this.f30564a.g(i15))) {
                return false;
            }
        }
        Iterator it = this.f30564a.d().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private qv(boolean z15) {
        h();
        h();
    }
}
