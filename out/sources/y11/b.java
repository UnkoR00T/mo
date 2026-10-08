package y11;

import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import er.l;
import er.p;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r50.g;
import th0.UserCertificateMobileApi;
import th0.UserDnMobileApi;
import th0.q;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import z11.CertificateData;
import z11.CertificateDetailsScreenModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020!*\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Ly11/b;", "Lxw/f;", "Ly11/b$a;", "Lw11/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lth0/t;", "certificate", "", "u", "(Lth0/t;)Z", "v", "cert", "Ln30/b;", "e", "(Lth0/t;)Ln30/b;", "", "Ln50/g;", "f", "(Lth0/t;)Ljava/util/List;", "h", "Lth0/t$a;", "status", "m", "(Lth0/t$a;)Z", "Lr50/a$b;", "r", "(Lth0/t$a;)Lr50/a$b;", "Lth0/t$b;", "Lmx/a;", "q", "(Lth0/t$b;)Lmx/a;", "Lth0/q;", "s", "(Lth0/q;)Lmx/a;", "params", "i", "(Ly11/b$a;)Lw11/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, w11.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: y11.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Ly11/b$a;", "", "Lw11/b;", "state", "Lkotlin/Function1;", "Lz11/a;", "Loq/i0;", "revokeButtonClick", "Lkotlin/Function0;", "onBackClick", "<init>", "(Lw11/b;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw11/b;", "c", "()Lw11/b;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w11.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<CertificateData, i0> revokeButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(w11.b bVar, l<? super CertificateData, i0> lVar, er.a<i0> aVar) {
            this.state = bVar;
            this.revokeButtonClick = lVar;
            this.onBackClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<CertificateData, i0> b() {
            return this.revokeButtonClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final w11.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.revokeButtonClick, params.revokeButtonClick) && t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.revokeButtonClick.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", revokeButtonClick=" + this.revokeButtonClick + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    /* JADX INFO: renamed from: y11.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5958b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f223152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f223153c;

        static {
            int[] iArr = new int[UserCertificateMobileApi.a.values().length];
            try {
                iArr[UserCertificateMobileApi.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f223151a = iArr;
            int[] iArr2 = new int[UserCertificateMobileApi.b.values().length];
            try {
                iArr2[UserCertificateMobileApi.b.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.SCHOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserCertificateMobileApi.b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            f223152b = iArr2;
            int[] iArr3 = new int[q.values().length];
            try {
                iArr3[q.ADMIN_REVOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[q.USER_REVOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[q.CALL_CENTER_REVOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[q.CERTIFICATES_LIMIT_REACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[q.ID_CARD_INVALIDATED_REFRESH.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[q.ID_CARD_INVALIDATED_SUBSCRIPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[q.STUDENT_USER_REVOCATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[q.USER_SUBSCRIPTION_CANCELLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[q.USER_DEATH.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[q.USER_UKR_STATUS_LOSS.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[q.USER_PESEL_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[q.USER_PERSONAL_DATA_CHANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[q.VALID_PERIOD_EXCEEDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[q.MANUALLY_UPDATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[q.CERTIFICATE_EXPIRED.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[q.CERTIFICATE_ACTIVATION_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[q.MOBILE_APP_UNINSTALLED.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[q.UNKNOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused24) {
            }
            f223153c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f223154a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-63265016);
            if (p076m2.t.k()) {
                p076m2.t.o(-63265016, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.details.mapper.CertificateDetailsScreenMapper.invoke.<anonymous> (CertificateDetailsScreenMapper.kt:101)");
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
        public static final d f223155a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1476778948);
            if (p076m2.t.k()) {
                p076m2.t.o(1476778948, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.details.mapper.CertificateDetailsScreenMapper.invoke.<anonymous> (CertificateDetailsScreenMapper.kt:108)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public b(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final CardListData e(UserCertificateMobileApi cert) {
        List listN;
        String strD;
        Label labelS;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122464e), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(r(cert.getStatus())), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122486p), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(new Label(cert.getDeviceName(), this.labelProvider.c(m11.b.f122486p).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(m11.b.f122494t), null, null, 0, 0, null, 62, null);
        e eVar = this.dateFormatter;
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(cert.getValidFrom());
        fz.c cVar = fz.c.DOTTED;
        List listQ = v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(new Label(eVar.d(offsetDateTime, cVar), this.labelProvider.c(m11.b.f122494t).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122499y), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(new Label(this.dateFormatter.d(new fz.b.OffsetDateTime(cert.getValidTo()), cVar), this.labelProvider.c(m11.b.f122499y).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        if (m(cert.getStatus())) {
            listN = v.n();
        } else {
            SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(m11.b.f122495u), null, null, 0, 0, null, 62, null);
            q revokeReason = cert.getRevokeReason();
            DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d((revokeReason == null || (labelS = s(revokeReason)) == null) ? null : labelS.getText(), this.labelProvider.c(m11.b.f122495u).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            SingleCardLabel singleCardLabel3 = new SingleCardLabel(this.labelProvider.c(m11.b.f122498x), null, null, 0, 0, null, 62, null);
            OffsetDateTime revokeDate = cert.getRevokeDate();
            if (revokeDate == null || (strD = this.dateFormatter.d(new fz.b.OffsetDateTime(revokeDate), fz.c.DOTTED_PLUS_HOUR)) == null) {
                strD = "-";
            }
            listN = v.q(defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel3, new n50.b.Title(new SingleCardLabel(new Label(strD, this.labelProvider.c(m11.b.f122498x).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        }
        return new CardListData(v.L0(v.L0(listQ, listN), v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122496v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(new Label(cert.getSerialNumber(), this.labelProvider.c(m11.b.f122496v).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null))), null, false, null, null, 30, null);
    }

    private final List<DefaultSingleCardData> f(UserCertificateMobileApi cert) {
        return v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122490r), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(cert.getDecodedIssuerCertDn().getCn(), this.labelProvider.c(m11.b.f122490r).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122492s), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(cert.getDecodedIssuerCertDn().getO(), this.labelProvider.c(m11.b.f122492s).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122484o), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(cert.getDecodedIssuerCertDn().getC(), this.labelProvider.c(m11.b.f122484o).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final List<DefaultSingleCardData> h(UserCertificateMobileApi cert) {
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(m11.b.f122484o), null, null, 0, 0, null, 62, null);
        UserDnMobileApi.a country = cert.getDecodedDn().getCountry();
        return v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(country != null ? country.name() : null, this.labelProvider.c(m11.b.f122484o).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122496v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(cert.getDecodedDn().getSerialNumber(), this.labelProvider.c(m11.b.f122496v).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122497w), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(cert.getDecodedDn().getLastName(), this.labelProvider.c(m11.b.f122497w).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122488q), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(cert.getDecodedDn().getGivenNames(), this.labelProvider.c(m11.b.f122488q).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(m11.b.f122490r), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(cert.getDecodedDn().getCn(), this.labelProvider.c(m11.b.f122490r).getTag() + "Label"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, b bVar) {
        String text;
        Label labelQ;
        l<CertificateData, i0> lVarB = params.b();
        b0 b0VarG = c0.g(((w11.b.InterfaceC5503b) params.getState()).getCertificate().getSerialNumber());
        UserCertificateMobileApi.b type = ((w11.b.InterfaceC5503b) params.getState()).getCertificate().getType();
        if (type == null || (labelQ = bVar.q(type)) == null || (text = labelQ.getText()) == null) {
            text = bVar.labelProvider.c(m11.b.f122482n).getText();
        }
        UserCertificateMobileApi.b type2 = ((w11.b.InterfaceC5503b) params.getState()).getCertificate().getType();
        lVarB.b(new CertificateData(b0VarG, text, type2 != null ? r11.c.a(type2) : null));
        return i0.f148189a;
    }

    private final boolean m(UserCertificateMobileApi.a status) {
        return (status == null ? -1 : C5958b.f223151a[status.ordinal()]) == 1;
    }

    private final Label q(UserCertificateMobileApi.b bVar) {
        int i15 = C5958b.f223152b[bVar.ordinal()];
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

    private final r50.a.WithIcon r(UserCertificateMobileApi.a status) {
        return (status == null ? -1 : C5958b.f223151a[status.ordinal()]) == 1 ? new r50.a.WithIcon(null, this.labelProvider.c(m11.b.f122471h0), null, 0, false, g.POSITIVE, 13, null) : new r50.a.WithIcon(null, this.labelProvider.c(m11.b.f122469g0), null, 0, false, g.NEGATIVE, 13, null);
    }

    private final Label s(q qVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        switch (C5958b.f223153c[qVar.ordinal()]) {
            case 1:
                i15 = m11.b.P;
                break;
            case 2:
                i15 = m11.b.f122457a0;
                break;
            case 3:
                i15 = m11.b.Q;
                break;
            case 4:
                i15 = m11.b.R;
                break;
            case 5:
                i15 = m11.b.S;
                break;
            case 6:
                i15 = m11.b.T;
                break;
            case 7:
                i15 = m11.b.V;
                break;
            case 8:
                i15 = m11.b.f122459b0;
                break;
            case 9:
                i15 = m11.b.X;
                break;
            case 10:
                i15 = m11.b.f122461c0;
                break;
            case 11:
                i15 = m11.b.Z;
                break;
            case 12:
                i15 = m11.b.Y;
                break;
            case 13:
                i15 = m11.b.f122463d0;
                break;
            case 14:
                i15 = m11.b.U;
                break;
            case 15:
            case 16:
            case 17:
            case 18:
                i15 = m11.b.W;
                break;
            default:
                throw new oq.p();
        }
        return cVar.c(i15);
    }

    private final boolean u(UserCertificateMobileApi certificate) {
        return certificate.getType() == UserCertificateMobileApi.b.CITIZEN && m(certificate.getStatus());
    }

    private final boolean v(UserCertificateMobileApi certificate) {
        return (!m(certificate.getStatus()) || certificate.getType() == UserCertificateMobileApi.b.SCHOOL || certificate.getType() == UserCertificateMobileApi.b.UNIVERSITY) ? false : true;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public w11.c.a b(final Params params) {
        Label labelC;
        w11.b state = params.getState();
        if (t.c(state, w11.b.a.f209188a)) {
            return w11.c.a.b.f209196a;
        }
        if (!(state instanceof w11.b.InterfaceC5503b.CertificateRevocation) && !(state instanceof w11.b.InterfaceC5503b.Displaying)) {
            if (state instanceof w11.b.InterfaceC5503b.Error) {
                return new w11.c.a.Error(((w11.b.InterfaceC5503b.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(m11.b.f122474j), null, null, null, 28, null), null, null, null, null, 61, null);
        UserCertificateMobileApi.b type = ((w11.b.InterfaceC5503b) params.getState()).getCertificate().getType();
        if (type == null || (labelC = q(type)) == null) {
            labelC = this.labelProvider.c(m11.b.f122482n);
        }
        Label label = labelC;
        CardListData cardListDataE = e(((w11.b.InterfaceC5503b) params.getState()).getCertificate());
        AccordionData accordionData = new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(m11.b.f122480m), null, false, null, false, new x11.b(new CardListData(f(((w11.b.InterfaceC5503b) params.getState()).getCertificate()), null, false, null, null, 30, null)), 29, null)));
        AccordionData accordionData2 = new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(m11.b.f122476k), null, false, null, false, new x11.b(new CardListData(h(((w11.b.InterfaceC5503b) params.getState()).getCertificate()), null, false, null, null, 30, null)), 29, null)));
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: y11.a
            @Override // er.a
            public final Object a() {
                return b.l(params, this);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(m11.b.f122465e0), null, d.f223155a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106727a, null, c.f223154a, null, null, 26, null), 3, null), null, null, 3325, null);
        if (!v(((w11.b.InterfaceC5503b) params.getState()).getCertificate())) {
            defaultSingleCardData = null;
        }
        boolean zU = u(((w11.b.InterfaceC5503b) params.getState()).getCertificate());
        Boolean boolValueOf = Boolean.valueOf(zU);
        if (!zU) {
            boolValueOf = null;
        }
        return new w11.c.a.Initialized(new CertificateDetailsScreenModel(baseScaffoldData, params.a(), label, cardListDataE, accordionData, accordionData2, defaultSingleCardData, boolValueOf != null ? new c30.b.c(null, null, null, this.labelProvider.c(m11.b.f122478l), null, null, null, 119, null) : null));
    }
}
