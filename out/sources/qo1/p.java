package qo1;

import fr.q0;
import iy.b0;
import k10.c0;
import mu.a0;
import mu.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lqo1/p;", "Lk10/t;", "Lqo1/l;", "Lqo1/a;", "", "Lg04/a;", "activateBiometricUseCase", "Luj2/a;", "biometricLoginToAppUseCase", "Lg04/g;", "checkBiometricStatusUseCase", "Lg04/f;", "checkBiometricRequirementsUseCase", "Lv64/j;", "compareWithCurrentPasswordUseCase", "Lg04/d;", "changeBiometricPinUseCase", "<init>", "(Lg04/a;Luj2/a;Lg04/g;Lg04/f;Lv64/j;Lg04/d;)V", "Liy/b0;", "password", "", "s", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "f", "Lg04/a;", "g", "Luj2/a;", "h", "Lg04/g;", "i", "Lg04/f;", "j", "Lv64/j;", "k", "Lg04/d;", "Lmu/a0;", "Lqo1/b;", "l", "Lmu/a0;", "_navEvent", "Lmu/g;", "m", "Lmu/g;", "t", "()Lmu/g;", "navEvent", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends k10.t<l, qo1.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g04.a activateBiometricUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final uj2.a biometricLoginToAppUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g04.f checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final v64.j compareWithCurrentPasswordUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g04.d changeBiometricPinUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a0<qo1.b> _navEvent;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.g<qo1.b> navEvent;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqo1/a$a;", "<unused var>", "Lqo1/l;", "Loq/i0;", "<anonymous>", "(Lqo1/a$a;Lqo1/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<qo1.a.C4222a, l, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167630e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167630e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = p.this._navEvent;
                qo1.b.a aVar = qo1.b.a.f167569a;
                this.f167630e = 1;
                if (a0Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.C4222a c4222a, l lVar, tq.e<? super i0> eVar) {
            return p.this.new a(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqo1/a$g;", "action", "Lk10/c0;", "Lqo1/l$a;", "state", "Lk10/l;", "Lqo1/l;", "<anonymous>", "(Lqo1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<qo1.a.OnChangePassword, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167634g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(c0 c0Var, qo1.a.OnChangePassword onChangePassword, l.Initialized initialized) {
            return l.Initialized.b((l.Initialized) c0Var.a(), null, null, onChangePassword.getPassword(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final qo1.a.OnChangePassword onChangePassword = (qo1.a.OnChangePassword) this.f167633f;
            final c0 c0Var = (c0) this.f167634g;
            uq.b.e();
            if (this.f167632e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qo1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.b.O(c0Var, onChangePassword, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.OnChangePassword onChangePassword, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            b bVar = new b(eVar);
            bVar.f167633f = onChangePassword;
            bVar.f167634g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqo1/a$f;", "action", "Lqo1/l$a;", "state", "Loq/i0;", "<anonymous>", "(Lqo1/a$f;Lqo1/l$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qo1.a.f, l.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f167636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f167637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f167638h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f167639j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f167640k;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
        
            if (r2.a(r3, r9) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
        
            if (r2.a(r4, r9) == r1) goto L34;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qo1.p.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.f fVar, l.Initialized initialized, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f167640k = initialized;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqo1/a$b;", "action", "Lqo1/l$a;", "state", "Loq/i0;", "<anonymous>", "(Lqo1/a$b;Lqo1/l$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<qo1.a.b, l.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167643f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r8.a(r2, r7) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        
            if (r8 == r1) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f167643f
                qo1.l$a r0 = (qo1.l.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f167642e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2a
                if (r2 == r5) goto L26
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                oq.u.b(r8)
                goto L7f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                oq.u.b(r8)
                goto L9a
            L26:
                oq.u.b(r8)
                goto L3e
            L2a:
                oq.u.b(r8)
                qo1.p r8 = qo1.p.this
                iy.b0 r2 = r0.getPassword()
                r7.f167643f = r0
                r7.f167642e = r5
                java.lang.Object r8 = qo1.p.l(r8, r2, r7)
                if (r8 != r1) goto L3e
                goto L7e
            L3e:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L59
                qo1.p r8 = qo1.p.this
                qo1.a$a r2 = qo1.a.C4222a.f167555a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f167643f = r0
                r7.f167642e = r4
                java.lang.Object r8 = r8.a(r2, r7)
                if (r8 != r1) goto L9a
                goto L7e
            L59:
                qo1.p r8 = qo1.p.this
                g04.a r8 = qo1.p.m(r8)
                g04.a$a r2 = new g04.a$a
                iy.b0 r4 = r0.getPassword()
                java.lang.String r5 = "1234"
                iy.b0 r5 = iy.c0.g(r5)
                e04.e$b$b r6 = e04.e.b.C1057b.f46689a
                r2.<init>(r4, r5, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f167643f = r0
                r7.f167642e = r3
                java.lang.Object r8 = r8.c(r2, r7)
                if (r8 != r1) goto L7f
            L7e:
                return r1
            L7f:
                dx.i r8 = (dx.i) r8
                boolean r0 = r8 instanceof dx.i.Left
                if (r0 == 0) goto L8e
                dx.i$b r8 = (dx.i.Left) r8
                java.lang.Object r8 = r8.b()
                dx.b r8 = (dx.b) r8
                goto L9a
            L8e:
                boolean r0 = r8 instanceof dx.i.Right
                if (r0 == 0) goto L9d
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                e04.a r8 = (e04.a) r8
            L9a:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L9d:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: qo1.p.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.b bVar, l.Initialized initialized, tq.e<? super i0> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f167643f = initialized;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqo1/a$c;", "<unused var>", "Lqo1/l$a;", "Loq/i0;", "<anonymous>", "(Lqo1/a$c;Lqo1/l$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qo1.a.c, l.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f167646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f167647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f167648h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f167649j;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        
            if (r1.F(r2, r7) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
        
            if (r1.F(r3, r7) == r0) goto L34;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qo1.p.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.c cVar, l.Initialized initialized, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqo1/a$i;", "action", "Lk10/c0;", "Lqo1/l$a;", "state", "Lk10/l;", "Lqo1/l;", "<anonymous>", "(Lqo1/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qo1.a.SetWithoutPin, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167653g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qo1.a.SetWithoutPin setWithoutPin = (qo1.a.SetWithoutPin) this.f167652f;
            c0 c0Var = (c0) this.f167653g;
            Object objE = uq.b.e();
            int i15 = this.f167651e;
            if (i15 == 0) {
                oq.u.b(obj);
                g04.d dVar = p.this.changeBiometricPinUseCase;
                g04.d.Params params = new g04.d.Params(setWithoutPin.getPin(), setWithoutPin.getPassword());
                this.f167652f = vq.j.a(setWithoutPin);
                this.f167653g = c0Var;
                this.f167651e = 1;
                if (dVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.SetWithoutPin setWithoutPin, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f167652f = setWithoutPin;
            fVar.f167653g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqo1/a$h;", "action", "Lk10/c0;", "Lqo1/l$a;", "state", "Lk10/l;", "Lqo1/l;", "<anonymous>", "(Lqo1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qo1.a.SetWithPin, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167657g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qo1.a.SetWithPin setWithPin = (qo1.a.SetWithPin) this.f167656f;
            c0 c0Var = (c0) this.f167657g;
            Object objE = uq.b.e();
            int i15 = this.f167655e;
            if (i15 == 0) {
                oq.u.b(obj);
                g04.d dVar = p.this.changeBiometricPinUseCase;
                g04.d.Params params = new g04.d.Params(setWithPin.getPin(), setWithPin.getPassword());
                this.f167656f = vq.j.a(setWithPin);
                this.f167657g = c0Var;
                this.f167655e = 1;
                if (dVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.SetWithPin setWithPin, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f167656f = setWithPin;
            gVar.f167657g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqo1/a$d;", "<unused var>", "Lk10/c0;", "Lqo1/l$a;", "state", "Lk10/l;", "Lqo1/l;", "<anonymous>", "(Lqo1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<qo1.a.d, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167660f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized V(c0 c0Var, dx.b bVar, l.Initialized initialized) {
            return l.Initialized.b((l.Initialized) c0Var.a(), null, mx.b.b(bVar.toString(), ""), null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized X(c0 c0Var, i0 i0Var, l.Initialized initialized) {
            return l.Initialized.b((l.Initialized) c0Var.a(), null, mx.b.b(i0Var.toString(), ""), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f167660f;
            Object objE = uq.b.e();
            int i15 = this.f167659e;
            if (i15 == 0) {
                oq.u.b(obj);
                g04.f fVar = p.this.checkBiometricRequirementsUseCase;
                g04.f.Params params = new g04.f.Params(true, false);
                this.f167660f = c0Var;
                this.f167659e = 1;
                obj = fVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: qo1.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.h.V(c0Var, bVar, (l.Initialized) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final i0 i0Var = (i0) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: qo1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.h.X(c0Var, i0Var, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.d dVar, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f167660f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqo1/a$e;", "<unused var>", "Lk10/c0;", "Lqo1/l$a;", "state", "Lk10/l;", "Lqo1/l;", "<anonymous>", "(Lqo1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qo1.a.e, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167663f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized V(c0 c0Var, dx.b bVar, l.Initialized initialized) {
            return l.Initialized.b((l.Initialized) c0Var.a(), mx.b.b(bVar.toString(), ""), null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized X(c0 c0Var, e04.e eVar, l.Initialized initialized) {
            return l.Initialized.b((l.Initialized) c0Var.a(), mx.b.b(eVar.toString(), ""), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f167663f;
            Object objE = uq.b.e();
            int i15 = this.f167662e;
            if (i15 == 0) {
                oq.u.b(obj);
                g04.g gVar = p.this.checkBiometricStatusUseCase;
                g04.g.Params params = new g04.g.Params(true);
                this.f167663f = c0Var;
                this.f167662e = 1;
                obj = gVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: qo1.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.i.V(c0Var, bVar, (l.Initialized) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final e04.e eVar = (e04.e) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: qo1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.i.X(c0Var, eVar, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(qo1.a.e eVar, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar2) {
            i iVar = p.this.new i(eVar2);
            iVar.f167663f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f167665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f167666e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f167668g;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f167666e = obj;
            this.f167668g |= PKIFailureInfo.systemUnavail;
            return p.this.s(null, this);
        }
    }

    public p(g04.a aVar, uj2.a aVar2, g04.g gVar, g04.f fVar, v64.j jVar, g04.d dVar) {
        super(new l.Initialized(null, null, null, 7, null));
        this.activateBiometricUseCase = aVar;
        this.biometricLoginToAppUseCase = aVar2;
        this.checkBiometricStatusUseCase = gVar;
        this.checkBiometricRequirementsUseCase = fVar;
        this.compareWithCurrentPasswordUseCase = jVar;
        this.changeBiometricPinUseCase = dVar;
        a0<qo1.b> a0VarB = h0.b(0, 0, null, 7, null);
        this._navEvent = a0VarB;
        this.navEvent = a0VarB;
        g(new er.l() { // from class: qo1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.k(this.f167619a, (k10.v) obj);
            }
        });
    }

    public static i0 h(p pVar, k10.z zVar) {
        a aVar = pVar.new a(null);
        zVar.x(q0.c(qo1.a.C4222a.class), k10.o.CANCEL_PREVIOUS, aVar);
        return i0.f148189a;
    }

    public static i0 i(p pVar, k10.z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(qo1.a.OnChangePassword.class), oVar, bVar);
        zVar.x(q0.c(qo1.a.f.class), oVar, pVar.new c(null));
        zVar.x(q0.c(qo1.a.b.class), oVar, pVar.new d(null));
        zVar.x(q0.c(qo1.a.c.class), oVar, pVar.new e(null));
        zVar.v(q0.c(qo1.a.SetWithoutPin.class), oVar, pVar.new f(null));
        zVar.v(q0.c(qo1.a.SetWithPin.class), oVar, pVar.new g(null));
        zVar.v(q0.c(qo1.a.d.class), oVar, pVar.new h(null));
        zVar.v(q0.c(qo1.a.e.class), oVar, pVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final p pVar, k10.v vVar) {
        vVar.c(q0.c(l.class), new er.l() { // from class: qo1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.h(this.f167620a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l.Initialized.class), new er.l() { // from class: qo1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.i(this.f167621a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(b0 b0Var, tq.e<? super Boolean> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f167668g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f167668g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objC = jVar.f167666e;
        Object objE = uq.b.e();
        int i16 = jVar.f167668g;
        if (i16 == 0) {
            oq.u.b(objC);
            v64.j jVar2 = this.compareWithCurrentPasswordUseCase;
            v64.j.Params params = new v64.j.Params(b0Var);
            jVar.f167665d = vq.j.a(b0Var);
            jVar.f167668g = 1;
            objC = jVar2.c(params, jVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return vq.b.a(false);
        }
        if (iVar instanceof dx.i.Right) {
            return vq.b.a(((Boolean) ((dx.i.Right) iVar).b()).booleanValue());
        }
        throw new oq.p();
    }

    public mu.g<qo1.b> t() {
        return this.navEvent;
    }
}
