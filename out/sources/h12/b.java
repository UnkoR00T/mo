package h12;

import androidx.compose.ui.graphics.Color;
import eo0.WelcomeTextData;
import er.l;
import er.p;
import fr.t;
import g12.c;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r30.CheckBoxRowData;
import r30.d;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lh12/b;", "Lxw/f;", "Lh12/b$a;", "Lg12/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lh12/b$a;)Lg12/c$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h12.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\""}, d2 = {"Lh12/b$a;", "", "Lg12/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "", "onTogglePermission", "", "onShowFullAgreement", "onPersonalInboxButtonClick", "<init>", "(Lg12/b;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lg12/b;", "e", "()Lg12/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g12.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onTogglePermission;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onShowFullAgreement;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPersonalInboxButtonClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g12.b bVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2) {
            this.state = bVar;
            this.onBack = aVar;
            this.onTogglePermission = lVar;
            this.onShowFullAgreement = lVar2;
            this.onPersonalInboxButtonClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onPersonalInboxButtonClick;
        }

        public final l<String, i0> c() {
            return this.onShowFullAgreement;
        }

        public final l<Boolean, i0> d() {
            return this.onTogglePermission;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final g12.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onTogglePermission, params.onTogglePermission) && t.c(this.onShowFullAgreement, params.onShowFullAgreement) && t.c(this.onPersonalInboxButtonClick, params.onPersonalInboxButtonClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onTogglePermission.hashCode()) * 31) + this.onShowFullAgreement.hashCode()) * 31) + this.onPersonalInboxButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onTogglePermission=" + this.onTogglePermission + ", onShowFullAgreement=" + this.onShowFullAgreement + ", onPersonalInboxButtonClick=" + this.onPersonalInboxButtonClick + ')';
        }
    }

    /* JADX INFO: renamed from: h12.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1815b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1815b f79644a = new C1815b();

        C1815b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(775778787);
            if (p076m2.t.k()) {
                p076m2.t.o(775778787, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.agreements.mapper.AgreementsScreenMapper.invoke.<anonymous>.<anonymous> (AgreementsScreenMapper.kt:57)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params) {
        String fullDescription = ((g12.b.Initialized) params.getState()).getAgreementType().getAgreementData().getFullDescription();
        if (fullDescription != null) {
            params.c().b(fullDescription);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        InfoRowListData infoRowListData;
        g12.b state = params.getState();
        if (t.c(state, g12.b.a.f69608a)) {
            return c.a.C1565a.f69612a;
        }
        if (!(state instanceof g12.b.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.T3), null, null, null, 28, null), null, null, null, null, 61, null);
        WelcomeTextData welcomeTextData = ((g12.b.Initialized) params.getState()).getAgreementType().getWelcomeTextData();
        o40.a.Icon icon = welcomeTextData != null ? new o40.a.Icon(jz.a.f106756d4, null, C1815b.f79644a, this.labelProvider.c(e02.a.S3), mx.b.b(welcomeTextData.getDescription(), "bulletsDesc"), null, 34, null) : null;
        WelcomeTextData welcomeTextData2 = ((g12.b.Initialized) params.getState()).getAgreementType().getWelcomeTextData();
        if (welcomeTextData2 != null) {
            List<String> listA = welcomeTextData2.a();
            ArrayList arrayList = new ArrayList(v.y(listA, 10));
            int i15 = 0;
            for (Object obj : listA) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                String str = (String) obj;
                arrayList.add(new t40.a.C4874a(mx.b.b(str, str + '_' + i15)));
                i15 = i16;
            }
            infoRowListData = new InfoRowListData(arrayList);
        } else {
            infoRowListData = null;
        }
        Label labelC = this.labelProvider.c(e02.a.O1);
        Label labelB = mx.b.b(((g12.b.Initialized) params.getState()).getAgreementType().getAgreementData().getShortDescription(), "AgreementShortDescription");
        r30.b error = ((g12.b.Initialized) params.getState()).getAgreementValidationState() instanceof hz.b.Invalid ? new r30.b.Error(null, ((hz.b.Invalid) ((g12.b.Initialized) params.getState()).getAgreementValidationState()).getMessage(), 1, null) : r30.b.a.f171263a;
        StringBuilder sb5 = new StringBuilder();
        String text = this.labelProvider.c(e02.a.f46496a).getText();
        Locale locale = Locale.ROOT;
        sb5.append(text.toLowerCase(locale));
        sb5.append(' ');
        sb5.append(this.labelProvider.c(e02.a.Q1).getText().toLowerCase(locale));
        return new c.a.Initialized(baseScaffoldData, icon, infoRowListData, labelC, labelB, new CheckBoxSingleData(new CheckBoxRowData(null, ((g12.b.Initialized) params.getState()).getIsGranted(), params.d(), this.labelProvider.c(e02.a.Q1), null, mx.b.b(sb5.toString(), ""), new d.Button(new ButtonTextData(null, this.labelProvider.c(e02.a.P1), null, null, new er.a() { // from class: h12.a
            @Override // er.a
            public final Object a() {
                return b.f(params);
            }
        }, 13, null)), null, 145, null), error, null, false, null, 28, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.N1), null, 2, null), k30.d.a.f107773a, k30.b.c.f107768a, params.b(), 3, null));
    }
}
