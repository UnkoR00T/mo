package bk1;

import androidx.compose.ui.graphics.Color;
import er.p;
import ez.e;
import fr.t;
import h30.ButtonData;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zp0.DefenceTrainingDay;
import zp0.UserDefenceTraining;
import zp0.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0017*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lbk1/a;", "Lxw/f;", "Lbk1/a$a;", "Lak1/f$a;", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "<init>", "(Lez/e;Lmx/c;)V", "params", "Lak1/e$a;", "state", "", "Ln50/g;", "f", "(Lbk1/a$a;Lak1/e$a;)Ljava/util/List;", "Li50/a;", "c", "(Lbk1/a$a;)Li50/a;", "e", "(Lbk1/a$a;Lak1/e$a;)Ln50/g;", "Lzp0/c0;", "", "i", "(Lzp0/c0;)Ljava/lang/String;", "Lzp0/w;", "h", "(Lzp0/w;)Ljava/lang/String;", "", "stringId", "Lmx/a;", "m", "(I)Lmx/a;", "l", "(Lbk1/a$a;)Lak1/f$a;", "a", "Lez/e;", "b", "Lmx/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, ak1.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: bk1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006!"}, d2 = {"Lbk1/a$a;", "", "Lak1/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "giveUp", "onOpenMap", "addToCalendar", "onMoreInfoClick", "<init>", "(Lak1/e;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak1/e;", "f", "()Lak1/e;", "b", "Ler/a;", "c", "()Ler/a;", "d", "e", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ak1.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> giveUp;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenMap;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addToCalendar;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreInfoClick;

        public Params(ak1.e eVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = eVar;
            this.onBackClick = aVar;
            this.giveUp = aVar2;
            this.onOpenMap = aVar3;
            this.addToCalendar = aVar4;
            this.onMoreInfoClick = aVar5;
        }

        public final er.a<i0> a() {
            return this.addToCalendar;
        }

        public final er.a<i0> b() {
            return this.giveUp;
        }

        public final er.a<i0> c() {
            return this.onBackClick;
        }

        public final er.a<i0> d() {
            return this.onMoreInfoClick;
        }

        public final er.a<i0> e() {
            return this.onOpenMap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.giveUp, params.giveUp) && t.c(this.onOpenMap, params.onOpenMap) && t.c(this.addToCalendar, params.addToCalendar) && t.c(this.onMoreInfoClick, params.onMoreInfoClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ak1.e getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.giveUp.hashCode()) * 31) + this.onOpenMap.hashCode()) * 31) + this.addToCalendar.hashCode()) * 31) + this.onMoreInfoClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", giveUp=" + this.giveUp + ", onOpenMap=" + this.onOpenMap + ", addToCalendar=" + this.addToCalendar + ", onMoreInfoClick=" + this.onMoreInfoClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19899a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[z.IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[z.DONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[z.ABSENCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f19899a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f19900a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-37410997);
            if (p076m2.t.k()) {
                p076m2.t.o(-37410997, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdetails.mapper.TrainingDetailsScreenMapper.createGiveUpButton.<anonymous> (TrainingDetailsScreenMapper.kt:232)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f19901a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1133797674);
            if (p076m2.t.k()) {
                p076m2.t.o(1133797674, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdetails.mapper.TrainingDetailsScreenMapper.createGiveUpButton.<anonymous> (TrainingDetailsScreenMapper.kt:240)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public a(e eVar, mx.c cVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData c(Params params) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), m(ri1.b.f174397o1), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final DefaultSingleCardData e(Params params, ak1.e.Content state) {
        switch (b.f19899a[state.getTraining().getStatus().ordinal()]) {
            case 1:
            case 2:
                return new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(m(ri1.b.f174385k1), null, c.f19900a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, new n50.d.IconButton(new ButtonIconData(null, jz.a.f106804k, d.f19901a, null, null, params.b(), 25, null)), null, 5, null), null, null, 3325, null);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            default:
                throw new oq.p();
        }
    }

    private final List<DefaultSingleCardData> f(Params params, ak1.e.Content state) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(m(ri1.b.f174400p1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getTraining().getTraining().getName(), "trainingName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(m(ri1.b.f174403q1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getTraining().getUnit().getName(), "unit"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        BodySection bodySection = new BodySection(new SingleCardLabel(m(ri1.b.f174358d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getTraining().getUnit().getAddress(), "address"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.c.WithText withText = new k30.c.WithText(m(ri1.b.f174404r), null, 2, null);
        k30.d.a aVar = k30.d.a.f107773a;
        k30.a.b bVar = k30.a.b.f107765a;
        return v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData("NavigateButton", null, bVar, withText, aVar, null, params.e(), 34, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(m(ri1.b.C1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(i(state.getTraining().getTraining()), "date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData("NavigateButton", null, bVar, new k30.c.WithText(m(ri1.b.f174350b), null, 2, null), aVar, null, params.a(), 34, null)), null, 2815, null));
    }

    private final String h(DefenceTrainingDay defenceTrainingDay) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.dateFormatter.d(defenceTrainingDay.getStartDate(), fz.c.DAY_ONLY));
        sb5.append(' ');
        sb5.append(this.dateFormatter.d(defenceTrainingDay.getStartDate(), fz.c.DOTTED));
        sb5.append(", ");
        e eVar = this.dateFormatter;
        fz.b.OffsetDateTime startDate = defenceTrainingDay.getStartDate();
        fz.c cVar = fz.c.ONLY_HOUR;
        sb5.append(eVar.d(startDate, cVar));
        sb5.append('-');
        sb5.append(this.dateFormatter.d(defenceTrainingDay.getEndDate(), cVar));
        return sb5.toString();
    }

    private final String i(UserDefenceTraining userDefenceTraining) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : userDefenceTraining.a()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append(h((DefenceTrainingDay) obj));
            if (i15 != userDefenceTraining.a().size() - 1) {
                sb5.append("\n");
            }
            i15 = i16;
        }
        return sb5.toString();
    }

    private final Label m(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ak1.f.a b(Params params) {
        c30.b dVar;
        ak1.e state = params.getState();
        if (state instanceof ak1.e.c) {
            return new ak1.f.a.Success(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(j.b.C4090b.f164686d, m(ri1.b.f174394n1), null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ri1.b.f174374h), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), null, null, 6, null), false, 76, null));
        }
        if (state instanceof ak1.e.Error) {
            return new ak1.f.a.Error(((ak1.e.Error) state).getErrorVMSAdapter());
        }
        if (!(state instanceof ak1.e.Content)) {
            throw new oq.p();
        }
        er.a<i0> aVarC = params.c();
        BaseScaffoldData baseScaffoldDataC = c(params);
        ak1.e.Content content = (ak1.e.Content) state;
        switch (b.f19899a[content.getTraining().getStatus().ordinal()]) {
            case 1:
                dVar = new c30.b.d(null, null, m(ri1.b.f174348a1), m(ri1.b.X0), null, null, new c30.a.ButtonText(new ButtonTextData("link", m(ri1.b.f174386l), null, null, params.d(), 12, null)), 51, null);
                break;
            case 2:
                dVar = new c30.b.c(null, null, m(ri1.b.f174360d1), m(ri1.b.Z0), null, null, null, 115, null);
                break;
            case 3:
                dVar = new c30.b.C0606b(null, null, m(ri1.b.f174356c1), m(ri1.b.Y0), null, null, null, 115, null);
                break;
            case 4:
                dVar = new c30.b.C0606b(null, null, m(ri1.b.f174352b1), m(ri1.b.Y0), null, null, null, 115, null);
                break;
            case 5:
            case 6:
            case 7:
                dVar = null;
                break;
            default:
                throw new oq.p();
        }
        return new ak1.f.a.Content(aVarC, baseScaffoldDataC, dVar, e(params, content), new CardListData(v.A(v.q(f(params, content), ej1.a.c(content.getTraining().a(), this.labelProvider))), null, false, null, null, 30, null));
    }
}
