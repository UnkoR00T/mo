package d41;

import a41.State;
import a41.h;
import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.e;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld41/d;", "Lxw/f;", "Ld41/d$a;", "La41/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Ld41/d$a;)La41/h$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d41.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Ld41/d$a;", "", "La41/g;", "state", "Lkotlin/Function1;", "La41/g$a;", "Loq/i0;", "onSelect", "", "setFacilityName", "Lkotlin/Function0;", "onClose", "goNext", "onBack", "<init>", "(La41/g;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La41/g;", "f", "()La41/g;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "Ler/a;", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f39727g = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<State.a, i0> onSelect;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> setFacilityName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goNext;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super State.a, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onSelect = lVar;
            this.setFacilityName = lVar2;
            this.onClose = aVar;
            this.goNext = aVar2;
            this.onBack = aVar3;
        }

        public final er.a<i0> a() {
            return this.goNext;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final l<State.a, i0> d() {
            return this.onSelect;
        }

        public final l<String, i0> e() {
            return this.setFacilityName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSelect, params.onSelect) && t.c(this.setFacilityName, params.setFacilityName) && t.c(this.onClose, params.onClose) && t.c(this.goNext, params.goNext) && t.c(this.onBack, params.onBack);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onSelect.hashCode()) * 31) + this.setFacilityName.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.goNext.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelect=" + this.onSelect + ", setFacilityName=" + this.setFacilityName + ", onClose=" + this.onClose + ", goNext=" + this.goNext + ", onBack=" + this.onBack + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.d().b(State.a.MedicalCenter);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.e().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.d().b(State.a.Other);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public h.Data b(final Params params) {
        int i15;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(j31.a.f99138e), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        boolean areMultipleChildren = params.getState().getAreMultipleChildren();
        if (areMultipleChildren) {
            i15 = j31.a.f99163j;
        } else {
            if (areMultipleChildren) {
                throw new p();
            }
            i15 = j31.a.f99158i;
        }
        return new h.Data(baseScaffoldData, cVar.c(i15), new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getPlaceOfBirth() == State.a.MedicalCenter, false, 5, null), new er.a() { // from class: d41.a
            @Override // er.a
            public final Object a() {
                return d.i(params);
            }
        }, this.labelProvider.c(j31.a.f99217t3), null, new b41.b(new v50.c.Text(null, this.labelProvider.c(j31.a.f99143f), null, mx.b.b(params.getState().getFacilityName(), "facilityName"), params.getState().getFacilityNameValidationState(), null, null, new l() { // from class: d41.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), 8, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getPlaceOfBirth() == State.a.Other, false, 5, null), new er.a() { // from class: d41.c
            @Override // er.a
            public final Object a() {
                return d.m(params);
            }
        }, this.labelProvider.c(j31.a.A2), null, null, 24, null)), e.a.f16684a, params.getState().getShowRadioButtonError() ? new b50.d.Error(this.labelProvider.c(j31.a.f99151g2)) : b50.d.c.f16683a, null, null, null, null, 120, null), new ButtonData("next", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j31.a.f99235x2), null, 2, null), k30.d.a.f107773a, null, params.a(), 34, null), params.b());
    }
}
