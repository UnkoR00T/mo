package ua1;

import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import er.l;
import er.p;
import fr.t;
import g70.ShortcutMoreData;
import g70.ShortcutMoreTransferData;
import h30.ButtonData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import ma1.CompanyAddresses;
import ma1.CompanyCategory;
import ma1.CompanyData;
import ma1.CompanyInfoAlert;
import ma1.CompanyLink;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x40.LinkData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lua1/j;", "Lxw/f;", "Lua1/j$a;", "Lsa1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lma1/f;", "companyDetails", "Lkotlin/Function2;", "", "Lva1/b;", "Loq/i0;", "copyToClipboard", "Ln30/b;", "F", "(Lma1/f;Ler/p;)Ln30/b;", "Lmx/a;", "title", "info", "description", "Lh30/a;", "buttonData", "Lj70/a;", "accessibilityReadMode", "Ln50/g;", "r", "(Lmx/a;Lmx/a;Lmx/a;Lh30/a;Lj70/a;)Ln50/g;", "params", "u", "(Lua1/j$a;)Lsa1/c$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, sa1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ua1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00050\f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b+\u00102R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b3\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.R)\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b7\u00106R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010.R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b/\u0010.R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b'\u00106R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b?\u0010.R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b>\u0010.R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b=\u0010.R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b9\u0010.¨\u0006@"}, d2 = {"Lua1/j$a;", "", "Lsa1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onDownloadCertificate", "onShareInvoiceData", "Lkotlin/Function2;", "", "Lva1/b;", "copyToClipboard", "Lkotlin/Function1;", "onGoToCeidgClick", "onGoToAdditionalAddresses", "onGoToPKDs", "", "Lg70/b;", "onGoToMoreShortcuts", "onHideAlert", "onRefreshAction", "submitApplication", "onClose", "categoryEditionAlertLinkClick", "onSuspendCompanyAction", "onResumeCompanyAction", "onRepresentativesAction", "onGoToStore", "<init>", "(Lsa1/b;Ler/a;Ler/a;Ler/p;Ler/l;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsa1/b;", "p", "()Lsa1/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "n", "Ler/p;", "()Ler/p;", "e", "Ler/l;", "f", "()Ler/l;", "g", "h", "i", "j", "k", "q", "l", "m", "o", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sa1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadCertificate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShareInvoiceData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, va1.b, i0> copyToClipboard;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onGoToCeidgClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToAdditionalAddresses;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToPKDs;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<List<ShortcutMoreTransferData>, i0> onGoToMoreShortcuts;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onHideAlert;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRefreshAction;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> submitApplication;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> categoryEditionAlertLinkClick;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSuspendCompanyAction;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResumeCompanyAction;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRepresentativesAction;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToStore;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(sa1.b bVar, er.a<i0> aVar, er.a<i0> aVar2, p<? super String, ? super va1.b, i0> pVar, l<? super String, i0> lVar, er.a<i0> aVar3, er.a<i0> aVar4, l<? super List<ShortcutMoreTransferData>, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7, l<? super String, i0> lVar4, er.a<i0> aVar8, er.a<i0> aVar9, er.a<i0> aVar10, er.a<i0> aVar11) {
            this.state = bVar;
            this.onDownloadCertificate = aVar;
            this.onShareInvoiceData = aVar2;
            this.copyToClipboard = pVar;
            this.onGoToCeidgClick = lVar;
            this.onGoToAdditionalAddresses = aVar3;
            this.onGoToPKDs = aVar4;
            this.onGoToMoreShortcuts = lVar2;
            this.onHideAlert = lVar3;
            this.onRefreshAction = aVar5;
            this.submitApplication = aVar6;
            this.onClose = aVar7;
            this.categoryEditionAlertLinkClick = lVar4;
            this.onSuspendCompanyAction = aVar8;
            this.onResumeCompanyAction = aVar9;
            this.onRepresentativesAction = aVar10;
            this.onGoToStore = aVar11;
        }

        public final l<String, i0> a() {
            return this.categoryEditionAlertLinkClick;
        }

        public final p<String, va1.b, i0> b() {
            return this.copyToClipboard;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final er.a<i0> d() {
            return this.onDownloadCertificate;
        }

        public final er.a<i0> e() {
            return this.onGoToAdditionalAddresses;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onDownloadCertificate, params.onDownloadCertificate) && t.c(this.onShareInvoiceData, params.onShareInvoiceData) && t.c(this.copyToClipboard, params.copyToClipboard) && t.c(this.onGoToCeidgClick, params.onGoToCeidgClick) && t.c(this.onGoToAdditionalAddresses, params.onGoToAdditionalAddresses) && t.c(this.onGoToPKDs, params.onGoToPKDs) && t.c(this.onGoToMoreShortcuts, params.onGoToMoreShortcuts) && t.c(this.onHideAlert, params.onHideAlert) && t.c(this.onRefreshAction, params.onRefreshAction) && t.c(this.submitApplication, params.submitApplication) && t.c(this.onClose, params.onClose) && t.c(this.categoryEditionAlertLinkClick, params.categoryEditionAlertLinkClick) && t.c(this.onSuspendCompanyAction, params.onSuspendCompanyAction) && t.c(this.onResumeCompanyAction, params.onResumeCompanyAction) && t.c(this.onRepresentativesAction, params.onRepresentativesAction) && t.c(this.onGoToStore, params.onGoToStore);
        }

        public final l<String, i0> f() {
            return this.onGoToCeidgClick;
        }

        public final l<List<ShortcutMoreTransferData>, i0> g() {
            return this.onGoToMoreShortcuts;
        }

        public final er.a<i0> h() {
            return this.onGoToPKDs;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.state.hashCode() * 31) + this.onDownloadCertificate.hashCode()) * 31) + this.onShareInvoiceData.hashCode()) * 31) + this.copyToClipboard.hashCode()) * 31) + this.onGoToCeidgClick.hashCode()) * 31) + this.onGoToAdditionalAddresses.hashCode()) * 31) + this.onGoToPKDs.hashCode()) * 31) + this.onGoToMoreShortcuts.hashCode()) * 31) + this.onHideAlert.hashCode()) * 31) + this.onRefreshAction.hashCode()) * 31) + this.submitApplication.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.categoryEditionAlertLinkClick.hashCode()) * 31) + this.onSuspendCompanyAction.hashCode()) * 31) + this.onResumeCompanyAction.hashCode()) * 31) + this.onRepresentativesAction.hashCode()) * 31) + this.onGoToStore.hashCode();
        }

        public final er.a<i0> i() {
            return this.onGoToStore;
        }

        public final l<String, i0> j() {
            return this.onHideAlert;
        }

        public final er.a<i0> k() {
            return this.onRefreshAction;
        }

        public final er.a<i0> l() {
            return this.onRepresentativesAction;
        }

        public final er.a<i0> m() {
            return this.onResumeCompanyAction;
        }

        public final er.a<i0> n() {
            return this.onShareInvoiceData;
        }

        public final er.a<i0> o() {
            return this.onSuspendCompanyAction;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final sa1.b getState() {
            return this.state;
        }

        public final er.a<i0> q() {
            return this.submitApplication;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDownloadCertificate=" + this.onDownloadCertificate + ", onShareInvoiceData=" + this.onShareInvoiceData + ", copyToClipboard=" + this.copyToClipboard + ", onGoToCeidgClick=" + this.onGoToCeidgClick + ", onGoToAdditionalAddresses=" + this.onGoToAdditionalAddresses + ", onGoToPKDs=" + this.onGoToPKDs + ", onGoToMoreShortcuts=" + this.onGoToMoreShortcuts + ", onHideAlert=" + this.onHideAlert + ", onRefreshAction=" + this.onRefreshAction + ", submitApplication=" + this.submitApplication + ", onClose=" + this.onClose + ", categoryEditionAlertLinkClick=" + this.categoryEditionAlertLinkClick + ", onSuspendCompanyAction=" + this.onSuspendCompanyAction + ", onResumeCompanyAction=" + this.onResumeCompanyAction + ", onRepresentativesAction=" + this.onRepresentativesAction + ", onGoToStore=" + this.onGoToStore + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f196766b;

        static {
            int[] iArr = new int[ma1.i.values().length];
            try {
                iArr[ma1.i.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ma1.i.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ma1.i.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ma1.i.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ma1.i.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f196765a = iArr;
            int[] iArr2 = new int[ma1.p.values().length];
            try {
                iArr2[ma1.p.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ma1.p.PARTNERSHIP_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ma1.p.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ma1.p.PENDING_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ma1.p.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f196766b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f196767a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1795280645);
            if (p076m2.t.k()) {
                p076m2.t.o(-1795280645, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.mapper.CompanyDetailsScreenMapper.invoke.<anonymous> (CompanyDetailsScreenMapper.kt:110)");
            }
            long jA = ((ra1.a) rVar.N(ra1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, CompanyInfoAlert companyInfoAlert) {
        params.j().b(companyInfoAlert.getMessage());
        return i0.f148189a;
    }

    private final CardListData F(final ma1.f companyDetails, final p<? super String, ? super va1.b, i0> copyToClipboard) {
        ma1.p status;
        r50.g gVar;
        CompanyAddresses addresses;
        final String regon;
        final String nip;
        final String name;
        String resumptionDate;
        String suspensionFromDate;
        CompanyData companyData = companyDetails.getCompanyData();
        Label labelD = mx.b.d(companyData != null ? companyData.getStatusDescription() : null, "companyStatusDescriptionValue");
        CompanyData companyData2 = companyDetails.getCompanyData();
        if (companyData2 == null || (status = companyData2.getStatus()) == null) {
            status = ma1.p.UNKNOWN;
        }
        int i15 = b.f196766b[status.ordinal()];
        if (i15 == 1 || i15 == 2) {
            gVar = r50.g.POSITIVE;
        } else {
            if (i15 != 3 && i15 != 4 && i15 != 5) {
                throw new oq.p();
            }
            gVar = r50.g.NOTICE;
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82527w5), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, labelD, null, 0, false, gVar, 13, null)), null, 4, null), null, null, null, 3839, null);
        Label labelC = this.labelProvider.c(ha1.a.f82477p4);
        StringBuilder sb5 = new StringBuilder();
        CompanyData companyData3 = companyDetails.getCompanyData();
        if (companyData3 != null && (suspensionFromDate = companyData3.getSuspensionFromDate()) != null) {
            sb5.append(suspensionFromDate);
        }
        sb5.append("-");
        CompanyData companyData4 = companyDetails.getCompanyData();
        if (companyData4 == null || (resumptionDate = companyData4.getResumptionDate()) == null) {
            sb5.append(this.labelProvider.c(ha1.a.F).getText());
        } else {
            sb5.append(resumptionDate);
        }
        i0 i0Var = i0.f148189a;
        DefaultSingleCardData defaultSingleCardDataS = s(this, mx.b.d(sb5.toString(), "companySuspendedFromDate"), labelC, null, null, null, 28, null);
        CompanyData companyData5 = companyDetails.getCompanyData();
        DefaultSingleCardData defaultSingleCardData2 = (companyData5 != null ? companyData5.getStatus() : null) == ma1.p.SUSPENDED ? defaultSingleCardDataS : null;
        Label labelC2 = this.labelProvider.c(ha1.a.f82470o4);
        CompanyData companyData6 = companyDetails.getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS2 = s(this, mx.b.d(companyData6 != null ? companyData6.getStartDate() : null, "companyStartFromDateValue"), labelC2, null, null, null, 28, null);
        CompanyData companyData7 = companyDetails.getCompanyData();
        DefaultSingleCardData defaultSingleCardData3 = (companyData7 != null ? companyData7.getStatus() : null) == ma1.p.PENDING_START ? defaultSingleCardDataS2 : null;
        CompanyData companyData8 = companyDetails.getCompanyData();
        Label labelD2 = mx.b.d(companyData8 != null ? companyData8.getName() : null, "companyFullNameValue");
        Label labelC3 = this.labelProvider.c(ha1.a.I4);
        CompanyData companyData9 = companyDetails.getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS3 = s(this, labelD2, labelC3, null, (companyData9 == null || (name = companyData9.getName()) == null) ? null : new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.f82458n), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: ua1.f
            @Override // er.a
            public final Object a() {
                return j.G(copyToClipboard, name);
            }
        }, 35, null), null, 20, null);
        CompanyData companyData10 = companyDetails.getCompanyData();
        Label labelD3 = mx.b.d(companyData10 != null ? companyData10.getNip() : null, "companyNipValue");
        Label labelC4 = this.labelProvider.c(ha1.a.P);
        CompanyData companyData11 = companyDetails.getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS4 = s(this, labelD3, labelC4, null, (companyData11 == null || (nip = companyData11.getNip()) == null) ? null : new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.f82458n), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: ua1.g
            @Override // er.a
            public final Object a() {
                return j.H(copyToClipboard, nip);
            }
        }, 35, null), null, 20, null);
        CompanyData companyData12 = companyDetails.getCompanyData();
        Label labelD4 = mx.b.d(companyData12 != null ? companyData12.getRegon() : null, "companyRegonValue");
        Label labelC5 = this.labelProvider.c(ha1.a.V4);
        CompanyData companyData13 = companyDetails.getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS5 = s(this, labelD4, labelC5, null, (companyData13 == null || (regon = companyData13.getRegon()) == null) ? null : new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.f82458n), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: ua1.h
            @Override // er.a
            public final Object a() {
                return j.I(copyToClipboard, regon);
            }
        }, 35, null), null, 20, null);
        CompanyData companyData14 = companyDetails.getCompanyData();
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardDataS3, defaultSingleCardDataS4, defaultSingleCardDataS5, s(this, mx.b.d((companyData14 == null || (addresses = companyData14.getAddresses()) == null) ? null : addresses.getMainAddress(), "mainAddressValue"), this.labelProvider.c(ha1.a.U4), null, new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.f82458n), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: ua1.i
            @Override // er.a
            public final Object a() {
                return j.J(copyToClipboard, companyDetails);
            }
        }, 35, null), null, 20, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(p pVar, String str) {
        pVar.B(str, va1.b.COMPANY_NAME);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(p pVar, String str) {
        pVar.B(str, va1.b.NIP);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(p pVar, String str) {
        pVar.B(str, va1.b.REGON);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(p pVar, ma1.f fVar) {
        CompanyAddresses addresses;
        CompanyData companyData = fVar.getCompanyData();
        pVar.B(mx.b.d((companyData == null || (addresses = companyData.getAddresses()) == null) ? null : addresses.getMainAddress(), "mainAddress").getText(), va1.b.ADDRESS);
        return i0.f148189a;
    }

    private final DefaultSingleCardData r(Label title, Label info, Label description, ButtonData buttonData, j70.a accessibilityReadMode) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(info, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(title, null, null, 0, 0, accessibilityReadMode, 30, null)), description != null ? new SingleCardLabel(description, null, null, 0, 0, null, 62, null) : null), null, buttonData != null ? new x0.Button(buttonData) : null, null, 2815, null);
    }

    static /* synthetic */ DefaultSingleCardData s(j jVar, Label label, Label label2, Label label3, ButtonData buttonData, j70.a aVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            label3 = null;
        }
        if ((i15 & 8) != 0) {
            buttonData = null;
        }
        if ((i15 & 16) != 0) {
            aVar = j70.a.LOWER_CASE;
        }
        return jVar.r(label, label2, label3, buttonData, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, CompanyInfoAlert companyInfoAlert) {
        params.j().b(companyInfoAlert.getMessage());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, CompanyInfoAlert companyInfoAlert) {
        params.j().b(companyInfoAlert.getMessage());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, CompanyInfoAlert companyInfoAlert) {
        params.j().b(companyInfoAlert.getMessage());
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ee  */
    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public sa1.c.a b(final Params params) {
        Label labelC;
        Label labelC2;
        List listN;
        SmallCardData smallCardData;
        SmallCardData smallCardData2;
        String categoryLabelPostfix;
        List<CompanyCategory> listL;
        CompanyCategory mainCategory;
        CompanyCategory mainCategory2;
        CompanyAddresses addresses;
        List<String> listA;
        CompanyAddresses addresses2;
        List<String> listA2;
        CompanyAddresses addresses3;
        List<String> listA3;
        CompanyAddresses addresses4;
        CompanyAddresses addresses5;
        List<CompanyInfoAlert> listH;
        Object cVar;
        sa1.b state = params.getState();
        if (t.c(state, sa1.b.a.f179605a)) {
            return sa1.c.a.C4622a.f179619a;
        }
        if (state instanceof sa1.b.NoData) {
            return new sa1.c.a.NoData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(new q40.j.a(jz.a.f106778g2), this.labelProvider.c(ha1.a.F4), this.labelProvider.c(ha1.a.E4), null, new LinkData(null, this.labelProvider.c(ha1.a.J4), ((sa1.b.NoData) state).getCeidgUrl(), LinkData.EnumC5775a.WEBSITE, false, params.f(), 17, null), null, true, 8, null), params.c());
        }
        if (!(state instanceof sa1.b.Initialized)) {
            if (state instanceof sa1.b.WorkInProgressNewApplication) {
                return new sa1.c.a.WorkInProgressNewApplication(((sa1.b.WorkInProgressNewApplication) state).getStatus().name());
            }
            if (t.c(state, sa1.b.f.f179616a)) {
                return new sa1.c.a.UpdateRequired(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(q40.j.b.a.f164684d, this.labelProvider.c(ha1.a.f82493s), this.labelProvider.c(ha1.a.f82369b6), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.f82449l6), null, 2, null), k30.d.a.f107773a, null, params.i(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.f82450m), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.c(), 35, null), null, 4, null), true, 8, null));
            }
            if (state instanceof sa1.b.OpenCompanyPendingStatus) {
                BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(ha1.a.f82408g5), null, null, null, 28, null), null, null, null, null, 61, null);
                sa1.b.OpenCompanyPendingStatus openCompanyPendingStatus = (sa1.b.OpenCompanyPendingStatus) state;
                String title = openCompanyPendingStatus.getTitle();
                if (title == null || (labelC2 = mx.b.b(title, "OpenCompanyPendingStatusTitle")) == null) {
                    labelC2 = this.labelProvider.c(ha1.a.f82489r2);
                }
                Label label = labelC2;
                String applicationNumber = openCompanyPendingStatus.getApplicationNumber();
                return new sa1.c.a.OpenCompanyPendingStatus(baseScaffoldData, new IconPageData(new q40.j.a(jz.a.f106778g2), label, applicationNumber != null ? this.labelProvider.e(ha1.a.f82482q2, applicationNumber) : null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.Y), null, 2, null), k30.d.a.f107773a, null, params.k(), 35, null), null, null, 6, null), false, 72, null));
            }
            if (!(state instanceof sa1.b.OpenCompanyRejectedStatus)) {
                throw new oq.p();
            }
            BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(ha1.a.f82408g5), null, null, null, 28, null), null, null, null, null, 61, null);
            sa1.b.OpenCompanyRejectedStatus openCompanyRejectedStatus = (sa1.b.OpenCompanyRejectedStatus) state;
            String title2 = openCompanyRejectedStatus.getTitle();
            if (title2 == null || (labelC = mx.b.b(title2, "OpenCompanyRejectedStatusTitle")) == null) {
                labelC = this.labelProvider.c(ha1.a.F2);
            }
            Label label2 = labelC;
            String rejectedReason = openCompanyRejectedStatus.getRejectedReason();
            return new sa1.c.a.OpenCompanyRejectedStatus(baseScaffoldData2, new IconPageData(new q40.j.a(jz.a.f106778g2), label2, rejectedReason != null ? this.labelProvider.e(ha1.a.H2, rejectedReason) : null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.G2), null, 2, null), k30.d.a.f107773a, null, params.q(), 35, null), null, null, 6, null), false, 72, null));
        }
        BaseScaffoldData baseScaffoldData3 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(ha1.a.f82408g5), null, null, null, 28, null), null, null, null, null, 61, null);
        int i15 = jz.a.A3;
        c cVar2 = c.f196767a;
        sa1.b.Initialized initialized = (sa1.b.Initialized) state;
        CompanyData companyData = initialized.getCompanyDetails().getCompanyData();
        o40.a.Icon icon = new o40.a.Icon(i15, null, cVar2, mx.b.d(companyData != null ? companyData.getName() : null, "companyNameTitleValue"), null, null, 34, null);
        CompanyData companyData2 = initialized.getCompanyDetails().getCompanyData();
        if (companyData2 == null || (listH = companyData2.h()) == null) {
            listN = v.n();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (!initialized.e().contains(((CompanyInfoAlert) obj).getMessage())) {
                    arrayList.add(obj);
                }
            }
            listN = new ArrayList(v.y(arrayList, 10));
            int i16 = 0;
            for (Object obj2 : arrayList) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                final CompanyInfoAlert companyInfoAlert = (CompanyInfoAlert) obj2;
                Label labelB = mx.b.b(companyInfoAlert.getMessage(), "infoAlertMessage_" + i16);
                CompanyLink link = companyInfoAlert.getLink();
                c30.a.Link link2 = link != null ? new c30.a.Link(new LinkData(null, mx.b.b(link.getName(), "infoAlertLinkName_" + i16), link.getUrl(), LinkData.EnumC5775a.WEBSITE, false, params.a(), 17, null)) : null;
                int i18 = b.f196765a[companyInfoAlert.getType().ordinal()];
                if (i18 == 1 || i18 == 2) {
                    cVar = new c30.b.c(null, null, null, labelB, new er.a() { // from class: ua1.b
                        @Override // er.a
                        public final Object a() {
                            return j.v(params, companyInfoAlert);
                        }
                    }, null, link2, 39, null);
                } else if (i18 == 3) {
                    cVar = new c30.b.e(null, null, null, labelB, new er.a() { // from class: ua1.c
                        @Override // er.a
                        public final Object a() {
                            return j.x(params, companyInfoAlert);
                        }
                    }, null, link2, 39, null);
                } else if (i18 == 4) {
                    cVar = new c30.b.C0606b(null, null, null, labelB, new er.a() { // from class: ua1.d
                        @Override // er.a
                        public final Object a() {
                            return j.z(params, companyInfoAlert);
                        }
                    }, null, link2, 39, null);
                } else {
                    if (i18 != 5) {
                        throw new oq.p();
                    }
                    cVar = new c30.b.d(null, null, null, labelB, new er.a() { // from class: ua1.e
                        @Override // er.a
                        public final Object a() {
                            return j.E(params, companyInfoAlert);
                        }
                    }, null, link2, 39, null);
                }
                listN.add(cVar);
                i16 = i17;
            }
        }
        List list = listN;
        Label labelC3 = this.labelProvider.c(ha1.a.f82491r4);
        int i19 = jz.a.f106776g0;
        o50.f.c cVar3 = o50.f.c.f142478a;
        SmallCardData smallCardData3 = new SmallCardData(null, labelC3, null, i19, cVar3, false, params.n(), 37, null);
        SmallCardData smallCardData4 = new SmallCardData(null, this.labelProvider.c(ha1.a.f82547z4), null, jz.a.H, cVar3, false, params.o(), 37, null);
        if (initialized.getIsSuspensionCompanyFlagOn()) {
            List listQ = v.q(ma1.p.SUSPENDED, ma1.p.PARTNERSHIP_ONLY);
            CompanyData companyData3 = initialized.getCompanyDetails().getCompanyData();
            if (v.c0(listQ, companyData3 != null ? companyData3.getStatus() : null)) {
                smallCardData = null;
            } else {
                smallCardData = smallCardData4;
            }
        } else {
            smallCardData = null;
        }
        SmallCardData smallCardData5 = new SmallCardData(null, this.labelProvider.c(ha1.a.f82498s4), null, jz.a.f106735b, cVar3, false, params.m(), 37, null);
        if (initialized.getIsSuspensionCompanyFlagOn()) {
            List listE = v.e(ma1.p.SUSPENDED);
            CompanyData companyData4 = initialized.getCompanyDetails().getCompanyData();
            if (v.c0(listE, companyData4 != null ? companyData4.getStatus() : null)) {
                smallCardData2 = smallCardData5;
            } else {
                smallCardData2 = null;
            }
        } else {
            smallCardData2 = null;
        }
        ShortcutsLayoutData shortcutsLayoutData = new ShortcutsLayoutData(v.s(smallCardData3, smallCardData, smallCardData2, initialized.getIsRepresentativesFeatureFlagOn() ? new SmallCardData(null, this.labelProvider.c(ha1.a.f82368b5), null, jz.a.I0, cVar3, false, params.l(), 37, null) : null, new SmallCardData(null, this.labelProvider.c(ha1.a.f82484q4), this.labelProvider.c(ha1.a.C4), jz.a.f106751d, cVar3, false, params.d(), 33, null)), new ShortcutMoreData(this.labelProvider.c(ha1.a.f82441k6), params.g()));
        CardListData cardListDataF = F(initialized.getCompanyDetails(), params.b());
        Label labelC4 = this.labelProvider.c(ha1.a.f82400f5);
        LinkData linkData = new LinkData(null, this.labelProvider.c(ha1.a.J4), initialized.getCeidgUrl(), LinkData.EnumC5775a.WEBSITE, false, params.f(), 17, null);
        Label labelC5 = this.labelProvider.c(ha1.a.f82463n4);
        Label labelC6 = this.labelProvider.c(ha1.a.D4);
        CompanyData companyData5 = initialized.getCompanyDetails().getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS = s(this, mx.b.d((companyData5 == null || (addresses5 = companyData5.getAddresses()) == null) ? null : addresses5.getElectronicDeliveryAddress(), "companyElectronicDeliveryAddressValue"), labelC6, null, null, null, 28, null);
        Label labelC7 = this.labelProvider.c(ha1.a.f82486r);
        CompanyData companyData6 = initialized.getCompanyDetails().getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS2 = s(this, mx.b.d(companyData6 != null ? companyData6.getEmail() : null, "companyEmailValue"), labelC7, null, null, null, 28, null);
        Label labelC8 = this.labelProvider.c(ha1.a.f82377c6);
        CompanyData companyData7 = initialized.getCompanyDetails().getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS3 = s(this, mx.b.d(companyData7 != null ? companyData7.getWebsiteUrl() : null, "companyWebsiteValue"), labelC8, null, null, null, 28, null);
        Label labelC9 = this.labelProvider.c(ha1.a.U);
        CompanyData companyData8 = initialized.getCompanyDetails().getCompanyData();
        AccordionData accordionData = new AccordionData(v.e(new AccordionElement(null, labelC5, null, false, null, false, new ta1.b(v.q(defaultSingleCardDataS, defaultSingleCardDataS2, defaultSingleCardDataS3, s(this, mx.b.d(companyData8 != null ? companyData8.getPhoneNumber() : null, "companyPhoneNumberValue"), labelC9, null, null, null, 28, null))), 29, null)));
        Label labelC10 = this.labelProvider.c(ha1.a.f82536y0);
        Label labelC11 = this.labelProvider.c(ha1.a.T4);
        CompanyData companyData9 = initialized.getCompanyDetails().getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS4 = s(this, mx.b.d((companyData9 == null || (addresses4 = companyData9.getAddresses()) == null) ? null : addresses4.getCorrespondenceAddress(), "companyCorrespondenceAddressValue"), labelC11, null, null, null, 28, null);
        Label labelC12 = this.labelProvider.c(ha1.a.f82529x0);
        CompanyData companyData10 = initialized.getCompanyDetails().getCompanyData();
        Label labelD = mx.b.d((companyData10 == null || (addresses3 = companyData10.getAddresses()) == null || (listA3 = addresses3.a()) == null) ? null : (String) v.n0(listA3), "companyAdditionalAddressValue");
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardDataS5 = s(this, labelD, labelC12, null, new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(ha1.a.M), null, 2, null), aVar, null, params.e(), 35, null), null, 20, null);
        CompanyData companyData11 = initialized.getCompanyDetails().getCompanyData();
        if (!((companyData11 == null || (addresses2 = companyData11.getAddresses()) == null || (listA2 = addresses2.a()) == null) ? false : !listA2.isEmpty())) {
            defaultSingleCardDataS5 = null;
        }
        if (defaultSingleCardDataS5 == null) {
            Label labelC13 = this.labelProvider.c(ha1.a.f82529x0);
            CompanyData companyData12 = initialized.getCompanyDetails().getCompanyData();
            defaultSingleCardDataS5 = s(this, mx.b.d((companyData12 == null || (addresses = companyData12.getAddresses()) == null || (listA = addresses.a()) == null) ? null : (String) v.n0(listA), "companyAdditionalAddressValue"), labelC13, null, null, null, 28, null);
        }
        AccordionData accordionData2 = new AccordionData(v.e(new AccordionElement(null, labelC10, null, false, null, false, new ta1.b(v.q(defaultSingleCardDataS4, defaultSingleCardDataS5)), 29, null)));
        Label labelC14 = this.labelProvider.c(ha1.a.f82522w0);
        Label labelC15 = this.labelProvider.c(ha1.a.f82470o4);
        CompanyData companyData13 = initialized.getCompanyDetails().getCompanyData();
        DefaultSingleCardData defaultSingleCardDataS6 = s(this, mx.b.d(companyData13 != null ? companyData13.getStartDate() : null, "companyStartDate"), labelC15, null, null, null, 28, null);
        mx.c cVar4 = this.labelProvider;
        int i25 = ha1.a.A4;
        CompanyData companyData14 = initialized.getCompanyDetails().getCompanyData();
        if (companyData14 == null || (categoryLabelPostfix = companyData14.getCategoryLabelPostfix()) == null) {
            categoryLabelPostfix = "-";
        }
        Label labelE = cVar4.e(i25, categoryLabelPostfix);
        CompanyData companyData15 = initialized.getCompanyDetails().getCompanyData();
        Label labelD2 = mx.b.d((companyData15 == null || (mainCategory2 = companyData15.getMainCategory()) == null) ? null : mainCategory2.getCode(), "companyMainCategoryValue");
        j70.a aVar2 = j70.a.LETTER_BY_LETTER;
        CompanyData companyData16 = initialized.getCompanyDetails().getCompanyData();
        Label labelD3 = mx.b.d((companyData16 == null || (mainCategory = companyData16.getMainCategory()) == null) ? null : mainCategory.getName(), "companyMainCategoryName");
        ButtonData buttonData = new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(ha1.a.M), null, 2, null), aVar, null, params.h(), 35, null);
        CompanyData companyData17 = initialized.getCompanyDetails().getCompanyData();
        return new sa1.c.a.Initialized(baseScaffoldData3, icon, shortcutsLayoutData, list, new sa1.c.a.Initialized.ContentData(cardListDataF, accordionData, accordionData2, new AccordionData(v.e(new AccordionElement(null, labelC14, null, false, null, false, new ta1.b(v.q(defaultSingleCardDataS6, r(labelD2, labelE, labelD3, (companyData17 == null || (listL = companyData17.l()) == null) ? false : listL.isEmpty() ^ true ? buttonData : null, aVar2))), 29, null))), labelC4, linkData));
    }
}
