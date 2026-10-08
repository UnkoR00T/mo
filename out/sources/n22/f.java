package n22;

import cb4.DialogData;
import eo0.y0;
import er.l;
import er.q;
import f00.j0;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import k10.o;
import k10.t;
import k10.z;
import m02.SearchModel;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import st3.AddressData;
import tt3.AddressSearchItemData;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004:\u00011B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Ln22/f;", "Ll00/g;", "Ln22/b;", "Ln22/a;", "", "Lyy/a;", "stateMachineFactory", "Lc12/g;", "dialogMapper", "Lx02/d;", "getMessageServiceTypeUC", "Lm22/h;", "messageWizardContract", "<init>", "(Lyy/a;Lc12/g;Lx02/d;Lm22/h;)V", "Lst3/f$a;", "event", "Loq/i0;", "m9", "(Lst3/f$a;)V", "b", "Lc12/g;", "c", "Lx02/d;", "d", "Lm22/h;", "e", "Ln22/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ln22/a$e;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Ln22/c;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends l00.g<n22.b, n22.a> implements l00.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c12.g dialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x02.d getMessageServiceTypeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m22.h messageWizardContract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n22.b initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<n22.b, n22.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n22.a.e> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<n22.c> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ln22/f$a;", "", "Lm22/h;", "Ln22/f;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0 {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n22.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f130801a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f130802a;

            /* JADX INFO: renamed from: n22.f$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3249a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f130803d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f130804e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f130805f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f130807h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f130808j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f130809k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f130810l;

                public C3249a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f130803d = obj;
                    this.f130804e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f130802a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3249a c3249a;
                if (eVar instanceof C3249a) {
                    c3249a = (C3249a) eVar;
                    int i15 = c3249a.f130804e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3249a.f130804e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3249a = new C3249a(eVar);
                    }
                } else {
                    c3249a = new C3249a(eVar);
                }
                Object obj2 = c3249a.f130803d;
                Object objE = uq.b.e();
                int i16 = c3249a.f130804e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f130802a;
                    n22.c cVar = n22.c.f130791a;
                    c3249a.f130805f = j.a(obj);
                    c3249a.f130807h = j.a(c3249a);
                    c3249a.f130808j = j.a(obj);
                    c3249a.f130809k = j.a(hVar);
                    c3249a.f130810l = 0;
                    c3249a.f130804e = 1;
                    if (hVar.F(cVar, c3249a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar) {
            this.f130801a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n22.c> hVar, tq.e eVar) {
            Object objA = this.f130801a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln22/a$a;", "action", "Ln22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln22/a$a;Ln22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements q<n22.a.Back, n22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f130812f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n22.a.Back back = (n22.a.Back) this.f130812f;
            Object objE = uq.b.e();
            int i15 = this.f130811e;
            if (i15 == 0) {
                u.b(obj);
                AddressData addressData = back.getAddressData();
                if (addressData != null) {
                    f.this.messageWizardContract.N4(new o02.b.CorrespondenceAddress(addressData));
                }
                xw.b<n22.a.e> bVarY1 = f.this.Y1();
                n22.a.e.C3247a c3247a = n22.a.e.C3247a.f130782a;
                this.f130812f = j.a(back);
                this.f130811e = 1;
                if (bVarY1.F(c3247a, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n22.a.Back back, n22.b bVar, tq.e<? super i0> eVar) {
            c cVar = f.this.new c(eVar);
            cVar.f130812f = back;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln22/a$g;", "<unused var>", "Ln22/b;", "Loq/i0;", "<anonymous>", "(Ln22/a$g;Ln22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements q<n22.a.g, n22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f130814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f130815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f130816g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f130817h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f130818j;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f130818j;
            if (i15 == 0) {
                u.b(obj);
                y0 y0VarB = f.this.getMessageServiceTypeUC.b(new x02.d.Params(f.this.messageWizardContract, f.this.messageWizardContract));
                f fVar = f.this;
                DialogData dialogDataB = fVar.dialogMapper.b(new c12.g.Params(fVar.b9(n22.a.f.f130788a), y0VarB, null, 4, null));
                xw.b<n22.a.e> bVarY1 = fVar.Y1();
                n22.a.e.ShowDialog showDialog = new n22.a.e.ShowDialog(dialogDataB);
                this.f130814e = j.a(y0VarB);
                this.f130815f = j.a(dialogDataB);
                this.f130816g = 0;
                this.f130817h = 0;
                this.f130818j = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n22.a.g gVar, n22.b bVar, tq.e<? super i0> eVar) {
            return f.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln22/a$f;", "<unused var>", "Ln22/b;", "Loq/i0;", "<anonymous>", "(Ln22/a$f;Ln22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements q<n22.a.f, n22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130820e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f130820e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n22.a.e> bVarY1 = f.this.Y1();
                n22.a.e.C3248e c3248e = n22.a.e.C3248e.f130786a;
                this.f130820e = 1;
                if (bVarY1.F(c3248e, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n22.a.f fVar, n22.b bVar, tq.e<? super i0> eVar) {
            return f.this.new e(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: n22.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln22/a$c;", "action", "Ln22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln22/a$c;Ln22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3250f extends k implements q<n22.a.GoToNextScreen, n22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f130823f;

        C3250f(tq.e<? super C3250f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n22.a.GoToNextScreen goToNextScreen = (n22.a.GoToNextScreen) this.f130823f;
            Object objE = uq.b.e();
            int i15 = this.f130822e;
            if (i15 == 0) {
                u.b(obj);
                f.this.messageWizardContract.N4(new o02.b.CorrespondenceAddress(goToNextScreen.getResult()));
                xw.b<n22.a.e> bVarY1 = f.this.Y1();
                n22.a.e.d dVar = n22.a.e.d.f130785a;
                this.f130823f = j.a(goToNextScreen);
                this.f130822e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n22.a.GoToNextScreen goToNextScreen, n22.b bVar, tq.e<? super i0> eVar) {
            C3250f c3250f = f.this.new C3250f(eVar);
            c3250f.f130823f = goToNextScreen;
            return c3250f.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln22/a$b;", "action", "Ln22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln22/a$b;Ln22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends k implements q<n22.a.GoToError, n22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f130826f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n22.a.GoToError goToError = (n22.a.GoToError) this.f130826f;
            Object objE = uq.b.e();
            int i15 = this.f130825e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n22.a.e> bVarY1 = f.this.Y1();
                n22.a.e.GoToError goToError2 = new n22.a.e.GoToError(goToError.getErrorData());
                this.f130826f = j.a(goToError);
                this.f130825e = 1;
                if (bVarY1.F(goToError2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n22.a.GoToError goToError, n22.b bVar, tq.e<? super i0> eVar) {
            g gVar = f.this.new g(eVar);
            gVar.f130826f = goToError;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln22/a$d;", "action", "Ln22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln22/a$d;Ln22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends k implements q<n22.a.GoToSearch, n22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f130829f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n22.a.GoToSearch goToSearch = (n22.a.GoToSearch) this.f130829f;
            Object objE = uq.b.e();
            int i15 = this.f130828e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n22.a.e> bVarY1 = f.this.Y1();
                Label titleLabel = goToSearch.getModel().getTitleLabel();
                List<AddressSearchItemData> listB = goToSearch.getModel().b();
                ArrayList arrayList = new ArrayList(v.y(listB, 10));
                for (AddressSearchItemData addressSearchItemData : listB) {
                    arrayList.add(new SearchModel.Item(addressSearchItemData.getLabel(), addressSearchItemData.getDescription(), addressSearchItemData.getIsSelected(), addressSearchItemData.c()));
                }
                n22.a.e.GoToSearch goToSearch2 = new n22.a.e.GoToSearch(new SearchModel(titleLabel, arrayList));
                this.f130829f = j.a(goToSearch);
                this.f130828e = 1;
                if (bVarY1.F(goToSearch2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n22.a.GoToSearch goToSearch, n22.b bVar, tq.e<? super i0> eVar) {
            h hVar = f.this.new h(eVar);
            hVar.f130829f = goToSearch;
            return hVar.J(i0.f148189a);
        }
    }

    public f(yy.a aVar, c12.g gVar, x02.d dVar, m22.h hVar) {
        this.dialogMapper = gVar;
        this.getMessageServiceTypeUC = dVar;
        this.messageWizardContract = hVar;
        n22.b bVar = n22.b.f130790a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new l() { // from class: n22.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.o9(this.f130793a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState()), n22.c.f130791a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final f fVar, k10.v vVar) {
        vVar.c(q0.c(n22.b.class), new l() { // from class: n22.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.p9(this.f130792a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(f fVar, z zVar) {
        c cVar = fVar.new c(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(n22.a.Back.class), oVar, cVar);
        zVar.x(q0.c(n22.a.g.class), oVar, fVar.new d(null));
        zVar.x(q0.c(n22.a.f.class), oVar, fVar.new e(null));
        zVar.x(q0.c(n22.a.GoToNextScreen.class), oVar, fVar.new C3250f(null));
        zVar.x(q0.c(n22.a.GoToError.class), oVar, fVar.new g(null));
        zVar.x(q0.c(n22.a.GoToSearch.class), oVar, fVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<n22.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<n22.b, n22.a> e9() {
        return this.stateMachine;
    }

    public final void m9(st3.f.a event) {
        n22.a goToSearch;
        if (event instanceof st3.f.a.Back) {
            goToSearch = new n22.a.Back(((st3.f.a.Back) event).getAddressData());
        } else if (event instanceof st3.f.a.Close) {
            goToSearch = n22.a.g.f130789a;
        } else if (event instanceof st3.f.a.GoToError) {
            goToSearch = new n22.a.GoToError(((st3.f.a.GoToError) event).getErrorData());
        } else if (event instanceof st3.f.a.GoToNextScreen) {
            goToSearch = new n22.a.GoToNextScreen(((st3.f.a.GoToNextScreen) event).getResult());
        } else {
            if (!(event instanceof st3.f.a.GoToSearch)) {
                throw new p();
            }
            goToSearch = new n22.a.GoToSearch(((st3.f.a.GoToSearch) event).getModel());
        }
        d9(goToSearch);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m22.h hVar) {
        super.P5(hVar);
    }
}
