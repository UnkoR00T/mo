package cd3;

import bd3.e;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
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
import q40.IconPageData;
import q40.j;
import uc3.GroupedPassports;
import uc3.PassportVisualization;
import uc3.PassportsData;
import uc3.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcd3/d;", "Lxw/f;", "Lcd3/d$a;", "Lbd3/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Luc3/a;", "groupedPassports", "", "takeValidPassports", "Lkotlin/Function1;", "Luc3/h;", "Loq/i0;", "onClick", "", "Ln50/g;", "h", "(Luc3/a;ZLer/l;)Ljava/util/List;", "isValid", "Lr50/a$b;", "m", "(Z)Lr50/a$b;", "Luc3/g;", "Lmx/a;", "v", "(Luc3/g;)Lmx/a;", "Lc30/b$c;", "l", "()Lc30/b$c;", "params", "q", "(Lcd3/d$a;)Lbd3/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: cd3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010\u001fR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"Lcd3/d$a;", "", "Lbd3/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Luc3/h;", "onGoToPassportDetails", "onUpdateClicked", "Lbd3/c;", "onSwitchTab", "<init>", "(Lbd3/d;Ler/a;Ler/l;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbd3/d;", "e", "()Lbd3/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final bd3.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PassportVisualization, i0> onGoToPassportDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUpdateClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<bd3.c, i0> onSwitchTab;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(bd3.d dVar, er.a<i0> aVar, l<? super PassportVisualization, i0> lVar, er.a<i0> aVar2, l<? super bd3.c, i0> lVar2) {
            this.state = dVar;
            this.onBack = aVar;
            this.onGoToPassportDetails = lVar;
            this.onUpdateClicked = aVar2;
            this.onSwitchTab = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<PassportVisualization, i0> b() {
            return this.onGoToPassportDetails;
        }

        public final l<bd3.c, i0> c() {
            return this.onSwitchTab;
        }

        public final er.a<i0> d() {
            return this.onUpdateClicked;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final bd3.d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onGoToPassportDetails, params.onGoToPassportDetails) && t.c(this.onUpdateClicked, params.onUpdateClicked) && t.c(this.onSwitchTab, params.onSwitchTab);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onGoToPassportDetails.hashCode()) * 31) + this.onUpdateClicked.hashCode()) * 31) + this.onSwitchTab.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onGoToPassportDetails=" + this.onGoToPassportDetails + ", onUpdateClicked=" + this.onUpdateClicked + ", onSwitchTab=" + this.onSwitchTab + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f25488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f25489c;

        static {
            int[] iArr = new int[bd3.c.values().length];
            try {
                iArr[bd3.c.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bd3.c.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25487a = iArr;
            int[] iArr2 = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr2[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f25488b = iArr2;
            int[] iArr3 = new int[g.values().length];
            try {
                iArr3[g.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[g.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[g.DIPLOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[g.TEMPORARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[g.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f25489c = iArr3;
        }
    }

    public d(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<DefaultSingleCardData> h(GroupedPassports groupedPassports, boolean takeValidPassports, final l<? super PassportVisualization, i0> onClick) {
        List<PassportVisualization> listB;
        Label labelB;
        if (takeValidPassports) {
            listB = groupedPassports.c();
        } else {
            if (takeValidPassports) {
                throw new p();
            }
            listB = groupedPassports.b();
        }
        List<PassportVisualization> list = listB;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final PassportVisualization passportVisualization = (PassportVisualization) obj;
            w0.StatusBadge statusBadge = new w0.StatusBadge(m(takeValidPassports));
            BodySection bodySection = new BodySection(new SingleCardLabel(v(passportVisualization.getType()), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(passportVisualization.getNumber()), "passportNumber"), null, null, 0, 0, null, 62, null)), null, 4, null);
            Label labelC = this.labelProvider.c(mc3.a.D);
            Label.Companion companion = Label.INSTANCE;
            SingleCardLabel singleCardLabel = new SingleCardLabel(labelC.o(companion.a()), null, null, 0, 0, null, 62, null);
            fz.b.LocalDate expiryDate = passportVisualization.getExpiryDate();
            if (expiryDate == null || (labelB = mx.b.b(this.dateFormatter.d(expiryDate, fz.c.DOTTED), "formattedDate")) == null) {
                labelB = companion.b();
            }
            BottomSection bottomSection = new BottomSection(singleCardLabel, new SingleCardLabel(labelB, null, null, 0, 0, null, 62, null));
            arrayList.add(new DefaultSingleCardData("Passport" + i15, new er.a() { // from class: cd3.b
                @Override // er.a
                public final Object a() {
                    return d.i(onClick, passportVisualization);
                }
            }, false, null, null, false, null, statusBadge, bodySection, null, x0.Icon.INSTANCE.b(), bottomSection, 636, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, PassportVisualization passportVisualization) {
        lVar.b(passportVisualization);
        return i0.f148189a;
    }

    private final c30.b.c l() {
        return new c30.b.c("PassportDataInfoAlert", null, null, this.labelProvider.c(mc3.a.E), null, null, null, 118, null);
    }

    private final r50.a.WithIcon m(boolean isValid) {
        if (isValid) {
            return new r50.a.WithIcon(null, this.labelProvider.c(mc3.a.f125573i0), null, 0, false, r50.g.POSITIVE, 29, null);
        }
        if (isValid) {
            throw new p();
        }
        return new r50.a.WithIcon(null, this.labelProvider.c(mc3.a.f125577k0), null, 0, false, r50.g.NEGATIVE, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, n.Switch.EnumC5973b enumC5973b) {
        bd3.c cVar;
        int i15 = b.f25488b[enumC5973b.ordinal()];
        if (i15 == 1) {
            cVar = bd3.c.VALID;
        } else {
            if (i15 != 2) {
                throw new p();
            }
            cVar = bd3.c.REVOKED;
        }
        params.c().b(cVar);
        return i0.f148189a;
    }

    private static final dd3.a.Passports s(d dVar, PassportsData passportsData, boolean z15, final Params params) {
        List<DefaultSingleCardData> listH = dVar.h(passportsData.getGroupedPassports(), z15, new l() { // from class: cd3.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.u(params, (PassportVisualization) obj);
            }
        });
        c30.b.c cVarL = dVar.l();
        if (!z15) {
            cVarL = null;
        }
        return new dd3.a.Passports(listH, cVarL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, PassportVisualization passportVisualization) {
        params.b().b(passportVisualization);
        return i0.f148189a;
    }

    private final Label v(g gVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f25489c[gVar.ordinal()];
        if (i16 == 1) {
            i15 = mc3.a.f125581m0;
        } else if (i16 == 2) {
            i15 = mc3.a.f125583n0;
        } else if (i16 == 3) {
            i15 = mc3.a.f125585o0;
        } else if (i16 == 4) {
            i15 = mc3.a.f125587p0;
        } else {
            if (i16 != 5) {
                throw new p();
            }
            i15 = mc3.a.f125581m0;
        }
        return cVar.c(i15);
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        dd3.b twoLists;
        dd3.b.OneList oneList;
        bd3.d state = params.getState();
        if (state instanceof bd3.d.b) {
            return e.a.b.f18498a;
        }
        if (!(state instanceof bd3.d.Initialized)) {
            throw new p();
        }
        bd3.d.Initialized initialized = (bd3.d.Initialized) state;
        PassportsData passportsData = initialized.getPassportsData();
        boolean z15 = initialized.getTab() == bd3.c.VALID;
        Label labelC = this.labelProvider.c(mc3.a.F);
        Label label = new Label(labelC.getText() + ": " + this.dateFormatter.d(passportsData.getDate(), fz.c.FULL_MONTH_DATE_TIME_SEC_DOT), labelC.getTag());
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(mc3.a.H), null, null, null, 28, null), null, null, null, null, 61, null);
        if (!passportsData.getGroupedPassports().a().isEmpty()) {
            if (passportsData.getGroupedPassports().b().isEmpty()) {
                oneList = new dd3.b.OneList(s(this, passportsData, z15, params));
            } else {
                Label labelC2 = this.labelProvider.c(mc3.a.f125575j0);
                n.Switch.EnumC5973b enumC5973b = n.Switch.EnumC5973b.LEFT;
                n.Switch.TabItem tabItem = new n.Switch.TabItem(labelC2, enumC5973b);
                Label labelC3 = this.labelProvider.c(mc3.a.f125579l0);
                n.Switch.EnumC5973b enumC5973b2 = n.Switch.EnumC5973b.RIGHT;
                n.Switch.TabItem tabItem2 = new n.Switch.TabItem(labelC3, enumC5973b2);
                int i15 = b.f25487a[initialized.getTab().ordinal()];
                if (i15 == 1) {
                    enumC5973b2 = enumC5973b;
                } else if (i15 != 2) {
                    throw new p();
                }
                twoLists = new dd3.b.TwoLists(new n.Switch(tabItem, tabItem2, enumC5973b2, false, new l() { // from class: cd3.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.r(params, (n.Switch.EnumC5973b) obj);
                    }
                }, 8, null), (z15 && passportsData.getGroupedPassports().c().isEmpty()) ? new dd3.a.Empty(new IconPageData(new j.a(jz.a.f106807k2), this.labelProvider.c(mc3.a.I), this.labelProvider.c(mc3.a.B), null, null, null, false, 72, null)) : s(this, passportsData, z15, params));
            }
            return new e.a.Initialized(baseScaffoldData, label, twoLists, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(mc3.a.G), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), params.a());
        }
        oneList = new dd3.b.OneList(new dd3.a.Empty(new IconPageData(new j.a(jz.a.f106807k2), this.labelProvider.c(mc3.a.C), this.labelProvider.c(mc3.a.B), null, null, null, false, 72, null)));
        twoLists = oneList;
        return new e.a.Initialized(baseScaffoldData, label, twoLists, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(mc3.a.G), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), params.a());
    }
}
