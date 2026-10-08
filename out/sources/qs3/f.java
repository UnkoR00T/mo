package qs3;

import cj0.ZusEVisitDepartment;
import er.l;
import er.p;
import eu.k;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lqs3/f;", "Lxw/f;", "Lqs3/f$b;", "Lps3/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "l", "(Lqs3/f$b;)Lps3/e$a;", "a", "Lmx/c;", "b", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, ps3.e.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f168303c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: qs3.f$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Lqs3/f$b;", "", "Lps3/d;", "state", "Lkotlin/Function1;", "Lcj0/h;", "Loq/i0;", "onSelectDepartment", "", "onSearchValueChange", "", "onSearchActiveChange", "Lkotlin/Function0;", "onBack", "<init>", "(Lps3/d;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lps3/d;", "e", "()Lps3/d;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ps3.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ZusEVisitDepartment, i0> onSelectDepartment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSearchValueChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onSearchActiveChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ps3.d dVar, l<? super ZusEVisitDepartment, i0> lVar, l<? super String, i0> lVar2, l<? super Boolean, i0> lVar3, er.a<i0> aVar) {
            this.state = dVar;
            this.onSelectDepartment = lVar;
            this.onSearchValueChange = lVar2;
            this.onSearchActiveChange = lVar3;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<Boolean, i0> b() {
            return this.onSearchActiveChange;
        }

        public final l<String, i0> c() {
            return this.onSearchValueChange;
        }

        public final l<ZusEVisitDepartment, i0> d() {
            return this.onSelectDepartment;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ps3.d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectDepartment, params.onSelectDepartment) && t.c(this.onSearchValueChange, params.onSearchValueChange) && t.c(this.onSearchActiveChange, params.onSearchActiveChange) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onSelectDepartment.hashCode()) * 31) + this.onSearchValueChange.hashCode()) * 31) + this.onSearchActiveChange.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectDepartment=" + this.onSelectDepartment + ", onSearchValueChange=" + this.onSearchValueChange + ", onSearchActiveChange=" + this.onSearchActiveChange + ", onBack=" + this.onBack + ')';
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, ZusEVisitDepartment zusEVisitDepartment) {
        params.d().b(zusEVisitDepartment);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(ps3.d dVar, ZusEVisitDepartment zusEVisitDepartment) {
        String str = zusEVisitDepartment.getName() + ' ' + zusEVisitDepartment.a();
        Locale locale = Locale.ROOT;
        return r.d0(str.toLowerCase(locale), ((ps3.d.Initialized) dVar).getSearchValue().toLowerCase(locale), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultSingleCardData r(final Params params, int i15, final ZusEVisitDepartment zusEVisitDepartment) {
        return new DefaultSingleCardData(null, new er.a() { // from class: qs3.a
            @Override // er.a
            public final Object a() {
                return f.s(params, zusEVisitDepartment);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(zusEVisitDepartment.getName(), "departmentValue" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(zusEVisitDepartment.a(), "departmentAddress" + i15), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3837, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, ZusEVisitDepartment zusEVisitDepartment) {
        params.d().b(zusEVisitDepartment);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.c().b("");
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ps3.e.a b(final Params params) {
        List listP;
        final ps3.d state = params.getState();
        if (!(state instanceof ps3.d.Initialized)) {
            return ps3.e.a.b.f162433a;
        }
        ps3.d.Initialized initialized = (ps3.d.Initialized) state;
        if (initialized.getSearchValue().length() == 0) {
            List<ZusEVisitDepartment> listA = initialized.getSetupData().a();
            listP = new ArrayList(v.y(listA, 10));
            int i15 = 0;
            for (Object obj : listA) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                final ZusEVisitDepartment zusEVisitDepartment = (ZusEVisitDepartment) obj;
                listP.add(new DefaultSingleCardData(null, new er.a() { // from class: qs3.b
                    @Override // er.a
                    public final Object a() {
                        return f.m(params, zusEVisitDepartment);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(zusEVisitDepartment.getName(), "departmentValue" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(zusEVisitDepartment.a(), "departmentAddress" + i15), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3837, null));
                i15 = i16;
            }
        } else {
            listP = k.P(k.I(k.x(v.a0(initialized.getSetupData().a()), new l() { // from class: qs3.c
                @Override // er.l
                public final Object b(Object obj2) {
                    return Boolean.valueOf(f.q(state, (ZusEVisitDepartment) obj2));
                }
            }), new p() { // from class: qs3.d
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return f.r(params, ((Integer) obj2).intValue(), (ZusEVisitDepartment) obj3);
                }
            }));
        }
        List list = listP;
        i.Small small = new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), initialized.getSetupData().getTitle(), null, null, null, 28, null);
        if (initialized.getIsSearchActive()) {
            small = null;
        }
        return new ps3.e.a.DisplayedScreenData(new BaseScaffoldData(null, small, null, null, null, null, 61, null), new CardListData(list, null, false, null, null, 30, null), new SearchBarData(initialized.getSearchValue(), params.c(), initialized.getIsSearchActive(), params.b(), new er.a() { // from class: qs3.e
            @Override // er.a
            public final Object a() {
                return f.u(params);
            }
        }, this.labelProvider.c(ir3.a.D), null, Integer.valueOf(list.size()), 64, null), this.labelProvider.c(ir3.a.f96801l1), params.d(), params.a());
    }
}
