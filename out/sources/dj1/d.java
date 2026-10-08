package dj1;

import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zp0.BEUnitDefenceTrainingsByType;
import zp0.BEUserDefenceTrainingRegistration;
import zp0.DefenceTrainingDay;
import zp0.UserDefenceTraining;
import zp0.y;
import zp0.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u001c*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0019H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020'*\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020+2\b\b\u0001\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Ldj1/d;", "Lxw/f;", "Ldj1/d$a;", "Lcj1/c$a;", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "Lsi1/a;", "defenceTrainingEndpoints", "<init>", "(Lez/e;Lmx/c;Lsi1/a;)V", "", "Lt40/a$a;", "l", "()Ljava/util/List;", "params", "Li50/a;", "h", "(Ldj1/d$a;)Li50/a;", "Lzp0/s;", "trainings", "Lh30/a;", "r", "(Ljava/util/List;Ldj1/d$a;)Lh30/a;", "Lzp0/t;", "", "index", "Ln50/g;", "m", "(Lzp0/t;Ldj1/d$a;I)Ln50/g;", "Lr50/a$b;", "v", "(Lzp0/t;)Lr50/a$b;", "Lzp0/c0;", "", "u", "(Lzp0/c0;)Ljava/lang/String;", "Lzp0/y;", "Lc30/b;", "E", "(Lzp0/y;)Lc30/b;", "stringId", "Lmx/a;", "z", "(I)Lmx/a;", "x", "(Ldj1/d$a;)Lcj1/c$a;", "a", "Lez/e;", "b", "Lmx/c;", "c", "Lsi1/a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, cj1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final si1.a defenceTrainingEndpoints;

    /* JADX INFO: renamed from: dj1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R)\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b%\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006'"}, d2 = {"Ldj1/d$a;", "", "Lcj1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "", "Lzp0/s;", "onRegisterClick", "", "onUrlClick", "Lzp0/t;", "onTrainingClicked", "onQuestionMarkClicked", "<init>", "(Lcj1/b;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcj1/b;", "f", "()Lcj1/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cj1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<List<BEUnitDefenceTrainingsByType>, i0> onRegisterClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEUserDefenceTrainingRegistration, i0> onTrainingClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onQuestionMarkClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(cj1.b bVar, er.a<i0> aVar, l<? super List<BEUnitDefenceTrainingsByType>, i0> lVar, l<? super String, i0> lVar2, l<? super BEUserDefenceTrainingRegistration, i0> lVar3, er.a<i0> aVar2) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onRegisterClick = lVar;
            this.onUrlClick = lVar2;
            this.onTrainingClicked = lVar3;
            this.onQuestionMarkClicked = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onQuestionMarkClicked;
        }

        public final l<List<BEUnitDefenceTrainingsByType>, i0> c() {
            return this.onRegisterClick;
        }

        public final l<BEUserDefenceTrainingRegistration, i0> d() {
            return this.onTrainingClicked;
        }

        public final l<String, i0> e() {
            return this.onUrlClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onRegisterClick, params.onRegisterClick) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onTrainingClicked, params.onTrainingClicked) && t.c(this.onQuestionMarkClicked, params.onQuestionMarkClicked);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final cj1.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onRegisterClick.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.onTrainingClicked.hashCode()) * 31) + this.onQuestionMarkClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onRegisterClick=" + this.onRegisterClick + ", onUrlClick=" + this.onUrlClick + ", onTrainingClicked=" + this.onTrainingClicked + ", onQuestionMarkClicked=" + this.onQuestionMarkClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f42905b;

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
                iArr[z.DONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[z.IN_PROGRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[z.ABSENCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f42904a = iArr;
            int[] iArr2 = new int[y.values().length];
            try {
                iArr2[y.BANNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[y.WRONG_AGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[y.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f42905b = iArr2;
        }
    }

    public d(e eVar, mx.c cVar, si1.a aVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
        this.defenceTrainingEndpoints = aVar;
    }

    private final c30.b E(y yVar) {
        Label labelZ;
        Label labelZ2;
        int i15 = yVar == null ? -1 : b.f42905b[yVar.ordinal()];
        if (i15 == -1) {
            labelZ = z(ri1.b.W1);
        } else if (i15 == 1) {
            labelZ = z(ri1.b.S0);
        } else if (i15 == 2) {
            labelZ = z(ri1.b.W0);
        } else {
            if (i15 != 3) {
                throw new p();
            }
            labelZ = z(ri1.b.U0);
        }
        int i16 = yVar == null ? -1 : b.f42905b[yVar.ordinal()];
        if (i16 == -1) {
            labelZ2 = z(ri1.b.V1);
        } else if (i16 == 1) {
            labelZ2 = z(ri1.b.R0);
        } else if (i16 == 2) {
            labelZ2 = z(ri1.b.V0);
        } else {
            if (i16 != 3) {
                throw new p();
            }
            labelZ2 = z(ri1.b.T0);
        }
        return new c30.b.c(null, null, labelZ, labelZ2, null, null, null, 115, null);
    }

    private final BaseScaffoldData h(final Params params) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), z(ri1.b.T1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, new er.a() { // from class: dj1.a
            @Override // er.a
            public final Object a() {
                return d.i(params);
            }
        }, 6, null)), null, 20, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.b().a();
        return i0.f148189a;
    }

    private final List<t40.a.C4874a> l() {
        return v.q(new t40.a.C4874a(z(ri1.b.E1)), new t40.a.C4874a(z(ri1.b.G1)), new t40.a.C4874a(z(ri1.b.H1)), new t40.a.C4874a(z(ri1.b.F1)));
    }

    private final DefaultSingleCardData m(final BEUserDefenceTrainingRegistration bEUserDefenceTrainingRegistration, final Params params, int i15) {
        return new DefaultSingleCardData(null, new er.a() { // from class: dj1.b
            @Override // er.a
            public final Object a() {
                return d.q(params, bEUserDefenceTrainingRegistration);
            }
        }, false, null, null, false, null, new w0.StatusBadge(v(bEUserDefenceTrainingRegistration)), new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(bEUserDefenceTrainingRegistration.getTraining().getName(), "title_" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(bEUserDefenceTrainingRegistration.getUnit().getAddress(), "address_" + i15), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), new BottomSection(new SingleCardLabel(z(ri1.b.W), null, null, 0, 0, null, 62, null), new SingleCardLabel(mx.b.b(u(bEUserDefenceTrainingRegistration.getTraining()), "date_" + i15), null, null, 0, 0, null, 62, null)), 637, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, BEUserDefenceTrainingRegistration bEUserDefenceTrainingRegistration) {
        params.d().b(bEUserDefenceTrainingRegistration);
        return i0.f148189a;
    }

    private final ButtonData r(final List<BEUnitDefenceTrainingsByType> trainings, final Params params) {
        return new ButtonData("RegisterButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(z(ri1.b.I1), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: dj1.c
            @Override // er.a
            public final Object a() {
                return d.s(params, trainings);
            }
        }, 34, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, List list) {
        params.c().b(list);
        return i0.f148189a;
    }

    private final String u(UserDefenceTraining userDefenceTraining) {
        DefenceTrainingDay defenceTrainingDay = (DefenceTrainingDay) v.n0(userDefenceTraining.a());
        if (defenceTrainingDay == null) {
            return "";
        }
        int size = userDefenceTraining.a().size();
        return this.dateFormatter.d(defenceTrainingDay.getStartDate(), fz.c.DOTTED) + " (" + this.labelProvider.a(c20.d.f22741b, size, String.valueOf(size)).getText() + ')';
    }

    private final r50.a.WithIcon v(BEUserDefenceTrainingRegistration bEUserDefenceTrainingRegistration) {
        switch (b.f42904a[bEUserDefenceTrainingRegistration.getStatus().ordinal()]) {
            case 1:
                return new r50.a.WithIcon(null, z(ri1.b.f174409s1), null, 0, false, g.POSITIVE, 29, null);
            case 2:
                return new r50.a.WithIcon(null, z(ri1.b.f174421w1), null, 0, false, g.NOTICE, 29, null);
            case 3:
                return new r50.a.WithIcon(null, z(ri1.b.f174418v1), null, 0, false, g.NEGATIVE, 29, null);
            case 4:
                return new r50.a.WithIcon(null, z(ri1.b.f174412t1), null, 0, false, g.NEGATIVE, 29, null);
            case 5:
                return new r50.a.WithIcon(null, z(ri1.b.f174415u1), null, 0, false, g.POSITIVE, 29, null);
            case 6:
                return new r50.a.WithIcon(null, z(ri1.b.f174413u), null, 0, false, g.POSITIVE, 29, null);
            case 7:
                return new r50.a.WithIcon(null, z(ri1.b.f174406r1), null, 0, false, g.MINUS, 29, null);
            default:
                throw new p();
        }
    }

    private final Label z(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public cj1.c.a b(Params params) {
        cj1.b state = params.getState();
        if (!(state instanceof cj1.b.Initialized)) {
            if (state instanceof cj1.b.Error) {
                return new cj1.c.a.Error(((cj1.b.Error) state).getErrorVMS());
            }
            if (t.c(state, cj1.b.C0707b.f27346a)) {
                return cj1.c.a.b.f27349a;
            }
            throw new p();
        }
        boolean zIsEmpty = ((cj1.b.Initialized) params.getState()).getDashboardModel().a().isEmpty();
        vi1.c dashboardModel = ((cj1.b.Initialized) params.getState()).getDashboardModel();
        if (dashboardModel instanceof vi1.c.Empty) {
            vi1.c.Empty empty = (vi1.c.Empty) dashboardModel;
            return new cj1.c.a.InterfaceC0709c.Empty(h(params), params.a(), !zIsEmpty ? r(empty.a(), params) : null, z(ri1.b.O1), zIsEmpty ? E(empty.getRegistrationDisabledReason()) : null, !zIsEmpty ? new cj1.c.EmptyInfoData(z(ri1.b.J1), new InfoRowListData(l()), new c30.b.c(null, null, null, z(ri1.b.R1), null, null, new c30.a.Link(new LinkData(null, z(ri1.b.f174392n), this.defenceTrainingEndpoints.g(), LinkData.EnumC5775a.WEBSITE, false, params.e(), 17, null)), 55, null)) : null);
        }
        if (!(dashboardModel instanceof vi1.c.Registrations)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldDataH = h(params);
        Label labelZ = z(ri1.b.U1);
        er.a<i0> aVarA = params.a();
        vi1.c.Registrations registrations = (vi1.c.Registrations) dashboardModel;
        ButtonData buttonDataR = !zIsEmpty ? r(registrations.a(), params) : null;
        c30.b bVarE = zIsEmpty ? E(registrations.getRegistrationDisabledReason()) : null;
        List<BEUserDefenceTrainingRegistration> listC = registrations.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(m((BEUserDefenceTrainingRegistration) obj, params, i15));
            i15 = i16;
        }
        return new cj1.c.a.InterfaceC0709c.List(baseScaffoldDataH, aVarA, buttonDataR, labelZ, bVarE, arrayList);
    }
}
