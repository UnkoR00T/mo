package b02;

import a02.State;
import a02.d;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.l;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import un0.h;
import un0.i;
import un0.j;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lb02/a;", "Lxw/f;", "Lb02/a$a;", "La02/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lun0/i;", "Lr50/a$b;", "h", "(Lun0/i;)Lr50/a$b;", "Lun0/h;", "Lmx/a;", "e", "(Lun0/h;)Lmx/a;", "Lun0/f;", "c", "(Lun0/f;)Lmx/a;", "params", "f", "(Lb02/a$a;)La02/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: b02.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb02/a$a;", "", "La02/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(La02/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La02/c;", "b", "()La02/c;", "Ler/a;", "()Ler/a;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f15857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f15858d;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.CANDIDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15855a = iArr;
            int[] iArr2 = new int[i.values().length];
            try {
                iArr2[i.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[i.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[i.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f15856b = iArr2;
            int[] iArr3 = new int[h.values().length];
            try {
                iArr3[h.PERSON_NOT_FOUND_IN_CRW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[h.INVALID_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[h.INVALID_ELECTORAL_DISTRICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[h.INACTIVE_SUPPORT_SUBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[h.EARLIER_SUPPORT_EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[h.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f15857c = iArr3;
            int[] iArr4 = new int[un0.f.values().length];
            try {
                iArr4[un0.f.MOBYWATEL_APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[un0.f.MOBYWATEL_GOV_PL.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[un0.f.PAPER_FORM.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[un0.f.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f15858d = iArr4;
        }
    }

    public a(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label c(un0.f fVar) {
        int i15 = b.f15858d[fVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(fz1.a.f68964o);
        }
        if (i15 == 2) {
            return this.labelProvider.c(fz1.a.f68968q);
        }
        if (i15 == 3) {
            return this.labelProvider.c(fz1.a.f68966p);
        }
        if (i15 == 4) {
            return Label.INSTANCE.c();
        }
        throw new p();
    }

    private final Label e(h hVar) {
        switch (b.f15857c[hVar.ordinal()]) {
            case 1:
                return this.labelProvider.c(fz1.a.f68949g0);
            case 2:
                return this.labelProvider.c(fz1.a.f68945e0);
            case 3:
                return this.labelProvider.c(fz1.a.f68947f0);
            case 4:
                return this.labelProvider.c(fz1.a.f68943d0);
            case 5:
                return this.labelProvider.c(fz1.a.f68941c0);
            case 6:
                return Label.INSTANCE.c();
            default:
                throw new p();
        }
    }

    private final r50.a.WithIcon h(i iVar) {
        Label labelC;
        g gVar;
        int[] iArr = b.f15856b;
        int i15 = iArr[iVar.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(fz1.a.f68961m0);
        } else if (i15 != 2) {
            labelC = i15 != 3 ? Label.INSTANCE.c() : this.labelProvider.c(fz1.a.f68957k0);
        } else {
            labelC = this.labelProvider.c(fz1.a.f68963n0);
        }
        int i16 = iArr[iVar.ordinal()];
        if (i16 == 1) {
            gVar = g.INFORMATIVE;
        } else if (i16 != 2) {
            gVar = i16 != 3 ? g.MINUS : g.POSITIVE;
        } else {
            gVar = g.NEGATIVE;
        }
        return new r50.a.WithIcon(null, labelC, null, 0, false, gVar, 29, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(fz1.a.f68938b), null, null, null, 28, null), null, null, null, null, 61, null);
        State state = params.getState();
        SingleCardLabel singleCardLabelB = l.b(this.labelProvider.c(fz1.a.H), null, null, 3, null);
        Label labelB = mx.b.b(state.getActionName(), "actionName");
        j70.a aVar = j70.a.NORMAL;
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(l.b(labelB, aVar, null, 2, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.B), null, null, 3, null), new n50.b.Title(l.b(mx.b.b(state.getGrantedSupport().getElectoralDistrictName(), "electoralDistrictName"), aVar, null, 2, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(b.f15855a[state.getGrantedSupport().getSubjectType().ordinal()] == 1 ? fz1.a.f68987z0 : fz1.a.f68979v0), null, null, 3, null), new n50.b.Title(l.b(mx.b.b(state.getGrantedSupport().getCommitteeName(), "committeeSubjectDistrictName"), aVar, null, 2, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = state.getGrantedSupport().getSubjectType() == j.CANDIDATE ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68987z0), null, null, 3, null), new n50.b.Title(l.b(mx.b.b(state.getGrantedSupport().getSubjectName(), "committeeName"), aVar, null, 2, null)), null, 4, null), null, null, null, 3839, null) : null;
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68955j0), null, null, 3, null), new n50.b.StatusBadge(h(state.getGrantedSupport().getStatus())), null, 4, null), null, null, null, 3839, null);
        h rejectionReason = state.getGrantedSupport().getRejectionReason();
        if (rejectionReason != null) {
            defaultSingleCardData = state.getGrantedSupport().getStatus() == i.REJECTED ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68951h0), null, null, 3, null), new n50.b.Title(l.b(e(rejectionReason), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
        } else {
            defaultSingleCardData = null;
        }
        return new d.Data(baseScaffoldData, new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68939b0), null, null, 3, null), new n50.b.Title(l.b(mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(state.getGrantedSupport().getGrantedAt()), fz.c.DOTTED_PLUS_HOUR_WITH_COMMA), "lastUpdateValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68951h0), null, null, 3, null), new n50.b.Title(l.b(c(state.getGrantedSupport().getChannel()), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
    }
}
