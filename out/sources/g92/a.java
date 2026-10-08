package g92;

import e92.State;
import e92.g;
import er.l;
import fp0.k;
import fp0.m;
import fr.t;
import h30.ButtonData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import java.util.ArrayList;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import r30.d;
import v72.b;
import w30.CheckBoxSingleData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u0016*\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0016*\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lg92/a;", "Lxw/f;", "Lg92/a$a;", "Le92/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Le92/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onCheckIadCheckbox", "Lkotlin/Function0;", "onScrollToIad", "onLinkClick", "onSendButtonClick", "h", "(Le92/f;Ler/l;Ler/a;Ler/a;Ler/a;)Le92/g$a;", "Lfp0/k;", "violationTypeTag", "Lmx/a;", "c", "(Lfp0/k;)Lmx/a;", "Lfp0/m;", "wasteTypeTag", "e", "(Lfp0/m;)Lmx/a;", "Liy/b0;", "", "tag", "i", "(Liy/b0;Ljava/lang/String;)Lmx/a;", "l", "(Lmx/a;)Lmx/a;", "params", "f", "(Lg92/a$a;)Le92/g$a;", "a", "Lmx/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: g92.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lg92/a$a;", "", "Le92/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onCheckIadCheckbox", "Lkotlin/Function0;", "onScrollToIad", "onLinkClick", "onSendButtonClick", "<init>", "(Le92/f;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Le92/f;", "e", "()Le92/f;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onCheckIadCheckbox;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrollToIad;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onLinkClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendButtonClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super Boolean, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onCheckIadCheckbox = lVar;
            this.onScrollToIad = aVar;
            this.onLinkClick = aVar2;
            this.onSendButtonClick = aVar3;
        }

        public final l<Boolean, i0> a() {
            return this.onCheckIadCheckbox;
        }

        public final er.a<i0> b() {
            return this.onLinkClick;
        }

        public final er.a<i0> c() {
            return this.onScrollToIad;
        }

        public final er.a<i0> d() {
            return this.onSendButtonClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCheckIadCheckbox, params.onCheckIadCheckbox) && t.c(this.onScrollToIad, params.onScrollToIad) && t.c(this.onLinkClick, params.onLinkClick) && t.c(this.onSendButtonClick, params.onSendButtonClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onCheckIadCheckbox.hashCode()) * 31) + this.onScrollToIad.hashCode()) * 31) + this.onLinkClick.hashCode()) * 31) + this.onSendButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCheckIadCheckbox=" + this.onCheckIadCheckbox + ", onScrollToIad=" + this.onScrollToIad + ", onLinkClick=" + this.onLinkClick + ", onSendButtonClick=" + this.onSendButtonClick + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(k violationTypeTag) {
        if (t.c(violationTypeTag, k.e.f65842a)) {
            return this.labelProvider.c(b.f204294s1).o(Label.INSTANCE.d()).o(this.labelProvider.c(b.f204297t1));
        }
        if (t.c(violationTypeTag, k.f.f65843a)) {
            return this.labelProvider.c(b.f204303v1).o(Label.INSTANCE.d()).o(this.labelProvider.c(b.f204306w1));
        }
        if (t.c(violationTypeTag, k.b.f65839a)) {
            return this.labelProvider.c(b.f204300u1);
        }
        if (t.c(violationTypeTag, k.a.f65838a)) {
            return this.labelProvider.c(b.f204291r1);
        }
        if (t.c(violationTypeTag, k.d.f65841a)) {
            return this.labelProvider.c(b.f204312y1).o(Label.INSTANCE.d()).o(this.labelProvider.c(b.f204315z1));
        }
        if (violationTypeTag instanceof k.Others) {
            return ((k.Others) violationTypeTag).getUserType();
        }
        throw new p();
    }

    private final Label e(m wasteTypeTag) {
        if (t.c(wasteTypeTag, m.a.f65849a)) {
            return this.labelProvider.c(b.B1);
        }
        if (t.c(wasteTypeTag, m.b.f65850a)) {
            return this.labelProvider.c(b.D1);
        }
        if (wasteTypeTag instanceof m.Others) {
            return ((m.Others) wasteTypeTag).getUserType();
        }
        if (t.c(wasteTypeTag, m.d.f65852a)) {
            return null;
        }
        throw new p();
    }

    private final g.Data h(State state, l<? super Boolean, i0> onCheckIadCheckbox, er.a<i0> onScrollToIad, er.a<i0> onLinkClick, er.a<i0> onSendButtonClick) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.f204272l0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(state.getSummaryData().getViolationTypeTag()), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        Label labelE = e(state.getSummaryData().getWasteTypeTag());
        if (labelE != null) {
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.f204275m0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelE, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        ArrayList arrayList2 = new ArrayList();
        if (state.getSummaryData().getOfficeReportedTo().l()) {
            arrayList2.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.I0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(state.getSummaryData().getOfficeReportedTo(), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        arrayList2.addAll(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.L0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(l(state.getSummaryData().getViolationEntityName()), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.H0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(state.getSummaryData().getViolationDescription(), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.J0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(this.labelProvider.c(b.K0), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)));
        return new g.Data(this.labelProvider.c(b.S0), v.q(new g.Data.Section(this.labelProvider.c(b.f204269k0), new CardListData(arrayList, null, false, null, null, 30, null)), new g.Data.Section(this.labelProvider.c(b.M0), new CardListData(arrayList2, null, false, null, null, 30, null)), new g.Data.Section(this.labelProvider.c(b.Q0), new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.R0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getSummaryData().getLocationDetails().getVoivodeshipName(), "voivodeshipName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.N0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getSummaryData().getLocationDetails().getCityName(), "cityName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.P0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getSummaryData().getLocationDetails().getStreetNameAndNumber(), "streetAndNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.O0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getSummaryData().getLocationDetails().getPostalCode(), "postalCode"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null)), new g.Data.Section(this.labelProvider.c(b.G0), new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.D0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(i(state.getSummaryData().getApplicantDetails().getFullName(), "FullName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.f204281o0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(i(state.getSummaryData().getApplicantDetails().getAddress(), "Address"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.f204284p0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(i(state.getSummaryData().getApplicantDetails().getEmail(), "Email"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(b.E0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(i(state.getSummaryData().getApplicantDetails().getPhoneNumber(), "PhoneNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null))), new CheckBoxSingleData(new CheckBoxRowData(null, state.getIsIadChecked(), onCheckIadCheckbox, this.labelProvider.c(b.f204278n0), null, null, new d.Button(new ButtonTextData(null, this.labelProvider.c(b.f204265j), null, null, onLinkClick, 13, null)), null, 177, null), state.getShowIadError() ? new r30.b.Error(null, this.labelProvider.c(b.f204246c1), 1, null) : r30.b.a.f171263a, null, false, null, 28, null), state.getScrollToIad(), onScrollToIad, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(b.F0), null, 2, null), k30.d.a.f107773a, null, onSendButtonClick, 35, null));
    }

    private final Label i(b0 b0Var, String str) {
        return mx.b.d(b0Var != null ? c0.e(b0Var) : null, str);
    }

    private final Label l(Label label) {
        return mx.b.d(label.getText(), label.getTag());
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        return h(params.getState(), params.a(), params.c(), params.b(), params.d());
    }
}
