package pj1;

import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oj1.State;
import oj1.j;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zp0.DefenceTrainingDay;
import zp0.RegisteredDefenceTrainingDate;
import zp0.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lpj1/a;", "Lxw/f;", "Lpj1/a$a;", "Loj1/j$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "", "Ln50/g;", "c", "(Lpj1/a$a;)Ljava/util/List;", "Lzp0/b0;", "", "f", "(Lzp0/b0;)Ljava/lang/String;", "Lzp0/w;", "e", "(Lzp0/w;)Ljava/lang/String;", "", "stringId", "Lmx/a;", "i", "(I)Lmx/a;", "h", "(Lpj1/a$a;)Loj1/j$a;", "a", "Lmx/c;", "b", "Lez/e;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, j.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: pj1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001f"}, d2 = {"Lpj1/a$a;", "", "Loj1/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onCloseClick", "onOpenMap", "addToCalendar", "<init>", "(Loj1/i;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loj1/i;", "e", "()Loj1/i;", "b", "Ler/a;", "()Ler/a;", "c", "d", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenMap;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addToCalendar;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onBackClick = aVar;
            this.onCloseClick = aVar2;
            this.onOpenMap = aVar3;
            this.addToCalendar = aVar4;
        }

        public final er.a<i0> a() {
            return this.addToCalendar;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        public final er.a<i0> d() {
            return this.onOpenMap;
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onOpenMap, params.onOpenMap) && t.c(this.addToCalendar, params.addToCalendar);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onOpenMap.hashCode()) * 31) + this.addToCalendar.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ", onOpenMap=" + this.onOpenMap + ", addToCalendar=" + this.addToCalendar + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157935a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157935a = iArr;
        }
    }

    public a(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<DefaultSingleCardData> c(Params params) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("TrainingName", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ri1.b.B1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(params.getState().getRegistered().getTraining().getName(), "trainingName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("UnitName", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ri1.b.D1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(params.getState().getRegistered().getUnit().getName(), "unitName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(ri1.b.f174358d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(params.getState().getRegistered().getUnit().getAddress(), "address"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.c.WithText withText = new k30.c.WithText(i(ri1.b.f174404r), null, 2, null);
        d.a aVar = d.a.f107773a;
        k30.a.b bVar = k30.a.b.f107765a;
        return v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData("UnitAddress", null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData("NavigateButton", null, bVar, withText, aVar, null, params.d(), 34, null)), null, 2814, null), new DefaultSingleCardData("TrainingDate", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ri1.b.C1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(f(params.getState().getRegistered().getTraining()), "date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, params.getState().getRegistered().getStatus() == x.APPROVED ? new x0.Button(new ButtonData("NavigateButton", null, bVar, new k30.c.WithText(i(ri1.b.f174350b), null, 2, null), aVar, null, params.a(), 34, null)) : null, null, 2814, null));
    }

    private final String e(DefenceTrainingDay defenceTrainingDay) {
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

    private final String f(RegisteredDefenceTrainingDate registeredDefenceTrainingDate) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : registeredDefenceTrainingDate.a()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append(e((DefenceTrainingDay) obj));
            if (i15 != registeredDefenceTrainingDate.a().size() - 1) {
                sb5.append("\n");
            }
            i15 = i16;
        }
        return sb5.toString();
    }

    private final Label i(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public j.Data b(Params params) {
        q40.j jVar;
        Label labelI;
        Label labelI2;
        er.a<i0> aVarB = params.b();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        x status = params.getState().getRegistered().getStatus();
        int[] iArr = b.f157935a;
        int i15 = iArr[status.ordinal()];
        if (i15 == 1) {
            jVar = q40.j.b.c.f164688d;
        } else {
            if (i15 != 2) {
                throw new p();
            }
            jVar = q40.j.b.C4090b.f164686d;
        }
        q40.j jVar2 = jVar;
        int i16 = iArr[params.getState().getRegistered().getStatus().ordinal()];
        if (i16 == 1) {
            labelI = i(ri1.b.f174430z1);
        } else {
            if (i16 != 2) {
                throw new p();
            }
            labelI = i(ri1.b.A1);
        }
        Label label = labelI;
        int i17 = iArr[params.getState().getRegistered().getStatus().ordinal()];
        if (i17 == 1) {
            labelI2 = i(ri1.b.f174424x1);
        } else {
            if (i17 != 2) {
                throw new p();
            }
            labelI2 = i(ri1.b.f174427y1);
        }
        return new j.Data(aVarB, baseScaffoldData, new IconPageData(jVar2, label, labelI2, null, new j.IconPageCardsContent(new CardListData(v.A(v.q(c(params), ej1.a.c(params.getState().getRegistered().a(), this.labelProvider))), null, false, null, null, 30, null)), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ri1.b.f174374h), null, 2, null), d.a.f107773a, null, params.c(), 35, null), null, null, 6, null), true, 8, null));
    }
}
