package at1;

import bt1.RefugeeChildStatementState;
import bt1.RefugeeDocumentBottomSheetData;
import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import ir0.RefugeeChildPersonalInfo;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import oq.r;
import p071kotlin.Metadata;
import zs1.ChildrenStatement;
import zs1.PeselDisplayed;
import zs1.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lat1/d;", "Lxw/f;", "Lat1/d$b;", "Lbt1/c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lat1/d$b;)Lbt1/c;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, RefugeeDocumentBottomSheetData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14466c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: at1.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006!"}, d2 = {"Lat1/d$b;", "", "Lzs1/o0;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeBottomSheet", "Lkotlin/Function1;", "Lbt1/a;", "onChildStatementStateChanged", "childrenStatementBottomSheetAction", "<init>", "(Lzs1/o0;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzs1/o0;", "d", "()Lzs1/o0;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o0 state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeBottomSheet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<RefugeeChildStatementState, i0> onChildStatementStateChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> childrenStatementBottomSheetAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o0 o0Var, er.a<i0> aVar, l<? super RefugeeChildStatementState, i0> lVar, er.a<i0> aVar2) {
            this.state = o0Var;
            this.closeBottomSheet = aVar;
            this.onChildStatementStateChanged = lVar;
            this.childrenStatementBottomSheetAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.childrenStatementBottomSheetAction;
        }

        public final er.a<i0> b() {
            return this.closeBottomSheet;
        }

        public final l<RefugeeChildStatementState, i0> c() {
            return this.onChildStatementStateChanged;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final o0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.closeBottomSheet, params.closeBottomSheet) && t.c(this.onChildStatementStateChanged, params.onChildStatementStateChanged) && t.c(this.childrenStatementBottomSheetAction, params.childrenStatementBottomSheetAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.closeBottomSheet.hashCode()) * 31) + this.onChildStatementStateChanged.hashCode()) * 31) + this.childrenStatementBottomSheetAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeBottomSheet=" + this.closeBottomSheet + ", onChildStatementStateChanged=" + this.onChildStatementStateChanged + ", childrenStatementBottomSheetAction=" + this.childrenStatementBottomSheetAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, v vVar) {
        params.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, v vVar) {
        if (vVar == v.HIDDEN) {
            params.b().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, v vVar) {
        if (vVar == v.HIDDEN) {
            params.b().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RefugeeDocumentBottomSheetData b(final Params params) {
        o0 state = params.getState();
        if (t.c(state, o0.a.f236818a)) {
            return new RefugeeDocumentBottomSheetData(new ModalBottomSheetData(new ModalSheetState(v.HIDDEN, false, new l() { // from class: at1.a
                @Override // er.l
                public final Object b(Object obj) {
                    return d.i(params, (v) obj);
                }
            }, 2, null), null, null, null, 14, null), null);
        }
        if (!(state instanceof ChildrenStatement)) {
            if (!(state instanceof PeselDisplayed)) {
                throw new p();
            }
            ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(v.EXPANDED, false, new l() { // from class: at1.c
                @Override // er.l
                public final Object b(Object obj) {
                    return d.m(params, (v) obj);
                }
            }, 2, null), this.labelProvider.c(ss1.a.f183953c), params.b(), null, 8, null);
            b0 pesel = ((PeselDisplayed) params.getState()).getPesel();
            return new RefugeeDocumentBottomSheetData(modalBottomSheetData, new RefugeeDocumentBottomSheetData.a.DisplayPesel(mx.b.d(pesel != null ? c0.e(pesel) : null, "DiiaDocumentBottomSheetPeselValue")));
        }
        ModalBottomSheetData modalBottomSheetData2 = new ModalBottomSheetData(new ModalSheetState(v.EXPANDED, false, new l() { // from class: at1.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (v) obj);
            }
        }, 2, null), null, params.b(), null, 10, null);
        List<r<Boolean, RefugeeChildPersonalInfo>> listB = ((ChildrenStatement) params.getState()).b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        boolean z15 = false;
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            r rVar = (r) obj;
            RefugeeChildPersonalInfo refugeeChildPersonalInfo = (RefugeeChildPersonalInfo) rVar.d();
            arrayList.add(new RefugeeChildStatementState(refugeeChildPersonalInfo, mx.b.d(c0.e(refugeeChildPersonalInfo.getFirstName()) + " " + c0.e(refugeeChildPersonalInfo.getLastName()), "DiiaChildStatementNameLabelValue_" + i15), ((Boolean) rVar.c()).booleanValue()));
            i15 = i16;
        }
        Label labelC = this.labelProvider.c(ss1.a.f183965o);
        Label labelC2 = this.labelProvider.c(ss1.a.f183966p);
        Label labelC3 = this.labelProvider.c(ss1.a.f183967q);
        Label labelC4 = this.labelProvider.c(ss1.a.f183964n);
        List<r<Boolean, RefugeeChildPersonalInfo>> listB2 = ((ChildrenStatement) params.getState()).b();
        if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
            Iterator<T> it = listB2.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((r) it.next()).c()).booleanValue()) {
                    z15 = true;
                    break;
                }
            }
        }
        return new RefugeeDocumentBottomSheetData(modalBottomSheetData2, new RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement(labelC, labelC2, labelC3, labelC4, arrayList, z15, params.c(), params.a()));
    }
}
