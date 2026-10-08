package t81;

import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.g0;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import s81.Error;
import s81.NoErrorAddress;
import s81.Verifying;
import s81.i;
import s81.k;
import s81.o;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lt81/b;", "Lxw/f;", "Lt81/b$a;", "Ls81/o$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "Lj40/m;", "m", "(Lhz/b;)Lj40/m;", "Lcl0/g0;", "Lmx/a;", "h", "(Lcl0/g0;)Lmx/a;", "f", "", "e", "(Lcl0/g0;)I", "params", "i", "(Lt81/b$a;)Ls81/o$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, o.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: t81.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lt81/b$a;", "", "Ls81/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseAction", "toNextScreenAction", "toInstitutionPickerAction", "<init>", "(Ls81/i;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls81/i;", "c", "()Ls81/i;", "b", "Ler/a;", "()Ler/a;", "d", "e", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toNextScreenAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toInstitutionPickerAction;

        public Params(i iVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = iVar;
            this.onBackAction = aVar;
            this.onCloseAction = aVar2;
            this.toNextScreenAction = aVar3;
            this.toInstitutionPickerAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final i getState() {
            return this.state;
        }

        public final er.a<i0> d() {
            return this.toInstitutionPickerAction;
        }

        public final er.a<i0> e() {
            return this.toNextScreenAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.toNextScreenAction, params.toNextScreenAction) && t.c(this.toInstitutionPickerAction, params.toInstitutionPickerAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.toNextScreenAction.hashCode()) * 31) + this.toInstitutionPickerAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", toNextScreenAction=" + this.toNextScreenAction + ", toInstitutionPickerAction=" + this.toInstitutionPickerAction + ')';
        }
    }

    /* JADX INFO: renamed from: t81.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4903b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188856a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f188856a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final int e(g0 g0Var) {
        int i15 = C4903b.f188856a[g0Var.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 == 3) {
                return w51.a.K4;
            }
            throw new p();
        }
        return w51.a.B2;
    }

    private final Label f(g0 g0Var) {
        int i15 = C4903b.f188856a[g0Var.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.D2);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.A2);
        }
        if (i15 == 3) {
            return Label.INSTANCE.c();
        }
        throw new p();
    }

    private final Label h(g0 g0Var) {
        int i15 = C4903b.f188856a[g0Var.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.F2);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210466z2);
        }
        if (i15 == 3) {
            return Label.INSTANCE.c();
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, DropDownButtonData dropDownButtonData) {
        params.d().a();
        return i0.f148189a;
    }

    private final m m(hz.b bVar) {
        if (bVar instanceof hz.b.Invalid) {
            return new m.Error(this.labelProvider.c(w51.a.N3));
        }
        if (t.c(bVar, hz.b.d.f86848c) || t.c(bVar, hz.b.C2039b.f86846c)) {
            return new m.Enabled(null, 1, null);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public o.a b(final Params params) {
        Label labelC;
        String unitName;
        i state = params.getState();
        if (t.c(state, k.f179083a)) {
            return o.a.b.f179106a;
        }
        if (state instanceof Error) {
            return new o.a.Error(((Error) state).getErrorVMS());
        }
        if (!(state instanceof i.Initialized)) {
            if (state instanceof i.Error) {
                return new o.a.Error(((i.Error) state).getErrorVMS());
            }
            if (state instanceof s81.Error) {
                return new o.a.Error(((s81.Error) state).getErrorVMS());
            }
            if (state instanceof NoErrorAddress) {
                return new o.a.NoEdorAddress(new BaseScaffoldData(null, new x50.i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null), new IconPageData(j.b.d.f164690d, this.labelProvider.c(w51.a.f210310c5), this.labelProvider.c(w51.a.f210303b5), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210449w4), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), false, 72, null), params.a());
            }
            if (state instanceof Verifying) {
                return o.a.e.f179119a;
            }
            throw new p();
        }
        i.Initialized initialized = (i.Initialized) state;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), h(initialized.getPassportOfficePlace()), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC2 = this.labelProvider.c(w51.a.C2);
        Label labelC3 = initialized.getPassportOfficePlace() == g0.POLAND ? this.labelProvider.c(w51.a.E2) : null;
        Label labelF = f(initialized.getPassportOfficePlace());
        List<BEPassportChildApplicationOfficeDictionary> listD = initialized.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(mx.b.b(((BEPassportChildApplicationOfficeDictionary) it.next()).getUnitName(), "office"));
        }
        m mVarM = m(initialized.getDropDownState().getValidationState());
        Integer initialPick = initialized.getDropDownState().getInitialPick();
        BEPassportChildApplicationOfficeDictionary selectedOffice = initialized.getSelectedOffice();
        if (selectedOffice == null || (unitName = selectedOffice.getUnitName()) == null || (labelC = mx.b.b(unitName, "")) == null) {
            labelC = this.labelProvider.c(w51.a.P3);
        }
        DropDownButtonData dropDownButtonData = new DropDownButtonData(labelF, arrayList, initialPick, mVarM, labelC, false, null, new l() { // from class: t81.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.l(params, (DropDownButtonData) obj);
            }
        }, 96, null);
        ButtonData buttonData = new ButtonData("nextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), d.a.f107773a, null, params.e(), 34, null);
        BEPassportChildApplicationOfficeDictionary selectedOffice2 = initialized.getSelectedOffice();
        return new o.a.Initialized(baseScaffoldData, labelC2, labelC3, dropDownButtonData, buttonData, selectedOffice2 != null ? new c30.b.c(null, null, null, this.labelProvider.e(e(initialized.getPassportOfficePlace()), selectedOffice2.getOfficeName()), null, null, null, 119, null) : null, params.a());
    }
}
