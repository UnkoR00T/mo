package pi3;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import qi3.AutomaticReportInsurerDetailsSectionData;
import sv0.AutomaticReportInsurerDetails;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpi3/d;", "Lxw/f;", "Lpi3/d$a;", "Loi3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lpi3/d$a;)Loi3/d$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, oi3.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: pi3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006!"}, d2 = {"Lpi3/d$a;", "", "Loi3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGoToBlsFaq", "Lkotlin/Function1;", "Lsv0/a;", "onGoToReport", "onBack", "<init>", "(Loi3/c;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loi3/c;", "d", "()Loi3/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final oi3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToBlsFaq;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AutomaticReportInsurerDetails, i0> onGoToReport;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(oi3.c cVar, er.a<i0> aVar, l<? super AutomaticReportInsurerDetails, i0> lVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onGoToBlsFaq = aVar;
            this.onGoToReport = lVar;
            this.onBack = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onGoToBlsFaq;
        }

        public final l<AutomaticReportInsurerDetails, i0> c() {
            return this.onGoToReport;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final oi3.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onGoToBlsFaq, params.onGoToBlsFaq) && t.c(this.onGoToReport, params.onGoToReport) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onGoToBlsFaq.hashCode()) * 31) + this.onGoToReport.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGoToBlsFaq=" + this.onGoToBlsFaq + ", onGoToReport=" + this.onGoToReport + ", onBack=" + this.onBack + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, AutomaticReportInsurerDetails automaticReportInsurerDetails) {
        params.c().b(automaticReportInsurerDetails);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, AutomaticReportInsurerDetails automaticReportInsurerDetails) {
        params.c().b(automaticReportInsurerDetails);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, AutomaticReportInsurerDetails automaticReportInsurerDetails) {
        params.c().b(automaticReportInsurerDetails);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0229  */
    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public oi3.d.a b(final Params params) {
        qi3.b allInsurers;
        AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData;
        mx.c cVar = this.labelProvider;
        oi3.c state = params.getState();
        if (t.c(state, oi3.c.a.f146009a)) {
            return oi3.d.a.C3632a.f146011a;
        }
        if (!(state instanceof oi3.c.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(md3.b.f125869y1), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = cVar.c(md3.b.f125877z1);
        sv0.b automaticReportInsurerGroup = ((oi3.c.Initialized) state).getAutomaticReportInsurerGroup();
        if (automaticReportInsurerGroup instanceof sv0.b.InvolvedPartiesInsurers) {
            Label labelC2 = cVar.c(md3.b.A6);
            sv0.b.InvolvedPartiesInsurers involvedPartiesInsurers = (sv0.b.InvolvedPartiesInsurers) automaticReportInsurerGroup;
            List<AutomaticReportInsurerDetails> listA = involvedPartiesInsurers.a();
            ArrayList arrayList = new ArrayList(v.y(listA, 10));
            int i15 = 0;
            for (Object obj : listA) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                final AutomaticReportInsurerDetails automaticReportInsurerDetails = (AutomaticReportInsurerDetails) obj;
                String str = "PerpetratorInsurerCard_" + i15;
                SingleCardLabel singleCardLabel = new SingleCardLabel(cVar.c(md3.b.F), null, null, 0, 0, null, 62, null);
                n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(automaticReportInsurerDetails.getShortName(), ""), null, null, 0, 0, null, 62, null));
                String additionalDescription = automaticReportInsurerDetails.getAdditionalDescription();
                arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: pi3.a
                    @Override // er.a
                    public final Object a() {
                        return d.i(params, automaticReportInsurerDetails);
                    }
                }, false, null, null, false, null, null, new BodySection(singleCardLabel, title, additionalDescription != null ? new SingleCardLabel(mx.b.b(additionalDescription, ""), null, null, 0, 0, null, 62, null) : null), null, x0.Icon.INSTANCE.b(), null, 2812, null));
                i15 = i16;
            }
            AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData2 = new AutomaticReportInsurerDetailsSectionData(labelC2, null, null, arrayList);
            List<AutomaticReportInsurerDetails> listB = involvedPartiesInsurers.b();
            if (listB != null) {
                Label labelC3 = cVar.c(md3.b.D6);
                Label labelC4 = cVar.c(md3.b.C6);
                ButtonTextData buttonTextData = new ButtonTextData(null, cVar.c(md3.b.B6), null, null, params.b(), 13, null);
                List<AutomaticReportInsurerDetails> list = listB;
                ArrayList arrayList2 = new ArrayList(v.y(list, 10));
                int i17 = 0;
                for (Object obj2 : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        v.x();
                    }
                    final AutomaticReportInsurerDetails automaticReportInsurerDetails2 = (AutomaticReportInsurerDetails) obj2;
                    String str2 = "VictimInsurerCard_" + i17;
                    SingleCardLabel singleCardLabel2 = new SingleCardLabel(cVar.c(md3.b.F), null, null, 0, 0, null, 62, null);
                    n50.b.Title title2 = new n50.b.Title(new SingleCardLabel(mx.b.b(automaticReportInsurerDetails2.getShortName(), ""), null, null, 0, 0, null, 62, null));
                    String additionalDescription2 = automaticReportInsurerDetails2.getAdditionalDescription();
                    List<AutomaticReportInsurerDetails> list2 = listB;
                    arrayList2.add(new DefaultSingleCardData(str2, new er.a() { // from class: pi3.b
                        @Override // er.a
                        public final Object a() {
                            return d.l(params, automaticReportInsurerDetails2);
                        }
                    }, false, null, null, false, null, null, new BodySection(singleCardLabel2, title2, additionalDescription2 != null ? new SingleCardLabel(mx.b.b(additionalDescription2, ""), null, null, 0, 0, null, 62, null) : null), null, x0.Icon.INSTANCE.b(), null, 2812, null));
                    i17 = i18;
                    listB = list2;
                }
                AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData3 = new AutomaticReportInsurerDetailsSectionData(labelC3, labelC4, buttonTextData, arrayList2);
                if (listB.isEmpty()) {
                    automaticReportInsurerDetailsSectionData = null;
                } else {
                    automaticReportInsurerDetailsSectionData = automaticReportInsurerDetailsSectionData3;
                }
            } else {
                automaticReportInsurerDetailsSectionData = null;
            }
            allInsurers = new qi3.b.InvolvedPartiesInsurers(automaticReportInsurerDetailsSectionData2, automaticReportInsurerDetailsSectionData);
        } else {
            if (!(automaticReportInsurerGroup instanceof sv0.b.AllInsurers)) {
                throw new p();
            }
            Label labelC5 = cVar.c(md3.b.f125874y6);
            Label labelC6 = cVar.c(md3.b.f125866x6);
            List<AutomaticReportInsurerDetails> listA2 = ((sv0.b.AllInsurers) automaticReportInsurerGroup).a();
            ArrayList arrayList3 = new ArrayList(v.y(listA2, 10));
            int i19 = 0;
            for (Object obj3 : listA2) {
                int i25 = i19 + 1;
                if (i19 < 0) {
                    v.x();
                }
                final AutomaticReportInsurerDetails automaticReportInsurerDetails3 = (AutomaticReportInsurerDetails) obj3;
                String str3 = "InsurerName_" + i19;
                n50.b.Title title3 = new n50.b.Title(new SingleCardLabel(mx.b.b(automaticReportInsurerDetails3.getShortName(), ""), null, null, 0, 0, null, 62, null));
                String additionalDescription3 = automaticReportInsurerDetails3.getAdditionalDescription();
                arrayList3.add(new DefaultSingleCardData(str3, new er.a() { // from class: pi3.c
                    @Override // er.a
                    public final Object a() {
                        return d.m(params, automaticReportInsurerDetails3);
                    }
                }, false, null, null, false, null, null, new BodySection(null, title3, additionalDescription3 != null ? new SingleCardLabel(mx.b.b(additionalDescription3, ""), null, null, 0, 0, null, 62, null) : null, 1, null), null, x0.Icon.INSTANCE.b(), null, 2812, null));
                i19 = i25;
            }
            allInsurers = new qi3.b.AllInsurers(labelC5, labelC6, new CardListData(arrayList3, null, false, null, null, 30, null));
        }
        return new oi3.d.a.Initialized(baseScaffoldData, params.a(), labelC, allInsurers);
    }
}
