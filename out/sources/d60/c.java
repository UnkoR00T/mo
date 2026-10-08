package d60;

import er.p;
import ju.p0;
import l3.d0;
import l3.g0;
import l3.l0;
import l3.o;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u001aB;\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R+\u0010*\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u00100\u001a\u00020+2\u0006\u0010#\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010%\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010'¨\u00063"}, d2 = {"Ld60/c;", "", "Lkotlin/Function1;", "", "Loq/i0;", "onFocusChanged", "Ll3/d0;", "focusRequester", "Ll3/o;", "focusManager", "Lj1/a;", "bringIntoViewRequester", "Lju/p0;", "coroutineScope", "<init>", "(Ler/l;Ll3/d0;Ll3/o;Lj1/a;Lju/p0;)V", "Ll3/l0;", "newFocusState", "k", "(Ll3/l0;)V", "withKeyboardAnimationDelay", "e", "(ZLtq/e;)Ljava/lang/Object;", "l", "()V", "g", "a", "Ler/l;", "b", "Ll3/d0;", "c", "Ll3/o;", "d", "Lj1/a;", "Lju/p0;", "<set-?>", "f", "Lm2/a3;", "i", "()Z", "m", "(Z)V", "isAttached", "Ld60/a;", "h", "()Ld60/a;", "n", "(Ld60/a;)V", "focusState", "j", "isFocused", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<Boolean, i0> onFocusChanged;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 focusRequester;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o focusManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j1.a bringIntoViewRequester;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0 coroutineScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 isAttached = c6.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 focusState = c6.e(a.INITIAL, null, 2, null);

    /* JADX INFO: renamed from: d60.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Ld60/c$a;", "", "<init>", "()V", "Lf3/m;", "Ld60/c;", "focusHost", "b", "(Lf3/m;Ld60/c;)Lf3/m;", "d", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 c(c cVar, l0 l0Var) {
            cVar.k(l0Var);
            return i0.f148189a;
        }

        public final f3.m b(f3.m mVar, final c cVar) {
            f3.m mVarU = mVar.u(g0.a(mVar, cVar.focusRequester)).u(l3.e.a(mVar, new er.l() { // from class: d60.b
                @Override // er.l
                public final Object b(Object obj) {
                    return c.Companion.c(cVar, (l0) obj);
                }
            }));
            cVar.m(true);
            return mVarU;
        }

        public final f3.m d(f3.m mVar, c cVar) {
            return mVar.u(j1.e.b(mVar, cVar.bringIntoViewRequester));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40044a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40044a = iArr;
        }
    }

    /* JADX INFO: renamed from: d60.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0873c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f40045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40046e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f40048g;

        C0873c(tq.e<? super C0873c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f40046e = obj;
            this.f40048g |= PKIFailureInfo.systemUnavail;
            return c.this.e(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40049e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40049e;
            if (i15 == 0) {
                u.b(obj);
                c cVar = c.this;
                this.f40049e = 1;
                if (cVar.e(true, this) == objE) {
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
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new d(eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(er.l<? super Boolean, i0> lVar, d0 d0Var, o oVar, j1.a aVar, p0 p0Var) {
        this.onFocusChanged = lVar;
        this.focusRequester = d0Var;
        this.focusManager = oVar;
        this.bringIntoViewRequester = aVar;
        this.coroutineScope = p0Var;
    }

    public static /* synthetic */ Object f(c cVar, boolean z15, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return cVar.e(z15, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a h() {
        return (a) this.focusState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.isAttached.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(l0 newFocusState) {
        a aVar;
        if (h() == a.INITIAL && !newFocusState.b()) {
            px.f.f163100a.b("FocusChangedHandler - focus wasn't changed, focus: " + j(), px.c.a(this));
            return;
        }
        px.f.f163100a.b("FocusChangedHandler - focus: " + j() + " -> " + newFocusState.b(), px.c.a(this));
        if (newFocusState.b()) {
            ju.k.d(this.coroutineScope, null, null, new d(null), 3, null);
            aVar = a.ACTIVE;
        } else {
            aVar = a.INACTIVE;
        }
        n(aVar);
        this.onFocusChanged.b(Boolean.valueOf(newFocusState.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(boolean z15) {
        this.isAttached.setValue(Boolean.valueOf(z15));
    }

    private final void n(a aVar) {
        this.focusState.setValue(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (j1.a.a(r9, null, r0, 1, null) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d60.c.C0873c
            if (r0 == 0) goto L13
            r0 = r9
            d60.c$c r0 = (d60.c.C0873c) r0
            int r1 = r0.f40048g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40048g = r1
            goto L18
        L13:
            d60.c$c r0 = new d60.c$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f40046e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f40048g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r9)
            goto L5a
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            boolean r8 = r0.f40045d
            oq.u.b(r9)
            goto L4c
        L3a:
            oq.u.b(r9)
            if (r8 == 0) goto L4c
            r0.f40045d = r8
            r0.f40048g = r4
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Object r9 = ju.z0.b(r5, r0)
            if (r9 != r1) goto L4c
            goto L59
        L4c:
            j1.a r9 = r7.bringIntoViewRequester
            r0.f40045d = r8
            r0.f40048g = r3
            r8 = 0
            java.lang.Object r8 = j1.a.a(r9, r8, r0, r4, r8)
            if (r8 != r1) goto L5a
        L59:
            return r1
        L5a:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.c.e(boolean, tq.e):java.lang.Object");
    }

    public final void g() {
        if (j()) {
            o.g(this.focusManager, false, 1, null);
        }
    }

    public final boolean j() {
        int i15 = b.f40044a[h().ordinal()];
        if (i15 == 1) {
            return false;
        }
        if (i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new oq.p();
    }

    public final void l() {
        if (i()) {
            d0.f(this.focusRequester, 0, 1, null);
        }
    }
}
