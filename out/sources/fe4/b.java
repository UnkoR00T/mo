package fe4;

import al0.s0;
import ee4.c;
import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jl0.BEPassportAgreement;
import jl0.m;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.w0;
import n50.x0;
import oq.i0;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import r50.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfe4/b;", "Lxw/f;", "Lfe4/b$a;", "Lee4/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ljl0/a;", "Lmx/a;", "e", "(Ljl0/a;)Lmx/a;", "Ljl0/m;", "Lr50/a$b;", "i", "(Ljl0/m;)Lr50/a$b;", "params", "f", "(Lfe4/b$a;)Lee4/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: fe4.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfe4/b$a;", "", "Lee4/b;", "state", "Lkotlin/Function1;", "Ljl0/a;", "Loq/i0;", "openAgreement", "Lkotlin/Function0;", "onBackAction", "<init>", "(Lee4/b;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lee4/b;", "c", "()Lee4/b;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ee4.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEPassportAgreement, i0> openAgreement;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ee4.b bVar, l<? super BEPassportAgreement, i0> lVar, er.a<i0> aVar) {
            this.state = bVar;
            this.openAgreement = lVar;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<BEPassportAgreement, i0> b() {
            return this.openAgreement;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ee4.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.openAgreement, params.openAgreement) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.openAgreement.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", openAgreement=" + this.openAgreement + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    /* JADX INFO: renamed from: fe4.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1405b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f62115b;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f62114a = iArr;
            int[] iArr2 = new int[m.values().length];
            try {
                iArr2[m.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[m.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[m.ASSIGNED_TO_APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[m.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f62115b = iArr2;
        }
    }

    public b(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label e(BEPassportAgreement bEPassportAgreement) {
        int i15;
        int i16 = C1405b.f62114a[bEPassportAgreement.getPassportType().ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.X;
        } else if (i16 == 2) {
            i15 = oq2.a.f148224a0;
        } else if (i16 == 3) {
            i15 = oq2.a.Y;
        } else if (i16 == 4) {
            i15 = oq2.a.Z;
        } else {
            if (i16 != 5) {
                throw new p();
            }
            i15 = oq2.a.f148239i;
        }
        return this.labelProvider.e(i15, v.v0(v.s(bEPassportAgreement.getFirstName(), bEPassportAgreement.getLastName()), " ", null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, BEPassportAgreement bEPassportAgreement) {
        params.b().b(bEPassportAgreement);
        return i0.f148189a;
    }

    private final r50.a.WithIcon i(m mVar) {
        int i15;
        g gVar;
        int[] iArr = C1405b.f62115b;
        int i16 = iArr[mVar.ordinal()];
        if (i16 == 1) {
            i15 = oq2.a.f148230d0;
        } else if (i16 == 2) {
            i15 = oq2.a.f148232e0;
        } else if (i16 == 3) {
            i15 = oq2.a.f148228c0;
        } else {
            if (i16 != 4) {
                throw new p();
            }
            i15 = oq2.a.f148234f0;
        }
        Label labelC = this.labelProvider.c(i15);
        int i17 = iArr[mVar.ordinal()];
        if (i17 == 1) {
            gVar = g.INFORMATIVE;
        } else if (i17 == 2) {
            gVar = g.NEGATIVE;
        } else if (i17 == 3) {
            gVar = g.POSITIVE;
        } else {
            if (i17 != 4) {
                throw new p();
            }
            gVar = g.INFORMATIVE;
        }
        return new r50.a.WithIcon(null, labelC, null, 0, false, gVar, 29, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        ee4.b state = params.getState();
        if (t.c(state, ee4.b.c.f49693a)) {
            return new c.a.Initial(params.a());
        }
        if (t.c(state, ee4.b.a.f49691a)) {
            return new c.a.Empty(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(oq2.a.f148236g0), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(0, 1, null), this.labelProvider.c(oq2.a.W), null, null, null, null, false, 12, null), params.a());
        }
        if (!(state instanceof ee4.b.Initialized)) {
            if (state instanceof ee4.b.Error) {
                return new c.a.Error(((ee4.b.Error) params.getState()).getErrorVMS(), params.a());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(oq2.a.f148236g0), null, null, null, 28, null), null, null, null, null, 61, null);
        List<BEPassportAgreement> listA = ((ee4.b.Initialized) params.getState()).a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listA) {
            String strValueOf = String.valueOf(((BEPassportAgreement) obj).getRegistrationDate().getDate().getYear());
            Object arrayList = linkedHashMap.get(strValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Label labelB = mx.b.b(str, "AgreementListGroupSeparator");
            List<BEPassportAgreement> list2 = list;
            ArrayList arrayList3 = new ArrayList(v.y(list2, 10));
            for (final BEPassportAgreement bEPassportAgreement : list2) {
                w0.StatusBadge statusBadge = new w0.StatusBadge(i(bEPassportAgreement.getAgreementStatus()));
                BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(e(bEPassportAgreement), null, null, 3, null)), null, 5, null);
                BottomSection bottomSection = new BottomSection(n50.l.b(this.labelProvider.c(oq2.a.f148226b0), null, null, 3, null), n50.l.b(mx.b.b(this.dateFormatter.d(bEPassportAgreement.getRegistrationDate(), fz.c.DOTTED), "registration_date"), null, null, 3, null));
                arrayList3.add(new DefaultSingleCardData(null, new er.a() { // from class: fe4.a
                    @Override // er.a
                    public final Object a() {
                        return b.h(params, bEPassportAgreement);
                    }
                }, false, null, null, false, null, statusBadge, bodySection, null, x0.Icon.INSTANCE.b(), bottomSection, 637, null));
            }
            arrayList2.add(y.a(labelB, arrayList3));
        }
        return new c.a.Initialized(baseScaffoldData, arrayList2, params.a());
    }
}
