package te1;

import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ld1.CompanyPkdCode;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ve1.PkdCodeSearchEntryData;
import xe1.PkdCodeContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00019B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u0018048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lte1/a0;", "Ll00/g;", "Lte1/q;", "Lte1/o;", "Lte1/r;", "", "Lyy/a;", "stateMachineFactory", "Lue1/e;", "mapper", "Lue1/a;", "dialogMapper", "Lcb4/j;", "dialogVMSFactory", "Lte1/a0$a$a;", "setupData", "<init>", "(Lyy/a;Lue1/e;Lue1/a;Lcb4/j;Lte1/a0$a$a;)V", "", "Lte1/p$a;", "Lld1/g;", "v9", "(Ljava/util/List;)Ljava/util/List;", "state", "Lte1/r$a;", "w9", "(Lte1/q;)Lte1/r$a;", "b", "Lue1/e;", "c", "Lue1/a;", "d", "Lcb4/j;", "e", "Lte1/a0$a$a;", "Lte1/q$b;", "f", "Lte1/q$b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lte1/o$h;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<q, o> implements r, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ue1.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ue1.a dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q.Initialized initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<q, o> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o.h> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<r.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lte1/a0$a;", "Lf00/j0;", "Lte1/a0$a$a;", "Lte1/a0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<SetupData, a0> {

        /* JADX INFO: renamed from: te1.a0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lte1/a0$a$a;", "", "Lve1/a;", "entryData", "Lxe1/a;", "contract", "<init>", "(Lve1/a;Lxe1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lve1/a;", "b", "()Lve1/a;", "Lxe1/a;", "()Lxe1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PkdCodeSearchEntryData entryData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final xe1.a contract;

            public SetupData(PkdCodeSearchEntryData pkdCodeSearchEntryData, xe1.a aVar) {
                this.entryData = pkdCodeSearchEntryData;
                this.contract = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final xe1.a getContract() {
                return this.contract;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final PkdCodeSearchEntryData getEntryData() {
                return this.entryData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetupData)) {
                    return false;
                }
                SetupData setupData = (SetupData) other;
                return fr.t.c(this.entryData, setupData.entryData) && fr.t.c(this.contract, setupData.contract);
            }

            public int hashCode() {
                return (this.entryData.hashCode() * 31) + this.contract.hashCode();
            }

            public String toString() {
                return "SetupData(entryData=" + this.entryData + ", contract=" + this.contract + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<r.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f189798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f189799b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f189800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f189801b;

            /* JADX INFO: renamed from: te1.a0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4939a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f189802d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f189803e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f189804f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f189806h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f189807j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f189808k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f189809l;

                public C4939a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f189802d = obj;
                    this.f189803e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a0 a0Var) {
                this.f189800a = hVar;
                this.f189801b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4939a c4939a;
                if (eVar instanceof C4939a) {
                    c4939a = (C4939a) eVar;
                    int i15 = c4939a.f189803e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4939a.f189803e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4939a = new C4939a(eVar);
                    }
                } else {
                    c4939a = new C4939a(eVar);
                }
                Object obj2 = c4939a.f189802d;
                Object objE = uq.b.e();
                int i16 = c4939a.f189803e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f189800a;
                    r.a aVarW9 = this.f189801b.w9((q) obj);
                    c4939a.f189804f = vq.j.a(obj);
                    c4939a.f189806h = vq.j.a(c4939a);
                    c4939a.f189807j = vq.j.a(obj);
                    c4939a.f189808k = vq.j.a(hVar);
                    c4939a.f189809l = 0;
                    c4939a.f189803e = 1;
                    if (hVar.F(aVarW9, c4939a) == objE) {
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

        public b(mu.g gVar, a0 a0Var) {
            this.f189798a = gVar;
            this.f189799b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super r.a> hVar, tq.e eVar) {
            Object objA = this.f189798a.a(new a(hVar, this.f189799b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((FormData.PkdCodeItem) t16).getIsChecked()), Boolean.valueOf(((FormData.PkdCodeItem) t15).getIsChecked()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lte1/o$f;", "<unused var>", "Lte1/q$b;", "Loq/i0;", "<anonymous>", "(Lte1/o$f;Lte1/q$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<o.f, q.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189810e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189810e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o.h> bVarY1 = a0.this.Y1();
                o.h.a aVar = o.h.a.f189885a;
                this.f189810e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(o.f fVar, q.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$g;", "action", "Lk10/c0;", "Lte1/q$b;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<o.MoreInfo, k10.c0<q.Initialized>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189814g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.MoreInfo O(k10.c0 c0Var, o.MoreInfo moreInfo, q.Initialized initialized) {
            return new q.MoreInfo(moreInfo.getSelectedItem(), ((q.Initialized) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o.MoreInfo moreInfo = (o.MoreInfo) this.f189813f;
            final k10.c0 c0Var = (k10.c0) this.f189814g;
            uq.b.e();
            if (this.f189812e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: te1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.e.O(c0Var, moreInfo, (q.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o.MoreInfo moreInfo, k10.c0<q.Initialized> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f189813f = moreInfo;
            eVar2.f189814g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$i;", "action", "Lk10/c0;", "Lte1/q$b;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<o.ShowDialog, k10.c0<q.Initialized>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189816f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189817g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Dialog O(k10.c0 c0Var, a0 a0Var, o.ShowDialog showDialog, q.Initialized initialized) {
            return new q.Dialog(a0Var.dialogVMSFactory.a(a0Var.dialogMapper.b(showDialog.getDialogType())), ((q.Initialized) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o.ShowDialog showDialog = (o.ShowDialog) this.f189816f;
            final k10.c0 c0Var = (k10.c0) this.f189817g;
            uq.b.e();
            if (this.f189815e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final a0 a0Var = a0.this;
            return c0Var.d(new er.l() { // from class: te1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.f.O(c0Var, a0Var, showDialog, (q.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o.ShowDialog showDialog, k10.c0<q.Initialized> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            f fVar = a0.this.new f(eVar);
            fVar.f189816f = showDialog;
            fVar.f189817g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lte1/o$a;", "<unused var>", "Lte1/q$b;", "state", "Loq/i0;", "<anonymous>", "(Lte1/o$a;Lte1/q$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<o.a, q.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189820f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q.Initialized initialized = (q.Initialized) this.f189820f;
            uq.b.e();
            if (this.f189819e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List<FormData.PkdCodeItem> listC = initialized.getFormData().c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    if (((FormData.PkdCodeItem) it.next()).getIsChecked()) {
                        a0.this.setupData.getContract().P1(new PkdCodeContractData(a0.this.v9(initialized.getFormData().c())));
                        a0.this.d9(o.f.f189883a);
                        return oq.i0.f148189a;
                    }
                }
            }
            a0.this.d9(new o.ShowDialog(new ue1.b.UnderSelectionLimit(a0.this.b9(o.f.f189883a))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o.a aVar, q.Initialized initialized, tq.e<? super oq.i0> eVar) {
            g gVar = a0.this.new g(eVar);
            gVar.f189820f = initialized;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$b;", "<unused var>", "Lk10/c0;", "Lte1/q$b;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<o.b, k10.c0<q.Initialized>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189823f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Initialized V(k10.c0 c0Var, q.Initialized initialized) {
            return initialized.b(FormData.b(((q.Initialized) c0Var.a()).getFormData(), null, false, "", 1, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Initialized X(k10.c0 c0Var, q.Initialized initialized) {
            return initialized.b(FormData.b(((q.Initialized) c0Var.a()).getFormData(), null, false, "", 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f189823f;
            uq.b.e();
            if (this.f189822e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((q.Initialized) c0Var.a()).getFormData().getIsSearchActive()) {
                return c0Var.b(new er.l() { // from class: te1.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.h.V(c0Var, (q.Initialized) obj2);
                    }
                });
            }
            a0.this.d9(o.f.f189883a);
            return c0Var.b(new er.l() { // from class: te1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.h.X(c0Var, (q.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(o.b bVar, k10.c0<q.Initialized> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            h hVar = a0.this.new h(eVar);
            hVar.f189823f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$e;", "action", "Lk10/c0;", "Lte1/q$b;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<o.CheckboxChanged, k10.c0<q.Initialized>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189827g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Initialized O(k10.c0 c0Var, o.CheckboxChanged checkboxChanged, q.Initialized initialized) {
            Object next;
            FormData formData = ((q.Initialized) c0Var.a()).getFormData();
            List listI1 = pq.v.i1(((q.Initialized) c0Var.a()).getFormData().c());
            Iterator it = listI1.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((FormData.PkdCodeItem) next).getPkdCode(), checkboxChanged.getPkdCode()));
            FormData.PkdCodeItem pkdCodeItem = (FormData.PkdCodeItem) next;
            if (pkdCodeItem != null) {
                listI1.set(listI1.indexOf(pkdCodeItem), FormData.PkdCodeItem.b(pkdCodeItem, null, !pkdCodeItem.getIsChecked(), 1, null));
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return initialized.b(FormData.b(formData, listI1, false, null, 6, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o.CheckboxChanged checkboxChanged = (o.CheckboxChanged) this.f189826f;
            final k10.c0 c0Var = (k10.c0) this.f189827g;
            uq.b.e();
            if (this.f189825e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: te1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.i.O(c0Var, checkboxChanged, (q.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o.CheckboxChanged checkboxChanged, k10.c0<q.Initialized> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            i iVar = new i(eVar);
            iVar.f189826f = checkboxChanged;
            iVar.f189827g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$d;", "action", "Lk10/c0;", "Lte1/q$b;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<o.ChangeQuery, k10.c0<q.Initialized>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189830g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Initialized O(k10.c0 c0Var, o.ChangeQuery changeQuery, q.Initialized initialized) {
            return initialized.b(FormData.b(((q.Initialized) c0Var.a()).getFormData(), null, false, changeQuery.getQuery(), 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o.ChangeQuery changeQuery = (o.ChangeQuery) this.f189829f;
            final k10.c0 c0Var = (k10.c0) this.f189830g;
            uq.b.e();
            if (this.f189828e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: te1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.j.O(c0Var, changeQuery, (q.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o.ChangeQuery changeQuery, k10.c0<q.Initialized> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            j jVar = new j(eVar);
            jVar.f189829f = changeQuery;
            jVar.f189830g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$c;", "action", "Lk10/c0;", "Lte1/q$b;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<o.ChangeActiveState, k10.c0<q.Initialized>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189833g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Initialized O(k10.c0 c0Var, o.ChangeActiveState changeActiveState, q.Initialized initialized) {
            return initialized.b(FormData.b(((q.Initialized) c0Var.a()).getFormData(), null, changeActiveState.getIsActive(), null, 5, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o.ChangeActiveState changeActiveState = (o.ChangeActiveState) this.f189832f;
            final k10.c0 c0Var = (k10.c0) this.f189833g;
            uq.b.e();
            if (this.f189831e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: te1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.k.O(c0Var, changeActiveState, (q.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o.ChangeActiveState changeActiveState, k10.c0<q.Initialized> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            k kVar = new k(eVar);
            kVar.f189832f = changeActiveState;
            kVar.f189833g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$f;", "<unused var>", "Lk10/c0;", "Lte1/q$c;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<o.f, k10.c0<q.MoreInfo>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189835f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Initialized O(k10.c0 c0Var, q.MoreInfo moreInfo) {
            return new q.Initialized(((q.MoreInfo) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f189835f;
            uq.b.e();
            if (this.f189834e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: te1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.l.O(c0Var, (q.MoreInfo) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o.f fVar, k10.c0<q.MoreInfo> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            l lVar = new l(eVar);
            lVar.f189835f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte1/o$f;", "<unused var>", "Lk10/c0;", "Lte1/q$a;", "state", "Lk10/l;", "Lte1/q;", "<anonymous>", "(Lte1/o$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<o.f, k10.c0<q.Dialog>, tq.e<? super k10.l<? extends q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189837f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q.Initialized O(k10.c0 c0Var, q.Dialog dialog) {
            return new q.Initialized(((q.Dialog) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f189837f;
            uq.b.e();
            if (this.f189836e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: te1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.m.O(c0Var, (q.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o.f fVar, k10.c0<q.Dialog> c0Var, tq.e<? super k10.l<? extends q>> eVar) {
            m mVar = new m(eVar);
            mVar.f189837f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    public a0(yy.a aVar, ue1.e eVar, ue1.a aVar2, cb4.j jVar, a.SetupData setupData) {
        List listN;
        List<CompanyPkdCode> listA;
        this.mapper = eVar;
        this.dialogMapper = aVar2;
        this.dialogVMSFactory = jVar;
        this.setupData = setupData;
        List<CompanyPkdCode> listA2 = setupData.getEntryData().a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA2, 10));
        for (CompanyPkdCode companyPkdCode : listA2) {
            PkdCodeContractData pkdCodeContractDataJ0 = this.setupData.getContract().j0();
            if (pkdCodeContractDataJ0 == null || (listA = pkdCodeContractDataJ0.a()) == null) {
                listN = null;
            } else {
                List<CompanyPkdCode> list = listA;
                listN = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listN.add(((CompanyPkdCode) it.next()).getCode());
                }
            }
            if (listN == null) {
                listN = pq.v.n();
            }
            arrayList.add(new FormData.PkdCodeItem(companyPkdCode, listN.contains(companyPkdCode.getCode())));
        }
        q.Initialized initialized = new q.Initialized(new FormData(pq.v.U0(arrayList, new c()), false, ""));
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: te1.z
            @Override // er.l
            public final Object b(Object obj) {
                return a0.C9(this.f189914a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), w9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(a0 a0Var, FormData.PkdCodeItem pkdCodeItem) {
        a0Var.d9(new o.MoreInfo(pkdCodeItem));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(final a0 a0Var, k10.v vVar) {
        vVar.c(q0.c(q.Initialized.class), new er.l() { // from class: te1.s
            @Override // er.l
            public final Object b(Object obj) {
                return a0.D9(this.f189909a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(q.MoreInfo.class), new er.l() { // from class: te1.t
            @Override // er.l
            public final Object b(Object obj) {
                return a0.E9((k10.z) obj);
            }
        });
        vVar.c(q0.c(q.Dialog.class), new er.l() { // from class: te1.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.F9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(a0 a0Var, k10.z zVar) {
        d dVar = a0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o.f.class), oVar, dVar);
        zVar.v(q0.c(o.MoreInfo.class), oVar, new e(null));
        zVar.v(q0.c(o.ShowDialog.class), oVar, a0Var.new f(null));
        zVar.x(q0.c(o.a.class), oVar, a0Var.new g(null));
        zVar.v(q0.c(o.b.class), oVar, a0Var.new h(null));
        zVar.v(q0.c(o.CheckboxChanged.class), oVar, new i(null));
        zVar.v(q0.c(o.ChangeQuery.class), oVar, new j(null));
        zVar.v(q0.c(o.ChangeActiveState.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(q0.c(o.f.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(k10.z zVar) {
        m mVar = new m(null);
        zVar.v(q0.c(o.f.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CompanyPkdCode> v9(List<FormData.PkdCodeItem> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FormData.PkdCodeItem) obj).getIsChecked()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FormData.PkdCodeItem) it.next()).getPkdCode());
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r.a w9(q state) {
        ue1.e eVar = this.mapper;
        er.a<oq.i0> aVarB9 = b9(o.b.f189879a);
        er.a<oq.i0> aVarB10 = b9(o.a.f189878a);
        er.a<oq.i0> aVarB11 = b9(o.f.f189883a);
        return eVar.b(new ue1.e.Params(state, new er.l() { // from class: te1.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.x9(this.f189910a, (String) obj);
            }
        }, new er.l() { // from class: te1.w
            @Override // er.l
            public final Object b(Object obj) {
                return a0.y9(this.f189911a, ((Boolean) obj).booleanValue());
            }
        }, b9(new o.ChangeQuery("")), new er.l() { // from class: te1.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.z9(this.f189912a, (CompanyPkdCode) obj);
            }
        }, aVarB9, aVarB10, new er.l() { // from class: te1.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.A9(this.f189913a, (FormData.PkdCodeItem) obj);
            }
        }, aVarB11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(a0 a0Var, String str) {
        a0Var.d9(new o.ChangeQuery(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(a0 a0Var, boolean z15) {
        a0Var.d9(new o.ChangeActiveState(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(a0 a0Var, CompanyPkdCode companyPkdCode) {
        a0Var.d9(new o.CheckboxChanged(companyPkdCode));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<o.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<q, o> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<r.a> getState() {
        return this.state;
    }
}
