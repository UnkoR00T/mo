package c01;

import b01.h;
import b01.i;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import iq0.ApplicationFormServiceEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import rq2.ToPassportInvalidation;
import tz0.ApplicationData;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc01/b;", "Lxw/f;", "Lc01/b$a;", "Lb01/i$a;", "Lmx/c;", "labelProvider", "Ltz0/b;", "applicationFormsDataEndpoints", "<init>", "(Lmx/c;Ltz0/b;)V", "params", "Liq0/g;", "serviceEntry", "Loq/i0;", "h", "(Lc01/b$a;Liq0/g;)V", "e", "(Lc01/b$a;)Lb01/i$a;", "a", "Lmx/c;", "b", "Ltz0/b;", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tz0.b applicationFormsDataEndpoints;

    /* JADX INFO: renamed from: c01.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010$R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b%\u0010$R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006'"}, d2 = {"Lc01/b$a;", "", "Lb01/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "Lgx/b;", "sendGlobalEvent", "Ltz0/a;", "toGenericApplications", "Ldx/b;", "showError", "", "openUrl", "<init>", "(Lb01/h;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb01/h;", "e", "()Lb01/h;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "f", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<gx.b, i0> sendGlobalEvent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ApplicationData, i0> toGenericApplications;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<dx.b, i0> showError;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, er.a<i0> aVar, l<? super gx.b, i0> lVar, l<? super ApplicationData, i0> lVar2, l<? super dx.b, i0> lVar3, l<? super String, i0> lVar4) {
            this.state = hVar;
            this.onBackClick = aVar;
            this.sendGlobalEvent = lVar;
            this.toGenericApplications = lVar2;
            this.showError = lVar3;
            this.openUrl = lVar4;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<String, i0> b() {
            return this.openUrl;
        }

        public final l<gx.b, i0> c() {
            return this.sendGlobalEvent;
        }

        public final l<dx.b, i0> d() {
            return this.showError;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final h getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.sendGlobalEvent, params.sendGlobalEvent) && t.c(this.toGenericApplications, params.toGenericApplications) && t.c(this.showError, params.showError) && t.c(this.openUrl, params.openUrl);
        }

        public final l<ApplicationData, i0> f() {
            return this.toGenericApplications;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.sendGlobalEvent.hashCode()) * 31) + this.toGenericApplications.hashCode()) * 31) + this.showError.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", sendGlobalEvent=" + this.sendGlobalEvent + ", toGenericApplications=" + this.toGenericApplications + ", showError=" + this.showError + ", openUrl=" + this.openUrl + ')';
        }
    }

    /* JADX INFO: renamed from: c01.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0592b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22293b;

        static {
            int[] iArr = new int[iq0.h.values().length];
            try {
                iArr[iq0.h.PHYSICAL_ID_CARD_APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iq0.h.CHILD_PHYSICAL_ID_CARD_APPLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iq0.h.WARD_PHYSICAL_ID_CARD_APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[iq0.h.PASSPORT_INVALIDATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[iq0.h.PHYSICAL_ID_CARD_INVALIDATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[iq0.h.PHYSICAL_ID_CARD_SUSPENSION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[iq0.h.CHILD_BIRTH_REGISTRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[iq0.h.WARD_ID_SUSPENSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[iq0.h.CHILD_ID_SUSPENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[iq0.h.CHILD_ID_INVALIDATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[iq0.h.WARD_ID_INVALIDATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[iq0.h.PASSPORT_AGREEMENT_OPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[iq0.h.CHILD_PASSPORT_APPLICATION_OPTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[iq0.h.HEATING_SUPPLEMENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[iq0.h.PASSPORT_AGREEMENT_MANAGEMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[iq0.h.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f22292a = iArr;
            int[] iArr2 = new int[iq0.i.values().length];
            try {
                iArr2[iq0.i.SUPPLEMENT_WEBVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[iq0.i.WEBVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[iq0.i.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[iq0.i.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            f22293b = iArr2;
        }
    }

    public b(c cVar, tz0.b bVar) {
        this.labelProvider = cVar;
        this.applicationFormsDataEndpoints = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(b bVar, Params params, ApplicationFormServiceEntry applicationFormServiceEntry) {
        bVar.h(params, applicationFormServiceEntry);
        return i0.f148189a;
    }

    private final void h(Params params, ApplicationFormServiceEntry serviceEntry) {
        int i15 = C0592b.f22293b[serviceEntry.getType().ordinal()];
        if (i15 == 1) {
            String supplementOrigin = serviceEntry.getSupplementOrigin();
            if (supplementOrigin != null) {
                params.c().b(new r43.a.ToMakeProposalService(supplementOrigin));
                return;
            } else {
                params.d().b(new dx.b.Generic(null, 1, null));
                return;
            }
        }
        if (i15 == 2) {
            String webUrl = serviceEntry.getWebUrl();
            if (webUrl != null) {
                params.f().b(new ApplicationData(serviceEntry.getName(), webUrl));
                return;
            } else {
                params.d().b(new dx.b.Generic(null, 1, null));
                return;
            }
        }
        if (i15 != 3) {
            if (i15 != 4) {
                throw new p();
            }
            params.d().b(new dx.b.Generic(null, 1, null));
            return;
        }
        iq0.h nativeType = serviceEntry.getNativeType();
        if (nativeType == null) {
            params.d().b(new dx.b.Generic(null, 1, null));
            return;
        }
        switch (C0592b.f22292a[nativeType.ordinal()]) {
            case 1:
                params.c().b(hv2.b.f86714a);
                return;
            case 2:
                params.c().b(hv2.a.f86713a);
                return;
            case 3:
                params.c().b(hv2.c.f86715a);
                return;
            case 4:
                params.c().b(new ToPassportInvalidation(null, 1, null));
                return;
            case 5:
                params.c().b(ib2.b.a.f90723a);
                return;
            case 6:
                params.c().b(vc2.a.C5386a.f206112a);
                return;
            case 7:
                params.c().b(k31.a.f107776a);
                return;
            case 8:
                params.c().b(fm1.b.f65369a);
                return;
            case 9:
                params.c().b(fm1.a.f65368a);
                return;
            case 10:
                params.c().b(hk1.b.f85191a);
                return;
            case 11:
                params.c().b(hk1.c.f85192a);
                return;
            case 12:
                params.c().b(cp2.a.f37245a);
                return;
            case 13:
                params.c().b(x51.a.f216911a);
                return;
            case 14:
                params.c().b(t92.a.C4907a.f189003a);
                return;
            case 15:
                params.c().b(pq2.a.f161745a);
                return;
            case 16:
                params.d().b(new dx.b.Parsing(new Exception("Cannot parse UNKNOWN service entry native type")));
                return;
            default:
                throw new p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i.a b(final Params params) {
        h state = params.getState();
        if (t.c(state, h.a.f15798a)) {
            return i.a.C0370a.f15800a;
        }
        if (!(state instanceof h.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b(((h.Initialized) params.getState()).getGroup().getName(), "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null);
        List<ApplicationFormServiceEntry> listD = ((h.Initialized) params.getState()).getGroup().d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        for (final ApplicationFormServiceEntry applicationFormServiceEntry : listD) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: c01.a
                @Override // er.a
                public final Object a() {
                    return b.f(this.f22281a, params, applicationFormServiceEntry);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(applicationFormServiceEntry.getName(), "ServiceName"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(applicationFormServiceEntry.getDescription(), "ServiceDescription"), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        c30.b.c cVar = new c30.b.c(null, null, null, this.labelProvider.c(sz0.a.f186118c), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(sz0.a.f186124i), this.applicationFormsDataEndpoints.v(), LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null)), 55, null);
        List<ApplicationFormServiceEntry> listD2 = ((h.Initialized) params.getState()).getGroup().d();
        if ((listD2 instanceof Collection) && listD2.isEmpty()) {
            cVar = null;
        } else {
            Iterator<T> it = listD2.iterator();
            while (it.hasNext()) {
                if (((ApplicationFormServiceEntry) it.next()).getNativeType() == iq0.h.CHILD_PASSPORT_APPLICATION_OPTION) {
                }
            }
            cVar = null;
        }
        return new i.a.Initialized(baseScaffoldData, arrayList, cVar);
    }
}
