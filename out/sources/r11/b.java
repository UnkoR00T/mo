package r11;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r50.g;
import s11.CertificateInfoData;
import s11.CertificateInfotipCardModel;
import s11.CertificatesScreenInfotipModel;
import s11.CertificatesScreenModel;
import s11.CertificatesTopAlertData;
import th0.UserCertificateMobileApi;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lr11/b;", "Lxw/f;", "Lr11/b$a;", "Lq11/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ls11/a;", "params", "Ln50/g;", "m", "(Ls11/a;Lr11/b$a;)Ln50/g;", "Lth0/t$b;", "Lmx/a;", "l", "(Lth0/t$b;)Lmx/a;", "Lth0/t$a;", "status", "", "daysLeft", "Lr50/a$b;", "h", "(Lth0/t$a;J)Lr50/a$b;", "Lq11/b$c;", "state", "Ls11/f;", "f", "(Lq11/b$c;Lr11/b$a;)Ls11/f;", "", "Ls11/b;", "e", "()Ljava/util/List;", "i", "(Lr11/b$a;)Lq11/c$a;", "a", "Lmx/c;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<CertificatesParams, q11.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: r11.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b$\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001c\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b)\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b \u0010(¨\u0006*"}, d2 = {"Lr11/b$a;", "", "Lq11/b;", "state", "Lkotlin/Function1;", "Lth0/t;", "Loq/i0;", "showDetailsButtonClick", "Ly30/n$b$b;", "onStatusTabSelected", "Lkotlin/Function0;", "onCloseCertAlertClick", "onCertAlertButtonClick", "onBackClick", "onInfoTipButtonClick", "onBottomSheetClosed", "<init>", "(Lq11/b;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq11/b;", "h", "()Lq11/b;", "b", "Ler/l;", "g", "()Ler/l;", "c", "f", "d", "Ler/a;", "()Ler/a;", "e", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CertificatesParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q11.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<UserCertificateMobileApi, i0> showDetailsButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onStatusTabSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseCertAlertClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCertAlertButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInfoTipButtonClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBottomSheetClosed;

        /* JADX WARN: Multi-variable type inference failed */
        public CertificatesParams(q11.b bVar, l<? super UserCertificateMobileApi, i0> lVar, l<? super n.Switch.EnumC5973b, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = bVar;
            this.showDetailsButtonClick = lVar;
            this.onStatusTabSelected = lVar2;
            this.onCloseCertAlertClick = aVar;
            this.onCertAlertButtonClick = aVar2;
            this.onBackClick = aVar3;
            this.onInfoTipButtonClick = aVar4;
            this.onBottomSheetClosed = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onBottomSheetClosed;
        }

        public final er.a<i0> c() {
            return this.onCertAlertButtonClick;
        }

        public final er.a<i0> d() {
            return this.onCloseCertAlertClick;
        }

        public final er.a<i0> e() {
            return this.onInfoTipButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CertificatesParams)) {
                return false;
            }
            CertificatesParams certificatesParams = (CertificatesParams) other;
            return t.c(this.state, certificatesParams.state) && t.c(this.showDetailsButtonClick, certificatesParams.showDetailsButtonClick) && t.c(this.onStatusTabSelected, certificatesParams.onStatusTabSelected) && t.c(this.onCloseCertAlertClick, certificatesParams.onCloseCertAlertClick) && t.c(this.onCertAlertButtonClick, certificatesParams.onCertAlertButtonClick) && t.c(this.onBackClick, certificatesParams.onBackClick) && t.c(this.onInfoTipButtonClick, certificatesParams.onInfoTipButtonClick) && t.c(this.onBottomSheetClosed, certificatesParams.onBottomSheetClosed);
        }

        public final l<n.Switch.EnumC5973b, i0> f() {
            return this.onStatusTabSelected;
        }

        public final l<UserCertificateMobileApi, i0> g() {
            return this.showDetailsButtonClick;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final q11.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.showDetailsButtonClick.hashCode()) * 31) + this.onStatusTabSelected.hashCode()) * 31) + this.onCloseCertAlertClick.hashCode()) * 31) + this.onCertAlertButtonClick.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onInfoTipButtonClick.hashCode()) * 31) + this.onBottomSheetClosed.hashCode();
        }

        public String toString() {
            return "CertificatesParams(state=" + this.state + ", showDetailsButtonClick=" + this.showDetailsButtonClick + ", onStatusTabSelected=" + this.onStatusTabSelected + ", onCloseCertAlertClick=" + this.onCloseCertAlertClick + ", onCertAlertButtonClick=" + this.onCertAlertButtonClick + ", onBackClick=" + this.onBackClick + ", onInfoTipButtonClick=" + this.onInfoTipButtonClick + ", onBottomSheetClosed=" + this.onBottomSheetClosed + ')';
        }
    }

    /* JADX INFO: renamed from: r11.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4316b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f170495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f170496c;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f170494a = iArr;
            int[] iArr2 = new int[UserCertificateMobileApi.b.values().length];
            try {
                iArr2[UserCertificateMobileApi.b.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.SCHOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f170495b = iArr2;
            int[] iArr3 = new int[UserCertificateMobileApi.a.values().length];
            try {
                iArr3[UserCertificateMobileApi.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            f170496c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f170497a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1658952716);
            if (p076m2.t.k()) {
                p076m2.t.o(1658952716, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.mapper.CertificatesMapper.getScreenModel.<anonymous> (CertificatesMapper.kt:156)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((CertificateInfoData) t16).getCertificate().getRevokeDate(), ((CertificateInfoData) t15).getCertificate().getRevokeDate());
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<CertificateInfotipCardModel> e() {
        return v.q(new CertificateInfotipCardModel(this.labelProvider.c(m11.b.I), jz.a.J0, null, v.q(new oq.r(Integer.valueOf(jz.a.K0), this.labelProvider.c(m11.b.J)), new oq.r(Integer.valueOf(jz.a.K1), this.labelProvider.c(m11.b.B)), new oq.r(Integer.valueOf(jz.a.f106874u), this.labelProvider.c(m11.b.D)), new oq.r(Integer.valueOf(jz.a.f106804k), this.labelProvider.c(m11.b.C)))), new CertificateInfotipCardModel(this.labelProvider.c(m11.b.G), jz.a.f106804k, null, v.q(new oq.r(Integer.valueOf(m11.a.f122455a), this.labelProvider.c(m11.b.K)), new oq.r(Integer.valueOf(jz.a.K1), this.labelProvider.c(m11.b.E)))), new CertificateInfotipCardModel(this.labelProvider.c(m11.b.H), jz.a.K0, this.labelProvider.c(m11.b.M), v.q(new oq.r(Integer.valueOf(m11.a.f122455a), this.labelProvider.c(m11.b.L)), new oq.r(Integer.valueOf(jz.a.H0), this.labelProvider.c(m11.b.F)))));
    }

    private final CertificatesScreenModel f(q11.b.c state, CertificatesParams params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(m11.b.f122493s0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, c.f170497a, null, params.e(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        n.Switch r15 = new n.Switch(new n.Switch.TabItem(this.labelProvider.c(m11.b.f122491r0), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(m11.b.f122489q0), n.Switch.EnumC5973b.RIGHT), state.getData().getSelectedType(), false, params.f(), 8, null);
        boolean bottomSheetVisible = state.getData().getBottomSheetVisible();
        er.a<i0> aVarB = params.b();
        CertificatesScreenInfotipModel certificatesScreenInfotipModel = new CertificatesScreenInfotipModel(jz.a.J0, this.labelProvider.c(m11.b.O), this.labelProvider.c(m11.b.N), this.labelProvider.c(m11.b.f122458b), e());
        er.a<i0> aVarE = params.e();
        long mainActiveCertDaysLeft = state.getData().getMainActiveCertDaysLeft();
        return new CertificatesScreenModel(baseScaffoldData, aVarA, r15, certificatesScreenInfotipModel, aVarE, bottomSheetVisible, aVarB, new CertificatesTopAlertData(new c30.b.e(null, null, (Long.MIN_VALUE > mainActiveCertDaysLeft || mainActiveCertDaysLeft >= 2) ? this.labelProvider.e(m11.b.f122468g, Long.valueOf(state.getData().getMainActiveCertDaysLeft())) : this.labelProvider.c(m11.b.f122485o0), this.labelProvider.c(m11.b.f122466f), params.d(), null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(m11.b.f122462d), null, null, params.c(), 13, null)), 35, null), state.getData().getCertTopAlertVisible()));
    }

    private final r50.a.WithIcon h(UserCertificateMobileApi.a status, long daysLeft) {
        if ((status == null ? -1 : C4316b.f170496c[status.ordinal()]) != 1) {
            return new r50.a.WithIcon(null, this.labelProvider.c(m11.b.f122469g0), null, 0, true, g.NEGATIVE, 13, null);
        }
        if (daysLeft > 14) {
            return new r50.a.WithIcon(null, this.labelProvider.e(m11.b.f122475j0, Long.valueOf(daysLeft)), null, 0, true, g.POSITIVE, 13, null);
        }
        return new r50.a.WithIcon(null, daysLeft > 1 ? this.labelProvider.e(m11.b.f122475j0, Long.valueOf(daysLeft)) : this.labelProvider.c(m11.b.f122473i0), null, 0, true, g.NOTICE, 13, null);
    }

    private final Label l(UserCertificateMobileApi.b bVar) {
        int i15 = C4316b.f170495b[bVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(m11.b.f122479l0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(m11.b.f122477k0);
        }
        if (i15 == 3) {
            return this.labelProvider.c(m11.b.f122483n0);
        }
        if (i15 == 4) {
            return this.labelProvider.c(m11.b.f122481m0);
        }
        if (i15 == 5) {
            return null;
        }
        throw new oq.p();
    }

    private final DefaultSingleCardData m(final CertificateInfoData certificateInfoData, final CertificatesParams certificatesParams) {
        Label labelC;
        w0.StatusBadge statusBadge = new w0.StatusBadge(h(certificateInfoData.getCertificate().getStatus(), certificateInfoData.getValidityDaysLeft()));
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.e(m11.b.f122487p0, certificateInfoData.getCertificate().getDeviceName()), null, null, 0, 0, null, 62, null));
        UserCertificateMobileApi.b type = certificateInfoData.getCertificate().getType();
        if (type == null || (labelC = l(type)) == null) {
            labelC = Label.INSTANCE.c();
        }
        return new DefaultSingleCardData(null, new er.a() { // from class: r11.a
            @Override // er.a
            public final Object a() {
                return b.q(certificatesParams, certificateInfoData);
            }
        }, false, null, null, false, null, statusBadge, new BodySection(null, title, new SingleCardLabel(labelC, null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2685, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(CertificatesParams certificatesParams, CertificateInfoData certificateInfoData) {
        certificatesParams.g().b(certificateInfoData.getCertificate());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public q11.c.a b(CertificatesParams params) {
        ArrayList arrayList;
        q11.b state = params.getState();
        if (t.c(state, q11.b.C4062b.f163589a) || t.c(state, q11.b.d.f163592a)) {
            return q11.c.a.b.f163600a;
        }
        if (!(state instanceof q11.b.c)) {
            if (state instanceof q11.b.a) {
                return new q11.c.a.Error(((q11.b.a) state).getErrorVMS());
            }
            throw new oq.p();
        }
        q11.b.c cVar = (q11.b.c) state;
        CertificatesScreenModel certificatesScreenModelF = f(cVar, params);
        int i15 = C4316b.f170494a[cVar.getData().getSelectedType().ordinal()];
        if (i15 == 1) {
            List<CertificateInfoData> listE = cVar.getData().e();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listE) {
                if (((CertificateInfoData) obj).getCertificate().getStatus() == UserCertificateMobileApi.a.ACTIVE) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(v.y(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(m((CertificateInfoData) it.next(), params));
            }
            arrayList = arrayList3;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            List<CertificateInfoData> listE2 = cVar.getData().e();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listE2) {
                if (((CertificateInfoData) obj2).getCertificate().getStatus() != UserCertificateMobileApi.a.ACTIVE) {
                    arrayList4.add(obj2);
                }
            }
            List listU0 = v.U0(arrayList4, new d());
            arrayList = new ArrayList(v.y(listU0, 10));
            Iterator it4 = listU0.iterator();
            while (it4.hasNext()) {
                arrayList.add(m((CertificateInfoData) it4.next(), params));
            }
        }
        return new q11.c.a.Initialized(certificatesScreenModelF, arrayList);
    }
}
