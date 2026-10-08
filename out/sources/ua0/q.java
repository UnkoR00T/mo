package ua0;

import androidx.compose.ui.graphics.Color;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pa0.DashboardThemeColors;
import pq.v;
import pq.v0;
import r70.BaseFloatingActionButtonData;
import s20.DocumentRefreshCardData;
import ta0.DesktopDocumentModel;
import x40.LinkData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lua0/q;", "Lxw/f;", "Lua0/q$a;", "Lta0/c$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "", "hasAnyNotDisplayedPush", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lx50/a$c;", "Z", "(ZLer/a;)Lx50/a$c;", "params", "I", "(Lua0/q$a;)Lta0/c$a;", "Lmx/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lmx/a;", "a", "Lmx/c;", "b", "Lu04/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements xw.f<Params, ta0.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: ua0.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b \u0010&R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b0\u0010-R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b*\u0010-R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b)\u0010&R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b.\u0010&¨\u00062"}, d2 = {"Lua0/q$a;", "", "Lta0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "addDocument", "deactivateApp", "infoPageButtonAction", "acceptUserAgreements", "Lkotlin/Function1;", "", "openUrlAction", "Lsa0/a;", "showDialog", "", "onTermsSwitchChanged", "onPolicySwitchChanged", "Lta0/d;", "onDocumentClick", "onAddDocument", "onNotificationsClick", "<init>", "(Lta0/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lta0/b;", "l", "()Lta0/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "f", "Ler/l;", "j", "()Ler/l;", "g", "k", "h", "i", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ta0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addDocument;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deactivateApp;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> infoPageButtonAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> acceptUserAgreements;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> openUrlAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<sa0.a, i0> showDialog;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onTermsSwitchChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onPolicySwitchChanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DesktopDocumentModel, i0> onDocumentClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddDocument;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNotificationsClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ta0.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super String, i0> lVar, er.l<? super sa0.a, i0> lVar2, er.l<? super Boolean, i0> lVar3, er.l<? super Boolean, i0> lVar4, er.l<? super DesktopDocumentModel, i0> lVar5, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = bVar;
            this.addDocument = aVar;
            this.deactivateApp = aVar2;
            this.infoPageButtonAction = aVar3;
            this.acceptUserAgreements = aVar4;
            this.openUrlAction = lVar;
            this.showDialog = lVar2;
            this.onTermsSwitchChanged = lVar3;
            this.onPolicySwitchChanged = lVar4;
            this.onDocumentClick = lVar5;
            this.onAddDocument = aVar5;
            this.onNotificationsClick = aVar6;
        }

        public final er.a<i0> a() {
            return this.acceptUserAgreements;
        }

        public final er.a<i0> b() {
            return this.addDocument;
        }

        public final er.a<i0> c() {
            return this.deactivateApp;
        }

        public final er.a<i0> d() {
            return this.infoPageButtonAction;
        }

        public final er.a<i0> e() {
            return this.onAddDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.addDocument, params.addDocument) && t.c(this.deactivateApp, params.deactivateApp) && t.c(this.infoPageButtonAction, params.infoPageButtonAction) && t.c(this.acceptUserAgreements, params.acceptUserAgreements) && t.c(this.openUrlAction, params.openUrlAction) && t.c(this.showDialog, params.showDialog) && t.c(this.onTermsSwitchChanged, params.onTermsSwitchChanged) && t.c(this.onPolicySwitchChanged, params.onPolicySwitchChanged) && t.c(this.onDocumentClick, params.onDocumentClick) && t.c(this.onAddDocument, params.onAddDocument) && t.c(this.onNotificationsClick, params.onNotificationsClick);
        }

        public final er.l<DesktopDocumentModel, i0> f() {
            return this.onDocumentClick;
        }

        public final er.a<i0> g() {
            return this.onNotificationsClick;
        }

        public final er.l<Boolean, i0> h() {
            return this.onPolicySwitchChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.addDocument.hashCode()) * 31) + this.deactivateApp.hashCode()) * 31) + this.infoPageButtonAction.hashCode()) * 31) + this.acceptUserAgreements.hashCode()) * 31) + this.openUrlAction.hashCode()) * 31) + this.showDialog.hashCode()) * 31) + this.onTermsSwitchChanged.hashCode()) * 31) + this.onPolicySwitchChanged.hashCode()) * 31) + this.onDocumentClick.hashCode()) * 31) + this.onAddDocument.hashCode()) * 31) + this.onNotificationsClick.hashCode();
        }

        public final er.l<Boolean, i0> i() {
            return this.onTermsSwitchChanged;
        }

        public final er.l<String, i0> j() {
            return this.openUrlAction;
        }

        public final er.l<sa0.a, i0> k() {
            return this.showDialog;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ta0.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", addDocument=" + this.addDocument + ", deactivateApp=" + this.deactivateApp + ", infoPageButtonAction=" + this.infoPageButtonAction + ", acceptUserAgreements=" + this.acceptUserAgreements + ", openUrlAction=" + this.openUrlAction + ", showDialog=" + this.showDialog + ", onTermsSwitchChanged=" + this.onTermsSwitchChanged + ", onPolicySwitchChanged=" + this.onPolicySwitchChanged + ", onDocumentClick=" + this.onDocumentClick + ", onAddDocument=" + this.onAddDocument + ", onNotificationsClick=" + this.onNotificationsClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f196688b;

        static {
            int[] iArr = new int[ta0.e.values().length];
            try {
                iArr[ta0.e.ALREADY_DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ta0.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ta0.e.NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ta0.e.TAKES_TOO_LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ta0.e.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f196687a = iArr;
            int[] iArr2 = new int[vf0.d.values().length];
            try {
                iArr2[vf0.d.SCHOOL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[vf0.d.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[vf0.d.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f196688b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f196689a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-786097213);
            if (p076m2.t.k()) {
                p076m2.t.o(-786097213, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.mapper.DesktopMapper.invoke.<anonymous> (DesktopMapper.kt:301)");
            }
            long headerIconBackground = ((DashboardThemeColors) rVar.N(pa0.e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"ua0/q$d", "Ls20/c;", "", "a", "I", "g", "()I", "backgroundBigResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "b", "Ler/p;", "()Ler/p;", "backgroundBigBorderColor", "c", "e", "backgroundSmallResId", "d", "getCardMiniResId", "cardMiniResId", "j", "cardLogoResId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements s20.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int backgroundBigResId = c20.b.T0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.p<p076m2.r, Integer, Color> backgroundBigBorderColor = a.f196695a;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int backgroundSmallResId = c20.b.U0;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int cardMiniResId = jz.a.P2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int cardLogoResId = jz.a.f106870t2;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f196695a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(1140071710);
                if (p076m2.t.k()) {
                    p076m2.t.o(1140071710, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.mapper.DesktopMapper.invoke.<anonymous>.<no name provided>.backgroundBigBorderColor.<anonymous> (DesktopMapper.kt:99)");
                }
                long borderSchool = ((DashboardThemeColors) rVar.N(pa0.e.e())).getBorderSchool();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return borderSchool;
            }
        }

        d() {
        }

        @Override // s20.c
        public er.p<p076m2.r, Integer, Color> b() {
            return this.backgroundBigBorderColor;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public int getBackgroundSmallResId() {
            return this.backgroundSmallResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public int getBackgroundBigResId() {
            return this.backgroundBigResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getCardLogoResId() {
            return this.cardLogoResId;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"ua0/q$e", "Ls20/c;", "", "a", "I", "g", "()I", "backgroundBigResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "b", "Ler/p;", "()Ler/p;", "backgroundBigBorderColor", "c", "e", "backgroundSmallResId", "d", "getCardMiniResId", "cardMiniResId", "j", "cardLogoResId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements s20.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int backgroundBigResId = c20.b.f22691l1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.p<p076m2.r, Integer, Color> backgroundBigBorderColor = a.f196701a;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int backgroundSmallResId = c20.b.f22695m1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int cardMiniResId = jz.a.M2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int cardLogoResId = jz.a.G2;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f196701a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(794160602);
                if (p076m2.t.k()) {
                    p076m2.t.o(794160602, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.mapper.DesktopMapper.invoke.<anonymous>.<no name provided>.backgroundBigBorderColor.<anonymous> (DesktopMapper.kt:121)");
                }
                long borderDrivingLicence = ((DashboardThemeColors) rVar.N(pa0.e.e())).getBorderDrivingLicence();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return borderDrivingLicence;
            }
        }

        e() {
        }

        @Override // s20.c
        public er.p<p076m2.r, Integer, Color> b() {
            return this.backgroundBigBorderColor;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public int getBackgroundSmallResId() {
            return this.backgroundSmallResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public int getBackgroundBigResId() {
            return this.backgroundBigResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getCardLogoResId() {
            return this.cardLogoResId;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"ua0/q$f", "Ls20/c;", "", "a", "I", "g", "()I", "backgroundBigResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "b", "Ler/p;", "()Ler/p;", "backgroundBigBorderColor", "c", "e", "backgroundSmallResId", "d", "getCardMiniResId", "cardMiniResId", "j", "cardLogoResId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements s20.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int backgroundBigResId = c20.b.A0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.p<p076m2.r, Integer, Color> backgroundBigBorderColor = a.f196707a;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int backgroundSmallResId = c20.b.B0;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int cardMiniResId = jz.a.O2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int cardLogoResId = jz.a.f106884v2;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f196707a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(1571947325);
                if (p076m2.t.k()) {
                    p076m2.t.o(1571947325, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.mapper.DesktopMapper.invoke.<anonymous>.<no name provided>.backgroundBigBorderColor.<anonymous> (DesktopMapper.kt:143)");
                }
                long borderSchool = ((DashboardThemeColors) rVar.N(pa0.e.e())).getBorderSchool();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return borderSchool;
            }
        }

        f() {
        }

        @Override // s20.c
        public er.p<p076m2.r, Integer, Color> b() {
            return this.backgroundBigBorderColor;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public int getBackgroundSmallResId() {
            return this.backgroundSmallResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public int getBackgroundBigResId() {
            return this.backgroundBigResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getCardLogoResId() {
            return this.cardLogoResId;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"ua0/q$g", "Ls20/c;", "", "a", "I", "g", "()I", "backgroundBigResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "b", "Ler/p;", "()Ler/p;", "backgroundBigBorderColor", "c", "e", "backgroundSmallResId", "d", "getCardMiniResId", "cardMiniResId", "j", "cardLogoResId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements s20.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int backgroundBigResId = c20.b.V0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.p<p076m2.r, Integer, Color> backgroundBigBorderColor = a.f196713a;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int backgroundSmallResId = c20.b.W0;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int cardMiniResId = jz.a.T2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int cardLogoResId = jz.a.f106898x2;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f196713a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(1504914051);
                if (p076m2.t.k()) {
                    p076m2.t.o(1504914051, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.mapper.DesktopMapper.invoke.<anonymous>.<no name provided>.backgroundBigBorderColor.<anonymous> (DesktopMapper.kt:165)");
                }
                long borderSchool = ((DashboardThemeColors) rVar.N(pa0.e.e())).getBorderSchool();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return borderSchool;
            }
        }

        g() {
        }

        @Override // s20.c
        public er.p<p076m2.r, Integer, Color> b() {
            return this.backgroundBigBorderColor;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public int getBackgroundSmallResId() {
            return this.backgroundSmallResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public int getBackgroundBigResId() {
            return this.backgroundBigResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getCardLogoResId() {
            return this.cardLogoResId;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"ua0/q$h", "Ls20/c;", "", "a", "I", "g", "()I", "backgroundBigResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "b", "Ler/p;", "()Ler/p;", "backgroundBigBorderColor", "c", "e", "backgroundSmallResId", "d", "getCardMiniResId", "cardMiniResId", "j", "cardLogoResId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements s20.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int backgroundBigResId = c20.b.f22663e1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.p<p076m2.r, Integer, Color> backgroundBigBorderColor = a.f196719a;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int backgroundSmallResId = c20.b.f22667f1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int cardMiniResId = jz.a.f106731a3;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int cardLogoResId = jz.a.B2;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f196719a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(-889754466);
                if (p076m2.t.k()) {
                    p076m2.t.o(-889754466, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.mapper.DesktopMapper.invoke.<anonymous>.<no name provided>.backgroundBigBorderColor.<anonymous> (DesktopMapper.kt:187)");
                }
                long borderSchool = ((DashboardThemeColors) rVar.N(pa0.e.e())).getBorderSchool();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return borderSchool;
            }
        }

        h() {
        }

        @Override // s20.c
        public er.p<p076m2.r, Integer, Color> b() {
            return this.backgroundBigBorderColor;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: e, reason: from getter */
        public int getBackgroundSmallResId() {
            return this.backgroundSmallResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: g, reason: from getter */
        public int getBackgroundBigResId() {
            return this.backgroundBigResId;
        }

        @Override // s20.c
        /* JADX INFO: renamed from: j, reason: from getter */
        public int getCardLogoResId() {
            return this.cardLogoResId;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"ua0/q$i", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.f106798j0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        i(q qVar) {
            this.contentDescription = qVar.labelProvider.c(ia0.a.f90610b);
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f196722a = new j();

        j() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1932149250);
            if (p076m2.t.k()) {
                p076m2.t.o(-1932149250, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.mapper.DesktopMapper.provideNotificationsMenuButton.<anonymous> (DesktopMapper.kt:379)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"ua0/q$k", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class k implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.f106736b0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        k(q qVar) {
            this.contentDescription = qVar.labelProvider.c(ia0.a.f90608a);
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    public q(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(Params params) {
        params.k().b(sa0.a.c.f179568a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params) {
        params.k().b(sa0.a.d.f179569a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params) {
        params.k().b(sa0.a.d.f179569a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Params params, DesktopDocumentModel desktopDocumentModel) {
        params.f().b(desktopDocumentModel);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(Params params, DesktopDocumentModel desktopDocumentModel) {
        params.f().b(desktopDocumentModel);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(Params params, DesktopDocumentModel desktopDocumentModel) {
        params.f().b(desktopDocumentModel);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(Params params, DesktopDocumentModel desktopDocumentModel) {
        params.f().b(desktopDocumentModel);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(Params params, DesktopDocumentModel desktopDocumentModel) {
        params.f().b(desktopDocumentModel);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(Params params) {
        params.k().b(sa0.a.c.f179568a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(Params params) {
        params.k().b(sa0.a.b.f179567a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(Params params) {
        params.k().b(sa0.a.c.f179568a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(Params params) {
        params.k().b(sa0.a.c.f179568a);
        return i0.f148189a;
    }

    private final x50.a.MenuButtonData Z(boolean hasAnyNotDisplayedPush, er.a<i0> onClick) {
        if (hasAnyNotDisplayedPush) {
            return new x50.a.MenuButtonData(new i(this), j.f196722a, null, onClick, 4, null);
        }
        if (hasAnyNotDisplayedPush) {
            throw new oq.p();
        }
        return new x50.a.MenuButtonData(new k(this), null, null, onClick, 6, null);
    }

    public final Label H() {
        return this.labelProvider.c(ia0.a.f90636o);
    }

    @Override // er.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public ta0.c.a b(final Params params) {
        hz.b invalid;
        hz.b invalid2;
        s20.d checkMark;
        s20.d dVar;
        DocumentRefreshCardData documentRefreshCardData;
        DocumentRefreshCardData documentRefreshCardData2;
        s20.d checkMark2;
        s20.d dVar2;
        DocumentRefreshCardData documentRefreshCardData3;
        s20.d checkMark3;
        s20.d dVar3;
        s20.d checkMark4;
        s20.d checkMark5;
        s20.d dVar4;
        ta0.b state = params.getState();
        if (!(state instanceof ta0.b.DocumentsLoaded)) {
            boolean z15 = false;
            if (t.c(state, ta0.b.C4917b.f189138a)) {
                return new ta0.c.a.EmptyStateData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: ua0.e
                    @Override // er.a
                    public final Object a() {
                        return q.U();
                    }
                }), null, null, null, null, 30, null), null, null, null, null, 61, null), this.labelProvider.c(ia0.a.K), this.labelProvider.c(ia0.a.J), new ButtonTextData(null, this.labelProvider.c(ia0.a.f90631l0), null, null, params.d(), 13, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ia0.a.H), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ia0.a.I), null, 2, null), new k30.d.Secondary(null, 1, null), null, new er.a() { // from class: ua0.f
                    @Override // er.a
                    public final Object a() {
                        return q.V(params);
                    }
                }, 35, null), new er.a() { // from class: ua0.g
                    @Override // er.a
                    public final Object a() {
                        return q.W(params);
                    }
                });
            }
            if (t.c(state, ta0.b.c.f189139a)) {
                return new ta0.c.a.LoadingStateData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: ua0.h
                    @Override // er.a
                    public final Object a() {
                        return q.X();
                    }
                }), null, null, null, null, 30, null), null, null, null, null, 61, null), this.labelProvider.c(ia0.a.f90620g), new er.a() { // from class: ua0.i
                    @Override // er.a
                    public final Object a() {
                        return q.Y(params);
                    }
                });
            }
            if (t.c(state, ta0.b.d.f189140a)) {
                return new ta0.c.a.RevokedStateData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: ua0.j
                    @Override // er.a
                    public final Object a() {
                        return q.K();
                    }
                }), null, null, null, null, 30, null), null, null, null, null, 61, null), this.labelProvider.c(ia0.a.L), this.labelProvider.c(ia0.a.J), new ButtonTextData(null, this.labelProvider.c(ia0.a.f90631l0), null, null, params.d(), 13, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ia0.a.H), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ia0.a.I), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.c(), 35, null), new er.a() { // from class: ua0.k
                    @Override // er.a
                    public final Object a() {
                        return q.L(params);
                    }
                });
            }
            if (!(state instanceof ta0.b.UserAgreements)) {
                throw new oq.p();
            }
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), new er.a() { // from class: ua0.l
                @Override // er.a
                public final Object a() {
                    return q.M(params);
                }
            }), null, null, null, null, 30, null), null, null, null, null, 61, null);
            o40.a.Icon icon = new o40.a.Icon(jz.a.O0, null, c.f196689a, this.labelProvider.c(ia0.a.f90651v0), this.labelProvider.c(ia0.a.f90649u0), null, 34, null);
            ta0.b.UserAgreements userAgreements = (ta0.b.UserAgreements) state;
            boolean isTermsChecked = userAgreements.getIsTermsChecked();
            boolean z16 = t.c(userAgreements.getValidationState(), new hz.b.Invalid(null, 1, null)) && !userAgreements.getIsTermsChecked() && userAgreements.getShowValidation();
            if (z16) {
                invalid = new hz.b.Invalid(this.labelProvider.c(ia0.a.f90647t0));
            } else {
                if (z16) {
                    throw new oq.p();
                }
                invalid = hz.b.C2039b.f86846c;
            }
            hz.b bVar = invalid;
            Label labelC = this.labelProvider.c(ia0.a.f90645s0);
            Label labelC2 = this.labelProvider.c(ia0.a.f90643r0);
            String strT = this.commonEndpoints.T();
            er.l<String, i0> lVarJ = params.j();
            LinkData.EnumC5775a enumC5775a = LinkData.EnumC5775a.WEBSITE;
            s50.a.b bVar2 = new s50.a.b("termsConditions", isTermsChecked, labelC, bVar, false, null, params.i(), null, new s50.b.Link(new LinkData(null, labelC2, strT, enumC5775a, false, lVarJ, 17, null)), this.labelProvider.c(ia0.a.f90643r0), 176, null);
            boolean isPolicyChecked = userAgreements.getIsPolicyChecked();
            if (t.c(userAgreements.getValidationState(), new hz.b.Invalid(null, 1, null)) && !userAgreements.getIsPolicyChecked() && userAgreements.getShowValidation()) {
                z15 = true;
            }
            if (z15) {
                invalid2 = new hz.b.Invalid(this.labelProvider.c(ia0.a.f90641q0));
            } else {
                if (z15) {
                    throw new oq.p();
                }
                invalid2 = hz.b.C2039b.f86846c;
            }
            return new ta0.c.a.UserAgreements(baseScaffoldData, icon, bVar2, new s50.a.b("privacyPolicyInput", isPolicyChecked, this.labelProvider.c(ia0.a.f90639p0), invalid2, false, null, params.h(), null, new s50.b.Link(new LinkData(null, this.labelProvider.c(ia0.a.f90637o0), this.commonEndpoints.p0(), enumC5775a, false, params.j(), 17, null)), this.labelProvider.c(ia0.a.f90637o0), 176, null), new ButtonData(null, null, new k30.a.Large(true), new k30.c.WithText(this.labelProvider.c(ia0.a.f90624i), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), new er.a() { // from class: ua0.m
                @Override // er.a
                public final Object a() {
                    return q.N(params);
                }
            });
        }
        BaseScaffoldData.EnumC2111a enumC2111a = BaseScaffoldData.EnumC2111a.PinnedScroll;
        ta0.b.DocumentsLoaded documentsLoaded = (ta0.b.DocumentsLoaded) state;
        x50.i.Small small = new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: ua0.a
            @Override // er.a
            public final Object a() {
                return q.J();
            }
        }), null, null, new x50.a.IconList(v.e(Z(documentsLoaded.getHasAnyNotDisplayedPush(), params.g()))), null, 22, null);
        List listE = v.e(new BaseFloatingActionButtonData(jz.a.f106760e0, new BaseFloatingActionButtonData.InterfaceC4389a.Extended(this.labelProvider.c(ia0.a.f90653x)), params.e()));
        if (!documentsLoaded.getAddDocumentButtonVisible()) {
            listE = null;
        }
        if (listE == null) {
            listE = v.n();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(enumC2111a, small, listE, v0.i(), null, null, 48, null);
        Label labelC3 = this.labelProvider.c(ia0.a.G);
        List<DesktopDocumentModel> listD = documentsLoaded.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        for (final DesktopDocumentModel desktopDocumentModel : listD) {
            int i15 = b.f196688b[desktopDocumentModel.getDocumentType().ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        f fVar = new f();
                        Label labelC4 = this.labelProvider.c(ia0.a.E);
                        Label.Companion companion = Label.INSTANCE;
                        Label labelC5 = companion.c();
                        int i16 = b.f196687a[desktopDocumentModel.getDocumentVisibleStatus().ordinal()];
                        if (i16 == 1) {
                            checkMark3 = new s20.d.CheckMark(companion.c());
                        } else if (i16 != 2) {
                            if (i16 == 3 || i16 == 4) {
                                checkMark3 = new s20.d.Notice(companion.c());
                            } else {
                                if (i16 != 5) {
                                    throw new oq.p();
                                }
                                dVar3 = null;
                            }
                            documentRefreshCardData = new DocumentRefreshCardData(fVar, labelC4, null, labelC5, dVar3, new er.a() { // from class: ua0.p
                                @Override // er.a
                                public final Object a() {
                                    return q.Q(params, desktopDocumentModel);
                                }
                            }, null, "FamilyCard", 68, null);
                        } else {
                            checkMark3 = new s20.d.XMark(companion.c());
                        }
                        dVar3 = checkMark3;
                        documentRefreshCardData = new DocumentRefreshCardData(fVar, labelC4, null, labelC5, dVar3, new er.a() { // from class: ua0.p
                            @Override // er.a
                            public final Object a() {
                                return q.Q(params, desktopDocumentModel);
                            }
                        }, null, "FamilyCard", 68, null);
                    } else if (i15 == 4) {
                        g gVar = new g();
                        Label labelC6 = this.labelProvider.c(ia0.a.M);
                        Label.Companion companion2 = Label.INSTANCE;
                        Label labelC7 = companion2.c();
                        int i17 = b.f196687a[desktopDocumentModel.getDocumentVisibleStatus().ordinal()];
                        if (i17 == 1) {
                            checkMark4 = new s20.d.CheckMark(companion2.c());
                        } else if (i17 == 2) {
                            checkMark4 = new s20.d.XMark(companion2.c());
                        } else if (i17 == 3 || i17 == 4) {
                            checkMark4 = new s20.d.Notice(companion2.c());
                        } else {
                            if (i17 != 5) {
                                throw new oq.p();
                            }
                            checkMark4 = null;
                        }
                        documentRefreshCardData3 = new DocumentRefreshCardData(gVar, labelC6, null, labelC7, checkMark4, new er.a() { // from class: ua0.b
                            @Override // er.a
                            public final Object a() {
                                return q.R(params, desktopDocumentModel);
                            }
                        }, null, "UutCard", 68, null);
                    } else {
                        if (i15 != 5) {
                            throw new oq.p();
                        }
                        h hVar = new h();
                        Label labelC8 = this.labelProvider.c(ia0.a.C);
                        Label.Companion companion3 = Label.INSTANCE;
                        Label labelC9 = companion3.c();
                        int i18 = b.f196687a[desktopDocumentModel.getDocumentVisibleStatus().ordinal()];
                        if (i18 == 1) {
                            checkMark5 = new s20.d.CheckMark(companion3.c());
                        } else if (i18 != 2) {
                            if (i18 == 3 || i18 == 4) {
                                checkMark5 = new s20.d.Notice(companion3.c());
                            } else {
                                if (i18 != 5) {
                                    throw new oq.p();
                                }
                                dVar4 = null;
                            }
                            documentRefreshCardData2 = new DocumentRefreshCardData(hVar, labelC8, null, labelC9, dVar4, new er.a() { // from class: ua0.c
                                @Override // er.a
                                public final Object a() {
                                    return q.S(params, desktopDocumentModel);
                                }
                            }, null, "UutCard", 68, null);
                        } else {
                            checkMark5 = new s20.d.XMark(companion3.c());
                        }
                        dVar4 = checkMark5;
                        documentRefreshCardData2 = new DocumentRefreshCardData(hVar, labelC8, null, labelC9, dVar4, new er.a() { // from class: ua0.c
                            @Override // er.a
                            public final Object a() {
                                return q.S(params, desktopDocumentModel);
                            }
                        }, null, "UutCard", 68, null);
                    }
                    arrayList.add(documentRefreshCardData2);
                } else {
                    e eVar = new e();
                    Label labelC10 = this.labelProvider.c(ia0.a.D);
                    Label.Companion companion4 = Label.INSTANCE;
                    Label labelC11 = companion4.c();
                    int i19 = b.f196687a[desktopDocumentModel.getDocumentVisibleStatus().ordinal()];
                    if (i19 == 1) {
                        checkMark2 = new s20.d.CheckMark(companion4.c());
                    } else if (i19 != 2) {
                        if (i19 == 3 || i19 == 4) {
                            checkMark2 = new s20.d.Notice(companion4.c());
                        } else {
                            if (i19 != 5) {
                                throw new oq.p();
                            }
                            dVar2 = null;
                        }
                        documentRefreshCardData3 = new DocumentRefreshCardData(eVar, labelC10, null, labelC11, dVar2, new er.a() { // from class: ua0.o
                            @Override // er.a
                            public final Object a() {
                                return q.P(params, desktopDocumentModel);
                            }
                        }, null, "DrivingLicence", 68, null);
                    } else {
                        checkMark2 = new s20.d.XMark(companion4.c());
                    }
                    dVar2 = checkMark2;
                    documentRefreshCardData3 = new DocumentRefreshCardData(eVar, labelC10, null, labelC11, dVar2, new er.a() { // from class: ua0.o
                        @Override // er.a
                        public final Object a() {
                            return q.P(params, desktopDocumentModel);
                        }
                    }, null, "DrivingLicence", 68, null);
                }
                documentRefreshCardData2 = documentRefreshCardData3;
                arrayList.add(documentRefreshCardData2);
            } else {
                d dVar5 = new d();
                Label labelC12 = this.labelProvider.c(ia0.a.F);
                Label.Companion companion5 = Label.INSTANCE;
                Label labelC13 = companion5.c();
                int i25 = b.f196687a[desktopDocumentModel.getDocumentVisibleStatus().ordinal()];
                if (i25 == 1) {
                    checkMark = new s20.d.CheckMark(companion5.c());
                } else if (i25 != 2) {
                    if (i25 == 3 || i25 == 4) {
                        checkMark = new s20.d.Notice(companion5.c());
                    } else {
                        if (i25 != 5) {
                            throw new oq.p();
                        }
                        dVar = null;
                    }
                    documentRefreshCardData = new DocumentRefreshCardData(dVar5, labelC12, null, labelC13, dVar, new er.a() { // from class: ua0.n
                        @Override // er.a
                        public final Object a() {
                            return q.O(params, desktopDocumentModel);
                        }
                    }, null, "SchoolCard", 68, null);
                } else {
                    checkMark = new s20.d.XMark(companion5.c());
                }
                dVar = checkMark;
                documentRefreshCardData = new DocumentRefreshCardData(dVar5, labelC12, null, labelC13, dVar, new er.a() { // from class: ua0.n
                    @Override // er.a
                    public final Object a() {
                        return q.O(params, desktopDocumentModel);
                    }
                }, null, "SchoolCard", 68, null);
            }
            documentRefreshCardData2 = documentRefreshCardData;
            arrayList.add(documentRefreshCardData2);
        }
        return new ta0.c.a.DocumentsData(baseScaffoldData2, labelC3, arrayList, new er.a() { // from class: ua0.d
            @Override // er.a
            public final Object a() {
                return q.T(params);
            }
        });
    }
}
