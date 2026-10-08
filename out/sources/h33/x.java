package h33;

import android.text.TextUtils;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import java.util.Iterator;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import xi0.ContactDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030@8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010R\u001a\b\u0012\u0004\u0012\u00020'0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lh33/x;", "Ll00/g;", "Lh33/c;", "Lh33/a;", "Lh33/d;", "", "Lyy/a;", "stateMachineFactory", "Lj33/f;", "mapper", "Lui0/a;", "contactDetailsDownloadManager", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/a;", "checkEmailCorrectUC", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Lmx/c;", "labelProvider", "Lh33/e;", "contract", "<init>", "(Lyy/a;Lj33/f;Lui0/a;Lj14/n;Lj14/a;Lcb4/j;Lp23/b;Lmx/c;Lh33/e;)V", "Lcb4/d;", "C9", "()Lcb4/d;", "Lxi0/e;", "contactDetails", "Lk23/k$b$a;", "F9", "(Lxi0/e;)Lk23/k$b$a;", "Lh33/b;", "form", "Lk23/k;", "D9", "(Lh33/b;)Lk23/k;", "Lh33/d$a;", "G9", "(Lh33/c;)Lh33/d$a;", "b", "Lj33/f;", "c", "Lui0/a;", "d", "Lj14/n;", "e", "Lj14/a;", "f", "Lcb4/j;", "g", "Lp23/b;", "h", "Lmx/c;", "j", "Lh33/e;", "E9", "()Lh33/e;", "Lh33/c$c;", "k", "Lh33/c$c;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lh33/a$f;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<h33.c, h33.a> implements h33.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j33.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ui0.a contactDetailsDownloadManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h33.e contract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h33.c.LoadingDataFromContract initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h33.c, h33.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h33.a.f> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<h33.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h33.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f80712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f80713b;

        /* JADX INFO: renamed from: h33.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1851a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f80714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f80715b;

            /* JADX INFO: renamed from: h33.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1852a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f80716d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f80717e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f80718f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f80720h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f80721j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f80722k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f80723l;

                public C1852a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f80716d = obj;
                    this.f80717e |= PKIFailureInfo.systemUnavail;
                    return C1851a.this.F(null, this);
                }
            }

            public C1851a(mu.h hVar, x xVar) {
                this.f80714a = hVar;
                this.f80715b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1852a c1852a;
                if (eVar instanceof C1852a) {
                    c1852a = (C1852a) eVar;
                    int i15 = c1852a.f80717e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1852a.f80717e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1852a = new C1852a(eVar);
                    }
                } else {
                    c1852a = new C1852a(eVar);
                }
                Object obj2 = c1852a.f80716d;
                Object objE = uq.b.e();
                int i16 = c1852a.f80717e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f80714a;
                    h33.d.a aVarG9 = this.f80715b.G9((h33.c) obj);
                    c1852a.f80718f = vq.j.a(obj);
                    c1852a.f80720h = vq.j.a(c1852a);
                    c1852a.f80721j = vq.j.a(obj);
                    c1852a.f80722k = vq.j.a(hVar);
                    c1852a.f80723l = 0;
                    c1852a.f80717e = 1;
                    if (hVar.F(aVarG9, c1852a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, x xVar) {
            this.f80712a = gVar;
            this.f80713b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h33.d.a> hVar, tq.e eVar) {
            Object objA = this.f80712a.a(new C1851a(hVar, this.f80713b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh33/a$f;", "action", "Lh33/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh33/a$f;Lh33/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<h33.a.f, h33.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80725f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h33.a.f fVar = (h33.a.f) this.f80725f;
            Object objE = uq.b.e();
            int i15 = this.f80724e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<h33.a.f> bVarY1 = x.this.Y1();
                this.f80725f = vq.j.a(fVar);
                this.f80724e = 1;
                if (bVarY1.F(fVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.f fVar, h33.c cVar, tq.e<? super oq.i0> eVar) {
            b bVar = x.this.new b(eVar);
            bVar.f80725f = fVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lh33/c$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<h33.c.LoadingDataFromContract>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80728f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.b X(h33.c.LoadingDataFromContract loadingDataFromContract) {
            return h33.c.b.f80652a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.Loading Y(Form form, h33.c.LoadingDataFromContract loadingDataFromContract) {
            return new h33.c.a.Loading(form);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading Z(Form form, h33.c.LoadingDataFromContract loadingDataFromContract) {
            return new h33.c.a.NotLoading(form);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            PhoneNumber phoneNumberA;
            iy.b0 b0VarA;
            k10.c0 c0Var = (k10.c0) this.f80728f;
            uq.b.e();
            if (this.f80727e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<oq.i0, String> iVarB = ((h33.c.LoadingDataFromContract) c0Var.a()).b();
            if (iVarB == null && (iVarB = x.this.getContract().S7()) == null) {
                return c0Var.d(new er.l() { // from class: h33.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.c.X((c.LoadingDataFromContract) obj2);
                    }
                });
            }
            String strA = iVarB.a();
            k23.k kVarK0 = x.this.getContract().K0();
            k23.k.Data.PhoneAndEmail phoneAndEmailF5 = x.this.getContract().F5();
            boolean z15 = kVarK0 instanceof k23.k.a;
            boolean z16 = kVarK0 instanceof k23.k.Data;
            k23.k.Data data = z16 ? (k23.k.Data) kVarK0 : null;
            boolean z17 = (data != null ? data.getEdorAddress() : null) != null;
            k23.k.Data data2 = z16 ? (k23.k.Data) kVarK0 : null;
            boolean z18 = (data2 != null ? data2.getPhoneAndEmail() : null) != null || strA == null;
            if (phoneAndEmailF5 == null || (phoneNumberA = phoneAndEmailF5.getPhoneNumber()) == null) {
                phoneNumberA = PhoneNumber.INSTANCE.a();
            }
            PhoneNumber phoneNumber = phoneNumberA;
            if (phoneAndEmailF5 == null || (b0VarA = phoneAndEmailF5.getEmail()) == null) {
                b0VarA = iy.b0.INSTANCE.a();
            }
            final Form form = new Form(z15, z17, z18, strA, phoneNumber, null, null, b0VarA, null, false, null, 1888, null);
            boolean z19 = phoneAndEmailF5 == null;
            if (z19) {
                return c0Var.d(new er.l() { // from class: h33.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.c.Y(form, (c.LoadingDataFromContract) obj2);
                    }
                });
            }
            if (z19) {
                throw new oq.p();
            }
            return c0Var.d(new er.l() { // from class: h33.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.c.Z(form, (c.LoadingDataFromContract) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<h33.c.LoadingDataFromContract> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = x.this.new c(eVar);
            cVar.f80728f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh33/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh33/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<h33.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80730e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(x xVar, iy.b0 b0Var) {
            xVar.d9(new h33.a.FinishedFetchingEDOR(iy.c0.e(b0Var)));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f80730e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x xVar = x.this;
            final x xVar2 = x.this;
            xVar.d9(new h33.a.f.GoToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: h33.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O(xVar2, (iy.b0) obj2);
                }
            }, x.this.b9(new h33.a.FinishedFetchingEDOR(null)))));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(h33.c.b bVar, tq.e<? super oq.i0> eVar) {
            return ((d) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return x.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$d;", "action", "Lk10/c0;", "Lh33/c$b;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<h33.a.FinishedFetchingEDOR, k10.c0<h33.c.b>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80734g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.LoadingDataFromContract O(dx.i iVar, h33.c.b bVar) {
            return new h33.c.LoadingDataFromContract(iVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h33.a.FinishedFetchingEDOR finishedFetchingEDOR = (h33.a.FinishedFetchingEDOR) this.f80733f;
            k10.c0 c0Var = (k10.c0) this.f80734g;
            uq.b.e();
            if (this.f80732e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final dx.i<oq.i0, String> iVarA = dx.i.INSTANCE.a(finishedFetchingEDOR.getEdorAddress());
            x.this.getContract().B5(iVarA);
            return c0Var.d(new er.l() { // from class: h33.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(iVarA, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.FinishedFetchingEDOR finishedFetchingEDOR, k10.c0<h33.c.b> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f80733f = finishedFetchingEDOR;
            eVar2.f80734g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh33/a;", "action", "Lh33/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh33/a;Lh33/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h33.a, h33.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80737f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h33.a aVar = (h33.a) this.f80737f;
            Object objE = uq.b.e();
            int i15 = this.f80736e;
            if (i15 == 0) {
                oq.u.b(obj);
                px.f.f163100a.b("Cancelling download by " + aVar, px.c.a(x.this));
                ui0.a aVar2 = x.this.contactDetailsDownloadManager;
                this.f80737f = vq.j.a(aVar);
                this.f80736e = 1;
                if (aVar2.a(this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a aVar, h33.c.a aVar2, tq.e<? super oq.i0> eVar) {
            f fVar = x.this.new f(eVar);
            fVar.f80737f = aVar;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh33/a$a;", "<unused var>", "Lh33/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lh33/a$a;Lh33/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<h33.a.C1843a, h33.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80740f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h33.c.a aVar = (h33.c.a) this.f80740f;
            uq.b.e();
            if (this.f80739e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.getContract().S4(new k23.k.Data.PhoneAndEmail(aVar.getForm().getEmail(), aVar.getForm().getPhoneNumber()));
            x.this.getContract().R7(x.this.D9(aVar.getForm()));
            x.this.d9(h33.a.f.C1844a.f80616a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.C1843a c1843a, h33.c.a aVar, tq.e<? super oq.i0> eVar) {
            g gVar = x.this.new g(eVar);
            gVar.f80740f = aVar;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lh33/c$a$b;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<h33.c.a.Loading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80743f;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading V(h33.c.a.Loading loading) {
            return new h33.c.a.NotLoading(loading.getForm());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading X(Form form, h33.c.a.Loading loading) {
            return new h33.c.a.NotLoading(form);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            k10.c0 c0Var = (k10.c0) this.f80743f;
            Object objE = uq.b.e();
            int i15 = this.f80742e;
            if (i15 == 0) {
                oq.u.b(obj);
                ui0.a aVar = x.this.contactDetailsDownloadManager;
                this.f80743f = c0Var;
                this.f80742e = 1;
                objB = aVar.b(this);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                objB = obj;
            }
            dx.i iVar = (dx.i) objB;
            x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                xVar.getContract().S4(new k23.k.Data.PhoneAndEmail(iy.b0.INSTANCE.a(), null));
                return c0Var.d(new er.l() { // from class: h33.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.h.V((c.a.Loading) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            k23.k.Data.PhoneAndEmail phoneAndEmailF9 = xVar.F9((ContactDetails) ((dx.i.Right) iVar).b());
            xVar.getContract().S4(phoneAndEmailF9);
            Form form = ((h33.c.a.Loading) c0Var.a()).getForm();
            PhoneNumber phoneNumber = phoneAndEmailF9.getPhoneNumber();
            if (phoneNumber == null) {
                phoneNumber = PhoneNumber.INSTANCE.a();
            }
            final Form formB = Form.b(form, false, false, false, null, phoneNumber, null, null, phoneAndEmailF9.getEmail(), null, false, null, 1903, null);
            return c0Var.d(new er.l() { // from class: h33.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.h.X(formB, (c.a.Loading) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<h33.c.a.Loading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f80743f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$k;", "<unused var>", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<h33.a.k, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80746f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(notLoading.getForm(), !notLoading.getForm().getIsAnonymousReportSelected(), false, false, null, null, null, null, null, null, false, null, 510, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80746f;
            uq.b.e();
            if (this.f80745e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h33.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.O((c.a.NotLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.k kVar, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            i iVar = new i(eVar);
            iVar.f80746f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$l;", "<unused var>", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<h33.a.l, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80748f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(notLoading.getForm(), false, !notLoading.getForm().getIsEdorAddressEnabled(), false, null, null, null, null, null, null, false, null, 509, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80748f;
            uq.b.e();
            if (this.f80747e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h33.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.j.O((c.a.NotLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.l lVar, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            j jVar = new j(eVar);
            jVar.f80748f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$m;", "<unused var>", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<h33.a.m, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80750f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(notLoading.getForm(), false, false, !notLoading.getForm().getIsPhoneEmailEnabled(), null, null, null, null, null, null, false, null, 507, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80750f;
            uq.b.e();
            if (this.f80749e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h33.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.k.O((c.a.NotLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.m mVar, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f80750f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$i;", "action", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<h33.a.SetPhonePrefix, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80753g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.a.SetPhonePrefix setPhonePrefix, h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(notLoading.getForm(), false, false, false, null, PhoneNumber.e(notLoading.getForm().getPhoneNumber(), PhoneNumber.c.c(iy.c0.g(setPhonePrefix.getPrefix())), null, 2, null), hz.b.C2039b.f86846c, null, null, null, false, null, 1999, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h33.a.SetPhonePrefix setPhonePrefix = (h33.a.SetPhonePrefix) this.f80752f;
            k10.c0 c0Var = (k10.c0) this.f80753g;
            uq.b.e();
            if (this.f80751e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h33.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.O(setPhonePrefix, (c.a.NotLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.SetPhonePrefix setPhonePrefix, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            l lVar = new l(eVar);
            lVar.f80752f = setPhonePrefix;
            lVar.f80753g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$h;", "action", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<h33.a.SetPhoneNumber, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80756g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.a.SetPhoneNumber setPhoneNumber, h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(notLoading.getForm(), false, false, false, null, PhoneNumber.e(notLoading.getForm().getPhoneNumber(), null, PhoneNumber.b.c(iy.c0.g(setPhoneNumber.getNumber())), 1, null), null, hz.b.C2039b.f86846c, null, null, false, null, 1967, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h33.a.SetPhoneNumber setPhoneNumber = (h33.a.SetPhoneNumber) this.f80755f;
            k10.c0 c0Var = (k10.c0) this.f80756g;
            uq.b.e();
            if (this.f80754e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h33.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.m.O(setPhoneNumber, (c.a.NotLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.SetPhoneNumber setPhoneNumber, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            m mVar = new m(eVar);
            mVar.f80755f = setPhoneNumber;
            mVar.f80756g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$g;", "action", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<h33.a.SetEmail, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80759g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.a.SetEmail setEmail, h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(notLoading.getForm(), false, false, false, null, null, null, null, iy.c0.g(setEmail.getEmail()), hz.b.C2039b.f86846c, false, null, 1663, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h33.a.SetEmail setEmail = (h33.a.SetEmail) this.f80758f;
            k10.c0 c0Var = (k10.c0) this.f80759g;
            uq.b.e();
            if (this.f80757e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h33.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.n.O(setEmail, (c.a.NotLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.SetEmail setEmail, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            n nVar = new n(eVar);
            nVar.f80758f = setEmail;
            nVar.f80759g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$b;", "<unused var>", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<h33.a.b, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f80760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f80761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f80762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f80763h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f80764j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f80765k;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.Dialog X(x xVar, Form form, h33.c.a.NotLoading notLoading) {
            return new h33.c.a.Dialog(Form.b(form, false, false, false, null, null, null, null, null, null, false, null, 1023, null), xVar.dialogVMSFactory.a(xVar.C9()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading Y(Form.a aVar, Form form, hz.b bVar, hz.b bVar2, hz.b bVar3, boolean z15, h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(form, false, false, false, null, null, bVar, bVar2, null, bVar3, z15, new d60.j(aVar), 159, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading Z(Form form, h33.c.a.NotLoading notLoading) {
            return notLoading.b(Form.b(form, false, false, false, null, null, null, null, null, null, false, null, 1023, null));
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:35:0x0105 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:36:0x0107  */
        /* JADX WARN: Code duplicated, block: B:39:0x010f  */
        /* JADX WARN: Code duplicated, block: B:42:0x0131  */
        /* JADX WARN: Code duplicated, block: B:45:0x013e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:46:0x0140  */
        /* JADX WARN: Code duplicated, block: B:49:0x014b  */
        /* JADX WARN: Code duplicated, block: B:52:0x0154  */
        /* JADX WARN: Code duplicated, block: B:54:0x0158  */
        /* JADX WARN: Code duplicated, block: B:56:0x015c  */
        /* JADX WARN: Code duplicated, block: B:58:0x0162  */
        /* JADX WARN: Code duplicated, block: B:65:0x0174  */
        /* JADX WARN: Code duplicated, block: B:67:0x0179  */
        /* JADX WARN: Code duplicated, block: B:69:0x0183  */
        /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
        
            if (r9 == r2) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00fb, code lost:
        
            if (r5 == r2) goto L41;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 453
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h33.x.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.b bVar, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            o oVar = x.this.new o(eVar);
            oVar.f80765k = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$j;", "<unused var>", "Lk10/c0;", "Lh33/c$a$c;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<h33.a.j, k10.c0<h33.c.a.NotLoading>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80768f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.Dialog O(x xVar, h33.c.a.NotLoading notLoading) {
            return new h33.c.a.Dialog(notLoading.getForm(), xVar.dialogVMSFactory.a(xVar.newReportExitDialogMapper.b(new p23.b.Params(xVar.b9(h33.a.f.b.f80617a), xVar.b9(h33.a.c.f80613a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80768f;
            uq.b.e();
            if (this.f80767e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x xVar = x.this;
            return c0Var.d(new er.l() { // from class: h33.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.p.O(xVar, (c.a.NotLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.j jVar, k10.c0<h33.c.a.NotLoading> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            p pVar = x.this.new p(eVar);
            pVar.f80768f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$e;", "<unused var>", "Lk10/c0;", "Lh33/c$a$a;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<h33.a.e, k10.c0<h33.c.a.Dialog>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80771f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.c.a.Dialog dialog) {
            return new h33.c.a.NotLoading(dialog.getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80771f;
            uq.b.e();
            if (this.f80770e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.getContract().R7(k23.k.a.f107699a);
            x.this.d9(h33.a.f.d.f80619a);
            return c0Var.d(new er.l() { // from class: h33.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.q.O((c.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.e eVar, k10.c0<h33.c.a.Dialog> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar2) {
            q qVar = x.this.new q(eVar2);
            qVar.f80771f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh33/a$c;", "<unused var>", "Lk10/c0;", "Lh33/c$a$a;", "state", "Lk10/l;", "Lh33/c;", "<anonymous>", "(Lh33/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<h33.a.c, k10.c0<h33.c.a.Dialog>, tq.e<? super k10.l<? extends h33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80774f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h33.c.a.NotLoading O(h33.c.a.Dialog dialog) {
            return new h33.c.a.NotLoading(dialog.getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80774f;
            uq.b.e();
            if (this.f80773e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: h33.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.r.O((c.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h33.a.c cVar, k10.c0<h33.c.a.Dialog> c0Var, tq.e<? super k10.l<? extends h33.c>> eVar) {
            r rVar = new r(eVar);
            rVar.f80774f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, j33.f fVar, ui0.a aVar2, j14.n nVar, j14.a aVar3, cb4.j jVar, p23.b bVar, mx.c cVar, h33.e eVar) {
        this.mapper = fVar;
        this.contactDetailsDownloadManager = aVar2;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkEmailCorrectUC = aVar3;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar;
        this.labelProvider = cVar;
        this.contract = eVar;
        h33.c.LoadingDataFromContract loadingDataFromContract = new h33.c.LoadingDataFromContract(null, 1, null);
        this.initialState = loadingDataFromContract;
        this.stateMachine = aVar.a(loadingDataFromContract, new er.l() { // from class: h33.n
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9(this.f80686a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), G9(loadingDataFromContract));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData C9() {
        cb4.h.b bVar = cb4.h.b.f24985a;
        Label labelC = this.labelProvider.c(h23.b.f80173r0);
        Label labelC2 = this.labelProvider.c(h23.b.f80170q0);
        DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(this.labelProvider.c(h23.b.H), null, b9(h33.a.e.f80615a), 2, null);
        Label labelC3 = this.labelProvider.c(h23.b.P);
        h33.a.c cVar = h33.a.c.f80613a;
        return new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, null, b9(cVar), 2, null), null, b9(cVar), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k23.k D9(Form form) {
        if (form.getIsAnonymousReportSelected()) {
            return k23.k.a.f107699a;
        }
        String edorAddress = form.getEdorAddress();
        if (!form.getIsEdorAddressEnabled()) {
            edorAddress = null;
        }
        iy.b0 email = form.getEmail();
        PhoneNumber phoneNumber = form.getPhoneNumber();
        if (!phoneNumber.i()) {
            phoneNumber = null;
        }
        return new k23.k.Data(edorAddress, form.getIsPhoneEmailEnabled() ? new k23.k.Data.PhoneAndEmail(email, phoneNumber) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final k23.k.Data.PhoneAndEmail F9(ContactDetails contactDetails) {
        iy.b0 b0VarA;
        iy.b0 b0VarA2;
        iy.b0 b0VarA3;
        Object next;
        ContactDetail emailData = contactDetails.getEmailData();
        if (emailData != null) {
            b0VarA = emailData.getValue();
            if (emailData.getStatus() != xi0.c.IN_REGISTRY) {
                b0VarA = null;
            }
        } else {
            b0VarA = null;
        }
        ContactDetail phoneData = contactDetails.getPhoneData();
        if (phoneData != null) {
            b0VarA2 = phoneData.getValue();
            if (phoneData.getStatus() != xi0.c.IN_REGISTRY) {
                b0VarA2 = null;
            }
        } else {
            b0VarA2 = null;
        }
        ContactDetail phoneData2 = contactDetails.getPhoneData();
        if (phoneData2 != null) {
            Iterator<T> it = phoneData2.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((ContactDetailAdditionalValue) next).getKey(), "PREFIX"));
            ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next;
            b0VarA3 = contactDetailAdditionalValue != null ? contactDetailAdditionalValue.getValue() : null;
            if (phoneData2.getStatus() != xi0.c.IN_REGISTRY) {
                b0VarA3 = null;
            }
            if (b0VarA3 != null) {
                String strE = iy.c0.e(b0VarA3);
                if (TextUtils.isDigitsOnly(strE)) {
                    b0VarA3 = iy.c0.g('+' + strE);
                }
            } else {
                b0VarA3 = null;
            }
        } else {
            b0VarA3 = null;
        }
        if (b0VarA3 == null) {
            b0VarA3 = PhoneNumber.c.INSTANCE.a();
        }
        iy.b0 b0VarC = PhoneNumber.c.c(b0VarA3);
        if (b0VarA2 == null) {
            b0VarA2 = iy.b0.INSTANCE.a();
        }
        PhoneNumber phoneNumber = new PhoneNumber(b0VarC, PhoneNumber.b.c(b0VarA2), null);
        if (b0VarA == null) {
            b0VarA = iy.b0.INSTANCE.a();
        }
        return new k23.k.Data.PhoneAndEmail(b0VarA, phoneNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h33.d.a G9(h33.c cVar) {
        return this.mapper.b(new j33.f.Params(cVar, b9(h33.a.b.f80612a), b9(h33.a.C1843a.f80611a), b9(h33.a.j.f80623a), b9(h33.a.k.f80624a), b9(h33.a.l.f80625a), b9(h33.a.m.f80626a), new er.l() { // from class: h33.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f80697a, (String) obj);
            }
        }, new er.l() { // from class: h33.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f80698a, (String) obj);
            }
        }, new er.l() { // from class: h33.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(this.f80699a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(x xVar, String str) {
        xVar.d9(new h33.a.SetPhonePrefix(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(x xVar, String str) {
        xVar.d9(new h33.a.SetPhoneNumber(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(x xVar, String str) {
        xVar.d9(new h33.a.SetEmail(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(final x xVar, k10.v vVar) {
        vVar.c(fr.q0.c(h33.c.class), new er.l() { // from class: h33.m
            @Override // er.l
            public final Object b(Object obj) {
                return x.M9(this.f80679a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h33.c.LoadingDataFromContract.class), new er.l() { // from class: h33.o
            @Override // er.l
            public final Object b(Object obj) {
                return x.N9(this.f80688a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h33.c.b.class), new er.l() { // from class: h33.p
            @Override // er.l
            public final Object b(Object obj) {
                return x.O9(this.f80690a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h33.c.a.class), new er.l() { // from class: h33.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.P9(this.f80691a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h33.c.a.Loading.class), new er.l() { // from class: h33.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.Q9(this.f80692a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h33.c.a.NotLoading.class), new er.l() { // from class: h33.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.R9(this.f80693a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h33.c.a.Dialog.class), new er.l() { // from class: h33.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.S9(this.f80695a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(x xVar, k10.z zVar) {
        b bVar = xVar.new b(null);
        zVar.x(fr.q0.c(h33.a.f.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(x xVar, k10.z zVar) {
        zVar.A(xVar.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(x xVar, k10.z zVar) {
        zVar.C(xVar.new d(null));
        e eVar = xVar.new e(null);
        zVar.v(fr.q0.c(h33.a.FinishedFetchingEDOR.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(x xVar, k10.z zVar) {
        f fVar = xVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(h33.a.class), oVar, fVar);
        zVar.x(fr.q0.c(h33.a.C1843a.class), oVar, xVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(x xVar, k10.z zVar) {
        zVar.A(xVar.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(x xVar, k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(h33.a.k.class), oVar, iVar);
        zVar.v(fr.q0.c(h33.a.l.class), oVar, new j(null));
        zVar.v(fr.q0.c(h33.a.m.class), oVar, new k(null));
        zVar.v(fr.q0.c(h33.a.SetPhonePrefix.class), oVar, new l(null));
        zVar.v(fr.q0.c(h33.a.SetPhoneNumber.class), oVar, new m(null));
        zVar.v(fr.q0.c(h33.a.SetEmail.class), oVar, new n(null));
        zVar.v(fr.q0.c(h33.a.b.class), oVar, xVar.new o(null));
        zVar.v(fr.q0.c(h33.a.j.class), oVar, xVar.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(x xVar, k10.z zVar) {
        q qVar = xVar.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(h33.a.e.class), oVar, qVar);
        zVar.v(fr.q0.c(h33.a.c.class), oVar, new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: renamed from: E9, reason: from getter */
    public final h33.e getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(h33.e eVar) {
        super.P5(eVar);
    }

    @Override // zx.b
    public xw.b<h33.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h33.c, h33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<h33.d.a> getState() {
        return this.state;
    }
}
