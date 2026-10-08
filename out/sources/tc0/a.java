package tc0;

import android.content.SharedPreferences;
import android.os.SystemClock;
import er.p;
import java.util.Iterator;
import ju.g1;
import ju.i;
import ju.p0;
import ju.q0;
import lr.m;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000e\u0010\rJ\u001c\u0010\u0011\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Ltc0/a;", "Lvc0/a;", "Lt10/k;", "sharedPreferencesFactory", "<init>", "(Lt10/k;)V", "Loq/i0;", "k", "(Ltq/e;)Ljava/lang/Object;", "Lrc0/a;", "authenticationType", "", "h", "(Lrc0/a;Ltq/e;)Ljava/lang/Object;", "i", "", "count", "j", "(Lrc0/a;ILtq/e;)Ljava/lang/Object;", "b", "c", "", "d", "Lrc0/b;", "a", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPrefs", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements vc0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f189438c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPrefs;

    /* JADX INFO: renamed from: tc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C4924a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f189441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f189442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f189443h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4924a(long j15, a aVar, tq.e<? super C4924a> eVar) {
            super(2, eVar);
            this.f189442g = j15;
            this.f189443h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f189441f;
            Object objE = b.e();
            int i15 = this.f189440e;
            if (i15 == 0) {
                u.b(obj);
                if (this.f189442g > SystemClock.elapsedRealtime()) {
                    a aVar = this.f189443h;
                    this.f189441f = p0Var;
                    this.f189440e = 1;
                    if (aVar.k(this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            q0.d(p0Var, null, 1, null);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C4924a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            C4924a c4924a = new C4924a(this.f189442g, this.f189443h, eVar);
            c4924a.f189441f = obj;
            return c4924a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f189444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f189445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189447g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f189449j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189447g = obj;
            this.f189449j |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189450e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ rc0.a f189452g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(rc0.a aVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f189452g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b.e();
            if (this.f189450e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(a.this.sharedPrefs.getInt(this.f189452g.getSharedPreferencesKey(), 0) >= 5);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new d(this.f189452g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189453e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ rc0.a f189455g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(rc0.a aVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f189455g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f189453e;
            if (i15 == 0) {
                u.b(obj);
                a aVar = a.this;
                rc0.a aVar2 = this.f189455g;
                int i16 = aVar.sharedPrefs.getInt(this.f189455g.getSharedPreferencesKey(), 0) + 1;
                this.f189453e = 1;
                if (aVar.j(aVar2, i16, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new e(this.f189455g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class f extends k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189456e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f189456e;
            if (i15 == 0) {
                u.b(obj);
                a aVar = a.this;
                this.f189456e = 1;
                obj = aVar.d(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return vq.b.a(((Number) obj).longValue() != 0);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189458e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ rc0.a f189460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f189461h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(rc0.a aVar, int i15, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f189460g = aVar;
            this.f189461h = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b.e();
            if (this.f189458e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            SharedPreferences.Editor editorEdit = a.this.sharedPrefs.edit();
            rc0.a aVar = this.f189460g;
            editorEdit.putInt(aVar.getSharedPreferencesKey(), this.f189461h);
            editorEdit.apply();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new g(this.f189460g, this.f189461h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189462e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b.e();
            if (this.f189462e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            SharedPreferences.Editor editorEdit = a.this.sharedPrefs.edit();
            editorEdit.putLong("M_JUNIOR_APPLICATION_LOCK_ELAPSED_TIME_KEY", SystemClock.elapsedRealtime());
            editorEdit.apply();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new h(eVar);
        }
    }

    public a(t10.k kVar) {
        SharedPreferences sharedPreferencesB = t10.k.b(kVar, "mjunior_login_lock_shared_prefs", null, 2, null);
        this.sharedPrefs = sharedPreferencesB;
        ju.k.d(q0.a(g1.b()), null, null, new C4924a(sharedPreferencesB.getLong("M_JUNIOR_APPLICATION_LOCK_ELAPSED_TIME_KEY", 0L), this, null), 3, null);
    }

    private final Object h(rc0.a aVar, tq.e<? super Boolean> eVar) {
        return i.g(g1.b(), new d(aVar, null), eVar);
    }

    private final Object i(rc0.a aVar, tq.e<? super i0> eVar) {
        Object objG = i.g(g1.b(), new e(aVar, null), eVar);
        return objG == b.e() ? objG : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(rc0.a aVar, int i15, tq.e<? super i0> eVar) {
        Object objG = i.g(g1.b(), new g(aVar, i15, null), eVar);
        return objG == b.e() ? objG : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(tq.e<? super i0> eVar) {
        Object objG = i.g(g1.b(), new h(null), eVar);
        return objG == b.e() ? objG : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (k(r0) == r1) goto L28;
     */
    @Override // vc0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(rc0.a r7, tq.e<? super rc0.b> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tc0.a.c
            if (r0 == 0) goto L13
            r0 = r8
            tc0.a$c r0 = (tc0.a.c) r0
            int r1 = r0.f189449j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189449j = r1
            goto L18
        L13:
            tc0.a$c r0 = new tc0.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f189447g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f189449j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f189444d
            rc0.a r7 = (rc0.a) r7
            oq.u.b(r8)
            goto L84
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.f189444d
            rc0.a r7 = (rc0.a) r7
            oq.u.b(r8)
            goto L68
        L43:
            java.lang.Object r7 = r0.f189444d
            rc0.a r7 = (rc0.a) r7
            oq.u.b(r8)
            goto L59
        L4b:
            oq.u.b(r8)
            r0.f189444d = r7
            r0.f189449j = r5
            java.lang.Object r8 = r6.i(r7, r0)
            if (r8 != r1) goto L59
            goto L83
        L59:
            java.lang.Object r8 = vq.j.a(r7)
            r0.f189444d = r8
            r0.f189449j = r4
            java.lang.Object r8 = r6.h(r7, r0)
            if (r8 != r1) goto L68
            goto L83
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L87
            java.lang.Object r7 = vq.j.a(r7)
            r0.f189444d = r7
            r0.f189445e = r8
            r7 = 0
            r0.f189446f = r7
            r0.f189449j = r3
            java.lang.Object r7 = r6.k(r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            rc0.b r7 = rc0.b.EXCEEDED
            return r7
        L87:
            rc0.b r7 = rc0.b.WITHIN_RANGE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tc0.a.a(rc0.a, tq.e):java.lang.Object");
    }

    @Override // vc0.a
    public Object b(tq.e<? super i0> eVar) {
        SharedPreferences.Editor editorEdit = this.sharedPrefs.edit();
        Iterator<rc0.a> it = rc0.a.e().iterator();
        while (it.hasNext()) {
            editorEdit.putInt(it.next().getSharedPreferencesKey(), 0);
        }
        editorEdit.putLong("M_JUNIOR_APPLICATION_LOCK_ELAPSED_TIME_KEY", 0L);
        editorEdit.apply();
        return i0.f148189a;
    }

    @Override // vc0.a
    public Object c(tq.e<? super Boolean> eVar) {
        return i.g(g1.b(), new f(null), eVar);
    }

    @Override // vc0.a
    public Object d(tq.e<? super Long> eVar) {
        long j15 = this.sharedPrefs.getLong("M_JUNIOR_APPLICATION_LOCK_ELAPSED_TIME_KEY", 0L);
        return vq.b.f(j15 != 0 ? m.f((j15 - SystemClock.elapsedRealtime()) + gu.b.A(xc0.a.f217927a.a()), 0L) : 0L);
    }
}
