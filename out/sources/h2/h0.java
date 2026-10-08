package h2;

import a4.PointerInputChange;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.lr;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001au\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aM\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a[\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001d\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010!\u001a\u00020\u0007*\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"\u001aO\u0010$\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0002¢\u0006\u0004\b$\u0010%\u001a-\u0010*\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0003¢\u0006\u0004\b-\u0010.\"\u0018\u00102\u001a\u00020\n*\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0018\u00104\u001a\u00020\n*\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00065"}, d2 = {"Landroidx/compose/ui/window/t;", "positionProvider", "Lkotlin/Function0;", "Loq/i0;", "tooltip", "Lf2/lr;", "state", "Lf3/m;", "modifier", "onDismissRequest", "", "focusable", "enableUserInput", "hasAction", "content", "k", "(Landroidx/compose/ui/window/t;Ler/p;Lf2/lr;Lf3/m;Ler/a;ZZZLer/p;Lm2/r;II)V", "forceFocusableForKeyboardNav", "G", "(ZLm2/r;I)Z", "Lm2/a3;", "forceKeyboardFocusable", "s", "(ZLf2/lr;Lm2/a3;ZLf3/m;Ler/p;Lm2/r;II)V", "Lju/p0;", "scope", "n", "(Landroidx/compose/ui/window/t;Lf2/lr;Ler/a;Lju/p0;ZLm2/a3;Ler/p;Lm2/r;I)V", "enabled", "z", "(Lf3/m;ZLf2/lr;)Lf3/m;", "", AnnotatedPrivateKey.LABEL, "w", "(Lf3/m;Ljava/lang/String;ZLf2/lr;Lju/p0;)Lf3/m;", "receivedKeyboardFocus", "C", "(Lf3/m;ZLf2/lr;Lju/p0;ZLm2/a3;Lm2/a3;)Lf3/m;", "initialIsVisible", "isPersistent", "Lw0/b2;", "mutatorMutex", "E", "(ZZLw0/b2;Lm2/r;II)Lf2/lr;", "Lm2/f6;", "F", "(Lm2/r;I)Lm2/f6;", "Ly3/b;", "B", "(Landroid/view/KeyEvent;)Z", "isTab", "A", "isEscape", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"h2/h0$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lr f79800a;

        public a(lr lrVar) {
            this.f79800a = lrVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f79800a.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ lr f79802f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(lr lrVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f79802f = lrVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f79801e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f79802f.dismiss();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f79802f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ lr f79804f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(lr lrVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f79804f = lrVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79803e;
            if (i15 == 0) {
                oq.u.b(obj);
                lr lrVar = this.f79804f;
                this.f79803e = 1;
                if (lr.d(lrVar, null, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f79804f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lr f79805a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f79806e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f79807f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a4.k0 f79808g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ lr f79809h;

            /* JADX INFO: renamed from: h2.h0$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
            static final class C1819a extends vq.i implements er.p<a4.c, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f79810c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f79811d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                long f79812e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f79813f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private /* synthetic */ Object f79814g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ ju.p0 f79815h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ lr f79816j;

                /* JADX INFO: renamed from: h2.h0$d$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "La4/b0;", "<anonymous>", "(La4/c;)La4/b0;"}, k = 3, mv = {2, 1, 0})
                static final class C1820a extends vq.i implements er.p<a4.c, tq.e<? super PointerInputChange>, Object> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f79817c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private /* synthetic */ Object f79818d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ a4.q f79819e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1820a(a4.q qVar, tq.e<? super C1820a> eVar) {
                        super(2, eVar);
                        this.f79819e = qVar;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        Object objE = uq.b.e();
                        int i15 = this.f79817c;
                        if (i15 != 0) {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                            return obj;
                        }
                        oq.u.b(obj);
                        a4.c cVar = (a4.c) this.f79818d;
                        a4.q qVar = this.f79819e;
                        this.f79817c = 1;
                        Object objQ = p143z0.b3.q(cVar, qVar, this);
                        return objQ == objE ? objE : objQ;
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
                    public final Object B(a4.c cVar, tq.e<? super PointerInputChange> eVar) {
                        return ((C1820a) v(cVar, eVar)).J(oq.i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                        C1820a c1820a = new C1820a(this.f79819e, eVar);
                        c1820a.f79818d = obj;
                        return c1820a;
                    }
                }

                /* JADX INFO: renamed from: h2.h0$d$a$a$b */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
                static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f79820e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    int f79821f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ mu.b0<Boolean> f79822g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ lr f79823h;

                    /* JADX INFO: renamed from: h2.h0$d$a$a$b$a, reason: collision with other inner class name */
                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLongPressed", "Loq/i0;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
                    static final class C1821a extends vq.k implements er.p<Boolean, tq.e<? super oq.i0>, Object> {

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        int f79824e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        /* synthetic */ boolean f79825f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        final /* synthetic */ lr f79826g;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1821a(lr lrVar, tq.e<? super C1821a> eVar) {
                            super(2, eVar);
                            this.f79826g = lrVar;
                        }

                        @Override // er.p
                        public /* bridge */ /* synthetic */ Object B(Boolean bool, tq.e<? super oq.i0> eVar) {
                            return M(bool.booleanValue(), eVar);
                        }

                        @Override // vq.a
                        public final Object J(Object obj) throws Throwable {
                            uq.b.e();
                            if (this.f79824e != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                            if (!this.f79825f) {
                                this.f79826g.dismiss();
                            }
                            return oq.i0.f148189a;
                        }

                        public final Object M(boolean z15, tq.e<? super oq.i0> eVar) {
                            return ((C1821a) v(Boolean.valueOf(z15), eVar)).J(oq.i0.f148189a);
                        }

                        @Override // vq.a
                        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                            C1821a c1821a = new C1821a(this.f79826g, eVar);
                            c1821a.f79825f = ((Boolean) obj).booleanValue();
                            return c1821a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(mu.b0<Boolean> b0Var, lr lrVar, tq.e<? super b> eVar) {
                        super(2, eVar);
                        this.f79822g = b0Var;
                        this.f79823h = lrVar;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
                    
                        if (mu.i.j(r7, r1, r6) == r0) goto L30;
                     */
                    @Override // vq.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                        /*
                            r6 = this;
                            java.lang.Object r0 = uq.b.e()
                            int r1 = r6.f79821f
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L2c
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L22
                            if (r1 == r3) goto L1a
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1a:
                            java.lang.Object r0 = r6.f79820e
                            java.lang.Throwable r0 = (java.lang.Throwable) r0
                            oq.u.b(r7)
                            goto L7f
                        L22:
                            oq.u.b(r7)
                            goto L5f
                        L26:
                            oq.u.b(r7)     // Catch: java.lang.Throwable -> L2a
                            goto L45
                        L2a:
                            r7 = move-exception
                            goto L62
                        L2c:
                            oq.u.b(r7)
                            mu.b0<java.lang.Boolean> r7 = r6.f79822g     // Catch: java.lang.Throwable -> L2a
                            java.lang.Boolean r1 = vq.b.a(r5)     // Catch: java.lang.Throwable -> L2a
                            r7.f(r1)     // Catch: java.lang.Throwable -> L2a
                            f2.lr r7 = r6.f79823h     // Catch: java.lang.Throwable -> L2a
                            w0.z1 r1 = w0.z1.PreventUserInput     // Catch: java.lang.Throwable -> L2a
                            r6.f79821f = r5     // Catch: java.lang.Throwable -> L2a
                            java.lang.Object r7 = r7.b(r1, r6)     // Catch: java.lang.Throwable -> L2a
                            if (r7 != r0) goto L45
                            goto L7d
                        L45:
                            f2.lr r7 = r6.f79823h
                            boolean r7 = r7.getIsVisible()
                            if (r7 == 0) goto L5f
                            mu.b0<java.lang.Boolean> r7 = r6.f79822g
                            h2.h0$d$a$a$b$a r1 = new h2.h0$d$a$a$b$a
                            f2.lr r3 = r6.f79823h
                            r1.<init>(r3, r2)
                            r6.f79821f = r4
                            java.lang.Object r7 = mu.i.j(r7, r1, r6)
                            if (r7 != r0) goto L5f
                            goto L7d
                        L5f:
                            oq.i0 r7 = oq.i0.f148189a
                            return r7
                        L62:
                            f2.lr r1 = r6.f79823h
                            boolean r1 = r1.getIsVisible()
                            if (r1 == 0) goto L80
                            mu.b0<java.lang.Boolean> r1 = r6.f79822g
                            h2.h0$d$a$a$b$a r4 = new h2.h0$d$a$a$b$a
                            f2.lr r5 = r6.f79823h
                            r4.<init>(r5, r2)
                            r6.f79820e = r7
                            r6.f79821f = r3
                            java.lang.Object r1 = mu.i.j(r1, r4, r6)
                            if (r1 != r0) goto L7e
                        L7d:
                            return r0
                        L7e:
                            r0 = r7
                        L7f:
                            r7 = r0
                        L80:
                            throw r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: h2.h0.d.a.C1819a.b.J(java.lang.Object):java.lang.Object");
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                        return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                        return new b(this.f79822g, this.f79823h, eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1819a(ju.p0 p0Var, lr lrVar, tq.e<? super C1819a> eVar) {
                    super(2, eVar);
                    this.f79815h = p0Var;
                    this.f79816j = lrVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
                
                    if (r0 == r6) goto L36;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1, types: [mu.a0] */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override // vq.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 246
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: h2.h0.d.a.C1819a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
                public final Object B(a4.c cVar, tq.e<? super oq.i0> eVar) {
                    return ((C1819a) v(cVar, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    C1819a c1819a = new C1819a(this.f79815h, this.f79816j, eVar);
                    c1819a.f79814g = obj;
                    return c1819a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a4.k0 k0Var, lr lrVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f79808g = k0Var;
                this.f79809h = lrVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f79806e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.p0 p0Var = (ju.p0) this.f79807f;
                    a4.k0 k0Var = this.f79808g;
                    C1819a c1819a = new C1819a(p0Var, this.f79809h, null);
                    this.f79806e = 1;
                    if (p143z0.g1.d(k0Var, c1819a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f79808g, this.f79809h, eVar);
                aVar.f79807f = obj;
                return aVar;
            }
        }

        d(lr lrVar) {
            this.f79805a = lrVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(a4.k0 k0Var, tq.e<? super oq.i0> eVar) {
            Object objE = ju.q0.e(new a(k0Var, this.f79805a, null), eVar);
            return objE == uq.b.e() ? objE : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lr f79827a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f79828e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f79829f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a4.k0 f79830g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ lr f79831h;

            /* JADX INFO: renamed from: h2.h0$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
            static final class C1822a extends vq.i implements er.p<a4.c, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f79832c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f79833d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f79834e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ ju.p0 f79835f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ lr f79836g;

                /* JADX INFO: renamed from: h2.h0$e$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
                static final class C1823a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f79837e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ lr f79838f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1823a(lr lrVar, tq.e<? super C1823a> eVar) {
                        super(2, eVar);
                        this.f79838f = lrVar;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        Object objE = uq.b.e();
                        int i15 = this.f79837e;
                        if (i15 == 0) {
                            oq.u.b(obj);
                            lr lrVar = this.f79838f;
                            w0.z1 z1Var = w0.z1.UserInput;
                            this.f79837e = 1;
                            if (lrVar.b(z1Var, this) == objE) {
                                return objE;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                        }
                        return oq.i0.f148189a;
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                        return ((C1823a) v(p0Var, eVar)).J(oq.i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                        return new C1823a(this.f79838f, eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1822a(ju.p0 p0Var, lr lrVar, tq.e<? super C1822a> eVar) {
                    super(2, eVar);
                    this.f79835f = p0Var;
                    this.f79836g = lrVar;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:14:0x0053  */
                /* JADX WARN: Code duplicated, block: B:16:0x0063  */
                /* JADX WARN: Code duplicated, block: B:17:0x0075  */
                /* JADX WARN: Code duplicated, block: B:19:0x007f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0035
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // vq.a
                public final java.lang.Object J(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = uq.b.e()
                        int r1 = r12.f79833d
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r12.f79832c
                        a4.q r1 = (a4.q) r1
                        java.lang.Object r3 = r12.f79834e
                        a4.c r3 = (a4.c) r3
                        oq.u.b(r13)
                        goto L36
                    L17:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1f:
                        oq.u.b(r13)
                        java.lang.Object r13 = r12.f79834e
                        a4.c r13 = (a4.c) r13
                        a4.q r1 = a4.q.Main
                        r3 = r13
                    L29:
                        r12.f79834e = r3
                        r12.f79832c = r1
                        r12.f79833d = r2
                        java.lang.Object r13 = r3.k2(r1, r12)
                        if (r13 != r0) goto L36
                        return r0
                    L36:
                        a4.o r13 = (a4.o) r13
                        java.util.List r4 = r13.c()
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        a4.b0 r4 = (a4.PointerInputChange) r4
                        int r4 = r4.getType()
                        a4.p0$a r5 = a4.p0.INSTANCE
                        int r5 = r5.b()
                        boolean r4 = a4.p0.i(r4, r5)
                        if (r4 == 0) goto L29
                        int r13 = r13.getType()
                        a4.s$a r4 = a4.s.INSTANCE
                        int r5 = r4.a()
                        boolean r5 = a4.s.o(r13, r5)
                        if (r5 == 0) goto L75
                        ju.p0 r6 = r12.f79835f
                        h2.h0$e$a$a$a r9 = new h2.h0$e$a$a$a
                        f2.lr r13 = r12.f79836g
                        r4 = 0
                        r9.<init>(r13, r4)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        ju.i.d(r6, r7, r8, r9, r10, r11)
                        goto L29
                    L75:
                        int r4 = r4.b()
                        boolean r13 = a4.s.o(r13, r4)
                        if (r13 == 0) goto L29
                        f2.lr r13 = r12.f79836g
                        boolean r13 = r13.getIsPersistent()
                        if (r13 != 0) goto L29
                        f2.lr r13 = r12.f79836g
                        r13.dismiss()
                        goto L29
                    */
                    throw new UnsupportedOperationException("Method not decompiled: h2.h0.e.a.C1822a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
                public final Object B(a4.c cVar, tq.e<? super oq.i0> eVar) {
                    return ((C1822a) v(cVar, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    C1822a c1822a = new C1822a(this.f79835f, this.f79836g, eVar);
                    c1822a.f79834e = obj;
                    return c1822a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a4.k0 k0Var, lr lrVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f79830g = k0Var;
                this.f79831h = lrVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f79828e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.p0 p0Var = (ju.p0) this.f79829f;
                    a4.k0 k0Var = this.f79830g;
                    C1822a c1822a = new C1822a(p0Var, this.f79831h, null);
                    this.f79828e = 1;
                    if (k0Var.D1(c1822a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f79830g, this.f79831h, eVar);
                aVar.f79829f = obj;
                return aVar;
            }
        }

        e(lr lrVar) {
            this.f79827a = lrVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(a4.k0 k0Var, tq.e<? super oq.i0> eVar) {
            Object objE = ju.q0.e(new a(k0Var, this.f79827a, null), eVar);
            return objE == uq.b.e() ? objE : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l3.l0 f79840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p076m2.a3<Boolean> f79841g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ lr f79842h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l3.l0 l0Var, p076m2.a3<Boolean> a3Var, lr lrVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f79840f = l0Var;
            this.f79841g = a3Var;
            this.f79842h = lrVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79839e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f79840f.b()) {
                    this.f79841g.setValue(vq.b.a(true));
                    lr lrVar = this.f79842h;
                    w0.z1 z1Var = w0.z1.PreventUserInput;
                    this.f79839e = 1;
                    if (lrVar.b(z1Var, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            if (this.f79841g.getValue().booleanValue() && this.f79842h.getIsVisible() && !this.f79840f.b()) {
                this.f79841g.setValue(vq.b.a(false));
                this.f79842h.dismiss();
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f79840f, this.f79841g, this.f79842h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lr f79843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p076m2.a3<Boolean> f79844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f79845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p076m2.a3<Boolean> f79846d;

        g(lr lrVar, p076m2.a3<Boolean> a3Var, boolean z15, p076m2.a3<Boolean> a3Var2) {
            this.f79843a = lrVar;
            this.f79844b = a3Var;
            this.f79845c = z15;
            this.f79846d = a3Var2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (!this.f79843a.getIsVisible()) {
                this.f79844b.setValue(Boolean.FALSE);
            } else {
                if (this.f79845c && h0.B(keyEvent)) {
                    p076m2.a3<Boolean> a3Var = this.f79844b;
                    Boolean bool = Boolean.TRUE;
                    a3Var.setValue(bool);
                    return bool;
                }
                if (h0.A(keyEvent)) {
                    this.f79846d.setValue(Boolean.FALSE);
                    this.f79843a.dismiss();
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(KeyEvent keyEvent) {
        return y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a()) && y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(KeyEvent keyEvent) {
        return y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a()) && y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.J());
    }

    private static final f3.m C(f3.m mVar, boolean z15, final lr lrVar, final ju.p0 p0Var, boolean z16, p076m2.a3<Boolean> a3Var, final p076m2.a3<Boolean> a3Var2) {
        if (z15) {
            return y3.f.b(l3.e.a(mVar, new er.l() { // from class: h2.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.D(p0Var, a3Var2, lrVar, (l3.l0) obj);
                }
            }), new g(lrVar, a3Var, z16, a3Var2));
        }
        a3Var.setValue(Boolean.FALSE);
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(ju.p0 p0Var, p076m2.a3 a3Var, lr lrVar, l3.l0 l0Var) {
        ju.k.d(p0Var, null, null, new f(l0Var, a3Var, lrVar, null), 3, null);
        return oq.i0.f148189a;
    }

    public static final lr E(boolean z15, boolean z16, w0.b2 b2Var, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            z15 = false;
        }
        if ((i16 & 2) != 0) {
            z16 = true;
        }
        if ((i16 & 4) != 0) {
            b2Var = w.f80001a.a();
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-1483057531, i15, -1, "androidx.compose.material3.internal.rememberBasicTooltipState (BasicTooltip.kt:367)");
        }
        boolean z17 = ((((i15 & 112) ^ 48) > 32 && rVar.a(z16)) || (i15 & 48) == 32) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(b2Var)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256);
        Object objE = rVar.E();
        if (z17 || objE == p076m2.r.INSTANCE.a()) {
            objE = new i0(z15, z16, b2Var);
            rVar.v(objE);
        }
        i0 i0Var = (i0) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    private static final f6<Boolean> F(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1960751094, i15, -1, "androidx.compose.material3.internal.rememberTouchExplorationOrSwitchAccessServiceState (BasicTooltip.kt:477)");
        }
        f6<Boolean> f6VarN = h.n(true, true, false, rVar, 438, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarN;
    }

    private static final boolean G(boolean z15, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-935001672, i15, -1, "androidx.compose.material3.internal.shouldForceFocusableForA11y (BasicTooltip.kt:139)");
        }
        boolean z16 = F(rVar, 0).getValue().booleanValue() || z15;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return z16;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0188  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:130:0x0204  */
    /* JADX WARN: Code duplicated, block: B:132:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0212  */
    /* JADX WARN: Code duplicated, block: B:137:0x023d  */
    /* JADX WARN: Code duplicated, block: B:140:0x027f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0292  */
    /* JADX WARN: Code duplicated, block: B:150:0x0298  */
    /* JADX WARN: Code duplicated, block: B:153:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    public static final void k(final androidx.compose.ui.window.t tVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, lr lrVar, f3.m mVar, er.a<oq.i0> aVar, boolean z15, boolean z16, boolean z17, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar2, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.p<? super p076m2.r, ? super Integer, oq.i0> pVar3;
        f3.m mVar2;
        int i18;
        er.a<oq.i0> aVar2;
        int i19;
        int i25;
        int i26;
        boolean z18;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        boolean z19;
        boolean z25;
        final lr lrVar2;
        final boolean z26;
        final f3.m mVar3;
        final er.a<oq.i0> aVar3;
        final boolean z27;
        final boolean z28;
        d5 d5VarM;
        f3.m mVar4;
        er.a<oq.i0> aVar4;
        boolean z29;
        boolean z35;
        Object objE;
        p076m2.r.Companion companion;
        ju.p0 p0Var;
        Object objE2;
        p076m2.a3 a3Var;
        boolean zG;
        er.a<androidx.compose.ui.node.c> aVarB;
        p076m2.a3 a3Var2;
        Object objE3;
        boolean z36;
        int i37;
        p076m2.r rVarH = rVar.h(-1221877520);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(tVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            pVar3 = pVar;
            i17 |= rVarH.G(pVar3) ? 32 : 16;
        } else {
            pVar3 = pVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= (i15 & 512) == 0 ? rVarH.W(lrVar) : rVarH.G(lrVar) ? 256 : 128;
        }
        int i38 = i16 & 8;
        if (i38 == 0) {
            if ((i15 & 3072) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    i17 |= 196608;
                    i26 = 196608;
                    z18 = z15;
                } else {
                    i26 = 196608;
                    z18 = z15;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z18)) {
                            i27 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i27 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.a(z16)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                i35 = i16 & 128;
                if (i35 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.a(z17)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i17 |= i36;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(pVar2)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i17 |= i37;
                }
                z19 = true;
                if ((i17 & 38347923) != 38347922) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (rVarH.r(z25, i17 & 1)) {
                    if (i38 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        z29 = true;
                    } else {
                        z29 = z16;
                    }
                    if (i35 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1221877520, i17, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:105)");
                    }
                    objE = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (ju.p0) objE;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(Boolean.FALSE, null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (p076m2.a3) objE2;
                    if (z35) {
                        rVarH.X(-1698204881);
                        zG = G(((Boolean) a3Var.getValue()).booleanValue(), rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-1104742522);
                        rVarH.R();
                        zG = false;
                    }
                    f3.m.Companion companion2 = f3.m.INSTANCE;
                    p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT = rVarH.t();
                    f3.m mVarE = f3.j.e(rVarH, companion2);
                    androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                    boolean z37 = zG;
                    aVarB = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC = n6.c(rVarH);
                    n6.i(rVarC, w0VarI, companion3.d());
                    n6.i(rVarC, e0VarT, companion3.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                    n6.g(rVarC, companion3.a());
                    n6.i(rVarC, mVarE, companion3.e());
                    d1.x xVar = d1.x.f39368a;
                    if (lrVar.getIsVisible()) {
                        rVarH.X(-1891243071);
                        if (!z18 || z37) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        er.p<? super p076m2.r, ? super Integer, oq.i0> pVar4 = pVar3;
                        a3Var2 = a3Var;
                        n(tVar, lrVar, aVar4, p0Var, z36, a3Var2, pVar4, rVarH, (i17 & 14) | i26 | ((i17 >> 3) & 112) | ((i17 >> 6) & 896) | ((i17 << 15) & 3670016));
                        rVarH = rVarH;
                        rVarH.R();
                    } else {
                        a3Var2 = a3Var;
                        rVarH.X(-1890863476);
                        rVarH.R();
                    }
                    int i39 = ((i17 >> 18) & 14) | MLKEMEngine.KyberPolyBytes | ((i17 >> 3) & 112) | ((i17 >> 12) & 7168) | (57344 & (i17 << 3)) | ((i17 >> 9) & 458752);
                    lrVar2 = lrVar;
                    boolean z38 = z29;
                    boolean z39 = z35;
                    mVar3 = mVar4;
                    s(z38, lrVar2, a3Var2, z39, mVar3, pVar2, rVarH, i39, 0);
                    rVarH.x();
                    if ((i17 & 896) != 256 && ((i17 & 512) == 0 || !rVarH.G(lrVar2))) {
                        z19 = false;
                    }
                    objE3 = rVarH.E();
                    if (z19 || objE3 == companion.a()) {
                        objE3 = new er.l() { // from class: h2.x
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h0.l(lrVar2, (p076m2.s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    Function0.a(lrVar2, (er.l) objE3, rVarH, (i17 >> 6) & 14);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    z26 = z38;
                    z27 = z39;
                    aVar3 = aVar4;
                } else {
                    lrVar2 = lrVar;
                    rVarH.O();
                    z26 = z16;
                    mVar3 = mVar2;
                    aVar3 = aVar2;
                    z27 = z17;
                }
                p076m2.r rVar2 = rVarH;
                z28 = z18;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final lr lrVar3 = lrVar2;
                    d5VarM.a(new er.p() { // from class: h2.y
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h0.m(tVar, pVar, lrVar3, mVar3, aVar3, z28, z26, z27, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            aVar2 = aVar;
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
                i26 = 196608;
                z18 = z15;
            } else {
                i26 = 196608;
                z18 = z15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z18)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.a(z16)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.a(z17)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i17 |= i36;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(pVar2)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i17 |= i37;
            }
            z19 = true;
            if ((i17 & 38347923) != 38347922) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (rVarH.r(z25, i17 & 1)) {
                if (i38 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    z29 = true;
                } else {
                    z29 = z16;
                }
                if (i35 != 0) {
                    z35 = false;
                } else {
                    z35 = z17;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1221877520, i17, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:105)");
                }
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (ju.p0) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = c6.e(Boolean.FALSE, null, 2, null);
                    rVarH.v(objE2);
                }
                a3Var = (p076m2.a3) objE2;
                if (z35) {
                    rVarH.X(-1698204881);
                    zG = G(((Boolean) a3Var.getValue()).booleanValue(), rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-1104742522);
                    rVarH.R();
                    zG = false;
                }
                f3.m.Companion companion4 = f3.m.INSTANCE;
                p036e4.w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, companion4);
                androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                boolean z310 = zG;
                aVarB = companion5.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI2, companion5.d());
                n6.i(rVarC2, e0VarT2, companion5.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
                n6.g(rVarC2, companion5.a());
                n6.i(rVarC2, mVarE2, companion5.e());
                d1.x xVar2 = d1.x.f39368a;
                if (lrVar.getIsVisible()) {
                    rVarH.X(-1891243071);
                    if (z18) {
                        z36 = true;
                    } else {
                        z36 = true;
                    }
                    er.p<? super p076m2.r, ? super Integer, oq.i0> pVar5 = pVar3;
                    a3Var2 = a3Var;
                    n(tVar, lrVar, aVar4, p0Var, z36, a3Var2, pVar5, rVarH, (i17 & 14) | i26 | ((i17 >> 3) & 112) | ((i17 >> 6) & 896) | ((i17 << 15) & 3670016));
                    rVarH = rVarH;
                    rVarH.R();
                } else {
                    a3Var2 = a3Var;
                    rVarH.X(-1890863476);
                    rVarH.R();
                }
                int i310 = ((i17 >> 18) & 14) | MLKEMEngine.KyberPolyBytes | ((i17 >> 3) & 112) | ((i17 >> 12) & 7168) | (57344 & (i17 << 3)) | ((i17 >> 9) & 458752);
                lrVar2 = lrVar;
                boolean z311 = z29;
                boolean z312 = z35;
                mVar3 = mVar4;
                s(z311, lrVar2, a3Var2, z312, mVar3, pVar2, rVarH, i310, 0);
                rVarH.x();
                if ((i17 & 896) != 256) {
                    z19 = false;
                }
                objE3 = rVarH.E();
                if (z19) {
                    objE3 = new er.l() { // from class: h2.x
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h0.l(lrVar2, (p076m2.s0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: h2.x
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h0.l(lrVar2, (p076m2.s0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                Function0.a(lrVar2, (er.l) objE3, rVarH, (i17 >> 6) & 14);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z26 = z311;
                z27 = z312;
                aVar3 = aVar4;
            } else {
                lrVar2 = lrVar;
                rVarH.O();
                z26 = z16;
                mVar3 = mVar2;
                aVar3 = aVar2;
                z27 = z17;
            }
            p076m2.r rVar3 = rVarH;
            z28 = z18;
            d5VarM = rVar3.m();
            if (d5VarM != null) {
                final lr lrVar4 = lrVar2;
                d5VarM.a(new er.p() { // from class: h2.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h0.m(tVar, pVar, lrVar4, mVar3, aVar3, z28, z26, z27, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        mVar2 = mVar;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                aVar2 = aVar;
                if (rVarH.G(aVar2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
                i26 = 196608;
                z18 = z15;
            } else {
                i26 = 196608;
                z18 = z15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z18)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.a(z16)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.a(z17)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i17 |= i36;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(pVar2)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i17 |= i37;
            }
            z19 = true;
            if ((i17 & 38347923) != 38347922) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (rVarH.r(z25, i17 & 1)) {
                if (i38 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    z29 = true;
                } else {
                    z29 = z16;
                }
                if (i35 != 0) {
                    z35 = false;
                } else {
                    z35 = z17;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1221877520, i17, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:105)");
                }
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (ju.p0) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = c6.e(Boolean.FALSE, null, 2, null);
                    rVarH.v(objE2);
                }
                a3Var = (p076m2.a3) objE2;
                if (z35) {
                    rVarH.X(-1698204881);
                    zG = G(((Boolean) a3Var.getValue()).booleanValue(), rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-1104742522);
                    rVarH.R();
                    zG = false;
                }
                f3.m.Companion companion6 = f3.m.INSTANCE;
                p036e4.w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, companion6);
                androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
                boolean z313 = zG;
                aVarB = companion7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarI3, companion7.d());
                n6.i(rVarC3, e0VarT3, companion7.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion7.c());
                n6.g(rVarC3, companion7.a());
                n6.i(rVarC3, mVarE3, companion7.e());
                d1.x xVar3 = d1.x.f39368a;
                if (lrVar.getIsVisible()) {
                    rVarH.X(-1891243071);
                    if (z18) {
                        z36 = true;
                    } else {
                        z36 = true;
                    }
                    er.p<? super p076m2.r, ? super Integer, oq.i0> pVar6 = pVar3;
                    a3Var2 = a3Var;
                    n(tVar, lrVar, aVar4, p0Var, z36, a3Var2, pVar6, rVarH, (i17 & 14) | i26 | ((i17 >> 3) & 112) | ((i17 >> 6) & 896) | ((i17 << 15) & 3670016));
                    rVarH = rVarH;
                    rVarH.R();
                } else {
                    a3Var2 = a3Var;
                    rVarH.X(-1890863476);
                    rVarH.R();
                }
                int i311 = ((i17 >> 18) & 14) | MLKEMEngine.KyberPolyBytes | ((i17 >> 3) & 112) | ((i17 >> 12) & 7168) | (57344 & (i17 << 3)) | ((i17 >> 9) & 458752);
                lrVar2 = lrVar;
                boolean z314 = z29;
                boolean z315 = z35;
                mVar3 = mVar4;
                s(z314, lrVar2, a3Var2, z315, mVar3, pVar2, rVarH, i311, 0);
                rVarH.x();
                if ((i17 & 896) != 256) {
                    z19 = false;
                }
                objE3 = rVarH.E();
                if (z19) {
                    objE3 = new er.l() { // from class: h2.x
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h0.l(lrVar2, (p076m2.s0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: h2.x
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h0.l(lrVar2, (p076m2.s0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                Function0.a(lrVar2, (er.l) objE3, rVarH, (i17 >> 6) & 14);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z26 = z314;
                z27 = z315;
                aVar3 = aVar4;
            } else {
                lrVar2 = lrVar;
                rVarH.O();
                z26 = z16;
                mVar3 = mVar2;
                aVar3 = aVar2;
                z27 = z17;
            }
            p076m2.r rVar4 = rVarH;
            z28 = z18;
            d5VarM = rVar4.m();
            if (d5VarM != null) {
                final lr lrVar5 = lrVar2;
                d5VarM.a(new er.p() { // from class: h2.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h0.m(tVar, pVar, lrVar5, mVar3, aVar3, z28, z26, z27, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        aVar2 = aVar;
        i25 = i16 & 32;
        if (i25 != 0) {
            i17 |= 196608;
            i26 = 196608;
            z18 = z15;
        } else {
            i26 = 196608;
            z18 = z15;
            if ((i15 & 196608) == 0) {
                if (rVarH.a(z18)) {
                    i27 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i27 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i27;
            }
        }
        i28 = i16 & 64;
        if (i28 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.a(z16)) {
                i29 = PKIFailureInfo.badCertTemplate;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i29;
        }
        i35 = i16 & 128;
        if (i35 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.a(z17)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i17 |= i36;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.G(pVar2)) {
                i37 = 67108864;
            } else {
                i37 = 33554432;
            }
            i17 |= i37;
        }
        z19 = true;
        if ((i17 & 38347923) != 38347922) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (rVarH.r(z25, i17 & 1)) {
            if (i38 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (i25 != 0) {
                z18 = false;
            }
            if (i28 != 0) {
                z29 = true;
            } else {
                z29 = z16;
            }
            if (i35 != 0) {
                z35 = false;
            } else {
                z35 = z17;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1221877520, i17, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:105)");
            }
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            p0Var = (ju.p0) objE;
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE2);
            }
            a3Var = (p076m2.a3) objE2;
            if (z35) {
                rVarH.X(-1698204881);
                zG = G(((Boolean) a3Var.getValue()).booleanValue(), rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(-1104742522);
                rVarH.R();
                zG = false;
            }
            f3.m.Companion companion8 = f3.m.INSTANCE;
            p036e4.w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, companion8);
            androidx.compose.ui.node.c.Companion companion9 = androidx.compose.ui.node.c.INSTANCE;
            boolean z316 = zG;
            aVarB = companion9.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI4, companion9.d());
            n6.i(rVarC4, e0VarT4, companion9.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion9.c());
            n6.g(rVarC4, companion9.a());
            n6.i(rVarC4, mVarE4, companion9.e());
            d1.x xVar4 = d1.x.f39368a;
            if (lrVar.getIsVisible()) {
                rVarH.X(-1891243071);
                if (z18) {
                    z36 = true;
                } else {
                    z36 = true;
                }
                er.p<? super p076m2.r, ? super Integer, oq.i0> pVar7 = pVar3;
                a3Var2 = a3Var;
                n(tVar, lrVar, aVar4, p0Var, z36, a3Var2, pVar7, rVarH, (i17 & 14) | i26 | ((i17 >> 3) & 112) | ((i17 >> 6) & 896) | ((i17 << 15) & 3670016));
                rVarH = rVarH;
                rVarH.R();
            } else {
                a3Var2 = a3Var;
                rVarH.X(-1890863476);
                rVarH.R();
            }
            int i312 = ((i17 >> 18) & 14) | MLKEMEngine.KyberPolyBytes | ((i17 >> 3) & 112) | ((i17 >> 12) & 7168) | (57344 & (i17 << 3)) | ((i17 >> 9) & 458752);
            lrVar2 = lrVar;
            boolean z317 = z29;
            boolean z318 = z35;
            mVar3 = mVar4;
            s(z317, lrVar2, a3Var2, z318, mVar3, pVar2, rVarH, i312, 0);
            rVarH.x();
            if ((i17 & 896) != 256) {
                z19 = false;
            }
            objE3 = rVarH.E();
            if (z19) {
                objE3 = new er.l() { // from class: h2.x
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.l(lrVar2, (p076m2.s0) obj);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.l() { // from class: h2.x
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.l(lrVar2, (p076m2.s0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            Function0.a(lrVar2, (er.l) objE3, rVarH, (i17 >> 6) & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            z26 = z317;
            z27 = z318;
            aVar3 = aVar4;
        } else {
            lrVar2 = lrVar;
            rVarH.O();
            z26 = z16;
            mVar3 = mVar2;
            aVar3 = aVar2;
            z27 = z17;
        }
        p076m2.r rVar5 = rVarH;
        z28 = z18;
        d5VarM = rVar5.m();
        if (d5VarM != null) {
            final lr lrVar6 = lrVar2;
            d5VarM.a(new er.p() { // from class: h2.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.m(tVar, pVar, lrVar6, mVar3, aVar3, z28, z26, z27, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 l(lr lrVar, p076m2.s0 s0Var) {
        return new a(lrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(androidx.compose.ui.window.t tVar, er.p pVar, lr lrVar, f3.m mVar, er.a aVar, boolean z15, boolean z16, boolean z17, er.p pVar2, int i15, int i16, p076m2.r rVar, int i17) {
        k(tVar, pVar, lrVar, mVar, aVar, z15, z16, z17, pVar2, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void n(final androidx.compose.ui.window.t tVar, final lr lrVar, final er.a<oq.i0> aVar, final ju.p0 p0Var, final boolean z15, final p076m2.a3<Boolean> a3Var, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1413720282);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(tVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(lrVar) : rVarH.G(lrVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(p0Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.a(z15) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.W(a3Var) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(pVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (rVarH.r((599187 & i16) != 599186, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1413720282, i16, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:183)");
            }
            final String strA = j0.f79875a.a(rVarH, 6);
            boolean zG = ((i16 & 896) == 256) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(lrVar))) | rVarH.G(p0Var) | ((458752 & i16) == 131072);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: h2.z
                    @Override // er.a
                    public final Object a() {
                        return h0.o(aVar, lrVar, p0Var, a3Var);
                    }
                };
                rVarH.v(objE);
            }
            androidx.compose.ui.window.b.a(tVar, (er.a) objE, new androidx.compose.ui.window.u(z15, false, false, false, false, 22, null), y2.m.d(-1287705660, true, new er.p() { // from class: h2.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.p(strA, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i16 & 14) | 3072, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.r(tVar, lrVar, aVar, p0Var, z15, a3Var, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(er.a aVar, lr lrVar, ju.p0 p0Var, p076m2.a3 a3Var) {
        if (aVar != null) {
            aVar.a();
        } else if (lrVar.getIsVisible()) {
            ju.k.d(p0Var, null, null, new b(lrVar, null), 3, null);
            a3Var.setValue(Boolean.FALSE);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(final String str, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1287705660, i15, -1, "androidx.compose.material3.internal.TooltipPopup.<anonymous> (BasicTooltip.kt:200)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean zW = rVar.W(str);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: h2.e0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.q(str, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(String str, n4.i0 i0Var) {
        n4.f0.l0(i0Var, n4.i.INSTANCE.a());
        n4.f0.n0(i0Var, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(androidx.compose.ui.window.t tVar, lr lrVar, er.a aVar, ju.p0 p0Var, boolean z15, p076m2.a3 a3Var, er.p pVar, int i15, p076m2.r rVar, int i16) {
        n(tVar, lrVar, aVar, p0Var, z15, a3Var, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x011c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    private static final void s(final boolean z15, final lr lrVar, final p076m2.a3<Boolean> a3Var, final boolean z16, f3.m mVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        boolean z17;
        f3.m mVar2;
        int i18;
        boolean z18;
        final f3.m mVar3;
        d5 d5VarM;
        Object objE;
        p076m2.r.Companion companion;
        Object objE2;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i19;
        p076m2.r rVarH = rVar.h(1873232064);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(lrVar) : rVarH.G(lrVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(a3Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            z17 = z16;
            i17 |= rVarH.a(z17) ? 2048 : 1024;
        } else {
            z17 = z16;
        }
        int i25 = i16 & 16;
        if (i25 == 0) {
            if ((i15 & 24576) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i15) == 0) {
                if (rVarH.G(pVar)) {
                    i19 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i19 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i19;
            }
            i18 = i17;
            if ((74899 & i18) != 74898) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i18 & 1)) {
                if (i25 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1873232064, i18, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:152)");
                }
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                ju.p0 p0Var = (ju.p0) objE;
                String strB = j0.f79875a.b(rVarH, 6);
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = c6.e(Boolean.FALSE, null, 2, null);
                    rVarH.v(objE2);
                }
                f3.m mVarC = C(w(z(mVar2, z15, lrVar), strB, z15, lrVar, p0Var), z15, lrVar, p0Var, z17, a3Var, (p076m2.a3) objE2);
                p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarC);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                d1.x xVar = d1.x.f39368a;
                pVar.B(rVarH, Integer.valueOf((i18 >> 15) & 14));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            mVar3 = mVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: h2.c0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h0.t(z15, lrVar, a3Var, z16, mVar3, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        mVar2 = mVar;
        if ((196608 & i15) == 0) {
            if (rVarH.G(pVar)) {
                i19 = PKIFailureInfo.unsupportedVersion;
            } else {
                i19 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i19;
        }
        i18 = i17;
        if ((74899 & i18) != 74898) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (rVarH.r(z18, i18 & 1)) {
            if (i25 != 0) {
                mVar2 = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1873232064, i18, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:152)");
            }
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            ju.p0 p0Var2 = (ju.p0) objE;
            String strB2 = j0.f79875a.b(rVarH, 6);
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE2);
            }
            f3.m mVarC2 = C(w(z(mVar2, z15, lrVar), strB2, z15, lrVar, p0Var2), z15, lrVar, p0Var2, z17, a3Var, (p076m2.a3) objE2);
            p036e4.w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar2 = d1.x.f39368a;
            pVar.B(rVarH, Integer.valueOf((i18 >> 15) & 14));
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        mVar3 = mVar2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.t(z15, lrVar, a3Var, z16, mVar3, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(boolean z15, lr lrVar, p076m2.a3 a3Var, boolean z16, f3.m mVar, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        s(z15, lrVar, a3Var, z16, mVar, pVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final f3.m w(f3.m mVar, final String str, boolean z15, final lr lrVar, final ju.p0 p0Var) {
        return z15 ? r0.e(mVar, new er.l() { // from class: h2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.x(str, p0Var, lrVar, (n4.i0) obj);
            }
        }) : mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(String str, final ju.p0 p0Var, final lr lrVar, n4.i0 i0Var) {
        n4.f0.D(i0Var, str, new er.a() { // from class: h2.g0
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(h0.y(p0Var, lrVar));
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(ju.p0 p0Var, lr lrVar) {
        ju.k.d(p0Var, null, null, new c(lrVar, null), 3, null);
        return true;
    }

    private static final f3.m z(f3.m mVar, boolean z15, lr lrVar) {
        return z15 ? a4.w0.c(a4.w0.c(mVar, lrVar, new d(lrVar)), lrVar, new e(lrVar)) : mVar;
    }
}
