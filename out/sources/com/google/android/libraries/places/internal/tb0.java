package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class tb0 extends fa0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final rb0 f33772e = new mb0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final rb0 f33773f = new nb0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final rb0 f33774g = new ob0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final sb0 f33775h = new qb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f33776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Deque f33777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33779d;

    public tb0() {
        this.f33776a = new ArrayDeque();
    }

    private final int m(sb0 sb0Var, int i15, Object obj, int i16) {
        b(i15);
        Deque deque = this.f33776a;
        if (!deque.isEmpty()) {
            r();
        }
        while (i15 > 0 && !deque.isEmpty()) {
            sj0 sj0Var = (sj0) deque.peek();
            int iMin = Math.min(i15, sj0Var.f());
            i16 = sb0Var.a(sj0Var, iMin, obj, i16);
            i15 -= iMin;
            this.f33778c -= iMin;
            r();
        }
        if (i15 <= 0) {
            return i16;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int p(rb0 rb0Var, int i15, Object obj, int i16) {
        try {
            return m(rb0Var, i15, obj, i16);
        } catch (IOException e15) {
            throw new AssertionError(e15);
        }
    }

    private final void r() {
        if (((sj0) this.f33776a.peek()).f() == 0) {
            u();
        }
    }

    private final void u() {
        if (!this.f33779d) {
            ((sj0) this.f33776a.remove()).close();
            return;
        }
        Deque deque = this.f33777b;
        Deque deque2 = this.f33776a;
        deque.add((sj0) deque2.remove());
        sj0 sj0Var = (sj0) deque2.peek();
        if (sj0Var != null) {
            sj0Var.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void D(int i15) {
        p(f33773f, i15, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void H3(OutputStream outputStream, int i15) {
        m(f33775h, i15, outputStream, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.libraries.places.internal.sj0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.libraries.places.internal.sj0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.libraries.places.internal.tb0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.libraries.places.internal.tb0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.android.libraries.places.internal.sj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.internal.sj0 W2(int r8) {
        /*
            r7 = this;
            if (r8 > 0) goto L7
            com.google.android.libraries.places.internal.sj0 r8 = com.google.android.libraries.places.internal.vj0.a()
            return r8
        L7:
            r7.b(r8)
            int r0 = r7.f33778c
            int r0 = r0 - r8
            r7.f33778c = r0
            r0 = 0
            r1 = r0
        L11:
            java.util.Deque r2 = r7.f33776a
            java.lang.Object r3 = r2.peek()
            com.google.android.libraries.places.internal.sj0 r3 = (com.google.android.libraries.places.internal.sj0) r3
            int r4 = r3.f()
            if (r4 <= r8) goto L25
            com.google.android.libraries.places.internal.sj0 r8 = r3.W2(r8)
            r3 = 0
            goto L3b
        L25:
            boolean r5 = r7.f33779d
            if (r5 == 0) goto L31
            com.google.android.libraries.places.internal.sj0 r3 = r3.W2(r4)
            r7.u()
            goto L37
        L31:
            java.lang.Object r3 = r2.poll()
            com.google.android.libraries.places.internal.sj0 r3 = (com.google.android.libraries.places.internal.sj0) r3
        L37:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L3b:
            if (r0 != 0) goto L3f
            r0 = r8
            goto L5c
        L3f:
            if (r1 != 0) goto L59
            com.google.android.libraries.places.internal.tb0 r1 = new com.google.android.libraries.places.internal.tb0
            r4 = 2
            if (r3 != 0) goto L47
            goto L52
        L47:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L52:
            r1.<init>(r4)
            r1.h(r0)
            r0 = r1
        L59:
            r1.h(r8)
        L5c:
            if (r3 > 0) goto L5f
            return r0
        L5f:
            r8 = r3
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.tb0.W2(int):com.google.android.libraries.places.internal.sj0");
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0
    public final void a() {
        if (!this.f33779d) {
            throw new InvalidMarkException();
        }
        Deque deque = this.f33776a;
        sj0 sj0Var = (sj0) deque.peek();
        if (sj0Var != null) {
            int iF = sj0Var.f();
            sj0Var.a();
            this.f33778c += sj0Var.f() - iF;
        }
        while (true) {
            sj0 sj0Var2 = (sj0) this.f33777b.pollLast();
            if (sj0Var2 == null) {
                return;
            }
            sj0Var2.a();
            deque.addFirst(sj0Var2);
            this.f33778c += sj0Var2.f();
        }
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.f33776a;
            if (deque.isEmpty()) {
                break;
            } else {
                ((sj0) deque.remove()).close();
            }
        }
        if (this.f33777b != null) {
            while (!this.f33777b.isEmpty()) {
                ((sj0) this.f33777b.remove()).close();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final int f() {
        return this.f33778c;
    }

    public final void h(sj0 sj0Var) {
        boolean z15 = this.f33779d && this.f33776a.isEmpty();
        if (sj0Var instanceof tb0) {
            tb0 tb0Var = (tb0) sj0Var;
            while (true) {
                Deque deque = tb0Var.f33776a;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.f33776a.add((sj0) deque.remove());
                }
            }
            this.f33778c += tb0Var.f33778c;
            tb0Var.f33778c = 0;
            tb0Var.close();
        } else {
            this.f33776a.add(sj0Var);
            this.f33778c += sj0Var.f();
        }
        if (z15) {
            ((sj0) this.f33776a.peek()).zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final int i() {
        return p(f33772e, 1, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void t3(byte[] bArr, int i15, int i16) {
        p(f33774g, i16, bArr, i15);
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0
    public final boolean zza() {
        Iterator it = this.f33776a.iterator();
        while (it.hasNext()) {
            if (!((sj0) it.next()).zza()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0
    public final void zzb() {
        if (this.f33777b == null) {
            this.f33777b = new ArrayDeque(Math.min(this.f33776a.size(), 16));
        }
        while (!this.f33777b.isEmpty()) {
            ((sj0) this.f33777b.remove()).close();
        }
        this.f33779d = true;
        sj0 sj0Var = (sj0) this.f33776a.peek();
        if (sj0Var != null) {
            sj0Var.zzb();
        }
    }

    public tb0(int i15) {
        this.f33776a = new ArrayDeque(i15);
    }
}
