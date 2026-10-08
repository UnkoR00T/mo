package vr3;

import androidx.compose.ui.graphics.Color;
import cj0.ZusEVisitGroupSummary;
import cj0.o;
import er.l;
import er.p;
import ez.d;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageData;
import q40.j;
import r50.g;
import r70.BaseFloatingActionButtonData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001?B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0089\u0001\u0010\u001c\u001a\u00020\u001b*\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010%\u001a\u00020$*\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b%\u0010&J9\u0010'\u001a\u00020$*\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b'\u0010(J#\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010.JE\u00100\u001a\u00020/*\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b0\u00101J'\u00103\u001a\u000202*\u00020!2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b3\u00104J'\u00105\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002¢\u0006\u0004\b5\u00106J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lvr3/c;", "Lxw/f;", "Lvr3/c$a;", "Lur3/c$a;", "Lmx/c;", "labelProvider", "Lnr3/f;", "formatDateWithEmphasizedNearestDayUseCase", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lnr3/f;Lez/e;)V", "Lur3/b$c;", "Lkotlin/Function1;", "", "Loq/i0;", "onVisitClick", "Ly30/n$b$b;", "onSwitchItemChanged", "Lkotlin/Function0;", "toNewVisitWizard", "toInfoPage", "", "isAlertWebBrowsersInfoVisible", "onCloseAlertWebBrowsersClick", "onCloseAlertUnableAppointmentClick", "onBackPressed", "Lur3/c$a$a;", "r", "(Lur3/b$c;Ler/l;Ler/l;Ler/a;Ler/a;ZLer/a;Ler/a;Ler/a;)Lur3/c$a$a;", "", "Ljava/time/LocalDate;", "", "Lcj0/j;", "Lc30/b;", "alertData", "Lwr3/b;", "z", "(Ljava/util/Map;Lc30/b;Ler/l;)Lwr3/b;", "E", "(Ljava/util/Map;Ler/l;)Lwr3/b;", "Lmx/a;", "title", "description", "Lwr3/b$a;", "h", "(Lmx/a;Lmx/a;)Lwr3/b$a;", "Lwr3/b$b;", "v", "(Ljava/util/Map;Lc30/b;Ler/l;)Lwr3/b$b;", "Lwr3/a$b;", "s", "(Lcj0/j;Ler/l;)Lwr3/a$b;", "f", "(ZLer/a;)Lc30/b;", "Lcj0/o;", "status", "Lr50/a$b;", "l", "(Lcj0/o;)Lr50/a$b;", "params", "m", "(Lvr3/c$a;)Lur3/c$a;", "a", "Lmx/c;", "b", "Lnr3/f;", "c", "Lez/e;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, ur3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.f formatDateWithEmphasizedNearestDayUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: vr3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b!\u0010'R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b(\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b+\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b\u001d\u0010'¨\u0006-"}, d2 = {"Lvr3/c$a;", "", "Lur3/b;", "state", "Lkotlin/Function2;", "", "", "Loq/i0;", "onVisitClick", "Lkotlin/Function0;", "onCloseAlertWebBrowsersClick", "onCloseAlertUnableAppointmentClick", "Lkotlin/Function1;", "Ly30/n$b$b;", "onSwitchItemChanged", "toInfoPage", "toNewVisitWizard", "onBackPressed", "<init>", "(Lur3/b;Ler/p;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lur3/b;", "f", "()Lur3/b;", "b", "Ler/p;", "e", "()Ler/p;", "c", "Ler/a;", "()Ler/a;", "d", "Ler/l;", "()Ler/l;", "g", "h", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ur3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Long, Boolean, i0> onVisitClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAlertWebBrowsersClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAlertUnableAppointmentClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onSwitchItemChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toInfoPage;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toNewVisitWizard;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ur3.b bVar, p<? super Long, ? super Boolean, i0> pVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super n.Switch.EnumC5973b, i0> lVar, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = bVar;
            this.onVisitClick = pVar;
            this.onCloseAlertWebBrowsersClick = aVar;
            this.onCloseAlertUnableAppointmentClick = aVar2;
            this.onSwitchItemChanged = lVar;
            this.toInfoPage = aVar3;
            this.toNewVisitWizard = aVar4;
            this.onBackPressed = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        public final er.a<i0> b() {
            return this.onCloseAlertUnableAppointmentClick;
        }

        public final er.a<i0> c() {
            return this.onCloseAlertWebBrowsersClick;
        }

        public final l<n.Switch.EnumC5973b, i0> d() {
            return this.onSwitchItemChanged;
        }

        public final p<Long, Boolean, i0> e() {
            return this.onVisitClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onVisitClick, params.onVisitClick) && t.c(this.onCloseAlertWebBrowsersClick, params.onCloseAlertWebBrowsersClick) && t.c(this.onCloseAlertUnableAppointmentClick, params.onCloseAlertUnableAppointmentClick) && t.c(this.onSwitchItemChanged, params.onSwitchItemChanged) && t.c(this.toInfoPage, params.toInfoPage) && t.c(this.toNewVisitWizard, params.toNewVisitWizard) && t.c(this.onBackPressed, params.onBackPressed);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ur3.b getState() {
            return this.state;
        }

        public final er.a<i0> g() {
            return this.toInfoPage;
        }

        public final er.a<i0> h() {
            return this.toNewVisitWizard;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onVisitClick.hashCode()) * 31) + this.onCloseAlertWebBrowsersClick.hashCode()) * 31) + this.onCloseAlertUnableAppointmentClick.hashCode()) * 31) + this.onSwitchItemChanged.hashCode()) * 31) + this.toInfoPage.hashCode()) * 31) + this.toNewVisitWizard.hashCode()) * 31) + this.onBackPressed.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onVisitClick=" + this.onVisitClick + ", onCloseAlertWebBrowsersClick=" + this.onCloseAlertWebBrowsersClick + ", onCloseAlertUnableAppointmentClick=" + this.onCloseAlertUnableAppointmentClick + ", onSwitchItemChanged=" + this.onSwitchItemChanged + ", toInfoPage=" + this.toInfoPage + ", toNewVisitWizard=" + this.toNewVisitWizard + ", onBackPressed=" + this.onBackPressed + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208220a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.PLANNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f208220a = iArr;
        }
    }

    /* JADX INFO: renamed from: vr3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5465c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5465c f208221a = new C5465c();

        C5465c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(865804981);
            if (p076m2.t.k()) {
                p076m2.t.o(865804981, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.mapper.MyVisitsScreenMapper.map.<anonymous> (MyVisitsScreenMapper.kt:95)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public c(mx.c cVar, nr3.f fVar, e eVar) {
        this.labelProvider = cVar;
        this.formatDateWithEmphasizedNearestDayUseCase = fVar;
        this.dateFormatter = eVar;
    }

    private final wr3.b E(Map<LocalDate, ? extends List<ZusEVisitGroupSummary>> map, l<? super Long, i0> lVar) {
        return map.isEmpty() ? i(this, this.labelProvider.c(ir3.a.f96776d0), null, 2, null) : x(this, map, null, lVar, 1, null);
    }

    private final c30.b f(boolean isAlertWebBrowsersInfoVisible, er.a<i0> onCloseAlertWebBrowsersClick) {
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(ir3.a.f96836x0), onCloseAlertWebBrowsersClick, null, null, 103, null);
        if (isAlertWebBrowsersInfoVisible) {
            return cVar;
        }
        return null;
    }

    private final wr3.b.Empty h(Label title, Label description) {
        return new wr3.b.Empty(new IconPageData(new j.a(jz.a.f106754d2), title, description, null, null, null, false, 72, null));
    }

    static /* synthetic */ wr3.b.Empty i(c cVar, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            label2 = null;
        }
        return cVar.h(label, label2);
    }

    private final r50.a.WithIcon l(o status) {
        int i15 = b.f208220a[status.ordinal()];
        if (i15 == 1) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.f96772c), null, 0, false, g.POSITIVE, 29, null);
        }
        if (i15 == 2) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.A), null, 0, false, g.NOTICE, 29, null);
        }
        if (i15 == 3) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.f96778e), null, 0, false, g.NEGATIVE, 29, null);
        }
        if (i15 == 4) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.f96814q), null, 0, false, g.POSITIVE, 29, null);
        }
        if (i15 == 5) {
            return new r50.a.WithIcon(null, this.labelProvider.c(ir3.a.J), null, 0, false, g.MINUS, 29, null);
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, long j15) {
        params.e().B(Long.valueOf(j15), Boolean.valueOf(((ur3.b.Initialized) params.getState()).getVisits().getBookingAvailable()));
        return i0.f148189a;
    }

    private final ur3.c.a.DisplayedScreenData r(ur3.b.Initialized initialized, l<? super Long, i0> lVar, l<? super n.Switch.EnumC5973b, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, boolean z15, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
        i.Small small = new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar5), this.labelProvider.c(ir3.a.f96815q0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, C5465c.f208221a, null, aVar2, 4, null)), null, 20, null);
        BaseFloatingActionButtonData baseFloatingActionButtonData = new BaseFloatingActionButtonData(jz.a.f106760e0, new BaseFloatingActionButtonData.InterfaceC4389a.Extended(this.labelProvider.c(ir3.a.H0)), aVar);
        c30.b.c cVar = null;
        if (!initialized.getVisits().getBookingAvailable()) {
            baseFloatingActionButtonData = null;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, small, v.r(baseFloatingActionButtonData), null, null, null, 57, null);
        n.Switch r15 = new n.Switch(new n.Switch.TabItem(this.labelProvider.c(ir3.a.J0), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(ir3.a.I0), n.Switch.EnumC5973b.RIGHT), initialized.getSwitchSelectedItem(), false, lVar2, 8, null);
        Map<LocalDate, List<ZusEVisitGroupSummary>> mapA = initialized.getVisits().a();
        c30.b.c cVar2 = new c30.b.c(null, null, this.labelProvider.c(ir3.a.E0), this.labelProvider.c(ir3.a.D0), aVar4, null, null, 99, null);
        if (initialized.getIsAlertUnableAppointmentInfoVisible() && !initialized.getVisits().getBookingAvailable()) {
            cVar = cVar2;
        }
        return new ur3.c.a.DisplayedScreenData(baseScaffoldData, r15, z(mapA, cVar, lVar), E(initialized.getVisits().d(), lVar), f(z15 && !initialized.getVisits().a().isEmpty(), aVar3), aVar5);
    }

    private final wr3.a.ZusVisit s(final ZusEVisitGroupSummary zusEVisitGroupSummary, final l<? super Long, i0> lVar) {
        w0.StatusBadge statusBadge = new w0.StatusBadge(l(zusEVisitGroupSummary.getStatus()));
        x0.Icon iconB = x0.Icon.INSTANCE.b();
        return new wr3.a.ZusVisit(new DefaultSingleCardData(null, new er.a() { // from class: vr3.b
            @Override // er.a
            public final Object a() {
                return c.u(lVar, zusEVisitGroupSummary);
            }
        }, false, null, null, false, null, statusBadge, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(zusEVisitGroupSummary.getTopicDescription(), "topicValue"), null, null, 0, 0, null, 62, null)), null, 5, null), null, iconB, new BottomSection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96823t).o(Label.INSTANCE.a()), null, null, 0, 0, null, 62, null), new SingleCardLabel(mx.b.b(this.dateFormatter.d(d.j(zusEVisitGroupSummary.getVisitDate()), fz.c.ONLY_HOUR), "timeValue"), null, null, 0, 0, null, 62, null)), 637, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(l lVar, ZusEVisitGroupSummary zusEVisitGroupSummary) {
        lVar.b(Long.valueOf(zusEVisitGroupSummary.getId()));
        return i0.f148189a;
    }

    private final wr3.b.Visits v(Map<LocalDate, ? extends List<ZusEVisitGroupSummary>> map, c30.b bVar, l<? super Long, i0> lVar) {
        Set<Map.Entry<LocalDate, ? extends List<ZusEVisitGroupSummary>>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : setEntrySet) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            Map.Entry entry = (Map.Entry) obj;
            LocalDate localDate = (LocalDate) entry.getKey();
            List list = (List) entry.getValue();
            List listE = v.e(new wr3.a.Header(mx.b.b(this.formatDateWithEmphasizedNearestDayUseCase.b(new nr3.f.Param(localDate, nr3.f.b.C3406b.f138010a)), "headerValue_" + i15)));
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(s((ZusEVisitGroupSummary) it.next(), lVar));
            }
            v.D(arrayList, v.L0(listE, arrayList2));
            i15 = i16;
        }
        return new wr3.b.Visits(bVar, arrayList);
    }

    static /* synthetic */ wr3.b.Visits x(c cVar, Map map, c30.b bVar, l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = null;
        }
        return cVar.v(map, bVar, lVar);
    }

    private final wr3.b z(Map<LocalDate, ? extends List<ZusEVisitGroupSummary>> map, c30.b bVar, l<? super Long, i0> lVar) {
        return map.isEmpty() ? h(this.labelProvider.c(ir3.a.F0), this.labelProvider.c(ir3.a.G0)) : v(map, bVar, lVar);
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ur3.c.a b(final Params params) {
        ur3.b state = params.getState();
        if (t.c(state, ur3.b.C5219b.f200484a) || t.c(state, ur3.b.a.f200483a)) {
            return ur3.c.a.b.f200496a;
        }
        if (state instanceof ur3.b.Initialized) {
            return r((ur3.b.Initialized) params.getState(), new l() { // from class: vr3.a
                @Override // er.l
                public final Object b(Object obj) {
                    return c.q(params, ((Long) obj).longValue());
                }
            }, params.d(), params.h(), params.g(), ((ur3.b.Initialized) params.getState()).getIsAlertWebBrowsersInfoVisible(), params.c(), params.b(), params.a());
        }
        throw new oq.p();
    }
}
