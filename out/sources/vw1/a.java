package vw1;

import aj0.ElectronicCapabilityInfo;
import aj0.PersonalDocumentElectronicLayerSettingsInfo;
import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import lw1.j0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvw1/a;", "Lxw/f;", "Lvw1/a$a;", "Luw1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lww1/a;", "serviceType", "Lmx/a;", "c", "(Lww1/a;)Lmx/a;", "Laj0/b;", "params", "Lh50/a;", "f", "(Laj0/b;Lvw1/a$a;)Lh50/a;", "Laj0/d;", "h", "(Laj0/d;Lvw1/a$a;)Lh50/a;", "e", "(Lvw1/a$a;)Luw1/c$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, uw1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vw1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lvw1/a$a;", "", "Luw1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "learnMoreAction", "<init>", "(Luw1/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luw1/b;", "c", "()Luw1/b;", "b", "Ler/a;", "()Ler/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final uw1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> learnMoreAction;

        public Params(uw1.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.closeAction = aVar;
            this.learnMoreAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.learnMoreAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final uw1.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.closeAction, params.closeAction) && t.c(this.learnMoreAction, params.learnMoreAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.learnMoreAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", learnMoreAction=" + this.learnMoreAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208540a;

        static {
            int[] iArr = new int[ww1.a.values().length];
            try {
                iArr[ww1.a.DOCUMENT_SIGNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ww1.a.PIN_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ww1.a.ELECTRONIC_LAYER_SETTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f208540a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f208541a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(659046705);
            if (p076m2.t.k()) {
                p076m2.t.o(659046705, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.electroniccapability.mapper.ElectronicCapabilityMapper.toScreenData.<anonymous> (ElectronicCapabilityMapper.kt:69)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f208542a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-458909246);
            if (p076m2.t.k()) {
                p076m2.t.o(-458909246, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.electroniccapability.mapper.ElectronicCapabilityMapper.toScreenData.<anonymous> (ElectronicCapabilityMapper.kt:92)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(ww1.a serviceType) {
        int i15 = b.f208540a[serviceType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(j0.S0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(j0.f120779q3);
        }
        if (i15 == 3) {
            return null;
        }
        throw new oq.p();
    }

    private final h50.a f(ElectronicCapabilityInfo electronicCapabilityInfo, Params params) {
        Label labelC;
        Label labelC2;
        String title = electronicCapabilityInfo.getTitle();
        if (title == null || (labelC = mx.b.b(title, "title")) == null) {
            labelC = Label.INSTANCE.c();
        }
        Label label = labelC;
        int i15 = jz.a.f106786h2;
        String description = electronicCapabilityInfo.getDescription();
        if (description == null || (labelC2 = mx.b.b(description, "description")) == null) {
            labelC2 = Label.INSTANCE.c();
        }
        Label label2 = labelC2;
        Label.Companion companion = Label.INSTANCE;
        return new h50.a(i15, c.f208541a, label, label2, companion.c(), companion.c(), companion.c(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.M), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), null, null, companion.c(), params.a());
    }

    private final h50.a h(PersonalDocumentElectronicLayerSettingsInfo personalDocumentElectronicLayerSettingsInfo, Params params) {
        Label labelC;
        Label labelC2;
        String blockedTitle = personalDocumentElectronicLayerSettingsInfo.getBlockedTitle();
        if (blockedTitle == null || (labelC = mx.b.b(blockedTitle, "title")) == null) {
            labelC = Label.INSTANCE.c();
        }
        Label label = labelC;
        int i15 = jz.a.f106786h2;
        String blockedDescription = personalDocumentElectronicLayerSettingsInfo.getBlockedDescription();
        if (blockedDescription == null || (labelC2 = mx.b.b(blockedDescription, "description")) == null) {
            labelC2 = Label.INSTANCE.c();
        }
        Label label2 = labelC2;
        Label.Companion companion = Label.INSTANCE;
        return new h50.a(i15, d.f208542a, label, label2, companion.c(), companion.c(), companion.c(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120725g), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), null, null, companion.c(), params.a());
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public uw1.c.a b(Params params) {
        h50.a aVarF;
        uw1.b state = params.getState();
        if (t.c(state, uw1.b.a.f201885a) || (state instanceof uw1.b.GettingStatus)) {
            return uw1.c.a.C5247a.f201891a;
        }
        if (!(state instanceof uw1.b.StatusUnavailable)) {
            if (state instanceof uw1.b.Error) {
                return new uw1.c.a.Error(((uw1.b.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        uw1.b.StatusUnavailable statusUnavailable = (uw1.b.StatusUnavailable) state;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), c(statusUnavailable.getServiceType()), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        int i15 = b.f208540a[statusUnavailable.getServiceType().ordinal()];
        if (i15 == 1) {
            aVarF = f(statusUnavailable.getCapabilityData().getSignatureInfo(), params);
        } else {
            if (i15 != 2 && i15 != 3) {
                throw new oq.p();
            }
            aVarF = h(statusUnavailable.getCapabilityData().getElectronicLayerSettings(), params);
        }
        return new uw1.c.a.StatusChecked(baseScaffoldData, aVarA, aVarF);
    }
}
