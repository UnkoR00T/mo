package q71;

import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.g0;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p71.c;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lq71/b;", "Lxw/f;", "Lq71/b$a;", "Lp71/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "Lj40/m;", "h", "(Lhz/b;)Lj40/m;", "params", "e", "(Lq71/b$a;)Lp71/c$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q71.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lq71/b$a;", "", "Lp71/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseAction", "toNextScreenAction", "toCorrespondencePickerAction", "<init>", "(Lp71/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp71/b;", "c", "()Lp71/b;", "b", "Ler/a;", "()Ler/a;", "d", "e", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p71.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toNextScreenAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toCorrespondencePickerAction;

        public Params(p71.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onCloseAction = aVar2;
            this.toNextScreenAction = aVar3;
            this.toCorrespondencePickerAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final p71.b getState() {
            return this.state;
        }

        public final er.a<i0> d() {
            return this.toCorrespondencePickerAction;
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.toNextScreenAction, params.toNextScreenAction) && t.c(this.toCorrespondencePickerAction, params.toCorrespondencePickerAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.toNextScreenAction.hashCode()) * 31) + this.toCorrespondencePickerAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", toNextScreenAction=" + this.toNextScreenAction + ", toCorrespondencePickerAction=" + this.toCorrespondencePickerAction + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, DropDownButtonData dropDownButtonData) {
        params.d().a();
        return i0.f148189a;
    }

    private final m h(hz.b bVar) {
        if (bVar instanceof hz.b.Invalid) {
            return new m.Error(this.labelProvider.c(w51.a.N3));
        }
        if (t.c(bVar, hz.b.d.f86848c) || t.c(bVar, hz.b.C2039b.f86846c)) {
            return new m.Enabled(null, 1, null);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        Label labelC;
        String name;
        p71.b state = params.getState();
        if (t.c(state, p71.b.C3776b.f153302a)) {
            return c.a.b.f153308a;
        }
        if (!(state instanceof p71.b.Initialized)) {
            if (state instanceof p71.b.Error) {
                return new c.a.Error(((p71.b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.S3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC2 = this.labelProvider.c(w51.a.f210312d0);
        Label labelC3 = this.labelProvider.c(w51.a.f210305c0);
        Label labelC4 = this.labelProvider.c(w51.a.S3);
        p71.b.Initialized initialized = (p71.b.Initialized) state;
        List<BEPassportChildApplicationCountryDictionary> listC = initialized.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(mx.b.b(((BEPassportChildApplicationCountryDictionary) obj).getName(), "country " + i15));
            i15 = i16;
        }
        m mVarH = h(initialized.getDropDownState().getValidationState());
        Integer initialPick = initialized.getDropDownState().getInitialPick();
        BEPassportChildApplicationCountryDictionary selectedCountry = initialized.getSelectedCountry();
        if (selectedCountry == null || (name = selectedCountry.getName()) == null || (labelC = mx.b.b(name, "selectedCountry")) == null) {
            labelC = this.labelProvider.c(w51.a.B4);
        }
        DropDownButtonData dropDownButtonData = new DropDownButtonData(labelC4, arrayList, initialPick, mVarH, labelC, false, null, new l() { // from class: q71.a
            @Override // er.l
            public final Object b(Object obj2) {
                return b.f(params, (DropDownButtonData) obj2);
            }
        }, 96, null);
        ButtonData buttonData = new ButtonData("nextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), d.a.f107773a, null, params.e(), 34, null);
        c30.b.e eVar = new c30.b.e(null, null, null, this.labelProvider.c(w51.a.f210298b0), null, null, null, 119, null);
        if (initialized.getPassportOfficePlace() != g0.ABROAD) {
            eVar = null;
        }
        return new c.a.Initialized(baseScaffoldData, labelC2, labelC3, dropDownButtonData, buttonData, eVar, params.a());
    }
}
