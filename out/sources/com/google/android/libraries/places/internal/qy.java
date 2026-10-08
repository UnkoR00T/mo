package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class qy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final qy f33462d = new qy(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b10 f33463a = new x00();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f33464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f33465c;

    private qy() {
    }

    public static qy a() {
        return f33462d;
    }

    static void i(dy dyVar, u10 u10Var, int i15, Object obj) {
        if (u10Var == u10.f33836m) {
            dyVar.i(i15, 3);
            ((g00) obj).e(dyVar);
            dyVar.i(i15, 4);
            return;
        }
        dyVar.i(i15, u10Var.e());
        v10 v10Var = v10.INT;
        switch (u10Var.ordinal()) {
            case 0:
                dyVar.B(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                dyVar.z(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                dyVar.A(((Long) obj).longValue());
                break;
            case 3:
                dyVar.A(((Long) obj).longValue());
                break;
            case 4:
                dyVar.x(((Integer) obj).intValue());
                break;
            case 5:
                dyVar.B(((Long) obj).longValue());
                break;
            case 6:
                dyVar.z(((Integer) obj).intValue());
                break;
            case 7:
                dyVar.w(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof tx)) {
                    dyVar.C((String) obj);
                } else {
                    dyVar.r((tx) obj);
                }
                break;
            case 9:
                ((g00) obj).e(dyVar);
                break;
            case 10:
                dyVar.v((g00) obj);
                break;
            case 11:
                if (!(obj instanceof tx)) {
                    byte[] bArr = (byte[]) obj;
                    dyVar.s(bArr, 0, bArr.length);
                } else {
                    dyVar.r((tx) obj);
                }
                break;
            case 12:
                dyVar.y(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof cz)) {
                    dyVar.x(((Integer) obj).intValue());
                } else {
                    dyVar.x(((cz) obj).zza());
                }
                break;
            case 14:
                dyVar.z(((Integer) obj).intValue());
                break;
            case 15:
                dyVar.B(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                dyVar.y((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                dyVar.A((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int k(u10 u10Var, int i15, Object obj) {
        int iA;
        int iD;
        int iD2 = dy.d(i15 << 3);
        if (u10Var == u10.f33836m) {
            iD2 += iD2;
        }
        v10 v10Var = v10.INT;
        int iE = 4;
        switch (u10Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iE = 8;
                return iD2 + iE;
            case 1:
                ((Float) obj).getClass();
                return iD2 + iE;
            case 2:
                iE = dy.e(((Long) obj).longValue());
                return iD2 + iE;
            case 3:
                iE = dy.e(((Long) obj).longValue());
                return iD2 + iE;
            case 4:
                iE = dy.e(((Integer) obj).intValue());
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
                if (obj instanceof tx) {
                    iA = ((tx) obj).f();
                    iD = dy.d(iA);
                } else {
                    iA = t10.a((String) obj);
                    iD = dy.d(iA);
                }
                iE = iD + iA;
                return iD2 + iE;
            case 9:
                iE = ((g00) obj).j();
                return iD2 + iE;
            case 10:
                if (obj instanceof pz) {
                    throw null;
                }
                iE = dy.f((g00) obj);
                return iD2 + iE;
            case 11:
                if (obj instanceof tx) {
                    iA = ((tx) obj).f();
                    iD = dy.d(iA);
                } else {
                    iA = ((byte[]) obj).length;
                    iD = dy.d(iA);
                }
                iE = iD + iA;
                return iD2 + iE;
            case 12:
                iE = dy.d(((Integer) obj).intValue());
                return iD2 + iE;
            case 13:
                iE = obj instanceof cz ? dy.e(((cz) obj).zza()) : dy.e(((Integer) obj).intValue());
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
                iE = dy.d((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iD2 + iE;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iE = dy.e((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iD2 + iE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int l(py pyVar, Object obj) {
        u10 u10VarZzb = pyVar.zzb();
        pyVar.zza();
        pyVar.c();
        return k(u10VarZzb, 525004180, obj);
    }

    private static boolean m(Map.Entry entry) {
        py pyVar = (py) entry.getKey();
        if (pyVar.a() != v10.MESSAGE) {
            return true;
        }
        pyVar.c();
        Object value = entry.getValue();
        if (value instanceof i00) {
            return ((i00) value).m();
        }
        if (value instanceof pz) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static Object n(Object obj) {
        if (obj instanceof m00) {
            return ((m00) obj).a();
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void o(Map.Entry entry) {
        py pyVar = (py) entry.getKey();
        Object value = entry.getValue();
        boolean z15 = value instanceof pz;
        pyVar.c();
        if (pyVar.a() != v10.MESSAGE) {
            if (z15) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f33463a.put(pyVar, n(value));
            return;
        }
        Object objE = e(pyVar);
        if (objE == null) {
            this.f33463a.put(pyVar, n(value));
            if (z15) {
                this.f33465c = true;
                return;
            }
            return;
        }
        if (z15) {
            throw null;
        }
        if (!pyVar.u(objE)) {
            pyVar.V(objE, value);
            return;
        }
        f00 f00VarG = ((g00) objE).g();
        pyVar.V(f00VarG, value);
        this.f33463a.put(pyVar, f00VarG.H0());
    }

    private static final int p(Map.Entry entry) {
        py pyVar = (py) entry.getKey();
        Object value = entry.getValue();
        if (pyVar.a() != v10.MESSAGE) {
            return l(pyVar, value);
        }
        pyVar.c();
        pyVar.d();
        if (value instanceof pz) {
            ((py) entry.getKey()).zza();
            throw null;
        }
        ((py) entry.getKey()).zza();
        int iD = dy.d(8);
        return iD + iD + dy.d(16) + dy.d(525004180) + dy.d(24) + dy.f((g00) value);
    }

    public final void b() {
        if (this.f33464b) {
            return;
        }
        b10 b10Var = this.f33463a;
        int iC = b10Var.c();
        for (int i15 = 0; i15 < iC; i15++) {
            Object value = b10Var.d(i15).getValue();
            if (value instanceof az) {
                ((az) value).k();
            }
        }
        Iterator it = b10Var.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof az) {
                ((az) value2).k();
            }
        }
        b10Var.a();
        this.f33464b = true;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final qy clone() {
        qy qyVar = new qy();
        b10 b10Var = this.f33463a;
        int iC = b10Var.c();
        for (int i15 = 0; i15 < iC; i15++) {
            Map.Entry entryD = b10Var.d(i15);
            qyVar.f((py) ((y00) entryD).b(), entryD.getValue());
        }
        for (Map.Entry entry : b10Var.e()) {
            qyVar.f((py) entry.getKey(), entry.getValue());
        }
        qyVar.f33465c = this.f33465c;
        return qyVar;
    }

    public final Iterator d() {
        b10 b10Var = this.f33463a;
        if (b10Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f33465c ? new oz(b10Var.entrySet().iterator()) : b10Var.entrySet().iterator();
    }

    public final Object e(py pyVar) {
        Object obj = this.f33463a.get(pyVar);
        if (obj instanceof pz) {
            throw null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qy) {
            return this.f33463a.equals(((qy) obj).f33463a);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.libraries.places.internal.cz) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.libraries.places.internal.pz) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.libraries.places.internal.py r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.c()
            com.google.android.libraries.places.internal.u10 r0 = r3.zzb()
            r4.getClass()
            com.google.android.libraries.places.internal.u10 r1 = com.google.android.libraries.places.internal.u10.f33827c
            com.google.android.libraries.places.internal.v10 r1 = com.google.android.libraries.places.internal.v10.INT
            com.google.android.libraries.places.internal.v10 r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L44;
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L2c;
                case 7: goto L23;
                case 8: goto L1a;
                default: goto L19;
            }
        L19:
            goto L55
        L1a:
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.g00
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.pz
            if (r0 == 0) goto L55
            goto L48
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.cz
            if (r0 == 0) goto L55
            goto L48
        L2c:
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.tx
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L55
            goto L48
        L35:
            boolean r0 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r0 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r0 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r0 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r0 = r4 instanceof java.lang.Integer
        L46:
            if (r0 == 0) goto L55
        L48:
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.pz
            if (r0 == 0) goto L4f
            r0 = 1
            r2.f33465c = r0
        L4f:
            com.google.android.libraries.places.internal.b10 r0 = r2.f33463a
            r0.put(r3, r4)
            return
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3.zza()
            r1 = 525004180(0x1f4aed94, float:4.2971684E-20)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.libraries.places.internal.u10 r3 = r3.zzb()
            com.google.android.libraries.places.internal.v10 r3 = r3.b()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.qy.f(com.google.android.libraries.places.internal.py, java.lang.Object):void");
    }

    public final boolean g() {
        b10 b10Var = this.f33463a;
        int iC = b10Var.c();
        for (int i15 = 0; i15 < iC; i15++) {
            if (!m(b10Var.d(i15))) {
                return false;
            }
        }
        Iterator it = b10Var.e().iterator();
        while (it.hasNext()) {
            if (!m((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void h(qy qyVar) {
        b10 b10Var = qyVar.f33463a;
        int iC = b10Var.c();
        for (int i15 = 0; i15 < iC; i15++) {
            o(b10Var.d(i15));
        }
        Iterator it = b10Var.e().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f33463a.hashCode();
    }

    public final int j() {
        b10 b10Var = this.f33463a;
        int iC = b10Var.c();
        int iP = 0;
        for (int i15 = 0; i15 < iC; i15++) {
            iP += p(b10Var.d(i15));
        }
        Iterator it = b10Var.e().iterator();
        while (it.hasNext()) {
            iP += p((Map.Entry) it.next());
        }
        return iP;
    }

    private qy(boolean z15) {
        b();
        b();
    }
}
