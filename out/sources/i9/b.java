package i9;

import ak.n0;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o8.e0;
import o8.f0;
import o8.w0;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.b0;
import w7.c0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f90335a = o0.p0("OpusHead");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f90336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f90337b;

        public a(long j15, long j16) {
            this.f90336a = j15;
            this.f90337b = j16;
        }

        static /* synthetic */ long a(a aVar) {
            return aVar.f90337b;
        }

        static /* synthetic */ long b(a aVar) {
            return aVar.f90336a;
        }
    }

    /* JADX INFO: renamed from: i9.b$b, reason: collision with other inner class name */
    private static final class C2145b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f90339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f90340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f90341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f90342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c0 f90343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c0 f90344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f90345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f90346i;

        public C2145b(c0 c0Var, c0 c0Var2, boolean z15) throws t7.x {
            this.f90344g = c0Var;
            this.f90343f = c0Var2;
            this.f90342e = z15;
            c0Var2.f0(12);
            this.f90338a = c0Var2.U();
            c0Var.f0(12);
            this.f90346i = c0Var.U();
            o8.s.a(c0Var.z() == 1, "first_chunk must be 1");
            this.f90339b = -1;
        }

        public boolean a() {
            int i15 = this.f90339b + 1;
            this.f90339b = i15;
            if (i15 == this.f90338a) {
                return false;
            }
            this.f90341d = this.f90342e ? this.f90343f.X() : this.f90343f.S();
            if (this.f90339b == this.f90345h) {
                this.f90340c = this.f90344g.U();
                this.f90344g.g0(4);
                int i16 = this.f90346i - 1;
                this.f90346i = i16;
                this.f90345h = i16 > 0 ? this.f90344g.U() - 1 : -1;
            }
            return true;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f90347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f90348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f90349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f90350d;

        public c(String str, byte[] bArr, long j15, long j16) {
            this.f90347a = str;
            this.f90348b = bArr;
            this.f90349c = j15;
            this.f90350d = j16;
        }

        static /* synthetic */ String a(c cVar) {
            return cVar.f90347a;
        }

        static /* synthetic */ long b(c cVar) {
            return cVar.f90350d;
        }

        static /* synthetic */ long c(c cVar) {
            return cVar.f90349c;
        }

        static /* synthetic */ byte[] d(c cVar) {
            return cVar.f90348b;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f90351a;

        public d(g gVar) {
            this.f90351a = gVar;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f90352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f90353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f90354c;

        public e(long j15, long j16, String str) {
            this.f90352a = j15;
            this.f90353b = j16;
            this.f90354c = str;
        }
    }

    private interface f {
        int a();

        int b();

        int c();
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f90355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f90356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f90357c;

        public g(boolean z15, boolean z16, boolean z17) {
            this.f90355a = z15;
            this.f90356b = z16;
            this.f90357c = z17;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x[] f90358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t7.p f90359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f90360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f90361d = 0;

        public h(int i15) {
            this.f90358a = new x[i15];
        }
    }

    static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f90362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f90363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c0 f90364c;

        public i(x7.d.c cVar, t7.p pVar) {
            c0 c0Var = cVar.f217154b;
            this.f90364c = c0Var;
            c0Var.f0(12);
            int iU = c0Var.U();
            if ("audio/raw".equals(pVar.f188381p)) {
                int iG0 = o0.g0(pVar.J, pVar.H);
                if (iU % iG0 != 0) {
                    w7.t.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iG0 + ", stsz sample size: " + iU);
                    iU = iG0;
                }
            }
            this.f90362a = iU == 0 ? -1 : iU;
            this.f90363b = c0Var.U();
        }

        @Override // i9.b.f
        public int a() {
            int i15 = this.f90362a;
            return i15 == -1 ? this.f90364c.U() : i15;
        }

        @Override // i9.b.f
        public int b() {
            return this.f90362a;
        }

        @Override // i9.b.f
        public int c() {
            return this.f90363b;
        }
    }

    static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f90365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f90366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f90367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f90368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f90369e;

        public j(x7.d.c cVar) {
            c0 c0Var = cVar.f217154b;
            this.f90365a = c0Var;
            c0Var.f0(12);
            this.f90367c = c0Var.U() & GF2Field.MASK;
            this.f90366b = c0Var.U();
        }

        @Override // i9.b.f
        public int a() {
            int i15 = this.f90367c;
            if (i15 == 8) {
                return this.f90365a.Q();
            }
            if (i15 == 16) {
                return this.f90365a.Y();
            }
            int i16 = this.f90368d;
            this.f90368d = i16 + 1;
            if (i16 % 2 != 0) {
                return this.f90369e & 15;
            }
            int iQ = this.f90365a.Q();
            this.f90369e = iQ;
            return (iQ & 240) >> 4;
        }

        @Override // i9.b.f
        public int b() {
            return -1;
        }

        @Override // i9.b.f
        public int c() {
            return this.f90366b;
        }
    }

    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f90370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f90371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f90372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f90373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f90374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f90375f;

        public k(int i15, long j15, int i16, int i17, int i18, int i19) {
            this.f90370a = i15;
            this.f90371b = j15;
            this.f90372c = i16;
            this.f90373d = i17;
            this.f90374e = i18;
            this.f90375f = i19;
        }
    }

    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f90376a;

        public l(d dVar) {
            this.f90376a = dVar;
        }

        public boolean b() {
            d dVar = this.f90376a;
            return dVar != null && dVar.f90351a.f90355a && this.f90376a.f90351a.f90356b;
        }
    }

    private static x A(c0 c0Var, int i15, int i16, String str) {
        int i17;
        int i18;
        int i19 = i15 + 8;
        while (true) {
            byte[] bArr = null;
            if (i19 - i15 >= i16) {
                return null;
            }
            c0Var.f0(i19);
            int iZ = c0Var.z();
            if (c0Var.z() == 1952804451) {
                int iQ = q(c0Var.z());
                c0Var.g0(1);
                if (iQ == 0) {
                    c0Var.g0(1);
                    i18 = 0;
                    i17 = 0;
                } else {
                    int iQ2 = c0Var.Q();
                    i17 = iQ2 & 15;
                    i18 = (iQ2 & 240) >> 4;
                }
                boolean z15 = c0Var.Q() == 1;
                int iQ3 = c0Var.Q();
                byte[] bArr2 = new byte[16];
                c0Var.u(bArr2, 0, 16);
                if (z15 && iQ3 == 0) {
                    int iQ4 = c0Var.Q();
                    bArr = new byte[iQ4];
                    c0Var.u(bArr, 0, iQ4);
                }
                return new x(z15, str, iQ3, bArr2, i18, i17, bArr);
            }
            i19 += iZ;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r26v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v10 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v6 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v8 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: i9.b$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: i9.b$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: i9.b$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v9 ??, new type: i9.b$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v6 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v11 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v30 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v32 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v19 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v21 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static i9.z B(i9.w r43, x7.d.b r44, o8.e0 r45, boolean r46) {
        /*
            Method dump skipped, instruction units count: 1657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.b.B(i9.w, x7.d$b, o8.e0, boolean):i9.z");
    }

    private static d C(c0 c0Var, int i15, int i16) throws t7.x {
        c0Var.f0(i15 + 8);
        int iG = c0Var.g();
        while (iG - i15 < i16) {
            c0Var.f0(iG);
            int iZ = c0Var.z();
            o8.s.a(iZ > 0, "childAtomSize must be positive");
            if (c0Var.z() == 1937011305) {
                c0Var.g0(4);
                int iQ = c0Var.Q();
                return new d(new g((iQ & 1) == 1, (iQ & 2) == 2, (iQ & 8) == 8));
            }
            iG += iZ;
        }
        return null;
    }

    private static h D(c0 c0Var, k kVar, String str, t7.l lVar, boolean z15) throws t7.x {
        c0Var.f0(12);
        int iZ = c0Var.z();
        h hVar = new h(iZ);
        for (int i15 = 0; i15 < iZ; i15++) {
            int iG = c0Var.g();
            int iZ2 = c0Var.z();
            o8.s.a(iZ2 > 0, "childAtomSize must be positive");
            int iZ3 = c0Var.z();
            if (iZ3 == 1635148593 || iZ3 == 1635148595 || iZ3 == 1701733238 || iZ3 == 1831958048 || iZ3 == 1836070006 || iZ3 == 1752589105 || iZ3 == 1751479857 || iZ3 == 1987470129 || iZ3 == 1987471665 || iZ3 == 1932670515 || iZ3 == 1211250227 || iZ3 == 1748121139 || iZ3 == 1987063864 || iZ3 == 1987063865 || iZ3 == 1635135537 || iZ3 == 1685479798 || iZ3 == 1685479729 || iZ3 == 1685481573 || iZ3 == 1685481521 || iZ3 == 1634760241 || iZ3 == 1684108849) {
                L(c0Var, iZ3, iG, iZ2, kVar.f90370a, str, kVar.f90373d, lVar, hVar, i15);
            } else if (iZ3 == 1836069985 || iZ3 == 1701733217 || iZ3 == 1633889587 || iZ3 == 1700998451 || iZ3 == 1633889588 || iZ3 == 1835823201 || iZ3 == 1685353315 || iZ3 == 1685353317 || iZ3 == 1685353320 || iZ3 == 1685353324 || iZ3 == 1685353336 || iZ3 == 1935764850 || iZ3 == 1935767394 || iZ3 == 1819304813 || iZ3 == 1936684916 || iZ3 == 1953984371 || iZ3 == 778924082 || iZ3 == 778924083 || iZ3 == 1835557169 || iZ3 == 1835560241 || iZ3 == 1634492771 || iZ3 == 1634492791 || iZ3 == 1970037111 || iZ3 == 1332770163 || iZ3 == 1716281667 || iZ3 == 1767992678 || iZ3 == 1768973165 || iZ3 == 1718641517) {
                i(c0Var, iZ3, iG, iZ2, kVar.f90370a, str, z15, lVar, hVar, i15);
            } else if (iZ3 == 1414810956 || iZ3 == 1954034535 || iZ3 == 2004251764 || iZ3 == 1937010800 || iZ3 == 1664495672 || iZ3 == 1836070003) {
                h hVar2 = hVar;
                E(c0Var, iZ3, iG, iZ2, kVar, str, hVar2);
                hVar = hVar2;
            } else if (iZ3 == 1835365492) {
                v(c0Var, iZ3, iG, kVar.f90370a, hVar);
            } else if (iZ3 == 1667329389) {
                hVar.f90359b = new t7.p.b().j0(kVar.f90370a).A0("application/x-camera-motion").Q();
            }
            c0Var.f0(iG + iZ2);
        }
        return hVar;
    }

    private static void E(c0 c0Var, int i15, int i16, int i17, k kVar, String str, h hVar) {
        c0Var.f0(i16 + 16);
        String str2 = "application/ttml+xml";
        n0 n0VarE = null;
        long j15 = Long.MAX_VALUE;
        if (i15 != 1414810956) {
            if (i15 == 1954034535) {
                int i18 = i17 - 16;
                byte[] bArr = new byte[i18];
                c0Var.u(bArr, 0, i18);
                n0VarE = n0.E(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i15 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i15 == 1937010800) {
                j15 = 0;
            } else if (i15 == 1664495672) {
                hVar.f90361d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i15 != 1836070003) {
                    throw new IllegalStateException();
                }
                int iG = c0Var.g();
                c0Var.g0(4);
                if (c0Var.z() == 1702061171) {
                    c cVarN = n(c0Var, iG);
                    if (cVarN.f90348b == null || cVarN.f90348b.length != 64) {
                        return;
                    }
                    n0VarE = n0.E(o0.p0(d(cVarN.f90348b, kVar.f90374e, kVar.f90375f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            hVar.f90359b = new t7.p.b().j0(kVar.f90370a).A0(str2).o0(str).E0(j15).l0(n0VarE).Q();
        }
    }

    private static k F(c0 c0Var) {
        long j15;
        c0Var.f0(8);
        int iQ = q(c0Var.z());
        c0Var.g0(iQ == 0 ? 8 : 16);
        int iZ = c0Var.z();
        c0Var.g0(4);
        int iG = c0Var.g();
        int i15 = iQ == 0 ? 4 : 8;
        int i16 = 0;
        while (true) {
            j15 = -9223372036854775807L;
            if (i16 >= i15) {
                c0Var.g0(i15);
                break;
            }
            if (c0Var.f()[iG + i16] != -1) {
                long jS = iQ == 0 ? c0Var.S() : c0Var.X();
                if (jS == 0) {
                    break;
                }
                j15 = jS;
                break;
            }
            i16++;
        }
        c0Var.g0(10);
        int i17 = 0;
        long j16 = j15;
        int iY = c0Var.Y();
        c0Var.g0(4);
        int iZ2 = c0Var.z();
        int iZ3 = c0Var.z();
        c0Var.g0(4);
        int iZ4 = c0Var.z();
        int iZ5 = c0Var.z();
        if (iZ2 == 0 && iZ3 == 65536 && ((iZ4 == -65536 || iZ4 == 65536) && iZ5 == 0)) {
            i17 = 90;
        } else if (iZ2 == 0 && iZ3 == -65536 && ((iZ4 == 65536 || iZ4 == -65536) && iZ5 == 0)) {
            i17 = 270;
        } else if ((iZ2 == -65536 || iZ2 == 65536) && iZ3 == 0 && iZ4 == 0 && iZ5 == -65536) {
            i17 = 180;
        }
        int i18 = i17;
        c0Var.g0(16);
        short sM = c0Var.M();
        c0Var.g0(2);
        return new k(iZ, j16, iY, i18, sM, c0Var.M());
    }

    public static w G(x7.d.b bVar, x7.d.c cVar, long j15, t7.l lVar, boolean z15, boolean z16) throws t7.x {
        long[] jArr;
        long[] jArr2;
        t7.p pVarQ;
        x7.d.b bVarD;
        Pair<long[], long[]> pairM;
        x7.d.b bVar2 = (x7.d.b) zj.p.q(bVar.d(1835297121));
        int iF = f(r(((x7.d.c) zj.p.q(bVar2.e(1751411826))).f217154b));
        if (iF == -1) {
            return null;
        }
        k kVarF = F(((x7.d.c) zj.p.q(bVar.e(1953196132))).f217154b);
        long j16 = j15 == -9223372036854775807L ? kVarF.f90371b : j15;
        long j17 = w(cVar.f217154b).f217159c;
        long jU0 = j16 != -9223372036854775807L ? o0.U0(j16, 1000000L, j17) : -9223372036854775807L;
        x7.d.b bVar3 = (x7.d.b) zj.p.q(((x7.d.b) zj.p.q(bVar2.d(1835626086))).d(1937007212));
        e eVarT = t(((x7.d.c) zj.p.q(bVar2.e(1835296868))).f217154b);
        x7.d.c cVarE = bVar3.e(1937011556);
        if (cVarE == null) {
            w7.t.h("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
            return null;
        }
        h hVarD = D(cVarE.f217154b, kVarF, eVarT.f90354c, lVar, z16);
        if (z15 || (bVarD = bVar.d(1701082227)) == null || (pairM = m(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM.first;
            jArr2 = (long[]) pairM.second;
            jArr = jArr3;
        }
        if (hVarD.f90359b == null) {
            return null;
        }
        if (kVarF.f90372c != 0) {
            x7.c cVar2 = new x7.c(kVarF.f90372c);
            t7.p.b bVarB = hVarD.f90359b.b();
            t7.v vVar = hVarD.f90359b.f188377l;
            pVarQ = bVarB.s0(vVar != null ? vVar.a(cVar2) : new t7.v(cVar2)).Q();
        } else {
            pVarQ = hVarD.f90359b;
        }
        return new w(kVarF.f90370a, iF, eVarT.f90352a, j17, jU0, eVarT.f90353b, pVarQ, hVarD.f90361d, hVarD.f90358a, hVarD.f90360c, jArr, jArr2);
    }

    public static List<z> H(x7.d.b bVar, e0 e0Var, long j15, t7.l lVar, boolean z15, boolean z16, zj.g<w, w> gVar, boolean z17) {
        w wVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < bVar.f217153d.size(); i15++) {
            x7.d.b bVar2 = bVar.f217153d.get(i15);
            if (bVar2.f217150a == 1953653099 && (wVarApply = gVar.apply(G(bVar2, (x7.d.c) zj.p.q(bVar.e(1836476516)), j15, lVar, z15, z16))) != null) {
                arrayList.add(B(wVarApply, (x7.d.b) zj.p.q(((x7.d.b) zj.p.q(((x7.d.b) zj.p.q(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), e0Var, z17));
            }
        }
        return arrayList;
    }

    public static t7.v I(x7.d.c cVar) {
        c0 c0Var = cVar.f217154b;
        c0Var.f0(8);
        t7.v vVar = new t7.v(new t7.v.a[0]);
        while (c0Var.a() >= 8) {
            int iG = c0Var.g();
            int iZ = c0Var.z();
            int iZ2 = c0Var.z();
            if (iZ2 == 1835365473) {
                c0Var.f0(iG);
                vVar = vVar.b(J(c0Var, iG + iZ));
            } else if (iZ2 == 1936553057) {
                c0Var.f0(iG);
                vVar = vVar.b(u.b(c0Var, iG + iZ));
            } else if (iZ2 == -1451722374) {
                vVar = vVar.b(M(c0Var));
            }
            c0Var.f0(iG + iZ);
        }
        return vVar;
    }

    private static t7.v J(c0 c0Var, int i15) {
        c0Var.g0(8);
        g(c0Var);
        while (c0Var.g() < i15) {
            int iG = c0Var.g();
            int iZ = c0Var.z();
            if (c0Var.z() == 1768715124) {
                c0Var.f0(iG);
                return s(c0Var, iG + iZ);
            }
            c0Var.f0(iG + iZ);
        }
        return null;
    }

    static l K(c0 c0Var, int i15, int i16) throws t7.x {
        c0Var.f0(i15 + 8);
        int iG = c0Var.g();
        d dVarC = null;
        while (iG - i15 < i16) {
            c0Var.f0(iG);
            int iZ = c0Var.z();
            o8.s.a(iZ > 0, "childAtomSize must be positive");
            if (c0Var.z() == 1702454643) {
                dVarC = C(c0Var, iG, iZ);
            }
            iG += iZ;
        }
        if (dVarC == null) {
            return null;
        }
        return new l(dVarC);
    }

    /* JADX WARN: Code duplicated, block: B:218:0x053e  */
    private static void L(c0 c0Var, int i15, int i16, int i17, int i18, String str, int i19, t7.l lVar, h hVar, int i25) throws t7.x {
        String str2;
        byte[] bArr;
        String str3;
        String str4;
        t7.l lVar2;
        byte[] bArrArray;
        int i26;
        String str5;
        int iJ;
        int i27;
        x7.g.k kVar;
        int i28;
        List<byte[]> list;
        String str6;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39 = i16;
        int i45 = i17;
        t7.l lVarB = lVar;
        h hVar2 = hVar;
        c0Var.f0(i39 + 16);
        c0Var.g0(16);
        int iY = c0Var.Y();
        int iY2 = c0Var.Y();
        c0Var.g0(50);
        int iG = c0Var.g();
        int iIntValue = i15;
        if (iIntValue == 1701733238) {
            Pair<Integer, x> pairZ = z(c0Var, i39, i45);
            if (pairZ != null) {
                iIntValue = ((Integer) pairZ.first).intValue();
                lVarB = lVarB == null ? null : lVarB.b(((x) pairZ.second).f90497b);
                hVar2.f90358a[i25] = (x) pairZ.second;
            }
            c0Var.f0(iG);
        }
        String str7 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str2 = "video/mpeg";
        } else {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fX = 1.0f;
        int i46 = 8;
        int i47 = 8;
        ByteBuffer byteBufferA = null;
        x7.a aVarA = null;
        List<byte[]> listE = null;
        String strF = null;
        byte[] bArrY = null;
        int i48 = -1;
        int i49 = -1;
        int i55 = -1;
        int i56 = -1;
        int i57 = -1;
        int i58 = -1;
        int i59 = -1;
        int iK = -1;
        a aVarK = null;
        c cVarN = null;
        x7.g.k kVar2 = null;
        boolean z15 = false;
        while (true) {
            if (iG - i39 >= i45) {
                bArr = null;
                break;
            }
            c0Var.f0(iG);
            int iG2 = c0Var.g();
            int iZ = c0Var.z();
            if (iZ == 0 && c0Var.g() - i16 == i45) {
                bArr = null;
                break;
            }
            o8.s.a(iZ > 0, "childAtomSize must be positive");
            int iZ2 = c0Var.z();
            if (iZ2 == 1635148611) {
                o8.s.a(str2 == null, null);
                c0Var.f0(iG2 + 8);
                o8.d dVarB = o8.d.b(c0Var);
                List<byte[]> list2 = dVarB.f143033a;
                hVar2.f90360c = dVarB.f143034b;
                if (!z15) {
                    fX = dVarB.f143043k;
                }
                String str8 = dVarB.f143044l;
                int i65 = dVarB.f143042j;
                int i66 = dVarB.f143039g;
                int i67 = dVarB.f143040h;
                listE = list2;
                int i68 = dVarB.f143041i;
                int i69 = dVarB.f143037e;
                i26 = iG;
                str5 = str7;
                iJ = i66;
                i27 = i67;
                iK = i68;
                str6 = "video/avc";
                i47 = dVarB.f143038f;
                strF = str8;
                i49 = i65;
                kVar = kVar2;
                i28 = i69;
            } else {
                i26 = iG;
                if (iZ2 == 1752589123) {
                    o8.s.a(str2 == null, null);
                    c0Var.f0(iG2 + 8);
                    f0 f0VarA = f0.a(c0Var);
                    List<byte[]> list3 = f0VarA.f143071a;
                    hVar2.f90360c = f0VarA.f143072b;
                    if (!z15) {
                        fX = f0VarA.f143084n;
                    }
                    int i75 = f0VarA.f143085o;
                    int i76 = f0VarA.f143073c;
                    String str9 = f0VarA.f143086p;
                    int i77 = f0VarA.f143083m;
                    listE = list3;
                    if (i77 != -1) {
                        i48 = i77;
                    }
                    int i78 = f0VarA.f143076f;
                    int i79 = f0VarA.f143077g;
                    int i85 = f0VarA.f143080j;
                    int i86 = f0VarA.f143081k;
                    int i87 = f0VarA.f143082l;
                    int i88 = f0VarA.f143078h;
                    int i89 = f0VarA.f143079i;
                    kVar = f0VarA.f143087q;
                    str6 = "video/hevc";
                    str5 = str7;
                    iJ = i85;
                    i27 = i86;
                    iK = i87;
                    i28 = i88;
                    i49 = i75;
                    i55 = i76;
                    i57 = i79;
                    i56 = i78;
                    i47 = i89;
                    strF = str9;
                } else {
                    str5 = str7;
                    if (iZ2 == 1818785347) {
                        o8.s.a("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                        x7.g.k kVar3 = kVar2;
                        o8.s.a(kVar3 != null && kVar3.f217215b.size() >= 2, "must have at least two layers");
                        c0Var.f0(iG2 + 8);
                        f0 f0VarC = f0.c(c0Var, (x7.g.k) zj.p.q(kVar3));
                        o8.s.a(hVar2.f90360c == f0VarC.f143072b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i95 = f0VarC.f143080j;
                        int i96 = i58;
                        if (i95 != -1) {
                            o8.s.a(i96 == i95, "colorSpace must be the same for both views");
                        }
                        int i97 = f0VarC.f143081k;
                        int i98 = i59;
                        if (i97 != -1) {
                            o8.s.a(i98 == i97, "colorRange must be the same for both views");
                        }
                        int i99 = f0VarC.f143082l;
                        if (i99 != -1) {
                            int i100 = iK;
                            i38 = i100;
                            o8.s.a(i100 == i99, "colorTransfer must be the same for both views");
                        } else {
                            i38 = iK;
                        }
                        o8.s.a(i46 == f0VarC.f143078h, "bitdepthLuma must be the same for both views");
                        o8.s.a(i47 == f0VarC.f143079i, "bitdepthChroma must be the same for both views");
                        List<byte[]> listK = listE;
                        if (listK != null) {
                            listK = n0.s().j(listK).j(f0VarC.f143071a).k();
                        } else {
                            o8.s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        i28 = i46;
                        str6 = "video/mv-hevc";
                        i27 = i98;
                        iJ = i96;
                        iK = i38;
                        strF = f0VarC.f143086p;
                        kVar = kVar3;
                        listE = listK;
                    } else {
                        List<byte[]> listL = listE;
                        iJ = i58;
                        i27 = i59;
                        int i101 = iK;
                        x7.g.k kVar4 = kVar2;
                        if (iZ2 == 1987470147) {
                            o8.s.a(str2 == null, null);
                            c0Var.f0(iG2 + 8);
                            w0 w0VarA = w0.a(c0Var);
                            List<byte[]> list4 = w0VarA.f143226a;
                            hVar2.f90360c = w0VarA.f143227b;
                            String str10 = w0VarA.f143228c;
                            i47 = w0VarA.f143229d;
                            i28 = i47;
                            kVar = kVar4;
                            lVarB = lVarB;
                            listE = list4;
                            strF = str10;
                            str6 = "video/vvc";
                            iIntValue = iIntValue;
                            iK = i101;
                            i49 = 16;
                        } else if (iZ2 == 1986361461) {
                            l lVarK = K(c0Var, iG2, iZ);
                            if (lVarK == null || lVarK.f90376a == null) {
                                i37 = i48;
                                i48 = i37;
                            } else if (kVar4 == null || kVar4.f217215b.size() < 2) {
                                i37 = i48;
                                if (i37 == -1) {
                                    i48 = lVarK.f90376a.f90351a.f90357c ? 5 : 4;
                                } else {
                                    i48 = i37;
                                }
                            } else {
                                o8.s.a(lVarK.b(), "both eye views must be marked as available");
                                o8.s.a(!lVarK.f90376a.f90351a.f90357c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i37 = i48;
                                i48 = i37;
                            }
                            kVar = kVar4;
                            lVarB = lVarB;
                            i28 = i46;
                            listE = listL;
                            str6 = str2;
                            iIntValue = iIntValue;
                            iK = i101;
                        } else {
                            int i102 = i48;
                            kVar = kVar4;
                            if (iZ2 == 1685480259 || iZ2 == 1685485123 || iZ2 == 1685485379) {
                                lVarB = lVarB;
                                i28 = i46;
                                list = listL;
                                str6 = str2;
                                iIntValue = iIntValue;
                                i47 = i47;
                                i29 = iJ;
                                i35 = i101;
                                aVarA = x7.a.a(c0Var);
                            } else if (iZ2 == 1987076931) {
                                o8.s.a(str2 == null, null);
                                String str11 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                c0Var.f0(iG2 + 12);
                                byte bQ = (byte) c0Var.Q();
                                byte bQ2 = (byte) c0Var.Q();
                                int iQ = c0Var.Q();
                                i47 = iQ >> 4;
                                iIntValue = iIntValue;
                                byte b15 = (byte) ((iQ >> 1) & 7);
                                if (str11.equals("video/x-vnd.on2.vp9")) {
                                    listL = w7.i.l(bQ, bQ2, (byte) i47, b15);
                                }
                                boolean z16 = (iQ & 1) != 0;
                                int iQ2 = c0Var.Q();
                                int iQ3 = c0Var.Q();
                                int iJ2 = t7.g.j(iQ2);
                                int i103 = z16 ? 1 : 2;
                                iK = t7.g.k(iQ3);
                                lVarB = lVarB;
                                i28 = i47;
                                i27 = i103;
                                iJ = iJ2;
                                str6 = str11;
                                listE = listL;
                                kVar = kVar;
                                i48 = i102;
                            } else {
                                iIntValue = iIntValue;
                                if (iZ2 == 1635135811) {
                                    int i104 = iZ - 8;
                                    byte[] bArr2 = new byte[i104];
                                    c0Var.u(bArr2, 0, i104);
                                    listE = n0.E(bArr2);
                                    c0Var.f0(iG2 + 8);
                                    t7.g gVarJ = j(c0Var);
                                    int i105 = gVarJ.f188194e;
                                    int i106 = gVarJ.f188195f;
                                    int i107 = gVarJ.f188190a;
                                    int i108 = gVarJ.f188191b;
                                    iK = gVarJ.f188192c;
                                    i28 = i105;
                                    i47 = i106;
                                    iJ = i107;
                                    i27 = i108;
                                    str6 = "video/av01";
                                } else if (iZ2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(c0Var.M());
                                    byteBuffer.putShort(c0Var.M());
                                    byteBufferA = byteBuffer;
                                    i28 = i46;
                                    listE = listL;
                                    str6 = str2;
                                    iK = i101;
                                } else if (iZ2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sM = c0Var.M();
                                    short sM2 = c0Var.M();
                                    short sM3 = c0Var.M();
                                    str6 = str2;
                                    short sM4 = c0Var.M();
                                    short sM5 = c0Var.M();
                                    int i109 = i47;
                                    short sM6 = c0Var.M();
                                    i28 = i46;
                                    short sM7 = c0Var.M();
                                    short sM8 = c0Var.M();
                                    long jS = c0Var.S();
                                    long jS2 = c0Var.S();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sM5);
                                    byteBuffer2.putShort(sM6);
                                    byteBuffer2.putShort(sM);
                                    byteBuffer2.putShort(sM2);
                                    byteBuffer2.putShort(sM3);
                                    byteBuffer2.putShort(sM4);
                                    byteBuffer2.putShort(sM7);
                                    byteBuffer2.putShort(sM8);
                                    byteBuffer2.putShort((short) (jS / 10000));
                                    byteBuffer2.putShort((short) (jS2 / 10000));
                                    byteBufferA = byteBuffer2;
                                    i47 = i109;
                                    iK = i101;
                                    listE = listL;
                                } else {
                                    lVarB = lVarB;
                                    i28 = i46;
                                    list = listL;
                                    str6 = str2;
                                    i47 = i47;
                                    if (iZ2 == 1681012275) {
                                        o8.s.a(str6 == null, null);
                                        str6 = str5;
                                    } else if (iZ2 == 1702061171) {
                                        o8.s.a(str6 == null, null);
                                        cVarN = n(c0Var, iG2);
                                        String str12 = cVarN.f90347a;
                                        byte[] bArr3 = cVarN.f90348b;
                                        listE = bArr3 != null ? n0.E(bArr3) : list;
                                        str6 = str12;
                                        kVar = kVar;
                                        i47 = i47;
                                        iK = i101;
                                        i48 = i102;
                                    } else if (iZ2 == 1651798644) {
                                        aVarK = k(c0Var, iG2);
                                    } else {
                                        if (iZ2 == 1885434736) {
                                            fX = x(c0Var, iG2);
                                            kVar = kVar;
                                            i47 = i47;
                                            iK = i101;
                                            listE = list;
                                            z15 = true;
                                        } else if (iZ2 == 1937126244) {
                                            bArrY = y(c0Var, iG2, iZ);
                                        } else if (iZ2 == 1936995172) {
                                            int iQ4 = c0Var.Q();
                                            c0Var.g0(3);
                                            if (iQ4 != 0) {
                                                i36 = i102;
                                            } else {
                                                int iQ5 = c0Var.Q();
                                                if (iQ5 != 0) {
                                                    i36 = 1;
                                                    if (iQ5 != 1) {
                                                        if (iQ5 == 2) {
                                                            i36 = 2;
                                                        } else if (iQ5 != 3) {
                                                            i36 = i102;
                                                        } else {
                                                            i36 = 3;
                                                        }
                                                    }
                                                } else {
                                                    i36 = 0;
                                                }
                                            }
                                            kVar = kVar;
                                            i47 = i47;
                                            iK = i101;
                                            listE = list;
                                            i48 = i36;
                                        } else {
                                            if (iZ2 == 1634760259) {
                                                int i110 = iZ - 12;
                                                byte[] bArr4 = new byte[i110];
                                                c0Var.f0(iG2 + 12);
                                                c0Var.u(bArr4, 0, i110);
                                                strF = w7.i.f(bArr4);
                                                listE = n0.E(bArr4);
                                                t7.g gVarH = h(new c0(bArr4));
                                                int i111 = gVarH.f188194e;
                                                int i112 = gVarH.f188195f;
                                                int i113 = gVarH.f188190a;
                                                int i114 = gVarH.f188191b;
                                                iK = gVarH.f188192c;
                                                i28 = i111;
                                                i47 = i112;
                                                iJ = i113;
                                                i27 = i114;
                                                str6 = "video/apv";
                                                kVar = kVar;
                                            } else {
                                                i29 = iJ;
                                                if (iZ2 == 1668246642) {
                                                    i35 = i101;
                                                    if (i29 == -1 && i35 == -1) {
                                                        int iZ3 = c0Var.z();
                                                        if (iZ3 == 1852009592 || iZ3 == 1852009571) {
                                                            int iY3 = c0Var.Y();
                                                            int iY4 = c0Var.Y();
                                                            c0Var.g0(2);
                                                            boolean z17 = iZ == 19 && (c0Var.Q() & 128) != 0;
                                                            iJ = t7.g.j(iY3);
                                                            i27 = z17 ? 1 : 2;
                                                            kVar = kVar;
                                                            i47 = i47;
                                                            listE = list;
                                                            iK = t7.g.k(iY4);
                                                        } else {
                                                            w7.t.h("BoxParsers", "Unsupported color type: " + x7.d.a(iZ3));
                                                        }
                                                    }
                                                } else {
                                                    i35 = i101;
                                                }
                                            }
                                        }
                                        i48 = i102;
                                    }
                                    iK = i101;
                                    listE = list;
                                    i48 = i102;
                                }
                                i48 = i102;
                            }
                            iJ = i29;
                            i47 = i47;
                            listE = list;
                            iK = i35;
                            kVar = kVar;
                            i48 = i102;
                        }
                    }
                    iG = i26 + iZ;
                    i45 = i17;
                    hVar2 = hVar;
                    str2 = str6;
                    iIntValue = iIntValue;
                    i46 = i28;
                    str7 = str5;
                    i58 = iJ;
                    i59 = i27;
                    lVarB = lVarB;
                    kVar2 = kVar;
                    i39 = i16;
                }
            }
            iG = i26 + iZ;
            i45 = i17;
            hVar2 = hVar;
            str2 = str6;
            iIntValue = iIntValue;
            i46 = i28;
            str7 = str5;
            i58 = iJ;
            i59 = i27;
            lVarB = lVarB;
            kVar2 = kVar;
            i39 = i16;
        }
        if (aVarA != 0) {
            str3 = aVarA.f217144c;
            str4 = "video/dolby-vision";
        } else {
            str3 = strF;
        }
        if (str4 == null) {
            str4 = str2;
            return;
        }
        str4 = str2;
        t7.p.b bVarO0 = new t7.p.b().j0(i18).A0(str4).V(str3).F0(iY).i0(iY2).c0(i56).b0(i57).v0(fX).z0(i19).x0(bArrY).D0(i48).l0(listE).q0(i49).r0(i55).d0(lVar2).o0(str);
        t7.g.b bVarE = new t7.g.b().d(i58).c(i59).e(iK);
        if (byteBufferA != null) {
            lVar2 = lVarB;
            bArrArray = byteBufferA.array();
        } else {
            lVar2 = lVarB;
            bArrArray = bArr;
        }
        t7.p.b bVarW = bVarO0.W(bVarE.f(bArrArray).g(i46).b(i47).a());
        if (aVarK != null) {
            bVarW.T(ek.g.m(aVarK.f90336a)).u0(ek.g.m(aVarK.f90337b));
        } else if (cVarN != null) {
            bVarW.T(ek.g.m(cVarN.f90349c)).u0(ek.g.m(cVarN.f90350d));
        }
        hVar.f90359b = bVarW.Q();
    }

    private static t7.v M(c0 c0Var) {
        short sM = c0Var.M();
        c0Var.g0(2);
        String strN = c0Var.N(sM);
        int iMax = Math.max(strN.lastIndexOf(43), strN.lastIndexOf(45));
        try {
            return new t7.v(new x7.e(Float.parseFloat(strN.substring(0, iMax)), Float.parseFloat(strN.substring(iMax, strN.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int N(int i15) {
        int i16 = (i15 >> 16) & GF2Field.MASK;
        int i17 = ((i15 >> 8) & GF2Field.MASK) - 128;
        int i18 = (i15 & GF2Field.MASK) - 128;
        return o0.o(i16 + ((i18 * 17790) / 10000), 0, GF2Field.MASK) | (o0.o(((i17 * 14075) / 10000) + i16, 0, GF2Field.MASK) << 16) | (o0.o((i16 - ((i18 * 3455) / 10000)) - ((i17 * 7169) / 10000), 0, GF2Field.MASK) << 8);
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j15, long j16, long j17) {
        int length = jArr.length - 1;
        return jArr[0] <= j16 && j16 < jArr[o0.o(4, 0, length)] && jArr[o0.o(jArr.length - 4, 0, length)] < j17 && j17 <= j15 + 2;
    }

    private static int c(c0 c0Var, int i15, int i16, int i17) throws t7.x {
        int iG = c0Var.g();
        o8.s.a(iG >= i16, null);
        while (iG - i16 < i17) {
            c0Var.f0(iG);
            int iZ = c0Var.z();
            o8.s.a(iZ > 0, "childAtomSize must be positive");
            if (c0Var.z() == i15) {
                return iG;
            }
            iG += iZ;
        }
        return -1;
    }

    private static String d(byte[] bArr, int i15, int i16) {
        zj.p.w(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i17 = 0; i17 < bArr.length - 3; i17 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(N(ek.g.i(bArr[i17], bArr[i17 + 1], bArr[i17 + 2], bArr[i17 + 3])))));
        }
        return "size: " + i15 + "x" + i16 + "\npalette: " + zj.i.h(", ").e(arrayList) + "\n";
    }

    private static String e(int i15) {
        char[] cArr = {(char) (((i15 >> 10) & 31) + 96), (char) (((i15 >> 5) & 31) + 96), (char) ((i15 & 31) + 96)};
        for (int i16 = 0; i16 < 3; i16++) {
            char c15 = cArr[i16];
            if (c15 < 'a' || c15 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int f(int i15) {
        if (i15 == 1936684398) {
            return 1;
        }
        if (i15 == 1986618469) {
            return 2;
        }
        if (i15 == 1952807028 || i15 == 1935832172 || i15 == 1937072756 || i15 == 1668047728 || i15 == 1937072752) {
            return 3;
        }
        return i15 == 1835365473 ? 5 : -1;
    }

    public static void g(c0 c0Var) {
        int iG = c0Var.g();
        c0Var.g0(4);
        if (c0Var.z() != 1751411826) {
            iG += 4;
        }
        c0Var.f0(iG);
    }

    private static t7.g h(c0 c0Var) {
        t7.g.b bVar = new t7.g.b();
        b0 b0Var = new b0(c0Var.f());
        b0Var.p(c0Var.g() * 8);
        b0Var.s(1);
        int iH = b0Var.h(8);
        for (int i15 = 0; i15 < iH; i15++) {
            b0Var.s(1);
            int iH2 = b0Var.h(8);
            for (int i16 = 0; i16 < iH2; i16++) {
                b0Var.r(6);
                boolean zG = b0Var.g();
                b0Var.q();
                b0Var.s(11);
                b0Var.r(4);
                int iH3 = b0Var.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                b0Var.s(1);
                if (zG) {
                    int iH4 = b0Var.h(8);
                    int iH5 = b0Var.h(8);
                    b0Var.s(1);
                    bVar.d(t7.g.j(iH4)).c(b0Var.g() ? 1 : 2).e(t7.g.k(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: t7.p$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: t7.p$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: t7.p$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: t7.p$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v6 ??, new type: t7.p$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: t7.p$b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v51 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: byte
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private static void i(w7.c0 r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, t7.l r33, i9.b.h r34, int r35) throws t7.x {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.b.i(w7.c0, int, int, int, int, java.lang.String, boolean, t7.l, i9.b$h, int):void");
    }

    private static t7.g j(c0 c0Var) {
        t7.g.b bVar = new t7.g.b();
        b0 b0Var = new b0(c0Var.f());
        b0Var.p(c0Var.g() * 8);
        b0Var.s(1);
        int iH = b0Var.h(3);
        b0Var.r(6);
        boolean zG = b0Var.g();
        boolean zG2 = b0Var.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        b0Var.r(13);
        b0Var.q();
        int iH2 = b0Var.h(4);
        if (iH2 != 1) {
            w7.t.f("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (b0Var.g()) {
            w7.t.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = b0Var.g();
        b0Var.q();
        if (zG3 && b0Var.h(8) > 127) {
            w7.t.f("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = b0Var.h(3);
        b0Var.q();
        if (b0Var.g()) {
            w7.t.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (b0Var.g()) {
            w7.t.f("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (b0Var.g()) {
            w7.t.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = b0Var.h(5);
        boolean z15 = false;
        for (int i15 = 0; i15 <= iH4; i15++) {
            b0Var.r(12);
            if (b0Var.h(5) > 7) {
                b0Var.q();
            }
        }
        int iH5 = b0Var.h(4);
        int iH6 = b0Var.h(4);
        b0Var.r(iH5 + 1);
        b0Var.r(iH6 + 1);
        if (b0Var.g()) {
            b0Var.r(7);
        }
        b0Var.r(7);
        boolean zG4 = b0Var.g();
        if (zG4) {
            b0Var.r(2);
        }
        if ((b0Var.g() ? 2 : b0Var.h(1)) > 0 && !b0Var.g()) {
            b0Var.r(1);
        }
        if (zG4) {
            b0Var.r(3);
        }
        b0Var.r(3);
        boolean zG5 = b0Var.g();
        if (iH3 == 2 && zG5) {
            b0Var.q();
        }
        if (iH3 != 1 && b0Var.g()) {
            z15 = true;
        }
        if (b0Var.g()) {
            int iH7 = b0Var.h(8);
            int iH8 = b0Var.h(8);
            bVar.d(t7.g.j(iH7)).c(((z15 || iH7 != 1 || iH8 != 13 || b0Var.h(8) != 0) ? b0Var.h(1) : 1) != 1 ? 2 : 1).e(t7.g.k(iH8));
        }
        return bVar.a();
    }

    private static a k(c0 c0Var, int i15) {
        c0Var.f0(i15 + 8);
        c0Var.g0(4);
        return new a(c0Var.S(), c0Var.S());
    }

    static Pair<Integer, x> l(c0 c0Var, int i15, int i16) throws t7.x {
        int i17 = i15 + 8;
        int i18 = -1;
        int i19 = 0;
        String strN = null;
        Integer numValueOf = null;
        while (i17 - i15 < i16) {
            c0Var.f0(i17);
            int iZ = c0Var.z();
            int iZ2 = c0Var.z();
            if (iZ2 == 1718775137) {
                numValueOf = Integer.valueOf(c0Var.z());
            } else if (iZ2 == 1935894637) {
                c0Var.g0(4);
                strN = c0Var.N(4);
            } else if (iZ2 == 1935894633) {
                i18 = i17;
                i19 = iZ;
            }
            i17 += iZ;
        }
        if (!"cenc".equals(strN) && !"cbc1".equals(strN) && !"cens".equals(strN) && !"cbcs".equals(strN)) {
            return null;
        }
        o8.s.a(numValueOf != null, "frma atom is mandatory");
        o8.s.a(i18 != -1, "schi atom is mandatory");
        x xVarA = A(c0Var, i18, i19, strN);
        o8.s.a(xVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (x) o0.h(xVarA));
    }

    private static Pair<long[], long[]> m(x7.d.b bVar) {
        x7.d.c cVarE = bVar.e(1701606260);
        if (cVarE == null) {
            return null;
        }
        c0 c0Var = cVarE.f217154b;
        c0Var.f0(8);
        int iQ = q(c0Var.z());
        int iU = c0Var.U();
        long[] jArr = new long[iU];
        long[] jArr2 = new long[iU];
        for (int i15 = 0; i15 < iU; i15++) {
            jArr[i15] = iQ == 1 ? c0Var.X() : c0Var.S();
            jArr2[i15] = iQ == 1 ? c0Var.J() : c0Var.z();
            if (c0Var.M() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c0Var.g0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static c n(c0 c0Var, int i15) {
        c0Var.f0(i15 + 12);
        c0Var.g0(1);
        o(c0Var);
        c0Var.g0(2);
        int iQ = c0Var.Q();
        if ((iQ & 128) != 0) {
            c0Var.g0(2);
        }
        if ((iQ & 64) != 0) {
            c0Var.g0(c0Var.Q());
        }
        if ((iQ & 32) != 0) {
            c0Var.g0(2);
        }
        c0Var.g0(1);
        o(c0Var);
        String strC = t7.w.c(c0Var.Q());
        if ("audio/mpeg".equals(strC) || "audio/vnd.dts".equals(strC) || "audio/vnd.dts.hd".equals(strC)) {
            return new c(strC, null, -1L, -1L);
        }
        c0Var.g0(4);
        long jS = c0Var.S();
        long jS2 = c0Var.S();
        c0Var.g0(1);
        int iO = o(c0Var);
        long j15 = jS2;
        byte[] bArr = new byte[iO];
        c0Var.u(bArr, 0, iO);
        if (j15 <= 0) {
            j15 = -1;
        }
        return new c(strC, bArr, j15, jS > 0 ? jS : -1L);
    }

    private static int o(c0 c0Var) {
        int iQ = c0Var.Q();
        int i15 = iQ & CertificateBody.profileType;
        while ((iQ & 128) == 128) {
            iQ = c0Var.Q();
            i15 = (i15 << 7) | (iQ & CertificateBody.profileType);
        }
        return i15;
    }

    public static int p(int i15) {
        return i15 & 16777215;
    }

    public static int q(int i15) {
        return (i15 >> 24) & GF2Field.MASK;
    }

    private static int r(c0 c0Var) {
        c0Var.f0(16);
        return c0Var.z();
    }

    private static t7.v s(c0 c0Var, int i15) {
        c0Var.g0(8);
        ArrayList arrayList = new ArrayList();
        while (c0Var.g() < i15) {
            t7.v.a aVarC = i9.j.c(c0Var);
            if (aVarC != null) {
                arrayList.add(aVarC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t7.v(arrayList);
    }

    private static e t(c0 c0Var) {
        long j15;
        c0Var.f0(8);
        int iQ = q(c0Var.z());
        c0Var.g0(iQ == 0 ? 8 : 16);
        long jS = c0Var.S();
        int iG = c0Var.g();
        int i15 = iQ == 0 ? 4 : 8;
        int i16 = 0;
        while (true) {
            j15 = -9223372036854775807L;
            if (i16 >= i15) {
                c0Var.g0(i15);
                break;
            }
            if (c0Var.f()[iG + i16] != -1) {
                long jS2 = iQ == 0 ? c0Var.S() : c0Var.X();
                if (jS2 == 0) {
                    break;
                }
                long jU0 = o0.U0(jS2, 1000000L, jS);
                jS = jS;
                j15 = jU0;
                break;
            }
            i16++;
        }
        return new e(jS, j15, e(c0Var.Y()));
    }

    public static t7.v u(x7.d.b bVar) {
        x7.d.c cVarE = bVar.e(1751411826);
        x7.d.c cVarE2 = bVar.e(1801812339);
        x7.d.c cVarE3 = bVar.e(1768715124);
        if (cVarE == null || cVarE2 == null || cVarE3 == null || r(cVarE.f217154b) != 1835299937) {
            return null;
        }
        c0 c0Var = cVarE2.f217154b;
        c0Var.f0(12);
        int iZ = c0Var.z();
        String[] strArr = new String[iZ];
        for (int i15 = 0; i15 < iZ; i15++) {
            int iZ2 = c0Var.z();
            c0Var.g0(4);
            strArr[i15] = c0Var.N(iZ2 - 8);
        }
        c0 c0Var2 = cVarE3.f217154b;
        c0Var2.f0(8);
        ArrayList arrayList = new ArrayList();
        while (c0Var2.a() > 8) {
            int iG = c0Var2.g();
            int iZ3 = c0Var2.z();
            int iZ4 = c0Var2.z() - 1;
            if (iZ4 < 0 || iZ4 >= iZ) {
                w7.t.h("BoxParsers", "Skipped metadata with unknown key index: " + iZ4);
            } else {
                x7.b bVarH = i9.j.h(c0Var2, iG + iZ3, strArr[iZ4]);
                if (bVarH != null) {
                    arrayList.add(bVarH);
                }
            }
            c0Var2.f0(iG + iZ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t7.v(arrayList);
    }

    private static void v(c0 c0Var, int i15, int i16, int i17, h hVar) {
        c0Var.f0(i16 + 16);
        if (i15 == 1835365492) {
            c0Var.K();
            String strK = c0Var.K();
            if (strK != null) {
                hVar.f90359b = new t7.p.b().j0(i17).A0(strK).Q();
            }
        }
    }

    public static x7.f w(c0 c0Var) {
        long J;
        long J2;
        c0Var.f0(8);
        if (q(c0Var.z()) == 0) {
            J = c0Var.S();
            J2 = c0Var.S();
        } else {
            J = c0Var.J();
            J2 = c0Var.J();
        }
        return new x7.f(J, J2, c0Var.S());
    }

    private static float x(c0 c0Var, int i15) {
        c0Var.f0(i15 + 8);
        return c0Var.U() / c0Var.U();
    }

    private static byte[] y(c0 c0Var, int i15, int i16) {
        int i17 = i15 + 8;
        while (i17 - i15 < i16) {
            c0Var.f0(i17);
            int iZ = c0Var.z();
            if (c0Var.z() == 1886547818) {
                return Arrays.copyOfRange(c0Var.f(), i17, iZ + i17);
            }
            i17 += iZ;
        }
        return null;
    }

    private static Pair<Integer, x> z(c0 c0Var, int i15, int i16) throws t7.x {
        Pair<Integer, x> pairL;
        int iG = c0Var.g();
        while (iG - i15 < i16) {
            c0Var.f0(iG);
            int iZ = c0Var.z();
            o8.s.a(iZ > 0, "childAtomSize must be positive");
            if (c0Var.z() == 1936289382 && (pairL = l(c0Var, iG, iZ)) != null) {
                return pairL;
            }
            iG += iZ;
        }
        return null;
    }
}
